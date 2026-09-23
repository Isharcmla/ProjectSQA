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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420790;
     Object term420898;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420790 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term420872 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term420790, term420790.getClass(), "formattingElements", term420872);
        term420898 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term420899 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term420898, term420898.getClass(), "state", null);
        setField(term420898, term420898.getClass(), "originalState", null);
        setBooleanField(term420898, term420898.getClass(), "baseUriSetFromDoc", false);
        setField(term420898, term420898.getClass(), "headElement", null);
        setField(term420898, term420898.getClass(), "formElement", null);
        setField(term420898, term420898.getClass(), "contextElement", null);
        setIntField(term420899, term420899.getClass(), "size", 0);
        setField(term420899, term420899.getClass(), "first", null);
        setField(term420899, term420899.getClass(), "last", null);
        setIntField(term420899, term420899.getClass(), "modCount", 0);
        setField(term420898, term420898.getClass(), "formattingElements", term420899);
        setField(term420898, term420898.getClass(), "pendingTableCharacters", null);
        setBooleanField(term420898, term420898.getClass(), "framesetOk", false);
        setBooleanField(term420898, term420898.getClass(), "fosterInserts", false);
        setBooleanField(term420898, term420898.getClass(), "fragmentParsing", false);
        setField(term420898, term420898.getClass(), "reader", null);
        setField(term420898, term420898.getClass(), "tokeniser", null);
        setField(term420898, term420898.getClass(), "doc", null);
        setField(term420898, term420898.getClass(), "stack", null);
        setField(term420898, term420898.getClass(), "baseUri", null);
        setField(term420898, term420898.getClass(), "currentToken", null);
        setField(term420898, term420898.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term420790, args);
        assertTrue(recursiveEquals(term420790, term420898));
    }

};


