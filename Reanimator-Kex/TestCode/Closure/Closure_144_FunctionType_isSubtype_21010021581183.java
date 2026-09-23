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

public class FunctionType_isSubtype_21010021581183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589501;
     Object term1590161;

    public FunctionType_isSubtype_21010021581183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1591590 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1591589 = ((Class) term1591590).getDeclaredField((String) "ORDINARY");
        ((Field) term1591589).setAccessible(true);
        Object enum2838 = ((Field) term1591589).get((Object) null);
        Class<? extends Object> term1591881 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1591880 = ((Class) term1591881).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1591880).setAccessible(true);
        Object enum2839 = ((Field) term1591880).get((Object) null);
        term1589501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1590053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1589501, term1589501.getClass(), "kind", enum2838);
        setField(term1590053, term1590053.getClass(), "kind", enum2839);
        setField(term1589501, term1589501.getClass(), "typeOfThis", term1590053);
        term1590161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1590491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1590161, term1590161.getClass(), "kind", enum2838);
        setField(term1590161, term1590161.getClass(), "typeOfThis", term1590491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1590161;
        try {
            callMethod(klass, "isSubtype", argTypes, term1589501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


