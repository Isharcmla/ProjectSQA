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

public class ArrayUtils_lastIndexOf_1162926709247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;
     Object term830;
     Object term832;
     Object term13314;

    public ArrayUtils_lastIndexOf_1162926709247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824 = (byte[]) newByteArray(5);
        setByteElement(term824, 0, (byte) 67);
        setByteElement(term824, 1, (byte) 66);
        setByteElement(term824, 2, (byte) -121);
        setByteElement(term824, 3, (byte) -119);
        setByteElement(term824, 4, (byte) 71);
        term830 = new Byte((byte) 80);
        term832 = new Integer(335112684);
        term13314 = (byte[]) newByteArray(5);
        setByteElement(term13314, 0, (byte) 67);
        setByteElement(term13314, 1, (byte) 66);
        setByteElement(term13314, 2, (byte) -121);
        setByteElement(term13314, 3, (byte) -119);
        setByteElement(term13314, 4, (byte) 71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term824;
        args[1] = term830;
        args[2] = term832;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term824, term13314));
        assertTrue(recursiveEquals(term830, (byte) 80));
        assertTrue(recursiveEquals(term832, 335112684));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


