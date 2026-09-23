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

public class FunctionType_init_183823358973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term97;

    public FunctionType_init_183823358973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7 = new HashMap();
        HashMap term17 = new HashMap();
        Set<Object> term50043 =  ((Map) term17).keySet();
        HashSet term16 = new HashSet((Collection<? extends Object>) term50043);
        HashMap term23 = new HashMap();
        Set<Object> term50044 =  ((Map) term23).keySet();
        HashSet term22 = new HashSet((Collection<? extends Object>) term50044);
        HashMap term34 = new HashMap();
        Set<Object> term50045 =  ((Map) term34).keySet();
        HashSet term33 = new HashSet((Collection<? extends Object>) term50045);
        HashMap term54 = new HashMap();
        HashMap term69 = new HashMap();
        HashMap term74 = new HashMap();
        term5 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term5, term5.getClass(), "reporter", null);
        setField(term5, term5.getClass(), "nativeTypes", term6);
        setField(term5, term5.getClass(), "namesToTypes", term7);
        setField(term5, term5.getClass(), "namespaces", term16);
        setField(term5, term5.getClass(), "nonNullableTypeNames", term22);
        setField(term5, term5.getClass(), "forwardDeclaredTypes", term33);
        setField(term5, term5.getClass(), "typesIndexedByProperty", term54);
        setField(term5, term5.getClass(), "eachRefTypeIndexedByProperty", term69);
        setField(term5, term5.getClass(), "greatestSubtypeByProperty", term74);
        setField(term5, term5.getClass(), "interfaceToImplementors", null);
        setField(term5, term5.getClass(), "unresolvedNamedTypes", null);
        setField(term5, term5.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5, term5.getClass(), "lastGeneration", false);
        setField(term5, term5.getClass(), "templateTypes", null);
        setBooleanField(term5, term5.getClass(), "tolerateUndefinedValues", false);
        setField(term5, term5.getClass(), "resolveMode", null);
        term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97, term97.getClass(), "type", -1179120542);
        setIntField(term99, term99.getClass(), "type", -73683645);
        setIntField(term101, term101.getClass(), "type", -226514366);
        setIntField(term103, term103.getClass(), "type", 1193880199);
        setIntField(term105, term105.getClass(), "type", -1087774327);
        setField(term105, term105.getClass(), "next", null);
        setField(term105, term105.getClass(), "first", null);
        setField(term105, term105.getClass(), "last", null);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term103, term103.getClass(), "next", term105);
        setIntField(term108, term108.getClass(), "type", -1530420153);
        setField(term108, term108.getClass(), "next", null);
        setField(term108, term108.getClass(), "first", null);
        setField(term108, term108.getClass(), "last", term105);
        setField(term108, term108.getClass(), "propListHead", null);
        setIntField(term108, term108.getClass(), "sourcePosition", 0);
        setField(term108, term108.getClass(), "jsType", null);
        setField(term108, term108.getClass(), "parent", null);
        setField(term103, term103.getClass(), "first", term108);
        setField(term103, term103.getClass(), "last", term101);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term101, term101.getClass(), "next", term103);
        setField(term101, term101.getClass(), "first", term105);
        setIntField(term112, term112.getClass(), "type", -1145578966);
        setIntField(term114, term114.getClass(), "type", 679763016);
        setField(term114, term114.getClass(), "next", null);
        setField(term114, term114.getClass(), "first", term108);
        setField(term114, term114.getClass(), "last", term103);
        setField(term114, term114.getClass(), "propListHead", null);
        setIntField(term114, term114.getClass(), "sourcePosition", 0);
        setField(term114, term114.getClass(), "jsType", null);
        setField(term114, term114.getClass(), "parent", null);
        setField(term112, term112.getClass(), "next", term114);
        setField(term112, term112.getClass(), "first", term99);
        setField(term112, term112.getClass(), "last", term99);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term101, term101.getClass(), "last", term112);
        setField(term101, term101.getClass(), "propListHead", null);
        setIntField(term101, term101.getClass(), "sourcePosition", 0);
        setField(term101, term101.getClass(), "jsType", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term99, term99.getClass(), "next", term101);
        setIntField(term119, term119.getClass(), "type", 1962444399);
        setField(term119, term119.getClass(), "next", term112);
        setField(term119, term119.getClass(), "first", term114);
        setField(term119, term119.getClass(), "last", term97);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term99, term99.getClass(), "first", term119);
        setField(term99, term99.getClass(), "last", term119);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term97, term97.getClass(), "next", term99);
        setField(term97, term97.getClass(), "first", term103);
        setField(term97, term97.getClass(), "last", term105);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term5;
        args[1] = "jiKYgYHqIS";
        args[2] = term97;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


