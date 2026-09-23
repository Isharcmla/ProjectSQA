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

public class HtmlTreeBuilder_markInsertionMode_124827683113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11696;
     Object term129855;

    public HtmlTreeBuilder_markInsertionMode_124827683113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11696 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term11696, term11696.getClass(), "state", null);
        setField(term11696, term11696.getClass(), "originalState", null);
        setBooleanField(term11696, term11696.getClass(), "baseUriSetFromDoc", false);
        setField(term11696, term11696.getClass(), "headElement", null);
        setField(term11696, term11696.getClass(), "formElement", null);
        setField(term11696, term11696.getClass(), "contextElement", null);
        setField(term11696, term11696.getClass(), "formattingElements", null);
        setField(term11696, term11696.getClass(), "pendingTableCharacters", null);
        setField(term11696, term11696.getClass(), "emptyEnd", null);
        setBooleanField(term11696, term11696.getClass(), "framesetOk", false);
        setBooleanField(term11696, term11696.getClass(), "fosterInserts", false);
        setBooleanField(term11696, term11696.getClass(), "fragmentParsing", false);
        setField(term11696, term11696.getClass(), "specificScopeTarget", null);
        setField(term11696, term11696.getClass(), "parser", null);
        setField(term11696, term11696.getClass(), "reader", null);
        setField(term11696, term11696.getClass(), "tokeniser", null);
        setField(term11696, term11696.getClass(), "doc", null);
        setField(term11696, term11696.getClass(), "stack", null);
        setField(term11696, term11696.getClass(), "baseUri", null);
        setField(term11696, term11696.getClass(), "currentToken", null);
        setField(term11696, term11696.getClass(), "settings", null);
        setField(term11696, term11696.getClass(), "start", null);
        setField(term11696, term11696.getClass(), "end", null);
        term129855 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term129855, term129855.getClass(), "state", null);
        setField(term129855, term129855.getClass(), "originalState", null);
        setBooleanField(term129855, term129855.getClass(), "baseUriSetFromDoc", false);
        setField(term129855, term129855.getClass(), "headElement", null);
        setField(term129855, term129855.getClass(), "formElement", null);
        setField(term129855, term129855.getClass(), "contextElement", null);
        setField(term129855, term129855.getClass(), "formattingElements", null);
        setField(term129855, term129855.getClass(), "pendingTableCharacters", null);
        setField(term129855, term129855.getClass(), "emptyEnd", null);
        setBooleanField(term129855, term129855.getClass(), "framesetOk", false);
        setBooleanField(term129855, term129855.getClass(), "fosterInserts", false);
        setBooleanField(term129855, term129855.getClass(), "fragmentParsing", false);
        setField(term129855, term129855.getClass(), "specificScopeTarget", null);
        setField(term129855, term129855.getClass(), "parser", null);
        setField(term129855, term129855.getClass(), "reader", null);
        setField(term129855, term129855.getClass(), "tokeniser", null);
        setField(term129855, term129855.getClass(), "doc", null);
        setField(term129855, term129855.getClass(), "stack", null);
        setField(term129855, term129855.getClass(), "baseUri", null);
        setField(term129855, term129855.getClass(), "currentToken", null);
        setField(term129855, term129855.getClass(), "settings", null);
        setField(term129855, term129855.getClass(), "start", null);
        setField(term129855, term129855.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markInsertionMode", argTypes, term11696, args);
        assertTrue(recursiveEquals(term11696, term129855));
    }

};


