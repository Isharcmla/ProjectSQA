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

public class FunctionType_isSubtype_2101002158786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775848;
     Object term776198;
     Object term778498;
     Object term778503;

    public FunctionType_isSubtype_2101002158786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term778509 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term778508 = ((Class) term778509).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term778508).setAccessible(true);
        Object enum1450 = ((Field) term778508).get((Object) null);
        term775848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term776090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term775848, term775848.getClass(), "kind", enum1450);
        setField(term775848, term775848.getClass(), "call", term776090);
        term776198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term776198, term776198.getClass(), "kind", enum1450);
        setField(term776198, term776198.getClass(), "call", null);
        Class<? extends Object> term778809 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term778808 = ((Class) term778809).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term778808).setAccessible(true);
        Object enum1451 = ((Field) term778808).get((Object) null);
        term778498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term778499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term778499, term778499.getClass(), "parameters", null);
        setField(term778499, term778499.getClass(), "returnType", null);
        setBooleanField(term778499, term778499.getClass(), "resolved", false);
        setField(term778499, term778499.getClass(), "resolveResult", null);
        setField(term778499, term778499.getClass(), "registry", null);
        setField(term778498, term778498.getClass(), "call", term778499);
        setField(term778498, term778498.getClass(), "prototype", null);
        setField(term778498, term778498.getClass(), "kind", enum1451);
        setField(term778498, term778498.getClass(), "typeOfThis", null);
        setField(term778498, term778498.getClass(), "source", null);
        setField(term778498, term778498.getClass(), "implementedInterfaces", null);
        setField(term778498, term778498.getClass(), "subTypes", null);
        setField(term778498, term778498.getClass(), "templateTypeName", null);
        setField(term778498, term778498.getClass(), "className", null);
        setField(term778498, term778498.getClass(), "properties", null);
        setField(term778498, term778498.getClass(), "implicitPrototype", null);
        setBooleanField(term778498, term778498.getClass(), "nativeType", false);
        setBooleanField(term778498, term778498.getClass(), "visited", false);
        setField(term778498, term778498.getClass(), "docInfo", null);
        setBooleanField(term778498, term778498.getClass(), "unknown", false);
        setBooleanField(term778498, term778498.getClass(), "resolved", false);
        setField(term778498, term778498.getClass(), "resolveResult", null);
        setField(term778498, term778498.getClass(), "registry", null);
        Class<? extends Object> term779109 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term779108 = ((Class) term779109).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term779108).setAccessible(true);
        Object enum1452 = ((Field) term779108).get((Object) null);
        term778503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term778503, term778503.getClass(), "this$0", null);
        setField(term778503, term778503.getClass(), "call", null);
        setField(term778503, term778503.getClass(), "prototype", null);
        setField(term778503, term778503.getClass(), "kind", enum1452);
        setField(term778503, term778503.getClass(), "typeOfThis", null);
        setField(term778503, term778503.getClass(), "source", null);
        setField(term778503, term778503.getClass(), "implementedInterfaces", null);
        setField(term778503, term778503.getClass(), "subTypes", null);
        setField(term778503, term778503.getClass(), "templateTypeName", null);
        setField(term778503, term778503.getClass(), "className", null);
        setField(term778503, term778503.getClass(), "properties", null);
        setField(term778503, term778503.getClass(), "implicitPrototype", null);
        setBooleanField(term778503, term778503.getClass(), "nativeType", false);
        setBooleanField(term778503, term778503.getClass(), "visited", false);
        setField(term778503, term778503.getClass(), "docInfo", null);
        setBooleanField(term778503, term778503.getClass(), "unknown", false);
        setBooleanField(term778503, term778503.getClass(), "resolved", false);
        setField(term778503, term778503.getClass(), "resolveResult", null);
        setField(term778503, term778503.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term776198;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term775848, args);
        assertTrue(recursiveEquals(term775848, term778498));
        assertTrue(recursiveEquals(term776198, term778503));
        assertTrue(recursiveEquals(retValue, false));
    }

};


