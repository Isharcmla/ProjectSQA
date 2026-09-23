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

public class FunctionType_isSubtype_21010021581243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1702404;
     Object term1702842;

    public FunctionType_isSubtype_21010021581243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1705727 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1705726 = ((Class) term1705727).getDeclaredField((String) "ORDINARY");
        ((Field) term1705726).setAccessible(true);
        Object enum3042 = ((Field) term1705726).get((Object) null);
        term1702404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1702640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term1702734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1702404, term1702404.getClass(), "kind", enum3042);
        setField(term1702404, term1702404.getClass(), "typeOfThis", term1702640);
        setField(term1702404, term1702404.getClass(), "call", term1702734);
        Class<? extends Object> term1706018 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1706017 = ((Class) term1706018).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1706017).setAccessible(true);
        Object enum3043 = ((Field) term1706017).get((Object) null);
        term1702842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1703024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1703282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1702842, term1702842.getClass(), "kind", enum3042);
        setField(term1703024, term1703024.getClass(), "kind", enum3043);
        setField(term1703024, term1703024.getClass(), "typeOfThis", term1703282);
        setField(term1703024, term1703024.getClass(), "call", null);
        setField(term1702842, term1702842.getClass(), "typeOfThis", term1703024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1702842;
        try {
            callMethod(klass, "isSubtype", argTypes, term1702404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


