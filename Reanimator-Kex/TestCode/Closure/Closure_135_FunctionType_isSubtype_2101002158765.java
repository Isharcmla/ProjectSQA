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

public class FunctionType_isSubtype_2101002158765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740196;
     Object term740848;

    public FunctionType_isSubtype_2101002158765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term742189 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term742188 = ((Class) term742189).getDeclaredField((String) "INTERFACE");
        ((Field) term742188).setAccessible(true);
        Object enum1380 = ((Field) term742188).get((Object) null);
        Class<? extends Object> term742483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term742482 = ((Class) term742483).getDeclaredField((String) "INTERFACE");
        ((Field) term742482).setAccessible(true);
        Object enum1381 = ((Field) term742482).get((Object) null);
        term740196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term740740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term740196, term740196.getClass(), "kind", enum1380);
        setField(term740740, term740740.getClass(), "kind", enum1381);
        setField(term740196, term740196.getClass(), "typeOfThis", term740740);
        term740848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term741178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term740848, term740848.getClass(), "kind", enum1380);
        setField(term741178, term741178.getClass(), "kind", enum1381);
        setField(term740848, term740848.getClass(), "typeOfThis", term741178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term740848;
        try {
            callMethod(klass, "isSubtype", argTypes, term740196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


