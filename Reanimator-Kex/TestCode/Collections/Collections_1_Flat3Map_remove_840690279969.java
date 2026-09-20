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

public class Flat3Map_remove_840690279969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194294;
     Object term194370;
     Object term195086;
     Object term195087;

    public Flat3Map_remove_840690279969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term194294, term194294.getClass(), "delegateMap", null);
        setIntField(term194294, term194294.getClass(), "size", 1);
        setIntField(term194294, term194294.getClass(), "hash1", 0);
        term194370 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        term195086 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term195086, term195086.getClass(), "size", 1);
        setIntField(term195086, term195086.getClass(), "hash1", 0);
        setIntField(term195086, term195086.getClass(), "hash2", 0);
        setIntField(term195086, term195086.getClass(), "hash3", 0);
        setField(term195086, term195086.getClass(), "key1", null);
        setField(term195086, term195086.getClass(), "key2", null);
        setField(term195086, term195086.getClass(), "key3", null);
        setField(term195086, term195086.getClass(), "value1", null);
        setField(term195086, term195086.getClass(), "value2", null);
        setField(term195086, term195086.getClass(), "value3", null);
        setField(term195086, term195086.getClass(), "delegateMap", null);
        term195087 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        setField(term195087, term195087.getClass(), "this$1", null);
        setField(term195087, term195087.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term194370;
        Object retValue = callMethod(klass, "remove", argTypes, term194294, args);
        assertTrue(recursiveEquals(term194294, term195086));
        assertTrue(recursiveEquals(term194370, term195087));
        assertTrue(recursiveEquals(retValue, null));
    }

};
