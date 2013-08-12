@echo off

set FORGE=1.6.2-9.10.0.827

set PATH=%PATH%;./gnuwin32

IF EXIST forge\NUL (
    rd /Q /S forge
)

IF NOT EXIST minecraftforge-src-%FORGE%.zip (
    wget http://files.minecraftforge.net/minecraftforge/minecraftforge-src-%FORGE%.zip
)
unzip minecraftforge-src-%FORGE%.zip
pushd forge
.\fml\python\python_fml install.py
popd

IF NOT EXIST eclipse\NUL (
    unzip eclipse.zip
)
pause
