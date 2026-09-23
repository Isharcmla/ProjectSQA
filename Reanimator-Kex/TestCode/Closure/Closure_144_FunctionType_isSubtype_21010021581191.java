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

public class FunctionType_isSubtype_21010021581191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1606195;
     Object term1606645;

    public FunctionType_isSubtype_21010021581191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1607903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1607902 = ((Class) term1607903).getDeclaredField((String) "ORDINARY");
        ((Field) term1607902).setAccessible(true);
        Object enum2872 = ((Field) term1607902).get((Object) null);
        term1606195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1606443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1606537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1606195, term1606195.getClass(), "kind", enum2872);
        setField(term1606195, term1606195.getClass(), "typeOfThis", term1606443);
        setField(term1606195, term1606195.getClass(), "call", term1606537);
        Class<? extends Object> term1608194 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1608193 = ((Class) term1608194).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1608193).setAccessible(true);
        Object enum2873 = ((Field) term1608193).get((Object) null);
        term1606645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1606887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1606645, term1606645.getClass(), "kind", enum2873);
        setField(term1606645, term1606645.getClass(), "typeOfThis", null);
        setField(term1606645, term1606645.getClass(), "call", term1606887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1606645;
        try {
            callMethod(klass, "isSubtype", argTypes, term1606195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


