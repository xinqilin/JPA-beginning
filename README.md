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
### 簡要:
<table class="table table-bordered" style="box-sizing: border-box; border-collapse: collapse; border-spacing: 0px; width: 604px; max-width: 100%; margin-bottom: 20px;  border-color: rgb(221, 221, 221); color: rgb(49, 49, 49); font-family: 'Open Sans', Arial, sans-serif; font-size: 14px; line-height: 22px; background-color: transparent;">
	<tbody style="box-sizing: border-box;">
		<tr style="box-sizing: border-box;">
			<th style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221); background: rgb(238, 238, 238);">
				注解</th>
			<th style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221); background: rgb(238, 238, 238);">
				描述</th>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Entity</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				聲明類為實體或表。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Table</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				聲明表名。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Basic</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定非約束明確的各個字段。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Embedded</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定類或它的值是一個可嵌入的類的實例的實體的屬性。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Id</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定的類的屬性，用於識彆（一個表中的主鍵）。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@GeneratedValue</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定如何標識屬性可以被初始化，例如自動，手動，或從序列表中獲得的值。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Transient</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定的屬性，它是不持久的，即，該值永遠不會存儲在數據庫中。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@Column</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定持久屬性欄屬性。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@SequenceGenerator</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定在@GeneratedValue注解中指定的屬性的值。它創建了一個序列。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@TableGenerator</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定在@GeneratedValue批注指定屬性的值發生器。它創造了的值生成的表。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@AccessType</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				這種類型的注釋用於設置訪問類型。如果設置@AccessType（FIELD），然後進入FIELD明智的。如果設置@AccessType（PROPERTY），然後進入屬性發生明智的。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@JoinColumn</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定一個實體組織或實體的集合。這是用在多對一和一對多關聯。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@UniqueConstraint</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定的字段和用於主要或輔助表的唯一約束。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@ColumnResult</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				參考使用select子句的SQL查詢中的列名。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@ManyToMany</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				定義了連接表之間的多對多一對多的關係。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@ManyToOne</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				定義了連接表之間的多對一的關係。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@OneToMany</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				定義了連接表之間存在一個一對多的關係。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@OneToOne</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				定義了連接表之間有一個一對一的關係。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@NamedQueries</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定命名查詢的列表。</td>
		</tr>
		<tr style="box-sizing: border-box;">
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				@NamedQuery</td>
			<td style="box-sizing: border-box; padding: 8px; line-height: 1.42857143; vertical-align: top;  border-color: rgb(221, 221, 221);">
				指定使用靜態名稱的查詢。</td>
		</tr>
	</tbody>
</table>

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

### @TableGenerator自訂生成策略

```java
@TableGenerator(
    name="自訂的名稱",
    table="table name",
    allocationSize=1,(index每次長幾個)
    initialValue=1,
    pkColumnName="欄位名(橫向)",
    pkColumnValue="pkColumnName的值(橫向)",
    valueColumnName="value欄位名(直向)"
)
@GeneratedValue(strategy=GenerationType.Table,generator="自訂名稱(mapping到上方)")
```

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
