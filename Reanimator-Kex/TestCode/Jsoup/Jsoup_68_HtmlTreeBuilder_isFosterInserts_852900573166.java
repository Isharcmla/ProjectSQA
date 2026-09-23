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

public class HtmlTreeBuilder_isFosterInserts_852900573166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74631;
     Object term167098;

    public HtmlTreeBuilder_isFosterInserts_852900573166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74631 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term74631, term74631.getClass(), "state", null);
        setField(term74631, term74631.getClass(), "originalState", null);
        setBooleanField(term74631, term74631.getClass(), "baseUriSetFromDoc", false);
        setField(term74631, term74631.getClass(), "headElement", null);
        setField(term74631, term74631.getClass(), "formElement", null);
        setField(term74631, term74631.getClass(), "contextElement", null);
        setField(term74631, term74631.getClass(), "formattingElements", null);
        setField(term74631, term74631.getClass(), "pendingTableCharacters", null);
        setField(term74631, term74631.getClass(), "emptyEnd", null);
        setBooleanField(term74631, term74631.getClass(), "framesetOk", false);
        setBooleanField(term74631, term74631.getClass(), "fosterInserts", false);
        setBooleanField(term74631, term74631.getClass(), "fragmentParsing", false);
        setField(term74631, term74631.getClass(), "specificScopeTarget", null);
        setField(term74631, term74631.getClass(), "reader", null);
        setField(term74631, term74631.getClass(), "tokeniser", null);
        setField(term74631, term74631.getClass(), "doc", null);
        setField(term74631, term74631.getClass(), "stack", null);
        setField(term74631, term74631.getClass(), "baseUri", null);
        setField(term74631, term74631.getClass(), "currentToken", null);
        setField(term74631, term74631.getClass(), "errors", null);
        setField(term74631, term74631.getClass(), "settings", null);
        setField(term74631, term74631.getClass(), "start", null);
        setField(term74631, term74631.getClass(), "end", null);
        term167098 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term167098, term167098.getClass(), "state", null);
        setField(term167098, term167098.getClass(), "originalState", null);
        setBooleanField(term167098, term167098.getClass(), "baseUriSetFromDoc", false);
        setField(term167098, term167098.getClass(), "headElement", null);
        setField(term167098, term167098.getClass(), "formElement", null);
        setField(term167098, term167098.getClass(), "contextElement", null);
        setField(term167098, term167098.getClass(), "formattingElements", null);
        setField(term167098, term167098.getClass(), "pendingTableCharacters", null);
        setField(term167098, term167098.getClass(), "emptyEnd", null);
        setBooleanField(term167098, term167098.getClass(), "framesetOk", false);
        setBooleanField(term167098, term167098.getClass(), "fosterInserts", false);
        setBooleanField(term167098, term167098.getClass(), "fragmentParsing", false);
        setField(term167098, term167098.getClass(), "specificScopeTarget", null);
        setField(term167098, term167098.getClass(), "reader", null);
        setField(term167098, term167098.getClass(), "tokeniser", null);
        setField(term167098, term167098.getClass(), "doc", null);
        setField(term167098, term167098.getClass(), "stack", null);
        setField(term167098, term167098.getClass(), "baseUri", null);
        setField(term167098, term167098.getClass(), "currentToken", null);
        setField(term167098, term167098.getClass(), "errors", null);
        setField(term167098, term167098.getClass(), "settings", null);
        setField(term167098, term167098.getClass(), "start", null);
        setField(term167098, term167098.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFosterInserts", argTypes, term74631, args);
        assertTrue(recursiveEquals(term74631, term167098));
    }

};


