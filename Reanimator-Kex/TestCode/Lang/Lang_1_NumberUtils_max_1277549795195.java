package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_max_1277549795195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96411;
     Object term96481;

    public NumberUtils_max_1277549795195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96411 = (byte[]) newByteArray(8);
        setByteElement(term96411, 0, (byte) 30);
        setByteElement(term96411, 1, (byte) 32);
        setByteElement(term96411, 2, (byte) 32);
        setByteElement(term96411, 3, (byte) 32);
        setByteElement(term96411, 4, (byte) 32);
        setByteElement(term96411, 5, (byte) 32);
        setByteElement(term96411, 6, (byte) 32);
        setByteElement(term96411, 7, (byte) 32);
        term96481 = (byte[]) newByteArray(8);
        setByteElement(term96481, 0, (byte) 30);
        setByteElement(term96481, 1, (byte) 32);
        setByteElement(term96481, 2, (byte) 32);
        setByteElement(term96481, 3, (byte) 32);
        setByteElement(term96481, 4, (byte) 32);
        setByteElement(term96481, 5, (byte) 32);
        setByteElement(term96481, 6, (byte) 32);
        setByteElement(term96481, 7, (byte) 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96411;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term96411, term96481));
    }

};


