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

public class HtmlTreeBuilder_error_1815929388163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595761;
     Object term595882;

    public HtmlTreeBuilder_error_1815929388163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595761 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term595829 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term595761, term595761.getClass(), "errors", term595829);
        term595882 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term595883 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term595882, term595882.getClass(), "state", null);
        setField(term595882, term595882.getClass(), "originalState", null);
        setBooleanField(term595882, term595882.getClass(), "baseUriSetFromDoc", false);
        setField(term595882, term595882.getClass(), "headElement", null);
        setField(term595882, term595882.getClass(), "formElement", null);
        setField(term595882, term595882.getClass(), "contextElement", null);
        setField(term595882, term595882.getClass(), "formattingElements", null);
        setField(term595882, term595882.getClass(), "pendingTableCharacters", null);
        setField(term595882, term595882.getClass(), "emptyEnd", null);
        setBooleanField(term595882, term595882.getClass(), "framesetOk", false);
        setBooleanField(term595882, term595882.getClass(), "fosterInserts", false);
        setBooleanField(term595882, term595882.getClass(), "fragmentParsing", false);
        setField(term595882, term595882.getClass(), "specificScopeTarget", null);
        setField(term595882, term595882.getClass(), "reader", null);
        setField(term595882, term595882.getClass(), "tokeniser", null);
        setField(term595882, term595882.getClass(), "doc", null);
        setField(term595882, term595882.getClass(), "stack", null);
        setField(term595882, term595882.getClass(), "baseUri", null);
        setField(term595882, term595882.getClass(), "currentToken", null);
        setIntField(term595883, term595883.getClass(), "maxSize", 0);
        setField(term595883, term595883.getClass(), "elementData", null);
        setIntField(term595883, term595883.getClass(), "size", 0);
        setIntField(term595883, term595883.getClass(), "modCount", 0);
        setField(term595882, term595882.getClass(), "errors", term595883);
        setField(term595882, term595882.getClass(), "start", null);
        setField(term595882, term595882.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term595761, args);
        assertTrue(recursiveEquals(term595761, term595882));
    }

};


