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

public class Flat3Map_put_19447407251022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291133;
     Object term291503;

    public Flat3Map_put_19447407251022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term291273 = new HashMap();
        term291133 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term291225 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term291503 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term291549 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term291133, term291133.getClass(), "delegateMap", null);
        setIntField(term291133, term291133.getClass(), "size", 3);
        setIntField(term291133, term291133.getClass(), "hash3", -857997312);
        setField(term291225, term291225.getClass(), "delegateMap", null);
        setIntField(term291225, term291225.getClass(), "size", 3);
        setField(term291225, term291225.getClass(), "key3", term291273);
        setField(term291225, term291225.getClass(), "key2", null);
        setField(term291225, term291225.getClass(), "value2", null);
        setIntField(term291225, term291225.getClass(), "hash3", 546308225);
        setIntField(term291225, term291225.getClass(), "hash2", -536739840);
        setIntField(term291225, term291225.getClass(), "hash1", 1101013248);
        setField(term291225, term291225.getClass(), "value3", null);
        setField(term291225, term291225.getClass(), "value1", null);
        setField(term291133, term291133.getClass(), "key3", term291225);
        setIntField(term291133, term291133.getClass(), "hash2", 857997311);
        setIntField(term291133, term291133.getClass(), "hash1", -857997312);
        setField(term291133, term291133.getClass(), "key1", null);
        setField(term291133, term291133.getClass(), "value3", null);
        setField(term291133, term291133.getClass(), "key2", null);
        setField(term291503, term291503.getClass(), "delegateMap", null);
        setIntField(term291503, term291503.getClass(), "size", 3);
        setIntField(term291503, term291503.getClass(), "hash3", 844627968);
        setField(term291503, term291503.getClass(), "value3", null);
        setIntField(term291503, term291503.getClass(), "hash2", 1376780288);
        setField(term291503, term291503.getClass(), "value2", null);
        setIntField(term291503, term291503.getClass(), "hash1", 1215561728);
        setField(term291503, term291503.getClass(), "value1", null);
        setField(term291503, term291503.getClass(), "key3", null);
        setField(term291549, term291549.getClass(), "delegateMap", null);
        setIntField(term291549, term291549.getClass(), "size", 2);
        setIntField(term291549, term291549.getClass(), "hash2", 546308225);
        setField(term291549, term291549.getClass(), "value2", null);
        setIntField(term291549, term291549.getClass(), "hash1", 546308225);
        setField(term291549, term291549.getClass(), "value1", null);
        setField(term291503, term291503.getClass(), "key2", term291549);
        setField(term291133, term291133.getClass(), "value2", term291503);
        setField(term291133, term291133.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term291503;
        args[1] = null;
        callMethod(klass, "put", argTypes, term291133, args);
    }

};


