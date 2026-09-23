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

public class FunctionType_isSubtype_21010021581435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049410;
     Object term2050010;
     Object term2053297;
     Object term2053306;

    public FunctionType_isSubtype_21010021581435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2053313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2053312 = ((Class) term2053313).getDeclaredField((String) "ORDINARY");
        ((Field) term2053312).setAccessible(true);
        Object enum3650 = ((Field) term2053312).get((Object) null);
        Class<? extends Object> term2053604 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2053603 = ((Class) term2053604).getDeclaredField((String) "INTERFACE");
        ((Field) term2053603).setAccessible(true);
        Object enum3651 = ((Field) term2053603).get((Object) null);
        term2049410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2049658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2049900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2049410, term2049410.getClass(), "kind", enum3650);
        setField(term2049658, term2049658.getClass(), "kind", enum3651);
        setField(term2049410, term2049410.getClass(), "typeOfThis", term2049658);
        setField(term2049410, term2049410.getClass(), "call", term2049900);
        term2050010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2050194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2050010, term2050010.getClass(), "kind", enum3650);
        setField(term2050194, term2050194.getClass(), "kind", enum3650);
        setField(term2050010, term2050010.getClass(), "typeOfThis", term2050194);
        setField(term2050010, term2050010.getClass(), "call", null);
        Class<? extends Object> term2053898 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2053897 = ((Class) term2053898).getDeclaredField((String) "ORDINARY");
        ((Field) term2053897).setAccessible(true);
        Object enum3652 = ((Field) term2053897).get((Object) null);
        Class<? extends Object> term2054189 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2054188 = ((Class) term2054189).getDeclaredField((String) "INTERFACE");
        ((Field) term2054188).setAccessible(true);
        Object enum3653 = ((Field) term2054188).get((Object) null);
        term2053297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2053298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2053302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2053298, term2053298.getClass(), "parameters", null);
        setField(term2053298, term2053298.getClass(), "returnType", null);
        setBooleanField(term2053298, term2053298.getClass(), "returnTypeInferred", false);
        setBooleanField(term2053298, term2053298.getClass(), "resolved", false);
        setField(term2053298, term2053298.getClass(), "resolveResult", null);
        setField(term2053298, term2053298.getClass(), "registry", null);
        setField(term2053297, term2053297.getClass(), "call", term2053298);
        setField(term2053297, term2053297.getClass(), "prototype", null);
        setField(term2053297, term2053297.getClass(), "kind", enum3652);
        setField(term2053302, term2053302.getClass(), "call", null);
        setField(term2053302, term2053302.getClass(), "prototype", null);
        setField(term2053302, term2053302.getClass(), "kind", enum3653);
        setField(term2053302, term2053302.getClass(), "typeOfThis", null);
        setField(term2053302, term2053302.getClass(), "source", null);
        setField(term2053302, term2053302.getClass(), "implementedInterfaces", null);
        setField(term2053302, term2053302.getClass(), "subTypes", null);
        setField(term2053302, term2053302.getClass(), "templateTypeName", null);
        setField(term2053302, term2053302.getClass(), "className", null);
        setField(term2053302, term2053302.getClass(), "properties", null);
        setField(term2053302, term2053302.getClass(), "implicitPrototype", null);
        setBooleanField(term2053302, term2053302.getClass(), "nativeType", false);
        setBooleanField(term2053302, term2053302.getClass(), "prettyPrint", false);
        setBooleanField(term2053302, term2053302.getClass(), "visited", false);
        setField(term2053302, term2053302.getClass(), "docInfo", null);
        setBooleanField(term2053302, term2053302.getClass(), "unknown", false);
        setBooleanField(term2053302, term2053302.getClass(), "resolved", false);
        setField(term2053302, term2053302.getClass(), "resolveResult", null);
        setField(term2053302, term2053302.getClass(), "registry", null);
        setField(term2053297, term2053297.getClass(), "typeOfThis", term2053302);
        setField(term2053297, term2053297.getClass(), "source", null);
        setField(term2053297, term2053297.getClass(), "implementedInterfaces", null);
        setField(term2053297, term2053297.getClass(), "subTypes", null);
        setField(term2053297, term2053297.getClass(), "templateTypeName", null);
        setField(term2053297, term2053297.getClass(), "className", null);
        setField(term2053297, term2053297.getClass(), "properties", null);
        setField(term2053297, term2053297.getClass(), "implicitPrototype", null);
        setBooleanField(term2053297, term2053297.getClass(), "nativeType", false);
        setBooleanField(term2053297, term2053297.getClass(), "prettyPrint", false);
        setBooleanField(term2053297, term2053297.getClass(), "visited", false);
        setField(term2053297, term2053297.getClass(), "docInfo", null);
        setBooleanField(term2053297, term2053297.getClass(), "unknown", false);
        setBooleanField(term2053297, term2053297.getClass(), "resolved", false);
        setField(term2053297, term2053297.getClass(), "resolveResult", null);
        setField(term2053297, term2053297.getClass(), "registry", null);
        Class<? extends Object> term2054483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2054482 = ((Class) term2054483).getDeclaredField((String) "ORDINARY");
        ((Field) term2054482).setAccessible(true);
        Object enum3654 = ((Field) term2054482).get((Object) null);
        term2053306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2053310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2053306, term2053306.getClass(), "call", null);
        setField(term2053306, term2053306.getClass(), "prototype", null);
        setField(term2053306, term2053306.getClass(), "kind", enum3654);
        setField(term2053310, term2053310.getClass(), "call", null);
        setField(term2053310, term2053310.getClass(), "prototype", null);
        setField(term2053310, term2053310.getClass(), "kind", enum3654);
        setField(term2053310, term2053310.getClass(), "typeOfThis", null);
        setField(term2053310, term2053310.getClass(), "source", null);
        setField(term2053310, term2053310.getClass(), "implementedInterfaces", null);
        setField(term2053310, term2053310.getClass(), "subTypes", null);
        setField(term2053310, term2053310.getClass(), "templateTypeName", null);
        setField(term2053310, term2053310.getClass(), "className", null);
        setField(term2053310, term2053310.getClass(), "properties", null);
        setField(term2053310, term2053310.getClass(), "implicitPrototype", null);
        setBooleanField(term2053310, term2053310.getClass(), "nativeType", false);
        setBooleanField(term2053310, term2053310.getClass(), "prettyPrint", false);
        setBooleanField(term2053310, term2053310.getClass(), "visited", false);
        setField(term2053310, term2053310.getClass(), "docInfo", null);
        setBooleanField(term2053310, term2053310.getClass(), "unknown", false);
        setBooleanField(term2053310, term2053310.getClass(), "resolved", false);
        setField(term2053310, term2053310.getClass(), "resolveResult", null);
        setField(term2053310, term2053310.getClass(), "registry", null);
        setField(term2053306, term2053306.getClass(), "typeOfThis", term2053310);
        setField(term2053306, term2053306.getClass(), "source", null);
        setField(term2053306, term2053306.getClass(), "implementedInterfaces", null);
        setField(term2053306, term2053306.getClass(), "subTypes", null);
        setField(term2053306, term2053306.getClass(), "templateTypeName", null);
        setField(term2053306, term2053306.getClass(), "className", null);
        setField(term2053306, term2053306.getClass(), "properties", null);
        setField(term2053306, term2053306.getClass(), "implicitPrototype", null);
        setBooleanField(term2053306, term2053306.getClass(), "nativeType", false);
        setBooleanField(term2053306, term2053306.getClass(), "prettyPrint", false);
        setBooleanField(term2053306, term2053306.getClass(), "visited", false);
        setField(term2053306, term2053306.getClass(), "docInfo", null);
        setBooleanField(term2053306, term2053306.getClass(), "unknown", false);
        setBooleanField(term2053306, term2053306.getClass(), "resolved", false);
        setField(term2053306, term2053306.getClass(), "resolveResult", null);
        setField(term2053306, term2053306.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2050010;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2049410, args);
        assertTrue(recursiveEquals(term2049410, term2053297));
        assertTrue(recursiveEquals(term2050010, term2053306));
        assertTrue(recursiveEquals(retValue, false));
    }

};


