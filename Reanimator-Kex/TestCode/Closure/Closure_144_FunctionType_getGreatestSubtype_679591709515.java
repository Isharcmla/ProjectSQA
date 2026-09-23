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

public class FunctionType_getGreatestSubtype_679591709515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446939;
     Object term447603;

    public FunctionType_getGreatestSubtype_679591709515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term448749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term448748 = ((Class) term448749).getDeclaredField((String) "ORDINARY");
        ((Field) term448748).setAccessible(true);
        Object enum813 = ((Field) term448748).get((Object) null);
        Class<? extends Object> term449040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449039 = ((Class) term449040).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term449039).setAccessible(true);
        Object enum814 = ((Field) term449039).get((Object) null);
        term446939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term447493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term446939, term446939.getClass(), "kind", enum813);
        setField(term447493, term447493.getClass(), "kind", enum814);
        setField(term446939, term446939.getClass(), "typeOfThis", term447493);
        term447603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term447777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term447603, term447603.getClass(), "kind", enum814);
        setField(term447603, term447603.getClass(), "typeOfThis", term447777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term447603;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term446939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


