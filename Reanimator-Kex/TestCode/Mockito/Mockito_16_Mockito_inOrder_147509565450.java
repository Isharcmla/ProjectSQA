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

public class Mockito_inOrder_147509565450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2995;

    public Mockito_inOrder_147509565450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2995 = (Object[]) newArray("java.lang.Object", 5);
        Object term2996 = newInstance(Class.forName("java.lang.Object"));
        Object term2997 = newInstance(Class.forName("java.lang.Object"));
        Object term2998 = newInstance(Class.forName("java.lang.Object"));
        Object term2999 = newInstance(Class.forName("java.lang.Object"));
        Object term3000 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2995, 0, term2996);
        setElement(term2995, 1, term2997);
        setElement(term2995, 2, term2998);
        setElement(term2995, 3, term2999);
        setElement(term2995, 4, term3000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Mockito");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2995;
        try {
            callMethod(klass, "inOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


