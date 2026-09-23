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

public class FunctionType_isSubtype_2101002158749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714487;
     Object term715147;

    public FunctionType_isSubtype_2101002158749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term716519 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term716518 = ((Class) term716519).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term716518).setAccessible(true);
        Object enum1331 = ((Field) term716518).get((Object) null);
        Class<? extends Object> term716819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term716818 = ((Class) term716819).getDeclaredField((String) "INTERFACE");
        ((Field) term716818).setAccessible(true);
        Object enum1332 = ((Field) term716818).get((Object) null);
        term714487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term715039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term714487, term714487.getClass(), "kind", enum1331);
        setField(term715039, term715039.getClass(), "kind", enum1332);
        setField(term714487, term714487.getClass(), "typeOfThis", term715039);
        term715147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term715477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term715147, term715147.getClass(), "kind", enum1331);
        setField(term715477, term715477.getClass(), "kind", enum1332);
        setField(term715147, term715147.getClass(), "typeOfThis", term715477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term715147;
        try {
            callMethod(klass, "isSubtype", argTypes, term714487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


