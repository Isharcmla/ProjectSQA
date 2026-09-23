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

public class Flat3Map_equals_1826922527445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80612;
     Object term80704;
     Object term80748;
     Object term80749;

    public Flat3Map_equals_1826922527445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80612 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term80612, term80612.getClass(), "delegateMap", null);
        setIntField(term80612, term80612.getClass(), "size", 2);
        term80704 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term80704, term80704.getClass(), "delegateMap", null);
        setIntField(term80704, term80704.getClass(), "size", 2);
        term80748 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term80748, term80748.getClass(), "size", 2);
        setIntField(term80748, term80748.getClass(), "hash1", 0);
        setIntField(term80748, term80748.getClass(), "hash2", 0);
        setIntField(term80748, term80748.getClass(), "hash3", 0);
        setField(term80748, term80748.getClass(), "key1", null);
        setField(term80748, term80748.getClass(), "key2", null);
        setField(term80748, term80748.getClass(), "key3", null);
        setField(term80748, term80748.getClass(), "value1", null);
        setField(term80748, term80748.getClass(), "value2", null);
        setField(term80748, term80748.getClass(), "value3", null);
        setField(term80748, term80748.getClass(), "delegateMap", null);
        term80749 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term80749, term80749.getClass(), "size", 2);
        setIntField(term80749, term80749.getClass(), "hash1", 0);
        setIntField(term80749, term80749.getClass(), "hash2", 0);
        setIntField(term80749, term80749.getClass(), "hash3", 0);
        setField(term80749, term80749.getClass(), "key1", null);
        setField(term80749, term80749.getClass(), "key2", null);
        setField(term80749, term80749.getClass(), "key3", null);
        setField(term80749, term80749.getClass(), "value1", null);
        setField(term80749, term80749.getClass(), "value2", null);
        setField(term80749, term80749.getClass(), "value3", null);
        setField(term80749, term80749.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80704;
        Object retValue = callMethod(klass, "equals", argTypes, term80612, args);
        assertTrue(recursiveEquals(term80612, term80748));
        assertTrue(recursiveEquals(term80704, term80749));
        assertTrue(recursiveEquals(retValue, true));
    }

};


