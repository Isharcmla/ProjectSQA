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

public class FunctionType_isSubtype_21010021581259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1563464;
     Object term1563920;

    public FunctionType_isSubtype_21010021581259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1565917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1565916 = ((Class) term1565917).getDeclaredField((String) "ORDINARY");
        ((Field) term1565916).setAccessible(true);
        Object enum2921 = ((Field) term1565916).get((Object) null);
        term1563464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1563712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1563812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1563464, term1563464.getClass(), "kind", enum2921);
        setField(term1563712, term1563712.getClass(), "kind", enum2921);
        setField(term1563712, term1563712.getClass(), "typeOfThis", term1563812);
        setField(term1563712, term1563712.getClass(), "call", null);
        setField(term1563464, term1563464.getClass(), "typeOfThis", term1563712);
        Class<? extends Object> term1566208 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1566207 = ((Class) term1566208).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1566207).setAccessible(true);
        Object enum2922 = ((Field) term1566207).get((Object) null);
        term1563920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1564102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1564356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term1564450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1563920, term1563920.getClass(), "kind", enum2921);
        setField(term1564102, term1564102.getClass(), "kind", enum2922);
        setField(term1564102, term1564102.getClass(), "typeOfThis", term1564356);
        setField(term1564102, term1564102.getClass(), "call", term1564450);
        setField(term1563920, term1563920.getClass(), "typeOfThis", term1564102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1563920;
        try {
            callMethod(klass, "isSubtype", argTypes, term1563464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


