from datetime import datetime  # Importamos la clase datetime para trabajar con fechas

class Cultivo:
    def __init__(self, nombre, tipo, superficie, fecha_plantacion):
        """
        Constructor de la clase Cultivo. Se utiliza para inicializar los atributos de un cultivo.

        Args:
            nombre (str): Nombre del cultivo.
            tipo (str): Tipo de cultivo.
            superficie (float): Superficie plantada del cultivo en hectáreas.
            fecha_plantacion (datetime): Fecha de plantación del cultivo.
        """
        self.nombre = nombre  # Nombre del cultivo
        self.tipo = tipo  # Tipo de cultivo (ej. Grano, Hortaliza, etc.)
        self.superficie = superficie  # Superficie plantada del cultivo
        self.fecha_plantacion = fecha_plantacion  # Fecha de plantación del cultivo
    
    def calcular_edad(self):
        """
        Método para calcular la edad del cultivo en días.

        Returns:
            int: Edad del cultivo en días.
        """
        fecha_actual = datetime.now()  # Obtenemos la fecha actual
        dias_transcurridos = (fecha_actual - self.fecha_plantacion).days  # Calculamos los días transcurridos desde la plantación
        return dias_transcurridos
    
    def __str__(self):
        """
        Método especial que devuelve una representación en forma de cadena del objeto Cultivo.

        Returns:
            str: Representación del cultivo.
        """
        return f"Nombre: {self.nombre}, Tipo: {self.tipo}, Superficie: {self.superficie}, Fecha de Plantación: {self.fecha_plantacion}"

class SistemaCultivos:
    def __init__(self):
        """
        Constructor de la clase SistemaCultivos. Se utiliza para inicializar la lista de cultivos.
        """
        self.cultivos = []  # Lista para almacenar los cultivos
    
    def agregar_cultivo(self, nombre, tipo, superficie, fecha_plantacion):
        """
        Método para agregar un nuevo cultivo al sistema.

        Args:
            nombre (str): Nombre del cultivo.
            tipo (str): Tipo de cultivo.
            superficie (float): Superficie plantada del cultivo en hectáreas.
            fecha_plantacion (datetime): Fecha de plantación del cultivo.
        """
        cultivo_nuevo = Cultivo(nombre, tipo, superficie, fecha_plantacion)  # Creamos un nuevo objeto de tipo Cultivo
        self.cultivos.append(cultivo_nuevo)  # Agregamos el cultivo a la lista de cultivos
    
    def calcular_edad_cultivo(self, nombre_cultivo):
        """
        Método para calcular la edad de un cultivo dado su nombre.

        Args:
            nombre_cultivo (str): Nombre del cultivo.

        Returns:
            int or None: Edad del cultivo en días o None si el cultivo no se encuentra.
        """
        for cultivo in self.cultivos:
            if cultivo.nombre == nombre_cultivo:  # Buscamos el cultivo por su nombre
                return cultivo.calcular_edad()  # Calculamos y devolvemos la edad del cultivo
        return None  # Devolvemos None si el cultivo no se encuentra
    
    def mostrar_cultivos(self):
        """
        Método para mostrar todos los cultivos registrados en el sistema.
        """
        if self.cultivos:
            for cultivo in self.cultivos:
                print(cultivo)  # Imprimimos la representación de cada cultivo
        else:
            print("No hay cultivos registrados.")  # Mensaje si no hay cultivos registrados

# Ejemplo de uso del programa
sistema = SistemaCultivos()

# Añadir cultivos
sistema.agregar_cultivo("Maíz", "Grano", 10, datetime(2023, 3, 15))
sistema.agregar_cultivo("Tomate", "Hortaliza", 5, datetime(2023, 4, 10))

# Calcular edad de un cultivo
edad_maiz = sistema.calcular_edad_cultivo("Maíz")
if edad_maiz is not None:
    print(f"La edad del cultivo de maíz es de {edad_maiz} días.")
else:
    print("El cultivo no fue encontrado.")

# Mostrar todos los cultivos
print("\nLista de Cultivos:")
sistema.mostrar_cultivos()
