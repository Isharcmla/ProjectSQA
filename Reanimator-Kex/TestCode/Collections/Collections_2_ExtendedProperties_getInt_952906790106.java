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
import java.lang.Integer;

public class ExtendedProperties_getInt_952906790106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5223;
     Object term5315;
     Object term18451;

    public ExtendedProperties_getInt_952906790106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5229 = new ArrayList();
        ArrayList term5266 = new ArrayList();
        HashMap term5288 = new HashMap();
        Set<Object> term18506 =  ((Map) term5288).keySet();
        HashSet term5287 = new HashSet((Collection<? extends Object>) term18506);
        HashMap term5294 = new HashMap();
        Set<Object> term18507 =  ((Map) term5294).keySet();
        HashSet term5293 = new HashSet((Collection<? extends Object>) term18507);
        ArrayList term5299 = new ArrayList();
        term5223 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5224 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5233 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5270 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term5271 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5273 = newInstance(Class.forName("java.lang.Object"));
        Object term5274 = newInstance(Class.forName("java.lang.Object"));
        Object term5275 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5277 = newInstance(Class.forName("java.lang.Object"));
        Object term5278 = newInstance(Class.forName("java.lang.Object"));
        Object term5279 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5281 = newInstance(Class.forName("java.lang.Object"));
        Object term5282 = newInstance(Class.forName("java.lang.Object"));
        setField(term5224, term5224.getClass(), "defaults", null);
        setField(term5224, term5224.getClass(), "file", null);
        setField(term5224, term5224.getClass(), "basePath", null);
        setField(term5224, term5224.getClass(), "fileSeparator", "/");
        setBooleanField(term5224, term5224.getClass(), "isInitialized", false);
        setField(term5224, term5224.getClass(), "keysAsListed", term5229);
        setField(term5224, term5224.getClass(), "table", term5233);
        setIntField(term5224, term5224.getClass(), "count", 0);
        setIntField(term5224, term5224.getClass(), "threshold", 8);
        setFloatField(term5224, term5224.getClass(), "loadFactor", 0.75F);
        setIntField(term5224, term5224.getClass(), "modCount", 0);
        setField(term5224, term5224.getClass(), "keySet", null);
        setField(term5224, term5224.getClass(), "entrySet", null);
        setField(term5224, term5224.getClass(), "values", null);
        setField(term5223, term5223.getClass(), "defaults", term5224);
        setField(term5223, term5223.getClass(), "file", "hCWPJQKpdc");
        setField(term5223, term5223.getClass(), "basePath", "WzMEhMXkKx");
        setField(term5223, term5223.getClass(), "fileSeparator", "/");
        setBooleanField(term5223, term5223.getClass(), "isInitialized", false);
        setField(term5223, term5223.getClass(), "keysAsListed", term5266);
        setIntField(term5271, term5271.getClass(), "hash", 1248363990);
        setField(term5271, term5271.getClass(), "key", term5273);
        setField(term5271, term5271.getClass(), "value", term5274);
        setField(term5271, term5271.getClass(), "next", null);
        setElement(term5270, 55, term5271);
        setIntField(term5275, term5275.getClass(), "hash", 1655380095);
        setField(term5275, term5275.getClass(), "key", term5277);
        setField(term5275, term5275.getClass(), "value", term5278);
        setField(term5275, term5275.getClass(), "next", null);
        setElement(term5270, 60, term5275);
        setIntField(term5279, term5279.getClass(), "hash", 880659665);
        setField(term5279, term5279.getClass(), "key", term5281);
        setField(term5279, term5279.getClass(), "value", term5282);
        setField(term5279, term5279.getClass(), "next", null);
        setElement(term5270, 70, term5279);
        setField(term5223, term5223.getClass(), "table", term5270);
        setIntField(term5223, term5223.getClass(), "count", 1072005686);
        setIntField(term5223, term5223.getClass(), "threshold", 71);
        setFloatField(term5223, term5223.getClass(), "loadFactor", 0.75F);
        setIntField(term5223, term5223.getClass(), "modCount", 1861318865);
        setField(term5223, term5223.getClass(), "keySet", term5287);
        setField(term5223, term5223.getClass(), "entrySet", term5293);
        setField(term5223, term5223.getClass(), "values", term5299);
        term5315 = new Integer(568954359);
        ArrayList term18455 = new ArrayList();
        ArrayList term18464 = new ArrayList();
        HashMap term18477 = new HashMap();
        Set<Object> term18540 =  ((Map) term18477).keySet();
        HashSet term18476 = new HashSet((Collection<? extends Object>) term18540);
        HashMap term18479 = new HashMap();
        Set<Object> term18541 =  ((Map) term18479).keySet();
        HashSet term18478 = new HashSet((Collection<? extends Object>) term18541);
        ArrayList term18480 = new ArrayList();
        term18451 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term18452 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term18457 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term18466 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term18467 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18468 = newInstance(Class.forName("java.lang.Object"));
        Object term18469 = newInstance(Class.forName("java.lang.Object"));
        Object term18470 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18471 = newInstance(Class.forName("java.lang.Object"));
        Object term18472 = newInstance(Class.forName("java.lang.Object"));
        Object term18473 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18474 = newInstance(Class.forName("java.lang.Object"));
        Object term18475 = newInstance(Class.forName("java.lang.Object"));
        setField(term18452, term18452.getClass(), "defaults", null);
        setField(term18452, term18452.getClass(), "file", null);
        setField(term18452, term18452.getClass(), "basePath", null);
        setField(term18452, term18452.getClass(), "fileSeparator", "/");
        setBooleanField(term18452, term18452.getClass(), "isInitialized", false);
        setField(term18452, term18452.getClass(), "keysAsListed", term18455);
        setField(term18452, term18452.getClass(), "table", term18457);
        setIntField(term18452, term18452.getClass(), "count", 0);
        setIntField(term18452, term18452.getClass(), "threshold", 8);
        setFloatField(term18452, term18452.getClass(), "loadFactor", 0.75F);
        setIntField(term18452, term18452.getClass(), "modCount", 0);
        setField(term18452, term18452.getClass(), "keySet", null);
        setField(term18452, term18452.getClass(), "entrySet", null);
        setField(term18452, term18452.getClass(), "values", null);
        setField(term18451, term18451.getClass(), "defaults", term18452);
        setField(term18451, term18451.getClass(), "file", "hCWPJQKpdc");
        setField(term18451, term18451.getClass(), "basePath", "WzMEhMXkKx");
        setField(term18451, term18451.getClass(), "fileSeparator", "/");
        setBooleanField(term18451, term18451.getClass(), "isInitialized", false);
        setField(term18451, term18451.getClass(), "keysAsListed", term18464);
        setIntField(term18467, term18467.getClass(), "hash", 1248363990);
        setField(term18467, term18467.getClass(), "key", term18468);
        setField(term18467, term18467.getClass(), "value", term18469);
        setField(term18467, term18467.getClass(), "next", null);
        setElement(term18466, 55, term18467);
        setIntField(term18470, term18470.getClass(), "hash", 1655380095);
        setField(term18470, term18470.getClass(), "key", term18471);
        setField(term18470, term18470.getClass(), "value", term18472);
        setField(term18470, term18470.getClass(), "next", null);
        setElement(term18466, 60, term18470);
        setIntField(term18473, term18473.getClass(), "hash", 880659665);
        setField(term18473, term18473.getClass(), "key", term18474);
        setField(term18473, term18473.getClass(), "value", term18475);
        setField(term18473, term18473.getClass(), "next", null);
        setElement(term18466, 70, term18473);
        setField(term18451, term18451.getClass(), "table", term18466);
        setIntField(term18451, term18451.getClass(), "count", 1072005686);
        setIntField(term18451, term18451.getClass(), "threshold", 71);
        setFloatField(term18451, term18451.getClass(), "loadFactor", 0.75F);
        setIntField(term18451, term18451.getClass(), "modCount", 1861318865);
        setField(term18451, term18451.getClass(), "keySet", term18476);
        setField(term18451, term18451.getClass(), "entrySet", term18478);
        setField(term18451, term18451.getClass(), "values", term18480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "XOiDvlDhdc";
        args[1] = term5315;
        Object retValue = callMethod(klass, "getInt", argTypes, term5223, args);
        assertTrue(recursiveEquals(term5223, term18451));
        assertTrue(recursiveEquals(term5315, 568954359));
        assertTrue(recursiveEquals(retValue, 568954359));
    }

};


