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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_hashCode_177143405646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;
     Object term7668;

    public UnionType_hashCode_177143405646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2213 = new HashMap();
        Set<Object> term7689 =  ((Map) term2213).keySet();
        HashSet term2212 = new HashSet((Collection<? extends Object>) term7689);
        HashMap term2221 = new HashMap();
        HashMap term2230 = new HashMap();
        Set<Object> term7690 =  ((Map) term2230).keySet();
        HashSet term2229 = new HashSet((Collection<? extends Object>) term7690);
        HashMap term2237 = new HashMap();
        Set<Object> term7691 =  ((Map) term2237).keySet();
        HashSet term2236 = new HashSet((Collection<? extends Object>) term7691);
        HashMap term2244 = new HashMap();
        Set<Object> term7692 =  ((Map) term2244).keySet();
        HashSet term2243 = new HashSet((Collection<? extends Object>) term7692);
        HashMap term2250 = new HashMap();
        HashMap term2255 = new HashMap();
        term2211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2220 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term2276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2290 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2211, term2211.getClass(), "alternates", term2212);
        setBooleanField(term2211, term2211.getClass(), "resolved", false);
        setField(term2211, term2211.getClass(), "resolveResult", null);
        setField(term2219, term2219.getClass(), "reporter", null);
        setField(term2219, term2219.getClass(), "nativeTypes", term2220);
        setField(term2219, term2219.getClass(), "namesToTypes", term2221);
        setField(term2219, term2219.getClass(), "namespaces", term2229);
        setField(term2219, term2219.getClass(), "enumTypeNames", term2236);
        setField(term2219, term2219.getClass(), "forwardDeclaredTypes", term2243);
        setField(term2219, term2219.getClass(), "typesIndexedByProperty", term2250);
        setField(term2219, term2219.getClass(), "greatestSubtypeByProperty", term2255);
        setField(term2219, term2219.getClass(), "interfaceToImplementors", null);
        setField(term2219, term2219.getClass(), "unresolvedNamedTypes", null);
        setField(term2219, term2219.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2219, term2219.getClass(), "lastGeneration", false);
        setField(term2219, term2219.getClass(), "templateTypeName", "jnwVnmKAFv");
        setField(term2276, term2276.getClass(), "name", "TXyHhqeCjR");
        setField(term2276, term2276.getClass(), "referencedType", null);
        setBooleanField(term2276, term2276.getClass(), "visited", true);
        setField(term2290, term2290.getClass(), "info", null);
        setField(term2290, term2290.getClass(), "documentation", null);
        setField(term2290, term2290.getClass(), "sourceName", null);
        setField(term2290, term2290.getClass(), "visibility", null);
        setIntField(term2290, term2290.getClass(), "bitset", 0);
        setField(term2290, term2290.getClass(), "type", null);
        setField(term2290, term2290.getClass(), "thisType", null);
        setBooleanField(term2290, term2290.getClass(), "includeDocumentation", false);
        setField(term2276, term2276.getClass(), "docInfo", term2290);
        setBooleanField(term2276, term2276.getClass(), "unknown", false);
        setBooleanField(term2276, term2276.getClass(), "resolved", true);
        setField(term2276, term2276.getClass(), "resolveResult", null);
        setField(term2276, term2276.getClass(), "registry", null);
        setField(term2219, term2219.getClass(), "templateType", term2276);
        setField(term2211, term2211.getClass(), "registry", term2219);
        HashMap term7670 = new HashMap();
        Set<Object> term7713 =  ((Map) term7670).keySet();
        HashSet term7669 = new HashSet((Collection<? extends Object>) term7713);
        HashMap term7674 = new HashMap();
        HashMap term7676 = new HashMap();
        Set<Object> term7714 =  ((Map) term7676).keySet();
        HashSet term7675 = new HashSet((Collection<? extends Object>) term7714);
        HashMap term7678 = new HashMap();
        Set<Object> term7715 =  ((Map) term7678).keySet();
        HashSet term7677 = new HashSet((Collection<? extends Object>) term7715);
        HashMap term7680 = new HashMap();
        Set<Object> term7716 =  ((Map) term7680).keySet();
        HashSet term7679 = new HashSet((Collection<? extends Object>) term7716);
        HashMap term7681 = new HashMap();
        HashMap term7682 = new HashMap();
        term7668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term7672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7673 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term7685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7668, term7668.getClass(), "alternates", term7669);
        setBooleanField(term7668, term7668.getClass(), "resolved", false);
        setField(term7668, term7668.getClass(), "resolveResult", null);
        setField(term7672, term7672.getClass(), "reporter", null);
        setField(term7672, term7672.getClass(), "nativeTypes", term7673);
        setField(term7672, term7672.getClass(), "namesToTypes", term7674);
        setField(term7672, term7672.getClass(), "namespaces", term7675);
        setField(term7672, term7672.getClass(), "enumTypeNames", term7677);
        setField(term7672, term7672.getClass(), "forwardDeclaredTypes", term7679);
        setField(term7672, term7672.getClass(), "typesIndexedByProperty", term7681);
        setField(term7672, term7672.getClass(), "greatestSubtypeByProperty", term7682);
        setField(term7672, term7672.getClass(), "interfaceToImplementors", null);
        setField(term7672, term7672.getClass(), "unresolvedNamedTypes", null);
        setField(term7672, term7672.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7672, term7672.getClass(), "lastGeneration", false);
        setField(term7672, term7672.getClass(), "templateTypeName", "jnwVnmKAFv");
        setField(term7685, term7685.getClass(), "name", "TXyHhqeCjR");
        setField(term7685, term7685.getClass(), "referencedType", null);
        setBooleanField(term7685, term7685.getClass(), "visited", true);
        setField(term7688, term7688.getClass(), "info", null);
        setField(term7688, term7688.getClass(), "documentation", null);
        setField(term7688, term7688.getClass(), "sourceName", null);
        setField(term7688, term7688.getClass(), "visibility", null);
        setIntField(term7688, term7688.getClass(), "bitset", 0);
        setField(term7688, term7688.getClass(), "type", null);
        setField(term7688, term7688.getClass(), "thisType", null);
        setBooleanField(term7688, term7688.getClass(), "includeDocumentation", false);
        setField(term7685, term7685.getClass(), "docInfo", term7688);
        setBooleanField(term7685, term7685.getClass(), "unknown", false);
        setBooleanField(term7685, term7685.getClass(), "resolved", true);
        setField(term7685, term7685.getClass(), "resolveResult", null);
        setField(term7685, term7685.getClass(), "registry", null);
        setField(term7672, term7672.getClass(), "templateType", term7685);
        setField(term7668, term7668.getClass(), "registry", term7672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term2211, args);
        assertTrue(recursiveEquals(term2211, term7668));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


