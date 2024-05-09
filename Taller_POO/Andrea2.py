
from datetime import datetime

def calcular_edad_cultivo():
        """
        Método para calcular la edad del cultivo en días.

        Returns:
            int: Edad del cultivo en días.
        """
        fecha_actual = datetime.now()  # Obtenemos la fecha actual
        dias_transcurridos = (fecha_actual - self.fecha_plantacion).days  # Calculamos los días transcurridos desde la plantación
        return dias_transcurridos





thisdic1 = dict(cultivo = "fresa", tipo = "frutal", areasembrada = 2, fecha_plantacion= "01/02/2024")
thisdic2 = dict(cultivo = "papa", tipo = "tuberculo", areasembrada = 10, fecha_plantacion= "02/02/2024")
thisdic3 = dict(cultivo = "arroz", tipo = "graminea", areasembrada = 20, fecha_plantacion= "03/02/2024")
thisdic4 = dict(cultivo = "flores", tipo = "ornamental", areasembrada = 30, fecha_plantacion= "04/02/2024")
listcrop=[thisdic1, thisdic2, thisdic3, thisdic4]
for x in listcrop:
    print("Cultivo: ",  x["cultivo"], "edad ", calcular_edad_cultivo(x["fecha_plantacion"]))
    print("Tipo del cultivo: ",  x["tipo"])
    print("Area: ",  x["areasembrada"], "m2")
    print("Fecha siembra: ", x ["fechasiembra"])