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

public class InvocationMatcher_hasSameMethod_29514302423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297;
     Object term2414;

    public InvocationMatcher_hasSameMethod_29514302423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2410 = new ArrayList();
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        ((ArrayList) term2410).add((Object)null);
        term2297 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2298 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2300 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2301 = (Object[]) newArray("java.lang.Object", 7);
        Object term2302 = newInstance(Class.forName("java.lang.Object"));
        Object term2303 = newInstance(Class.forName("java.lang.Object"));
        Object term2304 = newInstance(Class.forName("java.lang.Object"));
        Object term2305 = newInstance(Class.forName("java.lang.Object"));
        Object term2306 = newInstance(Class.forName("java.lang.Object"));
        Object term2307 = newInstance(Class.forName("java.lang.Object"));
        Object term2308 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2309 = (Object[]) newArray("java.lang.Object", 1);
        Object term2310 = newInstance(Class.forName("java.lang.Object"));
        Object term2311 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2409 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2298, term2298.getClass(), "sequenceNumber", -522618178);
        setField(term2298, term2298.getClass(), "mock", term2300);
        setField(term2298, term2298.getClass(), "method", null);
        setElement(term2301, 0, term2302);
        setElement(term2301, 1, term2303);
        setElement(term2301, 2, term2304);
        setElement(term2301, 3, term2305);
        setElement(term2301, 4, term2306);
        setElement(term2301, 5, term2307);
        setElement(term2301, 6, term2308);
        setField(term2298, term2298.getClass(), "arguments", term2301);
        setElement(term2309, 0, term2310);
        setField(term2298, term2298.getClass(), "rawArguments", term2309);
        setField(term2311, term2311.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2298, term2298.getClass(), "location", term2311);
        setBooleanField(term2298, term2298.getClass(), "verified", true);
        setField(term2298, term2298.getClass(), "realMethod", null);
        setField(term2409, term2409.getClass(), "stubbedAt", null);
        setField(term2298, term2298.getClass(), "stubInfo", term2409);
        setField(term2297, term2297.getClass(), "invocation", term2298);
        setField(term2297, term2297.getClass(), "matchers", term2410);
        term2414 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2416 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2417 = (Object[]) newArray("java.lang.Object", 7);
        Object term2418 = newInstance(Class.forName("java.lang.Object"));
        Object term2419 = newInstance(Class.forName("java.lang.Object"));
        Object term2420 = newInstance(Class.forName("java.lang.Object"));
        Object term2421 = newInstance(Class.forName("java.lang.Object"));
        Object term2422 = newInstance(Class.forName("java.lang.Object"));
        Object term2423 = newInstance(Class.forName("java.lang.Object"));
        Object term2424 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2425 = (Object[]) newArray("java.lang.Object", 2);
        Object term2426 = newInstance(Class.forName("java.lang.Object"));
        Object term2427 = newInstance(Class.forName("java.lang.Object"));
        Object term2428 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2526 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2414, term2414.getClass(), "sequenceNumber", 1134449235);
        setField(term2414, term2414.getClass(), "mock", term2416);
        setField(term2414, term2414.getClass(), "method", null);
        setElement(term2417, 0, term2418);
        setElement(term2417, 1, term2419);
        setElement(term2417, 2, term2420);
        setElement(term2417, 3, term2421);
        setElement(term2417, 4, term2422);
        setElement(term2417, 5, term2423);
        setElement(term2417, 6, term2424);
        setField(term2414, term2414.getClass(), "arguments", term2417);
        setElement(term2425, 0, term2426);
        setElement(term2425, 1, term2427);
        setField(term2414, term2414.getClass(), "rawArguments", term2425);
        setField(term2428, term2428.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2414, term2414.getClass(), "location", term2428);
        setBooleanField(term2414, term2414.getClass(), "verified", false);
        setField(term2414, term2414.getClass(), "realMethod", null);
        setField(term2526, term2526.getClass(), "stubbedAt", null);
        setField(term2414, term2414.getClass(), "stubInfo", term2526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term2414;
        try {
            callMethod(klass, "hasSameMethod", argTypes, term2297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


