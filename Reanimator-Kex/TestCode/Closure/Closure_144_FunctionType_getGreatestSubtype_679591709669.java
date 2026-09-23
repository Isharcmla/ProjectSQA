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

public class FunctionType_getGreatestSubtype_679591709669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682193;
     Object term683016;

    public FunctionType_getGreatestSubtype_679591709669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term684130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term684129 = ((Class) term684130).getDeclaredField((String) "ORDINARY");
        ((Field) term684129).setAccessible(true);
        Object enum1230 = ((Field) term684129).get((Object) null);
        Class<? extends Object> term684421 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term684420 = ((Class) term684421).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term684420).setAccessible(true);
        Object enum1231 = ((Field) term684420).get((Object) null);
        term682193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term683016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term683145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term682961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term682193, term682193.getClass(), "kind", enum1230);
        setField(term683016, term683016.getClass(), "kind", enum1231);
        setField(term683016, term683016.getClass(), "typeOfThis", term683145);
        setField(term682193, term682193.getClass(), "typeOfThis", term683016);
        setField(term682193, term682193.getClass(), "registry", term682961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term683016;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term682193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


