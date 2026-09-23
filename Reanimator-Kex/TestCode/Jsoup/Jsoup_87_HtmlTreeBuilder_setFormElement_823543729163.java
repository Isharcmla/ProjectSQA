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

public class HtmlTreeBuilder_setFormElement_823543729163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81486;
     Object term362009;

    public HtmlTreeBuilder_setFormElement_823543729163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81486 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term81486, term81486.getClass(), "state", null);
        setField(term81486, term81486.getClass(), "originalState", null);
        setBooleanField(term81486, term81486.getClass(), "baseUriSetFromDoc", false);
        setField(term81486, term81486.getClass(), "headElement", null);
        setField(term81486, term81486.getClass(), "formElement", null);
        setField(term81486, term81486.getClass(), "contextElement", null);
        setField(term81486, term81486.getClass(), "formattingElements", null);
        setField(term81486, term81486.getClass(), "pendingTableCharacters", null);
        setField(term81486, term81486.getClass(), "emptyEnd", null);
        setBooleanField(term81486, term81486.getClass(), "framesetOk", false);
        setBooleanField(term81486, term81486.getClass(), "fosterInserts", false);
        setBooleanField(term81486, term81486.getClass(), "fragmentParsing", false);
        setField(term81486, term81486.getClass(), "specificScopeTarget", null);
        setField(term81486, term81486.getClass(), "parser", null);
        setField(term81486, term81486.getClass(), "reader", null);
        setField(term81486, term81486.getClass(), "tokeniser", null);
        setField(term81486, term81486.getClass(), "doc", null);
        setField(term81486, term81486.getClass(), "stack", null);
        setField(term81486, term81486.getClass(), "baseUri", null);
        setField(term81486, term81486.getClass(), "currentToken", null);
        setField(term81486, term81486.getClass(), "settings", null);
        setField(term81486, term81486.getClass(), "start", null);
        setField(term81486, term81486.getClass(), "end", null);
        term362009 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term362009, term362009.getClass(), "state", null);
        setField(term362009, term362009.getClass(), "originalState", null);
        setBooleanField(term362009, term362009.getClass(), "baseUriSetFromDoc", false);
        setField(term362009, term362009.getClass(), "headElement", null);
        setField(term362009, term362009.getClass(), "formElement", null);
        setField(term362009, term362009.getClass(), "contextElement", null);
        setField(term362009, term362009.getClass(), "formattingElements", null);
        setField(term362009, term362009.getClass(), "pendingTableCharacters", null);
        setField(term362009, term362009.getClass(), "emptyEnd", null);
        setBooleanField(term362009, term362009.getClass(), "framesetOk", false);
        setBooleanField(term362009, term362009.getClass(), "fosterInserts", false);
        setBooleanField(term362009, term362009.getClass(), "fragmentParsing", false);
        setField(term362009, term362009.getClass(), "specificScopeTarget", null);
        setField(term362009, term362009.getClass(), "parser", null);
        setField(term362009, term362009.getClass(), "reader", null);
        setField(term362009, term362009.getClass(), "tokeniser", null);
        setField(term362009, term362009.getClass(), "doc", null);
        setField(term362009, term362009.getClass(), "stack", null);
        setField(term362009, term362009.getClass(), "baseUri", null);
        setField(term362009, term362009.getClass(), "currentToken", null);
        setField(term362009, term362009.getClass(), "settings", null);
        setField(term362009, term362009.getClass(), "start", null);
        setField(term362009, term362009.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.FormElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormElement", argTypes, term81486, args);
        assertTrue(recursiveEquals(term81486, term362009));
    }

};


