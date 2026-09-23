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

public class FunctionType_isSubtype_2101002158639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556997;
     Object term557349;
     Object term558195;
     Object term558200;

    public FunctionType_isSubtype_2101002158639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term558206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term558205 = ((Class) term558206).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term558205).setAccessible(true);
        Object enum1031 = ((Field) term558205).get((Object) null);
        term556997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term557239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term556997, term556997.getClass(), "kind", enum1031);
        setField(term556997, term556997.getClass(), "call", term557239);
        Class<? extends Object> term558506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term558505 = ((Class) term558506).getDeclaredField((String) "ORDINARY");
        ((Field) term558505).setAccessible(true);
        Object enum1032 = ((Field) term558505).get((Object) null);
        term557349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term557349, term557349.getClass(), "kind", enum1032);
        setField(term557349, term557349.getClass(), "call", null);
        Class<? extends Object> term558797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term558796 = ((Class) term558797).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term558796).setAccessible(true);
        Object enum1033 = ((Field) term558796).get((Object) null);
        term558195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term558196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term558195, term558195.getClass(), "this$0", null);
        setField(term558196, term558196.getClass(), "parameters", null);
        setField(term558196, term558196.getClass(), "returnType", null);
        setBooleanField(term558196, term558196.getClass(), "resolved", false);
        setField(term558196, term558196.getClass(), "resolveResult", null);
        setField(term558196, term558196.getClass(), "registry", null);
        setField(term558195, term558195.getClass(), "call", term558196);
        setField(term558195, term558195.getClass(), "prototype", null);
        setField(term558195, term558195.getClass(), "kind", enum1033);
        setField(term558195, term558195.getClass(), "typeOfThis", null);
        setField(term558195, term558195.getClass(), "source", null);
        setField(term558195, term558195.getClass(), "implementedInterfaces", null);
        setField(term558195, term558195.getClass(), "subTypes", null);
        setField(term558195, term558195.getClass(), "templateTypeName", null);
        setField(term558195, term558195.getClass(), "className", null);
        setField(term558195, term558195.getClass(), "properties", null);
        setField(term558195, term558195.getClass(), "implicitPrototype", null);
        setBooleanField(term558195, term558195.getClass(), "nativeType", false);
        setBooleanField(term558195, term558195.getClass(), "visited", false);
        setField(term558195, term558195.getClass(), "docInfo", null);
        setBooleanField(term558195, term558195.getClass(), "unknown", false);
        setBooleanField(term558195, term558195.getClass(), "resolved", false);
        setField(term558195, term558195.getClass(), "resolveResult", null);
        setField(term558195, term558195.getClass(), "registry", null);
        Class<? extends Object> term559097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term559096 = ((Class) term559097).getDeclaredField((String) "ORDINARY");
        ((Field) term559096).setAccessible(true);
        Object enum1034 = ((Field) term559096).get((Object) null);
        term558200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term558200, term558200.getClass(), "call", null);
        setField(term558200, term558200.getClass(), "prototype", null);
        setField(term558200, term558200.getClass(), "kind", enum1034);
        setField(term558200, term558200.getClass(), "typeOfThis", null);
        setField(term558200, term558200.getClass(), "source", null);
        setField(term558200, term558200.getClass(), "implementedInterfaces", null);
        setField(term558200, term558200.getClass(), "subTypes", null);
        setField(term558200, term558200.getClass(), "templateTypeName", null);
        setField(term558200, term558200.getClass(), "className", null);
        setField(term558200, term558200.getClass(), "properties", null);
        setField(term558200, term558200.getClass(), "implicitPrototype", null);
        setBooleanField(term558200, term558200.getClass(), "nativeType", false);
        setBooleanField(term558200, term558200.getClass(), "visited", false);
        setField(term558200, term558200.getClass(), "docInfo", null);
        setBooleanField(term558200, term558200.getClass(), "unknown", false);
        setBooleanField(term558200, term558200.getClass(), "resolved", false);
        setField(term558200, term558200.getClass(), "resolveResult", null);
        setField(term558200, term558200.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term557349;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term556997, args);
        assertTrue(recursiveEquals(term556997, term558195));
        assertTrue(recursiveEquals(term557349, term558200));
        assertTrue(recursiveEquals(retValue, false));
    }

};


