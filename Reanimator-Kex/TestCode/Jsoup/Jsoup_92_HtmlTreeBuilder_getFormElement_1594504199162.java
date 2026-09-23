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

public class HtmlTreeBuilder_getFormElement_1594504199162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82957;
     Object term198354;

    public HtmlTreeBuilder_getFormElement_1594504199162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82957 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term82957, term82957.getClass(), "state", null);
        setField(term82957, term82957.getClass(), "originalState", null);
        setBooleanField(term82957, term82957.getClass(), "baseUriSetFromDoc", false);
        setField(term82957, term82957.getClass(), "headElement", null);
        setField(term82957, term82957.getClass(), "formElement", null);
        setField(term82957, term82957.getClass(), "contextElement", null);
        setField(term82957, term82957.getClass(), "formattingElements", null);
        setField(term82957, term82957.getClass(), "pendingTableCharacters", null);
        setField(term82957, term82957.getClass(), "emptyEnd", null);
        setBooleanField(term82957, term82957.getClass(), "framesetOk", false);
        setBooleanField(term82957, term82957.getClass(), "fosterInserts", false);
        setBooleanField(term82957, term82957.getClass(), "fragmentParsing", false);
        setField(term82957, term82957.getClass(), "specificScopeTarget", null);
        setField(term82957, term82957.getClass(), "parser", null);
        setField(term82957, term82957.getClass(), "reader", null);
        setField(term82957, term82957.getClass(), "tokeniser", null);
        setField(term82957, term82957.getClass(), "doc", null);
        setField(term82957, term82957.getClass(), "stack", null);
        setField(term82957, term82957.getClass(), "baseUri", null);
        setField(term82957, term82957.getClass(), "currentToken", null);
        setField(term82957, term82957.getClass(), "settings", null);
        setField(term82957, term82957.getClass(), "start", null);
        setField(term82957, term82957.getClass(), "end", null);
        term198354 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term198354, term198354.getClass(), "state", null);
        setField(term198354, term198354.getClass(), "originalState", null);
        setBooleanField(term198354, term198354.getClass(), "baseUriSetFromDoc", false);
        setField(term198354, term198354.getClass(), "headElement", null);
        setField(term198354, term198354.getClass(), "formElement", null);
        setField(term198354, term198354.getClass(), "contextElement", null);
        setField(term198354, term198354.getClass(), "formattingElements", null);
        setField(term198354, term198354.getClass(), "pendingTableCharacters", null);
        setField(term198354, term198354.getClass(), "emptyEnd", null);
        setBooleanField(term198354, term198354.getClass(), "framesetOk", false);
        setBooleanField(term198354, term198354.getClass(), "fosterInserts", false);
        setBooleanField(term198354, term198354.getClass(), "fragmentParsing", false);
        setField(term198354, term198354.getClass(), "specificScopeTarget", null);
        setField(term198354, term198354.getClass(), "parser", null);
        setField(term198354, term198354.getClass(), "reader", null);
        setField(term198354, term198354.getClass(), "tokeniser", null);
        setField(term198354, term198354.getClass(), "doc", null);
        setField(term198354, term198354.getClass(), "stack", null);
        setField(term198354, term198354.getClass(), "baseUri", null);
        setField(term198354, term198354.getClass(), "currentToken", null);
        setField(term198354, term198354.getClass(), "settings", null);
        setField(term198354, term198354.getClass(), "start", null);
        setField(term198354, term198354.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormElement", argTypes, term82957, args);
        assertTrue(recursiveEquals(term82957, term198354));
        assertTrue(recursiveEquals(retValue, null));
    }

};


