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

public class FunctionType_isSubtype_21010021581311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652310;
     Object term1652908;

    public FunctionType_isSubtype_21010021581311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1654514 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1654513 = ((Class) term1654514).getDeclaredField((String) "ORDINARY");
        ((Field) term1654513).setAccessible(true);
        Object enum3084 = ((Field) term1654513).get((Object) null);
        Class<? extends Object> term1654805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1654804 = ((Class) term1654805).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1654804).setAccessible(true);
        Object enum3085 = ((Field) term1654804).get((Object) null);
        term1652310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1652558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1652800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1652310, term1652310.getClass(), "kind", enum3084);
        setField(term1652558, term1652558.getClass(), "kind", enum3085);
        setField(term1652558, term1652558.getClass(), "call", term1652800);
        setField(term1652310, term1652310.getClass(), "typeOfThis", term1652558);
        term1652908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1653090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1653258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1652908, term1652908.getClass(), "kind", enum3084);
        setField(term1653090, term1653090.getClass(), "kind", enum3085);
        setField(term1653090, term1653090.getClass(), "call", term1653258);
        setField(term1652908, term1652908.getClass(), "typeOfThis", term1653090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1652908;
        try {
            callMethod(klass, "isSubtype", argTypes, term1652310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


