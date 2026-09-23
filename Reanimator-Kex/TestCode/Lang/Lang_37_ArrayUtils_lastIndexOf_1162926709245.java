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
import java.lang.Byte;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1162926709245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term819;
     Object term821;
     Object term13268;

    public ArrayUtils_lastIndexOf_1162926709245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813 = (byte[]) newByteArray(5);
        setByteElement(term813, 0, (byte) 67);
        setByteElement(term813, 1, (byte) 66);
        setByteElement(term813, 2, (byte) -121);
        setByteElement(term813, 3, (byte) -119);
        setByteElement(term813, 4, (byte) 71);
        term819 = new Byte((byte) 80);
        term821 = new Integer(335112684);
        term13268 = (byte[]) newByteArray(5);
        setByteElement(term13268, 0, (byte) 67);
        setByteElement(term13268, 1, (byte) 66);
        setByteElement(term13268, 2, (byte) -121);
        setByteElement(term13268, 3, (byte) -119);
        setByteElement(term13268, 4, (byte) 71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term813;
        args[1] = term819;
        args[2] = term821;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term813, term13268));
        assertTrue(recursiveEquals(term819, (byte) 80));
        assertTrue(recursiveEquals(term821, 335112684));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


