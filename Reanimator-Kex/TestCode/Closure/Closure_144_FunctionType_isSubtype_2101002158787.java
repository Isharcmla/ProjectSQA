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

public class FunctionType_isSubtype_2101002158787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894936;
     Object term895288;
     Object term895764;
     Object term895769;

    public FunctionType_isSubtype_2101002158787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term895775 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term895774 = ((Class) term895775).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term895774).setAccessible(true);
        Object enum1620 = ((Field) term895774).get((Object) null);
        term894936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term895178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term894936, term894936.getClass(), "kind", enum1620);
        setField(term894936, term894936.getClass(), "call", term895178);
        term895288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term895288, term895288.getClass(), "kind", enum1620);
        setField(term895288, term895288.getClass(), "call", null);
        Class<? extends Object> term896075 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term896074 = ((Class) term896075).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term896074).setAccessible(true);
        Object enum1621 = ((Field) term896074).get((Object) null);
        term895764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term895765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term895764, term895764.getClass(), "this$0", null);
        setField(term895765, term895765.getClass(), "parameters", null);
        setField(term895765, term895765.getClass(), "returnType", null);
        setBooleanField(term895765, term895765.getClass(), "returnTypeInferred", false);
        setBooleanField(term895765, term895765.getClass(), "resolved", false);
        setField(term895765, term895765.getClass(), "resolveResult", null);
        setField(term895765, term895765.getClass(), "registry", null);
        setField(term895764, term895764.getClass(), "call", term895765);
        setField(term895764, term895764.getClass(), "prototype", null);
        setField(term895764, term895764.getClass(), "kind", enum1621);
        setField(term895764, term895764.getClass(), "typeOfThis", null);
        setField(term895764, term895764.getClass(), "source", null);
        setField(term895764, term895764.getClass(), "implementedInterfaces", null);
        setField(term895764, term895764.getClass(), "subTypes", null);
        setField(term895764, term895764.getClass(), "templateTypeName", null);
        setField(term895764, term895764.getClass(), "className", null);
        setField(term895764, term895764.getClass(), "properties", null);
        setField(term895764, term895764.getClass(), "implicitPrototype", null);
        setBooleanField(term895764, term895764.getClass(), "nativeType", false);
        setBooleanField(term895764, term895764.getClass(), "prettyPrint", false);
        setBooleanField(term895764, term895764.getClass(), "visited", false);
        setField(term895764, term895764.getClass(), "docInfo", null);
        setBooleanField(term895764, term895764.getClass(), "unknown", false);
        setBooleanField(term895764, term895764.getClass(), "resolved", false);
        setField(term895764, term895764.getClass(), "resolveResult", null);
        setField(term895764, term895764.getClass(), "registry", null);
        Class<? extends Object> term896375 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term896374 = ((Class) term896375).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term896374).setAccessible(true);
        Object enum1622 = ((Field) term896374).get((Object) null);
        term895769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term895769, term895769.getClass(), "call", null);
        setField(term895769, term895769.getClass(), "prototype", null);
        setField(term895769, term895769.getClass(), "kind", enum1622);
        setField(term895769, term895769.getClass(), "typeOfThis", null);
        setField(term895769, term895769.getClass(), "source", null);
        setField(term895769, term895769.getClass(), "implementedInterfaces", null);
        setField(term895769, term895769.getClass(), "subTypes", null);
        setField(term895769, term895769.getClass(), "templateTypeName", null);
        setField(term895769, term895769.getClass(), "className", null);
        setField(term895769, term895769.getClass(), "properties", null);
        setField(term895769, term895769.getClass(), "implicitPrototype", null);
        setBooleanField(term895769, term895769.getClass(), "nativeType", false);
        setBooleanField(term895769, term895769.getClass(), "prettyPrint", false);
        setBooleanField(term895769, term895769.getClass(), "visited", false);
        setField(term895769, term895769.getClass(), "docInfo", null);
        setBooleanField(term895769, term895769.getClass(), "unknown", false);
        setBooleanField(term895769, term895769.getClass(), "resolved", false);
        setField(term895769, term895769.getClass(), "resolveResult", null);
        setField(term895769, term895769.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term895288;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term894936, args);
        assertTrue(recursiveEquals(term894936, term895764));
        assertTrue(recursiveEquals(term895288, term895769));
        assertTrue(recursiveEquals(retValue, false));
    }

};


