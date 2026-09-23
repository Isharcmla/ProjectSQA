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

public class ExtendedProperties_getString_127156037688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;
     Object term15362;

    public ExtendedProperties_getString_127156037688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3232 = new ArrayList();
        ArrayList term3281 = new ArrayList();
        HashMap term3291 = new HashMap();
        Set<Object> term15422 =  ((Map) term3291).keySet();
        HashSet term3290 = new HashSet((Collection<? extends Object>) term15422);
        HashMap term3297 = new HashMap();
        Set<Object> term15423 =  ((Map) term3297).keySet();
        HashSet term3296 = new HashSet((Collection<? extends Object>) term15423);
        ArrayList term3302 = new ArrayList();
        term3226 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3227 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3236 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3285 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3227, term3227.getClass(), "defaults", null);
        setField(term3227, term3227.getClass(), "file", null);
        setField(term3227, term3227.getClass(), "basePath", null);
        setField(term3227, term3227.getClass(), "fileSeparator", "/");
        setBooleanField(term3227, term3227.getClass(), "isInitialized", false);
        setField(term3227, term3227.getClass(), "includePropertyName", null);
        setField(term3227, term3227.getClass(), "keysAsListed", term3232);
        setField(term3227, term3227.getClass(), "table", term3236);
        setIntField(term3227, term3227.getClass(), "count", 0);
        setIntField(term3227, term3227.getClass(), "threshold", 8);
        setFloatField(term3227, term3227.getClass(), "loadFactor", 0.75F);
        setIntField(term3227, term3227.getClass(), "modCount", 0);
        setField(term3227, term3227.getClass(), "keySet", null);
        setField(term3227, term3227.getClass(), "entrySet", null);
        setField(term3227, term3227.getClass(), "values", null);
        setField(term3226, term3226.getClass(), "defaults", term3227);
        setField(term3226, term3226.getClass(), "file", "cAPeiZHKGJ");
        setField(term3226, term3226.getClass(), "basePath", "LvJFtLBaxj");
        setField(term3226, term3226.getClass(), "fileSeparator", "/");
        setBooleanField(term3226, term3226.getClass(), "isInitialized", true);
        setField(term3226, term3226.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term3226, term3226.getClass(), "keysAsListed", term3281);
        setField(term3226, term3226.getClass(), "table", term3285);
        setIntField(term3226, term3226.getClass(), "count", 1225272962);
        setIntField(term3226, term3226.getClass(), "threshold", 8);
        setFloatField(term3226, term3226.getClass(), "loadFactor", 0.75F);
        setIntField(term3226, term3226.getClass(), "modCount", 1324040357);
        setField(term3226, term3226.getClass(), "keySet", term3290);
        setField(term3226, term3226.getClass(), "entrySet", term3296);
        setField(term3226, term3226.getClass(), "values", term3302);
        ArrayList term15366 = new ArrayList();
        ArrayList term15377 = new ArrayList();
        HashMap term15381 = new HashMap();
        Set<Object> term15476 =  ((Map) term15381).keySet();
        HashSet term15380 = new HashSet((Collection<? extends Object>) term15476);
        HashMap term15383 = new HashMap();
        Set<Object> term15477 =  ((Map) term15383).keySet();
        HashSet term15382 = new HashSet((Collection<? extends Object>) term15477);
        ArrayList term15384 = new ArrayList();
        term15362 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15363 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15368 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15379 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term15363, term15363.getClass(), "defaults", null);
        setField(term15363, term15363.getClass(), "file", null);
        setField(term15363, term15363.getClass(), "basePath", null);
        setField(term15363, term15363.getClass(), "fileSeparator", "/");
        setBooleanField(term15363, term15363.getClass(), "isInitialized", false);
        setField(term15363, term15363.getClass(), "includePropertyName", null);
        setField(term15363, term15363.getClass(), "keysAsListed", term15366);
        setField(term15363, term15363.getClass(), "table", term15368);
        setIntField(term15363, term15363.getClass(), "count", 0);
        setIntField(term15363, term15363.getClass(), "threshold", 8);
        setFloatField(term15363, term15363.getClass(), "loadFactor", 0.75F);
        setIntField(term15363, term15363.getClass(), "modCount", 0);
        setField(term15363, term15363.getClass(), "keySet", null);
        setField(term15363, term15363.getClass(), "entrySet", null);
        setField(term15363, term15363.getClass(), "values", null);
        setField(term15362, term15362.getClass(), "defaults", term15363);
        setField(term15362, term15362.getClass(), "file", "cAPeiZHKGJ");
        setField(term15362, term15362.getClass(), "basePath", "LvJFtLBaxj");
        setField(term15362, term15362.getClass(), "fileSeparator", "/");
        setBooleanField(term15362, term15362.getClass(), "isInitialized", true);
        setField(term15362, term15362.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term15362, term15362.getClass(), "keysAsListed", term15377);
        setField(term15362, term15362.getClass(), "table", term15379);
        setIntField(term15362, term15362.getClass(), "count", 1225272962);
        setIntField(term15362, term15362.getClass(), "threshold", 8);
        setFloatField(term15362, term15362.getClass(), "loadFactor", 0.75F);
        setIntField(term15362, term15362.getClass(), "modCount", 1324040357);
        setField(term15362, term15362.getClass(), "keySet", term15380);
        setField(term15362, term15362.getClass(), "entrySet", term15382);
        setField(term15362, term15362.getClass(), "values", term15384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "TimdotUuNC";
        args[1] = "PkWMRdJcBb";
        Object retValue = callMethod(klass, "getString", argTypes, term3226, args);
        assertTrue(recursiveEquals(term3226, term15362));
        assertTrue(recursiveEquals(retValue, "PkWMRdJcBb"));
    }

};


