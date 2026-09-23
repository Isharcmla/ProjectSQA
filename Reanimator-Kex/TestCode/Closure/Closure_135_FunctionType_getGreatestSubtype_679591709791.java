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

public class FunctionType_getGreatestSubtype_679591709791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782988;
     Object term783648;

    public FunctionType_getGreatestSubtype_679591709791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term785068 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785067 = ((Class) term785068).getDeclaredField((String) "ORDINARY");
        ((Field) term785067).setAccessible(true);
        Object enum1464 = ((Field) term785067).get((Object) null);
        Class<? extends Object> term785359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785358 = ((Class) term785359).getDeclaredField((String) "INTERFACE");
        ((Field) term785358).setAccessible(true);
        Object enum1465 = ((Field) term785358).get((Object) null);
        term782988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term783540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term782988, term782988.getClass(), "kind", enum1464);
        setField(term783540, term783540.getClass(), "kind", enum1465);
        setField(term782988, term782988.getClass(), "typeOfThis", term783540);
        Class<? extends Object> term785653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785652 = ((Class) term785653).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term785652).setAccessible(true);
        Object enum1466 = ((Field) term785652).get((Object) null);
        term783648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term783822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term783648, term783648.getClass(), "kind", enum1466);
        setField(term783648, term783648.getClass(), "typeOfThis", term783822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term783648;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term782988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


