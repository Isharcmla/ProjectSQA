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

public class Selector_select_917508786350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318300;
     Object term319305;
     Object term319290;

    public Selector_select_917508786350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318300 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term319305 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term319305, term319305.getClass(), "building", false);
        setField(term319305, term319305.getClass(), "curChunk", null);
        setField(term319305, term319305.getClass(), "spine", null);
        setIntField(term319305, term319305.getClass(), "initialChunkPower", 0);
        setIntField(term319305, term319305.getClass(), "elementIndex", 0);
        setIntField(term319305, term319305.getClass(), "spineIndex", 0);
        setField(term319305, term319305.getClass(), "priorElementCount", null);
        ArrayList term319291 = new ArrayList();
        term319290 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term319290, term319290.getClass(), "contents", term319291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term318300;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term318300, term319305));
        assertTrue(recursiveEquals(retValue, term319290));
    }

};


