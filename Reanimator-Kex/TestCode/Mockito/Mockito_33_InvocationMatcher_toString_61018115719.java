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

public class InvocationMatcher_toString_61018115719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;

    public InvocationMatcher_toString_61018115719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1159 = new ArrayList();
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        ((ArrayList) term1159).add((Object)null);
        term1052 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1053 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1055 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1056 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term1057 = (Object[]) newArray("java.lang.Object", 2);
        Object term1058 = newInstance(Class.forName("java.lang.Object"));
        Object term1059 = newInstance(Class.forName("java.lang.Object"));
        Object term1060 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1158 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1053, term1053.getClass(), "sequenceNumber", -616727354);
        setField(term1053, term1053.getClass(), "mock", term1055);
        setField(term1053, term1053.getClass(), "method", null);
        setField(term1053, term1053.getClass(), "arguments", term1056);
        setElement(term1057, 0, term1058);
        setElement(term1057, 1, term1059);
        setField(term1053, term1053.getClass(), "rawArguments", term1057);
        setField(term1060, term1060.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1053, term1053.getClass(), "location", term1060);
        setBooleanField(term1053, term1053.getClass(), "verified", true);
        setField(term1053, term1053.getClass(), "realMethod", null);
        setField(term1158, term1158.getClass(), "stubbedAt", null);
        setField(term1053, term1053.getClass(), "stubInfo", term1158);
        setField(term1052, term1052.getClass(), "invocation", term1053);
        setField(term1052, term1052.getClass(), "matchers", term1159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term1052, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


