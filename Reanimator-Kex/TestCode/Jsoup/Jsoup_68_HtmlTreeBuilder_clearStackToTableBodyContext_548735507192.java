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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246340;
     Object term246442;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term246392 = new ArrayList();
        term246340 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term246340, term246340.getClass(), "stack", term246392);
        ArrayList term246443 = new ArrayList();
        term246442 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term246442, term246442.getClass(), "state", null);
        setField(term246442, term246442.getClass(), "originalState", null);
        setBooleanField(term246442, term246442.getClass(), "baseUriSetFromDoc", false);
        setField(term246442, term246442.getClass(), "headElement", null);
        setField(term246442, term246442.getClass(), "formElement", null);
        setField(term246442, term246442.getClass(), "contextElement", null);
        setField(term246442, term246442.getClass(), "formattingElements", null);
        setField(term246442, term246442.getClass(), "pendingTableCharacters", null);
        setField(term246442, term246442.getClass(), "emptyEnd", null);
        setBooleanField(term246442, term246442.getClass(), "framesetOk", false);
        setBooleanField(term246442, term246442.getClass(), "fosterInserts", false);
        setBooleanField(term246442, term246442.getClass(), "fragmentParsing", false);
        setField(term246442, term246442.getClass(), "specificScopeTarget", null);
        setField(term246442, term246442.getClass(), "reader", null);
        setField(term246442, term246442.getClass(), "tokeniser", null);
        setField(term246442, term246442.getClass(), "doc", null);
        setField(term246442, term246442.getClass(), "stack", term246443);
        setField(term246442, term246442.getClass(), "baseUri", null);
        setField(term246442, term246442.getClass(), "currentToken", null);
        setField(term246442, term246442.getClass(), "errors", null);
        setField(term246442, term246442.getClass(), "settings", null);
        setField(term246442, term246442.getClass(), "start", null);
        setField(term246442, term246442.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term246340, args);
        assertTrue(recursiveEquals(term246340, term246442));
    }

};


