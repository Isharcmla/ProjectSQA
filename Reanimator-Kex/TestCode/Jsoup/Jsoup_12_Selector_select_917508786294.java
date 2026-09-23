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

public class Selector_select_917508786294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293837;
     Object term293898;
     Object term293883;

    public Selector_select_917508786294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293837 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term293898 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term293898, term293898.getClass(), "building", false);
        setField(term293898, term293898.getClass(), "curChunk", null);
        setField(term293898, term293898.getClass(), "spine", null);
        setIntField(term293898, term293898.getClass(), "initialChunkPower", 0);
        setIntField(term293898, term293898.getClass(), "elementIndex", 0);
        setIntField(term293898, term293898.getClass(), "spineIndex", 0);
        setField(term293898, term293898.getClass(), "priorElementCount", null);
        ArrayList term293884 = new ArrayList();
        term293883 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term293883, term293883.getClass(), "contents", term293884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                 ";
        args[1] = term293837;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term293837, term293898));
        assertTrue(recursiveEquals(retValue, term293883));
    }

};


