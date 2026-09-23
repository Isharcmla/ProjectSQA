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
import java.lang.String;
import java.lang.Object;

public class FunctionType_supAndInfHelper_1915298734387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352892;
     Object term353244;

    public FunctionType_supAndInfHelper_1915298734387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term354363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term354362 = ((Class) term354363).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term354362).setAccessible(true);
        Object enum601 = ((Field) term354362).get((Object) null);
        term352892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term353144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term352892, term352892.getClass(), "unknown", false);
        setField(term352892, term352892.getClass(), "kind", enum601);
        setField(term352892, term352892.getClass(), "registry", term353144);
        Class<? extends Object> term354663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term354662 = ((Class) term354663).getDeclaredField((String) "ORDINARY");
        ((Field) term354662).setAccessible(true);
        Object enum602 = ((Field) term354662).get((Object) null);
        term353244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term353244, term353244.getClass(), "unknown", false);
        setField(term353244, term353244.getClass(), "kind", enum602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term353244;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term352892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


