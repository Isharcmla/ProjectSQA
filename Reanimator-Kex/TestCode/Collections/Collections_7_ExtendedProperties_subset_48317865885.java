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

public class ExtendedProperties_subset_48317865885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2776;
     Object term14513;

    public ExtendedProperties_subset_48317865885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2782 = new ArrayList();
        ArrayList term2831 = new ArrayList();
        HashMap term2841 = new HashMap();
        Set<Object> term14571 =  ((Map) term2841).keySet();
        HashSet term2840 = new HashSet((Collection<? extends Object>) term14571);
        HashMap term2847 = new HashMap();
        Set<Object> term14572 =  ((Map) term2847).keySet();
        HashSet term2846 = new HashSet((Collection<? extends Object>) term14572);
        ArrayList term2852 = new ArrayList();
        term2776 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2777 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2786 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2835 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term2777, term2777.getClass(), "defaults", null);
        setField(term2777, term2777.getClass(), "file", null);
        setField(term2777, term2777.getClass(), "basePath", null);
        setField(term2777, term2777.getClass(), "fileSeparator", "/");
        setBooleanField(term2777, term2777.getClass(), "isInitialized", false);
        setField(term2777, term2777.getClass(), "includePropertyName", null);
        setField(term2777, term2777.getClass(), "keysAsListed", term2782);
        setField(term2777, term2777.getClass(), "table", term2786);
        setIntField(term2777, term2777.getClass(), "count", 0);
        setIntField(term2777, term2777.getClass(), "threshold", 8);
        setFloatField(term2777, term2777.getClass(), "loadFactor", 0.75F);
        setIntField(term2777, term2777.getClass(), "modCount", 0);
        setField(term2777, term2777.getClass(), "keySet", null);
        setField(term2777, term2777.getClass(), "entrySet", null);
        setField(term2777, term2777.getClass(), "values", null);
        setField(term2776, term2776.getClass(), "defaults", term2777);
        setField(term2776, term2776.getClass(), "file", "KoyGrUJeJW");
        setField(term2776, term2776.getClass(), "basePath", "HqBOwkVqjD");
        setField(term2776, term2776.getClass(), "fileSeparator", "/");
        setBooleanField(term2776, term2776.getClass(), "isInitialized", false);
        setField(term2776, term2776.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term2776, term2776.getClass(), "keysAsListed", term2831);
        setField(term2776, term2776.getClass(), "table", term2835);
        setIntField(term2776, term2776.getClass(), "count", 292681826);
        setIntField(term2776, term2776.getClass(), "threshold", 8);
        setFloatField(term2776, term2776.getClass(), "loadFactor", 0.75F);
        setIntField(term2776, term2776.getClass(), "modCount", 458147407);
        setField(term2776, term2776.getClass(), "keySet", term2840);
        setField(term2776, term2776.getClass(), "entrySet", term2846);
        setField(term2776, term2776.getClass(), "values", term2852);
        ArrayList term14517 = new ArrayList();
        ArrayList term14528 = new ArrayList();
        HashMap term14532 = new HashMap();
        Set<Object> term14615 =  ((Map) term14532).keySet();
        HashSet term14531 = new HashSet((Collection<? extends Object>) term14615);
        HashMap term14534 = new HashMap();
        Set<Object> term14616 =  ((Map) term14534).keySet();
        HashSet term14533 = new HashSet((Collection<? extends Object>) term14616);
        ArrayList term14535 = new ArrayList();
        term14513 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14514 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14519 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14530 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term14514, term14514.getClass(), "defaults", null);
        setField(term14514, term14514.getClass(), "file", null);
        setField(term14514, term14514.getClass(), "basePath", null);
        setField(term14514, term14514.getClass(), "fileSeparator", "/");
        setBooleanField(term14514, term14514.getClass(), "isInitialized", false);
        setField(term14514, term14514.getClass(), "includePropertyName", null);
        setField(term14514, term14514.getClass(), "keysAsListed", term14517);
        setField(term14514, term14514.getClass(), "table", term14519);
        setIntField(term14514, term14514.getClass(), "count", 0);
        setIntField(term14514, term14514.getClass(), "threshold", 8);
        setFloatField(term14514, term14514.getClass(), "loadFactor", 0.75F);
        setIntField(term14514, term14514.getClass(), "modCount", 0);
        setField(term14514, term14514.getClass(), "keySet", null);
        setField(term14514, term14514.getClass(), "entrySet", null);
        setField(term14514, term14514.getClass(), "values", null);
        setField(term14513, term14513.getClass(), "defaults", term14514);
        setField(term14513, term14513.getClass(), "file", "KoyGrUJeJW");
        setField(term14513, term14513.getClass(), "basePath", "HqBOwkVqjD");
        setField(term14513, term14513.getClass(), "fileSeparator", "/");
        setBooleanField(term14513, term14513.getClass(), "isInitialized", false);
        setField(term14513, term14513.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term14513, term14513.getClass(), "keysAsListed", term14528);
        setField(term14513, term14513.getClass(), "table", term14530);
        setIntField(term14513, term14513.getClass(), "count", 292681826);
        setIntField(term14513, term14513.getClass(), "threshold", 8);
        setFloatField(term14513, term14513.getClass(), "loadFactor", 0.75F);
        setIntField(term14513, term14513.getClass(), "modCount", 458147407);
        setField(term14513, term14513.getClass(), "keySet", term14531);
        setField(term14513, term14513.getClass(), "entrySet", term14533);
        setField(term14513, term14513.getClass(), "values", term14535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "subset", argTypes, term2776, args);
        assertTrue(recursiveEquals(term2776, term14513));
        assertTrue(recursiveEquals(retValue, null));
    }

};


