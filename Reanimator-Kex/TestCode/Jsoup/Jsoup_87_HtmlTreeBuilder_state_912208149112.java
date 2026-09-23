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

public class HtmlTreeBuilder_state_912208149112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10255;
     Object term296213;

    public HtmlTreeBuilder_state_912208149112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10255 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term10255, term10255.getClass(), "state", null);
        setField(term10255, term10255.getClass(), "originalState", null);
        setBooleanField(term10255, term10255.getClass(), "baseUriSetFromDoc", false);
        setField(term10255, term10255.getClass(), "headElement", null);
        setField(term10255, term10255.getClass(), "formElement", null);
        setField(term10255, term10255.getClass(), "contextElement", null);
        setField(term10255, term10255.getClass(), "formattingElements", null);
        setField(term10255, term10255.getClass(), "pendingTableCharacters", null);
        setField(term10255, term10255.getClass(), "emptyEnd", null);
        setBooleanField(term10255, term10255.getClass(), "framesetOk", false);
        setBooleanField(term10255, term10255.getClass(), "fosterInserts", false);
        setBooleanField(term10255, term10255.getClass(), "fragmentParsing", false);
        setField(term10255, term10255.getClass(), "specificScopeTarget", null);
        setField(term10255, term10255.getClass(), "parser", null);
        setField(term10255, term10255.getClass(), "reader", null);
        setField(term10255, term10255.getClass(), "tokeniser", null);
        setField(term10255, term10255.getClass(), "doc", null);
        setField(term10255, term10255.getClass(), "stack", null);
        setField(term10255, term10255.getClass(), "baseUri", null);
        setField(term10255, term10255.getClass(), "currentToken", null);
        setField(term10255, term10255.getClass(), "settings", null);
        setField(term10255, term10255.getClass(), "start", null);
        setField(term10255, term10255.getClass(), "end", null);
        term296213 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term296213, term296213.getClass(), "state", null);
        setField(term296213, term296213.getClass(), "originalState", null);
        setBooleanField(term296213, term296213.getClass(), "baseUriSetFromDoc", false);
        setField(term296213, term296213.getClass(), "headElement", null);
        setField(term296213, term296213.getClass(), "formElement", null);
        setField(term296213, term296213.getClass(), "contextElement", null);
        setField(term296213, term296213.getClass(), "formattingElements", null);
        setField(term296213, term296213.getClass(), "pendingTableCharacters", null);
        setField(term296213, term296213.getClass(), "emptyEnd", null);
        setBooleanField(term296213, term296213.getClass(), "framesetOk", false);
        setBooleanField(term296213, term296213.getClass(), "fosterInserts", false);
        setBooleanField(term296213, term296213.getClass(), "fragmentParsing", false);
        setField(term296213, term296213.getClass(), "specificScopeTarget", null);
        setField(term296213, term296213.getClass(), "parser", null);
        setField(term296213, term296213.getClass(), "reader", null);
        setField(term296213, term296213.getClass(), "tokeniser", null);
        setField(term296213, term296213.getClass(), "doc", null);
        setField(term296213, term296213.getClass(), "stack", null);
        setField(term296213, term296213.getClass(), "baseUri", null);
        setField(term296213, term296213.getClass(), "currentToken", null);
        setField(term296213, term296213.getClass(), "settings", null);
        setField(term296213, term296213.getClass(), "start", null);
        setField(term296213, term296213.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "state", argTypes, term10255, args);
        assertTrue(recursiveEquals(term10255, term296213));
        assertTrue(recursiveEquals(retValue, null));
    }

};


