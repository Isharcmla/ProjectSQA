package org.apache.commons.lang3;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_clone_838903489188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term10823;
     Object term10809;

    public ArrayUtils_clone_838903489188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = (float[]) newFloatArray(6);
        setFloatElement(term97, 0, 0.13238746F);
        setFloatElement(term97, 1, 0.2707036F);
        setFloatElement(term97, 2, 0.3455959F);
        setFloatElement(term97, 3, 0.09123778F);
        setFloatElement(term97, 4, 0.5523636F);
        setFloatElement(term97, 5, 0.8564069F);
        term10823 = (float[]) newFloatArray(6);
        setFloatElement(term10823, 0, 0.13238746F);
        setFloatElement(term10823, 1, 0.2707036F);
        setFloatElement(term10823, 2, 0.3455959F);
        setFloatElement(term10823, 3, 0.09123778F);
        setFloatElement(term10823, 4, 0.5523636F);
        setFloatElement(term10823, 5, 0.8564069F);
        term10809 = (float[]) newFloatArray(6);
        setFloatElement(term10809, 0, 0.13238746F);
        setFloatElement(term10809, 1, 0.2707036F);
        setFloatElement(term10809, 2, 0.3455959F);
        setFloatElement(term10809, 3, 0.09123778F);
        setFloatElement(term10809, 4, 0.5523636F);
        setFloatElement(term10809, 5, 0.8564069F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term97;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term97, term10823));
        assertTrue(recursiveEquals(retValue, term10809));
    }

};


