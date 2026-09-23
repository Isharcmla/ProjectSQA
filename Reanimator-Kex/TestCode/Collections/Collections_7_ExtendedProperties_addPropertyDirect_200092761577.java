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

public class ExtendedProperties_addPropertyDirect_200092761577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507;
     Object term1611;
     Object term12387;
     Object term12426;

    public ExtendedProperties_addPropertyDirect_200092761577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1513 = new ArrayList();
        ArrayList term1562 = new ArrayList();
        HashMap term1584 = new HashMap();
        Set<Object> term12459 =  ((Map) term1584).keySet();
        HashSet term1583 = new HashSet((Collection<? extends Object>) term12459);
        HashMap term1590 = new HashMap();
        Set<Object> term12460 =  ((Map) term1590).keySet();
        HashSet term1589 = new HashSet((Collection<? extends Object>) term12460);
        ArrayList term1595 = new ArrayList();
        term1507 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1508 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1517 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1566 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1567 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1569 = newInstance(Class.forName("java.lang.Object"));
        Object term1570 = newInstance(Class.forName("java.lang.Object"));
        Object term1571 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1573 = newInstance(Class.forName("java.lang.Object"));
        Object term1574 = newInstance(Class.forName("java.lang.Object"));
        Object term1575 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1577 = newInstance(Class.forName("java.lang.Object"));
        Object term1578 = newInstance(Class.forName("java.lang.Object"));
        setField(term1508, term1508.getClass(), "defaults", null);
        setField(term1508, term1508.getClass(), "file", null);
        setField(term1508, term1508.getClass(), "basePath", null);
        setField(term1508, term1508.getClass(), "fileSeparator", "/");
        setBooleanField(term1508, term1508.getClass(), "isInitialized", false);
        setField(term1508, term1508.getClass(), "includePropertyName", null);
        setField(term1508, term1508.getClass(), "keysAsListed", term1513);
        setField(term1508, term1508.getClass(), "table", term1517);
        setIntField(term1508, term1508.getClass(), "count", 0);
        setIntField(term1508, term1508.getClass(), "threshold", 8);
        setFloatField(term1508, term1508.getClass(), "loadFactor", 0.75F);
        setIntField(term1508, term1508.getClass(), "modCount", 0);
        setField(term1508, term1508.getClass(), "keySet", null);
        setField(term1508, term1508.getClass(), "entrySet", null);
        setField(term1508, term1508.getClass(), "values", null);
        setField(term1507, term1507.getClass(), "defaults", term1508);
        setField(term1507, term1507.getClass(), "file", "wSQxaModmm");
        setField(term1507, term1507.getClass(), "basePath", "UlajhuVLaP");
        setField(term1507, term1507.getClass(), "fileSeparator", "/");
        setBooleanField(term1507, term1507.getClass(), "isInitialized", true);
        setField(term1507, term1507.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term1507, term1507.getClass(), "keysAsListed", term1562);
        setIntField(term1567, term1567.getClass(), "hash", 757323638);
        setField(term1567, term1567.getClass(), "key", term1569);
        setField(term1567, term1567.getClass(), "value", term1570);
        setField(term1567, term1567.getClass(), "next", null);
        setElement(term1566, 5, term1567);
        setIntField(term1571, term1571.getClass(), "hash", 661184585);
        setField(term1571, term1571.getClass(), "key", term1573);
        setField(term1571, term1571.getClass(), "value", term1574);
        setIntField(term1575, term1575.getClass(), "hash", 1801331648);
        setField(term1575, term1575.getClass(), "key", term1577);
        setField(term1575, term1575.getClass(), "value", term1578);
        setField(term1575, term1575.getClass(), "next", null);
        setField(term1571, term1571.getClass(), "next", term1575);
        setElement(term1566, 6, term1571);
        setField(term1507, term1507.getClass(), "table", term1566);
        setIntField(term1507, term1507.getClass(), "count", -1275173081);
        setIntField(term1507, term1507.getClass(), "threshold", 8);
        setFloatField(term1507, term1507.getClass(), "loadFactor", 0.75F);
        setIntField(term1507, term1507.getClass(), "modCount", -244121223);
        setField(term1507, term1507.getClass(), "keySet", term1583);
        setField(term1507, term1507.getClass(), "entrySet", term1589);
        setField(term1507, term1507.getClass(), "values", term1595);
        term1611 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term12391 = new ArrayList();
        ArrayList term12402 = new ArrayList();
        ((ArrayList) term12402).add("hxCBltsObl");
        HashMap term12419 = new HashMap();
        Set<Object> term12523 =  ((Map) term12419).keySet();
        HashSet term12418 = new HashSet((Collection<? extends Object>) term12523);
        HashMap term12421 = new HashMap();
        Set<Object> term12524 =  ((Map) term12421).keySet();
        HashSet term12420 = new HashSet((Collection<? extends Object>) term12524);
        ArrayList term12422 = new ArrayList();
        term12387 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12388 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12393 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12406 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term12407 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12408 = newInstance(Class.forName("java.lang.Object"));
        Object term12409 = newInstance(Class.forName("java.lang.Object"));
        Object term12410 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12413 = newInstance(Class.forName("java.lang.Object"));
        Object term12414 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12415 = newInstance(Class.forName("java.lang.Object"));
        Object term12416 = newInstance(Class.forName("java.lang.Object"));
        Object term12417 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term12388, term12388.getClass(), "defaults", null);
        setField(term12388, term12388.getClass(), "file", null);
        setField(term12388, term12388.getClass(), "basePath", null);
        setField(term12388, term12388.getClass(), "fileSeparator", "/");
        setBooleanField(term12388, term12388.getClass(), "isInitialized", false);
        setField(term12388, term12388.getClass(), "includePropertyName", null);
        setField(term12388, term12388.getClass(), "keysAsListed", term12391);
        setField(term12388, term12388.getClass(), "table", term12393);
        setIntField(term12388, term12388.getClass(), "count", 0);
        setIntField(term12388, term12388.getClass(), "threshold", 8);
        setFloatField(term12388, term12388.getClass(), "loadFactor", 0.75F);
        setIntField(term12388, term12388.getClass(), "modCount", 0);
        setField(term12388, term12388.getClass(), "keySet", null);
        setField(term12388, term12388.getClass(), "entrySet", null);
        setField(term12388, term12388.getClass(), "values", null);
        setField(term12387, term12387.getClass(), "defaults", term12388);
        setField(term12387, term12387.getClass(), "file", "wSQxaModmm");
        setField(term12387, term12387.getClass(), "basePath", "UlajhuVLaP");
        setField(term12387, term12387.getClass(), "fileSeparator", "/");
        setBooleanField(term12387, term12387.getClass(), "isInitialized", true);
        setField(term12387, term12387.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term12387, term12387.getClass(), "keysAsListed", term12402);
        setIntField(term12407, term12407.getClass(), "hash", 757323638);
        setField(term12407, term12407.getClass(), "key", term12408);
        setField(term12407, term12407.getClass(), "value", term12409);
        setField(term12407, term12407.getClass(), "next", null);
        setElement(term12406, 5, term12407);
        setIntField(term12410, term12410.getClass(), "hash", 1343719229);
        setField(term12410, term12410.getClass(), "key", "hxCBltsObl");
        setField(term12410, term12410.getClass(), "value", term12413);
        setIntField(term12414, term12414.getClass(), "hash", 661184585);
        setField(term12414, term12414.getClass(), "key", term12415);
        setField(term12414, term12414.getClass(), "value", term12416);
        setIntField(term12417, term12417.getClass(), "hash", 1801331648);
        setField(term12417, term12417.getClass(), "key", null);
        setField(term12417, term12417.getClass(), "value", null);
        setField(term12417, term12417.getClass(), "next", null);
        setField(term12414, term12414.getClass(), "next", term12417);
        setField(term12410, term12410.getClass(), "next", term12414);
        setElement(term12406, 6, term12410);
        setField(term12387, term12387.getClass(), "table", term12406);
        setIntField(term12387, term12387.getClass(), "count", -1275173080);
        setIntField(term12387, term12387.getClass(), "threshold", 8);
        setFloatField(term12387, term12387.getClass(), "loadFactor", 0.75F);
        setIntField(term12387, term12387.getClass(), "modCount", -244121222);
        setField(term12387, term12387.getClass(), "keySet", term12418);
        setField(term12387, term12387.getClass(), "entrySet", term12420);
        setField(term12387, term12387.getClass(), "values", term12422);
        term12426 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = term1611;
        callMethod(klass, "addPropertyDirect", argTypes, term1507, args);
        assertTrue(recursiveEquals(term1507, term12387));
        assertTrue(recursiveEquals(term1611, term12426));
    }

};


