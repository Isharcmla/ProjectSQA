package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class StringUtils_newStringIso88591_213209273630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3022;
     Object term14382;

    public StringUtils_newStringIso88591_213209273630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3022 = (byte[]) newByteArray(5);
        setByteElement(term3022, 0, (byte) -66);
        setByteElement(term3022, 1, (byte) 83);
        setByteElement(term3022, 2, (byte) 74);
        setByteElement(term3022, 3, (byte) -71);
        setByteElement(term3022, 4, (byte) 49);
        term14382 = (byte[]) newByteArray(5);
        setByteElement(term14382, 0, (byte) -66);
        setByteElement(term14382, 1, (byte) 83);
        setByteElement(term14382, 2, (byte) 74);
        setByteElement(term14382, 3, (byte) -71);
        setByteElement(term14382, 4, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3022;
        Object retValue = callMethod(klass, "newStringIso8859_1", argTypes, null, args);
        assertTrue(recursiveEquals(term3022, term14382));
        assertTrue(recursiveEquals(retValue, "\uFFBESJ\uFFB91"));
    }

};


