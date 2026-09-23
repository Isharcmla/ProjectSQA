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

public class FunctionType_isSubtype_2101002158853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881861;
     Object term882225;

    public FunctionType_isSubtype_2101002158853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term883166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term883165 = ((Class) term883166).getDeclaredField((String) "ORDINARY");
        ((Field) term883165).setAccessible(true);
        Object enum1645 = ((Field) term883165).get((Object) null);
        term881861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term882117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term881861, term881861.getClass(), "kind", enum1645);
        setField(term882117, term882117.getClass(), "kind", enum1645);
        setField(term882117, term882117.getClass(), "typeOfThis", null);
        setField(term881861, term881861.getClass(), "typeOfThis", term882117);
        term882225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term882407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term882507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term882225, term882225.getClass(), "kind", enum1645);
        setField(term882407, term882407.getClass(), "kind", enum1645);
        setField(term882407, term882407.getClass(), "typeOfThis", term882507);
        setField(term882225, term882225.getClass(), "typeOfThis", term882407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term882225;
        try {
            callMethod(klass, "isSubtype", argTypes, term881861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


