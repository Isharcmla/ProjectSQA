package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attribute_equals_10770040106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155147;
     Object term155281;
     Object term155691;
     Object term155692;

    public Attribute_equals_10770040106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155147 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155281 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$MapReduceValuesToLongTask"));
        term155691 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155691, term155691.getClass(), "key", null);
        setField(term155691, term155691.getClass(), "val", null);
        setField(term155691, term155691.getClass(), "parent", null);
        term155692 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$MapReduceValuesToLongTask"));
        setField(term155692, term155692.getClass(), "transformer", null);
        setField(term155692, term155692.getClass(), "reducer", null);
        setLongField(term155692, term155692.getClass(), "basis", 0L);
        setLongField(term155692, term155692.getClass(), "result", 0L);
        setField(term155692, term155692.getClass(), "rights", null);
        setField(term155692, term155692.getClass(), "nextRight", null);
        setField(term155692, term155692.getClass(), "tab", null);
        setField(term155692, term155692.getClass(), "next", null);
        setField(term155692, term155692.getClass(), "stack", null);
        setField(term155692, term155692.getClass(), "spare", null);
        setIntField(term155692, term155692.getClass(), "index", 0);
        setIntField(term155692, term155692.getClass(), "baseIndex", 0);
        setIntField(term155692, term155692.getClass(), "baseLimit", 0);
        setIntField(term155692, term155692.getClass(), "baseSize", 0);
        setIntField(term155692, term155692.getClass(), "batch", 0);
        setField(term155692, term155692.getClass(), "completer", null);
        setIntField(term155692, term155692.getClass(), "pending", 0);
        setIntField(term155692, term155692.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155281;
        Object retValue = callMethod(klass, "equals", argTypes, term155147, args);
        assertTrue(recursiveEquals(term155147, term155691));
        assertTrue(recursiveEquals(term155281, term155692));
        assertTrue(recursiveEquals(retValue, false));
    }

};


