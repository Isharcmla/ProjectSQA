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

public class ExtendedProperties_testBoolean_199146257299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4887;
     Object term18594;

    public ExtendedProperties_testBoolean_199146257299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4893 = new ArrayList();
        ArrayList term4942 = new ArrayList();
        HashMap term4960 = new HashMap();
        Set<Object> term18658 =  ((Map) term4960).keySet();
        HashSet term4959 = new HashSet((Collection<? extends Object>) term18658);
        HashMap term4966 = new HashMap();
        Set<Object> term18659 =  ((Map) term4966).keySet();
        HashSet term4965 = new HashSet((Collection<? extends Object>) term18659);
        ArrayList term4971 = new ArrayList();
        term4887 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4888 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4897 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4946 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4947 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4949 = newInstance(Class.forName("java.lang.Object"));
        Object term4950 = newInstance(Class.forName("java.lang.Object"));
        Object term4951 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4953 = newInstance(Class.forName("java.lang.Object"));
        Object term4954 = newInstance(Class.forName("java.lang.Object"));
        setField(term4888, term4888.getClass(), "defaults", null);
        setField(term4888, term4888.getClass(), "file", null);
        setField(term4888, term4888.getClass(), "basePath", null);
        setField(term4888, term4888.getClass(), "fileSeparator", "/");
        setBooleanField(term4888, term4888.getClass(), "isInitialized", false);
        setField(term4888, term4888.getClass(), "includePropertyName", null);
        setField(term4888, term4888.getClass(), "keysAsListed", term4893);
        setField(term4888, term4888.getClass(), "table", term4897);
        setIntField(term4888, term4888.getClass(), "count", 0);
        setIntField(term4888, term4888.getClass(), "threshold", 8);
        setFloatField(term4888, term4888.getClass(), "loadFactor", 0.75F);
        setIntField(term4888, term4888.getClass(), "modCount", 0);
        setField(term4888, term4888.getClass(), "keySet", null);
        setField(term4888, term4888.getClass(), "entrySet", null);
        setField(term4888, term4888.getClass(), "values", null);
        setField(term4887, term4887.getClass(), "defaults", term4888);
        setField(term4887, term4887.getClass(), "file", "SdCKLMIYnX");
        setField(term4887, term4887.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term4887, term4887.getClass(), "fileSeparator", "/");
        setBooleanField(term4887, term4887.getClass(), "isInitialized", true);
        setField(term4887, term4887.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term4887, term4887.getClass(), "keysAsListed", term4942);
        setIntField(term4947, term4947.getClass(), "hash", 1038849274);
        setField(term4947, term4947.getClass(), "key", term4949);
        setField(term4947, term4947.getClass(), "value", term4950);
        setField(term4947, term4947.getClass(), "next", null);
        setElement(term4946, 1, term4947);
        setIntField(term4951, term4951.getClass(), "hash", 1289934258);
        setField(term4951, term4951.getClass(), "key", term4953);
        setField(term4951, term4951.getClass(), "value", term4954);
        setField(term4951, term4951.getClass(), "next", null);
        setElement(term4946, 8, term4951);
        setField(term4887, term4887.getClass(), "table", term4946);
        setIntField(term4887, term4887.getClass(), "count", -1263114717);
        setIntField(term4887, term4887.getClass(), "threshold", 8);
        setFloatField(term4887, term4887.getClass(), "loadFactor", 0.75F);
        setIntField(term4887, term4887.getClass(), "modCount", -894662984);
        setField(term4887, term4887.getClass(), "keySet", term4959);
        setField(term4887, term4887.getClass(), "entrySet", term4965);
        setField(term4887, term4887.getClass(), "values", term4971);
        ArrayList term18598 = new ArrayList();
        ArrayList term18609 = new ArrayList();
        HashMap term18619 = new HashMap();
        Set<Object> term18702 =  ((Map) term18619).keySet();
        HashSet term18618 = new HashSet((Collection<? extends Object>) term18702);
        HashMap term18621 = new HashMap();
        Set<Object> term18703 =  ((Map) term18621).keySet();
        HashSet term18620 = new HashSet((Collection<? extends Object>) term18703);
        ArrayList term18622 = new ArrayList();
        term18594 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term18595 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term18600 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term18611 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term18612 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18613 = newInstance(Class.forName("java.lang.Object"));
        Object term18614 = newInstance(Class.forName("java.lang.Object"));
        Object term18615 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18616 = newInstance(Class.forName("java.lang.Object"));
        Object term18617 = newInstance(Class.forName("java.lang.Object"));
        setField(term18595, term18595.getClass(), "defaults", null);
        setField(term18595, term18595.getClass(), "file", null);
        setField(term18595, term18595.getClass(), "basePath", null);
        setField(term18595, term18595.getClass(), "fileSeparator", "/");
        setBooleanField(term18595, term18595.getClass(), "isInitialized", false);
        setField(term18595, term18595.getClass(), "includePropertyName", null);
        setField(term18595, term18595.getClass(), "keysAsListed", term18598);
        setField(term18595, term18595.getClass(), "table", term18600);
        setIntField(term18595, term18595.getClass(), "count", 0);
        setIntField(term18595, term18595.getClass(), "threshold", 8);
        setFloatField(term18595, term18595.getClass(), "loadFactor", 0.75F);
        setIntField(term18595, term18595.getClass(), "modCount", 0);
        setField(term18595, term18595.getClass(), "keySet", null);
        setField(term18595, term18595.getClass(), "entrySet", null);
        setField(term18595, term18595.getClass(), "values", null);
        setField(term18594, term18594.getClass(), "defaults", term18595);
        setField(term18594, term18594.getClass(), "file", "SdCKLMIYnX");
        setField(term18594, term18594.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term18594, term18594.getClass(), "fileSeparator", "/");
        setBooleanField(term18594, term18594.getClass(), "isInitialized", true);
        setField(term18594, term18594.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term18594, term18594.getClass(), "keysAsListed", term18609);
        setIntField(term18612, term18612.getClass(), "hash", 1038849274);
        setField(term18612, term18612.getClass(), "key", term18613);
        setField(term18612, term18612.getClass(), "value", term18614);
        setField(term18612, term18612.getClass(), "next", null);
        setElement(term18611, 1, term18612);
        setIntField(term18615, term18615.getClass(), "hash", 1289934258);
        setField(term18615, term18615.getClass(), "key", term18616);
        setField(term18615, term18615.getClass(), "value", term18617);
        setField(term18615, term18615.getClass(), "next", null);
        setElement(term18611, 8, term18615);
        setField(term18594, term18594.getClass(), "table", term18611);
        setIntField(term18594, term18594.getClass(), "count", -1263114717);
        setIntField(term18594, term18594.getClass(), "threshold", 8);
        setFloatField(term18594, term18594.getClass(), "loadFactor", 0.75F);
        setIntField(term18594, term18594.getClass(), "modCount", -894662984);
        setField(term18594, term18594.getClass(), "keySet", term18618);
        setField(term18594, term18594.getClass(), "entrySet", term18620);
        setField(term18594, term18594.getClass(), "values", term18622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term4887, args);
        assertTrue(recursiveEquals(term4887, term18594));
        assertTrue(recursiveEquals(retValue, null));
    }

};


