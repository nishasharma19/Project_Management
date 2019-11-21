export class Subtask 
{
    constructor(public subTaskId: number,
        public subTaskTitle: string,
        public subTaskDescription: string,
        public startDate: Date,
        public dueDate: Date,
        public progressPercentage: number,){};
    
}
