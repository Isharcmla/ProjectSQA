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

public class FunctionType_isSubtype_2101002158815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822934;
     Object term823284;
     Object term823754;
     Object term823759;

    public FunctionType_isSubtype_2101002158815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term823765 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term823764 = ((Class) term823765).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term823764).setAccessible(true);
        Object enum1537 = ((Field) term823764).get((Object) null);
        term822934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term823176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term822934, term822934.getClass(), "kind", enum1537);
        setField(term822934, term822934.getClass(), "call", term823176);
        term823284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term823284, term823284.getClass(), "kind", enum1537);
        setField(term823284, term823284.getClass(), "call", null);
        Class<? extends Object> term824065 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term824064 = ((Class) term824065).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term824064).setAccessible(true);
        Object enum1538 = ((Field) term824064).get((Object) null);
        term823754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term823755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term823754, term823754.getClass(), "this$0", null);
        setField(term823755, term823755.getClass(), "parameters", null);
        setField(term823755, term823755.getClass(), "returnType", null);
        setBooleanField(term823755, term823755.getClass(), "resolved", false);
        setField(term823755, term823755.getClass(), "resolveResult", null);
        setField(term823755, term823755.getClass(), "registry", null);
        setField(term823754, term823754.getClass(), "call", term823755);
        setField(term823754, term823754.getClass(), "prototype", null);
        setField(term823754, term823754.getClass(), "kind", enum1538);
        setField(term823754, term823754.getClass(), "typeOfThis", null);
        setField(term823754, term823754.getClass(), "source", null);
        setField(term823754, term823754.getClass(), "implementedInterfaces", null);
        setField(term823754, term823754.getClass(), "subTypes", null);
        setField(term823754, term823754.getClass(), "templateTypeName", null);
        setField(term823754, term823754.getClass(), "className", null);
        setField(term823754, term823754.getClass(), "properties", null);
        setField(term823754, term823754.getClass(), "implicitPrototype", null);
        setBooleanField(term823754, term823754.getClass(), "nativeType", false);
        setBooleanField(term823754, term823754.getClass(), "visited", false);
        setField(term823754, term823754.getClass(), "docInfo", null);
        setBooleanField(term823754, term823754.getClass(), "unknown", false);
        setBooleanField(term823754, term823754.getClass(), "resolved", false);
        setField(term823754, term823754.getClass(), "resolveResult", null);
        setField(term823754, term823754.getClass(), "registry", null);
        Class<? extends Object> term824365 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term824364 = ((Class) term824365).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term824364).setAccessible(true);
        Object enum1539 = ((Field) term824364).get((Object) null);
        term823759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term823759, term823759.getClass(), "this$0", null);
        setField(term823759, term823759.getClass(), "call", null);
        setField(term823759, term823759.getClass(), "prototype", null);
        setField(term823759, term823759.getClass(), "kind", enum1539);
        setField(term823759, term823759.getClass(), "typeOfThis", null);
        setField(term823759, term823759.getClass(), "source", null);
        setField(term823759, term823759.getClass(), "implementedInterfaces", null);
        setField(term823759, term823759.getClass(), "subTypes", null);
        setField(term823759, term823759.getClass(), "templateTypeName", null);
        setField(term823759, term823759.getClass(), "className", null);
        setField(term823759, term823759.getClass(), "properties", null);
        setField(term823759, term823759.getClass(), "implicitPrototype", null);
        setBooleanField(term823759, term823759.getClass(), "nativeType", false);
        setBooleanField(term823759, term823759.getClass(), "visited", false);
        setField(term823759, term823759.getClass(), "docInfo", null);
        setBooleanField(term823759, term823759.getClass(), "unknown", false);
        setBooleanField(term823759, term823759.getClass(), "resolved", false);
        setField(term823759, term823759.getClass(), "resolveResult", null);
        setField(term823759, term823759.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term823284;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term822934, args);
        assertTrue(recursiveEquals(term822934, term823754));
        assertTrue(recursiveEquals(term823284, term823759));
        assertTrue(recursiveEquals(retValue, false));
    }

};


