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

public class Flat3Map_equals_1826922527653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127670;
     Object term127868;
     Object term127958;
     Object term127960;

    public Flat3Map_equals_1826922527653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127776 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJShort$Sorter"));
        setField(term127670, term127670.getClass(), "delegateMap", null);
        setIntField(term127670, term127670.getClass(), "size", 3);
        setField(term127670, term127670.getClass(), "key3", null);
        setField(term127670, term127670.getClass(), "value3", null);
        setField(term127670, term127670.getClass(), "key2", null);
        setField(term127670, term127670.getClass(), "value2", null);
        setField(term127670, term127670.getClass(), "key1", term127776);
        term127868 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term127868, term127868.getClass(), "delegateMap", null);
        setIntField(term127868, term127868.getClass(), "size", 3);
        setField(term127868, term127868.getClass(), "key3", null);
        setField(term127868, term127868.getClass(), "value3", null);
        term127958 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127959 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJShort$Sorter"));
        setIntField(term127958, term127958.getClass(), "size", 3);
        setIntField(term127958, term127958.getClass(), "hash1", 0);
        setIntField(term127958, term127958.getClass(), "hash2", 0);
        setIntField(term127958, term127958.getClass(), "hash3", 0);
        setField(term127959, term127959.getClass(), "a", null);
        setField(term127959, term127959.getClass(), "w", null);
        setIntField(term127959, term127959.getClass(), "base", 0);
        setIntField(term127959, term127959.getClass(), "size", 0);
        setIntField(term127959, term127959.getClass(), "wbase", 0);
        setIntField(term127959, term127959.getClass(), "gran", 0);
        setField(term127959, term127959.getClass(), "completer", null);
        setIntField(term127959, term127959.getClass(), "pending", 0);
        setIntField(term127959, term127959.getClass(), "status", 0);
        setField(term127958, term127958.getClass(), "key1", term127959);
        setField(term127958, term127958.getClass(), "key2", null);
        setField(term127958, term127958.getClass(), "key3", null);
        setField(term127958, term127958.getClass(), "value1", null);
        setField(term127958, term127958.getClass(), "value2", null);
        setField(term127958, term127958.getClass(), "value3", null);
        setField(term127958, term127958.getClass(), "delegateMap", null);
        term127960 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term127960, term127960.getClass(), "size", 3);
        setIntField(term127960, term127960.getClass(), "hash1", 0);
        setIntField(term127960, term127960.getClass(), "hash2", 0);
        setIntField(term127960, term127960.getClass(), "hash3", 0);
        setField(term127960, term127960.getClass(), "key1", null);
        setField(term127960, term127960.getClass(), "key2", null);
        setField(term127960, term127960.getClass(), "key3", null);
        setField(term127960, term127960.getClass(), "value1", null);
        setField(term127960, term127960.getClass(), "value2", null);
        setField(term127960, term127960.getClass(), "value3", null);
        setField(term127960, term127960.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127868;
        Object retValue = callMethod(klass, "equals", argTypes, term127670, args);
        assertTrue(recursiveEquals(term127670, term127958));
        assertTrue(recursiveEquals(term127868, term127960));
        assertTrue(recursiveEquals(retValue, false));
    }

};
