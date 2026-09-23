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

public class FunctionType_isSubtype_2101002158951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045392;
     Object term1046044;

    public FunctionType_isSubtype_2101002158951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1047368 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1047367 = ((Class) term1047368).getDeclaredField((String) "ORDINARY");
        ((Field) term1047367).setAccessible(true);
        Object enum1953 = ((Field) term1047367).get((Object) null);
        Class<? extends Object> term1047659 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1047658 = ((Class) term1047659).getDeclaredField((String) "INTERFACE");
        ((Field) term1047658).setAccessible(true);
        Object enum1954 = ((Field) term1047658).get((Object) null);
        term1045392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1045936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1045392, term1045392.getClass(), "kind", enum1953);
        setField(term1045936, term1045936.getClass(), "kind", enum1954);
        setField(term1045392, term1045392.getClass(), "typeOfThis", term1045936);
        term1046044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1046374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1046044, term1046044.getClass(), "kind", enum1953);
        setField(term1046044, term1046044.getClass(), "typeOfThis", term1046374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1046044;
        try {
            callMethod(klass, "isSubtype", argTypes, term1045392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


