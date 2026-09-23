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

public class FunctionType_isSubtype_2101002158805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805225;
     Object term805777;

    public FunctionType_isSubtype_2101002158805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term809714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term809713 = ((Class) term809714).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term809713).setAccessible(true);
        Object enum1510 = ((Field) term809713).get((Object) null);
        term805225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term805225, term805225.getClass(), "kind", enum1510);
        setField(term805225, term805225.getClass(), "typeOfThis", term805225);
        Class<? extends Object> term810014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term810013 = ((Class) term810014).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term810013).setAccessible(true);
        Object enum1511 = ((Field) term810013).get((Object) null);
        term805777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term805963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term805777, term805777.getClass(), "kind", enum1511);
        setField(term805777, term805777.getClass(), "typeOfThis", term805963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term805777;
        try {
            callMethod(klass, "isSubtype", argTypes, term805225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


