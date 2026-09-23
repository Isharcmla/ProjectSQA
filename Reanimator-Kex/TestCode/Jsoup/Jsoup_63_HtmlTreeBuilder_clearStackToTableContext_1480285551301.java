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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231034;
     Object term231453;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term231086 = new ArrayList();
        term231034 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term231034, term231034.getClass(), "stack", term231086);
        ArrayList term231454 = new ArrayList();
        term231453 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term231453, term231453.getClass(), "state", null);
        setField(term231453, term231453.getClass(), "originalState", null);
        setBooleanField(term231453, term231453.getClass(), "baseUriSetFromDoc", false);
        setField(term231453, term231453.getClass(), "headElement", null);
        setField(term231453, term231453.getClass(), "formElement", null);
        setField(term231453, term231453.getClass(), "contextElement", null);
        setField(term231453, term231453.getClass(), "formattingElements", null);
        setField(term231453, term231453.getClass(), "pendingTableCharacters", null);
        setField(term231453, term231453.getClass(), "emptyEnd", null);
        setBooleanField(term231453, term231453.getClass(), "framesetOk", false);
        setBooleanField(term231453, term231453.getClass(), "fosterInserts", false);
        setBooleanField(term231453, term231453.getClass(), "fragmentParsing", false);
        setField(term231453, term231453.getClass(), "specificScopeTarget", null);
        setField(term231453, term231453.getClass(), "reader", null);
        setField(term231453, term231453.getClass(), "tokeniser", null);
        setField(term231453, term231453.getClass(), "doc", null);
        setField(term231453, term231453.getClass(), "stack", term231454);
        setField(term231453, term231453.getClass(), "baseUri", null);
        setField(term231453, term231453.getClass(), "currentToken", null);
        setField(term231453, term231453.getClass(), "errors", null);
        setField(term231453, term231453.getClass(), "settings", null);
        setField(term231453, term231453.getClass(), "start", null);
        setField(term231453, term231453.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term231034, args);
        assertTrue(recursiveEquals(term231034, term231453));
    }

};


