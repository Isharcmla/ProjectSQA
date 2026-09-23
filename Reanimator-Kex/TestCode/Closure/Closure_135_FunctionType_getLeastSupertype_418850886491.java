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

public class FunctionType_getLeastSupertype_418850886491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350149;
     Object term350619;

    public FunctionType_getLeastSupertype_418850886491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term351835 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term351834 = ((Class) term351835).getDeclaredField((String) "ORDINARY");
        ((Field) term351834).setAccessible(true);
        Object enum640 = ((Field) term351834).get((Object) null);
        term350149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term350407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term350511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term350149, term350149.getClass(), "kind", enum640);
        setField(term350149, term350149.getClass(), "typeOfThis", term350407);
        setField(term350149, term350149.getClass(), "registry", term350511);
        Class<? extends Object> term352126 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term352125 = ((Class) term352126).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term352125).setAccessible(true);
        Object enum641 = ((Field) term352125).get((Object) null);
        term350619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term350873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term350619, term350619.getClass(), "kind", enum641);
        setField(term350619, term350619.getClass(), "typeOfThis", term350873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term350619;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term350149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


