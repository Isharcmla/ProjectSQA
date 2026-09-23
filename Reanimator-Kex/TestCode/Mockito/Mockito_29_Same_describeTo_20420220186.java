package org.mockito.internal.matchers;

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
import static org.mockito.internal.matchers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Same_describeTo_20420220186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public Same_describeTo_20420220186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.mockito.internal.matchers.Same"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        setField(term5, term5.getClass(), "wanted", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.matchers.Same");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Description");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "describeTo", argTypes, term5, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


