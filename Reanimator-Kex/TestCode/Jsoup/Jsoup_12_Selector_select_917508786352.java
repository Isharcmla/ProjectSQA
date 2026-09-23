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

public class Selector_select_917508786352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320482;
     Object term321487;
     Object term321472;

    public Selector_select_917508786352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320482 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term321487 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term321487, term321487.getClass(), "building", false);
        setField(term321487, term321487.getClass(), "curChunk", null);
        setField(term321487, term321487.getClass(), "spine", null);
        setIntField(term321487, term321487.getClass(), "initialChunkPower", 0);
        setIntField(term321487, term321487.getClass(), "elementIndex", 0);
        setIntField(term321487, term321487.getClass(), "spineIndex", 0);
        setField(term321487, term321487.getClass(), "priorElementCount", null);
        ArrayList term321473 = new ArrayList();
        term321472 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term321472, term321472.getClass(), "contents", term321473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term320482;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term320482, term321487));
        assertTrue(recursiveEquals(retValue, term321472));
    }

};


