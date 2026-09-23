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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getLeastSupertype_146096155143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1878;

    public UnionType_getLeastSupertype_146096155143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1880 = new HashMap();
        Set<Object> term7115 =  ((Map) term1880).keySet();
        HashSet term1879 = new HashSet((Collection<? extends Object>) term7115);
        HashMap term1891 = new HashMap();
        HashMap term1900 = new HashMap();
        Set<Object> term7116 =  ((Map) term1900).keySet();
        HashSet term1899 = new HashSet((Collection<? extends Object>) term7116);
        HashMap term1907 = new HashMap();
        Set<Object> term7117 =  ((Map) term1907).keySet();
        HashSet term1906 = new HashSet((Collection<? extends Object>) term7117);
        HashMap term1914 = new HashMap();
        Set<Object> term7118 =  ((Map) term1914).keySet();
        HashSet term1913 = new HashSet((Collection<? extends Object>) term7118);
        HashMap term1920 = new HashMap();
        HashMap term1925 = new HashMap();
        term1878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1890 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term1946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1960 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1878, term1878.getClass(), "alternates", term1879);
        setBooleanField(term1878, term1878.getClass(), "resolved", false);
        setField(term1878, term1878.getClass(), "resolveResult", null);
        setField(term1889, term1889.getClass(), "reporter", null);
        setField(term1889, term1889.getClass(), "nativeTypes", term1890);
        setField(term1889, term1889.getClass(), "namesToTypes", term1891);
        setField(term1889, term1889.getClass(), "namespaces", term1899);
        setField(term1889, term1889.getClass(), "enumTypeNames", term1906);
        setField(term1889, term1889.getClass(), "forwardDeclaredTypes", term1913);
        setField(term1889, term1889.getClass(), "typesIndexedByProperty", term1920);
        setField(term1889, term1889.getClass(), "greatestSubtypeByProperty", term1925);
        setField(term1889, term1889.getClass(), "interfaceToImplementors", null);
        setField(term1889, term1889.getClass(), "unresolvedNamedTypes", null);
        setField(term1889, term1889.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1889, term1889.getClass(), "lastGeneration", true);
        setField(term1889, term1889.getClass(), "templateTypeName", "BwtdjiefJn");
        setField(term1946, term1946.getClass(), "name", "jDmhBrIoDa");
        setField(term1946, term1946.getClass(), "referencedType", null);
        setBooleanField(term1946, term1946.getClass(), "visited", true);
        setField(term1960, term1960.getClass(), "info", null);
        setField(term1960, term1960.getClass(), "documentation", null);
        setField(term1960, term1960.getClass(), "sourceName", null);
        setField(term1960, term1960.getClass(), "visibility", null);
        setIntField(term1960, term1960.getClass(), "bitset", 0);
        setField(term1960, term1960.getClass(), "type", null);
        setField(term1960, term1960.getClass(), "thisType", null);
        setBooleanField(term1960, term1960.getClass(), "includeDocumentation", false);
        setField(term1946, term1946.getClass(), "docInfo", term1960);
        setBooleanField(term1946, term1946.getClass(), "unknown", true);
        setBooleanField(term1946, term1946.getClass(), "resolved", false);
        setField(term1946, term1946.getClass(), "resolveResult", null);
        setField(term1946, term1946.getClass(), "registry", null);
        setField(term1889, term1889.getClass(), "templateType", term1946);
        setField(term1878, term1878.getClass(), "registry", term1889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


