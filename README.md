# JPA

```
#datasource
spring.datasource.url=jdbc:mysql://localhost:3306/db_test?useUnicode=true&characterEncoding=UTF8
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.username=使用者名稱
spring.datasource.password=密碼
spring.datasource.type=com.alibaba.druid.pool.DruidDataSource

#jpa
#要操作的目標資料庫，預設自動檢測。也可以通過 databasePlatform 屬性進行設定。
spring.jpa.database=MYSQL

#建表模式（ none 、 validate 、 update 、 create 和 create-drop ）。
這是 hibernate. hbm2ddl.auto 屬性的一個快捷方式。在使用嵌入式資料庫時，預設為 create-drop , 
其他情況下預設為 none 。
(**提示：這個東西可不能亂弄，上次有個新人就把資料庫的資料全部給更新了，謹慎**)
spring.jpa.hibernate.ddl-auto=update
#顯示SQL（預設值： false 。）
#spring.jpa.showSql = true 或者如下： 
spring.jpa.show-sql=true

#格式化SQL
spring.jpa.properties.hibernate.format_sql=true

#命名規範(必須)：Hibernate 命名策略的全限定類名。
spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy

#方言，如果不指定，將根據資料庫型別自動選擇
#spring.jpa.properties.hibernate.dialect = 方言

```

### @Entity
標示為實體類

### @Table(name="")
對應到DB table

### @Id
mapping 到PK


### @GeneratedValue(GenerationType.XXX)
告訴此Column的生成方式 ,如果設定成GenerationType.AUTO讓容器來自動產生
- INDNTITY 自增鍵值，but oracle不支援
- AUTO jpa default值，自動選擇
- SEQUENCE 自增鍵值，透過@SequenceGenerator指定列名，but mySQL不支援
- TABLE ...

### @Column(name="")
- name: 對應到Table的欄位中的欄位名稱
駝峰命名要加
- length  => length=50
- unique
- nullable =>nullable=false


```
lastName => @Column(name="last_Name")
```

### @Transient
不需要映射到DB的可加這個

```java
EX:
public String getInfo(){
    return ".....";
}
不需要在DB中映射，可加@Transient，不然會是@Basic
```


### @Basic
沒有任何annotation的就會是basic
- fetch (EAGER、LAZY)兩種，default=>EAGER
- optional 該值是否可為null，default=>true

### @Temporal ，時間相關
時間對映 
- TemporalType.DATE 只存日期 
- TemporalType.TIME 只存時間 
- TemporalType.TIMESTAMP 包括日期時間

```java

  @Temporal(TemporalType.TIMESTAMP)
  private Date created; 
```

### @Enumerated

列舉對映： value：對映型別，詳細如下： EnumType.ORDINAL ：對映為整型，表裡存的是列舉順序號 EnumType.STRING：對映為字元型，表裡存的是列舉的元素名稱，因此還需要搭配@Column註解標註欄位長度

```java

資料庫儲存列舉順序：
  @Enumerated(EnumType.ORDINAL)
  private Gender gender;
資料庫儲存列舉名稱：
  @Enumerated(EnumType.STRING)
  @Column(length = 6)
  private Gender gender;


```
