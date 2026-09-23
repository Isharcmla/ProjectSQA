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

public class FunctionType_isSubtype_2101002158351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246599;
     Object term247151;

    public FunctionType_isSubtype_2101002158351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term248121 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term248120 = ((Class) term248121).getDeclaredField((String) "ORDINARY");
        ((Field) term248120).setAccessible(true);
        Object enum462 = ((Field) term248120).get((Object) null);
        term246599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term246599, term246599.getClass(), "kind", enum462);
        Class<? extends Object> term248412 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term248411 = ((Class) term248412).getDeclaredField((String) "INTERFACE");
        ((Field) term248411).setAccessible(true);
        Object enum463 = ((Field) term248411).get((Object) null);
        term247151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term247151, term247151.getClass(), "kind", enum463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term247151;
        try {
            callMethod(klass, "isSubtype", argTypes, term246599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


