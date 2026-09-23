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
import java.lang.Object;

public class Parser_init_174200682736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10352;
     Object term10427;
     Object term10430;

    public Parser_init_174200682736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10282 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setIntField(term10282, term10282.getClass(), "maxErrors", 0);
        setField(term10282, term10282.getClass(), "treeBuilder", null);
        term10352 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term10427 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term10428 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term10429 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term10428, term10428.getClass(), "state", null);
        setField(term10428, term10428.getClass(), "originalState", null);
        setBooleanField(term10428, term10428.getClass(), "baseUriSetFromDoc", false);
        setField(term10428, term10428.getClass(), "headElement", null);
        setField(term10428, term10428.getClass(), "formElement", null);
        setField(term10428, term10428.getClass(), "contextElement", null);
        setField(term10428, term10428.getClass(), "formattingElements", null);
        setField(term10428, term10428.getClass(), "pendingTableCharacters", null);
        setField(term10428, term10428.getClass(), "emptyEnd", null);
        setBooleanField(term10428, term10428.getClass(), "framesetOk", false);
        setBooleanField(term10428, term10428.getClass(), "fosterInserts", false);
        setBooleanField(term10428, term10428.getClass(), "fragmentParsing", false);
        setField(term10428, term10428.getClass(), "specificScopeTarget", null);
        setField(term10428, term10428.getClass(), "reader", null);
        setField(term10428, term10428.getClass(), "tokeniser", null);
        setField(term10428, term10428.getClass(), "doc", null);
        setField(term10428, term10428.getClass(), "stack", null);
        setField(term10428, term10428.getClass(), "baseUri", null);
        setField(term10428, term10428.getClass(), "currentToken", null);
        setField(term10428, term10428.getClass(), "errors", null);
        setField(term10428, term10428.getClass(), "settings", null);
        setField(term10428, term10428.getClass(), "start", null);
        setField(term10428, term10428.getClass(), "end", null);
        setField(term10427, term10427.getClass(), "treeBuilder", term10428);
        setIntField(term10427, term10427.getClass(), "maxErrors", 0);
        setField(term10427, term10427.getClass(), "errors", null);
        setBooleanField(term10429, term10429.getClass(), "preserveTagCase", false);
        setBooleanField(term10429, term10429.getClass(), "preserveAttributeCase", false);
        setField(term10427, term10427.getClass(), "settings", term10429);
        term10430 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term10430, term10430.getClass(), "state", null);
        setField(term10430, term10430.getClass(), "originalState", null);
        setBooleanField(term10430, term10430.getClass(), "baseUriSetFromDoc", false);
        setField(term10430, term10430.getClass(), "headElement", null);
        setField(term10430, term10430.getClass(), "formElement", null);
        setField(term10430, term10430.getClass(), "contextElement", null);
        setField(term10430, term10430.getClass(), "formattingElements", null);
        setField(term10430, term10430.getClass(), "pendingTableCharacters", null);
        setField(term10430, term10430.getClass(), "emptyEnd", null);
        setBooleanField(term10430, term10430.getClass(), "framesetOk", false);
        setBooleanField(term10430, term10430.getClass(), "fosterInserts", false);
        setBooleanField(term10430, term10430.getClass(), "fragmentParsing", false);
        setField(term10430, term10430.getClass(), "specificScopeTarget", null);
        setField(term10430, term10430.getClass(), "reader", null);
        setField(term10430, term10430.getClass(), "tokeniser", null);
        setField(term10430, term10430.getClass(), "doc", null);
        setField(term10430, term10430.getClass(), "stack", null);
        setField(term10430, term10430.getClass(), "baseUri", null);
        setField(term10430, term10430.getClass(), "currentToken", null);
        setField(term10430, term10430.getClass(), "errors", null);
        setField(term10430, term10430.getClass(), "settings", null);
        setField(term10430, term10430.getClass(), "start", null);
        setField(term10430, term10430.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[1];
        args[0] = term10352;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10427));
        assertTrue(recursiveEquals(term10352, term10430));
    }

};


