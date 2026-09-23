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

public class ArrayUtils_subarray_115958469196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term203;
     Object term205;
     Object term11518;
     Object term11514;

    public ArrayUtils_subarray_115958469196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = (boolean[]) newBooleanArray(0);
        term203 = new Integer(1135664017);
        term205 = new Integer(590364439);
        term11518 = (boolean[]) newBooleanArray(0);
        term11514 = (boolean[]) newBooleanArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term202;
        args[1] = term203;
        args[2] = term205;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term202, term11518));
        assertTrue(recursiveEquals(term203, 1135664017));
        assertTrue(recursiveEquals(term205, 590364439));
        assertTrue(recursiveEquals(retValue, term11514));
    }

};


