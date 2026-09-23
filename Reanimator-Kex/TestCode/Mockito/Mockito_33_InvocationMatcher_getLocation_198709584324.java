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

public class InvocationMatcher_getLocation_198709584324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2715;

    public InvocationMatcher_getLocation_198709584324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2823 = new ArrayList();
        term2715 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2716 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2718 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2719 = (Object[]) newArray("java.lang.Object", 2);
        Object term2720 = newInstance(Class.forName("java.lang.Object"));
        Object term2721 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2722 = (Object[]) newArray("java.lang.Object", 1);
        Object term2723 = newInstance(Class.forName("java.lang.Object"));
        Object term2724 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2822 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2716, term2716.getClass(), "sequenceNumber", -883034806);
        setField(term2716, term2716.getClass(), "mock", term2718);
        setField(term2716, term2716.getClass(), "method", null);
        setElement(term2719, 0, term2720);
        setElement(term2719, 1, term2721);
        setField(term2716, term2716.getClass(), "arguments", term2719);
        setElement(term2722, 0, term2723);
        setField(term2716, term2716.getClass(), "rawArguments", term2722);
        setField(term2724, term2724.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2716, term2716.getClass(), "location", term2724);
        setBooleanField(term2716, term2716.getClass(), "verified", true);
        setField(term2716, term2716.getClass(), "realMethod", null);
        setField(term2822, term2822.getClass(), "stubbedAt", null);
        setField(term2716, term2716.getClass(), "stubInfo", term2822);
        setField(term2715, term2715.getClass(), "invocation", term2716);
        setField(term2715, term2715.getClass(), "matchers", term2823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term2715, args);
    }

};


