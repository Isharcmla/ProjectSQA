package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_testBoolean_1991462572101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15802;
     Object term55684;

    public ExtendedProperties_testBoolean_1991462572101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15808 = new ArrayList();
        ArrayList term15857 = new ArrayList();
        ((ArrayList) term15857).add("java.lang.Object@655e5056");
        ((ArrayList) term15857).add("java.lang.Object@3e165aff");
        HashMap term15981 = new HashMap();
        Set<Object> term55854 =  ((Map) term15981).keySet();
        HashSet term15980 = new HashSet((Collection<? extends Object>) term55854);
        HashMap term15987 = new HashMap();
        Set<Object> term55855 =  ((Map) term15987).keySet();
        HashSet term15986 = new HashSet((Collection<? extends Object>) term55855);
        ArrayList term15992 = new ArrayList();
        term15802 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15803 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15812 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15915 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term15916 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15945 = newInstance(Class.forName("java.lang.Object"));
        Object term15946 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15975 = newInstance(Class.forName("java.lang.Object"));
        setField(term15803, term15803.getClass(), "defaults", null);
        setField(term15803, term15803.getClass(), "file", null);
        setField(term15803, term15803.getClass(), "basePath", null);
        setField(term15803, term15803.getClass(), "fileSeparator", "/");
        setBooleanField(term15803, term15803.getClass(), "isInitialized", false);
        setField(term15803, term15803.getClass(), "includePropertyName", null);
        setField(term15803, term15803.getClass(), "keysAsListed", term15808);
        setField(term15803, term15803.getClass(), "table", term15812);
        setIntField(term15803, term15803.getClass(), "count", 0);
        setIntField(term15803, term15803.getClass(), "threshold", 8);
        setFloatField(term15803, term15803.getClass(), "loadFactor", 0.75F);
        setIntField(term15803, term15803.getClass(), "modCount", 0);
        setField(term15803, term15803.getClass(), "keySet", null);
        setField(term15803, term15803.getClass(), "entrySet", null);
        setField(term15803, term15803.getClass(), "values", null);
        setField(term15802, term15802.getClass(), "defaults", term15803);
        setField(term15802, term15802.getClass(), "file", "SdCKLMIYnX");
        setField(term15802, term15802.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term15802, term15802.getClass(), "fileSeparator", "/");
        setBooleanField(term15802, term15802.getClass(), "isInitialized", true);
        setField(term15802, term15802.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term15802, term15802.getClass(), "keysAsListed", term15857);
        setIntField(term15916, term15916.getClass(), "hash", 1371080920);
        setField(term15916, term15916.getClass(), "key", "java.lang.Object@655e5056");
        setField(term15916, term15916.getClass(), "value", term15945);
        setField(term15916, term15916.getClass(), "next", null);
        setElement(term15915, 0, term15916);
        setIntField(term15946, term15946.getClass(), "hash", -69752496);
        setField(term15946, term15946.getClass(), "key", "java.lang.Object@3e165aff");
        setField(term15946, term15946.getClass(), "value", term15975);
        setField(term15946, term15946.getClass(), "next", null);
        setElement(term15915, 2, term15946);
        setField(term15802, term15802.getClass(), "table", term15915);
        setIntField(term15802, term15802.getClass(), "count", -1263114717);
        setIntField(term15802, term15802.getClass(), "threshold", 8);
        setFloatField(term15802, term15802.getClass(), "loadFactor", 0.75F);
        setIntField(term15802, term15802.getClass(), "modCount", -894662984);
        setField(term15802, term15802.getClass(), "keySet", term15980);
        setField(term15802, term15802.getClass(), "entrySet", term15986);
        setField(term15802, term15802.getClass(), "values", term15992);
        ArrayList term55688 = new ArrayList();
        ArrayList term55699 = new ArrayList();
        ((ArrayList) term55699).add("java.lang.Object@655e5056");
        ((ArrayList) term55699).add("java.lang.Object@3e165aff");
        HashMap term55715 = new HashMap();
        Set<Object> term55998 =  ((Map) term55715).keySet();
        HashSet term55714 = new HashSet((Collection<? extends Object>) term55998);
        HashMap term55717 = new HashMap();
        Set<Object> term55999 =  ((Map) term55717).keySet();
        HashSet term55716 = new HashSet((Collection<? extends Object>) term55999);
        ArrayList term55718 = new ArrayList();
        term55684 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term55685 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term55690 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term55705 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term55706 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term55709 = newInstance(Class.forName("java.lang.Object"));
        Object term55710 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term55713 = newInstance(Class.forName("java.lang.Object"));
        setField(term55685, term55685.getClass(), "defaults", null);
        setField(term55685, term55685.getClass(), "file", null);
        setField(term55685, term55685.getClass(), "basePath", null);
        setField(term55685, term55685.getClass(), "fileSeparator", "/");
        setBooleanField(term55685, term55685.getClass(), "isInitialized", false);
        setField(term55685, term55685.getClass(), "includePropertyName", null);
        setField(term55685, term55685.getClass(), "keysAsListed", term55688);
        setField(term55685, term55685.getClass(), "table", term55690);
        setIntField(term55685, term55685.getClass(), "count", 0);
        setIntField(term55685, term55685.getClass(), "threshold", 8);
        setFloatField(term55685, term55685.getClass(), "loadFactor", 0.75F);
        setIntField(term55685, term55685.getClass(), "modCount", 0);
        setField(term55685, term55685.getClass(), "keySet", null);
        setField(term55685, term55685.getClass(), "entrySet", null);
        setField(term55685, term55685.getClass(), "values", null);
        setField(term55684, term55684.getClass(), "defaults", term55685);
        setField(term55684, term55684.getClass(), "file", "SdCKLMIYnX");
        setField(term55684, term55684.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term55684, term55684.getClass(), "fileSeparator", "/");
        setBooleanField(term55684, term55684.getClass(), "isInitialized", true);
        setField(term55684, term55684.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term55684, term55684.getClass(), "keysAsListed", term55699);
        setIntField(term55706, term55706.getClass(), "hash", 1371080920);
        setField(term55706, term55706.getClass(), "key", "java.lang.Object@655e5056");
        setField(term55706, term55706.getClass(), "value", term55709);
        setField(term55706, term55706.getClass(), "next", null);
        setElement(term55705, 0, term55706);
        setIntField(term55710, term55710.getClass(), "hash", -69752496);
        setField(term55710, term55710.getClass(), "key", "java.lang.Object@3e165aff");
        setField(term55710, term55710.getClass(), "value", term55713);
        setField(term55710, term55710.getClass(), "next", null);
        setElement(term55705, 2, term55710);
        setField(term55684, term55684.getClass(), "table", term55705);
        setIntField(term55684, term55684.getClass(), "count", -1263114717);
        setIntField(term55684, term55684.getClass(), "threshold", 8);
        setFloatField(term55684, term55684.getClass(), "loadFactor", 0.75F);
        setIntField(term55684, term55684.getClass(), "modCount", -894662984);
        setField(term55684, term55684.getClass(), "keySet", term55714);
        setField(term55684, term55684.getClass(), "entrySet", term55716);
        setField(term55684, term55684.getClass(), "values", term55718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term15802, args);
        assertTrue(recursiveEquals(term15802, term55684));
        assertTrue(recursiveEquals(retValue, null));
    }

};


