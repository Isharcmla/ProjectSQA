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

public class FunctionType_getGreatestSubtype_679591709334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229573;
     Object term230355;

    public FunctionType_getGreatestSubtype_679591709334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232189 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232188 = ((Class) term232189).getDeclaredField((String) "INTERFACE");
        ((Field) term232188).setAccessible(true);
        Object enum432 = ((Field) term232188).get((Object) null);
        term229573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term230141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term230245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term229573, term229573.getClass(), "kind", enum432);
        setField(term229573, term229573.getClass(), "typeOfThis", term230141);
        setField(term229573, term229573.getClass(), "registry", term230245);
        Class<? extends Object> term232483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232482 = ((Class) term232483).getDeclaredField((String) "INTERFACE");
        ((Field) term232482).setAccessible(true);
        Object enum433 = ((Field) term232482).get((Object) null);
        term230355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term230539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term230355, term230355.getClass(), "kind", enum433);
        setField(term230355, term230355.getClass(), "typeOfThis", term230539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term230355;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term229573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


