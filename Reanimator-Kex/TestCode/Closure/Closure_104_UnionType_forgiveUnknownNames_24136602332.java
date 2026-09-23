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

public class UnionType_forgiveUnknownNames_24136602332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644;
     Object term5001;

    public UnionType_forgiveUnknownNames_24136602332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term646 = new HashMap();
        Set<Object> term5022 =  ((Map) term646).keySet();
        HashSet term645 = new HashSet((Collection<? extends Object>) term5022);
        HashMap term654 = new HashMap();
        HashMap term663 = new HashMap();
        Set<Object> term5023 =  ((Map) term663).keySet();
        HashSet term662 = new HashSet((Collection<? extends Object>) term5023);
        HashMap term670 = new HashMap();
        Set<Object> term5024 =  ((Map) term670).keySet();
        HashSet term669 = new HashSet((Collection<? extends Object>) term5024);
        HashMap term677 = new HashMap();
        Set<Object> term5025 =  ((Map) term677).keySet();
        HashSet term676 = new HashSet((Collection<? extends Object>) term5025);
        HashMap term683 = new HashMap();
        HashMap term688 = new HashMap();
        term644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term653 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term723 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term644, term644.getClass(), "alternates", term645);
        setBooleanField(term644, term644.getClass(), "resolved", false);
        setField(term644, term644.getClass(), "resolveResult", null);
        setField(term652, term652.getClass(), "reporter", null);
        setField(term652, term652.getClass(), "nativeTypes", term653);
        setField(term652, term652.getClass(), "namesToTypes", term654);
        setField(term652, term652.getClass(), "namespaces", term662);
        setField(term652, term652.getClass(), "enumTypeNames", term669);
        setField(term652, term652.getClass(), "forwardDeclaredTypes", term676);
        setField(term652, term652.getClass(), "typesIndexedByProperty", term683);
        setField(term652, term652.getClass(), "greatestSubtypeByProperty", term688);
        setField(term652, term652.getClass(), "interfaceToImplementors", null);
        setField(term652, term652.getClass(), "unresolvedNamedTypes", null);
        setField(term652, term652.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term652, term652.getClass(), "lastGeneration", true);
        setField(term652, term652.getClass(), "templateTypeName", "oVgzLbrsFr");
        setField(term709, term709.getClass(), "name", "vQVyKLdtaz");
        setField(term709, term709.getClass(), "referencedType", null);
        setBooleanField(term709, term709.getClass(), "visited", false);
        setField(term723, term723.getClass(), "info", null);
        setField(term723, term723.getClass(), "documentation", null);
        setField(term723, term723.getClass(), "sourceName", null);
        setField(term723, term723.getClass(), "visibility", null);
        setIntField(term723, term723.getClass(), "bitset", 0);
        setField(term723, term723.getClass(), "type", null);
        setField(term723, term723.getClass(), "thisType", null);
        setBooleanField(term723, term723.getClass(), "includeDocumentation", false);
        setField(term709, term709.getClass(), "docInfo", term723);
        setBooleanField(term709, term709.getClass(), "unknown", true);
        setBooleanField(term709, term709.getClass(), "resolved", false);
        setField(term709, term709.getClass(), "resolveResult", null);
        setField(term709, term709.getClass(), "registry", null);
        setField(term652, term652.getClass(), "templateType", term709);
        setField(term644, term644.getClass(), "registry", term652);
        HashMap term5003 = new HashMap();
        Set<Object> term5046 =  ((Map) term5003).keySet();
        HashSet term5002 = new HashSet((Collection<? extends Object>) term5046);
        HashMap term5007 = new HashMap();
        HashMap term5009 = new HashMap();
        Set<Object> term5047 =  ((Map) term5009).keySet();
        HashSet term5008 = new HashSet((Collection<? extends Object>) term5047);
        HashMap term5011 = new HashMap();
        Set<Object> term5048 =  ((Map) term5011).keySet();
        HashSet term5010 = new HashSet((Collection<? extends Object>) term5048);
        HashMap term5013 = new HashMap();
        Set<Object> term5049 =  ((Map) term5013).keySet();
        HashSet term5012 = new HashSet((Collection<? extends Object>) term5049);
        HashMap term5014 = new HashMap();
        HashMap term5015 = new HashMap();
        term5001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5006 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term5018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5001, term5001.getClass(), "alternates", term5002);
        setBooleanField(term5001, term5001.getClass(), "resolved", false);
        setField(term5001, term5001.getClass(), "resolveResult", null);
        setField(term5005, term5005.getClass(), "reporter", null);
        setField(term5005, term5005.getClass(), "nativeTypes", term5006);
        setField(term5005, term5005.getClass(), "namesToTypes", term5007);
        setField(term5005, term5005.getClass(), "namespaces", term5008);
        setField(term5005, term5005.getClass(), "enumTypeNames", term5010);
        setField(term5005, term5005.getClass(), "forwardDeclaredTypes", term5012);
        setField(term5005, term5005.getClass(), "typesIndexedByProperty", term5014);
        setField(term5005, term5005.getClass(), "greatestSubtypeByProperty", term5015);
        setField(term5005, term5005.getClass(), "interfaceToImplementors", null);
        setField(term5005, term5005.getClass(), "unresolvedNamedTypes", null);
        setField(term5005, term5005.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5005, term5005.getClass(), "lastGeneration", true);
        setField(term5005, term5005.getClass(), "templateTypeName", "oVgzLbrsFr");
        setField(term5018, term5018.getClass(), "name", "vQVyKLdtaz");
        setField(term5018, term5018.getClass(), "referencedType", null);
        setBooleanField(term5018, term5018.getClass(), "visited", false);
        setField(term5021, term5021.getClass(), "info", null);
        setField(term5021, term5021.getClass(), "documentation", null);
        setField(term5021, term5021.getClass(), "sourceName", null);
        setField(term5021, term5021.getClass(), "visibility", null);
        setIntField(term5021, term5021.getClass(), "bitset", 0);
        setField(term5021, term5021.getClass(), "type", null);
        setField(term5021, term5021.getClass(), "thisType", null);
        setBooleanField(term5021, term5021.getClass(), "includeDocumentation", false);
        setField(term5018, term5018.getClass(), "docInfo", term5021);
        setBooleanField(term5018, term5018.getClass(), "unknown", true);
        setBooleanField(term5018, term5018.getClass(), "resolved", false);
        setField(term5018, term5018.getClass(), "resolveResult", null);
        setField(term5018, term5018.getClass(), "registry", null);
        setField(term5005, term5005.getClass(), "templateType", term5018);
        setField(term5001, term5001.getClass(), "registry", term5005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "forgiveUnknownNames", argTypes, term644, args);
        assertTrue(recursiveEquals(term644, term5001));
    }

};


