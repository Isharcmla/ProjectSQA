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

public class HtmlTreeBuilder_error_1815929388286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226790;
     Object term226875;

    public HtmlTreeBuilder_error_1815929388286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226790 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term226858 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term226790, term226790.getClass(), "errors", term226858);
        term226875 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term226876 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term226875, term226875.getClass(), "state", null);
        setField(term226875, term226875.getClass(), "originalState", null);
        setBooleanField(term226875, term226875.getClass(), "baseUriSetFromDoc", false);
        setField(term226875, term226875.getClass(), "headElement", null);
        setField(term226875, term226875.getClass(), "formElement", null);
        setField(term226875, term226875.getClass(), "contextElement", null);
        setField(term226875, term226875.getClass(), "formattingElements", null);
        setField(term226875, term226875.getClass(), "pendingTableCharacters", null);
        setField(term226875, term226875.getClass(), "emptyEnd", null);
        setBooleanField(term226875, term226875.getClass(), "framesetOk", false);
        setBooleanField(term226875, term226875.getClass(), "fosterInserts", false);
        setBooleanField(term226875, term226875.getClass(), "fragmentParsing", false);
        setField(term226875, term226875.getClass(), "specificScopeTarget", null);
        setField(term226875, term226875.getClass(), "reader", null);
        setField(term226875, term226875.getClass(), "tokeniser", null);
        setField(term226875, term226875.getClass(), "doc", null);
        setField(term226875, term226875.getClass(), "stack", null);
        setField(term226875, term226875.getClass(), "baseUri", null);
        setField(term226875, term226875.getClass(), "currentToken", null);
        setIntField(term226876, term226876.getClass(), "maxSize", 0);
        setField(term226876, term226876.getClass(), "elementData", null);
        setIntField(term226876, term226876.getClass(), "size", 0);
        setIntField(term226876, term226876.getClass(), "modCount", 0);
        setField(term226875, term226875.getClass(), "errors", term226876);
        setField(term226875, term226875.getClass(), "settings", null);
        setField(term226875, term226875.getClass(), "start", null);
        setField(term226875, term226875.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term226790, args);
        assertTrue(recursiveEquals(term226790, term226875));
    }

};


