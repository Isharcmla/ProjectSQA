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

public class FunctionType_isSubtype_21010021581021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1157891;
     Object term1158543;

    public FunctionType_isSubtype_21010021581021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1159651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1159650 = ((Class) term1159651).getDeclaredField((String) "ORDINARY");
        ((Field) term1159650).setAccessible(true);
        Object enum2158 = ((Field) term1159650).get((Object) null);
        term1157891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1158435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1157891, term1157891.getClass(), "kind", enum2158);
        setField(term1157891, term1157891.getClass(), "typeOfThis", term1158435);
        Class<? extends Object> term1159942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1159941 = ((Class) term1159942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1159941).setAccessible(true);
        Object enum2159 = ((Field) term1159941).get((Object) null);
        term1158543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1158717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1158543, term1158543.getClass(), "kind", enum2159);
        setField(term1158543, term1158543.getClass(), "typeOfThis", term1158717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1158543;
        try {
            callMethod(klass, "isSubtype", argTypes, term1157891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


