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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_setTemplateTypeName_624567162164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13410;

    public JSTypeRegistry_setTemplateTypeName_624567162164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13412 = new HashMap();
        HashMap term13422 = new HashMap();
        Set<Object> term509544 =  ((Map) term13422).keySet();
        HashSet term13421 = new HashSet((Collection<? extends Object>) term509544);
        HashMap term13428 = new HashMap();
        Set<Object> term509545 =  ((Map) term13428).keySet();
        HashSet term13427 = new HashSet((Collection<? extends Object>) term509545);
        HashMap term13437 = new HashMap();
        Set<Object> term509546 =  ((Map) term13437).keySet();
        HashSet term13436 = new HashSet((Collection<? extends Object>) term509546);
        HashMap term13455 = new HashMap();
        HashMap term13470 = new HashMap();
        HashMap term13475 = new HashMap();
        term13410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13411 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term13410, term13410.getClass(), "reporter", null);
        setField(term13410, term13410.getClass(), "nativeTypes", term13411);
        setField(term13410, term13410.getClass(), "namesToTypes", term13412);
        setField(term13410, term13410.getClass(), "namespaces", term13421);
        setField(term13410, term13410.getClass(), "nonNullableTypeNames", term13427);
        setField(term13410, term13410.getClass(), "forwardDeclaredTypes", term13436);
        setField(term13410, term13410.getClass(), "typesIndexedByProperty", term13455);
        setField(term13410, term13410.getClass(), "eachRefTypeIndexedByProperty", term13470);
        setField(term13410, term13410.getClass(), "greatestSubtypeByProperty", term13475);
        setField(term13410, term13410.getClass(), "interfaceToImplementors", null);
        setField(term13410, term13410.getClass(), "unresolvedNamedTypes", null);
        setField(term13410, term13410.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13410, term13410.getClass(), "lastGeneration", false);
        setField(term13410, term13410.getClass(), "templateTypeName", null);
        setField(term13410, term13410.getClass(), "templateType", null);
        setBooleanField(term13410, term13410.getClass(), "tolerateUndefinedValues", false);
        setField(term13410, term13410.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FKYroLkXZi";
        try {
            callMethod(klass, "setTemplateTypeName", argTypes, term13410, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


