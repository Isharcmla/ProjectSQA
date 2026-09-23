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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Element_indexInList_1961680608272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87294;
     Object term87348;

    public Element_indexInList_1961680608272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87294 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term87294, term87294.getClass(), "childNodes", null);
        setField(term87294, term87294.getClass(), "attributes", null);
        ArrayList term87478 = new ArrayList();
        Object term87426 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term87536 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term87426, term87426.getClass(), "childNodes", term87478);
        setField(term87426, term87426.getClass(), "attributes", term87536);
        Object term87574 = newInstance(Class.forName("java.lang.Object"));
        term87348 = new LinkedList();
        ((LinkedList) term87348).add(term87426);
        ((LinkedList) term87348).add(term87574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term87294;
        args[1] = term87348;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};


