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

public class ExtendedProperties_addPropertyDirect_200092761579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5546;
     Object term5809;
     Object term38331;
     Object term38381;

    public ExtendedProperties_addPropertyDirect_200092761579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5552 = new ArrayList();
        ArrayList term5601 = new ArrayList();
        ((ArrayList) term5601).add("java.lang.Object@7e366630");
        ((ArrayList) term5601).add("java.lang.Object@5cae851e");
        ((ArrayList) term5601).add("java.lang.Object@6b2aa2f8");
        HashMap term5782 = new HashMap();
        Set<Object> term38564 =  ((Map) term5782).keySet();
        HashSet term5781 = new HashSet((Collection<? extends Object>) term38564);
        HashMap term5788 = new HashMap();
        Set<Object> term38565 =  ((Map) term5788).keySet();
        HashSet term5787 = new HashSet((Collection<? extends Object>) term38565);
        ArrayList term5793 = new ArrayList();
        term5546 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5547 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5556 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5686 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5687 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5716 = newInstance(Class.forName("java.lang.Object"));
        Object term5717 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5746 = newInstance(Class.forName("java.lang.Object"));
        Object term5747 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5776 = newInstance(Class.forName("java.lang.Object"));
        setField(term5547, term5547.getClass(), "defaults", null);
        setField(term5547, term5547.getClass(), "file", null);
        setField(term5547, term5547.getClass(), "basePath", null);
        setField(term5547, term5547.getClass(), "fileSeparator", "/");
        setBooleanField(term5547, term5547.getClass(), "isInitialized", false);
        setField(term5547, term5547.getClass(), "includePropertyName", null);
        setField(term5547, term5547.getClass(), "keysAsListed", term5552);
        setField(term5547, term5547.getClass(), "table", term5556);
        setIntField(term5547, term5547.getClass(), "count", 0);
        setIntField(term5547, term5547.getClass(), "threshold", 8);
        setFloatField(term5547, term5547.getClass(), "loadFactor", 0.75F);
        setIntField(term5547, term5547.getClass(), "modCount", 0);
        setField(term5547, term5547.getClass(), "keySet", null);
        setField(term5547, term5547.getClass(), "entrySet", null);
        setField(term5547, term5547.getClass(), "values", null);
        setField(term5546, term5546.getClass(), "defaults", term5547);
        setField(term5546, term5546.getClass(), "file", "wSQxaModmm");
        setField(term5546, term5546.getClass(), "basePath", "UlajhuVLaP");
        setField(term5546, term5546.getClass(), "fileSeparator", "/");
        setBooleanField(term5546, term5546.getClass(), "isInitialized", true);
        setField(term5546, term5546.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term5546, term5546.getClass(), "keysAsListed", term5601);
        setIntField(term5687, term5687.getClass(), "hash", -1729193685);
        setField(term5687, term5687.getClass(), "key", "java.lang.Object@6b2aa2f8");
        setField(term5687, term5687.getClass(), "value", term5716);
        setField(term5687, term5687.getClass(), "next", null);
        setElement(term5686, 3, term5687);
        setIntField(term5717, term5717.getClass(), "hash", -1631200613);
        setField(term5717, term5717.getClass(), "key", "java.lang.Object@7e366630");
        setField(term5717, term5717.getClass(), "value", term5746);
        setField(term5717, term5717.getClass(), "next", null);
        setElement(term5686, 4, term5717);
        setIntField(term5747, term5747.getClass(), "hash", -1236456304);
        setField(term5747, term5747.getClass(), "key", "java.lang.Object@5cae851e");
        setField(term5747, term5747.getClass(), "value", term5776);
        setField(term5747, term5747.getClass(), "next", null);
        setElement(term5686, 7, term5747);
        setField(term5546, term5546.getClass(), "table", term5686);
        setIntField(term5546, term5546.getClass(), "count", -1275173081);
        setIntField(term5546, term5546.getClass(), "threshold", 8);
        setFloatField(term5546, term5546.getClass(), "loadFactor", 0.75F);
        setIntField(term5546, term5546.getClass(), "modCount", -244121223);
        setField(term5546, term5546.getClass(), "keySet", term5781);
        setField(term5546, term5546.getClass(), "entrySet", term5787);
        setField(term5546, term5546.getClass(), "values", term5793);
        term5809 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term38335 = new ArrayList();
        ArrayList term38346 = new ArrayList();
        ((ArrayList) term38346).add("java.lang.Object@7e366630");
        ((ArrayList) term38346).add("java.lang.Object@5cae851e");
        ((ArrayList) term38346).add("java.lang.Object@6b2aa2f8");
        ((ArrayList) term38346).add("hxCBltsObl");
        HashMap term38374 = new HashMap();
        Set<Object> term38778 =  ((Map) term38374).keySet();
        HashSet term38373 = new HashSet((Collection<? extends Object>) term38778);
        HashMap term38376 = new HashMap();
        Set<Object> term38779 =  ((Map) term38376).keySet();
        HashSet term38375 = new HashSet((Collection<? extends Object>) term38779);
        ArrayList term38377 = new ArrayList();
        term38331 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term38332 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term38337 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term38356 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term38357 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38360 = newInstance(Class.forName("java.lang.Object"));
        Object term38361 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38364 = newInstance(Class.forName("java.lang.Object"));
        Object term38365 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38368 = newInstance(Class.forName("java.lang.Object"));
        Object term38369 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38372 = newInstance(Class.forName("java.lang.Object"));
        setField(term38332, term38332.getClass(), "defaults", null);
        setField(term38332, term38332.getClass(), "file", null);
        setField(term38332, term38332.getClass(), "basePath", null);
        setField(term38332, term38332.getClass(), "fileSeparator", "/");
        setBooleanField(term38332, term38332.getClass(), "isInitialized", false);
        setField(term38332, term38332.getClass(), "includePropertyName", null);
        setField(term38332, term38332.getClass(), "keysAsListed", term38335);
        setField(term38332, term38332.getClass(), "table", term38337);
        setIntField(term38332, term38332.getClass(), "count", 0);
        setIntField(term38332, term38332.getClass(), "threshold", 8);
        setFloatField(term38332, term38332.getClass(), "loadFactor", 0.75F);
        setIntField(term38332, term38332.getClass(), "modCount", 0);
        setField(term38332, term38332.getClass(), "keySet", null);
        setField(term38332, term38332.getClass(), "entrySet", null);
        setField(term38332, term38332.getClass(), "values", null);
        setField(term38331, term38331.getClass(), "defaults", term38332);
        setField(term38331, term38331.getClass(), "file", "wSQxaModmm");
        setField(term38331, term38331.getClass(), "basePath", "UlajhuVLaP");
        setField(term38331, term38331.getClass(), "fileSeparator", "/");
        setBooleanField(term38331, term38331.getClass(), "isInitialized", true);
        setField(term38331, term38331.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term38331, term38331.getClass(), "keysAsListed", term38346);
        setIntField(term38357, term38357.getClass(), "hash", -1729193685);
        setField(term38357, term38357.getClass(), "key", "java.lang.Object@6b2aa2f8");
        setField(term38357, term38357.getClass(), "value", term38360);
        setField(term38357, term38357.getClass(), "next", null);
        setElement(term38356, 3, term38357);
        setIntField(term38361, term38361.getClass(), "hash", -1631200613);
        setField(term38361, term38361.getClass(), "key", "java.lang.Object@7e366630");
        setField(term38361, term38361.getClass(), "value", term38364);
        setField(term38361, term38361.getClass(), "next", null);
        setElement(term38356, 4, term38361);
        setIntField(term38365, term38365.getClass(), "hash", 1343719229);
        setField(term38365, term38365.getClass(), "key", "hxCBltsObl");
        setField(term38365, term38365.getClass(), "value", term38368);
        setField(term38365, term38365.getClass(), "next", null);
        setElement(term38356, 6, term38365);
        setIntField(term38369, term38369.getClass(), "hash", -1236456304);
        setField(term38369, term38369.getClass(), "key", "java.lang.Object@5cae851e");
        setField(term38369, term38369.getClass(), "value", term38372);
        setField(term38369, term38369.getClass(), "next", null);
        setElement(term38356, 7, term38369);
        setField(term38331, term38331.getClass(), "table", term38356);
        setIntField(term38331, term38331.getClass(), "count", -1275173080);
        setIntField(term38331, term38331.getClass(), "threshold", 8);
        setFloatField(term38331, term38331.getClass(), "loadFactor", 0.75F);
        setIntField(term38331, term38331.getClass(), "modCount", -244121222);
        setField(term38331, term38331.getClass(), "keySet", term38373);
        setField(term38331, term38331.getClass(), "entrySet", term38375);
        setField(term38331, term38331.getClass(), "values", term38377);
        term38381 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = term5809;
        callMethod(klass, "addPropertyDirect", argTypes, term5546, args);
        assertTrue(recursiveEquals(term5546, term38331));
        assertTrue(recursiveEquals(term5809, term38381));
    }

};


