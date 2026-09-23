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
import java.lang.Boolean;

public class ArrowType_init_181064513915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term196;
     Object term223;

    public ArrowType_init_181064513915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term116 = new HashMap();
        HashMap term126 = new HashMap();
        Set<Object> term1520 =  ((Map) term126).keySet();
        HashSet term125 = new HashSet((Collection<? extends Object>) term1520);
        HashMap term132 = new HashMap();
        Set<Object> term1521 =  ((Map) term132).keySet();
        HashSet term131 = new HashSet((Collection<? extends Object>) term1521);
        HashMap term143 = new HashMap();
        Set<Object> term1522 =  ((Map) term143).keySet();
        HashSet term142 = new HashSet((Collection<? extends Object>) term1522);
        HashMap term165 = new HashMap();
        HashMap term180 = new HashMap();
        HashMap term185 = new HashMap();
        term114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term115 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term114, term114.getClass(), "reporter", null);
        setField(term114, term114.getClass(), "nativeTypes", term115);
        setField(term114, term114.getClass(), "namesToTypes", term116);
        setField(term114, term114.getClass(), "namespaces", term125);
        setField(term114, term114.getClass(), "nonNullableTypeNames", term131);
        setField(term114, term114.getClass(), "forwardDeclaredTypes", term142);
        setField(term114, term114.getClass(), "typesIndexedByProperty", term165);
        setField(term114, term114.getClass(), "eachRefTypeIndexedByProperty", term180);
        setField(term114, term114.getClass(), "greatestSubtypeByProperty", term185);
        setField(term114, term114.getClass(), "interfaceToImplementors", null);
        setField(term114, term114.getClass(), "unresolvedNamedTypes", null);
        setField(term114, term114.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term114, term114.getClass(), "lastGeneration", false);
        setField(term114, term114.getClass(), "templateTypeName", null);
        setField(term114, term114.getClass(), "templateType", null);
        setBooleanField(term114, term114.getClass(), "tolerateUndefinedValues", false);
        setField(term114, term114.getClass(), "resolveMode", null);
        term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term196, term196.getClass(), "type", -2068769794);
        setIntField(term198, term198.getClass(), "type", -117576464);
        setIntField(term200, term200.getClass(), "type", -1007160944);
        setIntField(term202, term202.getClass(), "type", 1135664017);
        setIntField(term204, term204.getClass(), "type", 590364439);
        setField(term204, term204.getClass(), "next", null);
        setField(term204, term204.getClass(), "first", null);
        setField(term204, term204.getClass(), "last", null);
        setField(term204, term204.getClass(), "propListHead", null);
        setIntField(term204, term204.getClass(), "sourcePosition", 0);
        setField(term204, term204.getClass(), "jsType", null);
        setField(term204, term204.getClass(), "parent", null);
        setField(term202, term202.getClass(), "next", term204);
        setIntField(term207, term207.getClass(), "type", 865208305);
        setField(term207, term207.getClass(), "next", null);
        setField(term207, term207.getClass(), "first", null);
        setField(term207, term207.getClass(), "last", term204);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term202, term202.getClass(), "first", term207);
        setField(term202, term202.getClass(), "last", term200);
        setField(term202, term202.getClass(), "propListHead", null);
        setIntField(term202, term202.getClass(), "sourcePosition", 0);
        setField(term202, term202.getClass(), "jsType", null);
        setField(term202, term202.getClass(), "parent", null);
        setField(term200, term200.getClass(), "next", term202);
        setField(term200, term200.getClass(), "first", term204);
        setIntField(term211, term211.getClass(), "type", -244121226);
        setIntField(term213, term213.getClass(), "type", -203030934);
        setField(term213, term213.getClass(), "next", null);
        setField(term213, term213.getClass(), "first", term207);
        setField(term213, term213.getClass(), "last", term202);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term211, term211.getClass(), "next", term213);
        setField(term211, term211.getClass(), "first", term198);
        setField(term211, term211.getClass(), "last", term198);
        setField(term211, term211.getClass(), "propListHead", null);
        setIntField(term211, term211.getClass(), "sourcePosition", 0);
        setField(term211, term211.getClass(), "jsType", null);
        setField(term211, term211.getClass(), "parent", null);
        setField(term200, term200.getClass(), "last", term211);
        setField(term200, term200.getClass(), "propListHead", null);
        setIntField(term200, term200.getClass(), "sourcePosition", 0);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term198, term198.getClass(), "next", term200);
        setIntField(term218, term218.getClass(), "type", -1179120542);
        setField(term218, term218.getClass(), "next", term211);
        setField(term218, term218.getClass(), "first", term213);
        setField(term218, term218.getClass(), "last", term196);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        setField(term198, term198.getClass(), "first", term218);
        setField(term198, term198.getClass(), "last", term218);
        setField(term198, term198.getClass(), "propListHead", null);
        setIntField(term198, term198.getClass(), "sourcePosition", 0);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term196, term196.getClass(), "next", term198);
        setField(term196, term196.getClass(), "first", term202);
        setField(term196, term196.getClass(), "last", term204);
        setField(term196, term196.getClass(), "propListHead", null);
        setIntField(term196, term196.getClass(), "sourcePosition", 0);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
        term223 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term114;
        args[1] = term196;
        args[2] = null;
        args[3] = term223;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


