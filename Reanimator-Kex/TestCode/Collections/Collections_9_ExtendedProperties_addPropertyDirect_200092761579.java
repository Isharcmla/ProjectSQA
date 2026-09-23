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

public class ExtendedProperties_addPropertyDirect_200092761579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5707;
     Object term5944;
     Object term38879;
     Object term38928;

    public ExtendedProperties_addPropertyDirect_200092761579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5713 = new ArrayList();
        ArrayList term5762 = new ArrayList();
        ((ArrayList) term5762).add("java.lang.Object@30d54b4d");
        ((ArrayList) term5762).add("java.lang.Object@1c98e556");
        ((ArrayList) term5762).add("java.lang.Object@34988d6c");
        HashMap term5917 = new HashMap();
        Set<Object> term39086 =  ((Map) term5917).keySet();
        HashSet term5916 = new HashSet((Collection<? extends Object>) term39086);
        HashMap term5923 = new HashMap();
        Set<Object> term39087 =  ((Map) term5923).keySet();
        HashSet term5922 = new HashSet((Collection<? extends Object>) term39087);
        ArrayList term5928 = new ArrayList();
        term5707 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5708 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5717 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5847 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5848 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5877 = newInstance(Class.forName("java.lang.Object"));
        Object term5878 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5907 = newInstance(Class.forName("java.lang.Object"));
        Object term5908 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5911 = newInstance(Class.forName("java.lang.Object"));
        setField(term5708, term5708.getClass(), "defaults", null);
        setField(term5708, term5708.getClass(), "file", null);
        setField(term5708, term5708.getClass(), "basePath", null);
        setField(term5708, term5708.getClass(), "fileSeparator", "/");
        setBooleanField(term5708, term5708.getClass(), "isInitialized", false);
        setField(term5708, term5708.getClass(), "includePropertyName", null);
        setField(term5708, term5708.getClass(), "keysAsListed", term5713);
        setField(term5708, term5708.getClass(), "table", term5717);
        setIntField(term5708, term5708.getClass(), "count", 0);
        setIntField(term5708, term5708.getClass(), "threshold", 8);
        setFloatField(term5708, term5708.getClass(), "loadFactor", 0.75F);
        setIntField(term5708, term5708.getClass(), "modCount", 0);
        setField(term5708, term5708.getClass(), "keySet", null);
        setField(term5708, term5708.getClass(), "entrySet", null);
        setField(term5708, term5708.getClass(), "values", null);
        setField(term5707, term5707.getClass(), "defaults", term5708);
        setField(term5707, term5707.getClass(), "file", "wSQxaModmm");
        setField(term5707, term5707.getClass(), "basePath", "UlajhuVLaP");
        setField(term5707, term5707.getClass(), "fileSeparator", "/");
        setBooleanField(term5707, term5707.getClass(), "isInitialized", true);
        setField(term5707, term5707.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term5707, term5707.getClass(), "keysAsListed", term5762);
        setIntField(term5848, term5848.getClass(), "hash", -376788890);
        setField(term5848, term5848.getClass(), "key", "java.lang.Object@34988d6c");
        setField(term5848, term5848.getClass(), "value", term5877);
        setField(term5848, term5848.getClass(), "next", null);
        setElement(term5847, 8, term5848);
        setIntField(term5878, term5878.getClass(), "hash", -803146865);
        setField(term5878, term5878.getClass(), "key", "java.lang.Object@1c98e556");
        setField(term5878, term5878.getClass(), "value", term5907);
        setIntField(term5908, term5908.getClass(), "hash", 1596325465);
        setField(term5908, term5908.getClass(), "key", "");
        setField(term5908, term5908.getClass(), "value", term5911);
        setField(term5908, term5908.getClass(), "next", null);
        setField(term5878, term5878.getClass(), "next", term5908);
        setElement(term5847, 9, term5878);
        setField(term5707, term5707.getClass(), "table", term5847);
        setIntField(term5707, term5707.getClass(), "count", -1275173081);
        setIntField(term5707, term5707.getClass(), "threshold", 8);
        setFloatField(term5707, term5707.getClass(), "loadFactor", 0.75F);
        setIntField(term5707, term5707.getClass(), "modCount", -244121223);
        setField(term5707, term5707.getClass(), "keySet", term5916);
        setField(term5707, term5707.getClass(), "entrySet", term5922);
        setField(term5707, term5707.getClass(), "values", term5928);
        term5944 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term38883 = new ArrayList();
        ArrayList term38894 = new ArrayList();
        ((ArrayList) term38894).add("java.lang.Object@30d54b4d");
        ((ArrayList) term38894).add("java.lang.Object@1c98e556");
        ((ArrayList) term38894).add("java.lang.Object@34988d6c");
        ((ArrayList) term38894).add("hxCBltsObl");
        HashMap term38921 = new HashMap();
        Set<Object> term39275 =  ((Map) term38921).keySet();
        HashSet term38920 = new HashSet((Collection<? extends Object>) term39275);
        HashMap term38923 = new HashMap();
        Set<Object> term39276 =  ((Map) term38923).keySet();
        HashSet term38922 = new HashSet((Collection<? extends Object>) term39276);
        ArrayList term38924 = new ArrayList();
        term38879 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term38880 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term38885 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term38904 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term38905 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38908 = newInstance(Class.forName("java.lang.Object"));
        Object term38909 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38912 = newInstance(Class.forName("java.lang.Object"));
        Object term38913 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38916 = newInstance(Class.forName("java.lang.Object"));
        Object term38917 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38919 = newInstance(Class.forName("java.lang.Object"));
        setField(term38880, term38880.getClass(), "defaults", null);
        setField(term38880, term38880.getClass(), "file", null);
        setField(term38880, term38880.getClass(), "basePath", null);
        setField(term38880, term38880.getClass(), "fileSeparator", "/");
        setBooleanField(term38880, term38880.getClass(), "isInitialized", false);
        setField(term38880, term38880.getClass(), "includePropertyName", null);
        setField(term38880, term38880.getClass(), "keysAsListed", term38883);
        setField(term38880, term38880.getClass(), "table", term38885);
        setIntField(term38880, term38880.getClass(), "count", 0);
        setIntField(term38880, term38880.getClass(), "threshold", 8);
        setFloatField(term38880, term38880.getClass(), "loadFactor", 0.75F);
        setIntField(term38880, term38880.getClass(), "modCount", 0);
        setField(term38880, term38880.getClass(), "keySet", null);
        setField(term38880, term38880.getClass(), "entrySet", null);
        setField(term38880, term38880.getClass(), "values", null);
        setField(term38879, term38879.getClass(), "defaults", term38880);
        setField(term38879, term38879.getClass(), "file", "wSQxaModmm");
        setField(term38879, term38879.getClass(), "basePath", "UlajhuVLaP");
        setField(term38879, term38879.getClass(), "fileSeparator", "/");
        setBooleanField(term38879, term38879.getClass(), "isInitialized", true);
        setField(term38879, term38879.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term38879, term38879.getClass(), "keysAsListed", term38894);
        setIntField(term38905, term38905.getClass(), "hash", 1343719229);
        setField(term38905, term38905.getClass(), "key", "hxCBltsObl");
        setField(term38905, term38905.getClass(), "value", term38908);
        setField(term38905, term38905.getClass(), "next", null);
        setElement(term38904, 6, term38905);
        setIntField(term38909, term38909.getClass(), "hash", -376788890);
        setField(term38909, term38909.getClass(), "key", "java.lang.Object@34988d6c");
        setField(term38909, term38909.getClass(), "value", term38912);
        setField(term38909, term38909.getClass(), "next", null);
        setElement(term38904, 8, term38909);
        setIntField(term38913, term38913.getClass(), "hash", -803146865);
        setField(term38913, term38913.getClass(), "key", "java.lang.Object@1c98e556");
        setField(term38913, term38913.getClass(), "value", term38916);
        setIntField(term38917, term38917.getClass(), "hash", 1596325465);
        setField(term38917, term38917.getClass(), "key", "");
        setField(term38917, term38917.getClass(), "value", term38919);
        setField(term38917, term38917.getClass(), "next", null);
        setField(term38913, term38913.getClass(), "next", term38917);
        setElement(term38904, 9, term38913);
        setField(term38879, term38879.getClass(), "table", term38904);
        setIntField(term38879, term38879.getClass(), "count", -1275173080);
        setIntField(term38879, term38879.getClass(), "threshold", 8);
        setFloatField(term38879, term38879.getClass(), "loadFactor", 0.75F);
        setIntField(term38879, term38879.getClass(), "modCount", -244121222);
        setField(term38879, term38879.getClass(), "keySet", term38920);
        setField(term38879, term38879.getClass(), "entrySet", term38922);
        setField(term38879, term38879.getClass(), "values", term38924);
        term38928 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = term5944;
        callMethod(klass, "addPropertyDirect", argTypes, term5707, args);
        assertTrue(recursiveEquals(term5707, term38879));
        assertTrue(recursiveEquals(term5944, term38928));
    }

};


