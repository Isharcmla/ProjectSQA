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

public class ExtendedProperties_getVector_145146219791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3288;
     Object term13911;
     Object term13906;

    public ExtendedProperties_getVector_145146219791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3294 = new ArrayList();
        ArrayList term3331 = new ArrayList();
        HashMap term3345 = new HashMap();
        Set<Object> term13960 =  ((Map) term3345).keySet();
        HashSet term3344 = new HashSet((Collection<? extends Object>) term13960);
        HashMap term3351 = new HashMap();
        Set<Object> term13961 =  ((Map) term3351).keySet();
        HashSet term3350 = new HashSet((Collection<? extends Object>) term13961);
        ArrayList term3356 = new ArrayList();
        term3288 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3289 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3298 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3335 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term3336 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3338 = newInstance(Class.forName("java.lang.Object"));
        Object term3339 = newInstance(Class.forName("java.lang.Object"));
        setField(term3289, term3289.getClass(), "defaults", null);
        setField(term3289, term3289.getClass(), "file", null);
        setField(term3289, term3289.getClass(), "basePath", null);
        setField(term3289, term3289.getClass(), "fileSeparator", "/");
        setBooleanField(term3289, term3289.getClass(), "isInitialized", false);
        setField(term3289, term3289.getClass(), "keysAsListed", term3294);
        setField(term3289, term3289.getClass(), "table", term3298);
        setIntField(term3289, term3289.getClass(), "count", 0);
        setIntField(term3289, term3289.getClass(), "threshold", 8);
        setFloatField(term3289, term3289.getClass(), "loadFactor", 0.75F);
        setIntField(term3289, term3289.getClass(), "modCount", 0);
        setField(term3289, term3289.getClass(), "keySet", null);
        setField(term3289, term3289.getClass(), "entrySet", null);
        setField(term3289, term3289.getClass(), "values", null);
        setField(term3288, term3288.getClass(), "defaults", term3289);
        setField(term3288, term3288.getClass(), "file", "oVgzLbrsFr");
        setField(term3288, term3288.getClass(), "basePath", "vQVyKLdtaz");
        setField(term3288, term3288.getClass(), "fileSeparator", "/");
        setBooleanField(term3288, term3288.getClass(), "isInitialized", false);
        setField(term3288, term3288.getClass(), "keysAsListed", term3331);
        setIntField(term3336, term3336.getClass(), "hash", 114545217);
        setField(term3336, term3336.getClass(), "key", term3338);
        setField(term3336, term3336.getClass(), "value", term3339);
        setField(term3336, term3336.getClass(), "next", null);
        setElement(term3335, 6, term3336);
        setField(term3288, term3288.getClass(), "table", term3335);
        setIntField(term3288, term3288.getClass(), "count", -2027534002);
        setIntField(term3288, term3288.getClass(), "threshold", 8);
        setFloatField(term3288, term3288.getClass(), "loadFactor", 0.75F);
        setIntField(term3288, term3288.getClass(), "modCount", 1063420943);
        setField(term3288, term3288.getClass(), "keySet", term3344);
        setField(term3288, term3288.getClass(), "entrySet", term3350);
        setField(term3288, term3288.getClass(), "values", term3356);
        ArrayList term13915 = new ArrayList();
        ArrayList term13924 = new ArrayList();
        HashMap term13931 = new HashMap();
        Set<Object> term13994 =  ((Map) term13931).keySet();
        HashSet term13930 = new HashSet((Collection<? extends Object>) term13994);
        HashMap term13933 = new HashMap();
        Set<Object> term13995 =  ((Map) term13933).keySet();
        HashSet term13932 = new HashSet((Collection<? extends Object>) term13995);
        ArrayList term13934 = new ArrayList();
        term13911 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13912 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13917 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13926 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13927 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13928 = newInstance(Class.forName("java.lang.Object"));
        Object term13929 = newInstance(Class.forName("java.lang.Object"));
        setField(term13912, term13912.getClass(), "defaults", null);
        setField(term13912, term13912.getClass(), "file", null);
        setField(term13912, term13912.getClass(), "basePath", null);
        setField(term13912, term13912.getClass(), "fileSeparator", "/");
        setBooleanField(term13912, term13912.getClass(), "isInitialized", false);
        setField(term13912, term13912.getClass(), "keysAsListed", term13915);
        setField(term13912, term13912.getClass(), "table", term13917);
        setIntField(term13912, term13912.getClass(), "count", 0);
        setIntField(term13912, term13912.getClass(), "threshold", 8);
        setFloatField(term13912, term13912.getClass(), "loadFactor", 0.75F);
        setIntField(term13912, term13912.getClass(), "modCount", 0);
        setField(term13912, term13912.getClass(), "keySet", null);
        setField(term13912, term13912.getClass(), "entrySet", null);
        setField(term13912, term13912.getClass(), "values", null);
        setField(term13911, term13911.getClass(), "defaults", term13912);
        setField(term13911, term13911.getClass(), "file", "oVgzLbrsFr");
        setField(term13911, term13911.getClass(), "basePath", "vQVyKLdtaz");
        setField(term13911, term13911.getClass(), "fileSeparator", "/");
        setBooleanField(term13911, term13911.getClass(), "isInitialized", false);
        setField(term13911, term13911.getClass(), "keysAsListed", term13924);
        setIntField(term13927, term13927.getClass(), "hash", 114545217);
        setField(term13927, term13927.getClass(), "key", term13928);
        setField(term13927, term13927.getClass(), "value", term13929);
        setField(term13927, term13927.getClass(), "next", null);
        setElement(term13926, 6, term13927);
        setField(term13911, term13911.getClass(), "table", term13926);
        setIntField(term13911, term13911.getClass(), "count", -2027534002);
        setIntField(term13911, term13911.getClass(), "threshold", 8);
        setFloatField(term13911, term13911.getClass(), "loadFactor", 0.75F);
        setIntField(term13911, term13911.getClass(), "modCount", 1063420943);
        setField(term13911, term13911.getClass(), "keySet", term13930);
        setField(term13911, term13911.getClass(), "entrySet", term13932);
        setField(term13911, term13911.getClass(), "values", term13934);
        term13906 = newInstance(Class.forName("java.util.Vector"));
        Object[] term13907 = (Object[]) newArray("java.lang.Object", 10);
        setField(term13906, term13906.getClass(), "elementData", term13907);
        setIntField(term13906, term13906.getClass(), "elementCount", 0);
        setIntField(term13906, term13906.getClass(), "capacityIncrement", 0);
        setIntField(term13906, term13906.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        Object retValue = callMethod(klass, "getVector", argTypes, term3288, args);
        assertTrue(recursiveEquals(term3288, term13911));
        assertTrue(recursiveEquals(retValue, term13906));
    }

};


