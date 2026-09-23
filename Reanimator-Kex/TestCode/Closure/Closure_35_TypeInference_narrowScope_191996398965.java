package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_narrowScope_191996398965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object term1874;

    public TypeInference_narrowScope_191996398965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1823 = new HashMap();
        HashMap term1832 = new HashMap();
        Set<Object> term14564 =  ((Map) term1832).keySet();
        HashSet term1831 = new HashSet((Collection<? extends Object>) term14564);
        HashMap term1839 = new HashMap();
        Set<Object> term14565 =  ((Map) term1839).keySet();
        HashSet term1838 = new HashSet((Collection<? extends Object>) term14565);
        HashMap term1845 = new HashMap();
        Set<Object> term14566 =  ((Map) term1845).keySet();
        HashSet term1844 = new HashSet((Collection<? extends Object>) term14566);
        HashMap term1851 = new HashMap();
        HashMap term1859 = new HashMap();
        HashMap term1864 = new HashMap();
        term1820 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1822 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1820, term1820.getClass(), "compiler", null);
        setField(term1821, term1821.getClass(), "reporter", null);
        setField(term1821, term1821.getClass(), "nativeTypes", term1822);
        setField(term1821, term1821.getClass(), "namesToTypes", term1823);
        setField(term1821, term1821.getClass(), "namespaces", term1831);
        setField(term1821, term1821.getClass(), "nonNullableTypeNames", term1838);
        setField(term1821, term1821.getClass(), "forwardDeclaredTypes", term1844);
        setField(term1821, term1821.getClass(), "typesIndexedByProperty", term1851);
        setField(term1821, term1821.getClass(), "eachRefTypeIndexedByProperty", term1859);
        setField(term1821, term1821.getClass(), "greatestSubtypeByProperty", term1864);
        setField(term1821, term1821.getClass(), "interfaceToImplementors", null);
        setField(term1821, term1821.getClass(), "unresolvedNamedTypes", null);
        setField(term1821, term1821.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1821, term1821.getClass(), "lastGeneration", false);
        setField(term1821, term1821.getClass(), "templateTypeName", null);
        setField(term1821, term1821.getClass(), "templateType", null);
        setBooleanField(term1821, term1821.getClass(), "tolerateUndefinedValues", false);
        setField(term1821, term1821.getClass(), "resolveMode", null);
        setField(term1820, term1820.getClass(), "registry", term1821);
        setField(term1820, term1820.getClass(), "reverseInterpreter", null);
        setField(term1820, term1820.getClass(), "syntacticScope", null);
        setField(term1820, term1820.getClass(), "functionScope", null);
        setField(term1820, term1820.getClass(), "bottomScope", null);
        setField(term1820, term1820.getClass(), "assertionFunctionsMap", null);
        setField(term1820, term1820.getClass(), "cfg", null);
        setField(term1820, term1820.getClass(), "joinOp", null);
        setField(term1820, term1820.getClass(), "orderedWorkSet", null);
        term1874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1874, term1874.getClass(), "type", 1236004505);
        setIntField(term1876, term1876.getClass(), "type", 1050765721);
        setIntField(term1878, term1878.getClass(), "type", 474518942);
        setIntField(term1880, term1880.getClass(), "type", -1656687479);
        setIntField(term1882, term1882.getClass(), "type", -249614216);
        setField(term1882, term1882.getClass(), "next", null);
        setField(term1882, term1882.getClass(), "first", null);
        setField(term1882, term1882.getClass(), "last", null);
        setField(term1882, term1882.getClass(), "propListHead", null);
        setIntField(term1882, term1882.getClass(), "sourcePosition", 0);
        setField(term1882, term1882.getClass(), "jsType", null);
        setField(term1882, term1882.getClass(), "parent", null);
        setField(term1880, term1880.getClass(), "next", term1882);
        setIntField(term1885, term1885.getClass(), "type", 1870727665);
        setField(term1885, term1885.getClass(), "next", null);
        setField(term1885, term1885.getClass(), "first", null);
        setField(term1885, term1885.getClass(), "last", term1882);
        setField(term1885, term1885.getClass(), "propListHead", null);
        setIntField(term1885, term1885.getClass(), "sourcePosition", 0);
        setField(term1885, term1885.getClass(), "jsType", null);
        setField(term1885, term1885.getClass(), "parent", null);
        setField(term1880, term1880.getClass(), "first", term1885);
        setField(term1880, term1880.getClass(), "last", term1878);
        setField(term1880, term1880.getClass(), "propListHead", null);
        setIntField(term1880, term1880.getClass(), "sourcePosition", 0);
        setField(term1880, term1880.getClass(), "jsType", null);
        setField(term1880, term1880.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "next", term1880);
        setField(term1878, term1878.getClass(), "first", term1882);
        setIntField(term1889, term1889.getClass(), "type", -680920524);
        setIntField(term1891, term1891.getClass(), "type", -916335264);
        setField(term1891, term1891.getClass(), "next", null);
        setField(term1891, term1891.getClass(), "first", term1885);
        setField(term1891, term1891.getClass(), "last", term1880);
        setField(term1891, term1891.getClass(), "propListHead", null);
        setIntField(term1891, term1891.getClass(), "sourcePosition", 0);
        setField(term1891, term1891.getClass(), "jsType", null);
        setField(term1891, term1891.getClass(), "parent", null);
        setField(term1889, term1889.getClass(), "next", term1891);
        setField(term1889, term1889.getClass(), "first", term1876);
        setField(term1889, term1889.getClass(), "last", term1876);
        setField(term1889, term1889.getClass(), "propListHead", null);
        setIntField(term1889, term1889.getClass(), "sourcePosition", 0);
        setField(term1889, term1889.getClass(), "jsType", null);
        setField(term1889, term1889.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "last", term1889);
        setField(term1878, term1878.getClass(), "propListHead", null);
        setIntField(term1878, term1878.getClass(), "sourcePosition", 0);
        setField(term1878, term1878.getClass(), "jsType", null);
        setField(term1878, term1878.getClass(), "parent", null);
        setField(term1876, term1876.getClass(), "next", term1878);
        setIntField(term1896, term1896.getClass(), "type", -919416536);
        setField(term1896, term1896.getClass(), "next", term1889);
        setField(term1896, term1896.getClass(), "first", term1891);
        setField(term1896, term1896.getClass(), "last", term1874);
        setField(term1896, term1896.getClass(), "propListHead", null);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 0);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        setField(term1876, term1876.getClass(), "first", term1896);
        setField(term1876, term1876.getClass(), "last", term1896);
        setField(term1876, term1876.getClass(), "propListHead", null);
        setIntField(term1876, term1876.getClass(), "sourcePosition", 0);
        setField(term1876, term1876.getClass(), "jsType", null);
        setField(term1876, term1876.getClass(), "parent", null);
        setField(term1874, term1874.getClass(), "next", term1876);
        setField(term1874, term1874.getClass(), "first", term1880);
        setField(term1874, term1874.getClass(), "last", term1882);
        setField(term1874, term1874.getClass(), "propListHead", null);
        setIntField(term1874, term1874.getClass(), "sourcePosition", 0);
        setField(term1874, term1874.getClass(), "jsType", null);
        setField(term1874, term1874.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1874;
        args[2] = null;
        try {
            callMethod(klass, "narrowScope", argTypes, term1820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


