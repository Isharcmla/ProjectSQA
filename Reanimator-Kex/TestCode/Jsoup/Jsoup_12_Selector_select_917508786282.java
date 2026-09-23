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

public class Selector_select_917508786282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287142;
     Object term287203;
     Object term287188;

    public Selector_select_917508786282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287142 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term287203 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term287203, term287203.getClass(), "building", false);
        setField(term287203, term287203.getClass(), "curChunk", null);
        setField(term287203, term287203.getClass(), "spine", null);
        setIntField(term287203, term287203.getClass(), "initialChunkPower", 0);
        setIntField(term287203, term287203.getClass(), "elementIndex", 0);
        setIntField(term287203, term287203.getClass(), "spineIndex", 0);
        setField(term287203, term287203.getClass(), "priorElementCount", null);
        ArrayList term287189 = new ArrayList();
        term287188 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term287188, term287188.getClass(), "contents", term287189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                 ";
        args[1] = term287142;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term287142, term287203));
        assertTrue(recursiveEquals(retValue, term287188));
    }

};


