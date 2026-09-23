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

public class HtmlTreeBuilder_getFromStack_640208782261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439452;
     Object term439560;

    public HtmlTreeBuilder_getFromStack_640208782261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439452 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term439534 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term439452, term439452.getClass(), "stack", term439534);
        term439560 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term439561 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term439560, term439560.getClass(), "state", null);
        setField(term439560, term439560.getClass(), "originalState", null);
        setBooleanField(term439560, term439560.getClass(), "baseUriSetFromDoc", false);
        setField(term439560, term439560.getClass(), "headElement", null);
        setField(term439560, term439560.getClass(), "formElement", null);
        setField(term439560, term439560.getClass(), "contextElement", null);
        setField(term439560, term439560.getClass(), "formattingElements", null);
        setField(term439560, term439560.getClass(), "pendingTableCharacters", null);
        setBooleanField(term439560, term439560.getClass(), "framesetOk", false);
        setBooleanField(term439560, term439560.getClass(), "fosterInserts", false);
        setBooleanField(term439560, term439560.getClass(), "fragmentParsing", false);
        setField(term439560, term439560.getClass(), "reader", null);
        setField(term439560, term439560.getClass(), "tokeniser", null);
        setField(term439560, term439560.getClass(), "doc", null);
        setIntField(term439561, term439561.getClass(), "size", 0);
        setField(term439561, term439561.getClass(), "first", null);
        setField(term439561, term439561.getClass(), "last", null);
        setIntField(term439561, term439561.getClass(), "modCount", 0);
        setField(term439560, term439560.getClass(), "stack", term439561);
        setField(term439560, term439560.getClass(), "baseUri", null);
        setField(term439560, term439560.getClass(), "currentToken", null);
        setField(term439560, term439560.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term439452, args);
        assertTrue(recursiveEquals(term439452, term439560));
        assertTrue(recursiveEquals(retValue, null));
    }

};


