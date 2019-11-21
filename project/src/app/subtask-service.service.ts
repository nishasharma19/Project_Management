import { Subtask } from './subtask';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';

/*@Injectable({
  providedIn: 'root'
})*/

@Injectable()
export class SubtaskServiceService 
{

  private subtaskUrl: string;
  private updateUrl: string
 
  constructor(private http: HttpClient) 
  { 
      this.subtaskUrl = 'api/getsubtasks';
      this.updateUrl = 'api/updateProgress';
  }

  public findAll(): Observable<Subtask[]>
  {
    return this.http.get<Subtask[]>(this.subtaskUrl);
  }


  public updateProgress(id: number, progress:number ):Observable<Subtask>
  {
    const url = `${this.updateUrl}/${id}/${progress}`;
    return this.http.put<Subtask>(url, progress);
  }

}
