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

public class Selector_select_917508786339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313361;
     Object term314997;
     Object term314982;

    public Selector_select_917508786339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313361 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term314997 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term314997, term314997.getClass(), "building", false);
        setField(term314997, term314997.getClass(), "curChunk", null);
        setField(term314997, term314997.getClass(), "spine", null);
        setIntField(term314997, term314997.getClass(), "initialChunkPower", 0);
        setIntField(term314997, term314997.getClass(), "elementIndex", 0);
        setIntField(term314997, term314997.getClass(), "spineIndex", 0);
        setField(term314997, term314997.getClass(), "priorElementCount", null);
        ArrayList term314983 = new ArrayList();
        term314982 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term314982, term314982.getClass(), "contents", term314983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term313361;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term313361, term314997));
        assertTrue(recursiveEquals(retValue, term314982));
    }

};


