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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406204;
     Object term407024;
     Object term407018;

    public FunctionType_getAllImplementedInterfaces_572683533479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term407033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term407032 = ((Class) term407033).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term407032).setAccessible(true);
        Object enum736 = ((Field) term407032).get((Object) null);
        ArrayList term406622 = new ArrayList();
        term406204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term406470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term406570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term406204, term406204.getClass(), "kind", enum736);
        setField(term406470, term406470.getClass(), "implicitPrototype", term406570);
        setField(term406204, term406204.getClass(), "prototype", term406470);
        setField(term406204, term406204.getClass(), "implementedInterfaces", term406622);
        Class<? extends Object> term407333 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term407332 = ((Class) term407333).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term407332).setAccessible(true);
        Object enum737 = ((Field) term407332).get((Object) null);
        ArrayList term407030 = new ArrayList();
        term407024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term407025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term407026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term407024, term407024.getClass(), "call", null);
        setField(term407025, term407025.getClass(), "ownerFunction", null);
        setField(term407025, term407025.getClass(), "className", null);
        setField(term407025, term407025.getClass(), "properties", null);
        setField(term407026, term407026.getClass(), "leastSupertypeVisitor", null);
        setField(term407026, term407026.getClass(), "greatestSubtypeVisitor", null);
        setField(term407026, term407026.getClass(), "call", null);
        setField(term407026, term407026.getClass(), "prototype", null);
        setField(term407026, term407026.getClass(), "kind", null);
        setField(term407026, term407026.getClass(), "typeOfThis", null);
        setField(term407026, term407026.getClass(), "source", null);
        setField(term407026, term407026.getClass(), "implementedInterfaces", null);
        setField(term407026, term407026.getClass(), "subTypes", null);
        setField(term407026, term407026.getClass(), "templateTypeName", null);
        setField(term407026, term407026.getClass(), "className", null);
        setField(term407026, term407026.getClass(), "properties", null);
        setField(term407026, term407026.getClass(), "implicitPrototype", null);
        setBooleanField(term407026, term407026.getClass(), "nativeType", false);
        setBooleanField(term407026, term407026.getClass(), "prettyPrint", false);
        setBooleanField(term407026, term407026.getClass(), "visited", false);
        setField(term407026, term407026.getClass(), "docInfo", null);
        setBooleanField(term407026, term407026.getClass(), "unknown", false);
        setBooleanField(term407026, term407026.getClass(), "resolved", false);
        setField(term407026, term407026.getClass(), "resolveResult", null);
        setField(term407026, term407026.getClass(), "registry", null);
        setField(term407025, term407025.getClass(), "implicitPrototype", term407026);
        setBooleanField(term407025, term407025.getClass(), "nativeType", false);
        setBooleanField(term407025, term407025.getClass(), "prettyPrint", false);
        setBooleanField(term407025, term407025.getClass(), "visited", false);
        setField(term407025, term407025.getClass(), "docInfo", null);
        setBooleanField(term407025, term407025.getClass(), "unknown", false);
        setBooleanField(term407025, term407025.getClass(), "resolved", false);
        setField(term407025, term407025.getClass(), "resolveResult", null);
        setField(term407025, term407025.getClass(), "registry", null);
        setField(term407024, term407024.getClass(), "prototype", term407025);
        setField(term407024, term407024.getClass(), "kind", enum737);
        setField(term407024, term407024.getClass(), "typeOfThis", null);
        setField(term407024, term407024.getClass(), "source", null);
        setField(term407024, term407024.getClass(), "implementedInterfaces", term407030);
        setField(term407024, term407024.getClass(), "subTypes", null);
        setField(term407024, term407024.getClass(), "templateTypeName", null);
        setField(term407024, term407024.getClass(), "className", null);
        setField(term407024, term407024.getClass(), "properties", null);
        setField(term407024, term407024.getClass(), "implicitPrototype", null);
        setBooleanField(term407024, term407024.getClass(), "nativeType", false);
        setBooleanField(term407024, term407024.getClass(), "prettyPrint", false);
        setBooleanField(term407024, term407024.getClass(), "visited", false);
        setField(term407024, term407024.getClass(), "docInfo", null);
        setBooleanField(term407024, term407024.getClass(), "unknown", false);
        setBooleanField(term407024, term407024.getClass(), "resolved", false);
        setField(term407024, term407024.getClass(), "resolveResult", null);
        setField(term407024, term407024.getClass(), "registry", null);
        HashMap term407019 = new HashMap();
        Set<Object> term407632 =  ((Map) term407019).keySet();
        term407018 = new HashSet((Collection<? extends Object>) term407632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term406204, args);
        assertTrue(recursiveEquals(term406204, term407024));
        assertTrue(recursiveEquals(retValue, term407018));
    }

};


