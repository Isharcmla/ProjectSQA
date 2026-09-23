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

public class Selector_select_917508786332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311336;
     Object term311683;
     Object term311668;

    public Selector_select_917508786332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311336 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term311683 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term311683, term311683.getClass(), "building", false);
        setField(term311683, term311683.getClass(), "curChunk", null);
        setField(term311683, term311683.getClass(), "spine", null);
        setIntField(term311683, term311683.getClass(), "initialChunkPower", 0);
        setIntField(term311683, term311683.getClass(), "elementIndex", 0);
        setIntField(term311683, term311683.getClass(), "spineIndex", 0);
        setField(term311683, term311683.getClass(), "priorElementCount", null);
        ArrayList term311669 = new ArrayList();
        term311668 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term311668, term311668.getClass(), "contents", term311669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                 ";
        args[1] = term311336;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term311336, term311683));
        assertTrue(recursiveEquals(retValue, term311668));
    }

};


