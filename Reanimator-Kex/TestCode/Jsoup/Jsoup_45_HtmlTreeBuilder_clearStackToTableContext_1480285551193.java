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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602113;
     Object term602201;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term602165 = new ArrayList();
        term602113 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term602113, term602113.getClass(), "stack", term602165);
        ArrayList term602202 = new ArrayList();
        term602201 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term602201, term602201.getClass(), "state", null);
        setField(term602201, term602201.getClass(), "originalState", null);
        setBooleanField(term602201, term602201.getClass(), "baseUriSetFromDoc", false);
        setField(term602201, term602201.getClass(), "headElement", null);
        setField(term602201, term602201.getClass(), "formElement", null);
        setField(term602201, term602201.getClass(), "contextElement", null);
        setField(term602201, term602201.getClass(), "formattingElements", null);
        setField(term602201, term602201.getClass(), "pendingTableCharacters", null);
        setField(term602201, term602201.getClass(), "emptyEnd", null);
        setBooleanField(term602201, term602201.getClass(), "framesetOk", false);
        setBooleanField(term602201, term602201.getClass(), "fosterInserts", false);
        setBooleanField(term602201, term602201.getClass(), "fragmentParsing", false);
        setField(term602201, term602201.getClass(), "specificScopeTarget", null);
        setField(term602201, term602201.getClass(), "reader", null);
        setField(term602201, term602201.getClass(), "tokeniser", null);
        setField(term602201, term602201.getClass(), "doc", null);
        setField(term602201, term602201.getClass(), "stack", term602202);
        setField(term602201, term602201.getClass(), "baseUri", null);
        setField(term602201, term602201.getClass(), "currentToken", null);
        setField(term602201, term602201.getClass(), "errors", null);
        setField(term602201, term602201.getClass(), "start", null);
        setField(term602201, term602201.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term602113, args);
        assertTrue(recursiveEquals(term602113, term602201));
    }

};


