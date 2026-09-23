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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_toString_61018115718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;

    public InvocationMatcher_toString_61018115718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1165 = new ArrayList();
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        term1057 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1058 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1060 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1061 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term1062 = (Object[]) newArray("java.lang.Object", 2);
        Object term1063 = newInstance(Class.forName("java.lang.Object"));
        Object term1064 = newInstance(Class.forName("java.lang.Object"));
        Object term1065 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1164 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1058, term1058.getClass(), "sequenceNumber", -616727354);
        setField(term1058, term1058.getClass(), "mock", term1060);
        setField(term1058, term1058.getClass(), "method", null);
        setField(term1058, term1058.getClass(), "arguments", term1061);
        setElement(term1062, 0, term1063);
        setElement(term1062, 1, term1064);
        setField(term1058, term1058.getClass(), "rawArguments", term1062);
        setField(term1065, term1065.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1058, term1058.getClass(), "location", term1065);
        setBooleanField(term1058, term1058.getClass(), "verified", false);
        setBooleanField(term1058, term1058.getClass(), "verifiedInOrder", true);
        setField(term1058, term1058.getClass(), "realMethod", null);
        setField(term1164, term1164.getClass(), "stubbedAt", null);
        setField(term1058, term1058.getClass(), "stubInfo", term1164);
        setField(term1057, term1057.getClass(), "invocation", term1058);
        setField(term1057, term1057.getClass(), "matchers", term1165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term1057, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


