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

public class InvocationMatcher_isVarargMatcher_57331998027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;

    public InvocationMatcher_isVarargMatcher_57331998027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61 = new ArrayList();
        term60 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        setField(term60, term60.getClass(), "invocation", null);
        setField(term60, term60.getClass(), "matchers", term61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isVarargMatcher", argTypes, term60, args);
    }

};
