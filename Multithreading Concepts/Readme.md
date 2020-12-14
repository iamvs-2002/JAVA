# Some Multithreading Concepts:

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


## Difference between t.start() and t.run()
- **In case of t.start()**, Thread class start() method is executed and **a new thread is created** that is responsible for the execution of the run() method.
- **In case of t.run(), no new thread is created** and run() method executes like a normal method called by the main thread.

*NOTE: We don't override the start() method. If the start() method is overridden, then the JVM will execute the overriden start() method and this would not give any chance to the Thread class start() method. Hence no new thread will be created and only one thread,i.e., Main Thread would be available.*

## Thread Priorities
- Every thread in Java has some priority, which may be default priority provided by the JVM or one provided by the programmer.
- Range: 1-10, where 1 is Lowest Priority and 10 is Highest Priority.
- The default priority of main thread is 5.
- **The priority of child thread is inherited from the parent.**
- Thread Schedular uses priorities while allocating processor to the thread which has the highest proiority first.
- If two threads have same priority, it depends on Thread Schedular, to decide the execution order.
- The thread with a lower priority waits until the completion of thread with higher priority.
- Three constant values are defined for thread priority:
   * MIN_PRIORITY = 1
   * NORM_PRIORITY = 5
   * MAX_PRIORITY = 10
