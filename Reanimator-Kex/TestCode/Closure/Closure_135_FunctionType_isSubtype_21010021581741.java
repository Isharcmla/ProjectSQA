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

public class FunctionType_isSubtype_21010021581741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377714;
     Object term2378178;

    public FunctionType_isSubtype_21010021581741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2381467 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2381466 = ((Class) term2381467).getDeclaredField((String) "ORDINARY");
        ((Field) term2381466).setAccessible(true);
        Object enum4448 = ((Field) term2381466).get((Object) null);
        term2377714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2377970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2378070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2377714, term2377714.getClass(), "kind", enum4448);
        setField(term2377970, term2377970.getClass(), "kind", enum4448);
        setField(term2377970, term2377970.getClass(), "typeOfThis", term2378070);
        setField(term2377714, term2377714.getClass(), "typeOfThis", term2377970);
        Class<? extends Object> term2381758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2381757 = ((Class) term2381758).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2381757).setAccessible(true);
        Object enum4449 = ((Field) term2381757).get((Object) null);
        term2378178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2378360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2378178, term2378178.getClass(), "kind", enum4448);
        setField(term2378360, term2378360.getClass(), "kind", enum4449);
        setField(term2378360, term2378360.getClass(), "typeOfThis", null);
        setField(term2378178, term2378178.getClass(), "typeOfThis", term2378360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2378178;
        try {
            callMethod(klass, "isSubtype", argTypes, term2377714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


