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

public class Base64_encodeBase64_46074399957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term6476;
     Object term6471;

    public Base64_encodeBase64_46074399957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190 = (byte[]) newByteArray(1);
        setByteElement(term1190, 0, (byte) -81);
        term6476 = (byte[]) newByteArray(1);
        setByteElement(term6476, 0, (byte) -81);
        term6471 = (byte[]) newByteArray(4);
        setByteElement(term6471, 0, (byte) 114);
        setByteElement(term6471, 1, (byte) 119);
        setByteElement(term6471, 2, (byte) 61);
        setByteElement(term6471, 3, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1190;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1190, term6476));
        assertTrue(recursiveEquals(retValue, term6471));
    }

};


