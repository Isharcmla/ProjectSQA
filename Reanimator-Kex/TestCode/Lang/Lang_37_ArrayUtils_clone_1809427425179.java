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
import java.lang.Object;

public class ArrayUtils_clone_1809427425179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term10634;
     Object term10629;

    public ArrayUtils_clone_1809427425179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = (Object[]) newArray("java.lang.Object", 3);
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        setElement(term33, 0, term34);
        setElement(term33, 1, term35);
        setElement(term33, 2, term36);
        term10634 = (Object[]) newArray("java.lang.Object", 3);
        Object term10635 = newInstance(Class.forName("java.lang.Object"));
        Object term10636 = newInstance(Class.forName("java.lang.Object"));
        Object term10637 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10634, 0, term10635);
        setElement(term10634, 1, term10636);
        setElement(term10634, 2, term10637);
        term10629 = (Object[]) newArray("java.lang.Object", 3);
        Object term10630 = newInstance(Class.forName("java.lang.Object"));
        Object term10631 = newInstance(Class.forName("java.lang.Object"));
        Object term10632 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10629, 0, term10630);
        setElement(term10629, 1, term10631);
        setElement(term10629, 2, term10632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term33, term10634));
        assertTrue(recursiveEquals(retValue, term10629));
    }

};


