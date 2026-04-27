#include <stdio.h>
void bubble(int bt[], int pid[], int n) {
    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - i - 1; j++) {
            if(bt[j] > bt[j+1]) {

                int temp = bt[j];
                bt[j] = bt[j+1];
                bt[j+1] = temp;

                temp = pid[j];
                pid[j] = pid[j+1];
                pid[j+1] = temp;
            }
        }
    }
}

int main() {
    int n, bt[20], wt[20], tat[20], pid[20];
    double awt = 0, atat = 0;
    printf("Enter the number of process: ");
    scanf("%d", &n);
    printf("Enter the burst time for each process:\n");
    for(int i = 0; i < n; i++) {
        pid[i] = i + 1;
        printf("Process %d: ", pid[i]);
        scanf("%d", &bt[i]);
    }
    bubble(bt, pid, n);
    wt[0] = 0;
    tat[0] = bt[0];
    for(int i = 1; i < n; i++) {
        wt[i] = wt[i-1] + bt[i-1];
        tat[i] = wt[i] + bt[i];
    }
    for(int i = 0; i < n; i++) {
        awt += wt[i];
        atat += tat[i];
    }
    awt /= n;
    atat /= n;
    printf("\nPID\tBT\tWT\tTAT\n");
    for(int i = 0; i < n; i++)
        printf("%d\t%d\t%d\t%d\n", pid[i], bt[i], wt[i], tat[i]);
    printf("\nAverage Waiting Time: %.2f", awt);
    printf("\nAverage Turn Around Time: %.2f\n", atat);
    return 0;
}
