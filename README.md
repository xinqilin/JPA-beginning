# JPA
### @Entity
標示為實體類

### @Table(name="")
對應到DB table

### @Id
mapping 到PK


### @GeneratedValue(GenerationType.XXX)告訴此Column的生成方式 ,如果設定成GenerationType.AUTO讓容器來自動產生
- INDNTITY
- AUTO
- SEQUENCE
- TABLE

### @Column(name="")
name: 對應到Table的欄位中的欄位名稱
