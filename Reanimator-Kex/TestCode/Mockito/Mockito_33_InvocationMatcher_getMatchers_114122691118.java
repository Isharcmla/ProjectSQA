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

public class InvocationMatcher_getMatchers_114122691118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842;

    public InvocationMatcher_getMatchers_114122691118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term954 = new ArrayList();
        ((ArrayList) term954).add((Object)null);
        term842 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term843 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term845 = newInstance(Class.forName("java.lang.Object"));
        Object[] term846 = (Object[]) newArray("java.lang.Object", 7);
        Object term847 = newInstance(Class.forName("java.lang.Object"));
        Object term848 = newInstance(Class.forName("java.lang.Object"));
        Object term849 = newInstance(Class.forName("java.lang.Object"));
        Object term850 = newInstance(Class.forName("java.lang.Object"));
        Object term851 = newInstance(Class.forName("java.lang.Object"));
        Object term852 = newInstance(Class.forName("java.lang.Object"));
        Object term853 = newInstance(Class.forName("java.lang.Object"));
        Object[] term854 = (Object[]) newArray("java.lang.Object", 0);
        Object term855 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term953 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term843, term843.getClass(), "sequenceNumber", -1922583790);
        setField(term843, term843.getClass(), "mock", term845);
        setField(term843, term843.getClass(), "method", null);
        setElement(term846, 0, term847);
        setElement(term846, 1, term848);
        setElement(term846, 2, term849);
        setElement(term846, 3, term850);
        setElement(term846, 4, term851);
        setElement(term846, 5, term852);
        setElement(term846, 6, term853);
        setField(term843, term843.getClass(), "arguments", term846);
        setField(term843, term843.getClass(), "rawArguments", term854);
        setField(term855, term855.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term843, term843.getClass(), "location", term855);
        setBooleanField(term843, term843.getClass(), "verified", true);
        setField(term843, term843.getClass(), "realMethod", null);
        setField(term953, term953.getClass(), "stubbedAt", null);
        setField(term843, term843.getClass(), "stubInfo", term953);
        setField(term842, term842.getClass(), "invocation", term843);
        setField(term842, term842.getClass(), "matchers", term954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchers", argTypes, term842, args);
    }

};


