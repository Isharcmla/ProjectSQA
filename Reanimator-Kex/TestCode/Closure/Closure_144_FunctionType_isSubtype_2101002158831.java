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

public class FunctionType_isSubtype_2101002158831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969413;
     Object term969763;
     Object term970239;
     Object term970244;

    public FunctionType_isSubtype_2101002158831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term970250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term970249 = ((Class) term970250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term970249).setAccessible(true);
        Object enum1755 = ((Field) term970249).get((Object) null);
        term969413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term969655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term969413, term969413.getClass(), "kind", enum1755);
        setField(term969413, term969413.getClass(), "call", term969655);
        term969763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term969763, term969763.getClass(), "kind", enum1755);
        setField(term969763, term969763.getClass(), "call", null);
        Class<? extends Object> term970550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term970549 = ((Class) term970550).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term970549).setAccessible(true);
        Object enum1756 = ((Field) term970549).get((Object) null);
        term970239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term970240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term970239, term970239.getClass(), "this$0", null);
        setField(term970240, term970240.getClass(), "parameters", null);
        setField(term970240, term970240.getClass(), "returnType", null);
        setBooleanField(term970240, term970240.getClass(), "returnTypeInferred", false);
        setBooleanField(term970240, term970240.getClass(), "resolved", false);
        setField(term970240, term970240.getClass(), "resolveResult", null);
        setField(term970240, term970240.getClass(), "registry", null);
        setField(term970239, term970239.getClass(), "call", term970240);
        setField(term970239, term970239.getClass(), "prototype", null);
        setField(term970239, term970239.getClass(), "kind", enum1756);
        setField(term970239, term970239.getClass(), "typeOfThis", null);
        setField(term970239, term970239.getClass(), "source", null);
        setField(term970239, term970239.getClass(), "implementedInterfaces", null);
        setField(term970239, term970239.getClass(), "subTypes", null);
        setField(term970239, term970239.getClass(), "templateTypeName", null);
        setField(term970239, term970239.getClass(), "className", null);
        setField(term970239, term970239.getClass(), "properties", null);
        setField(term970239, term970239.getClass(), "implicitPrototype", null);
        setBooleanField(term970239, term970239.getClass(), "nativeType", false);
        setBooleanField(term970239, term970239.getClass(), "prettyPrint", false);
        setBooleanField(term970239, term970239.getClass(), "visited", false);
        setField(term970239, term970239.getClass(), "docInfo", null);
        setBooleanField(term970239, term970239.getClass(), "unknown", false);
        setBooleanField(term970239, term970239.getClass(), "resolved", false);
        setField(term970239, term970239.getClass(), "resolveResult", null);
        setField(term970239, term970239.getClass(), "registry", null);
        Class<? extends Object> term970850 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term970849 = ((Class) term970850).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term970849).setAccessible(true);
        Object enum1757 = ((Field) term970849).get((Object) null);
        term970244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term970244, term970244.getClass(), "this$0", null);
        setField(term970244, term970244.getClass(), "call", null);
        setField(term970244, term970244.getClass(), "prototype", null);
        setField(term970244, term970244.getClass(), "kind", enum1757);
        setField(term970244, term970244.getClass(), "typeOfThis", null);
        setField(term970244, term970244.getClass(), "source", null);
        setField(term970244, term970244.getClass(), "implementedInterfaces", null);
        setField(term970244, term970244.getClass(), "subTypes", null);
        setField(term970244, term970244.getClass(), "templateTypeName", null);
        setField(term970244, term970244.getClass(), "className", null);
        setField(term970244, term970244.getClass(), "properties", null);
        setField(term970244, term970244.getClass(), "implicitPrototype", null);
        setBooleanField(term970244, term970244.getClass(), "nativeType", false);
        setBooleanField(term970244, term970244.getClass(), "prettyPrint", false);
        setBooleanField(term970244, term970244.getClass(), "visited", false);
        setField(term970244, term970244.getClass(), "docInfo", null);
        setBooleanField(term970244, term970244.getClass(), "unknown", false);
        setBooleanField(term970244, term970244.getClass(), "resolved", false);
        setField(term970244, term970244.getClass(), "resolveResult", null);
        setField(term970244, term970244.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term969763;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term969413, args);
        assertTrue(recursiveEquals(term969413, term970239));
        assertTrue(recursiveEquals(term969763, term970244));
        assertTrue(recursiveEquals(retValue, false));
    }

};


