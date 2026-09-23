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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342078;
     Object term342257;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term342182 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term342236 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term342130 = new ArrayList();
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add(term342182);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add((Object)null);
        ((ArrayList) term342130).add(term342236);
        term342078 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term342078, term342078.getClass(), "formattingElements", term342130);
        Object term342260 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term342260, term342260.getClass(), "tag", null);
        setField(term342260, term342260.getClass(), "shadowChildrenRef", null);
        setField(term342260, term342260.getClass(), "childNodes", null);
        setField(term342260, term342260.getClass(), "attributes", null);
        setField(term342260, term342260.getClass(), "baseUri", null);
        setField(term342260, term342260.getClass(), "parentNode", null);
        setIntField(term342260, term342260.getClass(), "siblingIndex", 0);
        ArrayList term342258 = new ArrayList();
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add(term342260);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        ((ArrayList) term342258).add((Object)null);
        term342257 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term342257, term342257.getClass(), "state", null);
        setField(term342257, term342257.getClass(), "originalState", null);
        setBooleanField(term342257, term342257.getClass(), "baseUriSetFromDoc", false);
        setField(term342257, term342257.getClass(), "headElement", null);
        setField(term342257, term342257.getClass(), "formElement", null);
        setField(term342257, term342257.getClass(), "contextElement", null);
        setField(term342257, term342257.getClass(), "formattingElements", term342258);
        setField(term342257, term342257.getClass(), "pendingTableCharacters", null);
        setField(term342257, term342257.getClass(), "emptyEnd", null);
        setBooleanField(term342257, term342257.getClass(), "framesetOk", false);
        setBooleanField(term342257, term342257.getClass(), "fosterInserts", false);
        setBooleanField(term342257, term342257.getClass(), "fragmentParsing", false);
        setField(term342257, term342257.getClass(), "specificScopeTarget", null);
        setField(term342257, term342257.getClass(), "parser", null);
        setField(term342257, term342257.getClass(), "reader", null);
        setField(term342257, term342257.getClass(), "tokeniser", null);
        setField(term342257, term342257.getClass(), "doc", null);
        setField(term342257, term342257.getClass(), "stack", null);
        setField(term342257, term342257.getClass(), "baseUri", null);
        setField(term342257, term342257.getClass(), "currentToken", null);
        setField(term342257, term342257.getClass(), "settings", null);
        setField(term342257, term342257.getClass(), "start", null);
        setField(term342257, term342257.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term342078, args);
        assertTrue(recursiveEquals(term342078, term342257));
    }

};


