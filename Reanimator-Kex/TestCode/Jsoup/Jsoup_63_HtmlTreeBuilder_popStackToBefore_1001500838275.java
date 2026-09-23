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

public class HtmlTreeBuilder_popStackToBefore_1001500838275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226197;
     Object term226411;

    public HtmlTreeBuilder_popStackToBefore_1001500838275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226249 = new ArrayList();
        term226197 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226197, term226197.getClass(), "stack", term226249);
        ArrayList term226412 = new ArrayList();
        term226411 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226411, term226411.getClass(), "state", null);
        setField(term226411, term226411.getClass(), "originalState", null);
        setBooleanField(term226411, term226411.getClass(), "baseUriSetFromDoc", false);
        setField(term226411, term226411.getClass(), "headElement", null);
        setField(term226411, term226411.getClass(), "formElement", null);
        setField(term226411, term226411.getClass(), "contextElement", null);
        setField(term226411, term226411.getClass(), "formattingElements", null);
        setField(term226411, term226411.getClass(), "pendingTableCharacters", null);
        setField(term226411, term226411.getClass(), "emptyEnd", null);
        setBooleanField(term226411, term226411.getClass(), "framesetOk", false);
        setBooleanField(term226411, term226411.getClass(), "fosterInserts", false);
        setBooleanField(term226411, term226411.getClass(), "fragmentParsing", false);
        setField(term226411, term226411.getClass(), "specificScopeTarget", null);
        setField(term226411, term226411.getClass(), "reader", null);
        setField(term226411, term226411.getClass(), "tokeniser", null);
        setField(term226411, term226411.getClass(), "doc", null);
        setField(term226411, term226411.getClass(), "stack", term226412);
        setField(term226411, term226411.getClass(), "baseUri", null);
        setField(term226411, term226411.getClass(), "currentToken", null);
        setField(term226411, term226411.getClass(), "errors", null);
        setField(term226411, term226411.getClass(), "settings", null);
        setField(term226411, term226411.getClass(), "start", null);
        setField(term226411, term226411.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term226197, args);
        assertTrue(recursiveEquals(term226197, term226411));
    }

};


