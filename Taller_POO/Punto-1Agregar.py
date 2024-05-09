from datetime import datetime

def calcular_edad_cultivo(fecha_cultivo):
    # Obtener la fecha actual del sistema
    fecha_actual = datetime.now()

    # Convertir la fecha proporcionada a un objeto datetime
    fecha_inicial = datetime.strptime(fecha_cultivo, "%d/%m/%Y")

    # Restar la fecha proporcionada de la fecha actual
    diferencia = fecha_actual - fecha_inicial

    return diferencia.days

listcrop = []

def agregar_cultivo():
    cultivo = input("Nombre del cultivo: ")
    tipo = input("Tipo del cultivo: ")
    areasembrada = float(input("Área sembrada (m2): "))
    fechasiembra = input("Fecha de siembra (formato dd/mm/yyyy): ")
    thisdic = dict(cultivo=cultivo, tipo=tipo, areasembrada=areasembrada, fechasiembra=fechasiembra)
    listcrop.append(thisdic)

def mostrar_cultivos():
    for x in listcrop:
        print("Cultivo:", x["cultivo"], "Edad:", calcular_edad_cultivo(x["fechasiembra"]), "días")
        print("Tipo del cultivo:", x["tipo"])
        print("Área:", x["areasembrada"], "m2")
        print("Fecha siembra:", x["fechasiembra"])
        print()

# Agregar algunos cultivos predeterminados
listcrop.append(dict(cultivo="fresa", tipo="frutal", areasembrada=2, fechasiembra="01/02/2024"))
listcrop.append(dict(cultivo="papa", tipo="tuberculo", areasembrada=10, fechasiembra="02/02/2024"))
listcrop.append(dict(cultivo="arroz", tipo="graminea", areasembrada=20, fechasiembra="03/02/2024"))
listcrop.append(dict(cultivo="flores", tipo="ornamental", areasembrada=30, fechasiembra="04/02/2024"))

# Ciclo para agregar más cultivos o mostrar los existentes
while True:
    opcion = input("¿Desea agregar un nuevo cultivo (A) o mostrar los cultivos existentes (M)? (A/M): ").upper()
    if opcion == "A":
        agregar_cultivo()
    elif opcion == "M":
        mostrar_cultivos()
    else:
        print("Opción no válida. Por favor, seleccione 'A' para agregar un cultivo o 'M' para mostrar los existentes.")
