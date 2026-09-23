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
import java.util.LinkedHashMap;

public class ExtendedProperties_putAll_841024344121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;
     Object term8273;
     Object term26452;
     Object term26485;

    public ExtendedProperties_putAll_841024344121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8187 = new ArrayList();
        ArrayList term8236 = new ArrayList();
        HashMap term8258 = new HashMap();
        Set<Object> term26519 =  ((Map) term8258).keySet();
        HashSet term8257 = new HashSet((Collection<? extends Object>) term26519);
        HashMap term8264 = new HashMap();
        Set<Object> term26520 =  ((Map) term8264).keySet();
        HashSet term8263 = new HashSet((Collection<? extends Object>) term26520);
        ArrayList term8269 = new ArrayList();
        term8181 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term8182 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term8191 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term8240 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term8241 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8243 = newInstance(Class.forName("java.lang.Object"));
        Object term8244 = newInstance(Class.forName("java.lang.Object"));
        Object term8245 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8247 = newInstance(Class.forName("java.lang.Object"));
        Object term8248 = newInstance(Class.forName("java.lang.Object"));
        Object term8249 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8251 = newInstance(Class.forName("java.lang.Object"));
        Object term8252 = newInstance(Class.forName("java.lang.Object"));
        setField(term8182, term8182.getClass(), "defaults", null);
        setField(term8182, term8182.getClass(), "file", null);
        setField(term8182, term8182.getClass(), "basePath", null);
        setField(term8182, term8182.getClass(), "fileSeparator", "/");
        setBooleanField(term8182, term8182.getClass(), "isInitialized", false);
        setField(term8182, term8182.getClass(), "includePropertyName", null);
        setField(term8182, term8182.getClass(), "keysAsListed", term8187);
        setField(term8182, term8182.getClass(), "table", term8191);
        setIntField(term8182, term8182.getClass(), "count", 0);
        setIntField(term8182, term8182.getClass(), "threshold", 8);
        setFloatField(term8182, term8182.getClass(), "loadFactor", 0.75F);
        setIntField(term8182, term8182.getClass(), "modCount", 0);
        setField(term8182, term8182.getClass(), "keySet", null);
        setField(term8182, term8182.getClass(), "entrySet", null);
        setField(term8182, term8182.getClass(), "values", null);
        setField(term8181, term8181.getClass(), "defaults", term8182);
        setField(term8181, term8181.getClass(), "file", "NnpwZBUTvx");
        setField(term8181, term8181.getClass(), "basePath", "tlQSNgTkQX");
        setField(term8181, term8181.getClass(), "fileSeparator", "/");
        setBooleanField(term8181, term8181.getClass(), "isInitialized", true);
        setField(term8181, term8181.getClass(), "includePropertyName", "PCipZnmBOF");
        setField(term8181, term8181.getClass(), "keysAsListed", term8236);
        setIntField(term8241, term8241.getClass(), "hash", 1985302344);
        setField(term8241, term8241.getClass(), "key", term8243);
        setField(term8241, term8241.getClass(), "value", term8244);
        setField(term8241, term8241.getClass(), "next", null);
        setElement(term8240, 39, term8241);
        setIntField(term8245, term8245.getClass(), "hash", 1000874748);
        setField(term8245, term8245.getClass(), "key", term8247);
        setField(term8245, term8245.getClass(), "value", term8248);
        setField(term8245, term8245.getClass(), "next", null);
        setElement(term8240, 63, term8245);
        setIntField(term8249, term8249.getClass(), "hash", 1626840120);
        setField(term8249, term8249.getClass(), "key", term8251);
        setField(term8249, term8249.getClass(), "value", term8252);
        setField(term8249, term8249.getClass(), "next", null);
        setElement(term8240, 80, term8249);
        setField(term8181, term8181.getClass(), "table", term8240);
        setIntField(term8181, term8181.getClass(), "count", 1398204343);
        setIntField(term8181, term8181.getClass(), "threshold", 71);
        setFloatField(term8181, term8181.getClass(), "loadFactor", 0.75F);
        setIntField(term8181, term8181.getClass(), "modCount", 229204371);
        setField(term8181, term8181.getClass(), "keySet", term8257);
        setField(term8181, term8181.getClass(), "entrySet", term8263);
        setField(term8181, term8181.getClass(), "values", term8269);
        term8273 = new LinkedHashMap();
        ArrayList term26456 = new ArrayList();
        ArrayList term26467 = new ArrayList();
        HashMap term26480 = new HashMap();
        Set<Object> term26553 =  ((Map) term26480).keySet();
        HashSet term26479 = new HashSet((Collection<? extends Object>) term26553);
        HashMap term26482 = new HashMap();
        Set<Object> term26554 =  ((Map) term26482).keySet();
        HashSet term26481 = new HashSet((Collection<? extends Object>) term26554);
        ArrayList term26483 = new ArrayList();
        term26452 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term26453 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term26458 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term26469 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term26470 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term26471 = newInstance(Class.forName("java.lang.Object"));
        Object term26472 = newInstance(Class.forName("java.lang.Object"));
        Object term26473 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term26474 = newInstance(Class.forName("java.lang.Object"));
        Object term26475 = newInstance(Class.forName("java.lang.Object"));
        Object term26476 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term26477 = newInstance(Class.forName("java.lang.Object"));
        Object term26478 = newInstance(Class.forName("java.lang.Object"));
        setField(term26453, term26453.getClass(), "defaults", null);
        setField(term26453, term26453.getClass(), "file", null);
        setField(term26453, term26453.getClass(), "basePath", null);
        setField(term26453, term26453.getClass(), "fileSeparator", "/");
        setBooleanField(term26453, term26453.getClass(), "isInitialized", false);
        setField(term26453, term26453.getClass(), "includePropertyName", null);
        setField(term26453, term26453.getClass(), "keysAsListed", term26456);
        setField(term26453, term26453.getClass(), "table", term26458);
        setIntField(term26453, term26453.getClass(), "count", 0);
        setIntField(term26453, term26453.getClass(), "threshold", 8);
        setFloatField(term26453, term26453.getClass(), "loadFactor", 0.75F);
        setIntField(term26453, term26453.getClass(), "modCount", 0);
        setField(term26453, term26453.getClass(), "keySet", null);
        setField(term26453, term26453.getClass(), "entrySet", null);
        setField(term26453, term26453.getClass(), "values", null);
        setField(term26452, term26452.getClass(), "defaults", term26453);
        setField(term26452, term26452.getClass(), "file", "NnpwZBUTvx");
        setField(term26452, term26452.getClass(), "basePath", "tlQSNgTkQX");
        setField(term26452, term26452.getClass(), "fileSeparator", "/");
        setBooleanField(term26452, term26452.getClass(), "isInitialized", true);
        setField(term26452, term26452.getClass(), "includePropertyName", "PCipZnmBOF");
        setField(term26452, term26452.getClass(), "keysAsListed", term26467);
        setIntField(term26470, term26470.getClass(), "hash", 1985302344);
        setField(term26470, term26470.getClass(), "key", term26471);
        setField(term26470, term26470.getClass(), "value", term26472);
        setField(term26470, term26470.getClass(), "next", null);
        setElement(term26469, 39, term26470);
        setIntField(term26473, term26473.getClass(), "hash", 1000874748);
        setField(term26473, term26473.getClass(), "key", term26474);
        setField(term26473, term26473.getClass(), "value", term26475);
        setField(term26473, term26473.getClass(), "next", null);
        setElement(term26469, 63, term26473);
        setIntField(term26476, term26476.getClass(), "hash", 1626840120);
        setField(term26476, term26476.getClass(), "key", term26477);
        setField(term26476, term26476.getClass(), "value", term26478);
        setField(term26476, term26476.getClass(), "next", null);
        setElement(term26469, 80, term26476);
        setField(term26452, term26452.getClass(), "table", term26469);
        setIntField(term26452, term26452.getClass(), "count", 1398204343);
        setIntField(term26452, term26452.getClass(), "threshold", 71);
        setFloatField(term26452, term26452.getClass(), "loadFactor", 0.75F);
        setIntField(term26452, term26452.getClass(), "modCount", 229204371);
        setField(term26452, term26452.getClass(), "keySet", term26479);
        setField(term26452, term26452.getClass(), "entrySet", term26481);
        setField(term26452, term26452.getClass(), "values", term26483);
        term26485 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term8273;
        callMethod(klass, "putAll", argTypes, term8181, args);
        assertTrue(recursiveEquals(term8181, term26452));
        assertTrue(recursiveEquals(term8273, term26485));
    }

};


