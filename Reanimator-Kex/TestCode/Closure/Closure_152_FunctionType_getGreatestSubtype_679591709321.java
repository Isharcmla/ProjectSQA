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

public class FunctionType_getGreatestSubtype_679591709321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210103;
     Object term210465;

    public FunctionType_getGreatestSubtype_679591709321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211543 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211542 = ((Class) term211543).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term211542).setAccessible(true);
        Object enum373 = ((Field) term211542).get((Object) null);
        term210103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term210103, term210103.getClass(), "kind", enum373);
        setField(term210103, term210103.getClass(), "registry", term210355);
        Class<? extends Object> term211843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211842 = ((Class) term211843).getDeclaredField((String) "ORDINARY");
        ((Field) term211842).setAccessible(true);
        Object enum374 = ((Field) term211842).get((Object) null);
        term210465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term210465, term210465.getClass(), "kind", enum374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term210465;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term210103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


