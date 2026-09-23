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

public class Flat3Map_hashCode_201935809454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14638;
     Object term14750;

    public Flat3Map_hashCode_201935809454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14638 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14638, term14638.getClass(), "delegateMap", null);
        term14750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14750, term14750.getClass(), "size", 0);
        setIntField(term14750, term14750.getClass(), "hash1", 0);
        setIntField(term14750, term14750.getClass(), "hash2", 0);
        setIntField(term14750, term14750.getClass(), "hash3", 0);
        setField(term14750, term14750.getClass(), "key1", null);
        setField(term14750, term14750.getClass(), "key2", null);
        setField(term14750, term14750.getClass(), "key3", null);
        setField(term14750, term14750.getClass(), "value1", null);
        setField(term14750, term14750.getClass(), "value2", null);
        setField(term14750, term14750.getClass(), "value3", null);
        setField(term14750, term14750.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14638, args);
        assertTrue(recursiveEquals(term14638, term14750));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


