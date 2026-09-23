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

public class FunctionType_isSubtype_2101002158969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075698;
     Object term1076360;

    public FunctionType_isSubtype_2101002158969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1078975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1078974 = ((Class) term1078975).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1078974).setAccessible(true);
        Object enum2010 = ((Field) term1078974).get((Object) null);
        Class<? extends Object> term1079275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1079274 = ((Class) term1079275).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1079274).setAccessible(true);
        Object enum2011 = ((Field) term1079274).get((Object) null);
        term1075698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1076252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1075698, term1075698.getClass(), "kind", enum2010);
        setField(term1076252, term1076252.getClass(), "kind", enum2011);
        setField(term1075698, term1075698.getClass(), "typeOfThis", term1076252);
        term1076360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1076690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1076360, term1076360.getClass(), "kind", enum2010);
        setField(term1076690, term1076690.getClass(), "kind", enum2010);
        setField(term1076360, term1076360.getClass(), "typeOfThis", term1076690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1076360;
        try {
            callMethod(klass, "isSubtype", argTypes, term1075698, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


