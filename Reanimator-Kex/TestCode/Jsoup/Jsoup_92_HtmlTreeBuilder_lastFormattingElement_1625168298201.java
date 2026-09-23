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

public class HtmlTreeBuilder_lastFormattingElement_1625168298201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301130;
     Object term301193;

    public HtmlTreeBuilder_lastFormattingElement_1625168298201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term301182 = new ArrayList();
        term301130 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term301130, term301130.getClass(), "formattingElements", term301182);
        ArrayList term301194 = new ArrayList();
        term301193 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term301193, term301193.getClass(), "state", null);
        setField(term301193, term301193.getClass(), "originalState", null);
        setBooleanField(term301193, term301193.getClass(), "baseUriSetFromDoc", false);
        setField(term301193, term301193.getClass(), "headElement", null);
        setField(term301193, term301193.getClass(), "formElement", null);
        setField(term301193, term301193.getClass(), "contextElement", null);
        setField(term301193, term301193.getClass(), "formattingElements", term301194);
        setField(term301193, term301193.getClass(), "pendingTableCharacters", null);
        setField(term301193, term301193.getClass(), "emptyEnd", null);
        setBooleanField(term301193, term301193.getClass(), "framesetOk", false);
        setBooleanField(term301193, term301193.getClass(), "fosterInserts", false);
        setBooleanField(term301193, term301193.getClass(), "fragmentParsing", false);
        setField(term301193, term301193.getClass(), "specificScopeTarget", null);
        setField(term301193, term301193.getClass(), "parser", null);
        setField(term301193, term301193.getClass(), "reader", null);
        setField(term301193, term301193.getClass(), "tokeniser", null);
        setField(term301193, term301193.getClass(), "doc", null);
        setField(term301193, term301193.getClass(), "stack", null);
        setField(term301193, term301193.getClass(), "baseUri", null);
        setField(term301193, term301193.getClass(), "currentToken", null);
        setField(term301193, term301193.getClass(), "settings", null);
        setField(term301193, term301193.getClass(), "start", null);
        setField(term301193, term301193.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "lastFormattingElement", argTypes, term301130, args);
        assertTrue(recursiveEquals(term301130, term301193));
        assertTrue(recursiveEquals(retValue, null));
    }

};


