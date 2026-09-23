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

public class FunctionType_isSubtype_2101002158379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232075;
     Object term232333;
     Object term232683;
     Object term232687;

    public FunctionType_isSubtype_2101002158379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232690 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232689 = ((Class) term232690).getDeclaredField((String) "INTERFACE");
        ((Field) term232689).setAccessible(true);
        Object enum419 = ((Field) term232689).get((Object) null);
        term232075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term232075, term232075.getClass(), "kind", enum419);
        term232333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term232984 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232983 = ((Class) term232984).getDeclaredField((String) "INTERFACE");
        ((Field) term232983).setAccessible(true);
        Object enum420 = ((Field) term232983).get((Object) null);
        term232683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term232683, term232683.getClass(), "this$0", null);
        setField(term232683, term232683.getClass(), "call", null);
        setField(term232683, term232683.getClass(), "prototype", null);
        setField(term232683, term232683.getClass(), "kind", enum420);
        setField(term232683, term232683.getClass(), "typeOfThis", null);
        setField(term232683, term232683.getClass(), "source", null);
        setField(term232683, term232683.getClass(), "implementedInterfaces", null);
        setField(term232683, term232683.getClass(), "subTypes", null);
        setField(term232683, term232683.getClass(), "templateTypeName", null);
        setField(term232683, term232683.getClass(), "className", null);
        setField(term232683, term232683.getClass(), "properties", null);
        setField(term232683, term232683.getClass(), "implicitPrototype", null);
        setBooleanField(term232683, term232683.getClass(), "nativeType", false);
        setBooleanField(term232683, term232683.getClass(), "visited", false);
        setField(term232683, term232683.getClass(), "docInfo", null);
        setBooleanField(term232683, term232683.getClass(), "unknown", false);
        setBooleanField(term232683, term232683.getClass(), "resolved", false);
        setField(term232683, term232683.getClass(), "resolveResult", null);
        setField(term232683, term232683.getClass(), "registry", null);
        term232687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term232687, term232687.getClass(), "call", null);
        setField(term232687, term232687.getClass(), "prototype", null);
        setField(term232687, term232687.getClass(), "kind", null);
        setField(term232687, term232687.getClass(), "typeOfThis", null);
        setField(term232687, term232687.getClass(), "source", null);
        setField(term232687, term232687.getClass(), "implementedInterfaces", null);
        setField(term232687, term232687.getClass(), "subTypes", null);
        setField(term232687, term232687.getClass(), "templateTypeName", null);
        setField(term232687, term232687.getClass(), "className", null);
        setField(term232687, term232687.getClass(), "properties", null);
        setField(term232687, term232687.getClass(), "implicitPrototype", null);
        setBooleanField(term232687, term232687.getClass(), "nativeType", false);
        setBooleanField(term232687, term232687.getClass(), "visited", false);
        setField(term232687, term232687.getClass(), "docInfo", null);
        setBooleanField(term232687, term232687.getClass(), "unknown", false);
        setBooleanField(term232687, term232687.getClass(), "resolved", false);
        setField(term232687, term232687.getClass(), "resolveResult", null);
        setField(term232687, term232687.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term232333;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term232075, args);
        assertTrue(recursiveEquals(term232075, term232683));
        assertTrue(recursiveEquals(term232333, term232687));
        assertTrue(recursiveEquals(retValue, false));
    }

};


