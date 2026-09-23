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

public class FunctionType_isSubtype_2101002158838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857518;
     Object term858170;

    public FunctionType_isSubtype_2101002158838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term860710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term860709 = ((Class) term860710).getDeclaredField((String) "ORDINARY");
        ((Field) term860709).setAccessible(true);
        Object enum1603 = ((Field) term860709).get((Object) null);
        term857518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term858062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term857518, term857518.getClass(), "kind", enum1603);
        setField(term857518, term857518.getClass(), "typeOfThis", term858062);
        term858170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term858480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term858170, term858170.getClass(), "kind", enum1603);
        setField(term858170, term858170.getClass(), "typeOfThis", term858480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term858170;
        try {
            callMethod(klass, "isSubtype", argTypes, term857518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


