## Thread Life Cycles
### New
MyThread = new Thread();

### Ready
t.start()

### Running State
If the thread schedular allocates CPU for a particular thread, thread goes to running state.
When the thread is in running state, it means that the run() method is being executed.

### Blocked State
If the running thread gets interrupted, or it goes to sleeping state at the moment, then it goes to the blocked state.

### Dead State
If the execution of run() method is completed, thread goes to dead state.

## Thread Schedular
- Part of JVM.
- It decides which thread will be executed first and which will be executed next.
- **Only one thread gets executed at a time.**
- Exact behaviour of thread schedular can't be expected. Hence, exact output can't be expected of multithreaded examples.
- It uses mainly Preemptive Scheduling or Time Slicing Scheduling to schedule the threads.
