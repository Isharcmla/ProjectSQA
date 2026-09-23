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

public class Selector_select_917508786342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316099;
     Object term316160;
     Object term316145;

    public Selector_select_917508786342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316099 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term316160 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term316160, term316160.getClass(), "building", false);
        setField(term316160, term316160.getClass(), "curChunk", null);
        setField(term316160, term316160.getClass(), "spine", null);
        setIntField(term316160, term316160.getClass(), "initialChunkPower", 0);
        setIntField(term316160, term316160.getClass(), "elementIndex", 0);
        setIntField(term316160, term316160.getClass(), "spineIndex", 0);
        setField(term316160, term316160.getClass(), "priorElementCount", null);
        ArrayList term316146 = new ArrayList();
        term316145 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term316145, term316145.getClass(), "contents", term316146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                 ";
        args[1] = term316099;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term316099, term316160));
        assertTrue(recursiveEquals(retValue, term316145));
    }

};


