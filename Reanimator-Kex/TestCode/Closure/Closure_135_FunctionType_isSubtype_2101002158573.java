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

public class FunctionType_isSubtype_2101002158573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462551;
     Object term463211;

    public FunctionType_isSubtype_2101002158573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term464368 = ((Class) term464369).getDeclaredField((String) "INTERFACE");
        ((Field) term464368).setAccessible(true);
        Object enum860 = ((Field) term464368).get((Object) null);
        term462551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term463103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term462551, term462551.getClass(), "kind", enum860);
        setField(term462551, term462551.getClass(), "typeOfThis", term463103);
        Class<? extends Object> term464663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term464662 = ((Class) term464663).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term464662).setAccessible(true);
        Object enum861 = ((Field) term464662).get((Object) null);
        term463211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term463385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term463211, term463211.getClass(), "kind", enum861);
        setField(term463211, term463211.getClass(), "typeOfThis", term463385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term463211;
        try {
            callMethod(klass, "isSubtype", argTypes, term462551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


