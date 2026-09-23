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

public class FunctionType_isEquivalentTo_230708275731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793530;
     Object term794194;
     Object term794780;
     Object term794785;

    public FunctionType_isEquivalentTo_230708275731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term794791 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term794790 = ((Class) term794791).getDeclaredField((String) "ORDINARY");
        ((Field) term794790).setAccessible(true);
        Object enum1432 = ((Field) term794790).get((Object) null);
        term793530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term794084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term793530, term793530.getClass(), "kind", enum1432);
        setField(term793530, term793530.getClass(), "typeOfThis", term794084);
        term794194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term794194, term794194.getClass(), "kind", enum1432);
        setField(term794194, term794194.getClass(), "typeOfThis", null);
        Class<? extends Object> term795082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term795081 = ((Class) term795082).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term795081).setAccessible(true);
        Object enum1433 = ((Field) term795081).get((Object) null);
        term794780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term794784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term794780, term794780.getClass(), "call", null);
        setField(term794780, term794780.getClass(), "prototype", null);
        setField(term794780, term794780.getClass(), "kind", enum1433);
        setField(term794784, term794784.getClass(), "parameterType", null);
        setField(term794784, term794784.getClass(), "referencedType", null);
        setBooleanField(term794784, term794784.getClass(), "visited", false);
        setField(term794784, term794784.getClass(), "docInfo", null);
        setBooleanField(term794784, term794784.getClass(), "unknown", false);
        setBooleanField(term794784, term794784.getClass(), "resolved", false);
        setField(term794784, term794784.getClass(), "resolveResult", null);
        setField(term794784, term794784.getClass(), "registry", null);
        setField(term794780, term794780.getClass(), "typeOfThis", term794784);
        setField(term794780, term794780.getClass(), "source", null);
        setField(term794780, term794780.getClass(), "implementedInterfaces", null);
        setField(term794780, term794780.getClass(), "subTypes", null);
        setField(term794780, term794780.getClass(), "templateTypeName", null);
        setField(term794780, term794780.getClass(), "className", null);
        setField(term794780, term794780.getClass(), "properties", null);
        setField(term794780, term794780.getClass(), "implicitPrototype", null);
        setBooleanField(term794780, term794780.getClass(), "nativeType", false);
        setBooleanField(term794780, term794780.getClass(), "prettyPrint", false);
        setBooleanField(term794780, term794780.getClass(), "visited", false);
        setField(term794780, term794780.getClass(), "docInfo", null);
        setBooleanField(term794780, term794780.getClass(), "unknown", false);
        setBooleanField(term794780, term794780.getClass(), "resolved", false);
        setField(term794780, term794780.getClass(), "resolveResult", null);
        setField(term794780, term794780.getClass(), "registry", null);
        Class<? extends Object> term795382 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term795381 = ((Class) term795382).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term795381).setAccessible(true);
        Object enum1434 = ((Field) term795381).get((Object) null);
        term794785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term794785, term794785.getClass(), "call", null);
        setField(term794785, term794785.getClass(), "prototype", null);
        setField(term794785, term794785.getClass(), "kind", enum1434);
        setField(term794785, term794785.getClass(), "typeOfThis", null);
        setField(term794785, term794785.getClass(), "source", null);
        setField(term794785, term794785.getClass(), "implementedInterfaces", null);
        setField(term794785, term794785.getClass(), "subTypes", null);
        setField(term794785, term794785.getClass(), "templateTypeName", null);
        setField(term794785, term794785.getClass(), "className", null);
        setField(term794785, term794785.getClass(), "properties", null);
        setField(term794785, term794785.getClass(), "implicitPrototype", null);
        setBooleanField(term794785, term794785.getClass(), "nativeType", false);
        setBooleanField(term794785, term794785.getClass(), "prettyPrint", false);
        setBooleanField(term794785, term794785.getClass(), "visited", false);
        setField(term794785, term794785.getClass(), "docInfo", null);
        setBooleanField(term794785, term794785.getClass(), "unknown", false);
        setBooleanField(term794785, term794785.getClass(), "resolved", false);
        setField(term794785, term794785.getClass(), "resolveResult", null);
        setField(term794785, term794785.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term794194;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term793530, args);
        assertTrue(recursiveEquals(term793530, term794780));
        assertTrue(recursiveEquals(term794194, term794785));
        assertTrue(recursiveEquals(retValue, false));
    }

};


