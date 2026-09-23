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

public class HtmlTreeBuilder_markInsertionMode_124827683115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8472;
     Object term109621;

    public HtmlTreeBuilder_markInsertionMode_124827683115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8472 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term8472, term8472.getClass(), "state", null);
        setField(term8472, term8472.getClass(), "originalState", null);
        setBooleanField(term8472, term8472.getClass(), "baseUriSetFromDoc", false);
        setField(term8472, term8472.getClass(), "headElement", null);
        setField(term8472, term8472.getClass(), "formElement", null);
        setField(term8472, term8472.getClass(), "contextElement", null);
        setField(term8472, term8472.getClass(), "formattingElements", null);
        setField(term8472, term8472.getClass(), "pendingTableCharacters", null);
        setField(term8472, term8472.getClass(), "emptyEnd", null);
        setBooleanField(term8472, term8472.getClass(), "framesetOk", false);
        setBooleanField(term8472, term8472.getClass(), "fosterInserts", false);
        setBooleanField(term8472, term8472.getClass(), "fragmentParsing", false);
        setField(term8472, term8472.getClass(), "specificScopeTarget", null);
        setField(term8472, term8472.getClass(), "reader", null);
        setField(term8472, term8472.getClass(), "tokeniser", null);
        setField(term8472, term8472.getClass(), "doc", null);
        setField(term8472, term8472.getClass(), "stack", null);
        setField(term8472, term8472.getClass(), "baseUri", null);
        setField(term8472, term8472.getClass(), "currentToken", null);
        setField(term8472, term8472.getClass(), "errors", null);
        setField(term8472, term8472.getClass(), "settings", null);
        setField(term8472, term8472.getClass(), "start", null);
        setField(term8472, term8472.getClass(), "end", null);
        term109621 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term109621, term109621.getClass(), "state", null);
        setField(term109621, term109621.getClass(), "originalState", null);
        setBooleanField(term109621, term109621.getClass(), "baseUriSetFromDoc", false);
        setField(term109621, term109621.getClass(), "headElement", null);
        setField(term109621, term109621.getClass(), "formElement", null);
        setField(term109621, term109621.getClass(), "contextElement", null);
        setField(term109621, term109621.getClass(), "formattingElements", null);
        setField(term109621, term109621.getClass(), "pendingTableCharacters", null);
        setField(term109621, term109621.getClass(), "emptyEnd", null);
        setBooleanField(term109621, term109621.getClass(), "framesetOk", false);
        setBooleanField(term109621, term109621.getClass(), "fosterInserts", false);
        setBooleanField(term109621, term109621.getClass(), "fragmentParsing", false);
        setField(term109621, term109621.getClass(), "specificScopeTarget", null);
        setField(term109621, term109621.getClass(), "reader", null);
        setField(term109621, term109621.getClass(), "tokeniser", null);
        setField(term109621, term109621.getClass(), "doc", null);
        setField(term109621, term109621.getClass(), "stack", null);
        setField(term109621, term109621.getClass(), "baseUri", null);
        setField(term109621, term109621.getClass(), "currentToken", null);
        setField(term109621, term109621.getClass(), "errors", null);
        setField(term109621, term109621.getClass(), "settings", null);
        setField(term109621, term109621.getClass(), "start", null);
        setField(term109621, term109621.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markInsertionMode", argTypes, term8472, args);
        assertTrue(recursiveEquals(term8472, term109621));
    }

};


