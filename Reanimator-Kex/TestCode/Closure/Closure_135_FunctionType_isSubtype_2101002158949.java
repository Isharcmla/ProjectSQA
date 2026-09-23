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

public class FunctionType_isSubtype_2101002158949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041748;
     Object term1042508;

    public FunctionType_isSubtype_2101002158949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1043932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1043931 = ((Class) term1043932).getDeclaredField((String) "INTERFACE");
        ((Field) term1043931).setAccessible(true);
        Object enum1947 = ((Field) term1043931).get((Object) null);
        term1041748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1042300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1042400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1041748, term1041748.getClass(), "kind", enum1947);
        setField(term1042300, term1042300.getClass(), "kind", enum1947);
        setField(term1042300, term1042300.getClass(), "typeOfThis", term1042400);
        setField(term1041748, term1041748.getClass(), "typeOfThis", term1042300);
        Class<? extends Object> term1044226 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1044225 = ((Class) term1044226).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1044225).setAccessible(true);
        Object enum1948 = ((Field) term1044225).get((Object) null);
        term1042508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1042690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1042926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1042508, term1042508.getClass(), "kind", enum1948);
        setField(term1042690, term1042690.getClass(), "kind", enum1947);
        setField(term1042690, term1042690.getClass(), "typeOfThis", term1042926);
        setField(term1042508, term1042508.getClass(), "typeOfThis", term1042690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1042508;
        try {
            callMethod(klass, "isSubtype", argTypes, term1041748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


