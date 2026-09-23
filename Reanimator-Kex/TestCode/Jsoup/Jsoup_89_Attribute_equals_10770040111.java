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

public class Attribute_equals_10770040111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154578;
     Object term154650;
     Object term154664;
     Object term154665;

    public Attribute_equals_10770040111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154578 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154650 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRB"));
        term154664 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154664, term154664.getClass(), "key", null);
        setField(term154664, term154664.getClass(), "val", null);
        setField(term154664, term154664.getClass(), "parent", null);
        term154665 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRB"));
        setField(term154665, term154665.getClass(), "bb", null);
        setField(term154665, term154665.getClass(), "hb", null);
        setIntField(term154665, term154665.getClass(), "offset", 0);
        setBooleanField(term154665, term154665.getClass(), "isReadOnly", false);
        setIntField(term154665, term154665.getClass(), "mark", 0);
        setIntField(term154665, term154665.getClass(), "position", 0);
        setIntField(term154665, term154665.getClass(), "limit", 0);
        setIntField(term154665, term154665.getClass(), "capacity", 0);
        setLongField(term154665, term154665.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154650;
        Object retValue = callMethod(klass, "equals", argTypes, term154578, args);
        assertTrue(recursiveEquals(term154578, term154664));
        assertTrue(recursiveEquals(term154650, term154665));
        assertTrue(recursiveEquals(retValue, false));
    }

};


