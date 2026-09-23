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

public class ExtendedProperties_subset_48317865887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9388;
     Object term44452;

    public ExtendedProperties_subset_48317865887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9394 = new ArrayList();
        ArrayList term9443 = new ArrayList();
        HashMap term9453 = new HashMap();
        Set<Object> term44510 =  ((Map) term9453).keySet();
        HashSet term9452 = new HashSet((Collection<? extends Object>) term44510);
        HashMap term9459 = new HashMap();
        Set<Object> term44511 =  ((Map) term9459).keySet();
        HashSet term9458 = new HashSet((Collection<? extends Object>) term44511);
        ArrayList term9464 = new ArrayList();
        term9388 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term9389 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term9398 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term9447 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term9389, term9389.getClass(), "defaults", null);
        setField(term9389, term9389.getClass(), "file", null);
        setField(term9389, term9389.getClass(), "basePath", null);
        setField(term9389, term9389.getClass(), "fileSeparator", "/");
        setBooleanField(term9389, term9389.getClass(), "isInitialized", false);
        setField(term9389, term9389.getClass(), "includePropertyName", null);
        setField(term9389, term9389.getClass(), "keysAsListed", term9394);
        setField(term9389, term9389.getClass(), "table", term9398);
        setIntField(term9389, term9389.getClass(), "count", 0);
        setIntField(term9389, term9389.getClass(), "threshold", 8);
        setFloatField(term9389, term9389.getClass(), "loadFactor", 0.75F);
        setIntField(term9389, term9389.getClass(), "modCount", 0);
        setField(term9389, term9389.getClass(), "keySet", null);
        setField(term9389, term9389.getClass(), "entrySet", null);
        setField(term9389, term9389.getClass(), "values", null);
        setField(term9388, term9388.getClass(), "defaults", term9389);
        setField(term9388, term9388.getClass(), "file", "KoyGrUJeJW");
        setField(term9388, term9388.getClass(), "basePath", "HqBOwkVqjD");
        setField(term9388, term9388.getClass(), "fileSeparator", "/");
        setBooleanField(term9388, term9388.getClass(), "isInitialized", false);
        setField(term9388, term9388.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term9388, term9388.getClass(), "keysAsListed", term9443);
        setField(term9388, term9388.getClass(), "table", term9447);
        setIntField(term9388, term9388.getClass(), "count", 292681826);
        setIntField(term9388, term9388.getClass(), "threshold", 8);
        setFloatField(term9388, term9388.getClass(), "loadFactor", 0.75F);
        setIntField(term9388, term9388.getClass(), "modCount", 458147407);
        setField(term9388, term9388.getClass(), "keySet", term9452);
        setField(term9388, term9388.getClass(), "entrySet", term9458);
        setField(term9388, term9388.getClass(), "values", term9464);
        ArrayList term44456 = new ArrayList();
        ArrayList term44467 = new ArrayList();
        HashMap term44471 = new HashMap();
        Set<Object> term44554 =  ((Map) term44471).keySet();
        HashSet term44470 = new HashSet((Collection<? extends Object>) term44554);
        HashMap term44473 = new HashMap();
        Set<Object> term44555 =  ((Map) term44473).keySet();
        HashSet term44472 = new HashSet((Collection<? extends Object>) term44555);
        ArrayList term44474 = new ArrayList();
        term44452 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term44453 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term44458 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term44469 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term44453, term44453.getClass(), "defaults", null);
        setField(term44453, term44453.getClass(), "file", null);
        setField(term44453, term44453.getClass(), "basePath", null);
        setField(term44453, term44453.getClass(), "fileSeparator", "/");
        setBooleanField(term44453, term44453.getClass(), "isInitialized", false);
        setField(term44453, term44453.getClass(), "includePropertyName", null);
        setField(term44453, term44453.getClass(), "keysAsListed", term44456);
        setField(term44453, term44453.getClass(), "table", term44458);
        setIntField(term44453, term44453.getClass(), "count", 0);
        setIntField(term44453, term44453.getClass(), "threshold", 8);
        setFloatField(term44453, term44453.getClass(), "loadFactor", 0.75F);
        setIntField(term44453, term44453.getClass(), "modCount", 0);
        setField(term44453, term44453.getClass(), "keySet", null);
        setField(term44453, term44453.getClass(), "entrySet", null);
        setField(term44453, term44453.getClass(), "values", null);
        setField(term44452, term44452.getClass(), "defaults", term44453);
        setField(term44452, term44452.getClass(), "file", "KoyGrUJeJW");
        setField(term44452, term44452.getClass(), "basePath", "HqBOwkVqjD");
        setField(term44452, term44452.getClass(), "fileSeparator", "/");
        setBooleanField(term44452, term44452.getClass(), "isInitialized", false);
        setField(term44452, term44452.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term44452, term44452.getClass(), "keysAsListed", term44467);
        setField(term44452, term44452.getClass(), "table", term44469);
        setIntField(term44452, term44452.getClass(), "count", 292681826);
        setIntField(term44452, term44452.getClass(), "threshold", 8);
        setFloatField(term44452, term44452.getClass(), "loadFactor", 0.75F);
        setIntField(term44452, term44452.getClass(), "modCount", 458147407);
        setField(term44452, term44452.getClass(), "keySet", term44470);
        setField(term44452, term44452.getClass(), "entrySet", term44472);
        setField(term44452, term44452.getClass(), "values", term44474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "subset", argTypes, term9388, args);
        assertTrue(recursiveEquals(term9388, term44452));
        assertTrue(recursiveEquals(retValue, null));
    }

};


