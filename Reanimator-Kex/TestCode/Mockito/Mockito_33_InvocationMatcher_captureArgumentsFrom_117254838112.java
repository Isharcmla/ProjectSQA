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
     Object term3137;
     Object term3252;

    public InvocationMatcher_captureArgumentsFrom_117254838112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3248 = new ArrayList();
        ((ArrayList) term3248).add((Object)null);
        ((ArrayList) term3248).add((Object)null);
        ((ArrayList) term3248).add((Object)null);
        ((ArrayList) term3248).add((Object)null);
        term3137 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term3138 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term3140 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3141 = (Object[]) newArray("java.lang.Object", 1);
        Object term3142 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3143 = (Object[]) newArray("java.lang.Object", 5);
        Object term3144 = newInstance(Class.forName("java.lang.Object"));
        Object term3145 = newInstance(Class.forName("java.lang.Object"));
        Object term3146 = newInstance(Class.forName("java.lang.Object"));
        Object term3147 = newInstance(Class.forName("java.lang.Object"));
        Object term3148 = newInstance(Class.forName("java.lang.Object"));
        Object term3149 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3247 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term3138, term3138.getClass(), "sequenceNumber", 597278769);
        setField(term3138, term3138.getClass(), "mock", term3140);
        setField(term3138, term3138.getClass(), "method", null);
        setElement(term3141, 0, term3142);
        setField(term3138, term3138.getClass(), "arguments", term3141);
        setElement(term3143, 0, term3144);
        setElement(term3143, 1, term3145);
        setElement(term3143, 2, term3146);
        setElement(term3143, 3, term3147);
        setElement(term3143, 4, term3148);
        setField(term3138, term3138.getClass(), "rawArguments", term3143);
        setField(term3149, term3149.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term3138, term3138.getClass(), "location", term3149);
        setBooleanField(term3138, term3138.getClass(), "verified", true);
        setField(term3138, term3138.getClass(), "realMethod", null);
        setField(term3247, term3247.getClass(), "stubbedAt", null);
        setField(term3138, term3138.getClass(), "stubInfo", term3247);
        setField(term3137, term3137.getClass(), "invocation", term3138);
        setField(term3137, term3137.getClass(), "matchers", term3248);
        term3252 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term3254 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3255 = (Object[]) newArray("java.lang.Object", 4);
        Object term3256 = newInstance(Class.forName("java.lang.Object"));
        Object term3257 = newInstance(Class.forName("java.lang.Object"));
        Object term3258 = newInstance(Class.forName("java.lang.Object"));
        Object term3259 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3260 = (Object[]) newArray("java.lang.Object", 0);
        Object term3261 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3349 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term3252, term3252.getClass(), "sequenceNumber", -1685132342);
        setField(term3252, term3252.getClass(), "mock", term3254);
        setField(term3252, term3252.getClass(), "method", null);
        setElement(term3255, 0, term3256);
        setElement(term3255, 1, term3257);
        setElement(term3255, 2, term3258);
        setElement(term3255, 3, term3259);
        setField(term3252, term3252.getClass(), "arguments", term3255);
        setField(term3252, term3252.getClass(), "rawArguments", term3260);
        setField(term3261, term3261.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor5.newInstance(Unknown Source)");
        setField(term3252, term3252.getClass(), "location", term3261);
        setBooleanField(term3252, term3252.getClass(), "verified", true);
        setField(term3252, term3252.getClass(), "realMethod", null);
        setField(term3349, term3349.getClass(), "stubbedAt", null);
        setField(term3252, term3252.getClass(), "stubInfo", term3349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term3252;
        callMethod(klass, "captureArgumentsFrom", argTypes, term3137, args);
    }

};


