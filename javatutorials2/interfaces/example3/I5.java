package interfaces.example3;
/*
    The member of the interface must be public.
 */
interface I5 {
//    private void x();
}

/*
    The code above causes an error. The interface defines how much to manipulate the class
    that implements the interface. Therefore, only public, the most open access controller that
    can be controlled externally, is allowed.
    If public is omitted, it becomes public, not access controller default.
    Because the member of the interface are unconditionally public.
 */