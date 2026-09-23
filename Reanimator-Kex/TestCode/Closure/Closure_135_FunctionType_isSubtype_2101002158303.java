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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163650;
     Object term163906;
     Object term164256;
     Object term164260;

    public FunctionType_isSubtype_2101002158303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164263 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164262 = ((Class) term164263).getDeclaredField((String) "INTERFACE");
        ((Field) term164262).setAccessible(true);
        Object enum298 = ((Field) term164262).get((Object) null);
        term163650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term163650, term163650.getClass(), "kind", enum298);
        term163906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term164557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164556 = ((Class) term164557).getDeclaredField((String) "INTERFACE");
        ((Field) term164556).setAccessible(true);
        Object enum299 = ((Field) term164556).get((Object) null);
        term164256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term164256, term164256.getClass(), "this$0", null);
        setField(term164256, term164256.getClass(), "call", null);
        setField(term164256, term164256.getClass(), "prototype", null);
        setField(term164256, term164256.getClass(), "kind", enum299);
        setField(term164256, term164256.getClass(), "typeOfThis", null);
        setField(term164256, term164256.getClass(), "source", null);
        setField(term164256, term164256.getClass(), "implementedInterfaces", null);
        setField(term164256, term164256.getClass(), "subTypes", null);
        setField(term164256, term164256.getClass(), "templateTypeName", null);
        setField(term164256, term164256.getClass(), "className", null);
        setField(term164256, term164256.getClass(), "properties", null);
        setField(term164256, term164256.getClass(), "implicitPrototype", null);
        setBooleanField(term164256, term164256.getClass(), "nativeType", false);
        setBooleanField(term164256, term164256.getClass(), "visited", false);
        setField(term164256, term164256.getClass(), "docInfo", null);
        setBooleanField(term164256, term164256.getClass(), "unknown", false);
        setBooleanField(term164256, term164256.getClass(), "resolved", false);
        setField(term164256, term164256.getClass(), "resolveResult", null);
        setField(term164256, term164256.getClass(), "registry", null);
        term164260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term164260, term164260.getClass(), "this$0", null);
        setField(term164260, term164260.getClass(), "call", null);
        setField(term164260, term164260.getClass(), "prototype", null);
        setField(term164260, term164260.getClass(), "kind", null);
        setField(term164260, term164260.getClass(), "typeOfThis", null);
        setField(term164260, term164260.getClass(), "source", null);
        setField(term164260, term164260.getClass(), "implementedInterfaces", null);
        setField(term164260, term164260.getClass(), "subTypes", null);
        setField(term164260, term164260.getClass(), "templateTypeName", null);
        setField(term164260, term164260.getClass(), "className", null);
        setField(term164260, term164260.getClass(), "properties", null);
        setField(term164260, term164260.getClass(), "implicitPrototype", null);
        setBooleanField(term164260, term164260.getClass(), "nativeType", false);
        setBooleanField(term164260, term164260.getClass(), "visited", false);
        setField(term164260, term164260.getClass(), "docInfo", null);
        setBooleanField(term164260, term164260.getClass(), "unknown", false);
        setBooleanField(term164260, term164260.getClass(), "resolved", false);
        setField(term164260, term164260.getClass(), "resolveResult", null);
        setField(term164260, term164260.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term163906;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term163650, args);
        assertTrue(recursiveEquals(term163650, term164256));
        assertTrue(recursiveEquals(term163906, term164260));
        assertTrue(recursiveEquals(retValue, false));
    }

};


