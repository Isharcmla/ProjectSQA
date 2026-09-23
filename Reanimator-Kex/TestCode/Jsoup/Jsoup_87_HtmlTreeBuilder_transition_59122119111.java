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

public class HtmlTreeBuilder_transition_59122119111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8950;
     Object term296207;

    public HtmlTreeBuilder_transition_59122119111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8950 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term8950, term8950.getClass(), "state", null);
        setField(term8950, term8950.getClass(), "originalState", null);
        setBooleanField(term8950, term8950.getClass(), "baseUriSetFromDoc", false);
        setField(term8950, term8950.getClass(), "headElement", null);
        setField(term8950, term8950.getClass(), "formElement", null);
        setField(term8950, term8950.getClass(), "contextElement", null);
        setField(term8950, term8950.getClass(), "formattingElements", null);
        setField(term8950, term8950.getClass(), "pendingTableCharacters", null);
        setField(term8950, term8950.getClass(), "emptyEnd", null);
        setBooleanField(term8950, term8950.getClass(), "framesetOk", false);
        setBooleanField(term8950, term8950.getClass(), "fosterInserts", false);
        setBooleanField(term8950, term8950.getClass(), "fragmentParsing", false);
        setField(term8950, term8950.getClass(), "specificScopeTarget", null);
        setField(term8950, term8950.getClass(), "parser", null);
        setField(term8950, term8950.getClass(), "reader", null);
        setField(term8950, term8950.getClass(), "tokeniser", null);
        setField(term8950, term8950.getClass(), "doc", null);
        setField(term8950, term8950.getClass(), "stack", null);
        setField(term8950, term8950.getClass(), "baseUri", null);
        setField(term8950, term8950.getClass(), "currentToken", null);
        setField(term8950, term8950.getClass(), "settings", null);
        setField(term8950, term8950.getClass(), "start", null);
        setField(term8950, term8950.getClass(), "end", null);
        term296207 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term296207, term296207.getClass(), "state", null);
        setField(term296207, term296207.getClass(), "originalState", null);
        setBooleanField(term296207, term296207.getClass(), "baseUriSetFromDoc", false);
        setField(term296207, term296207.getClass(), "headElement", null);
        setField(term296207, term296207.getClass(), "formElement", null);
        setField(term296207, term296207.getClass(), "contextElement", null);
        setField(term296207, term296207.getClass(), "formattingElements", null);
        setField(term296207, term296207.getClass(), "pendingTableCharacters", null);
        setField(term296207, term296207.getClass(), "emptyEnd", null);
        setBooleanField(term296207, term296207.getClass(), "framesetOk", false);
        setBooleanField(term296207, term296207.getClass(), "fosterInserts", false);
        setBooleanField(term296207, term296207.getClass(), "fragmentParsing", false);
        setField(term296207, term296207.getClass(), "specificScopeTarget", null);
        setField(term296207, term296207.getClass(), "parser", null);
        setField(term296207, term296207.getClass(), "reader", null);
        setField(term296207, term296207.getClass(), "tokeniser", null);
        setField(term296207, term296207.getClass(), "doc", null);
        setField(term296207, term296207.getClass(), "stack", null);
        setField(term296207, term296207.getClass(), "baseUri", null);
        setField(term296207, term296207.getClass(), "currentToken", null);
        setField(term296207, term296207.getClass(), "settings", null);
        setField(term296207, term296207.getClass(), "start", null);
        setField(term296207, term296207.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transition", argTypes, term8950, args);
        assertTrue(recursiveEquals(term8950, term296207));
    }

};


