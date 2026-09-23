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

public class FunctionType_getGreatestSubtype_679591709832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846669;
     Object term847029;

    public FunctionType_getGreatestSubtype_679591709832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term849894 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term849893 = ((Class) term849894).getDeclaredField((String) "INTERFACE");
        ((Field) term849893).setAccessible(true);
        Object enum1582 = ((Field) term849893).get((Object) null);
        term846669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term846921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term846669, term846669.getClass(), "kind", enum1582);
        setField(term846669, term846669.getClass(), "registry", term846921);
        Class<? extends Object> term850188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term850187 = ((Class) term850188).getDeclaredField((String) "INTERFACE");
        ((Field) term850187).setAccessible(true);
        Object enum1583 = ((Field) term850187).get((Object) null);
        term847029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term847029, term847029.getClass(), "kind", enum1583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term847029;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term846669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


