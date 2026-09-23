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

public class Selector_select_917508786264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256089;
     Object term265610;
     Object term265595;

    public Selector_select_917508786264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256089 = newInstance(Class.forName("java.util.stream.SpinedBuffer"));
        term265610 = newInstance(Class.forName("java.util.stream.SpinedBuffer"));
        setField(term265610, term265610.getClass(), "curChunk", null);
        setField(term265610, term265610.getClass(), "spine", null);
        setIntField(term265610, term265610.getClass(), "initialChunkPower", 0);
        setIntField(term265610, term265610.getClass(), "elementIndex", 0);
        setIntField(term265610, term265610.getClass(), "spineIndex", 0);
        setField(term265610, term265610.getClass(), "priorElementCount", null);
        ArrayList term265596 = new ArrayList();
        term265595 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term265595, term265595.getClass(), "contents", term265596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        args[1] = term256089;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term256089, term265610));
        assertTrue(recursiveEquals(retValue, term265595));
    }

};


