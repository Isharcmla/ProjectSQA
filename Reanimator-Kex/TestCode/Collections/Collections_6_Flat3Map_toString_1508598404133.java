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

public class Flat3Map_toString_1508598404133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23866;
     Object term23917;

    public Flat3Map_toString_1508598404133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23866 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term23866, term23866.getClass(), "delegateMap", null);
        setIntField(term23866, term23866.getClass(), "size", 2);
        term23917 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term23917, term23917.getClass(), "size", 2);
        setIntField(term23917, term23917.getClass(), "hash1", 0);
        setIntField(term23917, term23917.getClass(), "hash2", 0);
        setIntField(term23917, term23917.getClass(), "hash3", 0);
        setField(term23917, term23917.getClass(), "key1", null);
        setField(term23917, term23917.getClass(), "key2", null);
        setField(term23917, term23917.getClass(), "key3", null);
        setField(term23917, term23917.getClass(), "value1", null);
        setField(term23917, term23917.getClass(), "value2", null);
        setField(term23917, term23917.getClass(), "value3", null);
        setField(term23917, term23917.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term23866, args);
        assertTrue(recursiveEquals(term23866, term23917));
        assertTrue(recursiveEquals(retValue, "{null=null,null=null}"));
    }

};


