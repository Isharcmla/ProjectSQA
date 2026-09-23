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

public class FunctionType_getImplementedInterfaces_281458626129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69443;

    public FunctionType_getImplementedInterfaces_281458626129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70436 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term70435 = ((Class) term70436).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term70435).setAccessible(true);
        Object enum168 = ((Field) term70435).get((Object) null);
        term69443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term69817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term69443, term69443.getClass(), "kind", enum168);
        setField(term69709, term69709.getClass(), "implicitPrototypeFallback", term69817);
        setField(term69443, term69443.getClass(), "prototype", term69709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term69443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


