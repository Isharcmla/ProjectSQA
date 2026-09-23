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

public class FunctionType_isSubtype_2101002158677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609117;
     Object term609769;

    public FunctionType_isSubtype_2101002158677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term612627 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term612626 = ((Class) term612627).getDeclaredField((String) "ORDINARY");
        ((Field) term612626).setAccessible(true);
        Object enum1134 = ((Field) term612626).get((Object) null);
        Class<? extends Object> term612918 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term612917 = ((Class) term612918).getDeclaredField((String) "INTERFACE");
        ((Field) term612917).setAccessible(true);
        Object enum1135 = ((Field) term612917).get((Object) null);
        term609117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term609661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term609117, term609117.getClass(), "kind", enum1134);
        setField(term609661, term609661.getClass(), "kind", enum1135);
        setField(term609117, term609117.getClass(), "typeOfThis", term609661);
        term609769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term610099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term609769, term609769.getClass(), "kind", enum1134);
        setField(term609769, term609769.getClass(), "typeOfThis", term610099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term609769;
        try {
            callMethod(klass, "isSubtype", argTypes, term609117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


