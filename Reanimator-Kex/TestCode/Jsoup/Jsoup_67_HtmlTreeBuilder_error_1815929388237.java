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

public class HtmlTreeBuilder_error_1815929388237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208674;
     Object term210617;

    public HtmlTreeBuilder_error_1815929388237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208674 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term208742 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term208674, term208674.getClass(), "errors", term208742);
        term210617 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term210618 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term210617, term210617.getClass(), "state", null);
        setField(term210617, term210617.getClass(), "originalState", null);
        setBooleanField(term210617, term210617.getClass(), "baseUriSetFromDoc", false);
        setField(term210617, term210617.getClass(), "headElement", null);
        setField(term210617, term210617.getClass(), "formElement", null);
        setField(term210617, term210617.getClass(), "contextElement", null);
        setField(term210617, term210617.getClass(), "formattingElements", null);
        setField(term210617, term210617.getClass(), "pendingTableCharacters", null);
        setField(term210617, term210617.getClass(), "emptyEnd", null);
        setBooleanField(term210617, term210617.getClass(), "framesetOk", false);
        setBooleanField(term210617, term210617.getClass(), "fosterInserts", false);
        setBooleanField(term210617, term210617.getClass(), "fragmentParsing", false);
        setField(term210617, term210617.getClass(), "specificScopeTarget", null);
        setField(term210617, term210617.getClass(), "reader", null);
        setField(term210617, term210617.getClass(), "tokeniser", null);
        setField(term210617, term210617.getClass(), "doc", null);
        setField(term210617, term210617.getClass(), "stack", null);
        setField(term210617, term210617.getClass(), "baseUri", null);
        setField(term210617, term210617.getClass(), "currentToken", null);
        setIntField(term210618, term210618.getClass(), "maxSize", 0);
        setField(term210618, term210618.getClass(), "elementData", null);
        setIntField(term210618, term210618.getClass(), "size", 0);
        setIntField(term210618, term210618.getClass(), "modCount", 0);
        setField(term210617, term210617.getClass(), "errors", term210618);
        setField(term210617, term210617.getClass(), "settings", null);
        setField(term210617, term210617.getClass(), "start", null);
        setField(term210617, term210617.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term208674, args);
        assertTrue(recursiveEquals(term208674, term210617));
    }

};


