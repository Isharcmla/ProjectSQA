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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413082;
     Object term413195;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413082 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term413164 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term413082, term413082.getClass(), "formattingElements", term413164);
        term413195 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term413196 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term413195, term413195.getClass(), "state", null);
        setField(term413195, term413195.getClass(), "originalState", null);
        setBooleanField(term413195, term413195.getClass(), "baseUriSetFromDoc", false);
        setField(term413195, term413195.getClass(), "headElement", null);
        setField(term413195, term413195.getClass(), "formElement", null);
        setField(term413195, term413195.getClass(), "contextElement", null);
        setIntField(term413196, term413196.getClass(), "size", 0);
        setField(term413196, term413196.getClass(), "first", null);
        setField(term413196, term413196.getClass(), "last", null);
        setIntField(term413196, term413196.getClass(), "modCount", 0);
        setField(term413195, term413195.getClass(), "formattingElements", term413196);
        setField(term413195, term413195.getClass(), "pendingTableCharacters", null);
        setBooleanField(term413195, term413195.getClass(), "framesetOk", false);
        setBooleanField(term413195, term413195.getClass(), "fosterInserts", false);
        setBooleanField(term413195, term413195.getClass(), "fragmentParsing", false);
        setField(term413195, term413195.getClass(), "reader", null);
        setField(term413195, term413195.getClass(), "tokeniser", null);
        setField(term413195, term413195.getClass(), "doc", null);
        setField(term413195, term413195.getClass(), "stack", null);
        setField(term413195, term413195.getClass(), "baseUri", null);
        setField(term413195, term413195.getClass(), "currentToken", null);
        setField(term413195, term413195.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term413082, args);
        assertTrue(recursiveEquals(term413082, term413195));
    }

};


