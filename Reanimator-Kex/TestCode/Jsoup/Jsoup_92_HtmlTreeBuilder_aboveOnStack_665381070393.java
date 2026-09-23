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

public class HtmlTreeBuilder_aboveOnStack_665381070393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362569;
     Object term362699;

    public HtmlTreeBuilder_aboveOnStack_665381070393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term362673 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term362621 = new ArrayList();
        ((ArrayList) term362621).add(term362673);
        ((ArrayList) term362621).add(term362673);
        ((ArrayList) term362621).add(term362673);
        ((ArrayList) term362621).add(term362673);
        ((ArrayList) term362621).add(term362673);
        ((ArrayList) term362621).add(term362673);
        term362569 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term362569, term362569.getClass(), "stack", term362621);
        Object term362702 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term362702, term362702.getClass(), "tag", null);
        setField(term362702, term362702.getClass(), "shadowChildrenRef", null);
        setField(term362702, term362702.getClass(), "childNodes", null);
        setField(term362702, term362702.getClass(), "attributes", null);
        setField(term362702, term362702.getClass(), "baseUri", null);
        setField(term362702, term362702.getClass(), "parentNode", null);
        setIntField(term362702, term362702.getClass(), "siblingIndex", 0);
        ArrayList term362700 = new ArrayList();
        ((ArrayList) term362700).add(term362702);
        ((ArrayList) term362700).add(term362702);
        ((ArrayList) term362700).add(term362702);
        ((ArrayList) term362700).add(term362702);
        ((ArrayList) term362700).add(term362702);
        ((ArrayList) term362700).add(term362702);
        term362699 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term362699, term362699.getClass(), "state", null);
        setField(term362699, term362699.getClass(), "originalState", null);
        setBooleanField(term362699, term362699.getClass(), "baseUriSetFromDoc", false);
        setField(term362699, term362699.getClass(), "headElement", null);
        setField(term362699, term362699.getClass(), "formElement", null);
        setField(term362699, term362699.getClass(), "contextElement", null);
        setField(term362699, term362699.getClass(), "formattingElements", null);
        setField(term362699, term362699.getClass(), "pendingTableCharacters", null);
        setField(term362699, term362699.getClass(), "emptyEnd", null);
        setBooleanField(term362699, term362699.getClass(), "framesetOk", false);
        setBooleanField(term362699, term362699.getClass(), "fosterInserts", false);
        setBooleanField(term362699, term362699.getClass(), "fragmentParsing", false);
        setField(term362699, term362699.getClass(), "specificScopeTarget", null);
        setField(term362699, term362699.getClass(), "parser", null);
        setField(term362699, term362699.getClass(), "reader", null);
        setField(term362699, term362699.getClass(), "tokeniser", null);
        setField(term362699, term362699.getClass(), "doc", null);
        setField(term362699, term362699.getClass(), "stack", term362700);
        setField(term362699, term362699.getClass(), "baseUri", null);
        setField(term362699, term362699.getClass(), "currentToken", null);
        setField(term362699, term362699.getClass(), "settings", null);
        setField(term362699, term362699.getClass(), "start", null);
        setField(term362699, term362699.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term362569, args);
        assertTrue(recursiveEquals(term362569, term362699));
        assertTrue(recursiveEquals(retValue, null));
    }

};


