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

public class FunctionType_isSubtype_21010021581052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357459;
     Object term1358223;

    public FunctionType_isSubtype_21010021581052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1361577 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1361576 = ((Class) term1361577).getDeclaredField((String) "ORDINARY");
        ((Field) term1361576).setAccessible(true);
        Object enum2436 = ((Field) term1361576).get((Object) null);
        term1357459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1358003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1358113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1357459, term1357459.getClass(), "kind", enum2436);
        setField(term1358003, term1358003.getClass(), "kind", enum2436);
        setField(term1358003, term1358003.getClass(), "typeOfThis", term1358113);
        setField(term1357459, term1357459.getClass(), "typeOfThis", term1358003);
        Class<? extends Object> term1361868 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1361867 = ((Class) term1361868).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1361867).setAccessible(true);
        Object enum2437 = ((Field) term1361867).get((Object) null);
        term1358223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1358555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1358651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1358223, term1358223.getClass(), "kind", enum2436);
        setField(term1358555, term1358555.getClass(), "kind", enum2437);
        setField(term1358555, term1358555.getClass(), "typeOfThis", term1358651);
        setField(term1358223, term1358223.getClass(), "typeOfThis", term1358555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1358223;
        try {
            callMethod(klass, "isSubtype", argTypes, term1357459, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


