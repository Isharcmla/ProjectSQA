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

public class ExtendedProperties_getVector_86580217092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3406;
     Object term3486;
     Object term14121;
     Object term14145;
     Object term14047;

    public ExtendedProperties_getVector_86580217092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3412 = new ArrayList();
        ArrayList term3449 = new ArrayList();
        HashMap term3459 = new HashMap();
        Set<Object> term14170 =  ((Map) term3459).keySet();
        HashSet term3458 = new HashSet((Collection<? extends Object>) term14170);
        HashMap term3465 = new HashMap();
        Set<Object> term14171 =  ((Map) term3465).keySet();
        HashSet term3464 = new HashSet((Collection<? extends Object>) term14171);
        ArrayList term3470 = new ArrayList();
        term3406 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3407 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3416 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3453 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3407, term3407.getClass(), "defaults", null);
        setField(term3407, term3407.getClass(), "file", null);
        setField(term3407, term3407.getClass(), "basePath", null);
        setField(term3407, term3407.getClass(), "fileSeparator", "/");
        setBooleanField(term3407, term3407.getClass(), "isInitialized", false);
        setField(term3407, term3407.getClass(), "keysAsListed", term3412);
        setField(term3407, term3407.getClass(), "table", term3416);
        setIntField(term3407, term3407.getClass(), "count", 0);
        setIntField(term3407, term3407.getClass(), "threshold", 8);
        setFloatField(term3407, term3407.getClass(), "loadFactor", 0.75F);
        setIntField(term3407, term3407.getClass(), "modCount", 0);
        setField(term3407, term3407.getClass(), "keySet", null);
        setField(term3407, term3407.getClass(), "entrySet", null);
        setField(term3407, term3407.getClass(), "values", null);
        setField(term3406, term3406.getClass(), "defaults", term3407);
        setField(term3406, term3406.getClass(), "file", "wGmYcqUkgE");
        setField(term3406, term3406.getClass(), "basePath", "idgaQsnJpQ");
        setField(term3406, term3406.getClass(), "fileSeparator", "/");
        setBooleanField(term3406, term3406.getClass(), "isInitialized", false);
        setField(term3406, term3406.getClass(), "keysAsListed", term3449);
        setField(term3406, term3406.getClass(), "table", term3453);
        setIntField(term3406, term3406.getClass(), "count", -478195677);
        setIntField(term3406, term3406.getClass(), "threshold", 8);
        setFloatField(term3406, term3406.getClass(), "loadFactor", 0.75F);
        setIntField(term3406, term3406.getClass(), "modCount", 972867650);
        setField(term3406, term3406.getClass(), "keySet", term3458);
        setField(term3406, term3406.getClass(), "entrySet", term3464);
        setField(term3406, term3406.getClass(), "values", term3470);
        term3486 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3487 = (Object[]) newArray("java.lang.Object", 10);
        Object term3488 = newInstance(Class.forName("java.lang.Object"));
        setElement(term3487, 0, term3488);
        setField(term3486, term3486.getClass(), "elementData", term3487);
        setIntField(term3486, term3486.getClass(), "elementCount", 1);
        setIntField(term3486, term3486.getClass(), "capacityIncrement", 0);
        setIntField(term3486, term3486.getClass(), "modCount", 1);
        ArrayList term14125 = new ArrayList();
        ArrayList term14134 = new ArrayList();
        HashMap term14138 = new HashMap();
        Set<Object> term14204 =  ((Map) term14138).keySet();
        HashSet term14137 = new HashSet((Collection<? extends Object>) term14204);
        HashMap term14140 = new HashMap();
        Set<Object> term14205 =  ((Map) term14140).keySet();
        HashSet term14139 = new HashSet((Collection<? extends Object>) term14205);
        ArrayList term14141 = new ArrayList();
        term14121 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14122 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14127 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14136 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term14122, term14122.getClass(), "defaults", null);
        setField(term14122, term14122.getClass(), "file", null);
        setField(term14122, term14122.getClass(), "basePath", null);
        setField(term14122, term14122.getClass(), "fileSeparator", "/");
        setBooleanField(term14122, term14122.getClass(), "isInitialized", false);
        setField(term14122, term14122.getClass(), "keysAsListed", term14125);
        setField(term14122, term14122.getClass(), "table", term14127);
        setIntField(term14122, term14122.getClass(), "count", 0);
        setIntField(term14122, term14122.getClass(), "threshold", 8);
        setFloatField(term14122, term14122.getClass(), "loadFactor", 0.75F);
        setIntField(term14122, term14122.getClass(), "modCount", 0);
        setField(term14122, term14122.getClass(), "keySet", null);
        setField(term14122, term14122.getClass(), "entrySet", null);
        setField(term14122, term14122.getClass(), "values", null);
        setField(term14121, term14121.getClass(), "defaults", term14122);
        setField(term14121, term14121.getClass(), "file", "wGmYcqUkgE");
        setField(term14121, term14121.getClass(), "basePath", "idgaQsnJpQ");
        setField(term14121, term14121.getClass(), "fileSeparator", "/");
        setBooleanField(term14121, term14121.getClass(), "isInitialized", false);
        setField(term14121, term14121.getClass(), "keysAsListed", term14134);
        setField(term14121, term14121.getClass(), "table", term14136);
        setIntField(term14121, term14121.getClass(), "count", -478195677);
        setIntField(term14121, term14121.getClass(), "threshold", 8);
        setFloatField(term14121, term14121.getClass(), "loadFactor", 0.75F);
        setIntField(term14121, term14121.getClass(), "modCount", 972867650);
        setField(term14121, term14121.getClass(), "keySet", term14137);
        setField(term14121, term14121.getClass(), "entrySet", term14139);
        setField(term14121, term14121.getClass(), "values", term14141);
        term14145 = newInstance(Class.forName("java.util.Stack"));
        Object[] term14146 = (Object[]) newArray("java.lang.Object", 10);
        Object term14147 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14146, 0, term14147);
        setField(term14145, term14145.getClass(), "elementData", term14146);
        setIntField(term14145, term14145.getClass(), "elementCount", 1);
        setIntField(term14145, term14145.getClass(), "capacityIncrement", 0);
        setIntField(term14145, term14145.getClass(), "modCount", 1);
        term14047 = newInstance(Class.forName("java.util.Stack"));
        Object[] term14048 = (Object[]) newArray("java.lang.Object", 10);
        Object term14049 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14048, 0, term14049);
        setField(term14047, term14047.getClass(), "elementData", term14048);
        setIntField(term14047, term14047.getClass(), "elementCount", 1);
        setIntField(term14047, term14047.getClass(), "capacityIncrement", 0);
        setIntField(term14047, term14047.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Vector");
        Object[] args = new Object[2];
        args[0] = "VgZnGoIFwQ";
        args[1] = term3486;
        Object retValue = callMethod(klass, "getVector", argTypes, term3406, args);
        assertTrue(recursiveEquals(term3406, term14121));
        assertTrue(recursiveEquals(term3486, term14145));
        assertTrue(recursiveEquals(retValue, term14047));
    }

};


