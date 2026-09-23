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

public class FunctionType_isSubtype_2101002158839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859003;
     Object term859453;
     Object term861759;
     Object term861765;

    public FunctionType_isSubtype_2101002158839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term861772 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term861771 = ((Class) term861772).getDeclaredField((String) "ORDINARY");
        ((Field) term861771).setAccessible(true);
        Object enum1606 = ((Field) term861771).get((Object) null);
        term859003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term859251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term859345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term859003, term859003.getClass(), "kind", enum1606);
        setField(term859003, term859003.getClass(), "typeOfThis", term859251);
        setField(term859003, term859003.getClass(), "call", term859345);
        Class<? extends Object> term862063 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term862062 = ((Class) term862063).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term862062).setAccessible(true);
        Object enum1607 = ((Field) term862062).get((Object) null);
        term859453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term859689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term859453, term859453.getClass(), "kind", enum1607);
        setField(term859453, term859453.getClass(), "typeOfThis", term859689);
        setField(term859453, term859453.getClass(), "call", null);
        Class<? extends Object> term862363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term862362 = ((Class) term862363).getDeclaredField((String) "ORDINARY");
        ((Field) term862362).setAccessible(true);
        Object enum1608 = ((Field) term862362).get((Object) null);
        term861759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term861760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term861764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term861759, term861759.getClass(), "this$0", null);
        setField(term861760, term861760.getClass(), "parameters", null);
        setField(term861760, term861760.getClass(), "returnType", null);
        setBooleanField(term861760, term861760.getClass(), "resolved", false);
        setField(term861760, term861760.getClass(), "resolveResult", null);
        setField(term861760, term861760.getClass(), "registry", null);
        setField(term861759, term861759.getClass(), "call", term861760);
        setField(term861759, term861759.getClass(), "prototype", null);
        setField(term861759, term861759.getClass(), "kind", enum1608);
        setField(term861764, term861764.getClass(), "call", null);
        setField(term861764, term861764.getClass(), "prototype", null);
        setField(term861764, term861764.getClass(), "kind", null);
        setField(term861764, term861764.getClass(), "typeOfThis", null);
        setField(term861764, term861764.getClass(), "source", null);
        setField(term861764, term861764.getClass(), "implementedInterfaces", null);
        setField(term861764, term861764.getClass(), "subTypes", null);
        setField(term861764, term861764.getClass(), "templateTypeName", null);
        setField(term861764, term861764.getClass(), "className", null);
        setField(term861764, term861764.getClass(), "properties", null);
        setField(term861764, term861764.getClass(), "implicitPrototype", null);
        setBooleanField(term861764, term861764.getClass(), "nativeType", false);
        setBooleanField(term861764, term861764.getClass(), "visited", false);
        setField(term861764, term861764.getClass(), "docInfo", null);
        setBooleanField(term861764, term861764.getClass(), "unknown", false);
        setBooleanField(term861764, term861764.getClass(), "resolved", false);
        setField(term861764, term861764.getClass(), "resolveResult", null);
        setField(term861764, term861764.getClass(), "registry", null);
        setField(term861759, term861759.getClass(), "typeOfThis", term861764);
        setField(term861759, term861759.getClass(), "source", null);
        setField(term861759, term861759.getClass(), "implementedInterfaces", null);
        setField(term861759, term861759.getClass(), "subTypes", null);
        setField(term861759, term861759.getClass(), "templateTypeName", null);
        setField(term861759, term861759.getClass(), "className", null);
        setField(term861759, term861759.getClass(), "properties", null);
        setField(term861759, term861759.getClass(), "implicitPrototype", null);
        setBooleanField(term861759, term861759.getClass(), "nativeType", false);
        setBooleanField(term861759, term861759.getClass(), "visited", false);
        setField(term861759, term861759.getClass(), "docInfo", null);
        setBooleanField(term861759, term861759.getClass(), "unknown", false);
        setBooleanField(term861759, term861759.getClass(), "resolved", false);
        setField(term861759, term861759.getClass(), "resolveResult", null);
        setField(term861759, term861759.getClass(), "registry", null);
        Class<? extends Object> term862654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term862653 = ((Class) term862654).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term862653).setAccessible(true);
        Object enum1609 = ((Field) term862653).get((Object) null);
        term861765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term861769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term861765, term861765.getClass(), "this$0", null);
        setField(term861765, term861765.getClass(), "call", null);
        setField(term861765, term861765.getClass(), "prototype", null);
        setField(term861765, term861765.getClass(), "kind", enum1609);
        setField(term861769, term861769.getClass(), "leastSupertypeVisitor", null);
        setField(term861769, term861769.getClass(), "greatestSubtypeVisitor", null);
        setField(term861769, term861769.getClass(), "call", null);
        setField(term861769, term861769.getClass(), "prototype", null);
        setField(term861769, term861769.getClass(), "kind", null);
        setField(term861769, term861769.getClass(), "typeOfThis", null);
        setField(term861769, term861769.getClass(), "source", null);
        setField(term861769, term861769.getClass(), "implementedInterfaces", null);
        setField(term861769, term861769.getClass(), "subTypes", null);
        setField(term861769, term861769.getClass(), "templateTypeName", null);
        setField(term861769, term861769.getClass(), "className", null);
        setField(term861769, term861769.getClass(), "properties", null);
        setField(term861769, term861769.getClass(), "implicitPrototype", null);
        setBooleanField(term861769, term861769.getClass(), "nativeType", false);
        setBooleanField(term861769, term861769.getClass(), "visited", false);
        setField(term861769, term861769.getClass(), "docInfo", null);
        setBooleanField(term861769, term861769.getClass(), "unknown", false);
        setBooleanField(term861769, term861769.getClass(), "resolved", false);
        setField(term861769, term861769.getClass(), "resolveResult", null);
        setField(term861769, term861769.getClass(), "registry", null);
        setField(term861765, term861765.getClass(), "typeOfThis", term861769);
        setField(term861765, term861765.getClass(), "source", null);
        setField(term861765, term861765.getClass(), "implementedInterfaces", null);
        setField(term861765, term861765.getClass(), "subTypes", null);
        setField(term861765, term861765.getClass(), "templateTypeName", null);
        setField(term861765, term861765.getClass(), "className", null);
        setField(term861765, term861765.getClass(), "properties", null);
        setField(term861765, term861765.getClass(), "implicitPrototype", null);
        setBooleanField(term861765, term861765.getClass(), "nativeType", false);
        setBooleanField(term861765, term861765.getClass(), "visited", false);
        setField(term861765, term861765.getClass(), "docInfo", null);
        setBooleanField(term861765, term861765.getClass(), "unknown", false);
        setBooleanField(term861765, term861765.getClass(), "resolved", false);
        setField(term861765, term861765.getClass(), "resolveResult", null);
        setField(term861765, term861765.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term859453;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term859003, args);
        assertTrue(recursiveEquals(term859003, term861759));
        assertTrue(recursiveEquals(term859453, term861765));
        assertTrue(recursiveEquals(retValue, false));
    }

};


