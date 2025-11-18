select p.firstname, p.lastname, a.city, a.state from person p left join address a 
on p.personID = a.personID;

/* alternatively, with right join */

select p.firstname, p.lastname, a.city, a.state from address a right join person p 
on a.personID = p.personID; 
