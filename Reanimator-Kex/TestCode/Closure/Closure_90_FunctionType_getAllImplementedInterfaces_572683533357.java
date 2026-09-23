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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllImplementedInterfaces_572683533357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251913;
     Object term252735;
     Object term252728;

    public FunctionType_getAllImplementedInterfaces_572683533357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term252744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term252743 = ((Class) term252744).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term252743).setAccessible(true);
        Object enum439 = ((Field) term252743).get((Object) null);
        ArrayList term252331 = new ArrayList();
        term251913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term252179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term252279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term251913, term251913.getClass(), "kind", enum439);
        setField(term252179, term252179.getClass(), "implicitPrototypeFallback", term252279);
        setField(term251913, term251913.getClass(), "prototype", term252179);
        setField(term251913, term251913.getClass(), "implementedInterfaces", term252331);
        Class<? extends Object> term253044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term253043 = ((Class) term253044).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term253043).setAccessible(true);
        Object enum440 = ((Field) term253043).get((Object) null);
        ArrayList term252741 = new ArrayList();
        term252735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term252736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term252737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term252735, term252735.getClass(), "this$0", null);
        setField(term252735, term252735.getClass(), "call", null);
        setField(term252736, term252736.getClass(), "ownerFunction", null);
        setField(term252736, term252736.getClass(), "className", null);
        setField(term252736, term252736.getClass(), "properties", null);
        setBooleanField(term252736, term252736.getClass(), "nativeType", false);
        setField(term252737, term252737.getClass(), "call", null);
        setField(term252737, term252737.getClass(), "prototype", null);
        setField(term252737, term252737.getClass(), "kind", null);
        setField(term252737, term252737.getClass(), "typeOfThis", null);
        setField(term252737, term252737.getClass(), "source", null);
        setField(term252737, term252737.getClass(), "implementedInterfaces", null);
        setField(term252737, term252737.getClass(), "subTypes", null);
        setField(term252737, term252737.getClass(), "templateTypeName", null);
        setField(term252737, term252737.getClass(), "className", null);
        setField(term252737, term252737.getClass(), "properties", null);
        setBooleanField(term252737, term252737.getClass(), "nativeType", false);
        setField(term252737, term252737.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term252737, term252737.getClass(), "prettyPrint", false);
        setBooleanField(term252737, term252737.getClass(), "visited", false);
        setField(term252737, term252737.getClass(), "docInfo", null);
        setBooleanField(term252737, term252737.getClass(), "unknown", false);
        setBooleanField(term252737, term252737.getClass(), "resolved", false);
        setField(term252737, term252737.getClass(), "resolveResult", null);
        setField(term252737, term252737.getClass(), "registry", null);
        setField(term252736, term252736.getClass(), "implicitPrototypeFallback", term252737);
        setBooleanField(term252736, term252736.getClass(), "prettyPrint", false);
        setBooleanField(term252736, term252736.getClass(), "visited", false);
        setField(term252736, term252736.getClass(), "docInfo", null);
        setBooleanField(term252736, term252736.getClass(), "unknown", false);
        setBooleanField(term252736, term252736.getClass(), "resolved", false);
        setField(term252736, term252736.getClass(), "resolveResult", null);
        setField(term252736, term252736.getClass(), "registry", null);
        setField(term252735, term252735.getClass(), "prototype", term252736);
        setField(term252735, term252735.getClass(), "kind", enum440);
        setField(term252735, term252735.getClass(), "typeOfThis", null);
        setField(term252735, term252735.getClass(), "source", null);
        setField(term252735, term252735.getClass(), "implementedInterfaces", term252741);
        setField(term252735, term252735.getClass(), "subTypes", null);
        setField(term252735, term252735.getClass(), "templateTypeName", null);
        setField(term252735, term252735.getClass(), "className", null);
        setField(term252735, term252735.getClass(), "properties", null);
        setBooleanField(term252735, term252735.getClass(), "nativeType", false);
        setField(term252735, term252735.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term252735, term252735.getClass(), "prettyPrint", false);
        setBooleanField(term252735, term252735.getClass(), "visited", false);
        setField(term252735, term252735.getClass(), "docInfo", null);
        setBooleanField(term252735, term252735.getClass(), "unknown", false);
        setBooleanField(term252735, term252735.getClass(), "resolved", false);
        setField(term252735, term252735.getClass(), "resolveResult", null);
        setField(term252735, term252735.getClass(), "registry", null);
        LinkedHashMap term252729 = new LinkedHashMap();
        Set<Object> term253343 =  ((Map) term252729).keySet();
        term252728 = new LinkedHashSet((Collection<? extends Object>) term253343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term251913, args);
        assertTrue(recursiveEquals(term251913, term252735));
        assertTrue(recursiveEquals(retValue, term252728));
    }

};


