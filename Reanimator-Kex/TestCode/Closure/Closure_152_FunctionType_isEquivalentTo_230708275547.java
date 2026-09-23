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

public class FunctionType_isEquivalentTo_230708275547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508131;
     Object term508793;
     Object term509503;
     Object term509508;

    public FunctionType_isEquivalentTo_230708275547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term509515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term509514 = ((Class) term509515).getDeclaredField((String) "ORDINARY");
        ((Field) term509514).setAccessible(true);
        Object enum814 = ((Field) term509514).get((Object) null);
        term508131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term508683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term508131, term508131.getClass(), "kind", enum814);
        setField(term508131, term508131.getClass(), "typeOfThis", term508683);
        term508793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term509115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term508793, term508793.getClass(), "kind", enum814);
        setField(term508793, term508793.getClass(), "typeOfThis", term509115);
        Class<? extends Object> term509806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term509805 = ((Class) term509806).getDeclaredField((String) "ORDINARY");
        ((Field) term509805).setAccessible(true);
        Object enum815 = ((Field) term509805).get((Object) null);
        term509503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term509507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term509503, term509503.getClass(), "call", null);
        setField(term509503, term509503.getClass(), "prototype", null);
        setField(term509503, term509503.getClass(), "kind", enum815);
        setField(term509507, term509507.getClass(), "this$0", null);
        setField(term509507, term509507.getClass(), "call", null);
        setField(term509507, term509507.getClass(), "prototype", null);
        setField(term509507, term509507.getClass(), "kind", null);
        setField(term509507, term509507.getClass(), "typeOfThis", null);
        setField(term509507, term509507.getClass(), "source", null);
        setField(term509507, term509507.getClass(), "implementedInterfaces", null);
        setField(term509507, term509507.getClass(), "subTypes", null);
        setField(term509507, term509507.getClass(), "templateTypeName", null);
        setField(term509507, term509507.getClass(), "className", null);
        setField(term509507, term509507.getClass(), "properties", null);
        setBooleanField(term509507, term509507.getClass(), "nativeType", false);
        setField(term509507, term509507.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term509507, term509507.getClass(), "prettyPrint", false);
        setBooleanField(term509507, term509507.getClass(), "visited", false);
        setField(term509507, term509507.getClass(), "docInfo", null);
        setBooleanField(term509507, term509507.getClass(), "unknown", false);
        setBooleanField(term509507, term509507.getClass(), "resolved", false);
        setField(term509507, term509507.getClass(), "resolveResult", null);
        setField(term509507, term509507.getClass(), "registry", null);
        setField(term509503, term509503.getClass(), "typeOfThis", term509507);
        setField(term509503, term509503.getClass(), "source", null);
        setField(term509503, term509503.getClass(), "implementedInterfaces", null);
        setField(term509503, term509503.getClass(), "subTypes", null);
        setField(term509503, term509503.getClass(), "templateTypeName", null);
        setField(term509503, term509503.getClass(), "className", null);
        setField(term509503, term509503.getClass(), "properties", null);
        setBooleanField(term509503, term509503.getClass(), "nativeType", false);
        setField(term509503, term509503.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term509503, term509503.getClass(), "prettyPrint", false);
        setBooleanField(term509503, term509503.getClass(), "visited", false);
        setField(term509503, term509503.getClass(), "docInfo", null);
        setBooleanField(term509503, term509503.getClass(), "unknown", false);
        setBooleanField(term509503, term509503.getClass(), "resolved", false);
        setField(term509503, term509503.getClass(), "resolveResult", null);
        setField(term509503, term509503.getClass(), "registry", null);
        Class<? extends Object> term510097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term510096 = ((Class) term510097).getDeclaredField((String) "ORDINARY");
        ((Field) term510096).setAccessible(true);
        Object enum816 = ((Field) term510096).get((Object) null);
        term509508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term509512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term509508, term509508.getClass(), "call", null);
        setField(term509508, term509508.getClass(), "prototype", null);
        setField(term509508, term509508.getClass(), "kind", enum816);
        setField(term509512, term509512.getClass(), "leastSupertypeVisitor", null);
        setField(term509512, term509512.getClass(), "greatestSubtypeVisitor", null);
        setField(term509512, term509512.getClass(), "call", null);
        setField(term509512, term509512.getClass(), "prototype", null);
        setField(term509512, term509512.getClass(), "kind", null);
        setField(term509512, term509512.getClass(), "typeOfThis", null);
        setField(term509512, term509512.getClass(), "source", null);
        setField(term509512, term509512.getClass(), "implementedInterfaces", null);
        setField(term509512, term509512.getClass(), "subTypes", null);
        setField(term509512, term509512.getClass(), "templateTypeName", null);
        setField(term509512, term509512.getClass(), "className", null);
        setField(term509512, term509512.getClass(), "properties", null);
        setBooleanField(term509512, term509512.getClass(), "nativeType", false);
        setField(term509512, term509512.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term509512, term509512.getClass(), "prettyPrint", false);
        setBooleanField(term509512, term509512.getClass(), "visited", false);
        setField(term509512, term509512.getClass(), "docInfo", null);
        setBooleanField(term509512, term509512.getClass(), "unknown", false);
        setBooleanField(term509512, term509512.getClass(), "resolved", false);
        setField(term509512, term509512.getClass(), "resolveResult", null);
        setField(term509512, term509512.getClass(), "registry", null);
        setField(term509508, term509508.getClass(), "typeOfThis", term509512);
        setField(term509508, term509508.getClass(), "source", null);
        setField(term509508, term509508.getClass(), "implementedInterfaces", null);
        setField(term509508, term509508.getClass(), "subTypes", null);
        setField(term509508, term509508.getClass(), "templateTypeName", null);
        setField(term509508, term509508.getClass(), "className", null);
        setField(term509508, term509508.getClass(), "properties", null);
        setBooleanField(term509508, term509508.getClass(), "nativeType", false);
        setField(term509508, term509508.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term509508, term509508.getClass(), "prettyPrint", false);
        setBooleanField(term509508, term509508.getClass(), "visited", false);
        setField(term509508, term509508.getClass(), "docInfo", null);
        setBooleanField(term509508, term509508.getClass(), "unknown", false);
        setBooleanField(term509508, term509508.getClass(), "resolved", false);
        setField(term509508, term509508.getClass(), "resolveResult", null);
        setField(term509508, term509508.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term508793;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term508131, args);
        assertTrue(recursiveEquals(term508131, term509503));
        assertTrue(recursiveEquals(term508793, term509508));
        assertTrue(recursiveEquals(retValue, false));
    }

};


