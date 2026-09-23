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

public class FunctionType_isSubtype_2101002158701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740231;
     Object term740885;

    public FunctionType_isSubtype_2101002158701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term741780 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term741779 = ((Class) term741780).getDeclaredField((String) "INTERFACE");
        ((Field) term741779).setAccessible(true);
        Object enum1332 = ((Field) term741779).get((Object) null);
        term740231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term740775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term740231, term740231.getClass(), "kind", enum1332);
        setField(term740231, term740231.getClass(), "typeOfThis", term740775);
        term740885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term740885, term740885.getClass(), "kind", enum1332);
        setField(term740885, term740885.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term740885;
        try {
            callMethod(klass, "isSubtype", argTypes, term740231, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


