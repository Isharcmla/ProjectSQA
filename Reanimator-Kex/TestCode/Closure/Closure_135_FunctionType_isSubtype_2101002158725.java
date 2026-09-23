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

public class FunctionType_isSubtype_2101002158725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675393;
     Object term676145;

    public FunctionType_isSubtype_2101002158725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term678931 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term678930 = ((Class) term678931).getDeclaredField((String) "ORDINARY");
        ((Field) term678930).setAccessible(true);
        Object enum1257 = ((Field) term678930).get((Object) null);
        term675393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term675937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term676037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term675393, term675393.getClass(), "kind", enum1257);
        setField(term675937, term675937.getClass(), "kind", enum1257);
        setField(term675937, term675937.getClass(), "typeOfThis", term676037);
        setField(term675393, term675393.getClass(), "typeOfThis", term675937);
        Class<? extends Object> term679222 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term679221 = ((Class) term679222).getDeclaredField((String) "INTERFACE");
        ((Field) term679221).setAccessible(true);
        Object enum1258 = ((Field) term679221).get((Object) null);
        term676145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term676475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term676569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term676145, term676145.getClass(), "kind", enum1257);
        setField(term676475, term676475.getClass(), "kind", enum1258);
        setField(term676475, term676475.getClass(), "typeOfThis", term676569);
        setField(term676145, term676145.getClass(), "typeOfThis", term676475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term676145;
        try {
            callMethod(klass, "isSubtype", argTypes, term675393, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


