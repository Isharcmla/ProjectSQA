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

public class FunctionType_isSubtype_21010021581033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324607;
     Object term1325075;

    public FunctionType_isSubtype_21010021581033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1326450 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1326449 = ((Class) term1326450).getDeclaredField((String) "ORDINARY");
        ((Field) term1326449).setAccessible(true);
        Object enum2376 = ((Field) term1326449).get((Object) null);
        term1324607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1324855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1324965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1324607, term1324607.getClass(), "kind", enum2376);
        setField(term1324855, term1324855.getClass(), "kind", enum2376);
        setField(term1324855, term1324855.getClass(), "typeOfThis", term1324965);
        setField(term1324607, term1324607.getClass(), "typeOfThis", term1324855);
        Class<? extends Object> term1326741 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1326740 = ((Class) term1326741).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1326740).setAccessible(true);
        Object enum2377 = ((Field) term1326740).get((Object) null);
        term1325075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1325333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1325441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1325075, term1325075.getClass(), "kind", enum2377);
        setField(term1325333, term1325333.getClass(), "kind", enum2377);
        setField(term1325333, term1325333.getClass(), "typeOfThis", term1325441);
        setField(term1325075, term1325075.getClass(), "typeOfThis", term1325333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1325075;
        try {
            callMethod(klass, "isSubtype", argTypes, term1324607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


