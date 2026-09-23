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

public class Base64_encodeBase64URLSafe_21933451159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194;
     Object term6763;
     Object term6759;

    public Base64_encodeBase64URLSafe_21933451159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194 = (byte[]) newByteArray(2);
        setByteElement(term1194, 0, (byte) 102);
        setByteElement(term1194, 1, (byte) -118);
        term6763 = (byte[]) newByteArray(2);
        setByteElement(term6763, 0, (byte) 102);
        setByteElement(term6763, 1, (byte) -118);
        term6759 = (byte[]) newByteArray(3);
        setByteElement(term6759, 0, (byte) 90);
        setByteElement(term6759, 1, (byte) 111);
        setByteElement(term6759, 2, (byte) 111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1194;
        Object retValue = callMethod(klass, "encodeBase64URLSafe", argTypes, null, args);
        assertTrue(recursiveEquals(term1194, term6763));
        assertTrue(recursiveEquals(retValue, term6759));
    }

};


