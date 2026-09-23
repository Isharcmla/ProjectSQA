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

public class StringUtils_newStringIso88591_213209273636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2937;
     Object term6365;

    public StringUtils_newStringIso88591_213209273636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2937 = (byte[]) newByteArray(5);
        setByteElement(term2937, 0, (byte) -66);
        setByteElement(term2937, 1, (byte) 83);
        setByteElement(term2937, 2, (byte) 74);
        setByteElement(term2937, 3, (byte) -71);
        setByteElement(term2937, 4, (byte) 49);
        term6365 = (byte[]) newByteArray(5);
        setByteElement(term6365, 0, (byte) -66);
        setByteElement(term6365, 1, (byte) 83);
        setByteElement(term6365, 2, (byte) 74);
        setByteElement(term6365, 3, (byte) -71);
        setByteElement(term6365, 4, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2937;
        Object retValue = callMethod(klass, "newStringIso8859_1", argTypes, null, args);
        assertTrue(recursiveEquals(term2937, term6365));
        assertTrue(recursiveEquals(retValue, "\uFFBESJ\uFFB91"));
    }

};


