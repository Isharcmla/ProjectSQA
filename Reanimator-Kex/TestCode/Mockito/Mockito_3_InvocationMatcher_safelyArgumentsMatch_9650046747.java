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
import java.util.ArrayList;
import java.lang.Object;

public class InvocationMatcher_safelyArgumentsMatch_9650046747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term39;

    public InvocationMatcher_safelyArgumentsMatch_9650046747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35 = new ArrayList();
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        term34 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        setField(term34, term34.getClass(), "invocation", null);
        setField(term34, term34.getClass(), "matchers", term35);
        term39 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39;
        callMethod(klass, "safelyArgumentsMatch", argTypes, term34, args);
    }

};


