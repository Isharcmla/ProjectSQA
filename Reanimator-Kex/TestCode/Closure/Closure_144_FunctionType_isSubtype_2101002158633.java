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

public class FunctionType_isSubtype_2101002158633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628752;
     Object term629406;

    public FunctionType_isSubtype_2101002158633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term630369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term630368 = ((Class) term630369).getDeclaredField((String) "ORDINARY");
        ((Field) term630368).setAccessible(true);
        Object enum1137 = ((Field) term630368).get((Object) null);
        term628752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term629296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term628752, term628752.getClass(), "kind", enum1137);
        setField(term628752, term628752.getClass(), "typeOfThis", term629296);
        term629406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term629738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term629406, term629406.getClass(), "kind", enum1137);
        setField(term629406, term629406.getClass(), "typeOfThis", term629738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term629406;
        try {
            callMethod(klass, "isSubtype", argTypes, term628752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


