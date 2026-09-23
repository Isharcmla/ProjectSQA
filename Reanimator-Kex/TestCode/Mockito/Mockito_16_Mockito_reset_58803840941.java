package org.mockito;

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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Mockito_reset_58803840941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public Mockito_reset_58803840941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = (Object[]) newArray("java.lang.Object", 6);
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term32 = newInstance(Class.forName("java.lang.Object"));
        Object term33 = newInstance(Class.forName("java.lang.Object"));
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        setElement(term28, 0, term29);
        setElement(term28, 1, term30);
        setElement(term28, 2, term31);
        setElement(term28, 3, term32);
        setElement(term28, 4, term33);
        setElement(term28, 5, term34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Mockito");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28;
        try {
            callMethod(klass, "reset", argTypes, null, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


