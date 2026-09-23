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

public class ExtendedProperties_subset_48317865884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2376;
     Object term12125;

    public ExtendedProperties_subset_48317865884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2382 = new ArrayList();
        ArrayList term2419 = new ArrayList();
        HashMap term2429 = new HashMap();
        Set<Object> term12171 =  ((Map) term2429).keySet();
        HashSet term2428 = new HashSet((Collection<? extends Object>) term12171);
        HashMap term2435 = new HashMap();
        Set<Object> term12172 =  ((Map) term2435).keySet();
        HashSet term2434 = new HashSet((Collection<? extends Object>) term12172);
        ArrayList term2440 = new ArrayList();
        term2376 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2377 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2386 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2423 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term2377, term2377.getClass(), "defaults", null);
        setField(term2377, term2377.getClass(), "file", null);
        setField(term2377, term2377.getClass(), "basePath", null);
        setField(term2377, term2377.getClass(), "fileSeparator", "/");
        setBooleanField(term2377, term2377.getClass(), "isInitialized", false);
        setField(term2377, term2377.getClass(), "keysAsListed", term2382);
        setField(term2377, term2377.getClass(), "table", term2386);
        setIntField(term2377, term2377.getClass(), "count", 0);
        setIntField(term2377, term2377.getClass(), "threshold", 8);
        setFloatField(term2377, term2377.getClass(), "loadFactor", 0.75F);
        setIntField(term2377, term2377.getClass(), "modCount", 0);
        setField(term2377, term2377.getClass(), "keySet", null);
        setField(term2377, term2377.getClass(), "entrySet", null);
        setField(term2377, term2377.getClass(), "values", null);
        setField(term2376, term2376.getClass(), "defaults", term2377);
        setField(term2376, term2376.getClass(), "file", "YRHGsAkhxb");
        setField(term2376, term2376.getClass(), "basePath", "ffYhPOzlUs");
        setField(term2376, term2376.getClass(), "fileSeparator", "/");
        setBooleanField(term2376, term2376.getClass(), "isInitialized", false);
        setField(term2376, term2376.getClass(), "keysAsListed", term2419);
        setField(term2376, term2376.getClass(), "table", term2423);
        setIntField(term2376, term2376.getClass(), "count", 292681826);
        setIntField(term2376, term2376.getClass(), "threshold", 8);
        setFloatField(term2376, term2376.getClass(), "loadFactor", 0.75F);
        setIntField(term2376, term2376.getClass(), "modCount", 458147407);
        setField(term2376, term2376.getClass(), "keySet", term2428);
        setField(term2376, term2376.getClass(), "entrySet", term2434);
        setField(term2376, term2376.getClass(), "values", term2440);
        ArrayList term12129 = new ArrayList();
        ArrayList term12138 = new ArrayList();
        HashMap term12142 = new HashMap();
        Set<Object> term12205 =  ((Map) term12142).keySet();
        HashSet term12141 = new HashSet((Collection<? extends Object>) term12205);
        HashMap term12144 = new HashMap();
        Set<Object> term12206 =  ((Map) term12144).keySet();
        HashSet term12143 = new HashSet((Collection<? extends Object>) term12206);
        ArrayList term12145 = new ArrayList();
        term12125 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12126 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12131 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12140 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term12126, term12126.getClass(), "defaults", null);
        setField(term12126, term12126.getClass(), "file", null);
        setField(term12126, term12126.getClass(), "basePath", null);
        setField(term12126, term12126.getClass(), "fileSeparator", "/");
        setBooleanField(term12126, term12126.getClass(), "isInitialized", false);
        setField(term12126, term12126.getClass(), "keysAsListed", term12129);
        setField(term12126, term12126.getClass(), "table", term12131);
        setIntField(term12126, term12126.getClass(), "count", 0);
        setIntField(term12126, term12126.getClass(), "threshold", 8);
        setFloatField(term12126, term12126.getClass(), "loadFactor", 0.75F);
        setIntField(term12126, term12126.getClass(), "modCount", 0);
        setField(term12126, term12126.getClass(), "keySet", null);
        setField(term12126, term12126.getClass(), "entrySet", null);
        setField(term12126, term12126.getClass(), "values", null);
        setField(term12125, term12125.getClass(), "defaults", term12126);
        setField(term12125, term12125.getClass(), "file", "YRHGsAkhxb");
        setField(term12125, term12125.getClass(), "basePath", "ffYhPOzlUs");
        setField(term12125, term12125.getClass(), "fileSeparator", "/");
        setBooleanField(term12125, term12125.getClass(), "isInitialized", false);
        setField(term12125, term12125.getClass(), "keysAsListed", term12138);
        setField(term12125, term12125.getClass(), "table", term12140);
        setIntField(term12125, term12125.getClass(), "count", 292681826);
        setIntField(term12125, term12125.getClass(), "threshold", 8);
        setFloatField(term12125, term12125.getClass(), "loadFactor", 0.75F);
        setIntField(term12125, term12125.getClass(), "modCount", 458147407);
        setField(term12125, term12125.getClass(), "keySet", term12141);
        setField(term12125, term12125.getClass(), "entrySet", term12143);
        setField(term12125, term12125.getClass(), "values", term12145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        Object retValue = callMethod(klass, "subset", argTypes, term2376, args);
        assertTrue(recursiveEquals(term2376, term12125));
        assertTrue(recursiveEquals(retValue, null));
    }

};


