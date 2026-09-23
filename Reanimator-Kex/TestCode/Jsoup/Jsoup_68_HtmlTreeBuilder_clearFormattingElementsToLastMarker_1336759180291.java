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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270335;
     Object term270699;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term270387 = new ArrayList();
        term270335 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270335, term270335.getClass(), "formattingElements", term270387);
        ArrayList term270700 = new ArrayList();
        term270699 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270699, term270699.getClass(), "state", null);
        setField(term270699, term270699.getClass(), "originalState", null);
        setBooleanField(term270699, term270699.getClass(), "baseUriSetFromDoc", false);
        setField(term270699, term270699.getClass(), "headElement", null);
        setField(term270699, term270699.getClass(), "formElement", null);
        setField(term270699, term270699.getClass(), "contextElement", null);
        setField(term270699, term270699.getClass(), "formattingElements", term270700);
        setField(term270699, term270699.getClass(), "pendingTableCharacters", null);
        setField(term270699, term270699.getClass(), "emptyEnd", null);
        setBooleanField(term270699, term270699.getClass(), "framesetOk", false);
        setBooleanField(term270699, term270699.getClass(), "fosterInserts", false);
        setBooleanField(term270699, term270699.getClass(), "fragmentParsing", false);
        setField(term270699, term270699.getClass(), "specificScopeTarget", null);
        setField(term270699, term270699.getClass(), "reader", null);
        setField(term270699, term270699.getClass(), "tokeniser", null);
        setField(term270699, term270699.getClass(), "doc", null);
        setField(term270699, term270699.getClass(), "stack", null);
        setField(term270699, term270699.getClass(), "baseUri", null);
        setField(term270699, term270699.getClass(), "currentToken", null);
        setField(term270699, term270699.getClass(), "errors", null);
        setField(term270699, term270699.getClass(), "settings", null);
        setField(term270699, term270699.getClass(), "start", null);
        setField(term270699, term270699.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term270335, args);
        assertTrue(recursiveEquals(term270335, term270699));
    }

};


