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

public class UnionType_canAssignTo_140138721737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;
     Object term5784;

    public UnionType_canAssignTo_140138721737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1219 = new HashMap();
        Set<Object> term5806 =  ((Map) term1219).keySet();
        HashSet term1218 = new HashSet((Collection<? extends Object>) term5806);
        HashMap term1230 = new HashMap();
        HashMap term1239 = new HashMap();
        Set<Object> term5807 =  ((Map) term1239).keySet();
        HashSet term1238 = new HashSet((Collection<? extends Object>) term5807);
        HashMap term1246 = new HashMap();
        Set<Object> term5808 =  ((Map) term1246).keySet();
        HashSet term1245 = new HashSet((Collection<? extends Object>) term5808);
        HashMap term1253 = new HashMap();
        Set<Object> term5809 =  ((Map) term1253).keySet();
        HashSet term1252 = new HashSet((Collection<? extends Object>) term5809);
        HashMap term1259 = new HashMap();
        HashMap term1264 = new HashMap();
        term1217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1229 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term1285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1299 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1217, term1217.getClass(), "alternates", term1218);
        setBooleanField(term1217, term1217.getClass(), "resolved", true);
        setField(term1217, term1217.getClass(), "resolveResult", null);
        setField(term1228, term1228.getClass(), "reporter", null);
        setField(term1228, term1228.getClass(), "nativeTypes", term1229);
        setField(term1228, term1228.getClass(), "namesToTypes", term1230);
        setField(term1228, term1228.getClass(), "namespaces", term1238);
        setField(term1228, term1228.getClass(), "enumTypeNames", term1245);
        setField(term1228, term1228.getClass(), "forwardDeclaredTypes", term1252);
        setField(term1228, term1228.getClass(), "typesIndexedByProperty", term1259);
        setField(term1228, term1228.getClass(), "greatestSubtypeByProperty", term1264);
        setField(term1228, term1228.getClass(), "interfaceToImplementors", null);
        setField(term1228, term1228.getClass(), "unresolvedNamedTypes", null);
        setField(term1228, term1228.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1228, term1228.getClass(), "lastGeneration", true);
        setField(term1228, term1228.getClass(), "templateTypeName", "PapWxkhEWe");
        setField(term1285, term1285.getClass(), "name", "smnHEqRFRx");
        setField(term1285, term1285.getClass(), "referencedType", null);
        setBooleanField(term1285, term1285.getClass(), "visited", true);
        setField(term1299, term1299.getClass(), "info", null);
        setField(term1299, term1299.getClass(), "documentation", null);
        setField(term1299, term1299.getClass(), "sourceName", null);
        setField(term1299, term1299.getClass(), "visibility", null);
        setIntField(term1299, term1299.getClass(), "bitset", 0);
        setField(term1299, term1299.getClass(), "type", null);
        setField(term1299, term1299.getClass(), "thisType", null);
        setBooleanField(term1299, term1299.getClass(), "includeDocumentation", false);
        setField(term1285, term1285.getClass(), "docInfo", term1299);
        setBooleanField(term1285, term1285.getClass(), "unknown", true);
        setBooleanField(term1285, term1285.getClass(), "resolved", false);
        setField(term1285, term1285.getClass(), "resolveResult", null);
        setField(term1285, term1285.getClass(), "registry", null);
        setField(term1228, term1228.getClass(), "templateType", term1285);
        setField(term1217, term1217.getClass(), "registry", term1228);
        HashMap term5786 = new HashMap();
        Set<Object> term5830 =  ((Map) term5786).keySet();
        HashSet term5785 = new HashSet((Collection<? extends Object>) term5830);
        HashMap term5790 = new HashMap();
        HashMap term5792 = new HashMap();
        Set<Object> term5831 =  ((Map) term5792).keySet();
        HashSet term5791 = new HashSet((Collection<? extends Object>) term5831);
        HashMap term5794 = new HashMap();
        Set<Object> term5832 =  ((Map) term5794).keySet();
        HashSet term5793 = new HashSet((Collection<? extends Object>) term5832);
        HashMap term5796 = new HashMap();
        Set<Object> term5833 =  ((Map) term5796).keySet();
        HashSet term5795 = new HashSet((Collection<? extends Object>) term5833);
        HashMap term5797 = new HashMap();
        HashMap term5798 = new HashMap();
        term5784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5789 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term5801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5804 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5784, term5784.getClass(), "alternates", term5785);
        setBooleanField(term5784, term5784.getClass(), "resolved", true);
        setField(term5784, term5784.getClass(), "resolveResult", null);
        setField(term5788, term5788.getClass(), "reporter", null);
        setField(term5788, term5788.getClass(), "nativeTypes", term5789);
        setField(term5788, term5788.getClass(), "namesToTypes", term5790);
        setField(term5788, term5788.getClass(), "namespaces", term5791);
        setField(term5788, term5788.getClass(), "enumTypeNames", term5793);
        setField(term5788, term5788.getClass(), "forwardDeclaredTypes", term5795);
        setField(term5788, term5788.getClass(), "typesIndexedByProperty", term5797);
        setField(term5788, term5788.getClass(), "greatestSubtypeByProperty", term5798);
        setField(term5788, term5788.getClass(), "interfaceToImplementors", null);
        setField(term5788, term5788.getClass(), "unresolvedNamedTypes", null);
        setField(term5788, term5788.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5788, term5788.getClass(), "lastGeneration", true);
        setField(term5788, term5788.getClass(), "templateTypeName", "PapWxkhEWe");
        setField(term5801, term5801.getClass(), "name", "smnHEqRFRx");
        setField(term5801, term5801.getClass(), "referencedType", null);
        setBooleanField(term5801, term5801.getClass(), "visited", true);
        setField(term5804, term5804.getClass(), "info", null);
        setField(term5804, term5804.getClass(), "documentation", null);
        setField(term5804, term5804.getClass(), "sourceName", null);
        setField(term5804, term5804.getClass(), "visibility", null);
        setIntField(term5804, term5804.getClass(), "bitset", 0);
        setField(term5804, term5804.getClass(), "type", null);
        setField(term5804, term5804.getClass(), "thisType", null);
        setBooleanField(term5804, term5804.getClass(), "includeDocumentation", false);
        setField(term5801, term5801.getClass(), "docInfo", term5804);
        setBooleanField(term5801, term5801.getClass(), "unknown", true);
        setBooleanField(term5801, term5801.getClass(), "resolved", false);
        setField(term5801, term5801.getClass(), "resolveResult", null);
        setField(term5801, term5801.getClass(), "registry", null);
        setField(term5788, term5788.getClass(), "templateType", term5801);
        setField(term5784, term5784.getClass(), "registry", term5788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canAssignTo", argTypes, term1217, args);
        assertTrue(recursiveEquals(term1217, term5784));
        assertTrue(recursiveEquals(retValue, true));
    }

};


