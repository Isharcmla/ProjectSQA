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

public class ExtendedProperties_getByte_1980504735102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15846;

    public ExtendedProperties_getByte_1980504735102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15852 = new ArrayList();
        ArrayList term15901 = new ArrayList();
        HashMap term15911 = new HashMap();
        Set<Object> term55683 =  ((Map) term15911).keySet();
        HashSet term15910 = new HashSet((Collection<? extends Object>) term55683);
        HashMap term15917 = new HashMap();
        Set<Object> term55684 =  ((Map) term15917).keySet();
        HashSet term15916 = new HashSet((Collection<? extends Object>) term55684);
        ArrayList term15922 = new ArrayList();
        term15846 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15847 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15856 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15905 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term15847, term15847.getClass(), "defaults", null);
        setField(term15847, term15847.getClass(), "file", null);
        setField(term15847, term15847.getClass(), "basePath", null);
        setField(term15847, term15847.getClass(), "fileSeparator", "/");
        setBooleanField(term15847, term15847.getClass(), "isInitialized", false);
        setField(term15847, term15847.getClass(), "includePropertyName", null);
        setField(term15847, term15847.getClass(), "keysAsListed", term15852);
        setField(term15847, term15847.getClass(), "table", term15856);
        setIntField(term15847, term15847.getClass(), "count", 0);
        setIntField(term15847, term15847.getClass(), "threshold", 8);
        setFloatField(term15847, term15847.getClass(), "loadFactor", 0.75F);
        setIntField(term15847, term15847.getClass(), "modCount", 0);
        setField(term15847, term15847.getClass(), "keySet", null);
        setField(term15847, term15847.getClass(), "entrySet", null);
        setField(term15847, term15847.getClass(), "values", null);
        setField(term15846, term15846.getClass(), "defaults", term15847);
        setField(term15846, term15846.getClass(), "file", "EYtfuJaxiM");
        setField(term15846, term15846.getClass(), "basePath", "gCWtLVKVVe");
        setField(term15846, term15846.getClass(), "fileSeparator", "/");
        setBooleanField(term15846, term15846.getClass(), "isInitialized", false);
        setField(term15846, term15846.getClass(), "includePropertyName", "fWKJoSoCwE");
        setField(term15846, term15846.getClass(), "keysAsListed", term15901);
        setField(term15846, term15846.getClass(), "table", term15905);
        setIntField(term15846, term15846.getClass(), "count", -1347665717);
        setIntField(term15846, term15846.getClass(), "threshold", 8);
        setFloatField(term15846, term15846.getClass(), "loadFactor", 0.75F);
        setIntField(term15846, term15846.getClass(), "modCount", -1888585309);
        setField(term15846, term15846.getClass(), "keySet", term15910);
        setField(term15846, term15846.getClass(), "entrySet", term15916);
        setField(term15846, term15846.getClass(), "values", term15922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        try {
            callMethod(klass, "getByte", argTypes, term15846, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


