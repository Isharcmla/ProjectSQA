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

public class FunctionType_isSubtype_2101002158817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945154;
     Object term945902;

    public FunctionType_isSubtype_2101002158817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term947372 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term947371 = ((Class) term947372).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term947371).setAccessible(true);
        Object enum1711 = ((Field) term947371).get((Object) null);
        term945154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term945706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term945794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term945154, term945154.getClass(), "kind", enum1711);
        setField(term945706, term945706.getClass(), "kind", enum1711);
        setField(term945706, term945706.getClass(), "typeOfThis", term945794);
        setField(term945154, term945154.getClass(), "typeOfThis", term945706);
        Class<? extends Object> term947672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term947671 = ((Class) term947672).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term947671).setAccessible(true);
        Object enum1712 = ((Field) term947671).get((Object) null);
        term945902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term946084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term945902, term945902.getClass(), "kind", enum1712);
        setField(term946084, term946084.getClass(), "kind", enum1711);
        setField(term946084, term946084.getClass(), "typeOfThis", null);
        setField(term945902, term945902.getClass(), "typeOfThis", term946084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term945902;
        try {
            callMethod(klass, "isSubtype", argTypes, term945154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


