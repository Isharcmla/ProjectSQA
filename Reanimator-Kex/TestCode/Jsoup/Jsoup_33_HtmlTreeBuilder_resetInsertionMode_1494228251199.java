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

public class HtmlTreeBuilder_resetInsertionMode_1494228251199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412596;
     Object term412704;

    public HtmlTreeBuilder_resetInsertionMode_1494228251199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412596 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term412678 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term412596, term412596.getClass(), "stack", term412678);
        term412704 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term412705 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term412704, term412704.getClass(), "state", null);
        setField(term412704, term412704.getClass(), "originalState", null);
        setBooleanField(term412704, term412704.getClass(), "baseUriSetFromDoc", false);
        setField(term412704, term412704.getClass(), "headElement", null);
        setField(term412704, term412704.getClass(), "formElement", null);
        setField(term412704, term412704.getClass(), "contextElement", null);
        setField(term412704, term412704.getClass(), "formattingElements", null);
        setField(term412704, term412704.getClass(), "pendingTableCharacters", null);
        setBooleanField(term412704, term412704.getClass(), "framesetOk", false);
        setBooleanField(term412704, term412704.getClass(), "fosterInserts", false);
        setBooleanField(term412704, term412704.getClass(), "fragmentParsing", false);
        setField(term412704, term412704.getClass(), "reader", null);
        setField(term412704, term412704.getClass(), "tokeniser", null);
        setField(term412704, term412704.getClass(), "doc", null);
        setIntField(term412705, term412705.getClass(), "size", 0);
        setField(term412705, term412705.getClass(), "first", null);
        setField(term412705, term412705.getClass(), "last", null);
        setIntField(term412705, term412705.getClass(), "modCount", 0);
        setField(term412704, term412704.getClass(), "stack", term412705);
        setField(term412704, term412704.getClass(), "baseUri", null);
        setField(term412704, term412704.getClass(), "currentToken", null);
        setField(term412704, term412704.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term412596, args);
        assertTrue(recursiveEquals(term412596, term412704));
    }

};


