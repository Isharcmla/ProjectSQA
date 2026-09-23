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

public class FunctionType_isSubtype_21010021581756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2400780;
     Object term2401336;

    public FunctionType_isSubtype_21010021581756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2403046 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2403045 = ((Class) term2403046).getDeclaredField((String) "ORDINARY");
        ((Field) term2403045).setAccessible(true);
        Object enum4487 = ((Field) term2403045).get((Object) null);
        term2400780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2401028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2401134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term2401228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2400780, term2400780.getClass(), "kind", enum4487);
        setField(term2401028, term2401028.getClass(), "kind", enum4487);
        setField(term2401028, term2401028.getClass(), "typeOfThis", term2401134);
        setField(term2401028, term2401028.getClass(), "call", term2401228);
        setField(term2400780, term2400780.getClass(), "typeOfThis", term2401028);
        Class<? extends Object> term2403337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2403336 = ((Class) term2403337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2403336).setAccessible(true);
        Object enum4488 = ((Field) term2403336).get((Object) null);
        term2401336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2401518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2401760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2401336, term2401336.getClass(), "kind", enum4487);
        setField(term2401518, term2401518.getClass(), "kind", enum4488);
        setField(term2401518, term2401518.getClass(), "typeOfThis", null);
        setField(term2401518, term2401518.getClass(), "call", term2401760);
        setField(term2401336, term2401336.getClass(), "typeOfThis", term2401518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2401336;
        try {
            callMethod(klass, "isSubtype", argTypes, term2400780, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


