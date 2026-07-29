
Table CADCOL {
  numcol int [pk, increment]  
  nomcol varchar(120) [not null]
  numcpf varchar(11) [not null]
  emacol varchar(120) 
  datadm date [not null]
  datdem date
  salbas decimal(12,2) [not null]
  colati boolean [not null, default: true]
  datcri timestamp [not null, default: `now()`]
  datupd timestamp
  numemp int [not null, ref: > CADEMP.numemp]

  Note: 'Cadastro - Colaboradores'
}

Table CADEMP {
  numemp int [pk, increment]  
  razsoc varchar(120) [not null]
  emaemp varchar(120)  [not null]
  datcri timestamp [not null, default: `now()`]
  datupd timestamp

  Note: 'Cadastro - Empresas'
}