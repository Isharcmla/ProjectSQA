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

public class FunctionType_isSubtype_2101002158537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408833;
     Object term409089;
     Object term409922;
     Object term409926;

    public FunctionType_isSubtype_2101002158537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term409931 = ((Class) term409932).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term409931).setAccessible(true);
        Object enum757 = ((Field) term409931).get((Object) null);
        term408833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term408833, term408833.getClass(), "kind", enum757);
        Class<? extends Object> term410232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term410231 = ((Class) term410232).getDeclaredField((String) "INTERFACE");
        ((Field) term410231).setAccessible(true);
        Object enum758 = ((Field) term410231).get((Object) null);
        term409089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term409089, term409089.getClass(), "kind", enum758);
        Class<? extends Object> term410526 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term410525 = ((Class) term410526).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term410525).setAccessible(true);
        Object enum759 = ((Field) term410525).get((Object) null);
        term409922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term409922, term409922.getClass(), "this$0", null);
        setField(term409922, term409922.getClass(), "call", null);
        setField(term409922, term409922.getClass(), "prototype", null);
        setField(term409922, term409922.getClass(), "kind", enum759);
        setField(term409922, term409922.getClass(), "typeOfThis", null);
        setField(term409922, term409922.getClass(), "source", null);
        setField(term409922, term409922.getClass(), "implementedInterfaces", null);
        setField(term409922, term409922.getClass(), "subTypes", null);
        setField(term409922, term409922.getClass(), "templateTypeName", null);
        setField(term409922, term409922.getClass(), "className", null);
        setField(term409922, term409922.getClass(), "properties", null);
        setField(term409922, term409922.getClass(), "implicitPrototype", null);
        setBooleanField(term409922, term409922.getClass(), "nativeType", false);
        setBooleanField(term409922, term409922.getClass(), "visited", false);
        setField(term409922, term409922.getClass(), "docInfo", null);
        setBooleanField(term409922, term409922.getClass(), "unknown", false);
        setBooleanField(term409922, term409922.getClass(), "resolved", false);
        setField(term409922, term409922.getClass(), "resolveResult", null);
        setField(term409922, term409922.getClass(), "registry", null);
        Class<? extends Object> term410826 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term410825 = ((Class) term410826).getDeclaredField((String) "INTERFACE");
        ((Field) term410825).setAccessible(true);
        Object enum760 = ((Field) term410825).get((Object) null);
        term409926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term409926, term409926.getClass(), "this$0", null);
        setField(term409926, term409926.getClass(), "call", null);
        setField(term409926, term409926.getClass(), "prototype", null);
        setField(term409926, term409926.getClass(), "kind", enum760);
        setField(term409926, term409926.getClass(), "typeOfThis", null);
        setField(term409926, term409926.getClass(), "source", null);
        setField(term409926, term409926.getClass(), "implementedInterfaces", null);
        setField(term409926, term409926.getClass(), "subTypes", null);
        setField(term409926, term409926.getClass(), "templateTypeName", null);
        setField(term409926, term409926.getClass(), "className", null);
        setField(term409926, term409926.getClass(), "properties", null);
        setField(term409926, term409926.getClass(), "implicitPrototype", null);
        setBooleanField(term409926, term409926.getClass(), "nativeType", false);
        setBooleanField(term409926, term409926.getClass(), "visited", false);
        setField(term409926, term409926.getClass(), "docInfo", null);
        setBooleanField(term409926, term409926.getClass(), "unknown", false);
        setBooleanField(term409926, term409926.getClass(), "resolved", false);
        setField(term409926, term409926.getClass(), "resolveResult", null);
        setField(term409926, term409926.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term409089;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term408833, args);
        assertTrue(recursiveEquals(term408833, term409922));
        assertTrue(recursiveEquals(term409089, term409926));
        assertTrue(recursiveEquals(retValue, true));
    }

};


