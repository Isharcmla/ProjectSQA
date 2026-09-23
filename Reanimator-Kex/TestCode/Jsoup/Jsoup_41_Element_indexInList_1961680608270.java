package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class Element_indexInList_1961680608270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84276;
     Object term84388;

    public Element_indexInList_1961680608270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84276 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term84334 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term84276, term84276.getClass(), "childNodes", null);
        setField(term84276, term84276.getClass(), "attributes", term84334);
        ArrayList term84522 = new ArrayList();
        Object term84470 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term84580 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term84470, term84470.getClass(), "childNodes", term84522);
        setField(term84580, term84580.getClass(), "attributes", null);
        setField(term84470, term84470.getClass(), "attributes", term84580);
        term84388 = new LinkedList();
        ((LinkedList) term84388).add(term84470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term84276;
        args[1] = term84388;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};


