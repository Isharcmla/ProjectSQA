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

public class Flat3Map_remove_840690279986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197307;
     Object term197383;
     Object term197567;
     Object term197568;

    public Flat3Map_remove_840690279986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197307 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term197307, term197307.getClass(), "delegateMap", null);
        setIntField(term197307, term197307.getClass(), "size", 3);
        term197383 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        term197567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197567, term197567.getClass(), "size", 3);
        setIntField(term197567, term197567.getClass(), "hash1", 0);
        setIntField(term197567, term197567.getClass(), "hash2", 0);
        setIntField(term197567, term197567.getClass(), "hash3", 0);
        setField(term197567, term197567.getClass(), "key1", null);
        setField(term197567, term197567.getClass(), "key2", null);
        setField(term197567, term197567.getClass(), "key3", null);
        setField(term197567, term197567.getClass(), "value1", null);
        setField(term197567, term197567.getClass(), "value2", null);
        setField(term197567, term197567.getClass(), "value3", null);
        setField(term197567, term197567.getClass(), "delegateMap", null);
        term197568 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        setField(term197568, term197568.getClass(), "this$1", null);
        setField(term197568, term197568.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197383;
        Object retValue = callMethod(klass, "remove", argTypes, term197307, args);
        assertTrue(recursiveEquals(term197307, term197567));
        assertTrue(recursiveEquals(term197383, term197568));
        assertTrue(recursiveEquals(retValue, null));
    }

};
