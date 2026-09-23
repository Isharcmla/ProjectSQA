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

public class FunctionType_isSubtype_2101002158804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803178;
     Object term803790;

    public FunctionType_isSubtype_2101002158804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term807219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term807218 = ((Class) term807219).getDeclaredField((String) "ORDINARY");
        ((Field) term807218).setAccessible(true);
        Object enum1503 = ((Field) term807218).get((Object) null);
        Class<? extends Object> term807510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term807509 = ((Class) term807510).getDeclaredField((String) "INTERFACE");
        ((Field) term807509).setAccessible(true);
        Object enum1504 = ((Field) term807509).get((Object) null);
        term803178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term803426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term803682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term803178, term803178.getClass(), "kind", enum1503);
        setField(term803426, term803426.getClass(), "kind", enum1504);
        setField(term803426, term803426.getClass(), "typeOfThis", term803682);
        setField(term803178, term803178.getClass(), "typeOfThis", term803426);
        Class<? extends Object> term807804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term807803 = ((Class) term807804).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term807803).setAccessible(true);
        Object enum1505 = ((Field) term807803).get((Object) null);
        term803790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term803972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term803790, term803790.getClass(), "kind", enum1503);
        setField(term803972, term803972.getClass(), "kind", enum1505);
        setField(term803972, term803972.getClass(), "typeOfThis", null);
        setField(term803790, term803790.getClass(), "typeOfThis", term803972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term803790;
        try {
            callMethod(klass, "isSubtype", argTypes, term803178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


