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

public class FunctionType_isSubtype_2101002158892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947369;
     Object term947883;

    public FunctionType_isSubtype_2101002158892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term951359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term951358 = ((Class) term951359).getDeclaredField((String) "ORDINARY");
        ((Field) term951358).setAccessible(true);
        Object enum1771 = ((Field) term951358).get((Object) null);
        Class<? extends Object> term951650 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term951649 = ((Class) term951650).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term951649).setAccessible(true);
        Object enum1772 = ((Field) term951649).get((Object) null);
        term947369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term947627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term947369, term947369.getClass(), "kind", enum1771);
        setField(term947627, term947627.getClass(), "kind", enum1772);
        setField(term947369, term947369.getClass(), "typeOfThis", term947627);
        Class<? extends Object> term951950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term951949 = ((Class) term951950).getDeclaredField((String) "INTERFACE");
        ((Field) term951949).setAccessible(true);
        Object enum1773 = ((Field) term951949).get((Object) null);
        term947883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term948065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term947883, term947883.getClass(), "kind", enum1771);
        setField(term948065, term948065.getClass(), "kind", enum1773);
        setField(term947883, term947883.getClass(), "typeOfThis", term948065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term947883;
        try {
            callMethod(klass, "isSubtype", argTypes, term947369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


