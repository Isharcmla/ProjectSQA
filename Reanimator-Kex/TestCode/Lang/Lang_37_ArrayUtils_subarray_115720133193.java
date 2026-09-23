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

public class ArrayUtils_subarray_115720133193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;
     Object term178;
     Object term180;
     Object term11475;
     Object term11469;

    public ArrayUtils_subarray_115720133193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = (byte[]) newByteArray(2);
        setByteElement(term175, 0, (byte) -29);
        setByteElement(term175, 1, (byte) -54);
        term178 = new Integer(1048535127);
        term180 = new Integer(-655067527);
        term11475 = (byte[]) newByteArray(2);
        setByteElement(term11475, 0, (byte) -29);
        setByteElement(term11475, 1, (byte) -54);
        term11469 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term175;
        args[1] = term178;
        args[2] = term180;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term175, term11475));
        assertTrue(recursiveEquals(term178, 1048535127));
        assertTrue(recursiveEquals(term180, -655067527));
        assertTrue(recursiveEquals(retValue, term11469));
    }

};


