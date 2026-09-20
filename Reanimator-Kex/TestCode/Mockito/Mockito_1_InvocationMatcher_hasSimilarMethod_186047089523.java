package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class InvocationMatcher_hasSimilarMethod_186047089523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;

    public InvocationMatcher_hasSimilarMethod_186047089523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term41 = new ArrayList();
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        term40 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        setField(term40, term40.getClass(), "invocation", null);
        setField(term40, term40.getClass(), "matchers", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "hasSimilarMethod", argTypes, term40, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
