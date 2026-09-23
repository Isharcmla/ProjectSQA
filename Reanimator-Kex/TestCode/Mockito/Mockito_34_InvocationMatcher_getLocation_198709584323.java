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
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_getLocation_198709584323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2728;

    public InvocationMatcher_getLocation_198709584323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2837 = new ArrayList();
        term2728 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2729 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2731 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2732 = (Object[]) newArray("java.lang.Object", 2);
        Object term2733 = newInstance(Class.forName("java.lang.Object"));
        Object term2734 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2735 = (Object[]) newArray("java.lang.Object", 1);
        Object term2736 = newInstance(Class.forName("java.lang.Object"));
        Object term2737 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2836 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2729, term2729.getClass(), "sequenceNumber", -883034806);
        setField(term2729, term2729.getClass(), "mock", term2731);
        setField(term2729, term2729.getClass(), "method", null);
        setElement(term2732, 0, term2733);
        setElement(term2732, 1, term2734);
        setField(term2729, term2729.getClass(), "arguments", term2732);
        setElement(term2735, 0, term2736);
        setField(term2729, term2729.getClass(), "rawArguments", term2735);
        setField(term2737, term2737.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2729, term2729.getClass(), "location", term2737);
        setBooleanField(term2729, term2729.getClass(), "verified", false);
        setBooleanField(term2729, term2729.getClass(), "verifiedInOrder", false);
        setField(term2729, term2729.getClass(), "realMethod", null);
        setField(term2836, term2836.getClass(), "stubbedAt", null);
        setField(term2729, term2729.getClass(), "stubInfo", term2836);
        setField(term2728, term2728.getClass(), "invocation", term2729);
        setField(term2728, term2728.getClass(), "matchers", term2837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term2728, args);
    }

};


