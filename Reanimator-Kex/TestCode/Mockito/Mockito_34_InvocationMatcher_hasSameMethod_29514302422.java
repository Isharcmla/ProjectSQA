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
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_hasSameMethod_29514302422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2308;
     Object term2426;

    public InvocationMatcher_hasSameMethod_29514302422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2422 = new ArrayList();
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        term2308 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2309 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2311 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2312 = (Object[]) newArray("java.lang.Object", 7);
        Object term2313 = newInstance(Class.forName("java.lang.Object"));
        Object term2314 = newInstance(Class.forName("java.lang.Object"));
        Object term2315 = newInstance(Class.forName("java.lang.Object"));
        Object term2316 = newInstance(Class.forName("java.lang.Object"));
        Object term2317 = newInstance(Class.forName("java.lang.Object"));
        Object term2318 = newInstance(Class.forName("java.lang.Object"));
        Object term2319 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2320 = (Object[]) newArray("java.lang.Object", 1);
        Object term2321 = newInstance(Class.forName("java.lang.Object"));
        Object term2322 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2421 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2309, term2309.getClass(), "sequenceNumber", -522618178);
        setField(term2309, term2309.getClass(), "mock", term2311);
        setField(term2309, term2309.getClass(), "method", null);
        setElement(term2312, 0, term2313);
        setElement(term2312, 1, term2314);
        setElement(term2312, 2, term2315);
        setElement(term2312, 3, term2316);
        setElement(term2312, 4, term2317);
        setElement(term2312, 5, term2318);
        setElement(term2312, 6, term2319);
        setField(term2309, term2309.getClass(), "arguments", term2312);
        setElement(term2320, 0, term2321);
        setField(term2309, term2309.getClass(), "rawArguments", term2320);
        setField(term2322, term2322.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2309, term2309.getClass(), "location", term2322);
        setBooleanField(term2309, term2309.getClass(), "verified", true);
        setBooleanField(term2309, term2309.getClass(), "verifiedInOrder", true);
        setField(term2309, term2309.getClass(), "realMethod", null);
        setField(term2421, term2421.getClass(), "stubbedAt", null);
        setField(term2309, term2309.getClass(), "stubInfo", term2421);
        setField(term2308, term2308.getClass(), "invocation", term2309);
        setField(term2308, term2308.getClass(), "matchers", term2422);
        term2426 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2428 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2429 = (Object[]) newArray("java.lang.Object", 7);
        Object term2430 = newInstance(Class.forName("java.lang.Object"));
        Object term2431 = newInstance(Class.forName("java.lang.Object"));
        Object term2432 = newInstance(Class.forName("java.lang.Object"));
        Object term2433 = newInstance(Class.forName("java.lang.Object"));
        Object term2434 = newInstance(Class.forName("java.lang.Object"));
        Object term2435 = newInstance(Class.forName("java.lang.Object"));
        Object term2436 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2437 = (Object[]) newArray("java.lang.Object", 2);
        Object term2438 = newInstance(Class.forName("java.lang.Object"));
        Object term2439 = newInstance(Class.forName("java.lang.Object"));
        Object term2440 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2539 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2426, term2426.getClass(), "sequenceNumber", 1134449235);
        setField(term2426, term2426.getClass(), "mock", term2428);
        setField(term2426, term2426.getClass(), "method", null);
        setElement(term2429, 0, term2430);
        setElement(term2429, 1, term2431);
        setElement(term2429, 2, term2432);
        setElement(term2429, 3, term2433);
        setElement(term2429, 4, term2434);
        setElement(term2429, 5, term2435);
        setElement(term2429, 6, term2436);
        setField(term2426, term2426.getClass(), "arguments", term2429);
        setElement(term2437, 0, term2438);
        setElement(term2437, 1, term2439);
        setField(term2426, term2426.getClass(), "rawArguments", term2437);
        setField(term2440, term2440.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2426, term2426.getClass(), "location", term2440);
        setBooleanField(term2426, term2426.getClass(), "verified", true);
        setBooleanField(term2426, term2426.getClass(), "verifiedInOrder", false);
        setField(term2426, term2426.getClass(), "realMethod", null);
        setField(term2539, term2539.getClass(), "stubbedAt", null);
        setField(term2426, term2426.getClass(), "stubInfo", term2539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term2426;
        try {
            callMethod(klass, "hasSameMethod", argTypes, term2308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


