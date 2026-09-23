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

public class FunctionType_isSubtype_2101002158945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033052;
     Object term1033704;

    public FunctionType_isSubtype_2101002158945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1035180 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1035179 = ((Class) term1035180).getDeclaredField((String) "INTERFACE");
        ((Field) term1035179).setAccessible(true);
        Object enum1929 = ((Field) term1035179).get((Object) null);
        Class<? extends Object> term1035474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1035473 = ((Class) term1035474).getDeclaredField((String) "INTERFACE");
        ((Field) term1035473).setAccessible(true);
        Object enum1930 = ((Field) term1035473).get((Object) null);
        term1033052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1033596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1033052, term1033052.getClass(), "kind", enum1929);
        setField(term1033596, term1033596.getClass(), "kind", enum1930);
        setField(term1033052, term1033052.getClass(), "typeOfThis", term1033596);
        Class<? extends Object> term1035768 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1035767 = ((Class) term1035768).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1035767).setAccessible(true);
        Object enum1931 = ((Field) term1035767).get((Object) null);
        term1033704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1033886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1033704, term1033704.getClass(), "kind", enum1931);
        setField(term1033886, term1033886.getClass(), "kind", enum1931);
        setField(term1033704, term1033704.getClass(), "typeOfThis", term1033886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1033704;
        try {
            callMethod(klass, "isSubtype", argTypes, term1033052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


