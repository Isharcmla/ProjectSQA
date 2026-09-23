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

public class FunctionType_isSubtype_2101002158625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537753;
     Object term538265;

    public FunctionType_isSubtype_2101002158625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term541442 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term541441 = ((Class) term541442).getDeclaredField((String) "ORDINARY");
        ((Field) term541441).setAccessible(true);
        Object enum996 = ((Field) term541441).get((Object) null);
        Class<? extends Object> term541733 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term541732 = ((Class) term541733).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term541732).setAccessible(true);
        Object enum997 = ((Field) term541732).get((Object) null);
        term537753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term538009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term537753, term537753.getClass(), "kind", enum996);
        setField(term538009, term538009.getClass(), "kind", enum997);
        setField(term537753, term537753.getClass(), "typeOfThis", term538009);
        Class<? extends Object> term542033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term542032 = ((Class) term542033).getDeclaredField((String) "INTERFACE");
        ((Field) term542032).setAccessible(true);
        Object enum998 = ((Field) term542032).get((Object) null);
        term538265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term538447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term538265, term538265.getClass(), "kind", enum996);
        setField(term538447, term538447.getClass(), "kind", enum998);
        setField(term538265, term538265.getClass(), "typeOfThis", term538447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term538265;
        try {
            callMethod(klass, "isSubtype", argTypes, term537753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


