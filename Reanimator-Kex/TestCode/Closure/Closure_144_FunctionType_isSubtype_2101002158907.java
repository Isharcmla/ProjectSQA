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

public class FunctionType_isSubtype_2101002158907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103972;
     Object term1104438;

    public FunctionType_isSubtype_2101002158907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1105458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1105457 = ((Class) term1105458).getDeclaredField((String) "ORDINARY");
        ((Field) term1105457).setAccessible(true);
        Object enum1989 = ((Field) term1105457).get((Object) null);
        term1103972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1104220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1104330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1103972, term1103972.getClass(), "kind", enum1989);
        setField(term1104220, term1104220.getClass(), "kind", enum1989);
        setField(term1104220, term1104220.getClass(), "typeOfThis", term1104330);
        setField(term1103972, term1103972.getClass(), "typeOfThis", term1104220);
        term1104438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1104622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1104438, term1104438.getClass(), "kind", enum1989);
        setField(term1104622, term1104622.getClass(), "kind", enum1989);
        setField(term1104622, term1104622.getClass(), "typeOfThis", null);
        setField(term1104438, term1104438.getClass(), "typeOfThis", term1104622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1104438;
        try {
            callMethod(klass, "isSubtype", argTypes, term1103972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


