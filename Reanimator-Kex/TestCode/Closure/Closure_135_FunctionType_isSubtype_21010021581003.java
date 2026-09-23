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

public class FunctionType_isSubtype_21010021581003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130050;
     Object term1130702;

    public FunctionType_isSubtype_21010021581003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1132294 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1132293 = ((Class) term1132294).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1132293).setAccessible(true);
        Object enum2104 = ((Field) term1132293).get((Object) null);
        Class<? extends Object> term1132594 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1132593 = ((Class) term1132594).getDeclaredField((String) "INTERFACE");
        ((Field) term1132593).setAccessible(true);
        Object enum2105 = ((Field) term1132593).get((Object) null);
        term1130050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1130594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1130050, term1130050.getClass(), "kind", enum2104);
        setField(term1130594, term1130594.getClass(), "kind", enum2105);
        setField(term1130050, term1130050.getClass(), "typeOfThis", term1130594);
        Class<? extends Object> term1132888 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1132887 = ((Class) term1132888).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1132887).setAccessible(true);
        Object enum2106 = ((Field) term1132887).get((Object) null);
        term1130702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1130884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1130702, term1130702.getClass(), "kind", enum2106);
        setField(term1130884, term1130884.getClass(), "kind", enum2105);
        setField(term1130702, term1130702.getClass(), "typeOfThis", term1130884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1130702;
        try {
            callMethod(klass, "isSubtype", argTypes, term1130050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


