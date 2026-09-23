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

public class FunctionType_isSubtype_21010021581588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2329605;
     Object term2330257;

    public FunctionType_isSubtype_21010021581588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2333071 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2333070 = ((Class) term2333071).getDeclaredField((String) "ORDINARY");
        ((Field) term2333070).setAccessible(true);
        Object enum4161 = ((Field) term2333070).get((Object) null);
        Class<? extends Object> term2333362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2333361 = ((Class) term2333362).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2333361).setAccessible(true);
        Object enum4162 = ((Field) term2333361).get((Object) null);
        term2329605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2330149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2329605, term2329605.getClass(), "kind", enum4161);
        setField(term2330149, term2330149.getClass(), "kind", enum4162);
        setField(term2329605, term2329605.getClass(), "typeOfThis", term2330149);
        term2330257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2330589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2330257, term2330257.getClass(), "kind", enum4161);
        setField(term2330589, term2330589.getClass(), "kind", enum4162);
        setField(term2330257, term2330257.getClass(), "typeOfThis", term2330589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2330257;
        try {
            callMethod(klass, "isSubtype", argTypes, term2329605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


