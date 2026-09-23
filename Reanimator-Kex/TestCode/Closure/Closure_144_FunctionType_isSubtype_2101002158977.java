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

public class FunctionType_isSubtype_2101002158977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1216363;
     Object term1217115;

    public FunctionType_isSubtype_2101002158977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1220841 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1220840 = ((Class) term1220841).getDeclaredField((String) "ORDINARY");
        ((Field) term1220840).setAccessible(true);
        Object enum2189 = ((Field) term1220840).get((Object) null);
        term1216363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1216907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1217007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1216363, term1216363.getClass(), "kind", enum2189);
        setField(term1216907, term1216907.getClass(), "kind", enum2189);
        setField(term1216907, term1216907.getClass(), "typeOfThis", term1217007);
        setField(term1216363, term1216363.getClass(), "typeOfThis", term1216907);
        term1217115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1217445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1217115, term1217115.getClass(), "kind", enum2189);
        setField(term1217445, term1217445.getClass(), "kind", enum2189);
        setField(term1217445, term1217445.getClass(), "typeOfThis", null);
        setField(term1217115, term1217115.getClass(), "typeOfThis", term1217445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1217115;
        try {
            callMethod(klass, "isSubtype", argTypes, term1216363, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


