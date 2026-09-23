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

public class Base64_encodeBase64Chunked_45233324950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term6219;
     Object term6204;

    public Base64_encodeBase64Chunked_45233324950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325 = (byte[]) newByteArray(8);
        setByteElement(term1325, 0, (byte) -126);
        setByteElement(term1325, 1, (byte) -91);
        setByteElement(term1325, 2, (byte) -104);
        setByteElement(term1325, 3, (byte) -89);
        setByteElement(term1325, 4, (byte) 13);
        setByteElement(term1325, 5, (byte) 44);
        setByteElement(term1325, 6, (byte) -63);
        setByteElement(term1325, 7, (byte) 15);
        term6219 = (byte[]) newByteArray(8);
        setByteElement(term6219, 0, (byte) -126);
        setByteElement(term6219, 1, (byte) -91);
        setByteElement(term6219, 2, (byte) -104);
        setByteElement(term6219, 3, (byte) -89);
        setByteElement(term6219, 4, (byte) 13);
        setByteElement(term6219, 5, (byte) 44);
        setByteElement(term6219, 6, (byte) -63);
        setByteElement(term6219, 7, (byte) 15);
        term6204 = (byte[]) newByteArray(14);
        setByteElement(term6204, 0, (byte) 103);
        setByteElement(term6204, 1, (byte) 113);
        setByteElement(term6204, 2, (byte) 87);
        setByteElement(term6204, 3, (byte) 89);
        setByteElement(term6204, 4, (byte) 112);
        setByteElement(term6204, 5, (byte) 119);
        setByteElement(term6204, 6, (byte) 48);
        setByteElement(term6204, 7, (byte) 115);
        setByteElement(term6204, 8, (byte) 119);
        setByteElement(term6204, 9, (byte) 81);
        setByteElement(term6204, 10, (byte) 56);
        setByteElement(term6204, 11, (byte) 61);
        setByteElement(term6204, 12, (byte) 13);
        setByteElement(term6204, 13, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1325;
        Object retValue = callMethod(klass, "encodeBase64Chunked", argTypes, null, args);
        assertTrue(recursiveEquals(term1325, term6219));
        assertTrue(recursiveEquals(retValue, term6204));
    }

};


