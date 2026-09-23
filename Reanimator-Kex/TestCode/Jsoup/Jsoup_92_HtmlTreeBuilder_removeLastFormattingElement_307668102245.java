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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318107;
     Object term318170;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318159 = new ArrayList();
        term318107 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318107, term318107.getClass(), "formattingElements", term318159);
        ArrayList term318171 = new ArrayList();
        term318170 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318170, term318170.getClass(), "state", null);
        setField(term318170, term318170.getClass(), "originalState", null);
        setBooleanField(term318170, term318170.getClass(), "baseUriSetFromDoc", false);
        setField(term318170, term318170.getClass(), "headElement", null);
        setField(term318170, term318170.getClass(), "formElement", null);
        setField(term318170, term318170.getClass(), "contextElement", null);
        setField(term318170, term318170.getClass(), "formattingElements", term318171);
        setField(term318170, term318170.getClass(), "pendingTableCharacters", null);
        setField(term318170, term318170.getClass(), "emptyEnd", null);
        setBooleanField(term318170, term318170.getClass(), "framesetOk", false);
        setBooleanField(term318170, term318170.getClass(), "fosterInserts", false);
        setBooleanField(term318170, term318170.getClass(), "fragmentParsing", false);
        setField(term318170, term318170.getClass(), "specificScopeTarget", null);
        setField(term318170, term318170.getClass(), "parser", null);
        setField(term318170, term318170.getClass(), "reader", null);
        setField(term318170, term318170.getClass(), "tokeniser", null);
        setField(term318170, term318170.getClass(), "doc", null);
        setField(term318170, term318170.getClass(), "stack", null);
        setField(term318170, term318170.getClass(), "baseUri", null);
        setField(term318170, term318170.getClass(), "currentToken", null);
        setField(term318170, term318170.getClass(), "settings", null);
        setField(term318170, term318170.getClass(), "start", null);
        setField(term318170, term318170.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "removeLastFormattingElement", argTypes, term318107, args);
        assertTrue(recursiveEquals(term318107, term318170));
        assertTrue(recursiveEquals(retValue, null));
    }

};


