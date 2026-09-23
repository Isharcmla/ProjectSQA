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

public class HtmlTreeBuilder_error_1815929388220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250634;
     Object term250719;

    public HtmlTreeBuilder_error_1815929388220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250634 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term250702 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term250634, term250634.getClass(), "errors", term250702);
        term250719 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term250720 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term250719, term250719.getClass(), "state", null);
        setField(term250719, term250719.getClass(), "originalState", null);
        setBooleanField(term250719, term250719.getClass(), "baseUriSetFromDoc", false);
        setField(term250719, term250719.getClass(), "headElement", null);
        setField(term250719, term250719.getClass(), "formElement", null);
        setField(term250719, term250719.getClass(), "contextElement", null);
        setField(term250719, term250719.getClass(), "formattingElements", null);
        setField(term250719, term250719.getClass(), "pendingTableCharacters", null);
        setField(term250719, term250719.getClass(), "emptyEnd", null);
        setBooleanField(term250719, term250719.getClass(), "framesetOk", false);
        setBooleanField(term250719, term250719.getClass(), "fosterInserts", false);
        setBooleanField(term250719, term250719.getClass(), "fragmentParsing", false);
        setField(term250719, term250719.getClass(), "specificScopeTarget", null);
        setField(term250719, term250719.getClass(), "reader", null);
        setField(term250719, term250719.getClass(), "tokeniser", null);
        setField(term250719, term250719.getClass(), "doc", null);
        setField(term250719, term250719.getClass(), "stack", null);
        setField(term250719, term250719.getClass(), "baseUri", null);
        setField(term250719, term250719.getClass(), "currentToken", null);
        setIntField(term250720, term250720.getClass(), "maxSize", 0);
        setField(term250720, term250720.getClass(), "elementData", null);
        setIntField(term250720, term250720.getClass(), "size", 0);
        setIntField(term250720, term250720.getClass(), "modCount", 0);
        setField(term250719, term250719.getClass(), "errors", term250720);
        setField(term250719, term250719.getClass(), "settings", null);
        setField(term250719, term250719.getClass(), "start", null);
        setField(term250719, term250719.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term250634, args);
        assertTrue(recursiveEquals(term250634, term250719));
    }

};


