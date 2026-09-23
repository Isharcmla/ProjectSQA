package org.mockito.internal.creation.instance;

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
import static org.mockito.internal.creation.instance.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ConstructorInstantiator_newInstance_9893779936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public ConstructorInstantiator_newInstance_9893779936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator"));
        Object term3 = newInstance(Class.forName("java.lang.Object"));
        setField(term2, term2.getClass(), "outerClassInstance", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "newInstance", argTypes, term2, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


