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

public class FunctionType_getGreatestSubtype_679591709669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599201;
     Object term599949;

    public FunctionType_getGreatestSubtype_679591709669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term601071 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term601070 = ((Class) term601071).getDeclaredField((String) "ORDINARY");
        ((Field) term601070).setAccessible(true);
        Object enum1112 = ((Field) term601070).get((Object) null);
        term599201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term599753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term599841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term599201, term599201.getClass(), "kind", enum1112);
        setField(term599753, term599753.getClass(), "kind", enum1112);
        setField(term599753, term599753.getClass(), "typeOfThis", term599841);
        setField(term599201, term599201.getClass(), "typeOfThis", term599753);
        Class<? extends Object> term601362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term601361 = ((Class) term601362).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term601361).setAccessible(true);
        Object enum1113 = ((Field) term601361).get((Object) null);
        term599949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term600123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term599949, term599949.getClass(), "kind", enum1113);
        setField(term600123, term600123.getClass(), "kind", enum1113);
        setField(term600123, term600123.getClass(), "typeOfThis", null);
        setField(term599949, term599949.getClass(), "typeOfThis", term600123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term599949;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term599201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


