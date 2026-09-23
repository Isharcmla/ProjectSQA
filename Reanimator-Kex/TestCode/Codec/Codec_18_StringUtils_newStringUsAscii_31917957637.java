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

public class StringUtils_newStringUsAscii_31917957637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2952;
     Object term6718;

    public StringUtils_newStringUsAscii_31917957637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2952 = (byte[]) newByteArray(2);
        setByteElement(term2952, 0, (byte) -54);
        setByteElement(term2952, 1, (byte) 67);
        term6718 = (byte[]) newByteArray(2);
        setByteElement(term6718, 0, (byte) -54);
        setByteElement(term6718, 1, (byte) 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2952;
        Object retValue = callMethod(klass, "newStringUsAscii", argTypes, null, args);
        assertTrue(recursiveEquals(term2952, term6718));
        assertTrue(recursiveEquals(retValue, "\uFFFD\uFFFFC "));
    }

};


