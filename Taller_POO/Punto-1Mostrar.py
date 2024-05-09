
#1. Imagine que está desarrollando un sistema para ayudar a los agricultores a gestionar información sobre
#sus cultivos. Implementar un programa Python que permita a los agricultores realizar la
#siguientes operaciones:
#a. Agregue un nuevo cultivo con su nombre, tipo, área plantada y fecha de siembra.
#b. Calcular la edad de un cultivo en días desde la fecha de siembra.
#C. Muestra todos los cultivos y su información almacenada.


from datetime import datetime
Cropinfo = {
    "cultivo": "fresa",
    "tipo": "frutal",
    "areasembrada": 2,
    "fechasiembra": "02/01/24"}
print(Cropinfo )


def calcular_edad_cultivo(fecha_cultivo):

    # Obtener la fecha actual del sistema
    fecha_actual = datetime.now()

    # Convertir la fecha actual del sistema a formato dd/mm/yyyy
    fecha_actual_str = fecha_actual.strftime("%d/%m/%Y")

    # Fecha proporcionada en texto
    # fecha_texto = "20/10/2023"

    # Convertir la fecha proporcionada a un objeto datetime
    fecha_inicial = datetime.strptime(fecha_cultivo, "%d/%m/%Y")

    # Restar la fecha proporcionada de la fecha actual
    diferencia = fecha_actual -fecha_inicial

    return diferencia.days



thisdic1 = dict(cultivo = "fresa", tipo = "frutal", areasembrada = 2, fechasiembra= "01/02/2024")
thisdic2 = dict(cultivo = "papa", tipo = "tuberculo", areasembrada = 10, fechasiembra= "02/02/2024")
thisdic3 = dict(cultivo = "arroz", tipo = "graminea", areasembrada = 20, fechasiembra= "03/02/2024")
thisdic4 = dict(cultivo = "flores", tipo = "ornamental", areasembrada = 30, fechasiembra= "04/02/2024")
listcrop=[thisdic1, thisdic2, thisdic3, thisdic4]
for x in listcrop:
    print("Cultivo: ",  x["cultivo"], "edad ", calcular_edad_cultivo(x["fechasiembra"]), "dias")
    print("Tipo del cultivo: ",  x["tipo"])
    print("Area: ",  x["areasembrada"], "m2")
    print("Fecha siembra: ", x ["fechasiembra"])
    

