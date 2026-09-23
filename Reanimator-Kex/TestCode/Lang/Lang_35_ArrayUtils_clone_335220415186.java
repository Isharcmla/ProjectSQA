package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_clone_335220415186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term10775;
     Object term10761;

    public ArrayUtils_clone_335220415186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = (byte[]) newByteArray(6);
        setByteElement(term79, 0, (byte) 47);
        setByteElement(term79, 1, (byte) 48);
        setByteElement(term79, 2, (byte) 89);
        setByteElement(term79, 3, (byte) 75);
        setByteElement(term79, 4, (byte) 18);
        setByteElement(term79, 5, (byte) -58);
        term10775 = (byte[]) newByteArray(6);
        setByteElement(term10775, 0, (byte) 47);
        setByteElement(term10775, 1, (byte) 48);
        setByteElement(term10775, 2, (byte) 89);
        setByteElement(term10775, 3, (byte) 75);
        setByteElement(term10775, 4, (byte) 18);
        setByteElement(term10775, 5, (byte) -58);
        term10761 = (byte[]) newByteArray(6);
        setByteElement(term10761, 0, (byte) 47);
        setByteElement(term10761, 1, (byte) 48);
        setByteElement(term10761, 2, (byte) 89);
        setByteElement(term10761, 3, (byte) 75);
        setByteElement(term10761, 4, (byte) 18);
        setByteElement(term10761, 5, (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term79;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term79, term10775));
        assertTrue(recursiveEquals(retValue, term10761));
    }

};


