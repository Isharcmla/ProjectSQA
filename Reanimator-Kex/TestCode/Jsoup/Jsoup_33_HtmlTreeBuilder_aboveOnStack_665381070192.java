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

public class HtmlTreeBuilder_aboveOnStack_665381070192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411057;
     Object term411331;

    public HtmlTreeBuilder_aboveOnStack_665381070192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411057 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term411139 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term411057, term411057.getClass(), "stack", term411139);
        term411331 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term411332 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term411331, term411331.getClass(), "state", null);
        setField(term411331, term411331.getClass(), "originalState", null);
        setBooleanField(term411331, term411331.getClass(), "baseUriSetFromDoc", false);
        setField(term411331, term411331.getClass(), "headElement", null);
        setField(term411331, term411331.getClass(), "formElement", null);
        setField(term411331, term411331.getClass(), "contextElement", null);
        setField(term411331, term411331.getClass(), "formattingElements", null);
        setField(term411331, term411331.getClass(), "pendingTableCharacters", null);
        setBooleanField(term411331, term411331.getClass(), "framesetOk", false);
        setBooleanField(term411331, term411331.getClass(), "fosterInserts", false);
        setBooleanField(term411331, term411331.getClass(), "fragmentParsing", false);
        setField(term411331, term411331.getClass(), "reader", null);
        setField(term411331, term411331.getClass(), "tokeniser", null);
        setField(term411331, term411331.getClass(), "doc", null);
        setIntField(term411332, term411332.getClass(), "size", 0);
        setField(term411332, term411332.getClass(), "first", null);
        setField(term411332, term411332.getClass(), "last", null);
        setIntField(term411332, term411332.getClass(), "modCount", 0);
        setField(term411331, term411331.getClass(), "stack", term411332);
        setField(term411331, term411331.getClass(), "baseUri", null);
        setField(term411331, term411331.getClass(), "currentToken", null);
        setField(term411331, term411331.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term411057, args);
        assertTrue(recursiveEquals(term411057, term411331));
        assertTrue(recursiveEquals(retValue, null));
    }

};


