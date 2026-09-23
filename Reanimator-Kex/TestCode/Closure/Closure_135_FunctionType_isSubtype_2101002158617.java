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

public class FunctionType_isSubtype_2101002158617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526134;
     Object term526796;

    public FunctionType_isSubtype_2101002158617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term527867 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term527866 = ((Class) term527867).getDeclaredField((String) "INTERFACE");
        ((Field) term527866).setAccessible(true);
        Object enum974 = ((Field) term527866).get((Object) null);
        term526134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term526686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term526134, term526134.getClass(), "kind", enum974);
        setField(term526134, term526134.getClass(), "typeOfThis", term526686);
        term526796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term527124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term526796, term526796.getClass(), "kind", enum974);
        setField(term526796, term526796.getClass(), "typeOfThis", term527124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term526796;
        try {
            callMethod(klass, "isSubtype", argTypes, term526134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


