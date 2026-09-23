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

public class ArrayUtils_isSameLength_1946785162199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;
     Object term239;
     Object term11603;
     Object term11604;

    public ArrayUtils_isSameLength_1946785162199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = (int[]) newIntArray(1);
        setIntElement(term237, 0, 865208305);
        term239 = (int[]) newIntArray(9);
        setIntElement(term239, 0, -1275173084);
        setIntElement(term239, 1, -244121226);
        setIntElement(term239, 2, -203030934);
        setIntElement(term239, 3, -1179120542);
        setIntElement(term239, 4, -73683645);
        setIntElement(term239, 5, -226514366);
        setIntElement(term239, 6, 1193880199);
        setIntElement(term239, 7, -1087774327);
        setIntElement(term239, 8, -1530420153);
        term11603 = (int[]) newIntArray(1);
        setIntElement(term11603, 0, 865208305);
        term11604 = (int[]) newIntArray(9);
        setIntElement(term11604, 0, -1275173084);
        setIntElement(term11604, 1, -244121226);
        setIntElement(term11604, 2, -203030934);
        setIntElement(term11604, 3, -1179120542);
        setIntElement(term11604, 4, -73683645);
        setIntElement(term11604, 5, -226514366);
        setIntElement(term11604, 6, 1193880199);
        setIntElement(term11604, 7, -1087774327);
        setIntElement(term11604, 8, -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term237;
        args[1] = term239;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term237, term11603));
        assertTrue(recursiveEquals(term239, term11604));
        assertTrue(recursiveEquals(retValue, false));
    }

};


