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

public class Base64_encodeBase64Chunked_45233324961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1216;
     Object term7515;
     Object term7504;

    public Base64_encodeBase64Chunked_45233324961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1216 = (byte[]) newByteArray(6);
        setByteElement(term1216, 0, (byte) 45);
        setByteElement(term1216, 1, (byte) -39);
        setByteElement(term1216, 2, (byte) -20);
        setByteElement(term1216, 3, (byte) 10);
        setByteElement(term1216, 4, (byte) 77);
        setByteElement(term1216, 5, (byte) 14);
        term7515 = (byte[]) newByteArray(6);
        setByteElement(term7515, 0, (byte) 45);
        setByteElement(term7515, 1, (byte) -39);
        setByteElement(term7515, 2, (byte) -20);
        setByteElement(term7515, 3, (byte) 10);
        setByteElement(term7515, 4, (byte) 77);
        setByteElement(term7515, 5, (byte) 14);
        term7504 = (byte[]) newByteArray(10);
        setByteElement(term7504, 0, (byte) 76);
        setByteElement(term7504, 1, (byte) 100);
        setByteElement(term7504, 2, (byte) 110);
        setByteElement(term7504, 3, (byte) 115);
        setByteElement(term7504, 4, (byte) 67);
        setByteElement(term7504, 5, (byte) 107);
        setByteElement(term7504, 6, (byte) 48);
        setByteElement(term7504, 7, (byte) 79);
        setByteElement(term7504, 8, (byte) 13);
        setByteElement(term7504, 9, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1216;
        Object retValue = callMethod(klass, "encodeBase64Chunked", argTypes, null, args);
        assertTrue(recursiveEquals(term1216, term7515));
        assertTrue(recursiveEquals(retValue, term7504));
    }

};


