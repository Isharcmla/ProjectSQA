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

public class FunctionType_isSubtype_21010021581646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218587;
     Object term2219145;

    public FunctionType_isSubtype_21010021581646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2221008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2221007 = ((Class) term2221008).getDeclaredField((String) "ORDINARY");
        ((Field) term2221007).setAccessible(true);
        Object enum4139 = ((Field) term2221007).get((Object) null);
        term2218587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2218843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2218943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2219037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2218587, term2218587.getClass(), "kind", enum4139);
        setField(term2218843, term2218843.getClass(), "kind", enum4139);
        setField(term2218843, term2218843.getClass(), "typeOfThis", term2218943);
        setField(term2218843, term2218843.getClass(), "call", term2219037);
        setField(term2218587, term2218587.getClass(), "typeOfThis", term2218843);
        Class<? extends Object> term2221299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2221298 = ((Class) term2221299).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2221298).setAccessible(true);
        Object enum4140 = ((Field) term2221298).get((Object) null);
        term2219145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2219327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2219575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term2219669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2219145, term2219145.getClass(), "kind", enum4139);
        setField(term2219327, term2219327.getClass(), "kind", enum4140);
        setField(term2219327, term2219327.getClass(), "typeOfThis", term2219575);
        setField(term2219327, term2219327.getClass(), "call", term2219669);
        setField(term2219145, term2219145.getClass(), "typeOfThis", term2219327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2219145;
        try {
            callMethod(klass, "isSubtype", argTypes, term2218587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


