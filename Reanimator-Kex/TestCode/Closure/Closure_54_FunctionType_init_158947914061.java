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

public class FunctionType_init_158947914061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term95;
     Object term116;
     Object term152;
     Object term154;

    public FunctionType_init_158947914061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term21935 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term21935);
        HashMap term26 = new HashMap();
        Set<Object> term21936 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term21936);
        HashMap term39 = new HashMap();
        Set<Object> term21937 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term21937);
        HashMap term53 = new HashMap();
        HashMap term67 = new HashMap();
        HashMap term72 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "nonNullableTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", term67);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term72);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypeName", null);
        setField(term1, term1.getClass(), "templateType", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
        term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95, term95.getClass(), "type", -1955890973);
        setIntField(term97, term97.getClass(), "type", 1725571209);
        setIntField(term99, term99.getClass(), "type", 0);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", null);
        setField(term99, term99.getClass(), "last", null);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term97, term97.getClass(), "next", term99);
        setIntField(term102, term102.getClass(), "type", 0);
        setField(term102, term102.getClass(), "next", null);
        setField(term102, term102.getClass(), "first", null);
        setField(term102, term102.getClass(), "last", null);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term97, term97.getClass(), "first", term102);
        setIntField(term105, term105.getClass(), "type", 0);
        setField(term105, term105.getClass(), "next", null);
        setField(term105, term105.getClass(), "first", null);
        setField(term105, term105.getClass(), "last", null);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term97, term97.getClass(), "last", term105);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term95, term95.getClass(), "next", term97);
        setIntField(term109, term109.getClass(), "type", 0);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", null);
        setField(term109, term109.getClass(), "last", null);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term95, term95.getClass(), "first", term109);
        setIntField(term112, term112.getClass(), "type", 0);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", null);
        setField(term112, term112.getClass(), "last", null);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term95, term95.getClass(), "last", term112);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        term116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117, term117.getClass(), "type", -1685132342);
        setIntField(term119, term119.getClass(), "type", -655067527);
        setIntField(term121, term121.getClass(), "type", 0);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", null);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term119, term119.getClass(), "next", term121);
        setIntField(term124, term124.getClass(), "type", 0);
        setField(term124, term124.getClass(), "next", null);
        setField(term124, term124.getClass(), "first", null);
        setField(term124, term124.getClass(), "last", null);
        setField(term124, term124.getClass(), "propListHead", null);
        setIntField(term124, term124.getClass(), "sourcePosition", 0);
        setField(term124, term124.getClass(), "jsType", null);
        setField(term124, term124.getClass(), "parent", null);
        setField(term119, term119.getClass(), "first", term124);
        setIntField(term127, term127.getClass(), "type", 0);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", null);
        setField(term127, term127.getClass(), "last", null);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term119, term119.getClass(), "last", term127);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term117, term117.getClass(), "next", term119);
        setIntField(term131, term131.getClass(), "type", 0);
        setField(term131, term131.getClass(), "next", null);
        setField(term131, term131.getClass(), "first", null);
        setField(term131, term131.getClass(), "last", null);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term117, term117.getClass(), "first", term131);
        setIntField(term134, term134.getClass(), "type", 0);
        setField(term134, term134.getClass(), "next", null);
        setField(term134, term134.getClass(), "first", null);
        setField(term134, term134.getClass(), "last", null);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term117, term117.getClass(), "last", term134);
        setField(term117, term117.getClass(), "propListHead", null);
        setIntField(term117, term117.getClass(), "sourcePosition", 0);
        setField(term117, term117.getClass(), "jsType", null);
        setField(term117, term117.getClass(), "parent", null);
        setField(term116, term116.getClass(), "parameters", term117);
        setField(term116, term116.getClass(), "returnType", null);
        setBooleanField(term116, term116.getClass(), "returnTypeInferred", false);
        setBooleanField(term116, term116.getClass(), "resolved", false);
        setField(term116, term116.getClass(), "resolveResult", null);
        setField(term116, term116.getClass(), "registry", null);
        term152 = new Boolean(true);
        term154 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term1;
        args[1] = "tShwQLRGNe";
        args[2] = term95;
        args[3] = term116;
        args[4] = null;
        args[5] = "LvtrsXUliU";
        args[6] = term152;
        args[7] = term154;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


