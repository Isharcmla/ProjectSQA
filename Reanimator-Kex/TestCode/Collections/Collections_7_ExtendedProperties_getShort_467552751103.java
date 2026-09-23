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

public class ExtendedProperties_getShort_467552751103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5489;

    public ExtendedProperties_getShort_467552751103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5495 = new ArrayList();
        ArrayList term5544 = new ArrayList();
        HashMap term5574 = new HashMap();
        Set<Object> term20293 =  ((Map) term5574).keySet();
        HashSet term5573 = new HashSet((Collection<? extends Object>) term20293);
        HashMap term5580 = new HashMap();
        Set<Object> term20294 =  ((Map) term5580).keySet();
        HashSet term5579 = new HashSet((Collection<? extends Object>) term20294);
        ArrayList term5585 = new ArrayList();
        term5489 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5490 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5499 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5548 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5549 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5551 = newInstance(Class.forName("java.lang.Object"));
        Object term5552 = newInstance(Class.forName("java.lang.Object"));
        Object term5553 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5555 = newInstance(Class.forName("java.lang.Object"));
        Object term5556 = newInstance(Class.forName("java.lang.Object"));
        Object term5557 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5559 = newInstance(Class.forName("java.lang.Object"));
        Object term5560 = newInstance(Class.forName("java.lang.Object"));
        Object term5561 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5563 = newInstance(Class.forName("java.lang.Object"));
        Object term5564 = newInstance(Class.forName("java.lang.Object"));
        Object term5565 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5567 = newInstance(Class.forName("java.lang.Object"));
        Object term5568 = newInstance(Class.forName("java.lang.Object"));
        setField(term5490, term5490.getClass(), "defaults", null);
        setField(term5490, term5490.getClass(), "file", null);
        setField(term5490, term5490.getClass(), "basePath", null);
        setField(term5490, term5490.getClass(), "fileSeparator", "/");
        setBooleanField(term5490, term5490.getClass(), "isInitialized", false);
        setField(term5490, term5490.getClass(), "includePropertyName", null);
        setField(term5490, term5490.getClass(), "keysAsListed", term5495);
        setField(term5490, term5490.getClass(), "table", term5499);
        setIntField(term5490, term5490.getClass(), "count", 0);
        setIntField(term5490, term5490.getClass(), "threshold", 8);
        setFloatField(term5490, term5490.getClass(), "loadFactor", 0.75F);
        setIntField(term5490, term5490.getClass(), "modCount", 0);
        setField(term5490, term5490.getClass(), "keySet", null);
        setField(term5490, term5490.getClass(), "entrySet", null);
        setField(term5490, term5490.getClass(), "values", null);
        setField(term5489, term5489.getClass(), "defaults", term5490);
        setField(term5489, term5489.getClass(), "file", "EeBVbzjcCI");
        setField(term5489, term5489.getClass(), "basePath", "UfQtPRyWRC");
        setField(term5489, term5489.getClass(), "fileSeparator", "/");
        setBooleanField(term5489, term5489.getClass(), "isInitialized", true);
        setField(term5489, term5489.getClass(), "includePropertyName", "FPvxVzzSvD");
        setField(term5489, term5489.getClass(), "keysAsListed", term5544);
        setIntField(term5549, term5549.getClass(), "hash", 753534169);
        setField(term5549, term5549.getClass(), "key", term5551);
        setField(term5549, term5549.getClass(), "value", term5552);
        setIntField(term5553, term5553.getClass(), "hash", 1432481185);
        setField(term5553, term5553.getClass(), "key", term5555);
        setField(term5553, term5553.getClass(), "value", term5556);
        setField(term5553, term5553.getClass(), "next", null);
        setField(term5549, term5549.getClass(), "next", term5553);
        setElement(term5548, 3, term5549);
        setIntField(term5557, term5557.getClass(), "hash", 1161595397);
        setField(term5557, term5557.getClass(), "key", term5559);
        setField(term5557, term5557.getClass(), "value", term5560);
        setIntField(term5561, term5561.getClass(), "hash", 1148565842);
        setField(term5561, term5561.getClass(), "key", term5563);
        setField(term5561, term5561.getClass(), "value", term5564);
        setField(term5561, term5561.getClass(), "next", null);
        setField(term5557, term5557.getClass(), "next", term5561);
        setElement(term5548, 6, term5557);
        setIntField(term5565, term5565.getClass(), "hash", 1982630625);
        setField(term5565, term5565.getClass(), "key", term5567);
        setField(term5565, term5565.getClass(), "value", term5568);
        setField(term5565, term5565.getClass(), "next", null);
        setElement(term5548, 8, term5565);
        setField(term5489, term5489.getClass(), "table", term5548);
        setIntField(term5489, term5489.getClass(), "count", -1476117757);
        setIntField(term5489, term5489.getClass(), "threshold", 8);
        setFloatField(term5489, term5489.getClass(), "loadFactor", 0.75F);
        setIntField(term5489, term5489.getClass(), "modCount", -341962975);
        setField(term5489, term5489.getClass(), "keySet", term5573);
        setField(term5489, term5489.getClass(), "entrySet", term5579);
        setField(term5489, term5489.getClass(), "values", term5585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHcwFgsGFC";
        try {
            callMethod(klass, "getShort", argTypes, term5489, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


