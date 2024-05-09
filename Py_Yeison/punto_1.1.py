def verificar():
    contrasena_guardada = "contraseña"  # Contraseña almacenada en la variable

    contrasena_usuario = input("Introduce la contraseña: ")  # Solicitar contraseña al usuario

    # Verificar si la contraseña introducida coincide con la guardada, ignorando mayúsculas y minúsculas
    if contrasena_usuario.lower() == contrasena_guardada.lower():
        print("¡La contraseña es correcta!")
    else:
        print("La contraseña es incorrecta.")

# Llamar a la función para iniciar la verificación de contraseña
verificar_contrasena()
