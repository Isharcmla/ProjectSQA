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

public class FunctionType_isSubtype_21010021581191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446386;
     Object term1447038;

    public FunctionType_isSubtype_21010021581191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1448573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1448572 = ((Class) term1448573).getDeclaredField((String) "INTERFACE");
        ((Field) term1448572).setAccessible(true);
        Object enum2704 = ((Field) term1448572).get((Object) null);
        Class<? extends Object> term1448867 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1448866 = ((Class) term1448867).getDeclaredField((String) "INTERFACE");
        ((Field) term1448866).setAccessible(true);
        Object enum2705 = ((Field) term1448866).get((Object) null);
        term1446386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1446930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1446386, term1446386.getClass(), "kind", enum2704);
        setField(term1446930, term1446930.getClass(), "kind", enum2705);
        setField(term1446386, term1446386.getClass(), "typeOfThis", term1446930);
        Class<? extends Object> term1449161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1449160 = ((Class) term1449161).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1449160).setAccessible(true);
        Object enum2706 = ((Field) term1449160).get((Object) null);
        term1447038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1447220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1447038, term1447038.getClass(), "kind", enum2706);
        setField(term1447038, term1447038.getClass(), "typeOfThis", term1447220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1447038;
        try {
            callMethod(klass, "isSubtype", argTypes, term1446386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


