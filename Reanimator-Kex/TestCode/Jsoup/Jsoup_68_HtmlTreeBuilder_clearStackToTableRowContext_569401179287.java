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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269896;
     Object term270105;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term269948 = new ArrayList();
        term269896 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term269896, term269896.getClass(), "stack", term269948);
        ArrayList term270106 = new ArrayList();
        term270105 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270105, term270105.getClass(), "state", null);
        setField(term270105, term270105.getClass(), "originalState", null);
        setBooleanField(term270105, term270105.getClass(), "baseUriSetFromDoc", false);
        setField(term270105, term270105.getClass(), "headElement", null);
        setField(term270105, term270105.getClass(), "formElement", null);
        setField(term270105, term270105.getClass(), "contextElement", null);
        setField(term270105, term270105.getClass(), "formattingElements", null);
        setField(term270105, term270105.getClass(), "pendingTableCharacters", null);
        setField(term270105, term270105.getClass(), "emptyEnd", null);
        setBooleanField(term270105, term270105.getClass(), "framesetOk", false);
        setBooleanField(term270105, term270105.getClass(), "fosterInserts", false);
        setBooleanField(term270105, term270105.getClass(), "fragmentParsing", false);
        setField(term270105, term270105.getClass(), "specificScopeTarget", null);
        setField(term270105, term270105.getClass(), "reader", null);
        setField(term270105, term270105.getClass(), "tokeniser", null);
        setField(term270105, term270105.getClass(), "doc", null);
        setField(term270105, term270105.getClass(), "stack", term270106);
        setField(term270105, term270105.getClass(), "baseUri", null);
        setField(term270105, term270105.getClass(), "currentToken", null);
        setField(term270105, term270105.getClass(), "errors", null);
        setField(term270105, term270105.getClass(), "settings", null);
        setField(term270105, term270105.getClass(), "start", null);
        setField(term270105, term270105.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term269896, args);
        assertTrue(recursiveEquals(term269896, term270105));
    }

};


