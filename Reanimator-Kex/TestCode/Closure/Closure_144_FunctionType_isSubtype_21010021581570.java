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

public class FunctionType_isSubtype_21010021581570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297023;
     Object term2297677;
     Object term2300232;
     Object term2300240;

    public FunctionType_isSubtype_21010021581570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2300250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2300249 = ((Class) term2300250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2300249).setAccessible(true);
        Object enum4101 = ((Field) term2300249).get((Object) null);
        Class<? extends Object> term2300550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2300549 = ((Class) term2300550).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2300549).setAccessible(true);
        Object enum4102 = ((Field) term2300549).get((Object) null);
        term2297023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2297567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2297023, term2297023.getClass(), "kind", enum4101);
        setField(term2297567, term2297567.getClass(), "kind", enum4102);
        setField(term2297023, term2297023.getClass(), "typeOfThis", term2297567);
        term2297677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2297861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2297677, term2297677.getClass(), "kind", enum4102);
        setField(term2297861, term2297861.getClass(), "kind", enum4101);
        setField(term2297677, term2297677.getClass(), "typeOfThis", term2297861);
        Class<? extends Object> term2300850 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2300849 = ((Class) term2300850).getDeclaredField((String) "INTERFACE");
        ((Field) term2300849).setAccessible(true);
        Object enum4103 = ((Field) term2300849).get((Object) null);
        Class<? extends Object> term2301144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2301143 = ((Class) term2301144).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2301143).setAccessible(true);
        Object enum4104 = ((Field) term2301143).get((Object) null);
        term2300232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2300236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2300232, term2300232.getClass(), "call", null);
        setField(term2300232, term2300232.getClass(), "prototype", null);
        setField(term2300232, term2300232.getClass(), "kind", enum4103);
        setField(term2300236, term2300236.getClass(), "call", null);
        setField(term2300236, term2300236.getClass(), "prototype", null);
        setField(term2300236, term2300236.getClass(), "kind", enum4104);
        setField(term2300236, term2300236.getClass(), "typeOfThis", null);
        setField(term2300236, term2300236.getClass(), "source", null);
        setField(term2300236, term2300236.getClass(), "implementedInterfaces", null);
        setField(term2300236, term2300236.getClass(), "subTypes", null);
        setField(term2300236, term2300236.getClass(), "templateTypeName", null);
        setField(term2300236, term2300236.getClass(), "className", null);
        setField(term2300236, term2300236.getClass(), "properties", null);
        setField(term2300236, term2300236.getClass(), "implicitPrototype", null);
        setBooleanField(term2300236, term2300236.getClass(), "nativeType", false);
        setBooleanField(term2300236, term2300236.getClass(), "prettyPrint", false);
        setBooleanField(term2300236, term2300236.getClass(), "visited", false);
        setField(term2300236, term2300236.getClass(), "docInfo", null);
        setBooleanField(term2300236, term2300236.getClass(), "unknown", false);
        setBooleanField(term2300236, term2300236.getClass(), "resolved", false);
        setField(term2300236, term2300236.getClass(), "resolveResult", null);
        setField(term2300236, term2300236.getClass(), "registry", null);
        setField(term2300232, term2300232.getClass(), "typeOfThis", term2300236);
        setField(term2300232, term2300232.getClass(), "source", null);
        setField(term2300232, term2300232.getClass(), "implementedInterfaces", null);
        setField(term2300232, term2300232.getClass(), "subTypes", null);
        setField(term2300232, term2300232.getClass(), "templateTypeName", null);
        setField(term2300232, term2300232.getClass(), "className", null);
        setField(term2300232, term2300232.getClass(), "properties", null);
        setField(term2300232, term2300232.getClass(), "implicitPrototype", null);
        setBooleanField(term2300232, term2300232.getClass(), "nativeType", false);
        setBooleanField(term2300232, term2300232.getClass(), "prettyPrint", false);
        setBooleanField(term2300232, term2300232.getClass(), "visited", false);
        setField(term2300232, term2300232.getClass(), "docInfo", null);
        setBooleanField(term2300232, term2300232.getClass(), "unknown", false);
        setBooleanField(term2300232, term2300232.getClass(), "resolved", false);
        setField(term2300232, term2300232.getClass(), "resolveResult", null);
        setField(term2300232, term2300232.getClass(), "registry", null);
        Class<? extends Object> term2301444 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2301443 = ((Class) term2301444).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2301443).setAccessible(true);
        Object enum4105 = ((Field) term2301443).get((Object) null);
        Class<? extends Object> term2301744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2301743 = ((Class) term2301744).getDeclaredField((String) "INTERFACE");
        ((Field) term2301743).setAccessible(true);
        Object enum4106 = ((Field) term2301743).get((Object) null);
        term2300240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2300244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2300240, term2300240.getClass(), "call", null);
        setField(term2300240, term2300240.getClass(), "prototype", null);
        setField(term2300240, term2300240.getClass(), "kind", enum4105);
        setField(term2300244, term2300244.getClass(), "call", null);
        setField(term2300244, term2300244.getClass(), "prototype", null);
        setField(term2300244, term2300244.getClass(), "kind", enum4106);
        setField(term2300244, term2300244.getClass(), "typeOfThis", null);
        setField(term2300244, term2300244.getClass(), "source", null);
        setField(term2300244, term2300244.getClass(), "implementedInterfaces", null);
        setField(term2300244, term2300244.getClass(), "subTypes", null);
        setField(term2300244, term2300244.getClass(), "templateTypeName", null);
        setField(term2300244, term2300244.getClass(), "className", null);
        setField(term2300244, term2300244.getClass(), "properties", null);
        setField(term2300244, term2300244.getClass(), "implicitPrototype", null);
        setBooleanField(term2300244, term2300244.getClass(), "nativeType", false);
        setBooleanField(term2300244, term2300244.getClass(), "prettyPrint", false);
        setBooleanField(term2300244, term2300244.getClass(), "visited", false);
        setField(term2300244, term2300244.getClass(), "docInfo", null);
        setBooleanField(term2300244, term2300244.getClass(), "unknown", false);
        setBooleanField(term2300244, term2300244.getClass(), "resolved", false);
        setField(term2300244, term2300244.getClass(), "resolveResult", null);
        setField(term2300244, term2300244.getClass(), "registry", null);
        setField(term2300240, term2300240.getClass(), "typeOfThis", term2300244);
        setField(term2300240, term2300240.getClass(), "source", null);
        setField(term2300240, term2300240.getClass(), "implementedInterfaces", null);
        setField(term2300240, term2300240.getClass(), "subTypes", null);
        setField(term2300240, term2300240.getClass(), "templateTypeName", null);
        setField(term2300240, term2300240.getClass(), "className", null);
        setField(term2300240, term2300240.getClass(), "properties", null);
        setField(term2300240, term2300240.getClass(), "implicitPrototype", null);
        setBooleanField(term2300240, term2300240.getClass(), "nativeType", false);
        setBooleanField(term2300240, term2300240.getClass(), "prettyPrint", false);
        setBooleanField(term2300240, term2300240.getClass(), "visited", false);
        setField(term2300240, term2300240.getClass(), "docInfo", null);
        setBooleanField(term2300240, term2300240.getClass(), "unknown", false);
        setBooleanField(term2300240, term2300240.getClass(), "resolved", false);
        setField(term2300240, term2300240.getClass(), "resolveResult", null);
        setField(term2300240, term2300240.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2297677;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2297023, args);
        assertTrue(recursiveEquals(term2297023, term2300232));
        assertTrue(recursiveEquals(term2297677, term2300240));
        assertTrue(recursiveEquals(retValue, false));
    }

};


