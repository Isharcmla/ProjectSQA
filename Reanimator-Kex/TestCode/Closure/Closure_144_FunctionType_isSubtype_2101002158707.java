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

public class FunctionType_isSubtype_2101002158707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749520;
     Object term750172;

    public FunctionType_isSubtype_2101002158707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term751530 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term751529 = ((Class) term751530).getDeclaredField((String) "ORDINARY");
        ((Field) term751529).setAccessible(true);
        Object enum1349 = ((Field) term751529).get((Object) null);
        term749520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term750064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term749520, term749520.getClass(), "kind", enum1349);
        setField(term750064, term750064.getClass(), "kind", enum1349);
        setField(term749520, term749520.getClass(), "typeOfThis", term750064);
        Class<? extends Object> term751821 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term751820 = ((Class) term751821).getDeclaredField((String) "INTERFACE");
        ((Field) term751820).setAccessible(true);
        Object enum1350 = ((Field) term751820).get((Object) null);
        term750172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term750502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term750172, term750172.getClass(), "kind", enum1349);
        setField(term750502, term750502.getClass(), "kind", enum1350);
        setField(term750172, term750172.getClass(), "typeOfThis", term750502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term750172;
        try {
            callMethod(klass, "isSubtype", argTypes, term749520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


