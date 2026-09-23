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
import java.util.ArrayList;

public class Parser_htmlParser_111645799324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2894;

    public Parser_htmlParser_111645799324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2900 = new ArrayList();
        term2894 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term2895 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term2897 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term2895, term2895.getClass(), "state", null);
        setField(term2895, term2895.getClass(), "originalState", null);
        setBooleanField(term2895, term2895.getClass(), "baseUriSetFromDoc", false);
        setField(term2895, term2895.getClass(), "headElement", null);
        setField(term2895, term2895.getClass(), "formElement", null);
        setField(term2895, term2895.getClass(), "contextElement", null);
        setIntField(term2897, term2897.getClass(), "size", 0);
        setField(term2897, term2897.getClass(), "first", null);
        setField(term2897, term2897.getClass(), "last", null);
        setIntField(term2897, term2897.getClass(), "modCount", 0);
        setField(term2895, term2895.getClass(), "formattingElements", term2897);
        setField(term2895, term2895.getClass(), "pendingTableCharacters", term2900);
        setBooleanField(term2895, term2895.getClass(), "framesetOk", true);
        setBooleanField(term2895, term2895.getClass(), "fosterInserts", false);
        setBooleanField(term2895, term2895.getClass(), "fragmentParsing", false);
        setField(term2895, term2895.getClass(), "reader", null);
        setField(term2895, term2895.getClass(), "tokeniser", null);
        setField(term2895, term2895.getClass(), "doc", null);
        setField(term2895, term2895.getClass(), "stack", null);
        setField(term2895, term2895.getClass(), "baseUri", null);
        setField(term2895, term2895.getClass(), "currentToken", null);
        setField(term2895, term2895.getClass(), "errors", null);
        setField(term2894, term2894.getClass(), "treeBuilder", term2895);
        setIntField(term2894, term2894.getClass(), "maxErrors", 0);
        setField(term2894, term2894.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "htmlParser", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2894));
    }

};


