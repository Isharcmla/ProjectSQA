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

public class Selector_select_917508786348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317459;
     Object term317520;
     Object term317505;

    public Selector_select_917508786348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317459 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term317520 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term317520, term317520.getClass(), "building", false);
        setField(term317520, term317520.getClass(), "curChunk", null);
        setField(term317520, term317520.getClass(), "spine", null);
        setIntField(term317520, term317520.getClass(), "initialChunkPower", 0);
        setIntField(term317520, term317520.getClass(), "elementIndex", 0);
        setIntField(term317520, term317520.getClass(), "spineIndex", 0);
        setField(term317520, term317520.getClass(), "priorElementCount", null);
        ArrayList term317506 = new ArrayList();
        term317505 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term317505, term317505.getClass(), "contents", term317506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                 ";
        args[1] = term317459;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term317459, term317520));
        assertTrue(recursiveEquals(retValue, term317505));
    }

};


