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

public class FunctionType_isEquivalentTo_230708275337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226974;
     Object term227636;
     Object term228498;
     Object term228503;

    public FunctionType_isEquivalentTo_230708275337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term228509 = ((Class) term228510).getDeclaredField((String) "INTERFACE");
        ((Field) term228509).setAccessible(true);
        Object enum399 = ((Field) term228509).get((Object) null);
        term226974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term227526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term226974, term226974.getClass(), "kind", enum399);
        setField(term226974, term226974.getClass(), "typeOfThis", term227526);
        Class<? extends Object> term228804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term228803 = ((Class) term228804).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term228803).setAccessible(true);
        Object enum400 = ((Field) term228803).get((Object) null);
        term227636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term227820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term227636, term227636.getClass(), "kind", enum400);
        setField(term227636, term227636.getClass(), "typeOfThis", term227820);
        Class<? extends Object> term229104 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term229103 = ((Class) term229104).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term229103).setAccessible(true);
        Object enum401 = ((Field) term229103).get((Object) null);
        term228498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term228502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term228498, term228498.getClass(), "call", null);
        setField(term228498, term228498.getClass(), "prototype", null);
        setField(term228498, term228498.getClass(), "kind", enum401);
        setField(term228502, term228502.getClass(), "this$0", null);
        setField(term228502, term228502.getClass(), "call", null);
        setField(term228502, term228502.getClass(), "prototype", null);
        setField(term228502, term228502.getClass(), "kind", null);
        setField(term228502, term228502.getClass(), "typeOfThis", null);
        setField(term228502, term228502.getClass(), "source", null);
        setField(term228502, term228502.getClass(), "implementedInterfaces", null);
        setField(term228502, term228502.getClass(), "subTypes", null);
        setField(term228502, term228502.getClass(), "templateTypeName", null);
        setField(term228502, term228502.getClass(), "className", null);
        setField(term228502, term228502.getClass(), "properties", null);
        setBooleanField(term228502, term228502.getClass(), "nativeType", false);
        setField(term228502, term228502.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term228502, term228502.getClass(), "prettyPrint", false);
        setBooleanField(term228502, term228502.getClass(), "visited", false);
        setField(term228502, term228502.getClass(), "docInfo", null);
        setBooleanField(term228502, term228502.getClass(), "unknown", false);
        setBooleanField(term228502, term228502.getClass(), "resolved", false);
        setField(term228502, term228502.getClass(), "resolveResult", null);
        setField(term228502, term228502.getClass(), "registry", null);
        setField(term228498, term228498.getClass(), "typeOfThis", term228502);
        setField(term228498, term228498.getClass(), "source", null);
        setField(term228498, term228498.getClass(), "implementedInterfaces", null);
        setField(term228498, term228498.getClass(), "subTypes", null);
        setField(term228498, term228498.getClass(), "templateTypeName", null);
        setField(term228498, term228498.getClass(), "className", null);
        setField(term228498, term228498.getClass(), "properties", null);
        setBooleanField(term228498, term228498.getClass(), "nativeType", false);
        setField(term228498, term228498.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term228498, term228498.getClass(), "prettyPrint", false);
        setBooleanField(term228498, term228498.getClass(), "visited", false);
        setField(term228498, term228498.getClass(), "docInfo", null);
        setBooleanField(term228498, term228498.getClass(), "unknown", false);
        setBooleanField(term228498, term228498.getClass(), "resolved", false);
        setField(term228498, term228498.getClass(), "resolveResult", null);
        setField(term228498, term228498.getClass(), "registry", null);
        Class<? extends Object> term229404 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term229403 = ((Class) term229404).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term229403).setAccessible(true);
        Object enum402 = ((Field) term229403).get((Object) null);
        term228503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term228507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term228503, term228503.getClass(), "call", null);
        setField(term228503, term228503.getClass(), "prototype", null);
        setField(term228503, term228503.getClass(), "kind", enum402);
        setField(term228507, term228507.getClass(), "call", null);
        setField(term228507, term228507.getClass(), "prototype", null);
        setField(term228507, term228507.getClass(), "kind", null);
        setField(term228507, term228507.getClass(), "typeOfThis", null);
        setField(term228507, term228507.getClass(), "source", null);
        setField(term228507, term228507.getClass(), "implementedInterfaces", null);
        setField(term228507, term228507.getClass(), "subTypes", null);
        setField(term228507, term228507.getClass(), "templateTypeName", null);
        setField(term228507, term228507.getClass(), "className", null);
        setField(term228507, term228507.getClass(), "properties", null);
        setBooleanField(term228507, term228507.getClass(), "nativeType", false);
        setField(term228507, term228507.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term228507, term228507.getClass(), "prettyPrint", false);
        setBooleanField(term228507, term228507.getClass(), "visited", false);
        setField(term228507, term228507.getClass(), "docInfo", null);
        setBooleanField(term228507, term228507.getClass(), "unknown", false);
        setBooleanField(term228507, term228507.getClass(), "resolved", false);
        setField(term228507, term228507.getClass(), "resolveResult", null);
        setField(term228507, term228507.getClass(), "registry", null);
        setField(term228503, term228503.getClass(), "typeOfThis", term228507);
        setField(term228503, term228503.getClass(), "source", null);
        setField(term228503, term228503.getClass(), "implementedInterfaces", null);
        setField(term228503, term228503.getClass(), "subTypes", null);
        setField(term228503, term228503.getClass(), "templateTypeName", null);
        setField(term228503, term228503.getClass(), "className", null);
        setField(term228503, term228503.getClass(), "properties", null);
        setBooleanField(term228503, term228503.getClass(), "nativeType", false);
        setField(term228503, term228503.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term228503, term228503.getClass(), "prettyPrint", false);
        setBooleanField(term228503, term228503.getClass(), "visited", false);
        setField(term228503, term228503.getClass(), "docInfo", null);
        setBooleanField(term228503, term228503.getClass(), "unknown", false);
        setBooleanField(term228503, term228503.getClass(), "resolved", false);
        setField(term228503, term228503.getClass(), "resolveResult", null);
        setField(term228503, term228503.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term227636;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term226974, args);
        assertTrue(recursiveEquals(term226974, term228498));
        assertTrue(recursiveEquals(term227636, term228503));
        assertTrue(recursiveEquals(retValue, false));
    }

};


