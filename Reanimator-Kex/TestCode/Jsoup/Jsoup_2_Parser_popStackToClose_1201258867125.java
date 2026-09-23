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

public class Parser_popStackToClose_1201258867125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70555;
     Object term70911;

    public Parser_popStackToClose_1201258867125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70753 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term70776 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term70753, term70753.getClass(), "tag", term70776);
        LinkedList term70609 = new LinkedList();
        ((LinkedList) term70609).add("kex.java.util.ArrayList");
        ((LinkedList) term70609).add(term70753);
        term70555 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term70555, term70555.getClass(), "stack", term70609);
        Object term70917 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term70917, term70917.getClass(), "tag", null);
        setField(term70917, term70917.getClass(), "classNames", null);
        setField(term70917, term70917.getClass(), "parentNode", null);
        setField(term70917, term70917.getClass(), "childNodes", null);
        setField(term70917, term70917.getClass(), "attributes", null);
        setField(term70917, term70917.getClass(), "baseUri", null);
        LinkedList term70912 = new LinkedList();
        ((LinkedList) term70912).add("kex.java.util.ArrayList");
        ((LinkedList) term70912).add(term70917);
        term70911 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term70911, term70911.getClass(), "stack", term70912);
        setField(term70911, term70911.getClass(), "tq", null);
        setField(term70911, term70911.getClass(), "doc", null);
        setField(term70911, term70911.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term70555, args);
        assertTrue(recursiveEquals(term70555, term70911));
        assertTrue(recursiveEquals(retValue, null));
    }

};


