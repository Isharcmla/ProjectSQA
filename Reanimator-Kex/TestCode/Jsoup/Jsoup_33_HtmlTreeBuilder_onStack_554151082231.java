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

public class HtmlTreeBuilder_onStack_554151082231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425091;
     Object term425225;
     Object term425258;
     Object term425260;

    public HtmlTreeBuilder_onStack_554151082231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425091 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term425173 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term425091, term425091.getClass(), "stack", term425173);
        term425225 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term425258 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term425259 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term425258, term425258.getClass(), "state", null);
        setField(term425258, term425258.getClass(), "originalState", null);
        setBooleanField(term425258, term425258.getClass(), "baseUriSetFromDoc", false);
        setField(term425258, term425258.getClass(), "headElement", null);
        setField(term425258, term425258.getClass(), "formElement", null);
        setField(term425258, term425258.getClass(), "contextElement", null);
        setField(term425258, term425258.getClass(), "formattingElements", null);
        setField(term425258, term425258.getClass(), "pendingTableCharacters", null);
        setBooleanField(term425258, term425258.getClass(), "framesetOk", false);
        setBooleanField(term425258, term425258.getClass(), "fosterInserts", false);
        setBooleanField(term425258, term425258.getClass(), "fragmentParsing", false);
        setField(term425258, term425258.getClass(), "reader", null);
        setField(term425258, term425258.getClass(), "tokeniser", null);
        setField(term425258, term425258.getClass(), "doc", null);
        setIntField(term425259, term425259.getClass(), "size", 0);
        setField(term425259, term425259.getClass(), "first", null);
        setField(term425259, term425259.getClass(), "last", null);
        setIntField(term425259, term425259.getClass(), "modCount", 0);
        setField(term425258, term425258.getClass(), "stack", term425259);
        setField(term425258, term425258.getClass(), "baseUri", null);
        setField(term425258, term425258.getClass(), "currentToken", null);
        setField(term425258, term425258.getClass(), "errors", null);
        term425260 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term425260, term425260.getClass(), "tag", null);
        setField(term425260, term425260.getClass(), "classNames", null);
        setField(term425260, term425260.getClass(), "parentNode", null);
        setField(term425260, term425260.getClass(), "childNodes", null);
        setField(term425260, term425260.getClass(), "attributes", null);
        setField(term425260, term425260.getClass(), "baseUri", null);
        setIntField(term425260, term425260.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term425225;
        callMethod(klass, "onStack", argTypes, term425091, args);
        assertTrue(recursiveEquals(term425091, term425258));
        assertTrue(recursiveEquals(term425225, term425260));
    }

};


