insert into tbl_product  (product_company, product_price, product_name, product_id,product_picbyte)  values ( 'ABC','100.0', 'ABC', '1',FILE_READ('classpath:/application.properties'));
insert into tbl_product  (product_company, product_price, product_name, product_id,product_picbyte)  values ( 'DEF','100.0', 'DEF', '2', FILE_READ('classpath:/ABC.png'));