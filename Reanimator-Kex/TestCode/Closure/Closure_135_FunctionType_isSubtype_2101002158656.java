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

public class FunctionType_isSubtype_2101002158656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579281;
     Object term580039;

    public FunctionType_isSubtype_2101002158656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term583029 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term583028 = ((Class) term583029).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term583028).setAccessible(true);
        Object enum1075 = ((Field) term583028).get((Object) null);
        term579281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term579825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term579931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term579281, term579281.getClass(), "kind", enum1075);
        setField(term579825, term579825.getClass(), "kind", enum1075);
        setField(term579825, term579825.getClass(), "typeOfThis", term579931);
        setField(term579281, term579281.getClass(), "typeOfThis", term579825);
        Class<? extends Object> term583329 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term583328 = ((Class) term583329).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term583328).setAccessible(true);
        Object enum1076 = ((Field) term583328).get((Object) null);
        term580039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term580369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term580039, term580039.getClass(), "kind", enum1075);
        setField(term580369, term580369.getClass(), "kind", enum1076);
        setField(term580369, term580369.getClass(), "typeOfThis", null);
        setField(term580039, term580039.getClass(), "typeOfThis", term580369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term580039;
        try {
            callMethod(klass, "isSubtype", argTypes, term579281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


