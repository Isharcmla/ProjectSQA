package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JSType_safeResolve_2136838325253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45129;

    public JSType_safeResolve_2136838325253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45373 = newInstance(Class.forName("java.lang.Object"));
        HashMap term45283 = new HashMap();
        ((HashMap) term45283).put((Object)null, (Object)null);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        ((HashMap) term45283).put(term45373, term45373);
        term45129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term45235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setBooleanField(term45129, term45129.getClass(), "resolved", false);
        setField(term45129, term45129.getClass(), "resolveResult", term45235);
        setField(term45129, term45129.getClass(), "implicitPrototype", null);
        setField(term45129, term45129.getClass(), "properties", term45283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term45129;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "safeResolve", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


