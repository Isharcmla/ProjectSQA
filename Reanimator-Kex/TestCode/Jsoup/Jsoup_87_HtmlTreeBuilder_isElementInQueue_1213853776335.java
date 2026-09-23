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
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_isElementInQueue_1213853776335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501711;
     Object term501763;
     Object term501839;
     Object term501840;

    public HtmlTreeBuilder_isElementInQueue_1213853776335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501711 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term501815 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term501763 = new ArrayList();
        ((ArrayList) term501763).add(term501815);
        ((ArrayList) term501763).add(term501815);
        ((ArrayList) term501763).add(term501815);
        ((ArrayList) term501763).add(term501815);
        ((ArrayList) term501763).add(term501815);
        term501839 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term501839, term501839.getClass(), "state", null);
        setField(term501839, term501839.getClass(), "originalState", null);
        setBooleanField(term501839, term501839.getClass(), "baseUriSetFromDoc", false);
        setField(term501839, term501839.getClass(), "headElement", null);
        setField(term501839, term501839.getClass(), "formElement", null);
        setField(term501839, term501839.getClass(), "contextElement", null);
        setField(term501839, term501839.getClass(), "formattingElements", null);
        setField(term501839, term501839.getClass(), "pendingTableCharacters", null);
        setField(term501839, term501839.getClass(), "emptyEnd", null);
        setBooleanField(term501839, term501839.getClass(), "framesetOk", false);
        setBooleanField(term501839, term501839.getClass(), "fosterInserts", false);
        setBooleanField(term501839, term501839.getClass(), "fragmentParsing", false);
        setField(term501839, term501839.getClass(), "specificScopeTarget", null);
        setField(term501839, term501839.getClass(), "parser", null);
        setField(term501839, term501839.getClass(), "reader", null);
        setField(term501839, term501839.getClass(), "tokeniser", null);
        setField(term501839, term501839.getClass(), "doc", null);
        setField(term501839, term501839.getClass(), "stack", null);
        setField(term501839, term501839.getClass(), "baseUri", null);
        setField(term501839, term501839.getClass(), "currentToken", null);
        setField(term501839, term501839.getClass(), "settings", null);
        setField(term501839, term501839.getClass(), "start", null);
        setField(term501839, term501839.getClass(), "end", null);
        Object term501842 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term501842, term501842.getClass(), "tag", null);
        setField(term501842, term501842.getClass(), "shadowChildrenRef", null);
        setField(term501842, term501842.getClass(), "childNodes", null);
        setField(term501842, term501842.getClass(), "attributes", null);
        setField(term501842, term501842.getClass(), "baseUri", null);
        setField(term501842, term501842.getClass(), "parentNode", null);
        setIntField(term501842, term501842.getClass(), "siblingIndex", 0);
        term501840 = new ArrayList();
        ((ArrayList) term501840).add(term501842);
        ((ArrayList) term501840).add(term501842);
        ((ArrayList) term501840).add(term501842);
        ((ArrayList) term501840).add(term501842);
        ((ArrayList) term501840).add(term501842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term501763;
        args[1] = null;
        Object retValue = callMethod(klass, "isElementInQueue", argTypes, term501711, args);
        assertTrue(recursiveEquals(term501711, term501839));
        assertTrue(recursiveEquals(term501763, term501840));
        assertTrue(recursiveEquals(retValue, false));
    }

};


