/**
 * Készíts el egy "Customer" osztályt, ami a "User" osztályt terjeszti ki
 * Legyen egy saját property-je:
 * @_videoList: private Video típusú lista (indulásra az értéke üres tömb)
 *
 * Készíts egy gettert a listához.
 *
 * Hozz létre egy "addVideo" metódust (paraméterek: User, Video típusúak)
 * Ellenőrizze a User status értékét, ha "Admin" akkor adja hozzá a video listához,
 * más esetben írja ki a konzolra 'Only admin can add video to List!'
 *
 * Hozz létre egy "getVideoByTitle" metódust, ami string paramétert ("title") vár, és cím alapján keres a listában
 * Vagy "Video" vagy undefined típussal tér vissza
 */
import {User} from "./user";
import {Video} from "./video";
import {Status} from "./status.enum";

export class Customer extends User{
    private _videoList: Video[] = [];

    addVideo(user: User, video: Video){
        if (user.status === Status.ADMIN) {
            this._videoList.push(video);
        } else {
            console.log('Only admin can add video to List!');
        }
    }

    getVideoByTitle(title: string): Video|undefined{
        return this._videoList.find(video => video.title === title);
    }

    get videoList() {
        return this._videoList;
    }
}