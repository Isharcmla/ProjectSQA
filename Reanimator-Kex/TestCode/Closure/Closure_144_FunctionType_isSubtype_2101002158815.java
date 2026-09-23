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

public class FunctionType_isSubtype_2101002158815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941038;
     Object term941814;

    public FunctionType_isSubtype_2101002158815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term943418 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term943417 = ((Class) term943418).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term943417).setAccessible(true);
        Object enum1704 = ((Field) term943417).get((Object) null);
        term941038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term941582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term941706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term941038, term941038.getClass(), "kind", enum1704);
        setField(term941582, term941582.getClass(), "kind", enum1704);
        setField(term941582, term941582.getClass(), "typeOfThis", term941706);
        setField(term941038, term941038.getClass(), "typeOfThis", term941582);
        Class<? extends Object> term943718 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term943717 = ((Class) term943718).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term943717).setAccessible(true);
        Object enum1705 = ((Field) term943717).get((Object) null);
        term941814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term942146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term941814, term941814.getClass(), "kind", enum1704);
        setField(term942146, term942146.getClass(), "kind", enum1705);
        setField(term942146, term942146.getClass(), "typeOfThis", null);
        setField(term941814, term941814.getClass(), "typeOfThis", term942146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term941814;
        try {
            callMethod(klass, "isSubtype", argTypes, term941038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


