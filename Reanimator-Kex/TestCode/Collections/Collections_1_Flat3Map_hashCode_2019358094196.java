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

public class Flat3Map_hashCode_2019358094196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32762;
     Object term33641;

    public Flat3Map_hashCode_2019358094196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32762 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term32854 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term32946 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32762, term32762.getClass(), "delegateMap", null);
        setIntField(term32762, term32762.getClass(), "size", 3);
        setIntField(term32762, term32762.getClass(), "hash3", 0);
        setField(term32762, term32762.getClass(), "value3", null);
        setIntField(term32762, term32762.getClass(), "hash2", 0);
        setField(term32854, term32854.getClass(), "delegateMap", null);
        setIntField(term32854, term32854.getClass(), "size", 0);
        setField(term32762, term32762.getClass(), "value2", term32854);
        setIntField(term32762, term32762.getClass(), "hash1", 0);
        setField(term32762, term32762.getClass(), "value1", term32946);
        term33641 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term33642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term33643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term33641, term33641.getClass(), "size", 3);
        setIntField(term33641, term33641.getClass(), "hash1", 0);
        setIntField(term33641, term33641.getClass(), "hash2", 0);
        setIntField(term33641, term33641.getClass(), "hash3", 0);
        setField(term33641, term33641.getClass(), "key1", null);
        setField(term33641, term33641.getClass(), "key2", null);
        setField(term33641, term33641.getClass(), "key3", null);
        setIntField(term33642, term33642.getClass(), "size", 0);
        setIntField(term33642, term33642.getClass(), "hash1", 0);
        setIntField(term33642, term33642.getClass(), "hash2", 0);
        setIntField(term33642, term33642.getClass(), "hash3", 0);
        setField(term33642, term33642.getClass(), "key1", null);
        setField(term33642, term33642.getClass(), "key2", null);
        setField(term33642, term33642.getClass(), "key3", null);
        setField(term33642, term33642.getClass(), "value1", null);
        setField(term33642, term33642.getClass(), "value2", null);
        setField(term33642, term33642.getClass(), "value3", null);
        setField(term33642, term33642.getClass(), "delegateMap", null);
        setField(term33641, term33641.getClass(), "value1", term33642);
        setIntField(term33643, term33643.getClass(), "size", 0);
        setIntField(term33643, term33643.getClass(), "hash1", 0);
        setIntField(term33643, term33643.getClass(), "hash2", 0);
        setIntField(term33643, term33643.getClass(), "hash3", 0);
        setField(term33643, term33643.getClass(), "key1", null);
        setField(term33643, term33643.getClass(), "key2", null);
        setField(term33643, term33643.getClass(), "key3", null);
        setField(term33643, term33643.getClass(), "value1", null);
        setField(term33643, term33643.getClass(), "value2", null);
        setField(term33643, term33643.getClass(), "value3", null);
        setField(term33643, term33643.getClass(), "delegateMap", null);
        setField(term33641, term33641.getClass(), "value2", term33643);
        setField(term33641, term33641.getClass(), "value3", null);
        setField(term33641, term33641.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32762, args);
        assertTrue(recursiveEquals(term32762, term33641));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
