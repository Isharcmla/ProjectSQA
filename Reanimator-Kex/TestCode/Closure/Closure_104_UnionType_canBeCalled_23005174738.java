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

public class UnionType_canBeCalled_23005174738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328;
     Object term5932;

    public UnionType_canBeCalled_23005174738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1330 = new HashMap();
        Set<Object> term5954 =  ((Map) term1330).keySet();
        HashSet term1329 = new HashSet((Collection<? extends Object>) term5954);
        HashMap term1341 = new HashMap();
        HashMap term1350 = new HashMap();
        Set<Object> term5955 =  ((Map) term1350).keySet();
        HashSet term1349 = new HashSet((Collection<? extends Object>) term5955);
        HashMap term1357 = new HashMap();
        Set<Object> term5956 =  ((Map) term1357).keySet();
        HashSet term1356 = new HashSet((Collection<? extends Object>) term5956);
        HashMap term1364 = new HashMap();
        Set<Object> term5957 =  ((Map) term1364).keySet();
        HashSet term1363 = new HashSet((Collection<? extends Object>) term5957);
        HashMap term1370 = new HashMap();
        HashMap term1375 = new HashMap();
        term1328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1340 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term1396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1328, term1328.getClass(), "alternates", term1329);
        setBooleanField(term1328, term1328.getClass(), "resolved", false);
        setField(term1328, term1328.getClass(), "resolveResult", null);
        setField(term1339, term1339.getClass(), "reporter", null);
        setField(term1339, term1339.getClass(), "nativeTypes", term1340);
        setField(term1339, term1339.getClass(), "namesToTypes", term1341);
        setField(term1339, term1339.getClass(), "namespaces", term1349);
        setField(term1339, term1339.getClass(), "enumTypeNames", term1356);
        setField(term1339, term1339.getClass(), "forwardDeclaredTypes", term1363);
        setField(term1339, term1339.getClass(), "typesIndexedByProperty", term1370);
        setField(term1339, term1339.getClass(), "greatestSubtypeByProperty", term1375);
        setField(term1339, term1339.getClass(), "interfaceToImplementors", null);
        setField(term1339, term1339.getClass(), "unresolvedNamedTypes", null);
        setField(term1339, term1339.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1339, term1339.getClass(), "lastGeneration", false);
        setField(term1339, term1339.getClass(), "templateTypeName", "kNqaJKIATy");
        setField(term1396, term1396.getClass(), "name", "vKQukfbJUd");
        setField(term1396, term1396.getClass(), "referencedType", null);
        setBooleanField(term1396, term1396.getClass(), "visited", true);
        setField(term1410, term1410.getClass(), "info", null);
        setField(term1410, term1410.getClass(), "documentation", null);
        setField(term1410, term1410.getClass(), "sourceName", null);
        setField(term1410, term1410.getClass(), "visibility", null);
        setIntField(term1410, term1410.getClass(), "bitset", 0);
        setField(term1410, term1410.getClass(), "type", null);
        setField(term1410, term1410.getClass(), "thisType", null);
        setBooleanField(term1410, term1410.getClass(), "includeDocumentation", false);
        setField(term1396, term1396.getClass(), "docInfo", term1410);
        setBooleanField(term1396, term1396.getClass(), "unknown", true);
        setBooleanField(term1396, term1396.getClass(), "resolved", false);
        setField(term1396, term1396.getClass(), "resolveResult", null);
        setField(term1396, term1396.getClass(), "registry", null);
        setField(term1339, term1339.getClass(), "templateType", term1396);
        setField(term1328, term1328.getClass(), "registry", term1339);
        HashMap term5934 = new HashMap();
        Set<Object> term5978 =  ((Map) term5934).keySet();
        HashSet term5933 = new HashSet((Collection<? extends Object>) term5978);
        HashMap term5938 = new HashMap();
        HashMap term5940 = new HashMap();
        Set<Object> term5979 =  ((Map) term5940).keySet();
        HashSet term5939 = new HashSet((Collection<? extends Object>) term5979);
        HashMap term5942 = new HashMap();
        Set<Object> term5980 =  ((Map) term5942).keySet();
        HashSet term5941 = new HashSet((Collection<? extends Object>) term5980);
        HashMap term5944 = new HashMap();
        Set<Object> term5981 =  ((Map) term5944).keySet();
        HashSet term5943 = new HashSet((Collection<? extends Object>) term5981);
        HashMap term5945 = new HashMap();
        HashMap term5946 = new HashMap();
        term5932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5937 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term5949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5952 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5932, term5932.getClass(), "alternates", term5933);
        setBooleanField(term5932, term5932.getClass(), "resolved", false);
        setField(term5932, term5932.getClass(), "resolveResult", null);
        setField(term5936, term5936.getClass(), "reporter", null);
        setField(term5936, term5936.getClass(), "nativeTypes", term5937);
        setField(term5936, term5936.getClass(), "namesToTypes", term5938);
        setField(term5936, term5936.getClass(), "namespaces", term5939);
        setField(term5936, term5936.getClass(), "enumTypeNames", term5941);
        setField(term5936, term5936.getClass(), "forwardDeclaredTypes", term5943);
        setField(term5936, term5936.getClass(), "typesIndexedByProperty", term5945);
        setField(term5936, term5936.getClass(), "greatestSubtypeByProperty", term5946);
        setField(term5936, term5936.getClass(), "interfaceToImplementors", null);
        setField(term5936, term5936.getClass(), "unresolvedNamedTypes", null);
        setField(term5936, term5936.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5936, term5936.getClass(), "lastGeneration", false);
        setField(term5936, term5936.getClass(), "templateTypeName", "kNqaJKIATy");
        setField(term5949, term5949.getClass(), "name", "vKQukfbJUd");
        setField(term5949, term5949.getClass(), "referencedType", null);
        setBooleanField(term5949, term5949.getClass(), "visited", true);
        setField(term5952, term5952.getClass(), "info", null);
        setField(term5952, term5952.getClass(), "documentation", null);
        setField(term5952, term5952.getClass(), "sourceName", null);
        setField(term5952, term5952.getClass(), "visibility", null);
        setIntField(term5952, term5952.getClass(), "bitset", 0);
        setField(term5952, term5952.getClass(), "type", null);
        setField(term5952, term5952.getClass(), "thisType", null);
        setBooleanField(term5952, term5952.getClass(), "includeDocumentation", false);
        setField(term5949, term5949.getClass(), "docInfo", term5952);
        setBooleanField(term5949, term5949.getClass(), "unknown", true);
        setBooleanField(term5949, term5949.getClass(), "resolved", false);
        setField(term5949, term5949.getClass(), "resolveResult", null);
        setField(term5949, term5949.getClass(), "registry", null);
        setField(term5936, term5936.getClass(), "templateType", term5949);
        setField(term5932, term5932.getClass(), "registry", term5936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "canBeCalled", argTypes, term1328, args);
        assertTrue(recursiveEquals(term1328, term5932));
        assertTrue(recursiveEquals(retValue, true));
    }

};


