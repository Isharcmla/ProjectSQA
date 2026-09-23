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

public class DelegatingMethod_getName_7636317214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293;

    public DelegatingMethod_getName_7636317214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6188 = Class.forName((String) "java.util.stream.LongStream");
        Class<? extends Object> term6370 = Class.forName((String) "java.util.function.LongConsumer");
        Object[] term6371 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term6371, 0, term6370);
        Method term1294 = ((Class) term6188).getDeclaredMethod((String) "forEachOrdered", (Class[]) term6371);
        ((Method) term1294).setAccessible(true);
        term1293 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term1293, term1293.getClass(), "method", term1294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1293, args);
    }

};


