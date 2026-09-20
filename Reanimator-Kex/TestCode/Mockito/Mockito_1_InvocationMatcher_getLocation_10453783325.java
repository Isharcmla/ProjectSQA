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

public class InvocationMatcher_getLocation_10453783325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public InvocationMatcher_getLocation_10453783325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51 = new ArrayList();
        ((ArrayList) term51).add((Object)null);
        ((ArrayList) term51).add((Object)null);
        ((ArrayList) term51).add((Object)null);
        term50 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        setField(term50, term50.getClass(), "invocation", null);
        setField(term50, term50.getClass(), "matchers", term51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLocation", argTypes, term50, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
