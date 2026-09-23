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

public class FunctionType_isSubtype_21010021581113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306902;
     Object term1307654;

    public FunctionType_isSubtype_21010021581113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1308966 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1308965 = ((Class) term1308966).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1308965).setAccessible(true);
        Object enum2441 = ((Field) term1308965).get((Object) null);
        term1306902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1307446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1307546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1306902, term1306902.getClass(), "kind", enum2441);
        setField(term1307446, term1307446.getClass(), "kind", enum2441);
        setField(term1307446, term1307446.getClass(), "typeOfThis", term1307546);
        setField(term1306902, term1306902.getClass(), "typeOfThis", term1307446);
        Class<? extends Object> term1309266 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1309265 = ((Class) term1309266).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1309265).setAccessible(true);
        Object enum2442 = ((Field) term1309265).get((Object) null);
        term1307654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1307976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1307654, term1307654.getClass(), "kind", enum2441);
        setField(term1307976, term1307976.getClass(), "kind", enum2442);
        setField(term1307976, term1307976.getClass(), "typeOfThis", null);
        setField(term1307654, term1307654.getClass(), "typeOfThis", term1307976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1307654;
        try {
            callMethod(klass, "isSubtype", argTypes, term1306902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


