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

public class ExtendedProperties_getFloat_2026443291114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7203;

    public ExtendedProperties_getFloat_2026443291114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7209 = new ArrayList();
        ArrayList term7258 = new ArrayList();
        HashMap term7300 = new HashMap();
        Set<Object> term24411 =  ((Map) term7300).keySet();
        HashSet term7299 = new HashSet((Collection<? extends Object>) term24411);
        HashMap term7306 = new HashMap();
        Set<Object> term24412 =  ((Map) term7306).keySet();
        HashSet term7305 = new HashSet((Collection<? extends Object>) term24412);
        ArrayList term7311 = new ArrayList();
        term7203 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7204 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7213 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term7262 = (Object[]) newArray("java.util.Hashtable$Entry", 3071);
        Object term7263 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7265 = newInstance(Class.forName("java.lang.Object"));
        Object term7266 = newInstance(Class.forName("java.lang.Object"));
        Object term7267 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7269 = newInstance(Class.forName("java.lang.Object"));
        Object term7270 = newInstance(Class.forName("java.lang.Object"));
        Object term7271 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7273 = newInstance(Class.forName("java.lang.Object"));
        Object term7274 = newInstance(Class.forName("java.lang.Object"));
        Object term7275 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7277 = newInstance(Class.forName("java.lang.Object"));
        Object term7278 = newInstance(Class.forName("java.lang.Object"));
        Object term7279 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7281 = newInstance(Class.forName("java.lang.Object"));
        Object term7282 = newInstance(Class.forName("java.lang.Object"));
        Object term7283 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7285 = newInstance(Class.forName("java.lang.Object"));
        Object term7286 = newInstance(Class.forName("java.lang.Object"));
        Object term7287 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7289 = newInstance(Class.forName("java.lang.Object"));
        Object term7290 = newInstance(Class.forName("java.lang.Object"));
        Object term7291 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7293 = newInstance(Class.forName("java.lang.Object"));
        Object term7294 = newInstance(Class.forName("java.lang.Object"));
        setField(term7204, term7204.getClass(), "defaults", null);
        setField(term7204, term7204.getClass(), "file", null);
        setField(term7204, term7204.getClass(), "basePath", null);
        setField(term7204, term7204.getClass(), "fileSeparator", "/");
        setBooleanField(term7204, term7204.getClass(), "isInitialized", false);
        setField(term7204, term7204.getClass(), "includePropertyName", null);
        setField(term7204, term7204.getClass(), "keysAsListed", term7209);
        setField(term7204, term7204.getClass(), "table", term7213);
        setIntField(term7204, term7204.getClass(), "count", 0);
        setIntField(term7204, term7204.getClass(), "threshold", 8);
        setFloatField(term7204, term7204.getClass(), "loadFactor", 0.75F);
        setIntField(term7204, term7204.getClass(), "modCount", 0);
        setField(term7204, term7204.getClass(), "keySet", null);
        setField(term7204, term7204.getClass(), "entrySet", null);
        setField(term7204, term7204.getClass(), "values", null);
        setField(term7203, term7203.getClass(), "defaults", term7204);
        setField(term7203, term7203.getClass(), "file", "vKQukfbJUd");
        setField(term7203, term7203.getClass(), "basePath", "lFRJFUMVbx");
        setField(term7203, term7203.getClass(), "fileSeparator", "/");
        setBooleanField(term7203, term7203.getClass(), "isInitialized", false);
        setField(term7203, term7203.getClass(), "includePropertyName", "sZdUNdggUW");
        setField(term7203, term7203.getClass(), "keysAsListed", term7258);
        setIntField(term7263, term7263.getClass(), "hash", 1032660999);
        setField(term7263, term7263.getClass(), "key", term7265);
        setField(term7263, term7263.getClass(), "value", term7266);
        setField(term7263, term7263.getClass(), "next", null);
        setElement(term7262, 397, term7263);
        setIntField(term7267, term7267.getClass(), "hash", 232512267);
        setField(term7267, term7267.getClass(), "key", term7269);
        setField(term7267, term7267.getClass(), "value", term7270);
        setField(term7267, term7267.getClass(), "next", null);
        setElement(term7262, 715, term7267);
        setIntField(term7271, term7271.getClass(), "hash", 787107640);
        setField(term7271, term7271.getClass(), "key", term7273);
        setField(term7271, term7271.getClass(), "value", term7274);
        setField(term7271, term7271.getClass(), "next", null);
        setElement(term7262, 1127, term7271);
        setIntField(term7275, term7275.getClass(), "hash", 1375210749);
        setField(term7275, term7275.getClass(), "key", term7277);
        setField(term7275, term7275.getClass(), "value", term7278);
        setField(term7275, term7275.getClass(), "next", null);
        setElement(term7262, 1594, term7275);
        setIntField(term7279, term7279.getClass(), "hash", 1096950529);
        setField(term7279, term7279.getClass(), "key", term7281);
        setField(term7279, term7279.getClass(), "value", term7282);
        setField(term7279, term7279.getClass(), "next", null);
        setElement(term7262, 1613, term7279);
        setIntField(term7283, term7283.getClass(), "hash", 202902963);
        setField(term7283, term7283.getClass(), "key", term7285);
        setField(term7283, term7283.getClass(), "value", term7286);
        setField(term7283, term7283.getClass(), "next", null);
        setElement(term7262, 1993, term7283);
        setIntField(term7287, term7287.getClass(), "hash", 1004194584);
        setField(term7287, term7287.getClass(), "key", term7289);
        setField(term7287, term7287.getClass(), "value", term7290);
        setField(term7287, term7287.getClass(), "next", null);
        setElement(term7262, 2152, term7287);
        setIntField(term7291, term7291.getClass(), "hash", 746804878);
        setField(term7291, term7291.getClass(), "key", term7293);
        setField(term7291, term7291.getClass(), "value", term7294);
        setField(term7291, term7291.getClass(), "next", null);
        setElement(term7262, 2169, term7291);
        setField(term7203, term7203.getClass(), "table", term7262);
        setIntField(term7203, term7203.getClass(), "count", 9726687);
        setIntField(term7203, term7203.getClass(), "threshold", 2303);
        setFloatField(term7203, term7203.getClass(), "loadFactor", 0.75F);
        setIntField(term7203, term7203.getClass(), "modCount", -25637960);
        setField(term7203, term7203.getClass(), "keySet", term7299);
        setField(term7203, term7203.getClass(), "entrySet", term7305);
        setField(term7203, term7203.getClass(), "values", term7311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        try {
            callMethod(klass, "getFloat", argTypes, term7203, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


