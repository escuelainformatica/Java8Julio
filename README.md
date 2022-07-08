# primera version

# JPQL

```sql
select E from Entidad E
select E from Entidad as E
```
* select = devolver valores
* from = desde donde vienen.
* E = es un alias.

error:
```sql
from Entidad E select E  -- error
```

## JPQL ordenar

```sql
select E from Entidad E order by E.campo -- ascendente
select E from Entidad E order by E.campo desc -- descendente
```

## Ordenar por mas de una columna
```sql
select E from Entidad E order by E.campo,E.campo2
```
## Filtrar los datos

```sql
select E from Entidad E where E.campo='hola' -- listar todas las entidades donde campo es igual a 'hola'
select E from Entidad E where E.campo>10
select E from Entidad E where E.campo<10
select E from Entidad E where E.campo>=10
select E from Entidad E where E.campo<=10
select E from Entidad E where E.campo<>10 -- valor es diferente.
select E from Entidad E where E.campo in lista -- valor en una lista
select E from Entidad E where E.campo like '%a%' -- buscar parte del valor.
```
## Filtrar por mas de un criterio

```sql
select E from Entidad E where E.campo='hola' and E.campo2='mundo' -- "and" indica que ambas condiciones deben cumplirse
select E from Entidad E where E.campo='hola' or E.campo2='mundo' -- "or" indica que cualquier condicion deben cumplirse
```

## Consulta entera

```sql
select E from Entidad E where E.campo='hola' order by E.campo
````

* select
* from
* where (opcional)
* order by (opcional)
