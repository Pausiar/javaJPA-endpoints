@echo off
echo Eliminant base de dades antiga...
del /f /q bda.mv.db 2>nul
del /f /q bda.trace.db 2>nul
echo Base de dades antiga eliminada!
echo.
echo Arrancant aplicació (es crearà la nova BD ciutats_db)...
call gradlew bootRun
