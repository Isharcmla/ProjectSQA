package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class Parser_popStackToClose_120125886795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51723;
     Object term52065;

    public Parser_popStackToClose_120125886795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51921 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term51944 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term51944, term51944.getClass(), "canContainBlock", false);
        setField(term51921, term51921.getClass(), "tag", term51944);
        LinkedList term51777 = new LinkedList();
        ((LinkedList) term51777).add("java.lang.Object");
        ((LinkedList) term51777).add(term51921);
        term51723 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term51723, term51723.getClass(), "stack", term51777);
        Object term52071 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term52071, term52071.getClass(), "tag", null);
        setField(term52071, term52071.getClass(), "classNames", null);
        setField(term52071, term52071.getClass(), "parentNode", null);
        setField(term52071, term52071.getClass(), "childNodes", null);
        setField(term52071, term52071.getClass(), "attributes", null);
        setField(term52071, term52071.getClass(), "baseUri", null);
        LinkedList term52066 = new LinkedList();
        ((LinkedList) term52066).add("java.lang.Object");
        ((LinkedList) term52066).add(term52071);
        term52065 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term52065, term52065.getClass(), "stack", term52066);
        setField(term52065, term52065.getClass(), "tq", null);
        setField(term52065, term52065.getClass(), "doc", null);
        setField(term52065, term52065.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term51723, args);
        assertTrue(recursiveEquals(term51723, term52065));
        assertTrue(recursiveEquals(retValue, null));
    }

};


