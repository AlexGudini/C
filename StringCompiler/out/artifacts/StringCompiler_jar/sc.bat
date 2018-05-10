@echo off
java -jar StringCompiler.jar %~f1
if exist E:\PAVEL\6сем\япис\StringCompiler\src\by\bsuir\yapis\compiller\stringcompiller\run\Main.java ( 
javac -d bin -sourcepath src -cp E:\PAVEL\6сем\япис\StringCompiler\lib\antlr-3.5-complete.jar E:\PAVEL\6сем\япис\StringCompiler\src\by\bsuir\yapis\compiller\stringcompiller\run\Main.java
java -cp bin;E:\PAVEL\6сем\япис\StringCompiler\lib\antlr-3.5-complete.jar run.Main
) else ( echo System message : source java file doesn't exist. Exiting compilation)
pause > NUL 
