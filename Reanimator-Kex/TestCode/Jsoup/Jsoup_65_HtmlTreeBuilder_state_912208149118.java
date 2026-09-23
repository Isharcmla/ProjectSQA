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

public class HtmlTreeBuilder_state_912208149118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7658;
     Object term112244;

    public HtmlTreeBuilder_state_912208149118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7658 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term7658, term7658.getClass(), "state", null);
        setField(term7658, term7658.getClass(), "originalState", null);
        setBooleanField(term7658, term7658.getClass(), "baseUriSetFromDoc", false);
        setField(term7658, term7658.getClass(), "headElement", null);
        setField(term7658, term7658.getClass(), "formElement", null);
        setField(term7658, term7658.getClass(), "contextElement", null);
        setField(term7658, term7658.getClass(), "formattingElements", null);
        setField(term7658, term7658.getClass(), "pendingTableCharacters", null);
        setField(term7658, term7658.getClass(), "emptyEnd", null);
        setBooleanField(term7658, term7658.getClass(), "framesetOk", false);
        setBooleanField(term7658, term7658.getClass(), "fosterInserts", false);
        setBooleanField(term7658, term7658.getClass(), "fragmentParsing", false);
        setField(term7658, term7658.getClass(), "specificScopeTarget", null);
        setField(term7658, term7658.getClass(), "reader", null);
        setField(term7658, term7658.getClass(), "tokeniser", null);
        setField(term7658, term7658.getClass(), "doc", null);
        setField(term7658, term7658.getClass(), "stack", null);
        setField(term7658, term7658.getClass(), "baseUri", null);
        setField(term7658, term7658.getClass(), "currentToken", null);
        setField(term7658, term7658.getClass(), "errors", null);
        setField(term7658, term7658.getClass(), "settings", null);
        setField(term7658, term7658.getClass(), "start", null);
        setField(term7658, term7658.getClass(), "end", null);
        term112244 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term112244, term112244.getClass(), "state", null);
        setField(term112244, term112244.getClass(), "originalState", null);
        setBooleanField(term112244, term112244.getClass(), "baseUriSetFromDoc", false);
        setField(term112244, term112244.getClass(), "headElement", null);
        setField(term112244, term112244.getClass(), "formElement", null);
        setField(term112244, term112244.getClass(), "contextElement", null);
        setField(term112244, term112244.getClass(), "formattingElements", null);
        setField(term112244, term112244.getClass(), "pendingTableCharacters", null);
        setField(term112244, term112244.getClass(), "emptyEnd", null);
        setBooleanField(term112244, term112244.getClass(), "framesetOk", false);
        setBooleanField(term112244, term112244.getClass(), "fosterInserts", false);
        setBooleanField(term112244, term112244.getClass(), "fragmentParsing", false);
        setField(term112244, term112244.getClass(), "specificScopeTarget", null);
        setField(term112244, term112244.getClass(), "reader", null);
        setField(term112244, term112244.getClass(), "tokeniser", null);
        setField(term112244, term112244.getClass(), "doc", null);
        setField(term112244, term112244.getClass(), "stack", null);
        setField(term112244, term112244.getClass(), "baseUri", null);
        setField(term112244, term112244.getClass(), "currentToken", null);
        setField(term112244, term112244.getClass(), "errors", null);
        setField(term112244, term112244.getClass(), "settings", null);
        setField(term112244, term112244.getClass(), "start", null);
        setField(term112244, term112244.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "state", argTypes, term7658, args);
        assertTrue(recursiveEquals(term7658, term112244));
        assertTrue(recursiveEquals(retValue, null));
    }

};


