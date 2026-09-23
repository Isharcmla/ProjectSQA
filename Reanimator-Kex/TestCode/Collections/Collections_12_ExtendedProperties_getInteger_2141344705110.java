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

public class ExtendedProperties_getInteger_2141344705110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20415;

    public ExtendedProperties_getInteger_2141344705110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20421 = new ArrayList();
        ArrayList term20470 = new ArrayList();
        ((ArrayList) term20470).add("java.lang.Object@3a7eaa17");
        ((ArrayList) term20470).add("java.lang.Object@b457fb9");
        ((ArrayList) term20470).add("java.lang.Object@2c499862");
        HashMap term20649 = new HashMap();
        Set<Object> term64883 =  ((Map) term20649).keySet();
        HashSet term20648 = new HashSet((Collection<? extends Object>) term64883);
        HashMap term20655 = new HashMap();
        Set<Object> term64884 =  ((Map) term20655).keySet();
        HashSet term20654 = new HashSet((Collection<? extends Object>) term64884);
        ArrayList term20660 = new ArrayList();
        term20415 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term20416 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term20425 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20554 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term20555 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20584 = newInstance(Class.forName("java.lang.Object"));
        Object term20585 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20613 = newInstance(Class.forName("java.lang.Object"));
        Object term20614 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20643 = newInstance(Class.forName("java.lang.Object"));
        setField(term20416, term20416.getClass(), "defaults", null);
        setField(term20416, term20416.getClass(), "file", null);
        setField(term20416, term20416.getClass(), "basePath", null);
        setField(term20416, term20416.getClass(), "fileSeparator", "/");
        setBooleanField(term20416, term20416.getClass(), "isInitialized", false);
        setField(term20416, term20416.getClass(), "includePropertyName", null);
        setField(term20416, term20416.getClass(), "keysAsListed", term20421);
        setField(term20416, term20416.getClass(), "table", term20425);
        setIntField(term20416, term20416.getClass(), "count", 0);
        setIntField(term20416, term20416.getClass(), "threshold", 8);
        setFloatField(term20416, term20416.getClass(), "loadFactor", 0.75F);
        setIntField(term20416, term20416.getClass(), "modCount", 0);
        setField(term20416, term20416.getClass(), "keySet", null);
        setField(term20416, term20416.getClass(), "entrySet", null);
        setField(term20416, term20416.getClass(), "values", null);
        setField(term20415, term20415.getClass(), "defaults", term20416);
        setField(term20415, term20415.getClass(), "file", "PapWxkhEWe");
        setField(term20415, term20415.getClass(), "basePath", "smnHEqRFRx");
        setField(term20415, term20415.getClass(), "fileSeparator", "/");
        setBooleanField(term20415, term20415.getClass(), "isInitialized", true);
        setField(term20415, term20415.getClass(), "includePropertyName", "XYtryyobou");
        setField(term20415, term20415.getClass(), "keysAsListed", term20470);
        setIntField(term20555, term20555.getClass(), "hash", 891689583);
        setField(term20555, term20555.getClass(), "key", "java.lang.Object@3a7eaa17");
        setField(term20555, term20555.getClass(), "value", term20584);
        setField(term20555, term20555.getClass(), "next", null);
        setElement(term20554, 13, term20555);
        setIntField(term20585, term20585.getClass(), "hash", -698644836);
        setField(term20585, term20585.getClass(), "key", "java.lang.Object@b457fb9");
        setField(term20585, term20585.getClass(), "value", term20613);
        setField(term20585, term20585.getClass(), "next", null);
        setElement(term20554, 82, term20585);
        setIntField(term20614, term20614.getClass(), "hash", 796133342);
        setField(term20614, term20614.getClass(), "key", "java.lang.Object@2c499862");
        setField(term20614, term20614.getClass(), "value", term20643);
        setField(term20614, term20614.getClass(), "next", null);
        setElement(term20554, 92, term20614);
        setField(term20415, term20415.getClass(), "table", term20554);
        setIntField(term20415, term20415.getClass(), "count", 53410916);
        setIntField(term20415, term20415.getClass(), "threshold", 71);
        setFloatField(term20415, term20415.getClass(), "loadFactor", 0.75F);
        setIntField(term20415, term20415.getClass(), "modCount", -375014952);
        setField(term20415, term20415.getClass(), "keySet", term20648);
        setField(term20415, term20415.getClass(), "entrySet", term20654);
        setField(term20415, term20415.getClass(), "values", term20660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OYbzXylRWW";
        try {
            callMethod(klass, "getInteger", argTypes, term20415, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


