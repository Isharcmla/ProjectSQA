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

public class FunctionType_isSubtype_21010021581616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2167426;
     Object term2167778;
     Object term2170662;
     Object term2170667;

    public FunctionType_isSubtype_21010021581616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2170674 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2170673 = ((Class) term2170674).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2170673).setAccessible(true);
        Object enum4044 = ((Field) term2170673).get((Object) null);
        term2167426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2167668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2167426, term2167426.getClass(), "kind", enum4044);
        setField(term2167426, term2167426.getClass(), "call", term2167668);
        Class<? extends Object> term2170974 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2170973 = ((Class) term2170974).getDeclaredField((String) "ORDINARY");
        ((Field) term2170973).setAccessible(true);
        Object enum4045 = ((Field) term2170973).get((Object) null);
        term2167778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2168020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2167778, term2167778.getClass(), "kind", enum4045);
        setField(term2167778, term2167778.getClass(), "call", term2168020);
        Class<? extends Object> term2171265 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2171264 = ((Class) term2171265).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2171264).setAccessible(true);
        Object enum4046 = ((Field) term2171264).get((Object) null);
        term2170662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2170663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2170662, term2170662.getClass(), "this$0", null);
        setField(term2170663, term2170663.getClass(), "parameters", null);
        setField(term2170663, term2170663.getClass(), "returnType", null);
        setBooleanField(term2170663, term2170663.getClass(), "resolved", false);
        setField(term2170663, term2170663.getClass(), "resolveResult", null);
        setField(term2170663, term2170663.getClass(), "registry", null);
        setField(term2170662, term2170662.getClass(), "call", term2170663);
        setField(term2170662, term2170662.getClass(), "prototype", null);
        setField(term2170662, term2170662.getClass(), "kind", enum4046);
        setField(term2170662, term2170662.getClass(), "typeOfThis", null);
        setField(term2170662, term2170662.getClass(), "source", null);
        setField(term2170662, term2170662.getClass(), "implementedInterfaces", null);
        setField(term2170662, term2170662.getClass(), "subTypes", null);
        setField(term2170662, term2170662.getClass(), "templateTypeName", null);
        setField(term2170662, term2170662.getClass(), "className", null);
        setField(term2170662, term2170662.getClass(), "properties", null);
        setField(term2170662, term2170662.getClass(), "implicitPrototype", null);
        setBooleanField(term2170662, term2170662.getClass(), "nativeType", false);
        setBooleanField(term2170662, term2170662.getClass(), "visited", false);
        setField(term2170662, term2170662.getClass(), "docInfo", null);
        setBooleanField(term2170662, term2170662.getClass(), "unknown", false);
        setBooleanField(term2170662, term2170662.getClass(), "resolved", false);
        setField(term2170662, term2170662.getClass(), "resolveResult", null);
        setField(term2170662, term2170662.getClass(), "registry", null);
        Class<? extends Object> term2171565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2171564 = ((Class) term2171565).getDeclaredField((String) "ORDINARY");
        ((Field) term2171564).setAccessible(true);
        Object enum4047 = ((Field) term2171564).get((Object) null);
        term2170667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2170668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2170668, term2170668.getClass(), "parameters", null);
        setField(term2170668, term2170668.getClass(), "returnType", null);
        setBooleanField(term2170668, term2170668.getClass(), "resolved", false);
        setField(term2170668, term2170668.getClass(), "resolveResult", null);
        setField(term2170668, term2170668.getClass(), "registry", null);
        setField(term2170667, term2170667.getClass(), "call", term2170668);
        setField(term2170667, term2170667.getClass(), "prototype", null);
        setField(term2170667, term2170667.getClass(), "kind", enum4047);
        setField(term2170667, term2170667.getClass(), "typeOfThis", null);
        setField(term2170667, term2170667.getClass(), "source", null);
        setField(term2170667, term2170667.getClass(), "implementedInterfaces", null);
        setField(term2170667, term2170667.getClass(), "subTypes", null);
        setField(term2170667, term2170667.getClass(), "templateTypeName", null);
        setField(term2170667, term2170667.getClass(), "className", null);
        setField(term2170667, term2170667.getClass(), "properties", null);
        setField(term2170667, term2170667.getClass(), "implicitPrototype", null);
        setBooleanField(term2170667, term2170667.getClass(), "nativeType", false);
        setBooleanField(term2170667, term2170667.getClass(), "visited", false);
        setField(term2170667, term2170667.getClass(), "docInfo", null);
        setBooleanField(term2170667, term2170667.getClass(), "unknown", false);
        setBooleanField(term2170667, term2170667.getClass(), "resolved", false);
        setField(term2170667, term2170667.getClass(), "resolveResult", null);
        setField(term2170667, term2170667.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2167778;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2167426, args);
        assertTrue(recursiveEquals(term2167426, term2170662));
        assertTrue(recursiveEquals(term2167778, term2170667));
        assertTrue(recursiveEquals(retValue, true));
    }

};


