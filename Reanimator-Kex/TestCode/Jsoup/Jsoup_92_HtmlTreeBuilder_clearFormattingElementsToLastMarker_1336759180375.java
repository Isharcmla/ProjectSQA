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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352410;
     Object term352473;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term352462 = new ArrayList();
        term352410 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term352410, term352410.getClass(), "formattingElements", term352462);
        ArrayList term352474 = new ArrayList();
        term352473 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term352473, term352473.getClass(), "state", null);
        setField(term352473, term352473.getClass(), "originalState", null);
        setBooleanField(term352473, term352473.getClass(), "baseUriSetFromDoc", false);
        setField(term352473, term352473.getClass(), "headElement", null);
        setField(term352473, term352473.getClass(), "formElement", null);
        setField(term352473, term352473.getClass(), "contextElement", null);
        setField(term352473, term352473.getClass(), "formattingElements", term352474);
        setField(term352473, term352473.getClass(), "pendingTableCharacters", null);
        setField(term352473, term352473.getClass(), "emptyEnd", null);
        setBooleanField(term352473, term352473.getClass(), "framesetOk", false);
        setBooleanField(term352473, term352473.getClass(), "fosterInserts", false);
        setBooleanField(term352473, term352473.getClass(), "fragmentParsing", false);
        setField(term352473, term352473.getClass(), "specificScopeTarget", null);
        setField(term352473, term352473.getClass(), "parser", null);
        setField(term352473, term352473.getClass(), "reader", null);
        setField(term352473, term352473.getClass(), "tokeniser", null);
        setField(term352473, term352473.getClass(), "doc", null);
        setField(term352473, term352473.getClass(), "stack", null);
        setField(term352473, term352473.getClass(), "baseUri", null);
        setField(term352473, term352473.getClass(), "currentToken", null);
        setField(term352473, term352473.getClass(), "settings", null);
        setField(term352473, term352473.getClass(), "start", null);
        setField(term352473, term352473.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term352410, args);
        assertTrue(recursiveEquals(term352410, term352473));
    }

};


