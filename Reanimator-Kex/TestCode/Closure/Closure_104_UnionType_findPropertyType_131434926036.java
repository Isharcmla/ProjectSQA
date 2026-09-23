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

public class UnionType_findPropertyType_131434926036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;
     Object term5609;

    public UnionType_findPropertyType_131434926036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1087 = new HashMap();
        Set<Object> term5632 =  ((Map) term1087).keySet();
        HashSet term1086 = new HashSet((Collection<? extends Object>) term5632);
        HashMap term1098 = new HashMap();
        HashMap term1107 = new HashMap();
        Set<Object> term5633 =  ((Map) term1107).keySet();
        HashSet term1106 = new HashSet((Collection<? extends Object>) term5633);
        HashMap term1113 = new HashMap();
        Set<Object> term5634 =  ((Map) term1113).keySet();
        HashSet term1112 = new HashSet((Collection<? extends Object>) term5634);
        HashMap term1120 = new HashMap();
        Set<Object> term5635 =  ((Map) term1120).keySet();
        HashSet term1119 = new HashSet((Collection<? extends Object>) term5635);
        HashMap term1126 = new HashMap();
        HashMap term1131 = new HashMap();
        term1085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1097 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term1152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1166 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1085, term1085.getClass(), "alternates", term1086);
        setBooleanField(term1085, term1085.getClass(), "resolved", true);
        setField(term1085, term1085.getClass(), "resolveResult", null);
        setField(term1096, term1096.getClass(), "reporter", null);
        setField(term1096, term1096.getClass(), "nativeTypes", term1097);
        setField(term1096, term1096.getClass(), "namesToTypes", term1098);
        setField(term1096, term1096.getClass(), "namespaces", term1106);
        setField(term1096, term1096.getClass(), "enumTypeNames", term1112);
        setField(term1096, term1096.getClass(), "forwardDeclaredTypes", term1119);
        setField(term1096, term1096.getClass(), "typesIndexedByProperty", term1126);
        setField(term1096, term1096.getClass(), "greatestSubtypeByProperty", term1131);
        setField(term1096, term1096.getClass(), "interfaceToImplementors", null);
        setField(term1096, term1096.getClass(), "unresolvedNamedTypes", null);
        setField(term1096, term1096.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1096, term1096.getClass(), "lastGeneration", true);
        setField(term1096, term1096.getClass(), "templateTypeName", "FPvxVzzSvD");
        setField(term1152, term1152.getClass(), "name", "WHcwFgsGFC");
        setField(term1152, term1152.getClass(), "referencedType", null);
        setBooleanField(term1152, term1152.getClass(), "visited", true);
        setField(term1166, term1166.getClass(), "info", null);
        setField(term1166, term1166.getClass(), "documentation", null);
        setField(term1166, term1166.getClass(), "sourceName", null);
        setField(term1166, term1166.getClass(), "visibility", null);
        setIntField(term1166, term1166.getClass(), "bitset", 0);
        setField(term1166, term1166.getClass(), "type", null);
        setField(term1166, term1166.getClass(), "thisType", null);
        setBooleanField(term1166, term1166.getClass(), "includeDocumentation", false);
        setField(term1152, term1152.getClass(), "docInfo", term1166);
        setBooleanField(term1152, term1152.getClass(), "unknown", true);
        setBooleanField(term1152, term1152.getClass(), "resolved", false);
        setField(term1152, term1152.getClass(), "resolveResult", null);
        setField(term1152, term1152.getClass(), "registry", null);
        setField(term1096, term1096.getClass(), "templateType", term1152);
        setField(term1085, term1085.getClass(), "registry", term1096);
        HashMap term5611 = new HashMap();
        Set<Object> term5666 =  ((Map) term5611).keySet();
        HashSet term5610 = new HashSet((Collection<? extends Object>) term5666);
        HashMap term5615 = new HashMap();
        HashMap term5617 = new HashMap();
        Set<Object> term5667 =  ((Map) term5617).keySet();
        HashSet term5616 = new HashSet((Collection<? extends Object>) term5667);
        HashMap term5619 = new HashMap();
        Set<Object> term5668 =  ((Map) term5619).keySet();
        HashSet term5618 = new HashSet((Collection<? extends Object>) term5668);
        HashMap term5621 = new HashMap();
        Set<Object> term5669 =  ((Map) term5621).keySet();
        HashSet term5620 = new HashSet((Collection<? extends Object>) term5669);
        HashMap term5622 = new HashMap();
        HashMap term5623 = new HashMap();
        term5609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5614 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term5626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5629 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5609, term5609.getClass(), "alternates", term5610);
        setBooleanField(term5609, term5609.getClass(), "resolved", true);
        setField(term5609, term5609.getClass(), "resolveResult", null);
        setField(term5613, term5613.getClass(), "reporter", null);
        setField(term5613, term5613.getClass(), "nativeTypes", term5614);
        setField(term5613, term5613.getClass(), "namesToTypes", term5615);
        setField(term5613, term5613.getClass(), "namespaces", term5616);
        setField(term5613, term5613.getClass(), "enumTypeNames", term5618);
        setField(term5613, term5613.getClass(), "forwardDeclaredTypes", term5620);
        setField(term5613, term5613.getClass(), "typesIndexedByProperty", term5622);
        setField(term5613, term5613.getClass(), "greatestSubtypeByProperty", term5623);
        setField(term5613, term5613.getClass(), "interfaceToImplementors", null);
        setField(term5613, term5613.getClass(), "unresolvedNamedTypes", null);
        setField(term5613, term5613.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5613, term5613.getClass(), "lastGeneration", true);
        setField(term5613, term5613.getClass(), "templateTypeName", "FPvxVzzSvD");
        setField(term5626, term5626.getClass(), "name", "WHcwFgsGFC");
        setField(term5626, term5626.getClass(), "referencedType", null);
        setBooleanField(term5626, term5626.getClass(), "visited", true);
        setField(term5629, term5629.getClass(), "info", null);
        setField(term5629, term5629.getClass(), "documentation", null);
        setField(term5629, term5629.getClass(), "sourceName", null);
        setField(term5629, term5629.getClass(), "visibility", null);
        setIntField(term5629, term5629.getClass(), "bitset", 0);
        setField(term5629, term5629.getClass(), "type", null);
        setField(term5629, term5629.getClass(), "thisType", null);
        setBooleanField(term5629, term5629.getClass(), "includeDocumentation", false);
        setField(term5626, term5626.getClass(), "docInfo", term5629);
        setBooleanField(term5626, term5626.getClass(), "unknown", true);
        setBooleanField(term5626, term5626.getClass(), "resolved", false);
        setField(term5626, term5626.getClass(), "resolveResult", null);
        setField(term5626, term5626.getClass(), "registry", null);
        setField(term5613, term5613.getClass(), "templateType", term5626);
        setField(term5609, term5609.getClass(), "registry", term5613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        Object retValue = callMethod(klass, "findPropertyType", argTypes, term1085, args);
        assertTrue(recursiveEquals(term1085, term5609));
        assertTrue(recursiveEquals(retValue, null));
    }

};


