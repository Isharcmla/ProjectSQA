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

public class Flat3Map_mapIterator_833619088157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27304;
     Object term27353;
     Object term27350;

    public Flat3Map_mapIterator_833619088157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27304, term27304.getClass(), "delegateMap", null);
        setIntField(term27304, term27304.getClass(), "size", -1);
        term27353 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27353, term27353.getClass(), "size", -1);
        setIntField(term27353, term27353.getClass(), "hash1", 0);
        setIntField(term27353, term27353.getClass(), "hash2", 0);
        setIntField(term27353, term27353.getClass(), "hash3", 0);
        setField(term27353, term27353.getClass(), "key1", null);
        setField(term27353, term27353.getClass(), "key2", null);
        setField(term27353, term27353.getClass(), "key3", null);
        setField(term27353, term27353.getClass(), "value1", null);
        setField(term27353, term27353.getClass(), "value2", null);
        setField(term27353, term27353.getClass(), "value3", null);
        setField(term27353, term27353.getClass(), "delegateMap", null);
        term27350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$FlatMapIterator"));
        Object term27345 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27345, term27345.getClass(), "size", -1);
        setIntField(term27345, term27345.getClass(), "hash1", 0);
        setIntField(term27345, term27345.getClass(), "hash2", 0);
        setIntField(term27345, term27345.getClass(), "hash3", 0);
        setField(term27345, term27345.getClass(), "key1", null);
        setField(term27345, term27345.getClass(), "key2", null);
        setField(term27345, term27345.getClass(), "key3", null);
        setField(term27345, term27345.getClass(), "value1", null);
        setField(term27345, term27345.getClass(), "value2", null);
        setField(term27345, term27345.getClass(), "value3", null);
        setField(term27345, term27345.getClass(), "delegateMap", null);
        setField(term27350, term27350.getClass(), "parent", term27345);
        setIntField(term27350, term27350.getClass(), "nextIndex", 0);
        setBooleanField(term27350, term27350.getClass(), "canRemove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term27304, args);
        assertTrue(recursiveEquals(term27304, term27353));
        assertTrue(recursiveEquals(retValue, term27350));
    }

};
