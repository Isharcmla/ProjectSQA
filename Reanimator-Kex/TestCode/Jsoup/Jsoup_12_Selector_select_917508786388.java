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

public class Selector_select_917508786388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351465;
     Object term352470;
     Object term352455;

    public Selector_select_917508786388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351465 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        term352470 = newInstance(Class.forName("java.util.stream.Nodes$SpinedNodeBuilder"));
        setBooleanField(term352470, term352470.getClass(), "building", false);
        setField(term352470, term352470.getClass(), "curChunk", null);
        setField(term352470, term352470.getClass(), "spine", null);
        setIntField(term352470, term352470.getClass(), "initialChunkPower", 0);
        setIntField(term352470, term352470.getClass(), "elementIndex", 0);
        setIntField(term352470, term352470.getClass(), "spineIndex", 0);
        setField(term352470, term352470.getClass(), "priorElementCount", null);
        ArrayList term352456 = new ArrayList();
        term352455 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term352455, term352455.getClass(), "contents", term352456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term351465;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term351465, term352470));
        assertTrue(recursiveEquals(retValue, term352455));
    }

};


