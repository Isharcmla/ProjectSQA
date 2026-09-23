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

public class HtmlTreeBuilder_getHeadElement_1376057265159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76129;
     Object term356828;

    public HtmlTreeBuilder_getHeadElement_1376057265159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76129 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term76129, term76129.getClass(), "state", null);
        setField(term76129, term76129.getClass(), "originalState", null);
        setBooleanField(term76129, term76129.getClass(), "baseUriSetFromDoc", false);
        setField(term76129, term76129.getClass(), "headElement", null);
        setField(term76129, term76129.getClass(), "formElement", null);
        setField(term76129, term76129.getClass(), "contextElement", null);
        setField(term76129, term76129.getClass(), "formattingElements", null);
        setField(term76129, term76129.getClass(), "pendingTableCharacters", null);
        setField(term76129, term76129.getClass(), "emptyEnd", null);
        setBooleanField(term76129, term76129.getClass(), "framesetOk", false);
        setBooleanField(term76129, term76129.getClass(), "fosterInserts", false);
        setBooleanField(term76129, term76129.getClass(), "fragmentParsing", false);
        setField(term76129, term76129.getClass(), "specificScopeTarget", null);
        setField(term76129, term76129.getClass(), "parser", null);
        setField(term76129, term76129.getClass(), "reader", null);
        setField(term76129, term76129.getClass(), "tokeniser", null);
        setField(term76129, term76129.getClass(), "doc", null);
        setField(term76129, term76129.getClass(), "stack", null);
        setField(term76129, term76129.getClass(), "baseUri", null);
        setField(term76129, term76129.getClass(), "currentToken", null);
        setField(term76129, term76129.getClass(), "settings", null);
        setField(term76129, term76129.getClass(), "start", null);
        setField(term76129, term76129.getClass(), "end", null);
        term356828 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term356828, term356828.getClass(), "state", null);
        setField(term356828, term356828.getClass(), "originalState", null);
        setBooleanField(term356828, term356828.getClass(), "baseUriSetFromDoc", false);
        setField(term356828, term356828.getClass(), "headElement", null);
        setField(term356828, term356828.getClass(), "formElement", null);
        setField(term356828, term356828.getClass(), "contextElement", null);
        setField(term356828, term356828.getClass(), "formattingElements", null);
        setField(term356828, term356828.getClass(), "pendingTableCharacters", null);
        setField(term356828, term356828.getClass(), "emptyEnd", null);
        setBooleanField(term356828, term356828.getClass(), "framesetOk", false);
        setBooleanField(term356828, term356828.getClass(), "fosterInserts", false);
        setBooleanField(term356828, term356828.getClass(), "fragmentParsing", false);
        setField(term356828, term356828.getClass(), "specificScopeTarget", null);
        setField(term356828, term356828.getClass(), "parser", null);
        setField(term356828, term356828.getClass(), "reader", null);
        setField(term356828, term356828.getClass(), "tokeniser", null);
        setField(term356828, term356828.getClass(), "doc", null);
        setField(term356828, term356828.getClass(), "stack", null);
        setField(term356828, term356828.getClass(), "baseUri", null);
        setField(term356828, term356828.getClass(), "currentToken", null);
        setField(term356828, term356828.getClass(), "settings", null);
        setField(term356828, term356828.getClass(), "start", null);
        setField(term356828, term356828.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeadElement", argTypes, term76129, args);
        assertTrue(recursiveEquals(term76129, term356828));
        assertTrue(recursiveEquals(retValue, null));
    }

};


