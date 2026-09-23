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

public class FunctionType_isSubtype_2101002158663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668843;
     Object term669497;

    public FunctionType_isSubtype_2101002158663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term670855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term670854 = ((Class) term670855).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term670854).setAccessible(true);
        Object enum1207 = ((Field) term670854).get((Object) null);
        term668843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term669387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term668843, term668843.getClass(), "kind", enum1207);
        setField(term669387, term669387.getClass(), "kind", enum1207);
        setField(term668843, term668843.getClass(), "typeOfThis", term669387);
        Class<? extends Object> term671155 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term671154 = ((Class) term671155).getDeclaredField((String) "INTERFACE");
        ((Field) term671154).setAccessible(true);
        Object enum1208 = ((Field) term671154).get((Object) null);
        term669497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term669827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term669497, term669497.getClass(), "kind", enum1207);
        setField(term669827, term669827.getClass(), "kind", enum1208);
        setField(term669497, term669497.getClass(), "typeOfThis", term669827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term669497;
        try {
            callMethod(klass, "isSubtype", argTypes, term668843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


