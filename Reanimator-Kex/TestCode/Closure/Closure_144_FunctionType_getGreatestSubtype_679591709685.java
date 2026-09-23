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

public class FunctionType_getGreatestSubtype_679591709685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712151;
     Object term712775;

    public FunctionType_getGreatestSubtype_679591709685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term714161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714160 = ((Class) term714161).getDeclaredField((String) "ORDINARY");
        ((Field) term714160).setAccessible(true);
        Object enum1282 = ((Field) term714160).get((Object) null);
        Class<? extends Object> term714452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714451 = ((Class) term714452).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term714451).setAccessible(true);
        Object enum1283 = ((Field) term714451).get((Object) null);
        term712151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term712409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term712517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term712151, term712151.getClass(), "kind", enum1282);
        setField(term712409, term712409.getClass(), "kind", enum1282);
        setField(term712517, term712517.getClass(), "kind", enum1283);
        setField(term712409, term712409.getClass(), "typeOfThis", term712517);
        setField(term712151, term712151.getClass(), "typeOfThis", term712409);
        term712775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term712949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term713049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term712775, term712775.getClass(), "kind", enum1283);
        setField(term712949, term712949.getClass(), "kind", enum1283);
        setField(term712949, term712949.getClass(), "typeOfThis", term713049);
        setField(term712775, term712775.getClass(), "typeOfThis", term712949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term712775;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term712151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


