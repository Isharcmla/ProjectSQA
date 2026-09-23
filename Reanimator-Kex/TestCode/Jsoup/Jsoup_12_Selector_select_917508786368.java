package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.util.ArrayList;

public class Selector_select_917508786368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341234;
     Object term342239;
     Object term342224;

    public Selector_select_917508786368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341234 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term342239 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term342239, term342239.getClass(), "building", false);
        setField(term342239, term342239.getClass(), "curChunk", null);
        setField(term342239, term342239.getClass(), "spine", null);
        setIntField(term342239, term342239.getClass(), "initialChunkPower", 0);
        setIntField(term342239, term342239.getClass(), "elementIndex", 0);
        setIntField(term342239, term342239.getClass(), "spineIndex", 0);
        setField(term342239, term342239.getClass(), "priorElementCount", null);
        ArrayList term342225 = new ArrayList();
        term342224 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term342224, term342224.getClass(), "contents", term342225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term341234;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term341234, term342239));
        assertTrue(recursiveEquals(retValue, term342224));
    }

};


