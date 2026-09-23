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

public class FunctionType_isSubtype_21010021581317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1661944;
     Object term1662296;
     Object term1664819;
     Object term1664824;

    public FunctionType_isSubtype_21010021581317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1664831 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1664830 = ((Class) term1664831).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1664830).setAccessible(true);
        Object enum3104 = ((Field) term1664830).get((Object) null);
        term1661944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1662186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1661944, term1661944.getClass(), "kind", enum3104);
        setField(term1661944, term1661944.getClass(), "call", term1662186);
        Class<? extends Object> term1665131 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1665130 = ((Class) term1665131).getDeclaredField((String) "ORDINARY");
        ((Field) term1665130).setAccessible(true);
        Object enum3105 = ((Field) term1665130).get((Object) null);
        term1662296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1662538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1662296, term1662296.getClass(), "kind", enum3105);
        setField(term1662296, term1662296.getClass(), "call", term1662538);
        Class<? extends Object> term1665422 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1665421 = ((Class) term1665422).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1665421).setAccessible(true);
        Object enum3106 = ((Field) term1665421).get((Object) null);
        term1664819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1664820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1664819, term1664819.getClass(), "this$0", null);
        setField(term1664820, term1664820.getClass(), "parameters", null);
        setField(term1664820, term1664820.getClass(), "returnType", null);
        setBooleanField(term1664820, term1664820.getClass(), "resolved", false);
        setField(term1664820, term1664820.getClass(), "resolveResult", null);
        setField(term1664820, term1664820.getClass(), "registry", null);
        setField(term1664819, term1664819.getClass(), "call", term1664820);
        setField(term1664819, term1664819.getClass(), "prototype", null);
        setField(term1664819, term1664819.getClass(), "kind", enum3106);
        setField(term1664819, term1664819.getClass(), "typeOfThis", null);
        setField(term1664819, term1664819.getClass(), "source", null);
        setField(term1664819, term1664819.getClass(), "implementedInterfaces", null);
        setField(term1664819, term1664819.getClass(), "subTypes", null);
        setField(term1664819, term1664819.getClass(), "templateTypeName", null);
        setField(term1664819, term1664819.getClass(), "className", null);
        setField(term1664819, term1664819.getClass(), "properties", null);
        setField(term1664819, term1664819.getClass(), "implicitPrototype", null);
        setBooleanField(term1664819, term1664819.getClass(), "nativeType", false);
        setBooleanField(term1664819, term1664819.getClass(), "visited", false);
        setField(term1664819, term1664819.getClass(), "docInfo", null);
        setBooleanField(term1664819, term1664819.getClass(), "unknown", false);
        setBooleanField(term1664819, term1664819.getClass(), "resolved", false);
        setField(term1664819, term1664819.getClass(), "resolveResult", null);
        setField(term1664819, term1664819.getClass(), "registry", null);
        Class<? extends Object> term1665722 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1665721 = ((Class) term1665722).getDeclaredField((String) "ORDINARY");
        ((Field) term1665721).setAccessible(true);
        Object enum3107 = ((Field) term1665721).get((Object) null);
        term1664824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1664825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1664825, term1664825.getClass(), "parameters", null);
        setField(term1664825, term1664825.getClass(), "returnType", null);
        setBooleanField(term1664825, term1664825.getClass(), "resolved", false);
        setField(term1664825, term1664825.getClass(), "resolveResult", null);
        setField(term1664825, term1664825.getClass(), "registry", null);
        setField(term1664824, term1664824.getClass(), "call", term1664825);
        setField(term1664824, term1664824.getClass(), "prototype", null);
        setField(term1664824, term1664824.getClass(), "kind", enum3107);
        setField(term1664824, term1664824.getClass(), "typeOfThis", null);
        setField(term1664824, term1664824.getClass(), "source", null);
        setField(term1664824, term1664824.getClass(), "implementedInterfaces", null);
        setField(term1664824, term1664824.getClass(), "subTypes", null);
        setField(term1664824, term1664824.getClass(), "templateTypeName", null);
        setField(term1664824, term1664824.getClass(), "className", null);
        setField(term1664824, term1664824.getClass(), "properties", null);
        setField(term1664824, term1664824.getClass(), "implicitPrototype", null);
        setBooleanField(term1664824, term1664824.getClass(), "nativeType", false);
        setBooleanField(term1664824, term1664824.getClass(), "visited", false);
        setField(term1664824, term1664824.getClass(), "docInfo", null);
        setBooleanField(term1664824, term1664824.getClass(), "unknown", false);
        setBooleanField(term1664824, term1664824.getClass(), "resolved", false);
        setField(term1664824, term1664824.getClass(), "resolveResult", null);
        setField(term1664824, term1664824.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1662296;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1661944, args);
        assertTrue(recursiveEquals(term1661944, term1664819));
        assertTrue(recursiveEquals(term1662296, term1664824));
        assertTrue(recursiveEquals(retValue, true));
    }

};


