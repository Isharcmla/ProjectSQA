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

public class HtmlTreeBuilder_isElementInQueue_1213853776399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363365;
     Object term363417;
     Object term363489;
     Object term363490;

    public HtmlTreeBuilder_isElementInQueue_1213853776399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363365 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term363469 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term363417 = new ArrayList();
        ((ArrayList) term363417).add(term363469);
        ((ArrayList) term363417).add(term363469);
        ((ArrayList) term363417).add(term363469);
        term363489 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term363489, term363489.getClass(), "state", null);
        setField(term363489, term363489.getClass(), "originalState", null);
        setBooleanField(term363489, term363489.getClass(), "baseUriSetFromDoc", false);
        setField(term363489, term363489.getClass(), "headElement", null);
        setField(term363489, term363489.getClass(), "formElement", null);
        setField(term363489, term363489.getClass(), "contextElement", null);
        setField(term363489, term363489.getClass(), "formattingElements", null);
        setField(term363489, term363489.getClass(), "pendingTableCharacters", null);
        setField(term363489, term363489.getClass(), "emptyEnd", null);
        setBooleanField(term363489, term363489.getClass(), "framesetOk", false);
        setBooleanField(term363489, term363489.getClass(), "fosterInserts", false);
        setBooleanField(term363489, term363489.getClass(), "fragmentParsing", false);
        setField(term363489, term363489.getClass(), "specificScopeTarget", null);
        setField(term363489, term363489.getClass(), "parser", null);
        setField(term363489, term363489.getClass(), "reader", null);
        setField(term363489, term363489.getClass(), "tokeniser", null);
        setField(term363489, term363489.getClass(), "doc", null);
        setField(term363489, term363489.getClass(), "stack", null);
        setField(term363489, term363489.getClass(), "baseUri", null);
        setField(term363489, term363489.getClass(), "currentToken", null);
        setField(term363489, term363489.getClass(), "settings", null);
        setField(term363489, term363489.getClass(), "start", null);
        setField(term363489, term363489.getClass(), "end", null);
        Object term363492 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term363492, term363492.getClass(), "tag", null);
        setField(term363492, term363492.getClass(), "shadowChildrenRef", null);
        setField(term363492, term363492.getClass(), "childNodes", null);
        setField(term363492, term363492.getClass(), "attributes", null);
        setField(term363492, term363492.getClass(), "baseUri", null);
        setField(term363492, term363492.getClass(), "parentNode", null);
        setIntField(term363492, term363492.getClass(), "siblingIndex", 0);
        term363490 = new ArrayList();
        ((ArrayList) term363490).add(term363492);
        ((ArrayList) term363490).add(term363492);
        ((ArrayList) term363490).add(term363492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term363417;
        args[1] = null;
        Object retValue = callMethod(klass, "isElementInQueue", argTypes, term363365, args);
        assertTrue(recursiveEquals(term363365, term363489));
        assertTrue(recursiveEquals(term363417, term363490));
        assertTrue(recursiveEquals(retValue, false));
    }

};


