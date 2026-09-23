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

public class FunctionType_getGreatestSubtype_679591709778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877164;
     Object term877828;

    public FunctionType_getGreatestSubtype_679591709778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term881256 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term881255 = ((Class) term881256).getDeclaredField((String) "ORDINARY");
        ((Field) term881255).setAccessible(true);
        Object enum1590 = ((Field) term881255).get((Object) null);
        term877164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term877718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term877164, term877164.getClass(), "kind", enum1590);
        setField(term877718, term877718.getClass(), "kind", enum1590);
        setField(term877164, term877164.getClass(), "typeOfThis", term877718);
        Class<? extends Object> term881547 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term881546 = ((Class) term881547).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term881546).setAccessible(true);
        Object enum1591 = ((Field) term881546).get((Object) null);
        Class<? extends Object> term881847 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term881846 = ((Class) term881847).getDeclaredField((String) "INTERFACE");
        ((Field) term881846).setAccessible(true);
        Object enum1592 = ((Field) term881846).get((Object) null);
        term877828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term878010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term877828, term877828.getClass(), "kind", enum1591);
        setField(term878010, term878010.getClass(), "kind", enum1592);
        setField(term877828, term877828.getClass(), "typeOfThis", term878010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term877828;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term877164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


