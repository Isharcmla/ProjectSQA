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

public class UnionType_getAlternates_35218345831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;
     Object term4849;
     Object term4774;

    public UnionType_getAlternates_35218345831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term535 = new HashMap();
        Set<Object> term4869 =  ((Map) term535).keySet();
        HashSet term534 = new HashSet((Collection<? extends Object>) term4869);
        HashMap term546 = new HashMap();
        HashMap term555 = new HashMap();
        Set<Object> term4870 =  ((Map) term555).keySet();
        HashSet term554 = new HashSet((Collection<? extends Object>) term4870);
        HashMap term562 = new HashMap();
        Set<Object> term4871 =  ((Map) term562).keySet();
        HashSet term561 = new HashSet((Collection<? extends Object>) term4871);
        HashMap term569 = new HashMap();
        Set<Object> term4872 =  ((Map) term569).keySet();
        HashSet term568 = new HashSet((Collection<? extends Object>) term4872);
        HashMap term575 = new HashMap();
        HashMap term580 = new HashMap();
        term533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term545 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term533, term533.getClass(), "alternates", term534);
        setBooleanField(term533, term533.getClass(), "resolved", true);
        setField(term533, term533.getClass(), "resolveResult", null);
        setField(term544, term544.getClass(), "reporter", null);
        setField(term544, term544.getClass(), "nativeTypes", term545);
        setField(term544, term544.getClass(), "namesToTypes", term546);
        setField(term544, term544.getClass(), "namespaces", term554);
        setField(term544, term544.getClass(), "enumTypeNames", term561);
        setField(term544, term544.getClass(), "forwardDeclaredTypes", term568);
        setField(term544, term544.getClass(), "typesIndexedByProperty", term575);
        setField(term544, term544.getClass(), "greatestSubtypeByProperty", term580);
        setField(term544, term544.getClass(), "interfaceToImplementors", null);
        setField(term544, term544.getClass(), "unresolvedNamedTypes", null);
        setField(term544, term544.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term544, term544.getClass(), "lastGeneration", true);
        setField(term544, term544.getClass(), "templateTypeName", "ffYhPOzlUs");
        setField(term601, term601.getClass(), "name", "MLqYREekMl");
        setField(term601, term601.getClass(), "referencedType", null);
        setBooleanField(term601, term601.getClass(), "visited", true);
        setField(term615, term615.getClass(), "info", null);
        setField(term615, term615.getClass(), "documentation", null);
        setField(term615, term615.getClass(), "sourceName", null);
        setField(term615, term615.getClass(), "visibility", null);
        setIntField(term615, term615.getClass(), "bitset", 0);
        setField(term615, term615.getClass(), "type", null);
        setField(term615, term615.getClass(), "thisType", null);
        setBooleanField(term615, term615.getClass(), "includeDocumentation", false);
        setField(term601, term601.getClass(), "docInfo", term615);
        setBooleanField(term601, term601.getClass(), "unknown", false);
        setBooleanField(term601, term601.getClass(), "resolved", true);
        setField(term601, term601.getClass(), "resolveResult", null);
        setField(term601, term601.getClass(), "registry", null);
        setField(term544, term544.getClass(), "templateType", term601);
        setField(term533, term533.getClass(), "registry", term544);
        HashMap term4851 = new HashMap();
        Set<Object> term4893 =  ((Map) term4851).keySet();
        HashSet term4850 = new HashSet((Collection<? extends Object>) term4893);
        HashMap term4854 = new HashMap();
        HashMap term4856 = new HashMap();
        Set<Object> term4894 =  ((Map) term4856).keySet();
        HashSet term4855 = new HashSet((Collection<? extends Object>) term4894);
        HashMap term4858 = new HashMap();
        Set<Object> term4895 =  ((Map) term4858).keySet();
        HashSet term4857 = new HashSet((Collection<? extends Object>) term4895);
        HashMap term4860 = new HashMap();
        Set<Object> term4896 =  ((Map) term4860).keySet();
        HashSet term4859 = new HashSet((Collection<? extends Object>) term4896);
        HashMap term4861 = new HashMap();
        HashMap term4862 = new HashMap();
        term4849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term4852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4853 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term4865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4868 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term4849, term4849.getClass(), "alternates", term4850);
        setBooleanField(term4849, term4849.getClass(), "resolved", true);
        setField(term4849, term4849.getClass(), "resolveResult", null);
        setField(term4852, term4852.getClass(), "reporter", null);
        setField(term4852, term4852.getClass(), "nativeTypes", term4853);
        setField(term4852, term4852.getClass(), "namesToTypes", term4854);
        setField(term4852, term4852.getClass(), "namespaces", term4855);
        setField(term4852, term4852.getClass(), "enumTypeNames", term4857);
        setField(term4852, term4852.getClass(), "forwardDeclaredTypes", term4859);
        setField(term4852, term4852.getClass(), "typesIndexedByProperty", term4861);
        setField(term4852, term4852.getClass(), "greatestSubtypeByProperty", term4862);
        setField(term4852, term4852.getClass(), "interfaceToImplementors", null);
        setField(term4852, term4852.getClass(), "unresolvedNamedTypes", null);
        setField(term4852, term4852.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4852, term4852.getClass(), "lastGeneration", true);
        setField(term4852, term4852.getClass(), "templateTypeName", "ffYhPOzlUs");
        setField(term4865, term4865.getClass(), "name", "MLqYREekMl");
        setField(term4865, term4865.getClass(), "referencedType", null);
        setBooleanField(term4865, term4865.getClass(), "visited", true);
        setField(term4868, term4868.getClass(), "info", null);
        setField(term4868, term4868.getClass(), "documentation", null);
        setField(term4868, term4868.getClass(), "sourceName", null);
        setField(term4868, term4868.getClass(), "visibility", null);
        setIntField(term4868, term4868.getClass(), "bitset", 0);
        setField(term4868, term4868.getClass(), "type", null);
        setField(term4868, term4868.getClass(), "thisType", null);
        setBooleanField(term4868, term4868.getClass(), "includeDocumentation", false);
        setField(term4865, term4865.getClass(), "docInfo", term4868);
        setBooleanField(term4865, term4865.getClass(), "unknown", false);
        setBooleanField(term4865, term4865.getClass(), "resolved", true);
        setField(term4865, term4865.getClass(), "resolveResult", null);
        setField(term4865, term4865.getClass(), "registry", null);
        setField(term4852, term4852.getClass(), "templateType", term4865);
        setField(term4849, term4849.getClass(), "registry", term4852);
        HashMap term4775 = new HashMap();
        Set<Object> term4917 =  ((Map) term4775).keySet();
        term4774 = new HashSet((Collection<? extends Object>) term4917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAlternates", argTypes, term533, args);
        assertTrue(recursiveEquals(term533, term4849));
        assertTrue(recursiveEquals(retValue, term4774));
    }

};


