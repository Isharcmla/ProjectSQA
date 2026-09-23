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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411222;
     Object term411342;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411222 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term411304 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term411222, term411222.getClass(), "formattingElements", term411304);
        term411342 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term411343 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term411342, term411342.getClass(), "state", null);
        setField(term411342, term411342.getClass(), "originalState", null);
        setBooleanField(term411342, term411342.getClass(), "baseUriSetFromDoc", false);
        setField(term411342, term411342.getClass(), "headElement", null);
        setField(term411342, term411342.getClass(), "formElement", null);
        setField(term411342, term411342.getClass(), "contextElement", null);
        setIntField(term411343, term411343.getClass(), "size", 0);
        setField(term411343, term411343.getClass(), "first", null);
        setField(term411343, term411343.getClass(), "last", null);
        setIntField(term411343, term411343.getClass(), "modCount", 0);
        setField(term411342, term411342.getClass(), "formattingElements", term411343);
        setField(term411342, term411342.getClass(), "pendingTableCharacters", null);
        setBooleanField(term411342, term411342.getClass(), "framesetOk", false);
        setBooleanField(term411342, term411342.getClass(), "fosterInserts", false);
        setBooleanField(term411342, term411342.getClass(), "fragmentParsing", false);
        setField(term411342, term411342.getClass(), "reader", null);
        setField(term411342, term411342.getClass(), "tokeniser", null);
        setField(term411342, term411342.getClass(), "doc", null);
        setField(term411342, term411342.getClass(), "stack", null);
        setField(term411342, term411342.getClass(), "baseUri", null);
        setField(term411342, term411342.getClass(), "currentToken", null);
        setField(term411342, term411342.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstructFormattingElements", argTypes, term411222, args);
        assertTrue(recursiveEquals(term411222, term411342));
    }

};


