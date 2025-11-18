select p.product_name, sum(o.unit) as unit from products p 
inner join orders o on p.product_id = o.product_id 
where o.order_date between '2020-02-01' and '2020-02-29' group by p.product_name having sum(o.unit) >= 100;

/* alternatively: */

select p.product_name, sum(o.unit) as unit from products p 
inner join orders o on p.product_id = o.product_id
where year(o.order_date) = 2025 and month(o.order_date) = 2 group by p.product_name having sum(o.unit) >= 100;