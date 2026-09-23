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

public class FunctionType_isSubtype_2101002158632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547171;
     Object term547723;
     Object term549248;
     Object term549252;

    public FunctionType_isSubtype_2101002158632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term549258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549257 = ((Class) term549258).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term549257).setAccessible(true);
        Object enum1013 = ((Field) term549257).get((Object) null);
        term547171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term547171, term547171.getClass(), "kind", enum1013);
        Class<? extends Object> term549558 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549557 = ((Class) term549558).getDeclaredField((String) "INTERFACE");
        ((Field) term549557).setAccessible(true);
        Object enum1014 = ((Field) term549557).get((Object) null);
        term547723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term547723, term547723.getClass(), "kind", enum1014);
        Class<? extends Object> term549852 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549851 = ((Class) term549852).getDeclaredField((String) "INTERFACE");
        ((Field) term549851).setAccessible(true);
        Object enum1015 = ((Field) term549851).get((Object) null);
        term549248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term549248, term549248.getClass(), "this$0", null);
        setField(term549248, term549248.getClass(), "call", null);
        setField(term549248, term549248.getClass(), "prototype", null);
        setField(term549248, term549248.getClass(), "kind", enum1015);
        setField(term549248, term549248.getClass(), "typeOfThis", null);
        setField(term549248, term549248.getClass(), "source", null);
        setField(term549248, term549248.getClass(), "implementedInterfaces", null);
        setField(term549248, term549248.getClass(), "subTypes", null);
        setField(term549248, term549248.getClass(), "templateTypeName", null);
        setField(term549248, term549248.getClass(), "className", null);
        setField(term549248, term549248.getClass(), "properties", null);
        setField(term549248, term549248.getClass(), "implicitPrototype", null);
        setBooleanField(term549248, term549248.getClass(), "nativeType", false);
        setBooleanField(term549248, term549248.getClass(), "visited", false);
        setField(term549248, term549248.getClass(), "docInfo", null);
        setBooleanField(term549248, term549248.getClass(), "unknown", false);
        setBooleanField(term549248, term549248.getClass(), "resolved", false);
        setField(term549248, term549248.getClass(), "resolveResult", null);
        setField(term549248, term549248.getClass(), "registry", null);
        Class<? extends Object> term550146 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term550145 = ((Class) term550146).getDeclaredField((String) "INTERFACE");
        ((Field) term550145).setAccessible(true);
        Object enum1016 = ((Field) term550145).get((Object) null);
        term549252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term549252, term549252.getClass(), "this$0", null);
        setField(term549252, term549252.getClass(), "call", null);
        setField(term549252, term549252.getClass(), "prototype", null);
        setField(term549252, term549252.getClass(), "kind", enum1016);
        setField(term549252, term549252.getClass(), "typeOfThis", null);
        setField(term549252, term549252.getClass(), "source", null);
        setField(term549252, term549252.getClass(), "implementedInterfaces", null);
        setField(term549252, term549252.getClass(), "subTypes", null);
        setField(term549252, term549252.getClass(), "templateTypeName", null);
        setField(term549252, term549252.getClass(), "className", null);
        setField(term549252, term549252.getClass(), "properties", null);
        setField(term549252, term549252.getClass(), "implicitPrototype", null);
        setBooleanField(term549252, term549252.getClass(), "nativeType", false);
        setBooleanField(term549252, term549252.getClass(), "visited", false);
        setField(term549252, term549252.getClass(), "docInfo", null);
        setBooleanField(term549252, term549252.getClass(), "unknown", false);
        setBooleanField(term549252, term549252.getClass(), "resolved", false);
        setField(term549252, term549252.getClass(), "resolveResult", null);
        setField(term549252, term549252.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term547723;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term547171, args);
        assertTrue(recursiveEquals(term547171, term549248));
        assertTrue(recursiveEquals(term547723, term549252));
        assertTrue(recursiveEquals(retValue, true));
    }

};


