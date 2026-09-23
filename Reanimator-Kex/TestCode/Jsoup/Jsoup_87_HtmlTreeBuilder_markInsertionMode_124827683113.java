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
     Object term11322;
     Object term296219;

    public HtmlTreeBuilder_markInsertionMode_124827683113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11322 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term11322, term11322.getClass(), "state", null);
        setField(term11322, term11322.getClass(), "originalState", null);
        setBooleanField(term11322, term11322.getClass(), "baseUriSetFromDoc", false);
        setField(term11322, term11322.getClass(), "headElement", null);
        setField(term11322, term11322.getClass(), "formElement", null);
        setField(term11322, term11322.getClass(), "contextElement", null);
        setField(term11322, term11322.getClass(), "formattingElements", null);
        setField(term11322, term11322.getClass(), "pendingTableCharacters", null);
        setField(term11322, term11322.getClass(), "emptyEnd", null);
        setBooleanField(term11322, term11322.getClass(), "framesetOk", false);
        setBooleanField(term11322, term11322.getClass(), "fosterInserts", false);
        setBooleanField(term11322, term11322.getClass(), "fragmentParsing", false);
        setField(term11322, term11322.getClass(), "specificScopeTarget", null);
        setField(term11322, term11322.getClass(), "parser", null);
        setField(term11322, term11322.getClass(), "reader", null);
        setField(term11322, term11322.getClass(), "tokeniser", null);
        setField(term11322, term11322.getClass(), "doc", null);
        setField(term11322, term11322.getClass(), "stack", null);
        setField(term11322, term11322.getClass(), "baseUri", null);
        setField(term11322, term11322.getClass(), "currentToken", null);
        setField(term11322, term11322.getClass(), "settings", null);
        setField(term11322, term11322.getClass(), "start", null);
        setField(term11322, term11322.getClass(), "end", null);
        term296219 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term296219, term296219.getClass(), "state", null);
        setField(term296219, term296219.getClass(), "originalState", null);
        setBooleanField(term296219, term296219.getClass(), "baseUriSetFromDoc", false);
        setField(term296219, term296219.getClass(), "headElement", null);
        setField(term296219, term296219.getClass(), "formElement", null);
        setField(term296219, term296219.getClass(), "contextElement", null);
        setField(term296219, term296219.getClass(), "formattingElements", null);
        setField(term296219, term296219.getClass(), "pendingTableCharacters", null);
        setField(term296219, term296219.getClass(), "emptyEnd", null);
        setBooleanField(term296219, term296219.getClass(), "framesetOk", false);
        setBooleanField(term296219, term296219.getClass(), "fosterInserts", false);
        setBooleanField(term296219, term296219.getClass(), "fragmentParsing", false);
        setField(term296219, term296219.getClass(), "specificScopeTarget", null);
        setField(term296219, term296219.getClass(), "parser", null);
        setField(term296219, term296219.getClass(), "reader", null);
        setField(term296219, term296219.getClass(), "tokeniser", null);
        setField(term296219, term296219.getClass(), "doc", null);
        setField(term296219, term296219.getClass(), "stack", null);
        setField(term296219, term296219.getClass(), "baseUri", null);
        setField(term296219, term296219.getClass(), "currentToken", null);
        setField(term296219, term296219.getClass(), "settings", null);
        setField(term296219, term296219.getClass(), "start", null);
        setField(term296219, term296219.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markInsertionMode", argTypes, term11322, args);
        assertTrue(recursiveEquals(term11322, term296219));
    }

};


