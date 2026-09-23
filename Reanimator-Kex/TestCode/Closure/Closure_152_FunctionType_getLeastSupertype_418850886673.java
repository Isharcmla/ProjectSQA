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

public class FunctionType_getLeastSupertype_418850886673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691104;
     Object term691858;

    public FunctionType_getLeastSupertype_418850886673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term693027 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term693026 = ((Class) term693027).getDeclaredField((String) "ORDINARY");
        ((Field) term693026).setAccessible(true);
        Object enum1052 = ((Field) term693026).get((Object) null);
        term691104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term691648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term691748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term691104, term691104.getClass(), "kind", enum1052);
        setField(term691648, term691648.getClass(), "kind", enum1052);
        setField(term691648, term691648.getClass(), "typeOfThis", term691748);
        setField(term691104, term691104.getClass(), "typeOfThis", term691648);
        term691858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term692180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term692280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term691858, term691858.getClass(), "kind", enum1052);
        setField(term692180, term692180.getClass(), "kind", enum1052);
        setField(term692180, term692180.getClass(), "typeOfThis", term692280);
        setField(term691858, term691858.getClass(), "typeOfThis", term692180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term691858;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term691104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


