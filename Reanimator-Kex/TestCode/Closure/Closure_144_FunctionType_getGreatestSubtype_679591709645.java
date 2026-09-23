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

public class FunctionType_getGreatestSubtype_679591709645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644353;
     Object term645007;

    public FunctionType_getGreatestSubtype_679591709645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term646451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term646450 = ((Class) term646451).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term646450).setAccessible(true);
        Object enum1162 = ((Field) term646450).get((Object) null);
        Class<? extends Object> term646751 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term646750 = ((Class) term646751).getDeclaredField((String) "INTERFACE");
        ((Field) term646750).setAccessible(true);
        Object enum1163 = ((Field) term646750).get((Object) null);
        term644353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term644897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term644353, term644353.getClass(), "kind", enum1162);
        setField(term644897, term644897.getClass(), "kind", enum1163);
        setField(term644353, term644353.getClass(), "typeOfThis", term644897);
        Class<? extends Object> term647045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term647044 = ((Class) term647045).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term647044).setAccessible(true);
        Object enum1164 = ((Field) term647044).get((Object) null);
        term645007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term645181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term645007, term645007.getClass(), "kind", enum1164);
        setField(term645007, term645007.getClass(), "typeOfThis", term645181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term645007;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term644353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


