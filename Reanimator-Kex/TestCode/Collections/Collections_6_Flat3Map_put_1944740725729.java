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
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185633;
     Object term185913;

    public Flat3Map_put_1944740725729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term185773 = new HashMap();
        HashMap term185821 = new HashMap();
        term185633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185725 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term185249 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term185633, term185633.getClass(), "delegateMap", null);
        setIntField(term185633, term185633.getClass(), "size", 3);
        setIntField(term185633, term185633.getClass(), "hash3", 1270883364);
        setField(term185725, term185725.getClass(), "delegateMap", null);
        setIntField(term185725, term185725.getClass(), "size", 3);
        setField(term185725, term185725.getClass(), "key3", term185773);
        setField(term185725, term185725.getClass(), "key2", null);
        setField(term185725, term185725.getClass(), "value2", term185821);
        setIntField(term185725, term185725.getClass(), "hash3", -2011168768);
        setField(term185725, term185725.getClass(), "value3", null);
        setIntField(term185725, term185725.getClass(), "hash2", 1347716608);
        setIntField(term185725, term185725.getClass(), "hash1", 83922176);
        setField(term185725, term185725.getClass(), "value1", null);
        setField(term185633, term185633.getClass(), "key3", term185725);
        setIntField(term185633, term185633.getClass(), "hash2", 1270883364);
        setField(term185633, term185633.getClass(), "key2", null);
        setIntField(term185633, term185633.getClass(), "hash1", 1270883364);
        setField(term185633, term185633.getClass(), "key1", null);
        setField(term185633, term185633.getClass(), "value3", term185249);
        setField(term185633, term185633.getClass(), "value2", null);
        setField(term185633, term185633.getClass(), "value1", null);
        term185913 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term185913, term185913.getClass(), "delegateMap", null);
        setIntField(term185913, term185913.getClass(), "size", 3);
        setIntField(term185913, term185913.getClass(), "hash3", 264241188);
        setField(term185913, term185913.getClass(), "value3", null);
        setIntField(term185913, term185913.getClass(), "hash2", 469771264);
        setField(term185913, term185913.getClass(), "value2", null);
        setIntField(term185913, term185913.getClass(), "hash1", 536870912);
        setField(term185913, term185913.getClass(), "value1", null);
        setField(term185913, term185913.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term185913;
        args[1] = null;
        callMethod(klass, "put", argTypes, term185633, args);
    }

};


