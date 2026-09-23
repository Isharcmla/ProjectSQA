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

public class ArrayUtils_toPrimitive_1974126360280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1216;
     Object term1227;
     Object term14437;
     Object term14419;

    public ArrayUtils_toPrimitive_1974126360280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term1217 = new Byte((byte) 48);
        Byte term1219 = new Byte((byte) 89);
        Byte term1221 = new Byte((byte) 75);
        Byte term1223 = new Byte((byte) 18);
        Byte term1225 = new Byte((byte) -58);
        term1216 = (Object[]) newArray("java.lang.Byte", 5);
        setElement(term1216, 0, term1217);
        setElement(term1216, 1, term1219);
        setElement(term1216, 2, term1221);
        setElement(term1216, 3, term1223);
        setElement(term1216, 4, term1225);
        term1227 = new Byte((byte) 111);
        Byte term14438 = new Byte((byte) 48);
        Byte term14439 = new Byte((byte) 89);
        Byte term14440 = new Byte((byte) 75);
        Byte term14441 = new Byte((byte) 18);
        Byte term14442 = new Byte((byte) -58);
        term14437 = (Object[]) newArray("java.lang.Byte", 5);
        setElement(term14437, 0, term14438);
        setElement(term14437, 1, term14439);
        setElement(term14437, 2, term14440);
        setElement(term14437, 3, term14441);
        setElement(term14437, 4, term14442);
        term14419 = (byte[]) newByteArray(5);
        setByteElement(term14419, 0, (byte) 48);
        setByteElement(term14419, 1, (byte) 89);
        setByteElement(term14419, 2, (byte) 75);
        setByteElement(term14419, 3, (byte) 18);
        setByteElement(term14419, 4, (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Byte"), 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term1216;
        args[1] = term1227;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1216, term14437));
        assertTrue(recursiveEquals(term1227, (byte) 111));
        assertTrue(recursiveEquals(retValue, term14419));
    }

};


