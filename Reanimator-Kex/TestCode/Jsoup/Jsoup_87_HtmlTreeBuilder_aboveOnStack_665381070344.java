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

public class HtmlTreeBuilder_aboveOnStack_665381070344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505788;
     Object term506073;

    public HtmlTreeBuilder_aboveOnStack_665381070344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term505840 = new ArrayList();
        term505788 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term505788, term505788.getClass(), "stack", term505840);
        ArrayList term506074 = new ArrayList();
        term506073 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term506073, term506073.getClass(), "state", null);
        setField(term506073, term506073.getClass(), "originalState", null);
        setBooleanField(term506073, term506073.getClass(), "baseUriSetFromDoc", false);
        setField(term506073, term506073.getClass(), "headElement", null);
        setField(term506073, term506073.getClass(), "formElement", null);
        setField(term506073, term506073.getClass(), "contextElement", null);
        setField(term506073, term506073.getClass(), "formattingElements", null);
        setField(term506073, term506073.getClass(), "pendingTableCharacters", null);
        setField(term506073, term506073.getClass(), "emptyEnd", null);
        setBooleanField(term506073, term506073.getClass(), "framesetOk", false);
        setBooleanField(term506073, term506073.getClass(), "fosterInserts", false);
        setBooleanField(term506073, term506073.getClass(), "fragmentParsing", false);
        setField(term506073, term506073.getClass(), "specificScopeTarget", null);
        setField(term506073, term506073.getClass(), "parser", null);
        setField(term506073, term506073.getClass(), "reader", null);
        setField(term506073, term506073.getClass(), "tokeniser", null);
        setField(term506073, term506073.getClass(), "doc", null);
        setField(term506073, term506073.getClass(), "stack", term506074);
        setField(term506073, term506073.getClass(), "baseUri", null);
        setField(term506073, term506073.getClass(), "currentToken", null);
        setField(term506073, term506073.getClass(), "settings", null);
        setField(term506073, term506073.getClass(), "start", null);
        setField(term506073, term506073.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term505788, args);
        assertTrue(recursiveEquals(term505788, term506073));
        assertTrue(recursiveEquals(retValue, null));
    }

};


