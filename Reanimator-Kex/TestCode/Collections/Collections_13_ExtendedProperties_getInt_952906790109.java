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
import java.lang.Integer;

public class ExtendedProperties_getInt_952906790109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19724;
     Object term19985;
     Object term62466;

    public ExtendedProperties_getInt_952906790109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19730 = new ArrayList();
        ArrayList term19779 = new ArrayList();
        ((ArrayList) term19779).add("java.lang.Object@a3b70a1");
        ((ArrayList) term19779).add("java.lang.Object@2fefa651");
        ((ArrayList) term19779).add("java.lang.Object@44806539");
        HashMap term19958 = new HashMap();
        Set<Object> term62690 =  ((Map) term19958).keySet();
        HashSet term19957 = new HashSet((Collection<? extends Object>) term62690);
        HashMap term19964 = new HashMap();
        Set<Object> term62691 =  ((Map) term19964).keySet();
        HashSet term19963 = new HashSet((Collection<? extends Object>) term62691);
        ArrayList term19969 = new ArrayList();
        term19724 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term19725 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term19734 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term19863 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term19864 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19892 = newInstance(Class.forName("java.lang.Object"));
        Object term19893 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19922 = newInstance(Class.forName("java.lang.Object"));
        Object term19923 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19952 = newInstance(Class.forName("java.lang.Object"));
        setField(term19725, term19725.getClass(), "defaults", null);
        setField(term19725, term19725.getClass(), "file", null);
        setField(term19725, term19725.getClass(), "basePath", null);
        setField(term19725, term19725.getClass(), "fileSeparator", "/");
        setBooleanField(term19725, term19725.getClass(), "isInitialized", false);
        setField(term19725, term19725.getClass(), "includePropertyName", null);
        setField(term19725, term19725.getClass(), "keysAsListed", term19730);
        setField(term19725, term19725.getClass(), "table", term19734);
        setIntField(term19725, term19725.getClass(), "count", 0);
        setIntField(term19725, term19725.getClass(), "threshold", 8);
        setFloatField(term19725, term19725.getClass(), "loadFactor", 0.75F);
        setIntField(term19725, term19725.getClass(), "modCount", 0);
        setField(term19725, term19725.getClass(), "keySet", null);
        setField(term19725, term19725.getClass(), "entrySet", null);
        setField(term19725, term19725.getClass(), "values", null);
        setField(term19724, term19724.getClass(), "defaults", term19725);
        setField(term19724, term19724.getClass(), "file", "aWYOWZFyaX");
        setField(term19724, term19724.getClass(), "basePath", "BRIVNtfUWU");
        setField(term19724, term19724.getClass(), "fileSeparator", "/");
        setBooleanField(term19724, term19724.getClass(), "isInitialized", true);
        setField(term19724, term19724.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term19724, term19724.getClass(), "keysAsListed", term19779);
        setIntField(term19864, term19864.getClass(), "hash", -1573271156);
        setField(term19864, term19864.getClass(), "key", "java.lang.Object@a3b70a1");
        setField(term19864, term19864.getClass(), "value", term19892);
        setField(term19864, term19864.getClass(), "next", null);
        setElement(term19863, 2, term19864);
        setIntField(term19893, term19893.getClass(), "hash", 1329899242);
        setField(term19893, term19893.getClass(), "key", "java.lang.Object@44806539");
        setField(term19893, term19893.getClass(), "value", term19922);
        setField(term19893, term19893.getClass(), "next", null);
        setElement(term19863, 37, term19893);
        setIntField(term19923, term19923.getClass(), "hash", 609253619);
        setField(term19923, term19923.getClass(), "key", "java.lang.Object@2fefa651");
        setField(term19923, term19923.getClass(), "value", term19952);
        setField(term19923, term19923.getClass(), "next", null);
        setElement(term19863, 94, term19923);
        setField(term19724, term19724.getClass(), "table", term19863);
        setIntField(term19724, term19724.getClass(), "count", 1072005686);
        setIntField(term19724, term19724.getClass(), "threshold", 71);
        setFloatField(term19724, term19724.getClass(), "loadFactor", 0.75F);
        setIntField(term19724, term19724.getClass(), "modCount", 1861318865);
        setField(term19724, term19724.getClass(), "keySet", term19957);
        setField(term19724, term19724.getClass(), "entrySet", term19963);
        setField(term19724, term19724.getClass(), "values", term19969);
        term19985 = new Integer(568954359);
        ArrayList term62470 = new ArrayList();
        ArrayList term62481 = new ArrayList();
        ((ArrayList) term62481).add("java.lang.Object@a3b70a1");
        ((ArrayList) term62481).add("java.lang.Object@2fefa651");
        ((ArrayList) term62481).add("java.lang.Object@44806539");
        HashMap term62503 = new HashMap();
        Set<Object> term62882 =  ((Map) term62503).keySet();
        HashSet term62502 = new HashSet((Collection<? extends Object>) term62882);
        HashMap term62505 = new HashMap();
        Set<Object> term62883 =  ((Map) term62505).keySet();
        HashSet term62504 = new HashSet((Collection<? extends Object>) term62883);
        ArrayList term62506 = new ArrayList();
        term62466 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term62467 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term62472 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term62489 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term62490 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term62493 = newInstance(Class.forName("java.lang.Object"));
        Object term62494 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term62497 = newInstance(Class.forName("java.lang.Object"));
        Object term62498 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term62501 = newInstance(Class.forName("java.lang.Object"));
        setField(term62467, term62467.getClass(), "defaults", null);
        setField(term62467, term62467.getClass(), "file", null);
        setField(term62467, term62467.getClass(), "basePath", null);
        setField(term62467, term62467.getClass(), "fileSeparator", "/");
        setBooleanField(term62467, term62467.getClass(), "isInitialized", false);
        setField(term62467, term62467.getClass(), "includePropertyName", null);
        setField(term62467, term62467.getClass(), "keysAsListed", term62470);
        setField(term62467, term62467.getClass(), "table", term62472);
        setIntField(term62467, term62467.getClass(), "count", 0);
        setIntField(term62467, term62467.getClass(), "threshold", 8);
        setFloatField(term62467, term62467.getClass(), "loadFactor", 0.75F);
        setIntField(term62467, term62467.getClass(), "modCount", 0);
        setField(term62467, term62467.getClass(), "keySet", null);
        setField(term62467, term62467.getClass(), "entrySet", null);
        setField(term62467, term62467.getClass(), "values", null);
        setField(term62466, term62466.getClass(), "defaults", term62467);
        setField(term62466, term62466.getClass(), "file", "aWYOWZFyaX");
        setField(term62466, term62466.getClass(), "basePath", "BRIVNtfUWU");
        setField(term62466, term62466.getClass(), "fileSeparator", "/");
        setBooleanField(term62466, term62466.getClass(), "isInitialized", true);
        setField(term62466, term62466.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term62466, term62466.getClass(), "keysAsListed", term62481);
        setIntField(term62490, term62490.getClass(), "hash", -1573271156);
        setField(term62490, term62490.getClass(), "key", "java.lang.Object@a3b70a1");
        setField(term62490, term62490.getClass(), "value", term62493);
        setField(term62490, term62490.getClass(), "next", null);
        setElement(term62489, 2, term62490);
        setIntField(term62494, term62494.getClass(), "hash", 1329899242);
        setField(term62494, term62494.getClass(), "key", "java.lang.Object@44806539");
        setField(term62494, term62494.getClass(), "value", term62497);
        setField(term62494, term62494.getClass(), "next", null);
        setElement(term62489, 37, term62494);
        setIntField(term62498, term62498.getClass(), "hash", 609253619);
        setField(term62498, term62498.getClass(), "key", "java.lang.Object@2fefa651");
        setField(term62498, term62498.getClass(), "value", term62501);
        setField(term62498, term62498.getClass(), "next", null);
        setElement(term62489, 94, term62498);
        setField(term62466, term62466.getClass(), "table", term62489);
        setIntField(term62466, term62466.getClass(), "count", 1072005686);
        setIntField(term62466, term62466.getClass(), "threshold", 71);
        setFloatField(term62466, term62466.getClass(), "loadFactor", 0.75F);
        setIntField(term62466, term62466.getClass(), "modCount", 1861318865);
        setField(term62466, term62466.getClass(), "keySet", term62502);
        setField(term62466, term62466.getClass(), "entrySet", term62504);
        setField(term62466, term62466.getClass(), "values", term62506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "WzFopsaDuG";
        args[1] = term19985;
        Object retValue = callMethod(klass, "getInt", argTypes, term19724, args);
        assertTrue(recursiveEquals(term19724, term62466));
        assertTrue(recursiveEquals(term19985, 568954359));
        assertTrue(recursiveEquals(retValue, 568954359));
    }

};


