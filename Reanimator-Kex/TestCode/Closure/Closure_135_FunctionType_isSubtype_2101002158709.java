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

public class FunctionType_isSubtype_2101002158709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656669;
     Object term657025;

    public FunctionType_isSubtype_2101002158709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term658209 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term658208 = ((Class) term658209).getDeclaredField((String) "ORDINARY");
        ((Field) term658208).setAccessible(true);
        Object enum1222 = ((Field) term658208).get((Object) null);
        term656669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term656917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term656669, term656669.getClass(), "kind", enum1222);
        setField(term656669, term656669.getClass(), "typeOfThis", term656917);
        Class<? extends Object> term658500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term658499 = ((Class) term658500).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term658499).setAccessible(true);
        Object enum1223 = ((Field) term658499).get((Object) null);
        term657025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term657281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term657025, term657025.getClass(), "kind", enum1223);
        setField(term657025, term657025.getClass(), "typeOfThis", term657281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term657025;
        try {
            callMethod(klass, "isSubtype", argTypes, term656669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


