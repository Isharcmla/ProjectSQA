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

public class FunctionType_getGreatestSubtype_679591709309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200294;
     Object term200848;

    public FunctionType_getGreatestSubtype_679591709309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201841 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term201840 = ((Class) term201841).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term201840).setAccessible(true);
        Object enum358 = ((Field) term201840).get((Object) null);
        term200294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term200294, term200294.getClass(), "kind", enum358);
        Class<? extends Object> term202141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term202140 = ((Class) term202141).getDeclaredField((String) "INTERFACE");
        ((Field) term202140).setAccessible(true);
        Object enum359 = ((Field) term202140).get((Object) null);
        term200848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term200848, term200848.getClass(), "kind", enum359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term200848;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term200294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


