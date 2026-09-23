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

public class FunctionType_getGreatestSubtype_6795917091516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997724;
     Object term1998300;

    public FunctionType_getGreatestSubtype_6795917091516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2001465 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2001464 = ((Class) term2001465).getDeclaredField((String) "ORDINARY");
        ((Field) term2001464).setAccessible(true);
        Object enum3724 = ((Field) term2001464).get((Object) null);
        term1997724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1997980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1998088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1998192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1997724, term1997724.getClass(), "kind", enum3724);
        setField(term1997980, term1997980.getClass(), "kind", enum3724);
        setField(term1997980, term1997980.getClass(), "typeOfThis", term1998088);
        setField(term1997724, term1997724.getClass(), "typeOfThis", term1997980);
        setField(term1997724, term1997724.getClass(), "registry", term1998192);
        Class<? extends Object> term2001756 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2001755 = ((Class) term2001756).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2001755).setAccessible(true);
        Object enum3725 = ((Field) term2001755).get((Object) null);
        term1998300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1998474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1998300, term1998300.getClass(), "kind", enum3724);
        setField(term1998474, term1998474.getClass(), "kind", enum3725);
        setField(term1998474, term1998474.getClass(), "typeOfThis", null);
        setField(term1998300, term1998300.getClass(), "typeOfThis", term1998474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1998300;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1997724, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


