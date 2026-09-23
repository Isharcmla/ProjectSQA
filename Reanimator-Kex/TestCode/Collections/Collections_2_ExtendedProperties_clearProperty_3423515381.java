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

public class ExtendedProperties_clearProperty_3423515381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2012;
     Object term11529;

    public ExtendedProperties_clearProperty_3423515381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2018 = new ArrayList();
        ArrayList term2055 = new ArrayList();
        HashMap term2073 = new HashMap();
        Set<Object> term11581 =  ((Map) term2073).keySet();
        HashSet term2072 = new HashSet((Collection<? extends Object>) term11581);
        HashMap term2079 = new HashMap();
        Set<Object> term11582 =  ((Map) term2079).keySet();
        HashSet term2078 = new HashSet((Collection<? extends Object>) term11582);
        ArrayList term2084 = new ArrayList();
        term2012 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2013 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2022 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2059 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2060 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2062 = newInstance(Class.forName("java.lang.Object"));
        Object term2063 = newInstance(Class.forName("java.lang.Object"));
        Object term2064 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2066 = newInstance(Class.forName("java.lang.Object"));
        Object term2067 = newInstance(Class.forName("java.lang.Object"));
        setField(term2013, term2013.getClass(), "defaults", null);
        setField(term2013, term2013.getClass(), "file", null);
        setField(term2013, term2013.getClass(), "basePath", null);
        setField(term2013, term2013.getClass(), "fileSeparator", "/");
        setBooleanField(term2013, term2013.getClass(), "isInitialized", false);
        setField(term2013, term2013.getClass(), "keysAsListed", term2018);
        setField(term2013, term2013.getClass(), "table", term2022);
        setIntField(term2013, term2013.getClass(), "count", 0);
        setIntField(term2013, term2013.getClass(), "threshold", 8);
        setFloatField(term2013, term2013.getClass(), "loadFactor", 0.75F);
        setIntField(term2013, term2013.getClass(), "modCount", 0);
        setField(term2013, term2013.getClass(), "keySet", null);
        setField(term2013, term2013.getClass(), "entrySet", null);
        setField(term2013, term2013.getClass(), "values", null);
        setField(term2012, term2012.getClass(), "defaults", term2013);
        setField(term2012, term2012.getClass(), "file", "LvtrsXUliU");
        setField(term2012, term2012.getClass(), "basePath", "xLbjWUgOIL");
        setField(term2012, term2012.getClass(), "fileSeparator", "/");
        setBooleanField(term2012, term2012.getClass(), "isInitialized", false);
        setField(term2012, term2012.getClass(), "keysAsListed", term2055);
        setIntField(term2060, term2060.getClass(), "hash", 396608070);
        setField(term2060, term2060.getClass(), "key", term2062);
        setField(term2060, term2060.getClass(), "value", term2063);
        setField(term2060, term2060.getClass(), "next", null);
        setElement(term2059, 1, term2060);
        setIntField(term2064, term2064.getClass(), "hash", 1477315787);
        setField(term2064, term2064.getClass(), "key", term2066);
        setField(term2064, term2064.getClass(), "value", term2067);
        setField(term2064, term2064.getClass(), "next", null);
        setElement(term2059, 2, term2064);
        setField(term2012, term2012.getClass(), "table", term2059);
        setIntField(term2012, term2012.getClass(), "count", -1016503457);
        setIntField(term2012, term2012.getClass(), "threshold", 8);
        setFloatField(term2012, term2012.getClass(), "loadFactor", 0.75F);
        setIntField(term2012, term2012.getClass(), "modCount", -1968847289);
        setField(term2012, term2012.getClass(), "keySet", term2072);
        setField(term2012, term2012.getClass(), "entrySet", term2078);
        setField(term2012, term2012.getClass(), "values", term2084);
        ArrayList term11533 = new ArrayList();
        ArrayList term11542 = new ArrayList();
        HashMap term11552 = new HashMap();
        Set<Object> term11615 =  ((Map) term11552).keySet();
        HashSet term11551 = new HashSet((Collection<? extends Object>) term11615);
        HashMap term11554 = new HashMap();
        Set<Object> term11616 =  ((Map) term11554).keySet();
        HashSet term11553 = new HashSet((Collection<? extends Object>) term11616);
        ArrayList term11555 = new ArrayList();
        term11529 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term11530 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term11535 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term11544 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term11545 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11546 = newInstance(Class.forName("java.lang.Object"));
        Object term11547 = newInstance(Class.forName("java.lang.Object"));
        Object term11548 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11549 = newInstance(Class.forName("java.lang.Object"));
        Object term11550 = newInstance(Class.forName("java.lang.Object"));
        setField(term11530, term11530.getClass(), "defaults", null);
        setField(term11530, term11530.getClass(), "file", null);
        setField(term11530, term11530.getClass(), "basePath", null);
        setField(term11530, term11530.getClass(), "fileSeparator", "/");
        setBooleanField(term11530, term11530.getClass(), "isInitialized", false);
        setField(term11530, term11530.getClass(), "keysAsListed", term11533);
        setField(term11530, term11530.getClass(), "table", term11535);
        setIntField(term11530, term11530.getClass(), "count", 0);
        setIntField(term11530, term11530.getClass(), "threshold", 8);
        setFloatField(term11530, term11530.getClass(), "loadFactor", 0.75F);
        setIntField(term11530, term11530.getClass(), "modCount", 0);
        setField(term11530, term11530.getClass(), "keySet", null);
        setField(term11530, term11530.getClass(), "entrySet", null);
        setField(term11530, term11530.getClass(), "values", null);
        setField(term11529, term11529.getClass(), "defaults", term11530);
        setField(term11529, term11529.getClass(), "file", "LvtrsXUliU");
        setField(term11529, term11529.getClass(), "basePath", "xLbjWUgOIL");
        setField(term11529, term11529.getClass(), "fileSeparator", "/");
        setBooleanField(term11529, term11529.getClass(), "isInitialized", false);
        setField(term11529, term11529.getClass(), "keysAsListed", term11542);
        setIntField(term11545, term11545.getClass(), "hash", 396608070);
        setField(term11545, term11545.getClass(), "key", term11546);
        setField(term11545, term11545.getClass(), "value", term11547);
        setField(term11545, term11545.getClass(), "next", null);
        setElement(term11544, 1, term11545);
        setIntField(term11548, term11548.getClass(), "hash", 1477315787);
        setField(term11548, term11548.getClass(), "key", term11549);
        setField(term11548, term11548.getClass(), "value", term11550);
        setField(term11548, term11548.getClass(), "next", null);
        setElement(term11544, 2, term11548);
        setField(term11529, term11529.getClass(), "table", term11544);
        setIntField(term11529, term11529.getClass(), "count", -1016503457);
        setIntField(term11529, term11529.getClass(), "threshold", 8);
        setFloatField(term11529, term11529.getClass(), "loadFactor", 0.75F);
        setIntField(term11529, term11529.getClass(), "modCount", -1968847289);
        setField(term11529, term11529.getClass(), "keySet", term11551);
        setField(term11529, term11529.getClass(), "entrySet", term11553);
        setField(term11529, term11529.getClass(), "values", term11555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "clearProperty", argTypes, term2012, args);
        assertTrue(recursiveEquals(term2012, term11529));
    }

};


