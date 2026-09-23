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

public class ArrayUtils_toPrimitive_1974126360282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1227;
     Object term1238;
     Object term14483;
     Object term14465;

    public ArrayUtils_toPrimitive_1974126360282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term1228 = new Byte((byte) 48);
        Byte term1230 = new Byte((byte) 89);
        Byte term1232 = new Byte((byte) 75);
        Byte term1234 = new Byte((byte) 18);
        Byte term1236 = new Byte((byte) -58);
        term1227 = (Object[]) newArray("java.lang.Byte", 5);
        setElement(term1227, 0, term1228);
        setElement(term1227, 1, term1230);
        setElement(term1227, 2, term1232);
        setElement(term1227, 3, term1234);
        setElement(term1227, 4, term1236);
        term1238 = new Byte((byte) 111);
        Byte term14484 = new Byte((byte) 48);
        Byte term14485 = new Byte((byte) 89);
        Byte term14486 = new Byte((byte) 75);
        Byte term14487 = new Byte((byte) 18);
        Byte term14488 = new Byte((byte) -58);
        term14483 = (Object[]) newArray("java.lang.Byte", 5);
        setElement(term14483, 0, term14484);
        setElement(term14483, 1, term14485);
        setElement(term14483, 2, term14486);
        setElement(term14483, 3, term14487);
        setElement(term14483, 4, term14488);
        term14465 = (byte[]) newByteArray(5);
        setByteElement(term14465, 0, (byte) 48);
        setByteElement(term14465, 1, (byte) 89);
        setByteElement(term14465, 2, (byte) 75);
        setByteElement(term14465, 3, (byte) 18);
        setByteElement(term14465, 4, (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Byte"), 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term1227;
        args[1] = term1238;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1227, term14483));
        assertTrue(recursiveEquals(term1238, (byte) 111));
        assertTrue(recursiveEquals(retValue, term14465));
    }

};


