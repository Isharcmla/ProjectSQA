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

public class Flat3Map_put_1944740725959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265280;
     Object term265234;
     Object term265417;
     Object term265419;

    public Flat3Map_put_1944740725959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265326 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265345 = newInstance(Class.forName("java.lang.Object"));
        Object[] term264398 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term265392 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term265280, term265280.getClass(), "delegateMap", null);
        setIntField(term265280, term265280.getClass(), "size", 2);
        setIntField(term265280, term265280.getClass(), "hash3", 164010000);
        setField(term265326, term265326.getClass(), "delegateMap", null);
        setIntField(term265326, term265326.getClass(), "size", 3);
        setField(term265326, term265326.getClass(), "key3", term265345);
        setField(term265326, term265326.getClass(), "key2", null);
        setField(term265326, term265326.getClass(), "value2", null);
        setIntField(term265326, term265326.getClass(), "hash3", -1607466976);
        setIntField(term265326, term265326.getClass(), "hash2", 141574146);
        setIntField(term265326, term265326.getClass(), "hash1", -2080370680);
        setField(term265326, term265326.getClass(), "key1", term264398);
        setField(term265326, term265326.getClass(), "value3", null);
        setField(term265326, term265326.getClass(), "value1", null);
        setField(term265280, term265280.getClass(), "key3", term265326);
        setIntField(term265280, term265280.getClass(), "hash2", 35659793);
        setField(term265280, term265280.getClass(), "value2", null);
        setIntField(term265280, term265280.getClass(), "hash1", 15237120);
        setField(term265280, term265280.getClass(), "value1", null);
        setField(term265280, term265280.getClass(), "key2", null);
        setField(term265280, term265280.getClass(), "key1", null);
        setField(term265280, term265280.getClass(), "value3", term265392);
        term265234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term265234, term265234.getClass(), "delegateMap", null);
        setIntField(term265234, term265234.getClass(), "size", 3);
        setIntField(term265234, term265234.getClass(), "hash3", 103716880);
        setField(term265234, term265234.getClass(), "value3", null);
        setIntField(term265234, term265234.getClass(), "hash2", 2139127808);
        setField(term265234, term265234.getClass(), "value2", null);
        setIntField(term265234, term265234.getClass(), "hash1", -2078834688);
        setField(term265234, term265234.getClass(), "value1", null);
        setField(term265234, term265234.getClass(), "key3", null);
        setField(term265234, term265234.getClass(), "key2", term265280);
        term265417 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265418 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term265417, term265417.getClass(), "size", 3);
        setIntField(term265417, term265417.getClass(), "hash1", 15237120);
        setIntField(term265417, term265417.getClass(), "hash2", 35659793);
        setIntField(term265417, term265417.getClass(), "hash3", 164010000);
        setField(term265417, term265417.getClass(), "key1", null);
        setField(term265417, term265417.getClass(), "key2", null);
        setIntField(term265418, term265418.getClass(), "size", 3);
        setIntField(term265418, term265418.getClass(), "hash1", -2078834688);
        setIntField(term265418, term265418.getClass(), "hash2", 2139127808);
        setIntField(term265418, term265418.getClass(), "hash3", 103716880);
        setField(term265418, term265418.getClass(), "key1", null);
        setField(term265418, term265418.getClass(), "key2", term265417);
        setField(term265418, term265418.getClass(), "key3", null);
        setField(term265418, term265418.getClass(), "value1", null);
        setField(term265418, term265418.getClass(), "value2", null);
        setField(term265418, term265418.getClass(), "value3", null);
        setField(term265418, term265418.getClass(), "delegateMap", null);
        setField(term265417, term265417.getClass(), "key3", term265418);
        setField(term265417, term265417.getClass(), "value1", null);
        setField(term265417, term265417.getClass(), "value2", null);
        setField(term265417, term265417.getClass(), "value3", null);
        setField(term265417, term265417.getClass(), "delegateMap", null);
        term265419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term265419, term265419.getClass(), "size", 3);
        setIntField(term265419, term265419.getClass(), "hash1", -2078834688);
        setIntField(term265419, term265419.getClass(), "hash2", 2139127808);
        setIntField(term265419, term265419.getClass(), "hash3", 103716880);
        setField(term265419, term265419.getClass(), "key1", null);
        setIntField(term265420, term265420.getClass(), "size", 3);
        setIntField(term265420, term265420.getClass(), "hash1", 15237120);
        setIntField(term265420, term265420.getClass(), "hash2", 35659793);
        setIntField(term265420, term265420.getClass(), "hash3", 164010000);
        setField(term265420, term265420.getClass(), "key1", null);
        setField(term265420, term265420.getClass(), "key2", null);
        setField(term265420, term265420.getClass(), "key3", term265419);
        setField(term265420, term265420.getClass(), "value1", null);
        setField(term265420, term265420.getClass(), "value2", null);
        setField(term265420, term265420.getClass(), "value3", null);
        setField(term265420, term265420.getClass(), "delegateMap", null);
        setField(term265419, term265419.getClass(), "key2", term265420);
        setField(term265419, term265419.getClass(), "key3", null);
        setField(term265419, term265419.getClass(), "value1", null);
        setField(term265419, term265419.getClass(), "value2", null);
        setField(term265419, term265419.getClass(), "value3", null);
        setField(term265419, term265419.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term265234;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term265280, args);
        assertTrue(recursiveEquals(term265280, term265417));
        assertTrue(recursiveEquals(term265234, term265419));
        assertTrue(recursiveEquals(retValue, null));
    }

};


