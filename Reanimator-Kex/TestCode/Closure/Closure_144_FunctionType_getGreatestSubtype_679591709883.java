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

public class FunctionType_getGreatestSubtype_679591709883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062121;
     Object term1062883;

    public FunctionType_getGreatestSubtype_679591709883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1064285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1064284 = ((Class) term1064285).getDeclaredField((String) "ORDINARY");
        ((Field) term1064284).setAccessible(true);
        Object enum1921 = ((Field) term1064284).get((Object) null);
        term1062121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1062673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1062773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1062121, term1062121.getClass(), "kind", enum1921);
        setField(term1062673, term1062673.getClass(), "kind", enum1921);
        setField(term1062673, term1062673.getClass(), "typeOfThis", term1062773);
        setField(term1062121, term1062121.getClass(), "typeOfThis", term1062673);
        Class<? extends Object> term1064576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1064575 = ((Class) term1064576).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1064575).setAccessible(true);
        Object enum1922 = ((Field) term1064575).get((Object) null);
        term1062883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1063205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1063305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1062883, term1062883.getClass(), "kind", enum1921);
        setField(term1063205, term1063205.getClass(), "kind", enum1921);
        setField(term1063305, term1063305.getClass(), "kind", enum1922);
        setField(term1063305, term1063305.getClass(), "typeOfThis", null);
        setField(term1063205, term1063205.getClass(), "typeOfThis", term1063305);
        setField(term1062883, term1062883.getClass(), "typeOfThis", term1063205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1062883;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1062121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


