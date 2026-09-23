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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446071;
     Object term446149;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term446123 = new ArrayList();
        term446071 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term446071, term446071.getClass(), "stack", term446123);
        ArrayList term446150 = new ArrayList();
        term446149 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term446149, term446149.getClass(), "state", null);
        setField(term446149, term446149.getClass(), "originalState", null);
        setBooleanField(term446149, term446149.getClass(), "baseUriSetFromDoc", false);
        setField(term446149, term446149.getClass(), "headElement", null);
        setField(term446149, term446149.getClass(), "formElement", null);
        setField(term446149, term446149.getClass(), "contextElement", null);
        setField(term446149, term446149.getClass(), "formattingElements", null);
        setField(term446149, term446149.getClass(), "pendingTableCharacters", null);
        setField(term446149, term446149.getClass(), "emptyEnd", null);
        setBooleanField(term446149, term446149.getClass(), "framesetOk", false);
        setBooleanField(term446149, term446149.getClass(), "fosterInserts", false);
        setBooleanField(term446149, term446149.getClass(), "fragmentParsing", false);
        setField(term446149, term446149.getClass(), "specificScopeTarget", null);
        setField(term446149, term446149.getClass(), "parser", null);
        setField(term446149, term446149.getClass(), "reader", null);
        setField(term446149, term446149.getClass(), "tokeniser", null);
        setField(term446149, term446149.getClass(), "doc", null);
        setField(term446149, term446149.getClass(), "stack", term446150);
        setField(term446149, term446149.getClass(), "baseUri", null);
        setField(term446149, term446149.getClass(), "currentToken", null);
        setField(term446149, term446149.getClass(), "settings", null);
        setField(term446149, term446149.getClass(), "start", null);
        setField(term446149, term446149.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term446071, args);
        assertTrue(recursiveEquals(term446071, term446149));
    }

};


