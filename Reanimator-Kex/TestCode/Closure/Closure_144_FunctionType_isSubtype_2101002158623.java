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

public class FunctionType_isSubtype_2101002158623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614318;
     Object term614770;
     Object term615794;
     Object term615800;

    public FunctionType_isSubtype_2101002158623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term615807 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term615806 = ((Class) term615807).getDeclaredField((String) "ORDINARY");
        ((Field) term615806).setAccessible(true);
        Object enum1113 = ((Field) term615806).get((Object) null);
        term614318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term614566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term614660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term614318, term614318.getClass(), "kind", enum1113);
        setField(term614318, term614318.getClass(), "typeOfThis", term614566);
        setField(term614318, term614318.getClass(), "call", term614660);
        Class<? extends Object> term616098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616097 = ((Class) term616098).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term616097).setAccessible(true);
        Object enum1114 = ((Field) term616097).get((Object) null);
        term614770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term615028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term614770, term614770.getClass(), "kind", enum1114);
        setField(term614770, term614770.getClass(), "typeOfThis", term615028);
        setField(term614770, term614770.getClass(), "call", null);
        Class<? extends Object> term616398 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616397 = ((Class) term616398).getDeclaredField((String) "ORDINARY");
        ((Field) term616397).setAccessible(true);
        Object enum1115 = ((Field) term616397).get((Object) null);
        term615794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term615795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term615799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term615795, term615795.getClass(), "parameters", null);
        setField(term615795, term615795.getClass(), "returnType", null);
        setBooleanField(term615795, term615795.getClass(), "returnTypeInferred", false);
        setBooleanField(term615795, term615795.getClass(), "resolved", false);
        setField(term615795, term615795.getClass(), "resolveResult", null);
        setField(term615795, term615795.getClass(), "registry", null);
        setField(term615794, term615794.getClass(), "call", term615795);
        setField(term615794, term615794.getClass(), "prototype", null);
        setField(term615794, term615794.getClass(), "kind", enum1115);
        setField(term615799, term615799.getClass(), "call", null);
        setField(term615799, term615799.getClass(), "prototype", null);
        setField(term615799, term615799.getClass(), "kind", null);
        setField(term615799, term615799.getClass(), "typeOfThis", null);
        setField(term615799, term615799.getClass(), "source", null);
        setField(term615799, term615799.getClass(), "implementedInterfaces", null);
        setField(term615799, term615799.getClass(), "subTypes", null);
        setField(term615799, term615799.getClass(), "templateTypeName", null);
        setField(term615799, term615799.getClass(), "className", null);
        setField(term615799, term615799.getClass(), "properties", null);
        setField(term615799, term615799.getClass(), "implicitPrototype", null);
        setBooleanField(term615799, term615799.getClass(), "nativeType", false);
        setBooleanField(term615799, term615799.getClass(), "prettyPrint", false);
        setBooleanField(term615799, term615799.getClass(), "visited", false);
        setField(term615799, term615799.getClass(), "docInfo", null);
        setBooleanField(term615799, term615799.getClass(), "unknown", false);
        setBooleanField(term615799, term615799.getClass(), "resolved", false);
        setField(term615799, term615799.getClass(), "resolveResult", null);
        setField(term615799, term615799.getClass(), "registry", null);
        setField(term615794, term615794.getClass(), "typeOfThis", term615799);
        setField(term615794, term615794.getClass(), "source", null);
        setField(term615794, term615794.getClass(), "implementedInterfaces", null);
        setField(term615794, term615794.getClass(), "subTypes", null);
        setField(term615794, term615794.getClass(), "templateTypeName", null);
        setField(term615794, term615794.getClass(), "className", null);
        setField(term615794, term615794.getClass(), "properties", null);
        setField(term615794, term615794.getClass(), "implicitPrototype", null);
        setBooleanField(term615794, term615794.getClass(), "nativeType", false);
        setBooleanField(term615794, term615794.getClass(), "prettyPrint", false);
        setBooleanField(term615794, term615794.getClass(), "visited", false);
        setField(term615794, term615794.getClass(), "docInfo", null);
        setBooleanField(term615794, term615794.getClass(), "unknown", false);
        setBooleanField(term615794, term615794.getClass(), "resolved", false);
        setField(term615794, term615794.getClass(), "resolveResult", null);
        setField(term615794, term615794.getClass(), "registry", null);
        Class<? extends Object> term616689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616688 = ((Class) term616689).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term616688).setAccessible(true);
        Object enum1116 = ((Field) term616688).get((Object) null);
        term615800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term615804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term615800, term615800.getClass(), "call", null);
        setField(term615800, term615800.getClass(), "prototype", null);
        setField(term615800, term615800.getClass(), "kind", enum1116);
        setField(term615804, term615804.getClass(), "parameterType", null);
        setField(term615804, term615804.getClass(), "referencedType", null);
        setBooleanField(term615804, term615804.getClass(), "visited", false);
        setField(term615804, term615804.getClass(), "docInfo", null);
        setBooleanField(term615804, term615804.getClass(), "unknown", false);
        setBooleanField(term615804, term615804.getClass(), "resolved", false);
        setField(term615804, term615804.getClass(), "resolveResult", null);
        setField(term615804, term615804.getClass(), "registry", null);
        setField(term615800, term615800.getClass(), "typeOfThis", term615804);
        setField(term615800, term615800.getClass(), "source", null);
        setField(term615800, term615800.getClass(), "implementedInterfaces", null);
        setField(term615800, term615800.getClass(), "subTypes", null);
        setField(term615800, term615800.getClass(), "templateTypeName", null);
        setField(term615800, term615800.getClass(), "className", null);
        setField(term615800, term615800.getClass(), "properties", null);
        setField(term615800, term615800.getClass(), "implicitPrototype", null);
        setBooleanField(term615800, term615800.getClass(), "nativeType", false);
        setBooleanField(term615800, term615800.getClass(), "prettyPrint", false);
        setBooleanField(term615800, term615800.getClass(), "visited", false);
        setField(term615800, term615800.getClass(), "docInfo", null);
        setBooleanField(term615800, term615800.getClass(), "unknown", false);
        setBooleanField(term615800, term615800.getClass(), "resolved", false);
        setField(term615800, term615800.getClass(), "resolveResult", null);
        setField(term615800, term615800.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term614770;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term614318, args);
        assertTrue(recursiveEquals(term614318, term615794));
        assertTrue(recursiveEquals(term614770, term615800));
        assertTrue(recursiveEquals(retValue, false));
    }

};


