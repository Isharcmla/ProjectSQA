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

public class FunctionType_isSubtype_21010021581157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542520;
     Object term1542884;

    public FunctionType_isSubtype_21010021581157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1544381 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1544380 = ((Class) term1544381).getDeclaredField((String) "ORDINARY");
        ((Field) term1544380).setAccessible(true);
        Object enum2755 = ((Field) term1544380).get((Object) null);
        term1542520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1542776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1542520, term1542520.getClass(), "kind", enum2755);
        setField(term1542520, term1542520.getClass(), "typeOfThis", term1542776);
        setField(term1542520, term1542520.getClass(), "call", null);
        Class<? extends Object> term1544672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1544671 = ((Class) term1544672).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1544671).setAccessible(true);
        Object enum2756 = ((Field) term1544671).get((Object) null);
        term1542884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1543066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1543312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term1543406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1542884, term1542884.getClass(), "kind", enum2755);
        setField(term1543066, term1543066.getClass(), "kind", enum2756);
        setField(term1543066, term1543066.getClass(), "typeOfThis", term1543312);
        setField(term1543066, term1543066.getClass(), "call", term1543406);
        setField(term1542884, term1542884.getClass(), "typeOfThis", term1543066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1542884;
        try {
            callMethod(klass, "isSubtype", argTypes, term1542520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


