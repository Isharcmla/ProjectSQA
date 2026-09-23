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

public class FunctionType_getImplementedInterfaces_281458626481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337559;

    public FunctionType_getImplementedInterfaces_281458626481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term339910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339909 = ((Class) term339910).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term339909).setAccessible(true);
        Object enum621 = ((Field) term339909).get((Object) null);
        term337559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term337825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term337923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term337559, term337559.getClass(), "kind", enum621);
        setField(term337825, term337825.getClass(), "implicitPrototype", term337923);
        setField(term337559, term337559.getClass(), "prototype", term337825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term337559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


