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

public class FunctionType_getGreatestSubtype_679591709621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610505;
     Object term611169;

    public FunctionType_getGreatestSubtype_679591709621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term612591 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term612590 = ((Class) term612591).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term612590).setAccessible(true);
        Object enum1106 = ((Field) term612590).get((Object) null);
        Class<? extends Object> term612891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term612890 = ((Class) term612891).getDeclaredField((String) "INTERFACE");
        ((Field) term612890).setAccessible(true);
        Object enum1107 = ((Field) term612890).get((Object) null);
        term610505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term611059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term610505, term610505.getClass(), "kind", enum1106);
        setField(term611059, term611059.getClass(), "kind", enum1107);
        setField(term610505, term610505.getClass(), "typeOfThis", term611059);
        Class<? extends Object> term613185 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term613184 = ((Class) term613185).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term613184).setAccessible(true);
        Object enum1108 = ((Field) term613184).get((Object) null);
        term611169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term611343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term611169, term611169.getClass(), "kind", enum1108);
        setField(term611169, term611169.getClass(), "typeOfThis", term611343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term611169;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term610505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


