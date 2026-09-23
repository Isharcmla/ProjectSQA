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

public class Mockito_verifyZeroInteractions_41372699843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;

    public Mockito_verifyZeroInteractions_41372699843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = (Object[]) newArray("java.lang.Object", 4);
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        Object term45 = newInstance(Class.forName("java.lang.Object"));
        setElement(term41, 0, term42);
        setElement(term41, 1, term43);
        setElement(term41, 2, term44);
        setElement(term41, 3, term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Mockito");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41;
        try {
            callMethod(klass, "verifyZeroInteractions", argTypes, null, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


