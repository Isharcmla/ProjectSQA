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

public class FunctionType_isSubtype_2101002158223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106577;
     Object term106833;

    public FunctionType_isSubtype_2101002158223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107444 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term107443 = ((Class) term107444).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term107443).setAccessible(true);
        Object enum216 = ((Field) term107443).get((Object) null);
        term106577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106577, term106577.getClass(), "kind", enum216);
        term106833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term106833;
        try {
            callMethod(klass, "isSubtype", argTypes, term106577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


