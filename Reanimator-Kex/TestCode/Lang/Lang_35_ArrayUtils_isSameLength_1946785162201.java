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

public class ArrayUtils_isSameLength_1946785162201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;
     Object term250;
     Object term11649;
     Object term11650;

    public ArrayUtils_isSameLength_1946785162201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = (int[]) newIntArray(1);
        setIntElement(term248, 0, 865208305);
        term250 = (int[]) newIntArray(9);
        setIntElement(term250, 0, -1275173084);
        setIntElement(term250, 1, -244121226);
        setIntElement(term250, 2, -203030934);
        setIntElement(term250, 3, -1179120542);
        setIntElement(term250, 4, -73683645);
        setIntElement(term250, 5, -226514366);
        setIntElement(term250, 6, 1193880199);
        setIntElement(term250, 7, -1087774327);
        setIntElement(term250, 8, -1530420153);
        term11649 = (int[]) newIntArray(1);
        setIntElement(term11649, 0, 865208305);
        term11650 = (int[]) newIntArray(9);
        setIntElement(term11650, 0, -1275173084);
        setIntElement(term11650, 1, -244121226);
        setIntElement(term11650, 2, -203030934);
        setIntElement(term11650, 3, -1179120542);
        setIntElement(term11650, 4, -73683645);
        setIntElement(term11650, 5, -226514366);
        setIntElement(term11650, 6, 1193880199);
        setIntElement(term11650, 7, -1087774327);
        setIntElement(term11650, 8, -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term248;
        args[1] = term250;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term248, term11649));
        assertTrue(recursiveEquals(term250, term11650));
        assertTrue(recursiveEquals(retValue, false));
    }

};


