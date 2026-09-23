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

public class InvocationMatcher_captureArgumentsFrom_117254838112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3152;
     Object term3268;

    public InvocationMatcher_captureArgumentsFrom_117254838112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3264 = new ArrayList();
        ((ArrayList) term3264).add((Object)null);
        ((ArrayList) term3264).add((Object)null);
        ((ArrayList) term3264).add((Object)null);
        ((ArrayList) term3264).add((Object)null);
        term3152 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term3153 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term3155 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3156 = (Object[]) newArray("java.lang.Object", 1);
        Object term3157 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3158 = (Object[]) newArray("java.lang.Object", 5);
        Object term3159 = newInstance(Class.forName("java.lang.Object"));
        Object term3160 = newInstance(Class.forName("java.lang.Object"));
        Object term3161 = newInstance(Class.forName("java.lang.Object"));
        Object term3162 = newInstance(Class.forName("java.lang.Object"));
        Object term3163 = newInstance(Class.forName("java.lang.Object"));
        Object term3164 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3263 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term3153, term3153.getClass(), "sequenceNumber", 597278769);
        setField(term3153, term3153.getClass(), "mock", term3155);
        setField(term3153, term3153.getClass(), "method", null);
        setElement(term3156, 0, term3157);
        setField(term3153, term3153.getClass(), "arguments", term3156);
        setElement(term3158, 0, term3159);
        setElement(term3158, 1, term3160);
        setElement(term3158, 2, term3161);
        setElement(term3158, 3, term3162);
        setElement(term3158, 4, term3163);
        setField(term3153, term3153.getClass(), "rawArguments", term3158);
        setField(term3164, term3164.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term3153, term3153.getClass(), "location", term3164);
        setBooleanField(term3153, term3153.getClass(), "verified", true);
        setBooleanField(term3153, term3153.getClass(), "verifiedInOrder", true);
        setField(term3153, term3153.getClass(), "realMethod", null);
        setField(term3263, term3263.getClass(), "stubbedAt", null);
        setField(term3153, term3153.getClass(), "stubInfo", term3263);
        setField(term3152, term3152.getClass(), "invocation", term3153);
        setField(term3152, term3152.getClass(), "matchers", term3264);
        term3268 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term3270 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3271 = (Object[]) newArray("java.lang.Object", 4);
        Object term3272 = newInstance(Class.forName("java.lang.Object"));
        Object term3273 = newInstance(Class.forName("java.lang.Object"));
        Object term3274 = newInstance(Class.forName("java.lang.Object"));
        Object term3275 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3276 = (Object[]) newArray("java.lang.Object", 0);
        Object term3277 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3366 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term3268, term3268.getClass(), "sequenceNumber", -1685132342);
        setField(term3268, term3268.getClass(), "mock", term3270);
        setField(term3268, term3268.getClass(), "method", null);
        setElement(term3271, 0, term3272);
        setElement(term3271, 1, term3273);
        setElement(term3271, 2, term3274);
        setElement(term3271, 3, term3275);
        setField(term3268, term3268.getClass(), "arguments", term3271);
        setField(term3268, term3268.getClass(), "rawArguments", term3276);
        setField(term3277, term3277.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor5.newInstance(Unknown Source)");
        setField(term3268, term3268.getClass(), "location", term3277);
        setBooleanField(term3268, term3268.getClass(), "verified", true);
        setBooleanField(term3268, term3268.getClass(), "verifiedInOrder", false);
        setField(term3268, term3268.getClass(), "realMethod", null);
        setField(term3366, term3366.getClass(), "stubbedAt", null);
        setField(term3268, term3268.getClass(), "stubInfo", term3366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term3268;
        callMethod(klass, "captureArgumentsFrom", argTypes, term3152, args);
    }

};


