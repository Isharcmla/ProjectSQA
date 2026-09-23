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

public class HtmlTreeBuilder_transition_59122119111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9236;
     Object term129838;

    public HtmlTreeBuilder_transition_59122119111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9236 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term9236, term9236.getClass(), "state", null);
        setField(term9236, term9236.getClass(), "originalState", null);
        setBooleanField(term9236, term9236.getClass(), "baseUriSetFromDoc", false);
        setField(term9236, term9236.getClass(), "headElement", null);
        setField(term9236, term9236.getClass(), "formElement", null);
        setField(term9236, term9236.getClass(), "contextElement", null);
        setField(term9236, term9236.getClass(), "formattingElements", null);
        setField(term9236, term9236.getClass(), "pendingTableCharacters", null);
        setField(term9236, term9236.getClass(), "emptyEnd", null);
        setBooleanField(term9236, term9236.getClass(), "framesetOk", false);
        setBooleanField(term9236, term9236.getClass(), "fosterInserts", false);
        setBooleanField(term9236, term9236.getClass(), "fragmentParsing", false);
        setField(term9236, term9236.getClass(), "specificScopeTarget", null);
        setField(term9236, term9236.getClass(), "parser", null);
        setField(term9236, term9236.getClass(), "reader", null);
        setField(term9236, term9236.getClass(), "tokeniser", null);
        setField(term9236, term9236.getClass(), "doc", null);
        setField(term9236, term9236.getClass(), "stack", null);
        setField(term9236, term9236.getClass(), "baseUri", null);
        setField(term9236, term9236.getClass(), "currentToken", null);
        setField(term9236, term9236.getClass(), "settings", null);
        setField(term9236, term9236.getClass(), "start", null);
        setField(term9236, term9236.getClass(), "end", null);
        term129838 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term129838, term129838.getClass(), "state", null);
        setField(term129838, term129838.getClass(), "originalState", null);
        setBooleanField(term129838, term129838.getClass(), "baseUriSetFromDoc", false);
        setField(term129838, term129838.getClass(), "headElement", null);
        setField(term129838, term129838.getClass(), "formElement", null);
        setField(term129838, term129838.getClass(), "contextElement", null);
        setField(term129838, term129838.getClass(), "formattingElements", null);
        setField(term129838, term129838.getClass(), "pendingTableCharacters", null);
        setField(term129838, term129838.getClass(), "emptyEnd", null);
        setBooleanField(term129838, term129838.getClass(), "framesetOk", false);
        setBooleanField(term129838, term129838.getClass(), "fosterInserts", false);
        setBooleanField(term129838, term129838.getClass(), "fragmentParsing", false);
        setField(term129838, term129838.getClass(), "specificScopeTarget", null);
        setField(term129838, term129838.getClass(), "parser", null);
        setField(term129838, term129838.getClass(), "reader", null);
        setField(term129838, term129838.getClass(), "tokeniser", null);
        setField(term129838, term129838.getClass(), "doc", null);
        setField(term129838, term129838.getClass(), "stack", null);
        setField(term129838, term129838.getClass(), "baseUri", null);
        setField(term129838, term129838.getClass(), "currentToken", null);
        setField(term129838, term129838.getClass(), "settings", null);
        setField(term129838, term129838.getClass(), "start", null);
        setField(term129838, term129838.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transition", argTypes, term9236, args);
        assertTrue(recursiveEquals(term9236, term129838));
    }

};


