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

public class Base64_isArrayByteBase64_205583690454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;
     Object term6149;

    public Base64_isArrayByteBase64_205583690454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167 = (byte[]) newByteArray(5);
        setByteElement(term1167, 0, (byte) 100);
        setByteElement(term1167, 1, (byte) 106);
        setByteElement(term1167, 2, (byte) -57);
        setByteElement(term1167, 3, (byte) -103);
        setByteElement(term1167, 4, (byte) 98);
        term6149 = (byte[]) newByteArray(5);
        setByteElement(term6149, 0, (byte) 100);
        setByteElement(term6149, 1, (byte) 106);
        setByteElement(term6149, 2, (byte) -57);
        setByteElement(term6149, 3, (byte) -103);
        setByteElement(term6149, 4, (byte) 98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1167;
        callMethod(klass, "isArrayByteBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1167, term6149));
    }

};


