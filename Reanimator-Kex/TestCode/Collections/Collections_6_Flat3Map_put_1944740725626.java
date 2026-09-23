package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_put_1944740725626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134868;
     Object term135368;
     Object term137352;
     Object term137363;

    public Flat3Map_put_1944740725626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134868 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134960 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135054 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term135184 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term135276 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term134431 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term134868, term134868.getClass(), "delegateMap", null);
        setIntField(term134868, term134868.getClass(), "size", 3);
        setIntField(term134868, term134868.getClass(), "hash3", 623362048);
        setField(term134960, term134960.getClass(), "delegateMap", null);
        setIntField(term134960, term134960.getClass(), "size", 3);
        setIntField(term135054, term135054.getClass(), "size", 0);
        setField(term134960, term134960.getClass(), "key3", term135054);
        setField(term134960, term134960.getClass(), "key2", null);
        setField(term134960, term134960.getClass(), "value2", null);
        setIntField(term134960, term134960.getClass(), "hash3", -1731720448);
        setIntField(term134960, term134960.getClass(), "hash2", -60686332);
        setIntField(term134960, term134960.getClass(), "hash1", 639631593);
        setField(term134960, term134960.getClass(), "key1", term135184);
        setField(term134960, term134960.getClass(), "value3", null);
        setField(term134960, term134960.getClass(), "value1", null);
        setField(term134868, term134868.getClass(), "key3", term134960);
        setIntField(term134868, term134868.getClass(), "hash2", 623362048);
        setField(term134868, term134868.getClass(), "key2", null);
        setIntField(term134868, term134868.getClass(), "hash1", 623362048);
        setField(term134868, term134868.getClass(), "key1", null);
        setField(term134868, term134868.getClass(), "value3", term135276);
        setField(term134868, term134868.getClass(), "value2", null);
        setField(term134868, term134868.getClass(), "value1", term134431);
        term135368 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135460 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term135368, term135368.getClass(), "delegateMap", null);
        setIntField(term135368, term135368.getClass(), "size", 3);
        setIntField(term135368, term135368.getClass(), "hash3", 978321408);
        setField(term135368, term135368.getClass(), "value3", null);
        setIntField(term135368, term135368.getClass(), "hash2", 1107673088);
        setField(term135368, term135368.getClass(), "value2", null);
        setIntField(term135368, term135368.getClass(), "hash1", -1462632448);
        setField(term135368, term135368.getClass(), "value1", null);
        setField(term135368, term135368.getClass(), "key3", null);
        setField(term135460, term135460.getClass(), "delegateMap", null);
        setIntField(term135460, term135460.getClass(), "size", 2);
        setIntField(term135460, term135460.getClass(), "hash2", 16);
        setField(term135460, term135460.getClass(), "value2", null);
        setIntField(term135460, term135460.getClass(), "hash1", 1073741823);
        setField(term135460, term135460.getClass(), "value1", null);
        setField(term135368, term135368.getClass(), "key2", term135460);
        term137352 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137353 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term137354 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term137355 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term137356 = newInstance(Class.forName("java.lang.Object"));
        Object[] term137357 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term137358 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term137359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137360 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137361 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term137362 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term137352, term137352.getClass(), "size", 0);
        setIntField(term137352, term137352.getClass(), "hash1", 0);
        setIntField(term137352, term137352.getClass(), "hash2", 0);
        setIntField(term137352, term137352.getClass(), "hash3", 0);
        setField(term137352, term137352.getClass(), "key1", null);
        setField(term137352, term137352.getClass(), "key2", null);
        setField(term137352, term137352.getClass(), "key3", null);
        setField(term137352, term137352.getClass(), "value1", null);
        setField(term137352, term137352.getClass(), "value2", null);
        setField(term137352, term137352.getClass(), "value3", null);
        setFloatField(term137353, term137353.getClass(), "loadFactor", 0.75F);
        setIntField(term137353, term137353.getClass(), "size", 3);
        setField(term137355, term137355.getClass(), "next", null);
        setField(term137355, term137355.getClass(), "key", term137356);
        setField(term137355, term137355.getClass(), "value", term137357);
        setElement(term137354, 5, term137355);
        setField(term137358, term137358.getClass(), "next", null);
        setIntField(term137359, term137359.getClass(), "size", 3);
        setIntField(term137359, term137359.getClass(), "hash1", 639631593);
        setIntField(term137359, term137359.getClass(), "hash2", -60686332);
        setIntField(term137359, term137359.getClass(), "hash3", -1731720448);
        setField(term137359, term137359.getClass(), "key1", null);
        setField(term137359, term137359.getClass(), "key2", null);
        setField(term137359, term137359.getClass(), "key3", null);
        setField(term137359, term137359.getClass(), "value1", null);
        setField(term137359, term137359.getClass(), "value2", null);
        setField(term137359, term137359.getClass(), "value3", null);
        setField(term137359, term137359.getClass(), "delegateMap", null);
        setField(term137358, term137358.getClass(), "key", term137359);
        setIntField(term137360, term137360.getClass(), "size", 0);
        setIntField(term137360, term137360.getClass(), "hash1", 0);
        setIntField(term137360, term137360.getClass(), "hash2", 0);
        setIntField(term137360, term137360.getClass(), "hash3", 0);
        setField(term137360, term137360.getClass(), "key1", null);
        setField(term137360, term137360.getClass(), "key2", null);
        setField(term137360, term137360.getClass(), "key3", null);
        setField(term137360, term137360.getClass(), "value1", null);
        setField(term137360, term137360.getClass(), "value2", null);
        setField(term137360, term137360.getClass(), "value3", null);
        setField(term137360, term137360.getClass(), "delegateMap", null);
        setField(term137358, term137358.getClass(), "value", term137360);
        setElement(term137354, 11, term137358);
        setField(term137361, term137361.getClass(), "next", null);
        setIntField(term137362, term137362.getClass(), "size", 3);
        setIntField(term137362, term137362.getClass(), "hash1", -1462632448);
        setIntField(term137362, term137362.getClass(), "hash2", 1107673088);
        setIntField(term137362, term137362.getClass(), "hash3", 978321408);
        setField(term137362, term137362.getClass(), "key1", null);
        setField(term137362, term137362.getClass(), "key2", null);
        setField(term137362, term137362.getClass(), "key3", null);
        setField(term137362, term137362.getClass(), "value1", null);
        setField(term137362, term137362.getClass(), "value2", null);
        setField(term137362, term137362.getClass(), "value3", null);
        setField(term137362, term137362.getClass(), "delegateMap", null);
        setField(term137361, term137361.getClass(), "key", term137362);
        setField(term137361, term137361.getClass(), "value", null);
        setElement(term137354, 14, term137361);
        setField(term137353, term137353.getClass(), "data", term137354);
        setIntField(term137353, term137353.getClass(), "threshold", 12);
        setIntField(term137353, term137353.getClass(), "modCount", 3);
        setField(term137353, term137353.getClass(), "entrySet", null);
        setField(term137353, term137353.getClass(), "keySet", null);
        setField(term137353, term137353.getClass(), "values", null);
        setField(term137353, term137353.getClass(), "keySet", null);
        setField(term137353, term137353.getClass(), "values", null);
        setField(term137352, term137352.getClass(), "delegateMap", term137353);
        term137363 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term137363, term137363.getClass(), "size", 3);
        setIntField(term137363, term137363.getClass(), "hash1", -1462632448);
        setIntField(term137363, term137363.getClass(), "hash2", 1107673088);
        setIntField(term137363, term137363.getClass(), "hash3", 978321408);
        setField(term137363, term137363.getClass(), "key1", null);
        setField(term137363, term137363.getClass(), "key2", null);
        setField(term137363, term137363.getClass(), "key3", null);
        setField(term137363, term137363.getClass(), "value1", null);
        setField(term137363, term137363.getClass(), "value2", null);
        setField(term137363, term137363.getClass(), "value3", null);
        setField(term137363, term137363.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term135368;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term134868, args);
        assertTrue(recursiveEquals(term134868, term137352));
        assertTrue(recursiveEquals(term135368, term137363));
        assertTrue(recursiveEquals(retValue, null));
    }

};


