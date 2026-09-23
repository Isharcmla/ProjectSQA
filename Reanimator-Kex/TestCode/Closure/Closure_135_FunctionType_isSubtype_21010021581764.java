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

public class FunctionType_isSubtype_21010021581764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2415626;
     Object term2416286;

    public FunctionType_isSubtype_21010021581764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2417416 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2417415 = ((Class) term2417416).getDeclaredField((String) "INTERFACE");
        ((Field) term2417415).setAccessible(true);
        Object enum4513 = ((Field) term2417415).get((Object) null);
        term2415626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2416178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2415626, term2415626.getClass(), "kind", enum4513);
        setField(term2416178, term2416178.getClass(), "kind", enum4513);
        setField(term2416178, term2416178.getClass(), "typeOfThis", null);
        setField(term2415626, term2415626.getClass(), "typeOfThis", term2416178);
        term2416286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2416616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2416710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term2416286, term2416286.getClass(), "kind", enum4513);
        setField(term2416616, term2416616.getClass(), "kind", enum4513);
        setField(term2416616, term2416616.getClass(), "typeOfThis", term2416710);
        setField(term2416286, term2416286.getClass(), "typeOfThis", term2416616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2416286;
        try {
            callMethod(klass, "isSubtype", argTypes, term2415626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


