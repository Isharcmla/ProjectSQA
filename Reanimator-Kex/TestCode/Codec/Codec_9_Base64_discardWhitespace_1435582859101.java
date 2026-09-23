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

public class Base64_discardWhitespace_1435582859101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45549;
     Object term48513;
     Object term47534;

    public Base64_discardWhitespace_1435582859101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45549 = (byte[]) newByteArray(489);
        setByteElement(term45549, 0, (byte) 13);
        term48513 = (byte[]) newByteArray(489);
        setByteElement(term48513, 0, (byte) 13);
        term47534 = (byte[]) newByteArray(488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45549;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term45549, term48513));
        assertTrue(recursiveEquals(retValue, term47534));
    }

};


