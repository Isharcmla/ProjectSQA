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
import java.lang.Byte;

public class ArrayUtils_toPrimitive_1708512294279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;
     Object term14403;
     Object term14398;

    public ArrayUtils_toPrimitive_1708512294279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term1214 = new Byte((byte) 47);
        term1213 = (Object[]) newArray("java.lang.Byte", 1);
        setElement(term1213, 0, term1214);
        Byte term14404 = new Byte((byte) 47);
        term14403 = (Object[]) newArray("java.lang.Byte", 1);
        setElement(term14403, 0, term14404);
        term14398 = (byte[]) newByteArray(1);
        setByteElement(term14398, 0, (byte) 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Byte"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1213;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1213, term14403));
        assertTrue(recursiveEquals(retValue, term14398));
    }

};


