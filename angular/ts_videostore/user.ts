/**
 * User class létrehozása (exportálva)
 *
 * Mezők:
 *
 * @status: public Status enum
 * @_username: protected string
 * @_email: protected string
 *
 * Használj getter/setter-t a _username és _email property-re
 * Kikötés mindkét setter-re:
 * paraméterként stringet kapnak és legalább 5 karakter hosszú paramétert fogadnak el
 * Ha nem megfelelő a paraméter akkor írja ki a konzol-ra: 'invalid email!' v. 'invalid username!'
 *
 * Legyen egy setStatus metódus is, ami paraméterben kapott Status-t beállítja a helyi status tulajdonágnak
 *
 */
import {Status} from "./status.enum";

export class User {
    public status: Status;
    protected _username: string;
    protected _email: string;

    constructor(status: Status, username: string, email: string) {
        this.status = status;
        this._username = username;
        this._email = email;
    }

    setStatus(status: Status) {
        this.status = status;
    }

    get username(): string {
        return this._username;
    }

    set username(newUsername: string) {
        if (newUsername.length >= 5) {
            this._username = newUsername;
        } else {
            console.log('Invalid username');
        }
    }

    get email(): string {
        return this._email;
    }

    set email(newEmail: string) {
        if (newEmail.length >= 5) {
            this._email = newEmail;
        } else {
            console.log('Invalid email');
        }
    }
}