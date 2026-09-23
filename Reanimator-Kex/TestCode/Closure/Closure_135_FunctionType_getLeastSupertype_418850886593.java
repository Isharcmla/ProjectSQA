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

public class FunctionType_getLeastSupertype_418850886593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493591;
     Object term493951;

    public FunctionType_getLeastSupertype_418850886593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term495027 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495026 = ((Class) term495027).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term495026).setAccessible(true);
        Object enum913 = ((Field) term495026).get((Object) null);
        term493591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term493843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term493591, term493591.getClass(), "kind", enum913);
        setField(term493591, term493591.getClass(), "registry", term493843);
        Class<? extends Object> term495327 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495326 = ((Class) term495327).getDeclaredField((String) "INTERFACE");
        ((Field) term495326).setAccessible(true);
        Object enum914 = ((Field) term495326).get((Object) null);
        term493951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term493951, term493951.getClass(), "kind", enum914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term493951;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term493591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


