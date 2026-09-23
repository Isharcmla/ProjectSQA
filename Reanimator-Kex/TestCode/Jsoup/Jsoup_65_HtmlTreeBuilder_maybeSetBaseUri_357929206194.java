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
import java.lang.Object;

public class HtmlTreeBuilder_maybeSetBaseUri_357929206194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200159;
     Object term200211;
     Object term200629;
     Object term200630;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200159 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term200159, term200159.getClass(), "baseUriSetFromDoc", false);
        term200211 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term200629 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term200629, term200629.getClass(), "state", null);
        setField(term200629, term200629.getClass(), "originalState", null);
        setBooleanField(term200629, term200629.getClass(), "baseUriSetFromDoc", false);
        setField(term200629, term200629.getClass(), "headElement", null);
        setField(term200629, term200629.getClass(), "formElement", null);
        setField(term200629, term200629.getClass(), "contextElement", null);
        setField(term200629, term200629.getClass(), "formattingElements", null);
        setField(term200629, term200629.getClass(), "pendingTableCharacters", null);
        setField(term200629, term200629.getClass(), "emptyEnd", null);
        setBooleanField(term200629, term200629.getClass(), "framesetOk", false);
        setBooleanField(term200629, term200629.getClass(), "fosterInserts", false);
        setBooleanField(term200629, term200629.getClass(), "fragmentParsing", false);
        setField(term200629, term200629.getClass(), "specificScopeTarget", null);
        setField(term200629, term200629.getClass(), "reader", null);
        setField(term200629, term200629.getClass(), "tokeniser", null);
        setField(term200629, term200629.getClass(), "doc", null);
        setField(term200629, term200629.getClass(), "stack", null);
        setField(term200629, term200629.getClass(), "baseUri", null);
        setField(term200629, term200629.getClass(), "currentToken", null);
        setField(term200629, term200629.getClass(), "errors", null);
        setField(term200629, term200629.getClass(), "settings", null);
        setField(term200629, term200629.getClass(), "start", null);
        setField(term200629, term200629.getClass(), "end", null);
        term200630 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term200631 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term200632 = (Object[]) newArray("java.lang.String", 0);
        Object[] term200633 = (Object[]) newArray("java.lang.String", 0);
        setField(term200630, term200630.getClass(), "tag", null);
        setField(term200630, term200630.getClass(), "shadowChildrenRef", null);
        setField(term200630, term200630.getClass(), "childNodes", null);
        setIntField(term200631, term200631.getClass(), "size", 0);
        setField(term200631, term200631.getClass(), "keys", term200632);
        setField(term200631, term200631.getClass(), "vals", term200633);
        setField(term200630, term200630.getClass(), "attributes", term200631);
        setField(term200630, term200630.getClass(), "baseUri", null);
        setField(term200630, term200630.getClass(), "parentNode", null);
        setIntField(term200630, term200630.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term200211;
        callMethod(klass, "maybeSetBaseUri", argTypes, term200159, args);
        assertTrue(recursiveEquals(term200159, term200629));
        assertTrue(recursiveEquals(term200211, term200630));
    }

};


