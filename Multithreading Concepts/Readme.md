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


### Difference between t.start() and t.run()
- In case of t.start(), Thread class start() method is executed and a new thread is created that is responsible for the execution of the run() method.
- In case of t.run(), no new thread is created and run() method executes like a normal method called by the main thread.
