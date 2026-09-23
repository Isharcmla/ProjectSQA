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
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_safelyArgumentsMatch_9650046747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677;
     Object term1795;

    public InvocationMatcher_safelyArgumentsMatch_9650046747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1791 = new ArrayList();
        ((ArrayList) term1791).add((Object)null);
        term1677 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1678 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1680 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1681 = (Object[]) newArray("java.lang.Object", 2);
        Object term1682 = newInstance(Class.forName("java.lang.Object"));
        Object term1683 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1684 = (Object[]) newArray("java.lang.Object", 6);
        Object term1685 = newInstance(Class.forName("java.lang.Object"));
        Object term1686 = newInstance(Class.forName("java.lang.Object"));
        Object term1687 = newInstance(Class.forName("java.lang.Object"));
        Object term1688 = newInstance(Class.forName("java.lang.Object"));
        Object term1689 = newInstance(Class.forName("java.lang.Object"));
        Object term1690 = newInstance(Class.forName("java.lang.Object"));
        Object term1691 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1790 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1678, term1678.getClass(), "sequenceNumber", 1227103734);
        setField(term1678, term1678.getClass(), "mock", term1680);
        setField(term1678, term1678.getClass(), "method", null);
        setElement(term1681, 0, term1682);
        setElement(term1681, 1, term1683);
        setField(term1678, term1678.getClass(), "arguments", term1681);
        setElement(term1684, 0, term1685);
        setElement(term1684, 1, term1686);
        setElement(term1684, 2, term1687);
        setElement(term1684, 3, term1688);
        setElement(term1684, 4, term1689);
        setElement(term1684, 5, term1690);
        setField(term1678, term1678.getClass(), "rawArguments", term1684);
        setField(term1691, term1691.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1678, term1678.getClass(), "location", term1691);
        setBooleanField(term1678, term1678.getClass(), "verified", true);
        setBooleanField(term1678, term1678.getClass(), "verifiedInOrder", true);
        setField(term1678, term1678.getClass(), "realMethod", null);
        setField(term1790, term1790.getClass(), "stubbedAt", null);
        setField(term1678, term1678.getClass(), "stubInfo", term1790);
        setField(term1677, term1677.getClass(), "invocation", term1678);
        setField(term1677, term1677.getClass(), "matchers", term1791);
        term1795 = (Object[]) newArray("java.lang.Object", 1);
        Object term1796 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1795, 0, term1796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1795;
        callMethod(klass, "safelyArgumentsMatch", argTypes, term1677, args);
    }

};


