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

public class FunctionType_getAllImplementedInterfaces_572683533255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126505;
     Object term127468;
     Object term127462;

    public FunctionType_getAllImplementedInterfaces_572683533255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127476 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127475 = ((Class) term127476).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term127475).setAccessible(true);
        Object enum243 = ((Field) term127475).get((Object) null);
        ArrayList term126823 = new ArrayList();
        term126505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term126771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term126505, term126505.getClass(), "kind", enum243);
        setField(term126771, term126771.getClass(), "implicitPrototype", null);
        setField(term126505, term126505.getClass(), "prototype", term126771);
        setField(term126505, term126505.getClass(), "implementedInterfaces", term126823);
        Class<? extends Object> term127776 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127775 = ((Class) term127776).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term127775).setAccessible(true);
        Object enum244 = ((Field) term127775).get((Object) null);
        ArrayList term127473 = new ArrayList();
        term127468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term127469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term127468, term127468.getClass(), "call", null);
        setField(term127469, term127469.getClass(), "ownerFunction", null);
        setField(term127469, term127469.getClass(), "className", null);
        setField(term127469, term127469.getClass(), "properties", null);
        setField(term127469, term127469.getClass(), "implicitPrototype", null);
        setBooleanField(term127469, term127469.getClass(), "nativeType", false);
        setBooleanField(term127469, term127469.getClass(), "visited", false);
        setField(term127469, term127469.getClass(), "docInfo", null);
        setBooleanField(term127469, term127469.getClass(), "unknown", false);
        setBooleanField(term127469, term127469.getClass(), "resolved", false);
        setField(term127469, term127469.getClass(), "resolveResult", null);
        setField(term127469, term127469.getClass(), "registry", null);
        setField(term127468, term127468.getClass(), "prototype", term127469);
        setField(term127468, term127468.getClass(), "kind", enum244);
        setField(term127468, term127468.getClass(), "typeOfThis", null);
        setField(term127468, term127468.getClass(), "source", null);
        setField(term127468, term127468.getClass(), "implementedInterfaces", term127473);
        setField(term127468, term127468.getClass(), "subTypes", null);
        setField(term127468, term127468.getClass(), "templateTypeName", null);
        setField(term127468, term127468.getClass(), "className", null);
        setField(term127468, term127468.getClass(), "properties", null);
        setField(term127468, term127468.getClass(), "implicitPrototype", null);
        setBooleanField(term127468, term127468.getClass(), "nativeType", false);
        setBooleanField(term127468, term127468.getClass(), "visited", false);
        setField(term127468, term127468.getClass(), "docInfo", null);
        setBooleanField(term127468, term127468.getClass(), "unknown", false);
        setBooleanField(term127468, term127468.getClass(), "resolved", false);
        setField(term127468, term127468.getClass(), "resolveResult", null);
        setField(term127468, term127468.getClass(), "registry", null);
        HashMap term127463 = new HashMap();
        Set<Object> term128075 =  ((Map) term127463).keySet();
        term127462 = new HashSet((Collection<? extends Object>) term128075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term126505, args);
        assertTrue(recursiveEquals(term126505, term127468));
        assertTrue(recursiveEquals(retValue, term127462));
    }

};


