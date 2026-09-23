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

public class FunctionType_isSubtype_21010021581355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1724977;
     Object term1725529;

    public FunctionType_isSubtype_21010021581355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1727105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1727104 = ((Class) term1727105).getDeclaredField((String) "ORDINARY");
        ((Field) term1727104).setAccessible(true);
        Object enum3220 = ((Field) term1727104).get((Object) null);
        term1724977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1725225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1725325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1725421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1724977, term1724977.getClass(), "kind", enum3220);
        setField(term1725225, term1725225.getClass(), "kind", enum3220);
        setField(term1725325, term1725325.getClass(), "kind", enum3220);
        setField(term1725325, term1725325.getClass(), "typeOfThis", term1725421);
        setField(term1725225, term1725225.getClass(), "typeOfThis", term1725325);
        setField(term1724977, term1724977.getClass(), "typeOfThis", term1725225);
        Class<? extends Object> term1727396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1727395 = ((Class) term1727396).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1727395).setAccessible(true);
        Object enum3221 = ((Field) term1727395).get((Object) null);
        term1725529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1725785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1725893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1725529, term1725529.getClass(), "kind", enum3221);
        setField(term1725785, term1725785.getClass(), "kind", enum3221);
        setField(term1725893, term1725893.getClass(), "kind", enum3221);
        setField(term1725893, term1725893.getClass(), "typeOfThis", null);
        setField(term1725785, term1725785.getClass(), "typeOfThis", term1725893);
        setField(term1725529, term1725529.getClass(), "typeOfThis", term1725785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1725529;
        try {
            callMethod(klass, "isSubtype", argTypes, term1724977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


