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

public class Selector_select_917508786357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323776;
     Object term325970;
     Object term325955;

    public Selector_select_917508786357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323776 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term325970 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term325970, term325970.getClass(), "building", false);
        setField(term325970, term325970.getClass(), "curChunk", null);
        setField(term325970, term325970.getClass(), "spine", null);
        setIntField(term325970, term325970.getClass(), "initialChunkPower", 0);
        setIntField(term325970, term325970.getClass(), "elementIndex", 0);
        setIntField(term325970, term325970.getClass(), "spineIndex", 0);
        setField(term325970, term325970.getClass(), "priorElementCount", null);
        ArrayList term325956 = new ArrayList();
        term325955 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term325955, term325955.getClass(), "contents", term325956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term323776;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term323776, term325970));
        assertTrue(recursiveEquals(retValue, term325955));
    }

};


