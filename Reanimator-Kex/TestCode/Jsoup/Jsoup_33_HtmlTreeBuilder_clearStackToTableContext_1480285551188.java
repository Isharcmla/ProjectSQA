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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410709;
     Object term410904;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410709 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410791 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term410709, term410709.getClass(), "stack", term410791);
        term410904 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410905 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term410904, term410904.getClass(), "state", null);
        setField(term410904, term410904.getClass(), "originalState", null);
        setBooleanField(term410904, term410904.getClass(), "baseUriSetFromDoc", false);
        setField(term410904, term410904.getClass(), "headElement", null);
        setField(term410904, term410904.getClass(), "formElement", null);
        setField(term410904, term410904.getClass(), "contextElement", null);
        setField(term410904, term410904.getClass(), "formattingElements", null);
        setField(term410904, term410904.getClass(), "pendingTableCharacters", null);
        setBooleanField(term410904, term410904.getClass(), "framesetOk", false);
        setBooleanField(term410904, term410904.getClass(), "fosterInserts", false);
        setBooleanField(term410904, term410904.getClass(), "fragmentParsing", false);
        setField(term410904, term410904.getClass(), "reader", null);
        setField(term410904, term410904.getClass(), "tokeniser", null);
        setField(term410904, term410904.getClass(), "doc", null);
        setIntField(term410905, term410905.getClass(), "size", 0);
        setField(term410905, term410905.getClass(), "first", null);
        setField(term410905, term410905.getClass(), "last", null);
        setIntField(term410905, term410905.getClass(), "modCount", 0);
        setField(term410904, term410904.getClass(), "stack", term410905);
        setField(term410904, term410904.getClass(), "baseUri", null);
        setField(term410904, term410904.getClass(), "currentToken", null);
        setField(term410904, term410904.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term410709, args);
        assertTrue(recursiveEquals(term410709, term410904));
    }

};


