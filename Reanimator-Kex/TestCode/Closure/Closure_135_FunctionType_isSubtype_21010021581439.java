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

public class FunctionType_isSubtype_21010021581439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1867210;
     Object term1867566;

    public FunctionType_isSubtype_21010021581439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1868863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1868862 = ((Class) term1868863).getDeclaredField((String) "ORDINARY");
        ((Field) term1868862).setAccessible(true);
        Object enum3480 = ((Field) term1868862).get((Object) null);
        term1867210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1867458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1867210, term1867210.getClass(), "kind", enum3480);
        setField(term1867458, term1867458.getClass(), "kind", enum3480);
        setField(term1867210, term1867210.getClass(), "typeOfThis", term1867458);
        Class<? extends Object> term1869154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1869153 = ((Class) term1869154).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1869153).setAccessible(true);
        Object enum3481 = ((Field) term1869153).get((Object) null);
        term1867566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1867748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1867566, term1867566.getClass(), "kind", enum3480);
        setField(term1867748, term1867748.getClass(), "kind", enum3481);
        setField(term1867566, term1867566.getClass(), "typeOfThis", term1867748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1867566;
        try {
            callMethod(klass, "isSubtype", argTypes, term1867210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


