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
import static org.mockito.internal.creation.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class DelegatingMethod_getExceptionTypes_76050489812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396;

    public DelegatingMethod_getExceptionTypes_76050489812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4800 = Class.forName((String) "java.util.concurrent.Executors$2");
        Object[] term4949 = (Object[]) newArray("java.lang.Class", 0);
        Method term397 = ((Class) term4800).getDeclaredMethod((String) "call", (Class[]) term4949);
        ((Method) term397).setAccessible(true);
        term396 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term396, term396.getClass(), "method", term397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionTypes", argTypes, term396, args);
    }

};


