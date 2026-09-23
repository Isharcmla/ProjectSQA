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

public class FunctionType_getGreatestSubtype_679591709964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068601;
     Object term1069071;

    public FunctionType_getGreatestSubtype_679591709964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1071405 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1071404 = ((Class) term1071405).getDeclaredField((String) "ORDINARY");
        ((Field) term1071404).setAccessible(true);
        Object enum1995 = ((Field) term1071404).get((Object) null);
        term1068601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1068857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1068963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1068601, term1068601.getClass(), "kind", enum1995);
        setField(term1068857, term1068857.getClass(), "kind", enum1995);
        setField(term1068857, term1068857.getClass(), "typeOfThis", term1068963);
        setField(term1068601, term1068601.getClass(), "typeOfThis", term1068857);
        Class<? extends Object> term1071696 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1071695 = ((Class) term1071696).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1071695).setAccessible(true);
        Object enum1996 = ((Field) term1071695).get((Object) null);
        term1069071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1069245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1069493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1069071, term1069071.getClass(), "kind", enum1995);
        setField(term1069245, term1069245.getClass(), "kind", enum1996);
        setField(term1069245, term1069245.getClass(), "typeOfThis", term1069493);
        setField(term1069071, term1069071.getClass(), "typeOfThis", term1069245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1069071;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1068601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


