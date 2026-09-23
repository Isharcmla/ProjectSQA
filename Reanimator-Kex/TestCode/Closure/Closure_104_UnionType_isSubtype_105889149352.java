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

public class UnionType_isSubtype_105889149352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2872;
     Object term8875;

    public UnionType_isSubtype_105889149352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2874 = new HashMap();
        Set<Object> term8897 =  ((Map) term2874).keySet();
        HashSet term2873 = new HashSet((Collection<? extends Object>) term8897);
        HashMap term2885 = new HashMap();
        HashMap term2894 = new HashMap();
        Set<Object> term8898 =  ((Map) term2894).keySet();
        HashSet term2893 = new HashSet((Collection<? extends Object>) term8898);
        HashMap term2900 = new HashMap();
        Set<Object> term8899 =  ((Map) term2900).keySet();
        HashSet term2899 = new HashSet((Collection<? extends Object>) term8899);
        HashMap term2907 = new HashMap();
        Set<Object> term8900 =  ((Map) term2907).keySet();
        HashSet term2906 = new HashSet((Collection<? extends Object>) term8900);
        HashMap term2913 = new HashMap();
        HashMap term2918 = new HashMap();
        term2872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2884 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term2939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2953 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2872, term2872.getClass(), "alternates", term2873);
        setBooleanField(term2872, term2872.getClass(), "resolved", true);
        setField(term2872, term2872.getClass(), "resolveResult", null);
        setField(term2883, term2883.getClass(), "reporter", null);
        setField(term2883, term2883.getClass(), "nativeTypes", term2884);
        setField(term2883, term2883.getClass(), "namesToTypes", term2885);
        setField(term2883, term2883.getClass(), "namespaces", term2893);
        setField(term2883, term2883.getClass(), "enumTypeNames", term2899);
        setField(term2883, term2883.getClass(), "forwardDeclaredTypes", term2906);
        setField(term2883, term2883.getClass(), "typesIndexedByProperty", term2913);
        setField(term2883, term2883.getClass(), "greatestSubtypeByProperty", term2918);
        setField(term2883, term2883.getClass(), "interfaceToImplementors", null);
        setField(term2883, term2883.getClass(), "unresolvedNamedTypes", null);
        setField(term2883, term2883.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2883, term2883.getClass(), "lastGeneration", false);
        setField(term2883, term2883.getClass(), "templateTypeName", "vhKzFyKPOT");
        setField(term2939, term2939.getClass(), "name", "nQhIgWXdRc");
        setField(term2939, term2939.getClass(), "referencedType", null);
        setBooleanField(term2939, term2939.getClass(), "visited", true);
        setField(term2953, term2953.getClass(), "info", null);
        setField(term2953, term2953.getClass(), "documentation", null);
        setField(term2953, term2953.getClass(), "sourceName", null);
        setField(term2953, term2953.getClass(), "visibility", null);
        setIntField(term2953, term2953.getClass(), "bitset", 0);
        setField(term2953, term2953.getClass(), "type", null);
        setField(term2953, term2953.getClass(), "thisType", null);
        setBooleanField(term2953, term2953.getClass(), "includeDocumentation", false);
        setField(term2939, term2939.getClass(), "docInfo", term2953);
        setBooleanField(term2939, term2939.getClass(), "unknown", false);
        setBooleanField(term2939, term2939.getClass(), "resolved", false);
        setField(term2939, term2939.getClass(), "resolveResult", null);
        setField(term2939, term2939.getClass(), "registry", null);
        setField(term2883, term2883.getClass(), "templateType", term2939);
        setField(term2872, term2872.getClass(), "registry", term2883);
        HashMap term8877 = new HashMap();
        Set<Object> term8921 =  ((Map) term8877).keySet();
        HashSet term8876 = new HashSet((Collection<? extends Object>) term8921);
        HashMap term8881 = new HashMap();
        HashMap term8883 = new HashMap();
        Set<Object> term8922 =  ((Map) term8883).keySet();
        HashSet term8882 = new HashSet((Collection<? extends Object>) term8922);
        HashMap term8885 = new HashMap();
        Set<Object> term8923 =  ((Map) term8885).keySet();
        HashSet term8884 = new HashSet((Collection<? extends Object>) term8923);
        HashMap term8887 = new HashMap();
        Set<Object> term8924 =  ((Map) term8887).keySet();
        HashSet term8886 = new HashSet((Collection<? extends Object>) term8924);
        HashMap term8888 = new HashMap();
        HashMap term8889 = new HashMap();
        term8875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term8879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8880 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term8892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8895 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8875, term8875.getClass(), "alternates", term8876);
        setBooleanField(term8875, term8875.getClass(), "resolved", true);
        setField(term8875, term8875.getClass(), "resolveResult", null);
        setField(term8879, term8879.getClass(), "reporter", null);
        setField(term8879, term8879.getClass(), "nativeTypes", term8880);
        setField(term8879, term8879.getClass(), "namesToTypes", term8881);
        setField(term8879, term8879.getClass(), "namespaces", term8882);
        setField(term8879, term8879.getClass(), "enumTypeNames", term8884);
        setField(term8879, term8879.getClass(), "forwardDeclaredTypes", term8886);
        setField(term8879, term8879.getClass(), "typesIndexedByProperty", term8888);
        setField(term8879, term8879.getClass(), "greatestSubtypeByProperty", term8889);
        setField(term8879, term8879.getClass(), "interfaceToImplementors", null);
        setField(term8879, term8879.getClass(), "unresolvedNamedTypes", null);
        setField(term8879, term8879.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8879, term8879.getClass(), "lastGeneration", false);
        setField(term8879, term8879.getClass(), "templateTypeName", "vhKzFyKPOT");
        setField(term8892, term8892.getClass(), "name", "nQhIgWXdRc");
        setField(term8892, term8892.getClass(), "referencedType", null);
        setBooleanField(term8892, term8892.getClass(), "visited", true);
        setField(term8895, term8895.getClass(), "info", null);
        setField(term8895, term8895.getClass(), "documentation", null);
        setField(term8895, term8895.getClass(), "sourceName", null);
        setField(term8895, term8895.getClass(), "visibility", null);
        setIntField(term8895, term8895.getClass(), "bitset", 0);
        setField(term8895, term8895.getClass(), "type", null);
        setField(term8895, term8895.getClass(), "thisType", null);
        setBooleanField(term8895, term8895.getClass(), "includeDocumentation", false);
        setField(term8892, term8892.getClass(), "docInfo", term8895);
        setBooleanField(term8892, term8892.getClass(), "unknown", false);
        setBooleanField(term8892, term8892.getClass(), "resolved", false);
        setField(term8892, term8892.getClass(), "resolveResult", null);
        setField(term8892, term8892.getClass(), "registry", null);
        setField(term8879, term8879.getClass(), "templateType", term8892);
        setField(term8875, term8875.getClass(), "registry", term8879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2872, args);
        assertTrue(recursiveEquals(term2872, term8875));
        assertTrue(recursiveEquals(retValue, true));
    }

};


