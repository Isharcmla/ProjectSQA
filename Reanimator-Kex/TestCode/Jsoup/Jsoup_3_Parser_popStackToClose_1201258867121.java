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

public class Parser_popStackToClose_1201258867121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82101;
     Object term82459;

    public Parser_popStackToClose_1201258867121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82299 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term82322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term82322, term82322.getClass(), "canContainBlock", false);
        setField(term82299, term82299.getClass(), "tag", term82322);
        LinkedList term82155 = new LinkedList();
        ((LinkedList) term82155).add("kex.java.util.LinkedList");
        ((LinkedList) term82155).add(term82299);
        term82101 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term82101, term82101.getClass(), "stack", term82155);
        Object term82465 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term82465, term82465.getClass(), "tag", null);
        setField(term82465, term82465.getClass(), "classNames", null);
        setField(term82465, term82465.getClass(), "parentNode", null);
        setField(term82465, term82465.getClass(), "childNodes", null);
        setField(term82465, term82465.getClass(), "attributes", null);
        setField(term82465, term82465.getClass(), "baseUri", null);
        LinkedList term82460 = new LinkedList();
        ((LinkedList) term82460).add("kex.java.util.LinkedList");
        ((LinkedList) term82460).add(term82465);
        term82459 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term82459, term82459.getClass(), "stack", term82460);
        setField(term82459, term82459.getClass(), "tq", null);
        setField(term82459, term82459.getClass(), "doc", null);
        setField(term82459, term82459.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term82101, args);
        assertTrue(recursiveEquals(term82101, term82459));
        assertTrue(recursiveEquals(retValue, null));
    }

};


