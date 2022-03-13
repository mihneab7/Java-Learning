class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me

        if (this.minutes == 59) {
            this.minutes = 00;
            this.hours++;
            if (this.hours == 13) {
                this.hours = 01;
            }
        } else {
            this.minutes++;
        }
    }
}