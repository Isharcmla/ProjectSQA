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

public class FunctionType_getGreatestSubtype_679591709591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564324;
     Object term565030;

    public FunctionType_getGreatestSubtype_679591709591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term566419 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term566418 = ((Class) term566419).getDeclaredField((String) "ORDINARY");
        ((Field) term566418).setAccessible(true);
        Object enum1027 = ((Field) term566418).get((Object) null);
        Class<? extends Object> term566710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term566709 = ((Class) term566710).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term566709).setAccessible(true);
        Object enum1028 = ((Field) term566709).get((Object) null);
        term564324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term564572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term565154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term565278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term564324, term564324.getClass(), "kind", enum1027);
        setField(term564572, term564572.getClass(), "kind", enum1027);
        setField(term565154, term565154.getClass(), "kind", enum1028);
        setField(term565154, term565154.getClass(), "typeOfThis", term565278);
        setField(term564572, term564572.getClass(), "typeOfThis", term565154);
        setField(term564324, term564324.getClass(), "typeOfThis", term564572);
        term565030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term565030, term565030.getClass(), "kind", enum1027);
        setField(term565030, term565030.getClass(), "typeOfThis", term565154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term565030;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term564324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


