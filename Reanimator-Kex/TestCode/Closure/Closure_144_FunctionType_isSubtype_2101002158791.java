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

public class FunctionType_isSubtype_2101002158791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899519;
     Object term900171;

    public FunctionType_isSubtype_2101002158791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term901410 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term901409 = ((Class) term901410).getDeclaredField((String) "ORDINARY");
        ((Field) term901409).setAccessible(true);
        Object enum1629 = ((Field) term901409).get((Object) null);
        Class<? extends Object> term901701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term901700 = ((Class) term901701).getDeclaredField((String) "INTERFACE");
        ((Field) term901700).setAccessible(true);
        Object enum1630 = ((Field) term901700).get((Object) null);
        term899519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term900063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term899519, term899519.getClass(), "kind", enum1629);
        setField(term900063, term900063.getClass(), "kind", enum1630);
        setField(term899519, term899519.getClass(), "typeOfThis", term900063);
        term900171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term900501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term900171, term900171.getClass(), "kind", enum1629);
        setField(term900501, term900501.getClass(), "kind", enum1629);
        setField(term900171, term900171.getClass(), "typeOfThis", term900501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term900171;
        try {
            callMethod(klass, "isSubtype", argTypes, term899519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


