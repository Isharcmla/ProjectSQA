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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298214;
     Object term298292;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298266 = new ArrayList();
        term298214 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term298214, term298214.getClass(), "stack", term298266);
        ArrayList term298293 = new ArrayList();
        term298292 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term298292, term298292.getClass(), "state", null);
        setField(term298292, term298292.getClass(), "originalState", null);
        setBooleanField(term298292, term298292.getClass(), "baseUriSetFromDoc", false);
        setField(term298292, term298292.getClass(), "headElement", null);
        setField(term298292, term298292.getClass(), "formElement", null);
        setField(term298292, term298292.getClass(), "contextElement", null);
        setField(term298292, term298292.getClass(), "formattingElements", null);
        setField(term298292, term298292.getClass(), "pendingTableCharacters", null);
        setField(term298292, term298292.getClass(), "emptyEnd", null);
        setBooleanField(term298292, term298292.getClass(), "framesetOk", false);
        setBooleanField(term298292, term298292.getClass(), "fosterInserts", false);
        setBooleanField(term298292, term298292.getClass(), "fragmentParsing", false);
        setField(term298292, term298292.getClass(), "specificScopeTarget", null);
        setField(term298292, term298292.getClass(), "parser", null);
        setField(term298292, term298292.getClass(), "reader", null);
        setField(term298292, term298292.getClass(), "tokeniser", null);
        setField(term298292, term298292.getClass(), "doc", null);
        setField(term298292, term298292.getClass(), "stack", term298293);
        setField(term298292, term298292.getClass(), "baseUri", null);
        setField(term298292, term298292.getClass(), "currentToken", null);
        setField(term298292, term298292.getClass(), "settings", null);
        setField(term298292, term298292.getClass(), "start", null);
        setField(term298292, term298292.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term298214, args);
        assertTrue(recursiveEquals(term298214, term298292));
    }

};


