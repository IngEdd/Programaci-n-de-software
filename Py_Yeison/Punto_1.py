# 1. Desarrollar una aplicación que almacene la cadena de caracteres contraseña
#en una variable, pregunte al usuario por la contraseña e imprima por pantalla
#si la contraseña introducida por el usuario coincide con la guardada en la
#variable sin tener en cuenta mayúsculas y minúsculas 

def verificar ():
    
    Contra = "123" #contraseña guardada
    contrauser = input ("Ingrese su contraseña") 
if Contra.lower() == contrauser.lower(): 
    print ("la contraseña es correcta")
else:
    print ("la contraseña es incorrecta")

verificar()


