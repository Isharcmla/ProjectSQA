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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213340;
     Object term213819;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term213392 = new ArrayList();
        term213340 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term213340, term213340.getClass(), "stack", term213392);
        ArrayList term213820 = new ArrayList();
        term213819 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term213819, term213819.getClass(), "state", null);
        setField(term213819, term213819.getClass(), "originalState", null);
        setBooleanField(term213819, term213819.getClass(), "baseUriSetFromDoc", false);
        setField(term213819, term213819.getClass(), "headElement", null);
        setField(term213819, term213819.getClass(), "formElement", null);
        setField(term213819, term213819.getClass(), "contextElement", null);
        setField(term213819, term213819.getClass(), "formattingElements", null);
        setField(term213819, term213819.getClass(), "pendingTableCharacters", null);
        setField(term213819, term213819.getClass(), "emptyEnd", null);
        setBooleanField(term213819, term213819.getClass(), "framesetOk", false);
        setBooleanField(term213819, term213819.getClass(), "fosterInserts", false);
        setBooleanField(term213819, term213819.getClass(), "fragmentParsing", false);
        setField(term213819, term213819.getClass(), "specificScopeTarget", null);
        setField(term213819, term213819.getClass(), "reader", null);
        setField(term213819, term213819.getClass(), "tokeniser", null);
        setField(term213819, term213819.getClass(), "doc", null);
        setField(term213819, term213819.getClass(), "stack", term213820);
        setField(term213819, term213819.getClass(), "baseUri", null);
        setField(term213819, term213819.getClass(), "currentToken", null);
        setField(term213819, term213819.getClass(), "errors", null);
        setField(term213819, term213819.getClass(), "settings", null);
        setField(term213819, term213819.getClass(), "start", null);
        setField(term213819, term213819.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term213340, args);
        assertTrue(recursiveEquals(term213340, term213819));
    }

};


