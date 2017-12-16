#include <iostream>
#include "../ContextExample/Header.h"

int main(int argc, char* argv[])
{
   unsigned char* szStringBinding = NULL; // маркер привязки .протокол -  ip конечный точки(сервер) и порт

   std::clog << "Calling RpcStringBindingCompose " <<std::endl;
   // Creates a string binding handle.
   // This function is nothing more than a printf.
   // Connection is not done here.  d:\\Projects\\C++\\lab3demo\\DebugExe\\ContextExampleClient.exe 192.168.38.20
   RpcStringBindingCompose(
      NULL, // UUID to bind to.
      reinterpret_cast<unsigned char*>("ncacn_ip_tcp"), // Use TCP/IP protocol.
      reinterpret_cast<unsigned char*>(argv[1]), // TCP/IP network address to use. 192.168.38.15
      reinterpret_cast<unsigned char*>("4747"), // TCP/IP port to use.
      NULL, // Protocol dependent network options to use.
      &szStringBinding); // String binding output.


   handle_t hBinding = NULL;

   std::clog << "Calling RpcBindingFromStringBinding" << std::endl;
   // Validates the format of the string binding handle and converts
   // it to a binding handle.
   // Connection is not done here either.
  RpcBindingFromStringBinding( // получение доступа к серверу, получает маркер привязки сервера
      szStringBinding, // The string binding to validate.
      &hBinding); // Put the result in the explicit binding handle.


   std::clog << "Calling RpcStringFree" << std::endl;
   // Free the memory allocated by a string.
   RpcStringFree(
      &szStringBinding); // String to be freed.


   std::clog << "Calling RpcEpResolveBinding" << std::endl;
   // коннект к серверу и получения интерфейса
 RpcEpResolveBinding(hBinding, ContextExample_v1_0_c_ifspec);

   RpcTryExcept
   {
      std::cout << "Calling Open" << std::endl;
      CONTEXT_HANDLE hContext = Open(hBinding, argv[1]);

      std::cout << "Press enter to call Output" << std::endl;
      std::cin.get();

      std::cout << "Calling Output" << std::endl;
	  std::cout << "Input numbers" << std::endl;
	  int a, a2;
	  std::cin >> a;
	  std::cin >> a2;
	  std::cout << Summa(hContext, a, a2)<< std::endl;
      std::cout << "Press enter to call Close" << std::endl;
      std::cin.get();

      std::cout << "Calling Close" << std::endl;
      Close(&hContext, argv[1]);
   }
   RpcExcept(1)
   {
	   std::cout << "/n  Error Calling Remote Procedure /n";
   }
   RpcEndExcept

   std::clog << "Calling RpcBindingFree" << std::endl;
   RpcBindingFree(&hBinding);
   std::cout << "Press enter to exit" << std::endl;
   std::cin.get();
}

// Memory allocation function for RPC.
// The runtime uses these two functions for allocating/deallocating
// enough memory to pass the string to the server.
void* __RPC_USER midl_user_allocate(size_t size)
{
   return malloc(size);
}

// Memory deallocation function for RPC.
void __RPC_USER midl_user_free(void* p)
{
   free(p);
}
