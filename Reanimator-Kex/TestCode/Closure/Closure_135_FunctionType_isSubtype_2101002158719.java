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

public class FunctionType_isSubtype_2101002158719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667632;
     Object term668000;

    public FunctionType_isSubtype_2101002158719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term670752 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term670751 = ((Class) term670752).getDeclaredField((String) "ORDINARY");
        ((Field) term670751).setAccessible(true);
        Object enum1242 = ((Field) term670751).get((Object) null);
        term667632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term667892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term667632, term667632.getClass(), "kind", enum1242);
        setField(term667632, term667632.getClass(), "typeOfThis", term667892);
        Class<? extends Object> term671043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term671042 = ((Class) term671043).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term671042).setAccessible(true);
        Object enum1243 = ((Field) term671042).get((Object) null);
        term668000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term668000, term668000.getClass(), "kind", enum1243);
        setField(term668000, term668000.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term668000;
        try {
            callMethod(klass, "isSubtype", argTypes, term667632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


