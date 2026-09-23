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

public class InvocationMatcher_getMatchers_114122691117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846;

    public InvocationMatcher_getMatchers_114122691117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term959 = new ArrayList();
        ((ArrayList) term959).add((Object)null);
        term846 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term847 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term849 = newInstance(Class.forName("java.lang.Object"));
        Object[] term850 = (Object[]) newArray("java.lang.Object", 7);
        Object term851 = newInstance(Class.forName("java.lang.Object"));
        Object term852 = newInstance(Class.forName("java.lang.Object"));
        Object term853 = newInstance(Class.forName("java.lang.Object"));
        Object term854 = newInstance(Class.forName("java.lang.Object"));
        Object term855 = newInstance(Class.forName("java.lang.Object"));
        Object term856 = newInstance(Class.forName("java.lang.Object"));
        Object term857 = newInstance(Class.forName("java.lang.Object"));
        Object[] term858 = (Object[]) newArray("java.lang.Object", 0);
        Object term859 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term958 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term847, term847.getClass(), "sequenceNumber", -1922583790);
        setField(term847, term847.getClass(), "mock", term849);
        setField(term847, term847.getClass(), "method", null);
        setElement(term850, 0, term851);
        setElement(term850, 1, term852);
        setElement(term850, 2, term853);
        setElement(term850, 3, term854);
        setElement(term850, 4, term855);
        setElement(term850, 5, term856);
        setElement(term850, 6, term857);
        setField(term847, term847.getClass(), "arguments", term850);
        setField(term847, term847.getClass(), "rawArguments", term858);
        setField(term859, term859.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term847, term847.getClass(), "location", term859);
        setBooleanField(term847, term847.getClass(), "verified", false);
        setBooleanField(term847, term847.getClass(), "verifiedInOrder", true);
        setField(term847, term847.getClass(), "realMethod", null);
        setField(term958, term958.getClass(), "stubbedAt", null);
        setField(term847, term847.getClass(), "stubInfo", term958);
        setField(term846, term846.getClass(), "invocation", term847);
        setField(term846, term846.getClass(), "matchers", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchers", argTypes, term846, args);
    }

};


