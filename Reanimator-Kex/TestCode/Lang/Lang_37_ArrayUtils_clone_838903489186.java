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

public class ArrayUtils_clone_838903489186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term10777;
     Object term10763;

    public ArrayUtils_clone_838903489186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = (float[]) newFloatArray(6);
        setFloatElement(term83, 0, 0.13238746F);
        setFloatElement(term83, 1, 0.2707036F);
        setFloatElement(term83, 2, 0.3455959F);
        setFloatElement(term83, 3, 0.09123778F);
        setFloatElement(term83, 4, 0.5523636F);
        setFloatElement(term83, 5, 0.8564069F);
        term10777 = (float[]) newFloatArray(6);
        setFloatElement(term10777, 0, 0.13238746F);
        setFloatElement(term10777, 1, 0.2707036F);
        setFloatElement(term10777, 2, 0.3455959F);
        setFloatElement(term10777, 3, 0.09123778F);
        setFloatElement(term10777, 4, 0.5523636F);
        setFloatElement(term10777, 5, 0.8564069F);
        term10763 = (float[]) newFloatArray(6);
        setFloatElement(term10763, 0, 0.13238746F);
        setFloatElement(term10763, 1, 0.2707036F);
        setFloatElement(term10763, 2, 0.3455959F);
        setFloatElement(term10763, 3, 0.09123778F);
        setFloatElement(term10763, 4, 0.5523636F);
        setFloatElement(term10763, 5, 0.8564069F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term83, term10777));
        assertTrue(recursiveEquals(retValue, term10763));
    }

};


