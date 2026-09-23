package org.mockito.internal.verification.argumentmatching;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ArgumentMatchingTool_toStringEquals_1654184643119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86938;
     Object term87032;

    public ArgumentMatchingTool_toStringEquals_1654184643119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86938 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term87136 = Class.forName((String) "java.nio.DirectShortBufferS");
        term87032 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term87100 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term87234 = newInstance(Class.forName("java.nio.DirectShortBufferS"));
        setField(term87032, term87032.getClass(), "featureDescription", null);
        setField(term87100, term87100.getClass(), "eventClass", term87136);
        setField(term87100, term87100.getClass(), "source", term87234);
        setField(term87032, term87032.getClass(), "subMatcher", term87100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term87032;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term86938, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


