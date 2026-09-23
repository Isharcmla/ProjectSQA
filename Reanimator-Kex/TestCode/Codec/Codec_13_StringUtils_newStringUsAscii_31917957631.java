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

public class StringUtils_newStringUsAscii_31917957631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3033;
     Object term14407;

    public StringUtils_newStringUsAscii_31917957631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3033 = (byte[]) newByteArray(2);
        setByteElement(term3033, 0, (byte) -54);
        setByteElement(term3033, 1, (byte) 67);
        term14407 = (byte[]) newByteArray(2);
        setByteElement(term14407, 0, (byte) -54);
        setByteElement(term14407, 1, (byte) 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3033;
        Object retValue = callMethod(klass, "newStringUsAscii", argTypes, null, args);
        assertTrue(recursiveEquals(term3033, term14407));
        assertTrue(recursiveEquals(retValue, "\uFFFD\uFFFFC "));
    }

};


