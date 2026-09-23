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

public class FunctionType_getGreatestSubtype_679591709647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652372;
     Object term652998;

    public FunctionType_getGreatestSubtype_679591709647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term654386 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term654385 = ((Class) term654386).getDeclaredField((String) "ORDINARY");
        ((Field) term654385).setAccessible(true);
        Object enum1005 = ((Field) term654385).get((Object) null);
        Class<? extends Object> term654677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term654676 = ((Class) term654677).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term654676).setAccessible(true);
        Object enum1006 = ((Field) term654676).get((Object) null);
        term652372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term652630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term652740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term652372, term652372.getClass(), "kind", enum1005);
        setField(term652630, term652630.getClass(), "kind", enum1005);
        setField(term652740, term652740.getClass(), "kind", enum1006);
        setField(term652630, term652630.getClass(), "typeOfThis", term652740);
        setField(term652372, term652372.getClass(), "typeOfThis", term652630);
        term652998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term653172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term653272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term652998, term652998.getClass(), "kind", enum1006);
        setField(term653172, term653172.getClass(), "kind", enum1006);
        setField(term653172, term653172.getClass(), "typeOfThis", term653272);
        setField(term652998, term652998.getClass(), "typeOfThis", term653172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term652998;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term652372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


