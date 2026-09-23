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

public class FunctionType_isSubtype_2101002158867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034311;
     Object term1034965;

    public FunctionType_isSubtype_2101002158867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1036449 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1036448 = ((Class) term1036449).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1036448).setAccessible(true);
        Object enum1870 = ((Field) term1036448).get((Object) null);
        Class<? extends Object> term1036749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1036748 = ((Class) term1036749).getDeclaredField((String) "INTERFACE");
        ((Field) term1036748).setAccessible(true);
        Object enum1871 = ((Field) term1036748).get((Object) null);
        term1034311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1034855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1034311, term1034311.getClass(), "kind", enum1870);
        setField(term1034855, term1034855.getClass(), "kind", enum1871);
        setField(term1034311, term1034311.getClass(), "typeOfThis", term1034855);
        Class<? extends Object> term1037043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1037042 = ((Class) term1037043).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1037042).setAccessible(true);
        Object enum1872 = ((Field) term1037042).get((Object) null);
        term1034965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1035147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1034965, term1034965.getClass(), "kind", enum1872);
        setField(term1034965, term1034965.getClass(), "typeOfThis", term1035147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1034965;
        try {
            callMethod(klass, "isSubtype", argTypes, term1034311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


