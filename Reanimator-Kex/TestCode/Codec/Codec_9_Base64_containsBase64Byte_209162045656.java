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

public class Base64_containsBase64Byte_209162045656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term6209;

    public Base64_containsBase64Byte_209162045656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1183 = (byte[]) newByteArray(3);
        setByteElement(term1183, 0, (byte) -92);
        setByteElement(term1183, 1, (byte) -42);
        setByteElement(term1183, 2, (byte) 116);
        term6209 = (byte[]) newByteArray(3);
        setByteElement(term6209, 0, (byte) -92);
        setByteElement(term6209, 1, (byte) -42);
        setByteElement(term6209, 2, (byte) 116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1183;
        Object retValue = callMethod(klass, "containsBase64Byte", argTypes, null, args);
        assertTrue(recursiveEquals(term1183, term6209));
        assertTrue(recursiveEquals(retValue, true));
    }

};


