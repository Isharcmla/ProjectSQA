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

public class FunctionType_isSubtype_21010021581527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229015;
     Object term2229613;

    public FunctionType_isSubtype_21010021581527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2231249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2231248 = ((Class) term2231249).getDeclaredField((String) "ORDINARY");
        ((Field) term2231248).setAccessible(true);
        Object enum3980 = ((Field) term2231248).get((Object) null);
        Class<? extends Object> term2231540 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2231539 = ((Class) term2231540).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2231539).setAccessible(true);
        Object enum3981 = ((Field) term2231539).get((Object) null);
        term2229015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2229263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2229505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2229015, term2229015.getClass(), "kind", enum3980);
        setField(term2229263, term2229263.getClass(), "kind", enum3981);
        setField(term2229263, term2229263.getClass(), "call", term2229505);
        setField(term2229015, term2229015.getClass(), "typeOfThis", term2229263);
        term2229613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2229795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2229963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2229613, term2229613.getClass(), "kind", enum3980);
        setField(term2229795, term2229795.getClass(), "kind", enum3981);
        setField(term2229795, term2229795.getClass(), "call", term2229963);
        setField(term2229613, term2229613.getClass(), "typeOfThis", term2229795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2229613;
        try {
            callMethod(klass, "isSubtype", argTypes, term2229015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


