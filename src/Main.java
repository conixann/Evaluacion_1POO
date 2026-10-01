//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Vivienda>listavivienda = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
while(true) {
    try {
        System.out.println("===MENÚ===");
        System.out.println("1.Agregar Departamento");
        System.out.println("2.Agregar Casa");
        System.out.println("3.Buscar vivienda por código");
        System.out.println("4.Listar viviendas");
        System.out.println("5. Salir");
        System.out.println("---------------------------");
        System.out.println("Ingrese una opción");
        int opcion = Integer.parseInt(sc.nextLine());
        if (opcion == 1) {
            System.out.println("===AÑADIR DEPARTAMENTO===");
            System.out.println("Ingrese código de la propiedad:");
            String codigo = sc.nextLine();
            System.out.println("Ingrese superficie en metros cuadrados:");
            int superficieMetros = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese número de habitaciones:");
            int numeroHabitaciones = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese numero de piso:");
            int numeroPiso = Integer.parseInt(sc.nextLine());
            System.out.println("Gasto común al día?(true/false)");
            boolean gastoComunAlDia = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Estacionamiento asignado?(true/false)");
            //No se como poner que al leer el boolean lea el si o el no en vez de true o false
            boolean estacionamientoAsignado = Boolean.parseBoolean(sc.nextLine());
            Departamento nuevoDepartamento = new Departamento(codigo,superficieMetros,numeroHabitaciones,numeroPiso,gastoComunAlDia,estacionamientoAsignado);
            listavivienda.add(nuevoDepartamento);
            System.out.println("Departamento agregado exitosamente!");
        } else if (opcion == 2) {
            System.out.println("===AÑADIR CASA===");
            System.out.println("------------------------");
            System.out.println("Ingrese código de la propiedad:");
            String codigo = sc.nextLine();
            System.out.println("Ingrese superficie en metros cuadrados:");
            int superficieMetros = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese número de habitaciones:");
            int numeroHabitaciones = Integer.parseInt(sc.nextLine());
            System.out.println("Cuenta con patio?(true/false)");
            boolean tienePatio = Boolean.parseBoolean(sc.nextLine());
            Casa nuevaCasa = new Casa(codigo,superficieMetros,numeroHabitaciones,tienePatio);
            listavivienda.add(nuevaCasa);
            System.out.println("Casa agregada correctamente.");

        } else if (opcion == 3) {
            System.out.println("===BUSCAR POR CÓDIGO===");
            System.out.println("-------------------------");
            System.out.println("Ingrese código de la vivienda que desea buscar:");
            String codigoViviendaBuscar = sc.nextLine();
            boolean CodigoViviendaEncontrado = false;
            for(Vivienda elemento : listavivienda){
                String buscarDentroLista = elemento.getCodigoPropiedad();
                if(buscarDentroLista.equalsIgnoreCase(codigoViviendaBuscar)){
                    CodigoViviendaEncontrado = true;
                    System.out.println(elemento.toString());
                }
            }if(!CodigoViviendaEncontrado){
                System.out.println("No existe vivienda registrada con ese código.");
            }

        } else if (opcion == 4) {
            if(listavivienda.isEmpty()){
                System.out.println("La lista se encuentra vacía.");
            }for(Vivienda elemento : listavivienda){
                System.out.println("codigo vivienda:"+ elemento.getCodigoPropiedad() + "|" + "Superficie:"+ elemento.getSuperficieMetros());
            }

        } else if (opcion == 5) {
            System.out.println("Gracias por usar el sistema,adiós,");
            break;
        } else {
            System.out.println("Ingrese una opción válida (1 a 5).");

        }

    } catch (Exception e) {
        System.out.println("ERROR! Ingrese un número entero de el 1 al 5");
    }
}
    }
