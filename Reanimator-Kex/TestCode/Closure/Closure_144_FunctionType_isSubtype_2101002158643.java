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

public class FunctionType_isSubtype_2101002158643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641458;
     Object term641814;

    public FunctionType_isSubtype_2101002158643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term642958 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term642957 = ((Class) term642958).getDeclaredField((String) "ORDINARY");
        ((Field) term642957).setAccessible(true);
        Object enum1155 = ((Field) term642957).get((Object) null);
        term641458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term641706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term641458, term641458.getClass(), "kind", enum1155);
        setField(term641458, term641458.getClass(), "typeOfThis", term641706);
        Class<? extends Object> term643249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term643248 = ((Class) term643249).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term643248).setAccessible(true);
        Object enum1156 = ((Field) term643248).get((Object) null);
        term641814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term641814, term641814.getClass(), "kind", enum1156);
        setField(term641814, term641814.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term641814;
        try {
            callMethod(klass, "isSubtype", argTypes, term641458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


