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

public class Base64_encodeBase64String_663181421105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24657;
     Object term58480;

    public Base64_encodeBase64String_663181421105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24657 = (byte[]) newByteArray(44);
        setByteElement(term24657, 1, (byte) -128);
        setByteElement(term24657, 2, (byte) -109);
        setByteElement(term24657, 3, (byte) -109);
        setByteElement(term24657, 4, (byte) -109);
        setByteElement(term24657, 5, (byte) -109);
        setByteElement(term24657, 6, (byte) -109);
        setByteElement(term24657, 7, (byte) -109);
        setByteElement(term24657, 8, (byte) -109);
        setByteElement(term24657, 9, (byte) -109);
        setByteElement(term24657, 10, (byte) -109);
        setByteElement(term24657, 11, (byte) -109);
        setByteElement(term24657, 12, (byte) -109);
        setByteElement(term24657, 13, (byte) -109);
        setByteElement(term24657, 14, (byte) -109);
        setByteElement(term24657, 15, (byte) -109);
        setByteElement(term24657, 16, (byte) -109);
        setByteElement(term24657, 17, (byte) -109);
        setByteElement(term24657, 18, (byte) -109);
        setByteElement(term24657, 19, (byte) -109);
        setByteElement(term24657, 20, (byte) -109);
        setByteElement(term24657, 21, (byte) -109);
        setByteElement(term24657, 22, (byte) -109);
        setByteElement(term24657, 23, (byte) -109);
        setByteElement(term24657, 24, (byte) -109);
        setByteElement(term24657, 25, (byte) -109);
        setByteElement(term24657, 26, (byte) -109);
        setByteElement(term24657, 27, (byte) -109);
        setByteElement(term24657, 28, (byte) -109);
        setByteElement(term24657, 29, (byte) -109);
        setByteElement(term24657, 30, (byte) -109);
        setByteElement(term24657, 31, (byte) -109);
        setByteElement(term24657, 32, (byte) -109);
        setByteElement(term24657, 33, (byte) -109);
        setByteElement(term24657, 34, (byte) -109);
        setByteElement(term24657, 35, (byte) -109);
        setByteElement(term24657, 36, (byte) -109);
        setByteElement(term24657, 37, (byte) -109);
        setByteElement(term24657, 38, (byte) -109);
        setByteElement(term24657, 39, (byte) -109);
        setByteElement(term24657, 40, (byte) -109);
        setByteElement(term24657, 41, (byte) -109);
        setByteElement(term24657, 42, (byte) -109);
        setByteElement(term24657, 43, (byte) -109);
        term58480 = (byte[]) newByteArray(44);
        setByteElement(term58480, 1, (byte) -128);
        setByteElement(term58480, 2, (byte) -109);
        setByteElement(term58480, 3, (byte) -109);
        setByteElement(term58480, 4, (byte) -109);
        setByteElement(term58480, 5, (byte) -109);
        setByteElement(term58480, 6, (byte) -109);
        setByteElement(term58480, 7, (byte) -109);
        setByteElement(term58480, 8, (byte) -109);
        setByteElement(term58480, 9, (byte) -109);
        setByteElement(term58480, 10, (byte) -109);
        setByteElement(term58480, 11, (byte) -109);
        setByteElement(term58480, 12, (byte) -109);
        setByteElement(term58480, 13, (byte) -109);
        setByteElement(term58480, 14, (byte) -109);
        setByteElement(term58480, 15, (byte) -109);
        setByteElement(term58480, 16, (byte) -109);
        setByteElement(term58480, 17, (byte) -109);
        setByteElement(term58480, 18, (byte) -109);
        setByteElement(term58480, 19, (byte) -109);
        setByteElement(term58480, 20, (byte) -109);
        setByteElement(term58480, 21, (byte) -109);
        setByteElement(term58480, 22, (byte) -109);
        setByteElement(term58480, 23, (byte) -109);
        setByteElement(term58480, 24, (byte) -109);
        setByteElement(term58480, 25, (byte) -109);
        setByteElement(term58480, 26, (byte) -109);
        setByteElement(term58480, 27, (byte) -109);
        setByteElement(term58480, 28, (byte) -109);
        setByteElement(term58480, 29, (byte) -109);
        setByteElement(term58480, 30, (byte) -109);
        setByteElement(term58480, 31, (byte) -109);
        setByteElement(term58480, 32, (byte) -109);
        setByteElement(term58480, 33, (byte) -109);
        setByteElement(term58480, 34, (byte) -109);
        setByteElement(term58480, 35, (byte) -109);
        setByteElement(term58480, 36, (byte) -109);
        setByteElement(term58480, 37, (byte) -109);
        setByteElement(term58480, 38, (byte) -109);
        setByteElement(term58480, 39, (byte) -109);
        setByteElement(term58480, 40, (byte) -109);
        setByteElement(term58480, 41, (byte) -109);
        setByteElement(term58480, 42, (byte) -109);
        setByteElement(term58480, 43, (byte) -109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24657;
        Object retValue = callMethod(klass, "encodeBase64String", argTypes, null, args);
        assertTrue(recursiveEquals(term24657, term58480));
        assertTrue(recursiveEquals(retValue, "AICTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5OTk5M="));
    }

};


