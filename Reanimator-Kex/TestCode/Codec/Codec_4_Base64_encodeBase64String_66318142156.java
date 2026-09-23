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

public class Base64_encodeBase64String_66318142156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1320;
     Object term6415;

    public Base64_encodeBase64String_66318142156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1320 = (byte[]) newByteArray(2);
        setByteElement(term1320, 0, (byte) 102);
        setByteElement(term1320, 1, (byte) -118);
        term6415 = (byte[]) newByteArray(2);
        setByteElement(term6415, 0, (byte) 102);
        setByteElement(term6415, 1, (byte) -118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1320;
        Object retValue = callMethod(klass, "encodeBase64String", argTypes, null, args);
        assertTrue(recursiveEquals(term1320, term6415));
        assertTrue(recursiveEquals(retValue, "Zoo=\r\n"));
    }

};


