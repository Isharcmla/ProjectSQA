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

public class FunctionType_isSubtype_2101002158877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922598;
     Object term923250;

    public FunctionType_isSubtype_2101002158877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term924815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term924814 = ((Class) term924815).getDeclaredField((String) "INTERFACE");
        ((Field) term924814).setAccessible(true);
        Object enum1721 = ((Field) term924814).get((Object) null);
        Class<? extends Object> term925109 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term925108 = ((Class) term925109).getDeclaredField((String) "INTERFACE");
        ((Field) term925108).setAccessible(true);
        Object enum1722 = ((Field) term925108).get((Object) null);
        term922598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term923142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term922598, term922598.getClass(), "kind", enum1721);
        setField(term923142, term923142.getClass(), "kind", enum1722);
        setField(term922598, term922598.getClass(), "typeOfThis", term923142);
        Class<? extends Object> term925403 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term925402 = ((Class) term925403).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term925402).setAccessible(true);
        Object enum1723 = ((Field) term925402).get((Object) null);
        term923250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term923432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term923250, term923250.getClass(), "kind", enum1723);
        setField(term923432, term923432.getClass(), "kind", enum1723);
        setField(term923250, term923250.getClass(), "typeOfThis", term923432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term923250;
        try {
            callMethod(klass, "isSubtype", argTypes, term922598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


