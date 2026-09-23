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

public class FunctionType_getGreatestSubtype_6795917091270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1748415;
     Object term1749143;

    public FunctionType_getGreatestSubtype_6795917091270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1752880 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1752879 = ((Class) term1752880).getDeclaredField((String) "ORDINARY");
        ((Field) term1752879).setAccessible(true);
        Object enum3116 = ((Field) term1752879).get((Object) null);
        Class<? extends Object> term1753171 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1753170 = ((Class) term1753171).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1753170).setAccessible(true);
        Object enum3117 = ((Field) term1753170).get((Object) null);
        term1748415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1748673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1748781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1749033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1748415, term1748415.getClass(), "kind", enum3116);
        setField(term1748673, term1748673.getClass(), "kind", enum3116);
        setField(term1748781, term1748781.getClass(), "kind", enum3117);
        setField(term1748673, term1748673.getClass(), "typeOfThis", term1748781);
        setField(term1748415, term1748415.getClass(), "typeOfThis", term1748673);
        setField(term1748415, term1748415.getClass(), "registry", term1749033);
        Class<? extends Object> term1753471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1753470 = ((Class) term1753471).getDeclaredField((String) "INTERFACE");
        ((Field) term1753470).setAccessible(true);
        Object enum3118 = ((Field) term1753470).get((Object) null);
        term1749143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1749327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1749427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1749143, term1749143.getClass(), "kind", enum3117);
        setField(term1749327, term1749327.getClass(), "kind", enum3117);
        setField(term1749427, term1749427.getClass(), "kind", enum3118);
        setField(term1749327, term1749327.getClass(), "typeOfThis", term1749427);
        setField(term1749143, term1749143.getClass(), "typeOfThis", term1749327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1749143;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1748415, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


