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

public class ExtendedProperties_getLong_2037583029113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22834;

    public ExtendedProperties_getLong_2037583029113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22840 = new ArrayList();
        ArrayList term22889 = new ArrayList();
        ((ArrayList) term22889).add("java.lang.Object@7a0dc037");
        HashMap term22956 = new HashMap();
        Set<Object> term67884 =  ((Map) term22956).keySet();
        HashSet term22955 = new HashSet((Collection<? extends Object>) term67884);
        HashMap term22962 = new HashMap();
        Set<Object> term67885 =  ((Map) term22962).keySet();
        HashSet term22961 = new HashSet((Collection<? extends Object>) term67885);
        ArrayList term22967 = new ArrayList();
        term22834 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term22835 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term22844 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term22920 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term22921 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term22950 = newInstance(Class.forName("java.lang.Object"));
        setField(term22835, term22835.getClass(), "defaults", null);
        setField(term22835, term22835.getClass(), "file", null);
        setField(term22835, term22835.getClass(), "basePath", null);
        setField(term22835, term22835.getClass(), "fileSeparator", "/");
        setBooleanField(term22835, term22835.getClass(), "isInitialized", false);
        setField(term22835, term22835.getClass(), "includePropertyName", null);
        setField(term22835, term22835.getClass(), "keysAsListed", term22840);
        setField(term22835, term22835.getClass(), "table", term22844);
        setIntField(term22835, term22835.getClass(), "count", 0);
        setIntField(term22835, term22835.getClass(), "threshold", 8);
        setFloatField(term22835, term22835.getClass(), "loadFactor", 0.75F);
        setIntField(term22835, term22835.getClass(), "modCount", 0);
        setField(term22835, term22835.getClass(), "keySet", null);
        setField(term22835, term22835.getClass(), "entrySet", null);
        setField(term22835, term22835.getClass(), "values", null);
        setField(term22834, term22834.getClass(), "defaults", term22835);
        setField(term22834, term22834.getClass(), "file", "JmcmxoGhIK");
        setField(term22834, term22834.getClass(), "basePath", "jXzmYyrnnT");
        setField(term22834, term22834.getClass(), "fileSeparator", "/");
        setBooleanField(term22834, term22834.getClass(), "isInitialized", true);
        setField(term22834, term22834.getClass(), "includePropertyName", "igCAtimmYB");
        setField(term22834, term22834.getClass(), "keysAsListed", term22889);
        setIntField(term22921, term22921.getClass(), "hash", -928318692);
        setField(term22921, term22921.getClass(), "key", "java.lang.Object@7a0dc037");
        setField(term22921, term22921.getClass(), "value", term22950);
        setField(term22921, term22921.getClass(), "next", null);
        setElement(term22920, 9, term22921);
        setField(term22834, term22834.getClass(), "table", term22920);
        setIntField(term22834, term22834.getClass(), "count", -1963464808);
        setIntField(term22834, term22834.getClass(), "threshold", 8);
        setFloatField(term22834, term22834.getClass(), "loadFactor", 0.75F);
        setIntField(term22834, term22834.getClass(), "modCount", 71190298);
        setField(term22834, term22834.getClass(), "keySet", term22955);
        setField(term22834, term22834.getClass(), "entrySet", term22961);
        setField(term22834, term22834.getClass(), "values", term22967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DyiXbeYIaN";
        try {
            callMethod(klass, "getLong", argTypes, term22834, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


