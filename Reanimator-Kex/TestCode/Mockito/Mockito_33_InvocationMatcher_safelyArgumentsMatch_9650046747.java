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
     Object term1669;
     Object term1786;

    public InvocationMatcher_safelyArgumentsMatch_9650046747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1782 = new ArrayList();
        ((ArrayList) term1782).add((Object)null);
        term1669 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1670 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1672 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1673 = (Object[]) newArray("java.lang.Object", 2);
        Object term1674 = newInstance(Class.forName("java.lang.Object"));
        Object term1675 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1676 = (Object[]) newArray("java.lang.Object", 6);
        Object term1677 = newInstance(Class.forName("java.lang.Object"));
        Object term1678 = newInstance(Class.forName("java.lang.Object"));
        Object term1679 = newInstance(Class.forName("java.lang.Object"));
        Object term1680 = newInstance(Class.forName("java.lang.Object"));
        Object term1681 = newInstance(Class.forName("java.lang.Object"));
        Object term1682 = newInstance(Class.forName("java.lang.Object"));
        Object term1683 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1781 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1670, term1670.getClass(), "sequenceNumber", 1227103734);
        setField(term1670, term1670.getClass(), "mock", term1672);
        setField(term1670, term1670.getClass(), "method", null);
        setElement(term1673, 0, term1674);
        setElement(term1673, 1, term1675);
        setField(term1670, term1670.getClass(), "arguments", term1673);
        setElement(term1676, 0, term1677);
        setElement(term1676, 1, term1678);
        setElement(term1676, 2, term1679);
        setElement(term1676, 3, term1680);
        setElement(term1676, 4, term1681);
        setElement(term1676, 5, term1682);
        setField(term1670, term1670.getClass(), "rawArguments", term1676);
        setField(term1683, term1683.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1670, term1670.getClass(), "location", term1683);
        setBooleanField(term1670, term1670.getClass(), "verified", false);
        setField(term1670, term1670.getClass(), "realMethod", null);
        setField(term1781, term1781.getClass(), "stubbedAt", null);
        setField(term1670, term1670.getClass(), "stubInfo", term1781);
        setField(term1669, term1669.getClass(), "invocation", term1670);
        setField(term1669, term1669.getClass(), "matchers", term1782);
        term1786 = (Object[]) newArray("java.lang.Object", 1);
        Object term1787 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1786, 0, term1787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1786;
        callMethod(klass, "safelyArgumentsMatch", argTypes, term1669, args);
    }

};


