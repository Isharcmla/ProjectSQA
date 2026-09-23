package com.fasterxml.jackson.core.json;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UTF8JsonGenerator_outputRawMultiByteChar_103720682144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;
     Object term734;
     Object term741;
     Object term743;

    public UTF8JsonGenerator_outputRawMultiByteChar_103720682144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732 = new Integer(-1371869594);
        term734 = (char[]) newCharArray(6);
        setCharElement(term734, 0, 'w');
        setCharElement(term734, 1, 'D');
        setCharElement(term734, 2, 'Y');
        setCharElement(term734, 3, 'F');
        setCharElement(term734, 4, 's');
        setCharElement(term734, 5, 'j');
        term741 = new Integer(-2095575670);
        term743 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term732;
        args[1] = term734;
        args[2] = term741;
        args[3] = term743;
        try {
            callMethod(klass, "_outputRawMultiByteChar", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


