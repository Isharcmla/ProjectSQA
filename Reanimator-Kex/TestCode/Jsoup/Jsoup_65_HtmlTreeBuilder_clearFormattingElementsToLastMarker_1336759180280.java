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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226065;
     Object term226128;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226117 = new ArrayList();
        term226065 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226065, term226065.getClass(), "formattingElements", term226117);
        ArrayList term226129 = new ArrayList();
        term226128 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226128, term226128.getClass(), "state", null);
        setField(term226128, term226128.getClass(), "originalState", null);
        setBooleanField(term226128, term226128.getClass(), "baseUriSetFromDoc", false);
        setField(term226128, term226128.getClass(), "headElement", null);
        setField(term226128, term226128.getClass(), "formElement", null);
        setField(term226128, term226128.getClass(), "contextElement", null);
        setField(term226128, term226128.getClass(), "formattingElements", term226129);
        setField(term226128, term226128.getClass(), "pendingTableCharacters", null);
        setField(term226128, term226128.getClass(), "emptyEnd", null);
        setBooleanField(term226128, term226128.getClass(), "framesetOk", false);
        setBooleanField(term226128, term226128.getClass(), "fosterInserts", false);
        setBooleanField(term226128, term226128.getClass(), "fragmentParsing", false);
        setField(term226128, term226128.getClass(), "specificScopeTarget", null);
        setField(term226128, term226128.getClass(), "reader", null);
        setField(term226128, term226128.getClass(), "tokeniser", null);
        setField(term226128, term226128.getClass(), "doc", null);
        setField(term226128, term226128.getClass(), "stack", null);
        setField(term226128, term226128.getClass(), "baseUri", null);
        setField(term226128, term226128.getClass(), "currentToken", null);
        setField(term226128, term226128.getClass(), "errors", null);
        setField(term226128, term226128.getClass(), "settings", null);
        setField(term226128, term226128.getClass(), "start", null);
        setField(term226128, term226128.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term226065, args);
        assertTrue(recursiveEquals(term226065, term226128));
    }

};


