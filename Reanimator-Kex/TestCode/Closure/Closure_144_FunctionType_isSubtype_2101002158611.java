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

public class FunctionType_isSubtype_2101002158611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592059;
     Object term592711;

    public FunctionType_isSubtype_2101002158611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term594016 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term594015 = ((Class) term594016).getDeclaredField((String) "INTERFACE");
        ((Field) term594015).setAccessible(true);
        Object enum1076 = ((Field) term594015).get((Object) null);
        term592059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term592603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term592059, term592059.getClass(), "kind", enum1076);
        setField(term592603, term592603.getClass(), "kind", enum1076);
        setField(term592059, term592059.getClass(), "typeOfThis", term592603);
        Class<? extends Object> term594310 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term594309 = ((Class) term594310).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term594309).setAccessible(true);
        Object enum1077 = ((Field) term594309).get((Object) null);
        term592711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term593043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term592711, term592711.getClass(), "kind", enum1076);
        setField(term593043, term593043.getClass(), "kind", enum1077);
        setField(term592711, term592711.getClass(), "typeOfThis", term593043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term592711;
        try {
            callMethod(klass, "isSubtype", argTypes, term592059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


