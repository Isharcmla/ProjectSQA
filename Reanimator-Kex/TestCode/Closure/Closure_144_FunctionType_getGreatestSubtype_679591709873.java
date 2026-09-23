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

public class FunctionType_getGreatestSubtype_679591709873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1046082;
     Object term1046854;

    public FunctionType_getGreatestSubtype_679591709873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1048671 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1048670 = ((Class) term1048671).getDeclaredField((String) "INTERFACE");
        ((Field) term1048670).setAccessible(true);
        Object enum1892 = ((Field) term1048670).get((Object) null);
        term1046082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1046636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1046744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1046082, term1046082.getClass(), "kind", enum1892);
        setField(term1046636, term1046636.getClass(), "kind", enum1892);
        setField(term1046744, term1046744.getClass(), "kind", enum1892);
        setField(term1046636, term1046636.getClass(), "typeOfThis", term1046744);
        setField(term1046082, term1046082.getClass(), "typeOfThis", term1046636);
        Class<? extends Object> term1048965 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1048964 = ((Class) term1048965).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1048964).setAccessible(true);
        Object enum1893 = ((Field) term1048964).get((Object) null);
        Class<? extends Object> term1049265 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1049264 = ((Class) term1049265).getDeclaredField((String) "INTERFACE");
        ((Field) term1049264).setAccessible(true);
        Object enum1894 = ((Field) term1049264).get((Object) null);
        term1046854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1047036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1047136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1046854, term1046854.getClass(), "kind", enum1893);
        setField(term1047036, term1047036.getClass(), "kind", enum1893);
        setField(term1047136, term1047136.getClass(), "kind", enum1894);
        setField(term1047036, term1047036.getClass(), "typeOfThis", term1047136);
        setField(term1046854, term1046854.getClass(), "typeOfThis", term1047036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1046854;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1046082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


