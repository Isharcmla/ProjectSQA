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

public class ExtendedProperties_getDouble_525058703116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6591;

    public ExtendedProperties_getDouble_525058703116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6597 = new ArrayList();
        ArrayList term6634 = new ArrayList();
        HashMap term6662 = new HashMap();
        Set<Object> term22058 =  ((Map) term6662).keySet();
        HashSet term6661 = new HashSet((Collection<? extends Object>) term22058);
        HashMap term6668 = new HashMap();
        Set<Object> term22059 =  ((Map) term6668).keySet();
        HashSet term6667 = new HashSet((Collection<? extends Object>) term22059);
        ArrayList term6673 = new ArrayList();
        term6591 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6592 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6601 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6638 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6639 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6641 = newInstance(Class.forName("java.lang.Object"));
        Object term6642 = newInstance(Class.forName("java.lang.Object"));
        Object term6643 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6645 = newInstance(Class.forName("java.lang.Object"));
        Object term6646 = newInstance(Class.forName("java.lang.Object"));
        Object term6647 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6649 = newInstance(Class.forName("java.lang.Object"));
        Object term6650 = newInstance(Class.forName("java.lang.Object"));
        Object term6651 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6653 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6655 = newInstance(Class.forName("java.lang.Object"));
        Object term6656 = newInstance(Class.forName("java.lang.Object"));
        setField(term6592, term6592.getClass(), "defaults", null);
        setField(term6592, term6592.getClass(), "file", null);
        setField(term6592, term6592.getClass(), "basePath", null);
        setField(term6592, term6592.getClass(), "fileSeparator", "/");
        setBooleanField(term6592, term6592.getClass(), "isInitialized", false);
        setField(term6592, term6592.getClass(), "keysAsListed", term6597);
        setField(term6592, term6592.getClass(), "table", term6601);
        setIntField(term6592, term6592.getClass(), "count", 0);
        setIntField(term6592, term6592.getClass(), "threshold", 8);
        setFloatField(term6592, term6592.getClass(), "loadFactor", 0.75F);
        setIntField(term6592, term6592.getClass(), "modCount", 0);
        setField(term6592, term6592.getClass(), "keySet", null);
        setField(term6592, term6592.getClass(), "entrySet", null);
        setField(term6592, term6592.getClass(), "values", null);
        setField(term6591, term6591.getClass(), "defaults", term6592);
        setField(term6591, term6591.getClass(), "file", "ZfdXfCCFDf");
        setField(term6591, term6591.getClass(), "basePath", "MwwjNtdOFT");
        setField(term6591, term6591.getClass(), "fileSeparator", "/");
        setBooleanField(term6591, term6591.getClass(), "isInitialized", false);
        setField(term6591, term6591.getClass(), "keysAsListed", term6634);
        setIntField(term6639, term6639.getClass(), "hash", 32755770);
        setField(term6639, term6639.getClass(), "key", term6641);
        setField(term6639, term6639.getClass(), "value", term6642);
        setField(term6639, term6639.getClass(), "next", null);
        setElement(term6638, 3, term6639);
        setIntField(term6643, term6643.getClass(), "hash", 2004656363);
        setField(term6643, term6643.getClass(), "key", term6645);
        setField(term6643, term6643.getClass(), "value", term6646);
        setIntField(term6647, term6647.getClass(), "hash", 288366260);
        setField(term6647, term6647.getClass(), "key", term6649);
        setField(term6647, term6647.getClass(), "value", term6650);
        setIntField(term6651, term6651.getClass(), "hash", 499235985);
        setField(term6651, term6651.getClass(), "key", null);
        setField(term6651, term6651.getClass(), "value", null);
        setField(term6651, term6651.getClass(), "next", null);
        setField(term6647, term6647.getClass(), "next", term6651);
        setField(term6643, term6643.getClass(), "next", term6647);
        setElement(term6638, 6, term6643);
        setIntField(term6653, term6653.getClass(), "hash", 157150959);
        setField(term6653, term6653.getClass(), "key", term6655);
        setField(term6653, term6653.getClass(), "value", term6656);
        setField(term6653, term6653.getClass(), "next", null);
        setElement(term6638, 9, term6653);
        setField(term6591, term6591.getClass(), "table", term6638);
        setIntField(term6591, term6591.getClass(), "count", -1498296047);
        setIntField(term6591, term6591.getClass(), "threshold", 8);
        setFloatField(term6591, term6591.getClass(), "loadFactor", 0.75F);
        setIntField(term6591, term6591.getClass(), "modCount", 2098647994);
        setField(term6591, term6591.getClass(), "keySet", term6661);
        setField(term6591, term6591.getClass(), "entrySet", term6667);
        setField(term6591, term6591.getClass(), "values", term6673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VYkqXKVlAJ";
        try {
            callMethod(klass, "getDouble", argTypes, term6591, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


