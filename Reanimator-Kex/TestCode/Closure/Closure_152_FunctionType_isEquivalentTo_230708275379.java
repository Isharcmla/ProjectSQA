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

public class FunctionType_isEquivalentTo_230708275379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276940;
     Object term277602;
     Object term278463;
     Object term278468;

    public FunctionType_isEquivalentTo_230708275379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278475 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term278474 = ((Class) term278475).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term278474).setAccessible(true);
        Object enum486 = ((Field) term278474).get((Object) null);
        term276940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term277492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term276940, term276940.getClass(), "kind", enum486);
        setField(term276940, term276940.getClass(), "typeOfThis", term277492);
        Class<? extends Object> term278775 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term278774 = ((Class) term278775).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term278774).setAccessible(true);
        Object enum487 = ((Field) term278774).get((Object) null);
        term277602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term277776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term277602, term277602.getClass(), "kind", enum487);
        setField(term277602, term277602.getClass(), "typeOfThis", term277776);
        Class<? extends Object> term279075 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term279074 = ((Class) term279075).getDeclaredField((String) "INTERFACE");
        ((Field) term279074).setAccessible(true);
        Object enum488 = ((Field) term279074).get((Object) null);
        term278463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term278467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term278463, term278463.getClass(), "call", null);
        setField(term278463, term278463.getClass(), "prototype", null);
        setField(term278463, term278463.getClass(), "kind", enum488);
        setField(term278467, term278467.getClass(), "this$0", null);
        setField(term278467, term278467.getClass(), "call", null);
        setField(term278467, term278467.getClass(), "prototype", null);
        setField(term278467, term278467.getClass(), "kind", null);
        setField(term278467, term278467.getClass(), "typeOfThis", null);
        setField(term278467, term278467.getClass(), "source", null);
        setField(term278467, term278467.getClass(), "implementedInterfaces", null);
        setField(term278467, term278467.getClass(), "subTypes", null);
        setField(term278467, term278467.getClass(), "templateTypeName", null);
        setField(term278467, term278467.getClass(), "className", null);
        setField(term278467, term278467.getClass(), "properties", null);
        setBooleanField(term278467, term278467.getClass(), "nativeType", false);
        setField(term278467, term278467.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278467, term278467.getClass(), "prettyPrint", false);
        setBooleanField(term278467, term278467.getClass(), "visited", false);
        setField(term278467, term278467.getClass(), "docInfo", null);
        setBooleanField(term278467, term278467.getClass(), "unknown", false);
        setBooleanField(term278467, term278467.getClass(), "resolved", false);
        setField(term278467, term278467.getClass(), "resolveResult", null);
        setField(term278467, term278467.getClass(), "registry", null);
        setField(term278463, term278463.getClass(), "typeOfThis", term278467);
        setField(term278463, term278463.getClass(), "source", null);
        setField(term278463, term278463.getClass(), "implementedInterfaces", null);
        setField(term278463, term278463.getClass(), "subTypes", null);
        setField(term278463, term278463.getClass(), "templateTypeName", null);
        setField(term278463, term278463.getClass(), "className", null);
        setField(term278463, term278463.getClass(), "properties", null);
        setBooleanField(term278463, term278463.getClass(), "nativeType", false);
        setField(term278463, term278463.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278463, term278463.getClass(), "prettyPrint", false);
        setBooleanField(term278463, term278463.getClass(), "visited", false);
        setField(term278463, term278463.getClass(), "docInfo", null);
        setBooleanField(term278463, term278463.getClass(), "unknown", false);
        setBooleanField(term278463, term278463.getClass(), "resolved", false);
        setField(term278463, term278463.getClass(), "resolveResult", null);
        setField(term278463, term278463.getClass(), "registry", null);
        Class<? extends Object> term279369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term279368 = ((Class) term279369).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term279368).setAccessible(true);
        Object enum489 = ((Field) term279368).get((Object) null);
        term278468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term278472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term278468, term278468.getClass(), "call", null);
        setField(term278468, term278468.getClass(), "prototype", null);
        setField(term278468, term278468.getClass(), "kind", enum489);
        setField(term278472, term278472.getClass(), "leastSupertypeVisitor", null);
        setField(term278472, term278472.getClass(), "greatestSubtypeVisitor", null);
        setField(term278472, term278472.getClass(), "call", null);
        setField(term278472, term278472.getClass(), "prototype", null);
        setField(term278472, term278472.getClass(), "kind", null);
        setField(term278472, term278472.getClass(), "typeOfThis", null);
        setField(term278472, term278472.getClass(), "source", null);
        setField(term278472, term278472.getClass(), "implementedInterfaces", null);
        setField(term278472, term278472.getClass(), "subTypes", null);
        setField(term278472, term278472.getClass(), "templateTypeName", null);
        setField(term278472, term278472.getClass(), "className", null);
        setField(term278472, term278472.getClass(), "properties", null);
        setBooleanField(term278472, term278472.getClass(), "nativeType", false);
        setField(term278472, term278472.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278472, term278472.getClass(), "prettyPrint", false);
        setBooleanField(term278472, term278472.getClass(), "visited", false);
        setField(term278472, term278472.getClass(), "docInfo", null);
        setBooleanField(term278472, term278472.getClass(), "unknown", false);
        setBooleanField(term278472, term278472.getClass(), "resolved", false);
        setField(term278472, term278472.getClass(), "resolveResult", null);
        setField(term278472, term278472.getClass(), "registry", null);
        setField(term278468, term278468.getClass(), "typeOfThis", term278472);
        setField(term278468, term278468.getClass(), "source", null);
        setField(term278468, term278468.getClass(), "implementedInterfaces", null);
        setField(term278468, term278468.getClass(), "subTypes", null);
        setField(term278468, term278468.getClass(), "templateTypeName", null);
        setField(term278468, term278468.getClass(), "className", null);
        setField(term278468, term278468.getClass(), "properties", null);
        setBooleanField(term278468, term278468.getClass(), "nativeType", false);
        setField(term278468, term278468.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278468, term278468.getClass(), "prettyPrint", false);
        setBooleanField(term278468, term278468.getClass(), "visited", false);
        setField(term278468, term278468.getClass(), "docInfo", null);
        setBooleanField(term278468, term278468.getClass(), "unknown", false);
        setBooleanField(term278468, term278468.getClass(), "resolved", false);
        setField(term278468, term278468.getClass(), "resolveResult", null);
        setField(term278468, term278468.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term277602;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term276940, args);
        assertTrue(recursiveEquals(term276940, term278463));
        assertTrue(recursiveEquals(term277602, term278468));
        assertTrue(recursiveEquals(retValue, false));
    }

};


