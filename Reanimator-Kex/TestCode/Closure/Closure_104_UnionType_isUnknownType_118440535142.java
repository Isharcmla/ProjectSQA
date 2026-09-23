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

public class UnionType_isUnknownType_118440535142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;
     Object term6797;

    public UnionType_isUnknownType_118440535142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1773 = new HashMap();
        Set<Object> term6819 =  ((Map) term1773).keySet();
        HashSet term1772 = new HashSet((Collection<? extends Object>) term6819);
        HashMap term1781 = new HashMap();
        HashMap term1790 = new HashMap();
        Set<Object> term6820 =  ((Map) term1790).keySet();
        HashSet term1789 = new HashSet((Collection<? extends Object>) term6820);
        HashMap term1797 = new HashMap();
        Set<Object> term6821 =  ((Map) term1797).keySet();
        HashSet term1796 = new HashSet((Collection<? extends Object>) term6821);
        HashMap term1804 = new HashMap();
        Set<Object> term6822 =  ((Map) term1804).keySet();
        HashSet term1803 = new HashSet((Collection<? extends Object>) term6822);
        HashMap term1809 = new HashMap();
        HashMap term1814 = new HashMap();
        term1771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1780 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term1835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1849 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1771, term1771.getClass(), "alternates", term1772);
        setBooleanField(term1771, term1771.getClass(), "resolved", false);
        setField(term1771, term1771.getClass(), "resolveResult", null);
        setField(term1779, term1779.getClass(), "reporter", null);
        setField(term1779, term1779.getClass(), "nativeTypes", term1780);
        setField(term1779, term1779.getClass(), "namesToTypes", term1781);
        setField(term1779, term1779.getClass(), "namespaces", term1789);
        setField(term1779, term1779.getClass(), "enumTypeNames", term1796);
        setField(term1779, term1779.getClass(), "forwardDeclaredTypes", term1803);
        setField(term1779, term1779.getClass(), "typesIndexedByProperty", term1809);
        setField(term1779, term1779.getClass(), "greatestSubtypeByProperty", term1814);
        setField(term1779, term1779.getClass(), "interfaceToImplementors", null);
        setField(term1779, term1779.getClass(), "unresolvedNamedTypes", null);
        setField(term1779, term1779.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1779, term1779.getClass(), "lastGeneration", false);
        setField(term1779, term1779.getClass(), "templateTypeName", "ypEdrstygY");
        setField(term1835, term1835.getClass(), "name", "sNQFlATEeQ");
        setField(term1835, term1835.getClass(), "referencedType", null);
        setBooleanField(term1835, term1835.getClass(), "visited", true);
        setField(term1849, term1849.getClass(), "info", null);
        setField(term1849, term1849.getClass(), "documentation", null);
        setField(term1849, term1849.getClass(), "sourceName", null);
        setField(term1849, term1849.getClass(), "visibility", null);
        setIntField(term1849, term1849.getClass(), "bitset", 0);
        setField(term1849, term1849.getClass(), "type", null);
        setField(term1849, term1849.getClass(), "thisType", null);
        setBooleanField(term1849, term1849.getClass(), "includeDocumentation", false);
        setField(term1835, term1835.getClass(), "docInfo", term1849);
        setBooleanField(term1835, term1835.getClass(), "unknown", true);
        setBooleanField(term1835, term1835.getClass(), "resolved", false);
        setField(term1835, term1835.getClass(), "resolveResult", null);
        setField(term1835, term1835.getClass(), "registry", null);
        setField(term1779, term1779.getClass(), "templateType", term1835);
        setField(term1771, term1771.getClass(), "registry", term1779);
        HashMap term6799 = new HashMap();
        Set<Object> term6843 =  ((Map) term6799).keySet();
        HashSet term6798 = new HashSet((Collection<? extends Object>) term6843);
        HashMap term6803 = new HashMap();
        HashMap term6805 = new HashMap();
        Set<Object> term6844 =  ((Map) term6805).keySet();
        HashSet term6804 = new HashSet((Collection<? extends Object>) term6844);
        HashMap term6807 = new HashMap();
        Set<Object> term6845 =  ((Map) term6807).keySet();
        HashSet term6806 = new HashSet((Collection<? extends Object>) term6845);
        HashMap term6809 = new HashMap();
        Set<Object> term6846 =  ((Map) term6809).keySet();
        HashSet term6808 = new HashSet((Collection<? extends Object>) term6846);
        HashMap term6810 = new HashMap();
        HashMap term6811 = new HashMap();
        term6797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term6801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6802 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term6814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6817 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6797, term6797.getClass(), "alternates", term6798);
        setBooleanField(term6797, term6797.getClass(), "resolved", false);
        setField(term6797, term6797.getClass(), "resolveResult", null);
        setField(term6801, term6801.getClass(), "reporter", null);
        setField(term6801, term6801.getClass(), "nativeTypes", term6802);
        setField(term6801, term6801.getClass(), "namesToTypes", term6803);
        setField(term6801, term6801.getClass(), "namespaces", term6804);
        setField(term6801, term6801.getClass(), "enumTypeNames", term6806);
        setField(term6801, term6801.getClass(), "forwardDeclaredTypes", term6808);
        setField(term6801, term6801.getClass(), "typesIndexedByProperty", term6810);
        setField(term6801, term6801.getClass(), "greatestSubtypeByProperty", term6811);
        setField(term6801, term6801.getClass(), "interfaceToImplementors", null);
        setField(term6801, term6801.getClass(), "unresolvedNamedTypes", null);
        setField(term6801, term6801.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6801, term6801.getClass(), "lastGeneration", false);
        setField(term6801, term6801.getClass(), "templateTypeName", "ypEdrstygY");
        setField(term6814, term6814.getClass(), "name", "sNQFlATEeQ");
        setField(term6814, term6814.getClass(), "referencedType", null);
        setBooleanField(term6814, term6814.getClass(), "visited", true);
        setField(term6817, term6817.getClass(), "info", null);
        setField(term6817, term6817.getClass(), "documentation", null);
        setField(term6817, term6817.getClass(), "sourceName", null);
        setField(term6817, term6817.getClass(), "visibility", null);
        setIntField(term6817, term6817.getClass(), "bitset", 0);
        setField(term6817, term6817.getClass(), "type", null);
        setField(term6817, term6817.getClass(), "thisType", null);
        setBooleanField(term6817, term6817.getClass(), "includeDocumentation", false);
        setField(term6814, term6814.getClass(), "docInfo", term6817);
        setBooleanField(term6814, term6814.getClass(), "unknown", true);
        setBooleanField(term6814, term6814.getClass(), "resolved", false);
        setField(term6814, term6814.getClass(), "resolveResult", null);
        setField(term6814, term6814.getClass(), "registry", null);
        setField(term6801, term6801.getClass(), "templateType", term6814);
        setField(term6797, term6797.getClass(), "registry", term6801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUnknownType", argTypes, term1771, args);
        assertTrue(recursiveEquals(term1771, term6797));
        assertTrue(recursiveEquals(retValue, false));
    }

};


