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

public class FunctionType_isSubtype_2101002158917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1118329;
     Object term1118833;

    public FunctionType_isSubtype_2101002158917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1121750 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1121749 = ((Class) term1121750).getDeclaredField((String) "ORDINARY");
        ((Field) term1121749).setAccessible(true);
        Object enum2015 = ((Field) term1121749).get((Object) null);
        Class<? extends Object> term1122041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1122040 = ((Class) term1122041).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1122040).setAccessible(true);
        Object enum2016 = ((Field) term1122040).get((Object) null);
        term1118329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1118577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1118329, term1118329.getClass(), "kind", enum2015);
        setField(term1118577, term1118577.getClass(), "kind", enum2016);
        setField(term1118577, term1118577.getClass(), "typeOfThis", null);
        setField(term1118329, term1118329.getClass(), "typeOfThis", term1118577);
        term1118833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1119015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1119109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1118833, term1118833.getClass(), "kind", enum2015);
        setField(term1119015, term1119015.getClass(), "kind", enum2015);
        setField(term1119015, term1119015.getClass(), "typeOfThis", term1119109);
        setField(term1118833, term1118833.getClass(), "typeOfThis", term1119015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1118833;
        try {
            callMethod(klass, "isSubtype", argTypes, term1118329, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


