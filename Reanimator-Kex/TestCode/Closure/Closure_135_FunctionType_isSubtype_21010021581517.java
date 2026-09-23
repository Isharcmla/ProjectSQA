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

public class FunctionType_isSubtype_21010021581517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999475;
     Object term2000081;

    public FunctionType_isSubtype_21010021581517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2003607 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2003606 = ((Class) term2003607).getDeclaredField((String) "ORDINARY");
        ((Field) term2003606).setAccessible(true);
        Object enum3729 = ((Field) term2003606).get((Object) null);
        Class<? extends Object> term2003898 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2003897 = ((Class) term2003898).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2003897).setAccessible(true);
        Object enum3730 = ((Field) term2003897).get((Object) null);
        term1999475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1999731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1999973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1999475, term1999475.getClass(), "kind", enum3729);
        setField(term1999731, term1999731.getClass(), "kind", enum3730);
        setField(term1999731, term1999731.getClass(), "call", term1999973);
        setField(term1999475, term1999475.getClass(), "typeOfThis", term1999731);
        term2000081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2000263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2000431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2000081, term2000081.getClass(), "kind", enum3729);
        setField(term2000263, term2000263.getClass(), "kind", enum3730);
        setField(term2000263, term2000263.getClass(), "call", term2000431);
        setField(term2000081, term2000081.getClass(), "typeOfThis", term2000263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2000081;
        try {
            callMethod(klass, "isSubtype", argTypes, term1999475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


