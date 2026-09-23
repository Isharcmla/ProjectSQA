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
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1163664757230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;
     Object term605;
     Object term607;
     Object term12754;

    public ArrayUtils_lastIndexOf_1163664757230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602 = (int[]) newIntArray(2);
        setIntElement(term602, 0, 292681826);
        setIntElement(term602, 1, 458147407);
        term605 = new Integer(-184153539);
        term607 = new Integer(493620644);
        term12754 = (int[]) newIntArray(2);
        setIntElement(term12754, 0, 292681826);
        setIntElement(term12754, 1, 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term602;
        args[1] = term605;
        args[2] = term607;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term602, term12754));
        assertTrue(recursiveEquals(term605, -184153539));
        assertTrue(recursiveEquals(term607, 493620644));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


