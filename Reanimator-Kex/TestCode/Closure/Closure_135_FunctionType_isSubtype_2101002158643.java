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
     Object term560361;
     Object term560817;

    public FunctionType_isSubtype_2101002158643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term563304 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term563303 = ((Class) term563304).getDeclaredField((String) "ORDINARY");
        ((Field) term563303).setAccessible(true);
        Object enum1040 = ((Field) term563303).get((Object) null);
        term560361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term560609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term560709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term560361, term560361.getClass(), "kind", enum1040);
        setField(term560609, term560609.getClass(), "kind", enum1040);
        setField(term560609, term560609.getClass(), "typeOfThis", term560709);
        setField(term560361, term560361.getClass(), "typeOfThis", term560609);
        Class<? extends Object> term563595 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term563594 = ((Class) term563595).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term563594).setAccessible(true);
        Object enum1041 = ((Field) term563594).get((Object) null);
        term560817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term560991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term560817, term560817.getClass(), "kind", enum1040);
        setField(term560991, term560991.getClass(), "kind", enum1041);
        setField(term560991, term560991.getClass(), "typeOfThis", null);
        setField(term560817, term560817.getClass(), "typeOfThis", term560991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term560817;
        try {
            callMethod(klass, "isSubtype", argTypes, term560361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


