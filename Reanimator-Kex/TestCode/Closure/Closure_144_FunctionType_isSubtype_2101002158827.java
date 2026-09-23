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

public class FunctionType_isSubtype_2101002158827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961497;
     Object term962001;

    public FunctionType_isSubtype_2101002158827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term963548 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term963547 = ((Class) term963548).getDeclaredField((String) "ORDINARY");
        ((Field) term963547).setAccessible(true);
        Object enum1740 = ((Field) term963547).get((Object) null);
        Class<? extends Object> term963839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term963838 = ((Class) term963839).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term963838).setAccessible(true);
        Object enum1741 = ((Field) term963838).get((Object) null);
        term961497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term961745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term961497, term961497.getClass(), "kind", enum1740);
        setField(term961745, term961745.getClass(), "kind", enum1741);
        setField(term961745, term961745.getClass(), "typeOfThis", null);
        setField(term961497, term961497.getClass(), "typeOfThis", term961745);
        term962001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term962183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term962283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term962001, term962001.getClass(), "kind", enum1740);
        setField(term962183, term962183.getClass(), "kind", enum1740);
        setField(term962183, term962183.getClass(), "typeOfThis", term962283);
        setField(term962001, term962001.getClass(), "typeOfThis", term962183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term962001;
        try {
            callMethod(klass, "isSubtype", argTypes, term961497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


