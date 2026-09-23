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

public class Base64_encodeBase64Chunked_45233324959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1355;
     Object term7683;
     Object term7676;

    public Base64_encodeBase64Chunked_45233324959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1355 = (byte[]) newByteArray(2);
        setByteElement(term1355, 0, (byte) -101);
        setByteElement(term1355, 1, (byte) 35);
        term7683 = (byte[]) newByteArray(2);
        setByteElement(term7683, 0, (byte) -101);
        setByteElement(term7683, 1, (byte) 35);
        term7676 = (byte[]) newByteArray(6);
        setByteElement(term7676, 0, (byte) 109);
        setByteElement(term7676, 1, (byte) 121);
        setByteElement(term7676, 2, (byte) 77);
        setByteElement(term7676, 3, (byte) 61);
        setByteElement(term7676, 4, (byte) 13);
        setByteElement(term7676, 5, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1355;
        Object retValue = callMethod(klass, "encodeBase64Chunked", argTypes, null, args);
        assertTrue(recursiveEquals(term1355, term7683));
        assertTrue(recursiveEquals(retValue, term7676));
    }

};


