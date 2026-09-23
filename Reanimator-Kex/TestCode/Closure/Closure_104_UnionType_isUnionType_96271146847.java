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

public class UnionType_isUnionType_96271146847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;
     Object term7861;

    public UnionType_isUnionType_96271146847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2321 = new HashMap();
        Set<Object> term7882 =  ((Map) term2321).keySet();
        HashSet term2320 = new HashSet((Collection<? extends Object>) term7882);
        HashMap term2332 = new HashMap();
        HashMap term2341 = new HashMap();
        Set<Object> term7883 =  ((Map) term2341).keySet();
        HashSet term2340 = new HashSet((Collection<? extends Object>) term7883);
        HashMap term2348 = new HashMap();
        Set<Object> term7884 =  ((Map) term2348).keySet();
        HashSet term2347 = new HashSet((Collection<? extends Object>) term7884);
        HashMap term2355 = new HashMap();
        Set<Object> term7885 =  ((Map) term2355).keySet();
        HashSet term2354 = new HashSet((Collection<? extends Object>) term7885);
        HashMap term2361 = new HashMap();
        HashMap term2366 = new HashMap();
        term2319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2331 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term2387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2401 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2319, term2319.getClass(), "alternates", term2320);
        setBooleanField(term2319, term2319.getClass(), "resolved", false);
        setField(term2319, term2319.getClass(), "resolveResult", null);
        setField(term2330, term2330.getClass(), "reporter", null);
        setField(term2330, term2330.getClass(), "nativeTypes", term2331);
        setField(term2330, term2330.getClass(), "namesToTypes", term2332);
        setField(term2330, term2330.getClass(), "namespaces", term2340);
        setField(term2330, term2330.getClass(), "enumTypeNames", term2347);
        setField(term2330, term2330.getClass(), "forwardDeclaredTypes", term2354);
        setField(term2330, term2330.getClass(), "typesIndexedByProperty", term2361);
        setField(term2330, term2330.getClass(), "greatestSubtypeByProperty", term2366);
        setField(term2330, term2330.getClass(), "interfaceToImplementors", null);
        setField(term2330, term2330.getClass(), "unresolvedNamedTypes", null);
        setField(term2330, term2330.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2330, term2330.getClass(), "lastGeneration", true);
        setField(term2330, term2330.getClass(), "templateTypeName", "UPUbwyHQKN");
        setField(term2387, term2387.getClass(), "name", "lgQkrXANyI");
        setField(term2387, term2387.getClass(), "referencedType", null);
        setBooleanField(term2387, term2387.getClass(), "visited", false);
        setField(term2401, term2401.getClass(), "info", null);
        setField(term2401, term2401.getClass(), "documentation", null);
        setField(term2401, term2401.getClass(), "sourceName", null);
        setField(term2401, term2401.getClass(), "visibility", null);
        setIntField(term2401, term2401.getClass(), "bitset", 0);
        setField(term2401, term2401.getClass(), "type", null);
        setField(term2401, term2401.getClass(), "thisType", null);
        setBooleanField(term2401, term2401.getClass(), "includeDocumentation", false);
        setField(term2387, term2387.getClass(), "docInfo", term2401);
        setBooleanField(term2387, term2387.getClass(), "unknown", false);
        setBooleanField(term2387, term2387.getClass(), "resolved", true);
        setField(term2387, term2387.getClass(), "resolveResult", null);
        setField(term2387, term2387.getClass(), "registry", null);
        setField(term2330, term2330.getClass(), "templateType", term2387);
        setField(term2319, term2319.getClass(), "registry", term2330);
        HashMap term7863 = new HashMap();
        Set<Object> term7906 =  ((Map) term7863).keySet();
        HashSet term7862 = new HashSet((Collection<? extends Object>) term7906);
        HashMap term7866 = new HashMap();
        HashMap term7868 = new HashMap();
        Set<Object> term7907 =  ((Map) term7868).keySet();
        HashSet term7867 = new HashSet((Collection<? extends Object>) term7907);
        HashMap term7870 = new HashMap();
        Set<Object> term7908 =  ((Map) term7870).keySet();
        HashSet term7869 = new HashSet((Collection<? extends Object>) term7908);
        HashMap term7872 = new HashMap();
        Set<Object> term7909 =  ((Map) term7872).keySet();
        HashSet term7871 = new HashSet((Collection<? extends Object>) term7909);
        HashMap term7873 = new HashMap();
        HashMap term7874 = new HashMap();
        term7861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term7864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7865 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term7877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7880 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7861, term7861.getClass(), "alternates", term7862);
        setBooleanField(term7861, term7861.getClass(), "resolved", false);
        setField(term7861, term7861.getClass(), "resolveResult", null);
        setField(term7864, term7864.getClass(), "reporter", null);
        setField(term7864, term7864.getClass(), "nativeTypes", term7865);
        setField(term7864, term7864.getClass(), "namesToTypes", term7866);
        setField(term7864, term7864.getClass(), "namespaces", term7867);
        setField(term7864, term7864.getClass(), "enumTypeNames", term7869);
        setField(term7864, term7864.getClass(), "forwardDeclaredTypes", term7871);
        setField(term7864, term7864.getClass(), "typesIndexedByProperty", term7873);
        setField(term7864, term7864.getClass(), "greatestSubtypeByProperty", term7874);
        setField(term7864, term7864.getClass(), "interfaceToImplementors", null);
        setField(term7864, term7864.getClass(), "unresolvedNamedTypes", null);
        setField(term7864, term7864.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7864, term7864.getClass(), "lastGeneration", true);
        setField(term7864, term7864.getClass(), "templateTypeName", "UPUbwyHQKN");
        setField(term7877, term7877.getClass(), "name", "lgQkrXANyI");
        setField(term7877, term7877.getClass(), "referencedType", null);
        setBooleanField(term7877, term7877.getClass(), "visited", false);
        setField(term7880, term7880.getClass(), "info", null);
        setField(term7880, term7880.getClass(), "documentation", null);
        setField(term7880, term7880.getClass(), "sourceName", null);
        setField(term7880, term7880.getClass(), "visibility", null);
        setIntField(term7880, term7880.getClass(), "bitset", 0);
        setField(term7880, term7880.getClass(), "type", null);
        setField(term7880, term7880.getClass(), "thisType", null);
        setBooleanField(term7880, term7880.getClass(), "includeDocumentation", false);
        setField(term7877, term7877.getClass(), "docInfo", term7880);
        setBooleanField(term7877, term7877.getClass(), "unknown", false);
        setBooleanField(term7877, term7877.getClass(), "resolved", true);
        setField(term7877, term7877.getClass(), "resolveResult", null);
        setField(term7877, term7877.getClass(), "registry", null);
        setField(term7864, term7864.getClass(), "templateType", term7877);
        setField(term7861, term7861.getClass(), "registry", term7864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUnionType", argTypes, term2319, args);
        assertTrue(recursiveEquals(term2319, term7861));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


