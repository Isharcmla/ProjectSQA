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

public class FunctionType_getGreatestSubtype_679591709615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599289;
     Object term600057;

    public FunctionType_getGreatestSubtype_679591709615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term601583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term601582 = ((Class) term601583).getDeclaredField((String) "ORDINARY");
        ((Field) term601582).setAccessible(true);
        Object enum1087 = ((Field) term601582).get((Object) null);
        Class<? extends Object> term601874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term601873 = ((Class) term601874).getDeclaredField((String) "INTERFACE");
        ((Field) term601873).setAccessible(true);
        Object enum1088 = ((Field) term601873).get((Object) null);
        term599289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term599843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term599947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term599289, term599289.getClass(), "kind", enum1087);
        setField(term599843, term599843.getClass(), "kind", enum1088);
        setField(term599289, term599289.getClass(), "typeOfThis", term599843);
        setField(term599289, term599289.getClass(), "registry", term599947);
        Class<? extends Object> term602168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term602167 = ((Class) term602168).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term602167).setAccessible(true);
        Object enum1089 = ((Field) term602167).get((Object) null);
        term600057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term600231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term600057, term600057.getClass(), "kind", enum1088);
        setField(term600231, term600231.getClass(), "kind", enum1089);
        setField(term600057, term600057.getClass(), "typeOfThis", term600231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term600057;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term599289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


