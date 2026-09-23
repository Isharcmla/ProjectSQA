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

public class FunctionType_getAllImplementedInterfaces_572683533693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726068;
     Object term726890;
     Object term726883;

    public FunctionType_getAllImplementedInterfaces_572683533693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term726899 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term726898 = ((Class) term726899).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term726898).setAccessible(true);
        Object enum1099 = ((Field) term726898).get((Object) null);
        ArrayList term726486 = new ArrayList();
        term726068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term726334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term726434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term726068, term726068.getClass(), "kind", enum1099);
        setField(term726334, term726334.getClass(), "implicitPrototypeFallback", term726434);
        setField(term726068, term726068.getClass(), "prototype", term726334);
        setField(term726068, term726068.getClass(), "implementedInterfaces", term726486);
        Class<? extends Object> term727199 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term727198 = ((Class) term727199).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term727198).setAccessible(true);
        Object enum1100 = ((Field) term727198).get((Object) null);
        ArrayList term726896 = new ArrayList();
        term726890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term726891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term726892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term726890, term726890.getClass(), "this$0", null);
        setField(term726890, term726890.getClass(), "call", null);
        setField(term726891, term726891.getClass(), "ownerFunction", null);
        setField(term726891, term726891.getClass(), "className", null);
        setField(term726891, term726891.getClass(), "properties", null);
        setBooleanField(term726891, term726891.getClass(), "nativeType", false);
        setField(term726892, term726892.getClass(), "call", null);
        setField(term726892, term726892.getClass(), "prototype", null);
        setField(term726892, term726892.getClass(), "kind", null);
        setField(term726892, term726892.getClass(), "typeOfThis", null);
        setField(term726892, term726892.getClass(), "source", null);
        setField(term726892, term726892.getClass(), "implementedInterfaces", null);
        setField(term726892, term726892.getClass(), "subTypes", null);
        setField(term726892, term726892.getClass(), "templateTypeName", null);
        setField(term726892, term726892.getClass(), "className", null);
        setField(term726892, term726892.getClass(), "properties", null);
        setBooleanField(term726892, term726892.getClass(), "nativeType", false);
        setField(term726892, term726892.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term726892, term726892.getClass(), "prettyPrint", false);
        setBooleanField(term726892, term726892.getClass(), "visited", false);
        setField(term726892, term726892.getClass(), "docInfo", null);
        setBooleanField(term726892, term726892.getClass(), "unknown", false);
        setBooleanField(term726892, term726892.getClass(), "resolved", false);
        setField(term726892, term726892.getClass(), "resolveResult", null);
        setField(term726892, term726892.getClass(), "registry", null);
        setField(term726891, term726891.getClass(), "implicitPrototypeFallback", term726892);
        setBooleanField(term726891, term726891.getClass(), "prettyPrint", false);
        setBooleanField(term726891, term726891.getClass(), "visited", false);
        setField(term726891, term726891.getClass(), "docInfo", null);
        setBooleanField(term726891, term726891.getClass(), "unknown", false);
        setBooleanField(term726891, term726891.getClass(), "resolved", false);
        setField(term726891, term726891.getClass(), "resolveResult", null);
        setField(term726891, term726891.getClass(), "registry", null);
        setField(term726890, term726890.getClass(), "prototype", term726891);
        setField(term726890, term726890.getClass(), "kind", enum1100);
        setField(term726890, term726890.getClass(), "typeOfThis", null);
        setField(term726890, term726890.getClass(), "source", null);
        setField(term726890, term726890.getClass(), "implementedInterfaces", term726896);
        setField(term726890, term726890.getClass(), "subTypes", null);
        setField(term726890, term726890.getClass(), "templateTypeName", null);
        setField(term726890, term726890.getClass(), "className", null);
        setField(term726890, term726890.getClass(), "properties", null);
        setBooleanField(term726890, term726890.getClass(), "nativeType", false);
        setField(term726890, term726890.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term726890, term726890.getClass(), "prettyPrint", false);
        setBooleanField(term726890, term726890.getClass(), "visited", false);
        setField(term726890, term726890.getClass(), "docInfo", null);
        setBooleanField(term726890, term726890.getClass(), "unknown", false);
        setBooleanField(term726890, term726890.getClass(), "resolved", false);
        setField(term726890, term726890.getClass(), "resolveResult", null);
        setField(term726890, term726890.getClass(), "registry", null);
        LinkedHashMap term726884 = new LinkedHashMap();
        Set<Object> term727498 =  ((Map) term726884).keySet();
        term726883 = new LinkedHashSet((Collection<? extends Object>) term727498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term726068, args);
        assertTrue(recursiveEquals(term726068, term726890));
        assertTrue(recursiveEquals(retValue, term726883));
    }

};


