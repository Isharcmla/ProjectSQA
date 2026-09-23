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

public class Flat3Map_get_229621781347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57760;
     Object term57816;
     Object term57829;
     Object term57830;

    public Flat3Map_get_229621781347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term57760, term57760.getClass(), "delegateMap", null);
        setIntField(term57760, term57760.getClass(), "size", 1);
        setIntField(term57760, term57760.getClass(), "hash1", 0);
        term57816 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        term57829 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term57829, term57829.getClass(), "size", 1);
        setIntField(term57829, term57829.getClass(), "hash1", 0);
        setIntField(term57829, term57829.getClass(), "hash2", 0);
        setIntField(term57829, term57829.getClass(), "hash3", 0);
        setField(term57829, term57829.getClass(), "key1", null);
        setField(term57829, term57829.getClass(), "key2", null);
        setField(term57829, term57829.getClass(), "key3", null);
        setField(term57829, term57829.getClass(), "value1", null);
        setField(term57829, term57829.getClass(), "value2", null);
        setField(term57829, term57829.getClass(), "value3", null);
        setField(term57829, term57829.getClass(), "delegateMap", null);
        term57830 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        setIntField(term57830, term57830.getClass(), "expectedReloadCount", 0);
        setIntField(term57830, term57830.getClass(), "index", 0);
        setField(term57830, term57830.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57816;
        Object retValue = callMethod(klass, "get", argTypes, term57760, args);
        assertTrue(recursiveEquals(term57760, term57829));
        assertTrue(recursiveEquals(term57816, term57830));
        assertTrue(recursiveEquals(retValue, null));
    }

};


