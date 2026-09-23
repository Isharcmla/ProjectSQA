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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.invocation.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class InvocationMatcher_getMatchers_114122691117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;

    public InvocationMatcher_getMatchers_114122691117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20 = new ArrayList();
        ((ArrayList) term20).add((Object)null);
        ((ArrayList) term20).add((Object)null);
        ((ArrayList) term20).add((Object)null);
        ((ArrayList) term20).add((Object)null);
        term19 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        setField(term19, term19.getClass(), "invocation", null);
        setField(term19, term19.getClass(), "matchers", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchers", argTypes, term19, args);
    }

};


