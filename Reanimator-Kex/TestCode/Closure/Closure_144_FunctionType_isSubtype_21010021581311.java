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

public class FunctionType_isSubtype_21010021581311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823573;
     Object term1824321;

    public FunctionType_isSubtype_21010021581311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1825882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1825881 = ((Class) term1825882).getDeclaredField((String) "ORDINARY");
        ((Field) term1825881).setAccessible(true);
        Object enum3243 = ((Field) term1825881).get((Object) null);
        Class<? extends Object> term1826173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1826172 = ((Class) term1826173).getDeclaredField((String) "INTERFACE");
        ((Field) term1826172).setAccessible(true);
        Object enum3244 = ((Field) term1826172).get((Object) null);
        term1823573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1824125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1824213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1823573, term1823573.getClass(), "kind", enum3243);
        setField(term1824125, term1824125.getClass(), "kind", enum3244);
        setField(term1824125, term1824125.getClass(), "typeOfThis", term1824213);
        setField(term1823573, term1823573.getClass(), "typeOfThis", term1824125);
        Class<? extends Object> term1826467 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1826466 = ((Class) term1826467).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1826466).setAccessible(true);
        Object enum3245 = ((Field) term1826466).get((Object) null);
        term1824321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1824651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1824321, term1824321.getClass(), "kind", enum3243);
        setField(term1824651, term1824651.getClass(), "kind", enum3245);
        setField(term1824651, term1824651.getClass(), "typeOfThis", null);
        setField(term1824321, term1824321.getClass(), "typeOfThis", term1824651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1824321;
        try {
            callMethod(klass, "isSubtype", argTypes, term1823573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


