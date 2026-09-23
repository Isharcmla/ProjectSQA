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

public class FunctionType_isSubtype_2101002158845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868456;
     Object term869118;
     Object term871434;
     Object term871439;

    public FunctionType_isSubtype_2101002158845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term871445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term871444 = ((Class) term871445).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term871444).setAccessible(true);
        Object enum1624 = ((Field) term871444).get((Object) null);
        term868456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term869010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term868456, term868456.getClass(), "kind", enum1624);
        setField(term868456, term868456.getClass(), "typeOfThis", term869010);
        Class<? extends Object> term871745 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term871744 = ((Class) term871745).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term871744).setAccessible(true);
        Object enum1625 = ((Field) term871744).get((Object) null);
        term869118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term869118, term869118.getClass(), "kind", enum1625);
        setField(term869118, term869118.getClass(), "typeOfThis", null);
        Class<? extends Object> term872045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term872044 = ((Class) term872045).getDeclaredField((String) "INTERFACE");
        ((Field) term872044).setAccessible(true);
        Object enum1626 = ((Field) term872044).get((Object) null);
        term871434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term871438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term871434, term871434.getClass(), "this$0", null);
        setField(term871434, term871434.getClass(), "call", null);
        setField(term871434, term871434.getClass(), "prototype", null);
        setField(term871434, term871434.getClass(), "kind", enum1626);
        setField(term871438, term871438.getClass(), "parameterType", null);
        setField(term871438, term871438.getClass(), "referencedType", null);
        setBooleanField(term871438, term871438.getClass(), "visited", false);
        setField(term871438, term871438.getClass(), "docInfo", null);
        setBooleanField(term871438, term871438.getClass(), "unknown", false);
        setBooleanField(term871438, term871438.getClass(), "resolved", false);
        setField(term871438, term871438.getClass(), "resolveResult", null);
        setField(term871438, term871438.getClass(), "registry", null);
        setField(term871434, term871434.getClass(), "typeOfThis", term871438);
        setField(term871434, term871434.getClass(), "source", null);
        setField(term871434, term871434.getClass(), "implementedInterfaces", null);
        setField(term871434, term871434.getClass(), "subTypes", null);
        setField(term871434, term871434.getClass(), "templateTypeName", null);
        setField(term871434, term871434.getClass(), "className", null);
        setField(term871434, term871434.getClass(), "properties", null);
        setField(term871434, term871434.getClass(), "implicitPrototype", null);
        setBooleanField(term871434, term871434.getClass(), "nativeType", false);
        setBooleanField(term871434, term871434.getClass(), "visited", false);
        setField(term871434, term871434.getClass(), "docInfo", null);
        setBooleanField(term871434, term871434.getClass(), "unknown", false);
        setBooleanField(term871434, term871434.getClass(), "resolved", false);
        setField(term871434, term871434.getClass(), "resolveResult", null);
        setField(term871434, term871434.getClass(), "registry", null);
        Class<? extends Object> term872339 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term872338 = ((Class) term872339).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term872338).setAccessible(true);
        Object enum1627 = ((Field) term872338).get((Object) null);
        term871439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term871439, term871439.getClass(), "this$0", null);
        setField(term871439, term871439.getClass(), "call", null);
        setField(term871439, term871439.getClass(), "prototype", null);
        setField(term871439, term871439.getClass(), "kind", enum1627);
        setField(term871439, term871439.getClass(), "typeOfThis", null);
        setField(term871439, term871439.getClass(), "source", null);
        setField(term871439, term871439.getClass(), "implementedInterfaces", null);
        setField(term871439, term871439.getClass(), "subTypes", null);
        setField(term871439, term871439.getClass(), "templateTypeName", null);
        setField(term871439, term871439.getClass(), "className", null);
        setField(term871439, term871439.getClass(), "properties", null);
        setField(term871439, term871439.getClass(), "implicitPrototype", null);
        setBooleanField(term871439, term871439.getClass(), "nativeType", false);
        setBooleanField(term871439, term871439.getClass(), "visited", false);
        setField(term871439, term871439.getClass(), "docInfo", null);
        setBooleanField(term871439, term871439.getClass(), "unknown", false);
        setBooleanField(term871439, term871439.getClass(), "resolved", false);
        setField(term871439, term871439.getClass(), "resolveResult", null);
        setField(term871439, term871439.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term869118;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term868456, args);
        assertTrue(recursiveEquals(term868456, term871434));
        assertTrue(recursiveEquals(term869118, term871439));
        assertTrue(recursiveEquals(retValue, false));
    }

};


