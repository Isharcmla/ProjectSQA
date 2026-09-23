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

public class ExtendedProperties_getInteger_2141344705108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6255;

    public ExtendedProperties_getInteger_2141344705108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6261 = new ArrayList();
        ArrayList term6310 = new ArrayList();
        HashMap term6332 = new HashMap();
        Set<Object> term22172 =  ((Map) term6332).keySet();
        HashSet term6331 = new HashSet((Collection<? extends Object>) term22172);
        HashMap term6338 = new HashMap();
        Set<Object> term22173 =  ((Map) term6338).keySet();
        HashSet term6337 = new HashSet((Collection<? extends Object>) term22173);
        ArrayList term6343 = new ArrayList();
        term6255 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6256 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6265 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6314 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term6315 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6317 = newInstance(Class.forName("java.lang.Object"));
        Object term6318 = newInstance(Class.forName("java.lang.Object"));
        Object term6319 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6321 = newInstance(Class.forName("java.lang.Object"));
        Object term6322 = newInstance(Class.forName("java.lang.Object"));
        Object term6323 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6325 = newInstance(Class.forName("java.lang.Object"));
        Object term6326 = newInstance(Class.forName("java.lang.Object"));
        setField(term6256, term6256.getClass(), "defaults", null);
        setField(term6256, term6256.getClass(), "file", null);
        setField(term6256, term6256.getClass(), "basePath", null);
        setField(term6256, term6256.getClass(), "fileSeparator", "/");
        setBooleanField(term6256, term6256.getClass(), "isInitialized", false);
        setField(term6256, term6256.getClass(), "includePropertyName", null);
        setField(term6256, term6256.getClass(), "keysAsListed", term6261);
        setField(term6256, term6256.getClass(), "table", term6265);
        setIntField(term6256, term6256.getClass(), "count", 0);
        setIntField(term6256, term6256.getClass(), "threshold", 8);
        setFloatField(term6256, term6256.getClass(), "loadFactor", 0.75F);
        setIntField(term6256, term6256.getClass(), "modCount", 0);
        setField(term6256, term6256.getClass(), "keySet", null);
        setField(term6256, term6256.getClass(), "entrySet", null);
        setField(term6256, term6256.getClass(), "values", null);
        setField(term6255, term6255.getClass(), "defaults", term6256);
        setField(term6255, term6255.getClass(), "file", "PapWxkhEWe");
        setField(term6255, term6255.getClass(), "basePath", "smnHEqRFRx");
        setField(term6255, term6255.getClass(), "fileSeparator", "/");
        setBooleanField(term6255, term6255.getClass(), "isInitialized", true);
        setField(term6255, term6255.getClass(), "includePropertyName", "XYtryyobou");
        setField(term6255, term6255.getClass(), "keysAsListed", term6310);
        setIntField(term6315, term6315.getClass(), "hash", 503835);
        setField(term6315, term6315.getClass(), "key", term6317);
        setField(term6315, term6315.getClass(), "value", term6318);
        setField(term6315, term6315.getClass(), "next", null);
        setElement(term6314, 50, term6315);
        setIntField(term6319, term6319.getClass(), "hash", 1915703108);
        setField(term6319, term6319.getClass(), "key", term6321);
        setField(term6319, term6319.getClass(), "value", term6322);
        setIntField(term6323, term6323.getClass(), "hash", 1935552598);
        setField(term6323, term6323.getClass(), "key", term6325);
        setField(term6323, term6323.getClass(), "value", term6326);
        setField(term6323, term6323.getClass(), "next", null);
        setField(term6319, term6319.getClass(), "next", term6323);
        setElement(term6314, 83, term6319);
        setField(term6255, term6255.getClass(), "table", term6314);
        setIntField(term6255, term6255.getClass(), "count", 53410916);
        setIntField(term6255, term6255.getClass(), "threshold", 71);
        setFloatField(term6255, term6255.getClass(), "loadFactor", 0.75F);
        setIntField(term6255, term6255.getClass(), "modCount", -375014952);
        setField(term6255, term6255.getClass(), "keySet", term6331);
        setField(term6255, term6255.getClass(), "entrySet", term6337);
        setField(term6255, term6255.getClass(), "values", term6343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OYbzXylRWW";
        try {
            callMethod(klass, "getInteger", argTypes, term6255, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


