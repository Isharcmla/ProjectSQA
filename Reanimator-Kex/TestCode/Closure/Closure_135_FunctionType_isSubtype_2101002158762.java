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

public class FunctionType_isSubtype_2101002158762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735158;
     Object term735508;
     Object term737735;
     Object term737740;

    public FunctionType_isSubtype_2101002158762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term737746 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term737745 = ((Class) term737746).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term737745).setAccessible(true);
        Object enum1371 = ((Field) term737745).get((Object) null);
        term735158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term735400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term735158, term735158.getClass(), "kind", enum1371);
        setField(term735158, term735158.getClass(), "call", term735400);
        Class<? extends Object> term738046 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738045 = ((Class) term738046).getDeclaredField((String) "ORDINARY");
        ((Field) term738045).setAccessible(true);
        Object enum1372 = ((Field) term738045).get((Object) null);
        term735508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term735508, term735508.getClass(), "kind", enum1372);
        setField(term735508, term735508.getClass(), "call", null);
        Class<? extends Object> term738337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738336 = ((Class) term738337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term738336).setAccessible(true);
        Object enum1373 = ((Field) term738336).get((Object) null);
        term737735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term737736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term737736, term737736.getClass(), "parameters", null);
        setField(term737736, term737736.getClass(), "returnType", null);
        setBooleanField(term737736, term737736.getClass(), "resolved", false);
        setField(term737736, term737736.getClass(), "resolveResult", null);
        setField(term737736, term737736.getClass(), "registry", null);
        setField(term737735, term737735.getClass(), "call", term737736);
        setField(term737735, term737735.getClass(), "prototype", null);
        setField(term737735, term737735.getClass(), "kind", enum1373);
        setField(term737735, term737735.getClass(), "typeOfThis", null);
        setField(term737735, term737735.getClass(), "source", null);
        setField(term737735, term737735.getClass(), "implementedInterfaces", null);
        setField(term737735, term737735.getClass(), "subTypes", null);
        setField(term737735, term737735.getClass(), "templateTypeName", null);
        setField(term737735, term737735.getClass(), "className", null);
        setField(term737735, term737735.getClass(), "properties", null);
        setField(term737735, term737735.getClass(), "implicitPrototype", null);
        setBooleanField(term737735, term737735.getClass(), "nativeType", false);
        setBooleanField(term737735, term737735.getClass(), "visited", false);
        setField(term737735, term737735.getClass(), "docInfo", null);
        setBooleanField(term737735, term737735.getClass(), "unknown", false);
        setBooleanField(term737735, term737735.getClass(), "resolved", false);
        setField(term737735, term737735.getClass(), "resolveResult", null);
        setField(term737735, term737735.getClass(), "registry", null);
        Class<? extends Object> term738637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738636 = ((Class) term738637).getDeclaredField((String) "ORDINARY");
        ((Field) term738636).setAccessible(true);
        Object enum1374 = ((Field) term738636).get((Object) null);
        term737740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term737740, term737740.getClass(), "this$0", null);
        setField(term737740, term737740.getClass(), "call", null);
        setField(term737740, term737740.getClass(), "prototype", null);
        setField(term737740, term737740.getClass(), "kind", enum1374);
        setField(term737740, term737740.getClass(), "typeOfThis", null);
        setField(term737740, term737740.getClass(), "source", null);
        setField(term737740, term737740.getClass(), "implementedInterfaces", null);
        setField(term737740, term737740.getClass(), "subTypes", null);
        setField(term737740, term737740.getClass(), "templateTypeName", null);
        setField(term737740, term737740.getClass(), "className", null);
        setField(term737740, term737740.getClass(), "properties", null);
        setField(term737740, term737740.getClass(), "implicitPrototype", null);
        setBooleanField(term737740, term737740.getClass(), "nativeType", false);
        setBooleanField(term737740, term737740.getClass(), "visited", false);
        setField(term737740, term737740.getClass(), "docInfo", null);
        setBooleanField(term737740, term737740.getClass(), "unknown", false);
        setBooleanField(term737740, term737740.getClass(), "resolved", false);
        setField(term737740, term737740.getClass(), "resolveResult", null);
        setField(term737740, term737740.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term735508;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term735158, args);
        assertTrue(recursiveEquals(term735158, term737735));
        assertTrue(recursiveEquals(term735508, term737740));
        assertTrue(recursiveEquals(retValue, false));
    }

};


