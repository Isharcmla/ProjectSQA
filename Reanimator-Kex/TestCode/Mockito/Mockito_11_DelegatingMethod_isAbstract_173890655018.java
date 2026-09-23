package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DelegatingMethod_isAbstract_173890655018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3578;

    public DelegatingMethod_isAbstract_173890655018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3578 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term3578, term3578.getClass(), "method", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAbstract", argTypes, term3578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


