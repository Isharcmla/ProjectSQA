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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DelegatingMethod_equals_21274000209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579;
     Object term3764;

    public DelegatingMethod_equals_21274000209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3806 = Class.forName((String) "java.util.stream.WhileOps$TakeWhileTask");
        Object[] term3987 = (Object[]) newArray("java.lang.Class", 0);
        Method term3580 = ((Class) term3806).getDeclaredMethod((String) "doLeaf", (Class[]) term3987);
        ((Method) term3580).setAccessible(false);
        term3579 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term3579, term3579.getClass(), "method", term3580);
        term3764 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3764;
        callMethod(klass, "equals", argTypes, term3579, args);
    }

};


