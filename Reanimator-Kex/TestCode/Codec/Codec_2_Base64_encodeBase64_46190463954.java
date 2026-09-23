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
import java.lang.Boolean;

public class Base64_encodeBase64_46190463954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1673;
     Object term1677;
     Object term1679;
     Object term7867;
     Object term7859;

    public Base64_encodeBase64_46190463954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1673 = (byte[]) newByteArray(3);
        setByteElement(term1673, 0, (byte) -46);
        setByteElement(term1673, 1, (byte) -128);
        setByteElement(term1673, 2, (byte) 66);
        term1677 = new Boolean(true);
        term1679 = new Boolean(false);
        term7867 = (byte[]) newByteArray(3);
        setByteElement(term7867, 0, (byte) -46);
        setByteElement(term7867, 1, (byte) -128);
        setByteElement(term7867, 2, (byte) 66);
        term7859 = (byte[]) newByteArray(6);
        setByteElement(term7859, 0, (byte) 48);
        setByteElement(term7859, 1, (byte) 111);
        setByteElement(term7859, 2, (byte) 66);
        setByteElement(term7859, 3, (byte) 67);
        setByteElement(term7859, 4, (byte) 13);
        setByteElement(term7859, 5, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1673;
        args[1] = term1677;
        args[2] = term1679;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1673, false));
        assertTrue(recursiveEquals(term1677, term7867));
        assertTrue(recursiveEquals(term1679, true));
        assertTrue(recursiveEquals(retValue, term7859));
    }

};


