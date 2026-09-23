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

public class FunctionType_isSubtype_2101002158441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353738;
     Object term354390;

    public FunctionType_isSubtype_2101002158441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term355631 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term355630 = ((Class) term355631).getDeclaredField((String) "ORDINARY");
        ((Field) term355630).setAccessible(true);
        Object enum645 = ((Field) term355630).get((Object) null);
        term353738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term354282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term353738, term353738.getClass(), "kind", enum645);
        setField(term354282, term354282.getClass(), "kind", enum645);
        setField(term353738, term353738.getClass(), "typeOfThis", term354282);
        Class<? extends Object> term355922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term355921 = ((Class) term355922).getDeclaredField((String) "INTERFACE");
        ((Field) term355921).setAccessible(true);
        Object enum646 = ((Field) term355921).get((Object) null);
        term354390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term354722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term354390, term354390.getClass(), "kind", enum645);
        setField(term354722, term354722.getClass(), "kind", enum646);
        setField(term354390, term354390.getClass(), "typeOfThis", term354722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term354390;
        try {
            callMethod(klass, "isSubtype", argTypes, term353738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


