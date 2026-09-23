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
import java.util.NoSuchElementException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getLong_2037583029111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6751;

    public ExtendedProperties_getLong_2037583029111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6757 = new ArrayList();
        ArrayList term6806 = new ArrayList();
        HashMap term6820 = new HashMap();
        Set<Object> term23296 =  ((Map) term6820).keySet();
        HashSet term6819 = new HashSet((Collection<? extends Object>) term23296);
        HashMap term6826 = new HashMap();
        Set<Object> term23297 =  ((Map) term6826).keySet();
        HashSet term6825 = new HashSet((Collection<? extends Object>) term23297);
        ArrayList term6831 = new ArrayList();
        term6751 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6752 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6761 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6810 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6811 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6813 = newInstance(Class.forName("java.lang.Object"));
        Object term6814 = newInstance(Class.forName("java.lang.Object"));
        setField(term6752, term6752.getClass(), "defaults", null);
        setField(term6752, term6752.getClass(), "file", null);
        setField(term6752, term6752.getClass(), "basePath", null);
        setField(term6752, term6752.getClass(), "fileSeparator", "/");
        setBooleanField(term6752, term6752.getClass(), "isInitialized", false);
        setField(term6752, term6752.getClass(), "includePropertyName", null);
        setField(term6752, term6752.getClass(), "keysAsListed", term6757);
        setField(term6752, term6752.getClass(), "table", term6761);
        setIntField(term6752, term6752.getClass(), "count", 0);
        setIntField(term6752, term6752.getClass(), "threshold", 8);
        setFloatField(term6752, term6752.getClass(), "loadFactor", 0.75F);
        setIntField(term6752, term6752.getClass(), "modCount", 0);
        setField(term6752, term6752.getClass(), "keySet", null);
        setField(term6752, term6752.getClass(), "entrySet", null);
        setField(term6752, term6752.getClass(), "values", null);
        setField(term6751, term6751.getClass(), "defaults", term6752);
        setField(term6751, term6751.getClass(), "file", "JmcmxoGhIK");
        setField(term6751, term6751.getClass(), "basePath", "jXzmYyrnnT");
        setField(term6751, term6751.getClass(), "fileSeparator", "/");
        setBooleanField(term6751, term6751.getClass(), "isInitialized", true);
        setField(term6751, term6751.getClass(), "includePropertyName", "igCAtimmYB");
        setField(term6751, term6751.getClass(), "keysAsListed", term6806);
        setIntField(term6811, term6811.getClass(), "hash", 1976012806);
        setField(term6811, term6811.getClass(), "key", term6813);
        setField(term6811, term6811.getClass(), "value", term6814);
        setField(term6811, term6811.getClass(), "next", null);
        setElement(term6810, 9, term6811);
        setField(term6751, term6751.getClass(), "table", term6810);
        setIntField(term6751, term6751.getClass(), "count", -1963464808);
        setIntField(term6751, term6751.getClass(), "threshold", 8);
        setFloatField(term6751, term6751.getClass(), "loadFactor", 0.75F);
        setIntField(term6751, term6751.getClass(), "modCount", 71190298);
        setField(term6751, term6751.getClass(), "keySet", term6819);
        setField(term6751, term6751.getClass(), "entrySet", term6825);
        setField(term6751, term6751.getClass(), "values", term6831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DyiXbeYIaN";
        try {
            callMethod(klass, "getLong", argTypes, term6751, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


