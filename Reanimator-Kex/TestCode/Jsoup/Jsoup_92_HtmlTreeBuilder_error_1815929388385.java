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

public class HtmlTreeBuilder_error_1815929388385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357731;
     Object term357874;

    public HtmlTreeBuilder_error_1815929388385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357731 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term357783 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term357851 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term357783, term357783.getClass(), "errors", term357851);
        setField(term357731, term357731.getClass(), "parser", term357783);
        term357874 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term357875 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term357876 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term357874, term357874.getClass(), "state", null);
        setField(term357874, term357874.getClass(), "originalState", null);
        setBooleanField(term357874, term357874.getClass(), "baseUriSetFromDoc", false);
        setField(term357874, term357874.getClass(), "headElement", null);
        setField(term357874, term357874.getClass(), "formElement", null);
        setField(term357874, term357874.getClass(), "contextElement", null);
        setField(term357874, term357874.getClass(), "formattingElements", null);
        setField(term357874, term357874.getClass(), "pendingTableCharacters", null);
        setField(term357874, term357874.getClass(), "emptyEnd", null);
        setBooleanField(term357874, term357874.getClass(), "framesetOk", false);
        setBooleanField(term357874, term357874.getClass(), "fosterInserts", false);
        setBooleanField(term357874, term357874.getClass(), "fragmentParsing", false);
        setField(term357874, term357874.getClass(), "specificScopeTarget", null);
        setField(term357875, term357875.getClass(), "treeBuilder", null);
        setIntField(term357876, term357876.getClass(), "maxSize", 0);
        setField(term357876, term357876.getClass(), "elementData", null);
        setIntField(term357876, term357876.getClass(), "size", 0);
        setIntField(term357876, term357876.getClass(), "modCount", 0);
        setField(term357875, term357875.getClass(), "errors", term357876);
        setField(term357875, term357875.getClass(), "settings", null);
        setField(term357874, term357874.getClass(), "parser", term357875);
        setField(term357874, term357874.getClass(), "reader", null);
        setField(term357874, term357874.getClass(), "tokeniser", null);
        setField(term357874, term357874.getClass(), "doc", null);
        setField(term357874, term357874.getClass(), "stack", null);
        setField(term357874, term357874.getClass(), "baseUri", null);
        setField(term357874, term357874.getClass(), "currentToken", null);
        setField(term357874, term357874.getClass(), "settings", null);
        setField(term357874, term357874.getClass(), "start", null);
        setField(term357874, term357874.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term357731, args);
        assertTrue(recursiveEquals(term357731, term357874));
    }

};


