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

public class Attributes_equals_1603080095140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89008;
     Object term89082;
     Object term89243;
     Object term89244;

    public Attributes_equals_1603080095140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89008 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term89082 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        term89243 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term89243, term89243.getClass(), "size", 0);
        setField(term89243, term89243.getClass(), "keys", null);
        setField(term89243, term89243.getClass(), "vals", null);
        term89244 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        setField(term89244, term89244.getClass(), "bb", null);
        setField(term89244, term89244.getClass(), "hb", null);
        setIntField(term89244, term89244.getClass(), "offset", 0);
        setBooleanField(term89244, term89244.getClass(), "isReadOnly", false);
        setIntField(term89244, term89244.getClass(), "mark", 0);
        setIntField(term89244, term89244.getClass(), "position", 0);
        setIntField(term89244, term89244.getClass(), "limit", 0);
        setIntField(term89244, term89244.getClass(), "capacity", 0);
        setLongField(term89244, term89244.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89082;
        Object retValue = callMethod(klass, "equals", argTypes, term89008, args);
        assertTrue(recursiveEquals(term89008, term89243));
        assertTrue(recursiveEquals(term89082, term89244));
        assertTrue(recursiveEquals(retValue, false));
    }

};


