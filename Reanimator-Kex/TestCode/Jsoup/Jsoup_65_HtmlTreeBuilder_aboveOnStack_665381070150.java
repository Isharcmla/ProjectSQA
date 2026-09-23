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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_aboveOnStack_665381070150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51980;

    public HtmlTreeBuilder_aboveOnStack_665381070150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51980 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term51980, term51980.getClass(), "state", null);
        setField(term51980, term51980.getClass(), "originalState", null);
        setBooleanField(term51980, term51980.getClass(), "baseUriSetFromDoc", false);
        setField(term51980, term51980.getClass(), "headElement", null);
        setField(term51980, term51980.getClass(), "formElement", null);
        setField(term51980, term51980.getClass(), "contextElement", null);
        setField(term51980, term51980.getClass(), "formattingElements", null);
        setField(term51980, term51980.getClass(), "pendingTableCharacters", null);
        setField(term51980, term51980.getClass(), "emptyEnd", null);
        setBooleanField(term51980, term51980.getClass(), "framesetOk", false);
        setBooleanField(term51980, term51980.getClass(), "fosterInserts", false);
        setBooleanField(term51980, term51980.getClass(), "fragmentParsing", false);
        setField(term51980, term51980.getClass(), "specificScopeTarget", null);
        setField(term51980, term51980.getClass(), "reader", null);
        setField(term51980, term51980.getClass(), "tokeniser", null);
        setField(term51980, term51980.getClass(), "doc", null);
        setField(term51980, term51980.getClass(), "stack", null);
        setField(term51980, term51980.getClass(), "baseUri", null);
        setField(term51980, term51980.getClass(), "currentToken", null);
        setField(term51980, term51980.getClass(), "errors", null);
        setField(term51980, term51980.getClass(), "settings", null);
        setField(term51980, term51980.getClass(), "start", null);
        setField(term51980, term51980.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "aboveOnStack", argTypes, term51980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


