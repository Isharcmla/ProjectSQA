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

public class Parser_popStackToClose_1201258867123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83550;
     Object term83906;

    public Parser_popStackToClose_1201258867123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83748 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term83771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term83748, term83748.getClass(), "tag", term83771);
        LinkedList term83604 = new LinkedList();
        ((LinkedList) term83604).add("kex.java.util.ArrayList");
        ((LinkedList) term83604).add(term83748);
        term83550 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term83550, term83550.getClass(), "stack", term83604);
        Object term83912 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term83912, term83912.getClass(), "tag", null);
        setField(term83912, term83912.getClass(), "classNames", null);
        setField(term83912, term83912.getClass(), "parentNode", null);
        setField(term83912, term83912.getClass(), "childNodes", null);
        setField(term83912, term83912.getClass(), "attributes", null);
        setField(term83912, term83912.getClass(), "baseUri", null);
        LinkedList term83907 = new LinkedList();
        ((LinkedList) term83907).add("kex.java.util.ArrayList");
        ((LinkedList) term83907).add(term83912);
        term83906 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term83906, term83906.getClass(), "stack", term83907);
        setField(term83906, term83906.getClass(), "tq", null);
        setField(term83906, term83906.getClass(), "doc", null);
        setField(term83906, term83906.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term83550, args);
        assertTrue(recursiveEquals(term83550, term83906));
        assertTrue(recursiveEquals(retValue, null));
    }

};


