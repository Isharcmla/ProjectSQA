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

public class ExtendedProperties_getString_127156037687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;
     Object term12872;

    public ExtendedProperties_getString_127156037687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2766 = new ArrayList();
        ArrayList term2803 = new ArrayList();
        HashMap term2813 = new HashMap();
        Set<Object> term12920 =  ((Map) term2813).keySet();
        HashSet term2812 = new HashSet((Collection<? extends Object>) term12920);
        HashMap term2819 = new HashMap();
        Set<Object> term12921 =  ((Map) term2819).keySet();
        HashSet term2818 = new HashSet((Collection<? extends Object>) term12921);
        ArrayList term2824 = new ArrayList();
        term2760 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2761 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2770 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2807 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term2761, term2761.getClass(), "defaults", null);
        setField(term2761, term2761.getClass(), "file", null);
        setField(term2761, term2761.getClass(), "basePath", null);
        setField(term2761, term2761.getClass(), "fileSeparator", "/");
        setBooleanField(term2761, term2761.getClass(), "isInitialized", false);
        setField(term2761, term2761.getClass(), "keysAsListed", term2766);
        setField(term2761, term2761.getClass(), "table", term2770);
        setIntField(term2761, term2761.getClass(), "count", 0);
        setIntField(term2761, term2761.getClass(), "threshold", 8);
        setFloatField(term2761, term2761.getClass(), "loadFactor", 0.75F);
        setIntField(term2761, term2761.getClass(), "modCount", 0);
        setField(term2761, term2761.getClass(), "keySet", null);
        setField(term2761, term2761.getClass(), "entrySet", null);
        setField(term2761, term2761.getClass(), "values", null);
        setField(term2760, term2760.getClass(), "defaults", term2761);
        setField(term2760, term2760.getClass(), "file", "eqJfYWRaEL");
        setField(term2760, term2760.getClass(), "basePath", "fhkbdRViHi");
        setField(term2760, term2760.getClass(), "fileSeparator", "/");
        setBooleanField(term2760, term2760.getClass(), "isInitialized", true);
        setField(term2760, term2760.getClass(), "keysAsListed", term2803);
        setField(term2760, term2760.getClass(), "table", term2807);
        setIntField(term2760, term2760.getClass(), "count", 1225272962);
        setIntField(term2760, term2760.getClass(), "threshold", 8);
        setFloatField(term2760, term2760.getClass(), "loadFactor", 0.75F);
        setIntField(term2760, term2760.getClass(), "modCount", 1324040357);
        setField(term2760, term2760.getClass(), "keySet", term2812);
        setField(term2760, term2760.getClass(), "entrySet", term2818);
        setField(term2760, term2760.getClass(), "values", term2824);
        ArrayList term12876 = new ArrayList();
        ArrayList term12885 = new ArrayList();
        HashMap term12889 = new HashMap();
        Set<Object> term12964 =  ((Map) term12889).keySet();
        HashSet term12888 = new HashSet((Collection<? extends Object>) term12964);
        HashMap term12891 = new HashMap();
        Set<Object> term12965 =  ((Map) term12891).keySet();
        HashSet term12890 = new HashSet((Collection<? extends Object>) term12965);
        ArrayList term12892 = new ArrayList();
        term12872 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12873 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12878 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12887 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term12873, term12873.getClass(), "defaults", null);
        setField(term12873, term12873.getClass(), "file", null);
        setField(term12873, term12873.getClass(), "basePath", null);
        setField(term12873, term12873.getClass(), "fileSeparator", "/");
        setBooleanField(term12873, term12873.getClass(), "isInitialized", false);
        setField(term12873, term12873.getClass(), "keysAsListed", term12876);
        setField(term12873, term12873.getClass(), "table", term12878);
        setIntField(term12873, term12873.getClass(), "count", 0);
        setIntField(term12873, term12873.getClass(), "threshold", 8);
        setFloatField(term12873, term12873.getClass(), "loadFactor", 0.75F);
        setIntField(term12873, term12873.getClass(), "modCount", 0);
        setField(term12873, term12873.getClass(), "keySet", null);
        setField(term12873, term12873.getClass(), "entrySet", null);
        setField(term12873, term12873.getClass(), "values", null);
        setField(term12872, term12872.getClass(), "defaults", term12873);
        setField(term12872, term12872.getClass(), "file", "eqJfYWRaEL");
        setField(term12872, term12872.getClass(), "basePath", "fhkbdRViHi");
        setField(term12872, term12872.getClass(), "fileSeparator", "/");
        setBooleanField(term12872, term12872.getClass(), "isInitialized", true);
        setField(term12872, term12872.getClass(), "keysAsListed", term12885);
        setField(term12872, term12872.getClass(), "table", term12887);
        setIntField(term12872, term12872.getClass(), "count", 1225272962);
        setIntField(term12872, term12872.getClass(), "threshold", 8);
        setFloatField(term12872, term12872.getClass(), "loadFactor", 0.75F);
        setIntField(term12872, term12872.getClass(), "modCount", 1324040357);
        setField(term12872, term12872.getClass(), "keySet", term12888);
        setField(term12872, term12872.getClass(), "entrySet", term12890);
        setField(term12872, term12872.getClass(), "values", term12892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "uWHnvSvaPl";
        args[1] = "kBdSllIBVz";
        Object retValue = callMethod(klass, "getString", argTypes, term2760, args);
        assertTrue(recursiveEquals(term2760, term12872));
        assertTrue(recursiveEquals(retValue, "kBdSllIBVz"));
    }

};


