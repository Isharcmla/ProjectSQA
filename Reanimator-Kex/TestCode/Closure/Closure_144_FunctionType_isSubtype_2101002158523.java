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

public class FunctionType_isSubtype_2101002158523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458786;
     Object term459384;
     Object term460888;
     Object term460897;

    public FunctionType_isSubtype_2101002158523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term460907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term460906 = ((Class) term460907).getDeclaredField((String) "ORDINARY");
        ((Field) term460906).setAccessible(true);
        Object enum837 = ((Field) term460906).get((Object) null);
        Class<? extends Object> term461198 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461197 = ((Class) term461198).getDeclaredField((String) "INTERFACE");
        ((Field) term461197).setAccessible(true);
        Object enum838 = ((Field) term461197).get((Object) null);
        term458786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term459034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term459276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term458786, term458786.getClass(), "kind", enum837);
        setField(term459034, term459034.getClass(), "kind", enum838);
        setField(term458786, term458786.getClass(), "typeOfThis", term459034);
        setField(term458786, term458786.getClass(), "call", term459276);
        Class<? extends Object> term461492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461491 = ((Class) term461492).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term461491).setAccessible(true);
        Object enum839 = ((Field) term461491).get((Object) null);
        term459384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term459642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term459384, term459384.getClass(), "kind", enum839);
        setField(term459642, term459642.getClass(), "kind", enum837);
        setField(term459384, term459384.getClass(), "typeOfThis", term459642);
        setField(term459384, term459384.getClass(), "call", null);
        Class<? extends Object> term461792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461791 = ((Class) term461792).getDeclaredField((String) "ORDINARY");
        ((Field) term461791).setAccessible(true);
        Object enum840 = ((Field) term461791).get((Object) null);
        Class<? extends Object> term462083 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term462082 = ((Class) term462083).getDeclaredField((String) "INTERFACE");
        ((Field) term462082).setAccessible(true);
        Object enum841 = ((Field) term462082).get((Object) null);
        term460888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term460889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term460893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term460888, term460888.getClass(), "this$0", null);
        setField(term460889, term460889.getClass(), "parameters", null);
        setField(term460889, term460889.getClass(), "returnType", null);
        setBooleanField(term460889, term460889.getClass(), "returnTypeInferred", false);
        setBooleanField(term460889, term460889.getClass(), "resolved", false);
        setField(term460889, term460889.getClass(), "resolveResult", null);
        setField(term460889, term460889.getClass(), "registry", null);
        setField(term460888, term460888.getClass(), "call", term460889);
        setField(term460888, term460888.getClass(), "prototype", null);
        setField(term460888, term460888.getClass(), "kind", enum840);
        setField(term460893, term460893.getClass(), "call", null);
        setField(term460893, term460893.getClass(), "prototype", null);
        setField(term460893, term460893.getClass(), "kind", enum841);
        setField(term460893, term460893.getClass(), "typeOfThis", null);
        setField(term460893, term460893.getClass(), "source", null);
        setField(term460893, term460893.getClass(), "implementedInterfaces", null);
        setField(term460893, term460893.getClass(), "subTypes", null);
        setField(term460893, term460893.getClass(), "templateTypeName", null);
        setField(term460893, term460893.getClass(), "className", null);
        setField(term460893, term460893.getClass(), "properties", null);
        setField(term460893, term460893.getClass(), "implicitPrototype", null);
        setBooleanField(term460893, term460893.getClass(), "nativeType", false);
        setBooleanField(term460893, term460893.getClass(), "prettyPrint", false);
        setBooleanField(term460893, term460893.getClass(), "visited", false);
        setField(term460893, term460893.getClass(), "docInfo", null);
        setBooleanField(term460893, term460893.getClass(), "unknown", false);
        setBooleanField(term460893, term460893.getClass(), "resolved", false);
        setField(term460893, term460893.getClass(), "resolveResult", null);
        setField(term460893, term460893.getClass(), "registry", null);
        setField(term460888, term460888.getClass(), "typeOfThis", term460893);
        setField(term460888, term460888.getClass(), "source", null);
        setField(term460888, term460888.getClass(), "implementedInterfaces", null);
        setField(term460888, term460888.getClass(), "subTypes", null);
        setField(term460888, term460888.getClass(), "templateTypeName", null);
        setField(term460888, term460888.getClass(), "className", null);
        setField(term460888, term460888.getClass(), "properties", null);
        setField(term460888, term460888.getClass(), "implicitPrototype", null);
        setBooleanField(term460888, term460888.getClass(), "nativeType", false);
        setBooleanField(term460888, term460888.getClass(), "prettyPrint", false);
        setBooleanField(term460888, term460888.getClass(), "visited", false);
        setField(term460888, term460888.getClass(), "docInfo", null);
        setBooleanField(term460888, term460888.getClass(), "unknown", false);
        setBooleanField(term460888, term460888.getClass(), "resolved", false);
        setField(term460888, term460888.getClass(), "resolveResult", null);
        setField(term460888, term460888.getClass(), "registry", null);
        Class<? extends Object> term462377 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term462376 = ((Class) term462377).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term462376).setAccessible(true);
        Object enum842 = ((Field) term462376).get((Object) null);
        Class<? extends Object> term462677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term462676 = ((Class) term462677).getDeclaredField((String) "ORDINARY");
        ((Field) term462676).setAccessible(true);
        Object enum843 = ((Field) term462676).get((Object) null);
        term460897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term460901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term460897, term460897.getClass(), "this$0", null);
        setField(term460897, term460897.getClass(), "call", null);
        setField(term460897, term460897.getClass(), "prototype", null);
        setField(term460897, term460897.getClass(), "kind", enum842);
        setField(term460901, term460901.getClass(), "call", null);
        setField(term460901, term460901.getClass(), "prototype", null);
        setField(term460901, term460901.getClass(), "kind", enum843);
        setField(term460901, term460901.getClass(), "typeOfThis", null);
        setField(term460901, term460901.getClass(), "source", null);
        setField(term460901, term460901.getClass(), "implementedInterfaces", null);
        setField(term460901, term460901.getClass(), "subTypes", null);
        setField(term460901, term460901.getClass(), "templateTypeName", null);
        setField(term460901, term460901.getClass(), "className", null);
        setField(term460901, term460901.getClass(), "properties", null);
        setField(term460901, term460901.getClass(), "implicitPrototype", null);
        setBooleanField(term460901, term460901.getClass(), "nativeType", false);
        setBooleanField(term460901, term460901.getClass(), "prettyPrint", false);
        setBooleanField(term460901, term460901.getClass(), "visited", false);
        setField(term460901, term460901.getClass(), "docInfo", null);
        setBooleanField(term460901, term460901.getClass(), "unknown", false);
        setBooleanField(term460901, term460901.getClass(), "resolved", false);
        setField(term460901, term460901.getClass(), "resolveResult", null);
        setField(term460901, term460901.getClass(), "registry", null);
        setField(term460897, term460897.getClass(), "typeOfThis", term460901);
        setField(term460897, term460897.getClass(), "source", null);
        setField(term460897, term460897.getClass(), "implementedInterfaces", null);
        setField(term460897, term460897.getClass(), "subTypes", null);
        setField(term460897, term460897.getClass(), "templateTypeName", null);
        setField(term460897, term460897.getClass(), "className", null);
        setField(term460897, term460897.getClass(), "properties", null);
        setField(term460897, term460897.getClass(), "implicitPrototype", null);
        setBooleanField(term460897, term460897.getClass(), "nativeType", false);
        setBooleanField(term460897, term460897.getClass(), "prettyPrint", false);
        setBooleanField(term460897, term460897.getClass(), "visited", false);
        setField(term460897, term460897.getClass(), "docInfo", null);
        setBooleanField(term460897, term460897.getClass(), "unknown", false);
        setBooleanField(term460897, term460897.getClass(), "resolved", false);
        setField(term460897, term460897.getClass(), "resolveResult", null);
        setField(term460897, term460897.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term459384;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term458786, args);
        assertTrue(recursiveEquals(term458786, term460888));
        assertTrue(recursiveEquals(term459384, term460897));
        assertTrue(recursiveEquals(retValue, false));
    }

};


