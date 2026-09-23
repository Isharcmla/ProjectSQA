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

public class ArrayUtils_clone_335222207182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term10695;
     Object term10685;

    public ArrayUtils_clone_335222207182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = (long[]) newLongArray(4);
        setLongElement(term51, 0, 2442117782898005296L);
        setLongElement(term51, 1, 6375119433582206027L);
        setLongElement(term51, 2, -8257434502486459194L);
        setLongElement(term51, 3, -8400487765614892086L);
        term10695 = (long[]) newLongArray(4);
        setLongElement(term10695, 0, 2442117782898005296L);
        setLongElement(term10695, 1, 6375119433582206027L);
        setLongElement(term10695, 2, -8257434502486459194L);
        setLongElement(term10695, 3, -8400487765614892086L);
        term10685 = (long[]) newLongArray(4);
        setLongElement(term10685, 0, 2442117782898005296L);
        setLongElement(term10685, 1, 6375119433582206027L);
        setLongElement(term10685, 2, -8257434502486459194L);
        setLongElement(term10685, 3, -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term51;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term51, term10695));
        assertTrue(recursiveEquals(retValue, term10685));
    }

};


