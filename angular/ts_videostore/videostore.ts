/**
 * Készítsd el a ts-file-ok leírásainak megfelelő entitásokat, class-okat..
 * Ha kész vannak a file-ok. Teszteld itt a leírásoknak megfelelően:
 *
 * Hozz létre 2 Customer -t egyik sima felhasználót ("customer" objektum), a másik vegye fel az "ADMIN" státuszt! => "admin" objektum)
 */
import {Customer} from "./customer";
import {Status} from "./status.enum";
import {Video} from "./video";

console.log('------ Define a Customer and another Customer as admin ---\n');

// TODO
let customer: Customer = new Customer(Status.ACTIVE, 'Luc Gizi', 'gizus@gmail');
let admin: Customer = new Customer(Status.ADMIN, 'Admin Béla', 'admin@gmail');

// A felhasználó megpróbálja kitörölni az email címét (üres string-re állítani). Hibaüzenetnek kell megjelenni!
// customer.email = 'bk';

customer.email = '';

/**
 * Hozz létre két  - Video - objektumot ==> video1, video2 objektum. Figyelj arra, hogy "Video" interface típusúak legyenek!
 */

// TODO
let video1: Video = {title: 'superman', releaseYear: 1988};
let video2: Video = {title: 'batman', releaseYear: 1995};


// Objektumok megjelenítése, ellenőrzés miatt:
console.table(customer);
console.table(admin);
console.table(video1);
console.table(video2);

/**
 * A sima felhasználó próbáljon magához adni egy videót, hiba üzenetnek kell megjelennie.
 *
 * customer.addVideo(customer, video1);
 */
console.log('\n----- customer try the add a video onto him/her self ---\n');

// TODO
customer.addVideo(customer, video1);

/**
 * Az admin hozzáad két videót a felhasználóhoz
 *
 * customer.addVideo(admin,video1);
 * customer.addVideo(admin,video2);
 */
console.log('\n----------- admin add two videos to customer list -----\n');

// TODO
admin.addVideo(admin, video1);
admin.addVideo(admin, video2);

// Videó lista ellenőrzése...
console.log('customer videó listája: ');
console.log(customer.videoList);
console.log('\nadmin videó listája: ');
console.log(admin.videoList);

/**
 * Lekérdezés cím alapján..
 *
 * customer.getVideoByTitle('superman')
 */
console.log('\n--------- customer search video by title -----\n');

console.log(admin.getVideoByTitle('superman'));

/**
 * A felhasználó megpróbálja egy karakterre átírni a nevét. Hibaüzenetnek kell megjelennie
 *
 * customer.username = 'a';
 *
 * Majd felvesz egy valid új nevet
 * customer.username = 'Bill Gates';
 */
console.log('\n------- customer change his/her name -----\n');

// TODO
customer.username = 'a';
customer.username = 'Bill Gates';

// Getter segítségével meg kell jeleníteni a felhasználó új nevét
console.log(customer.username);