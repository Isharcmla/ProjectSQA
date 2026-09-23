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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_isElementInQueue_1866131500103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58309;

    public HtmlTreeBuilder_isElementInQueue_1866131500103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58309 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term58309, term58309.getClass(), "state", null);
        setField(term58309, term58309.getClass(), "originalState", null);
        setBooleanField(term58309, term58309.getClass(), "baseUriSetFromDoc", false);
        setField(term58309, term58309.getClass(), "headElement", null);
        setField(term58309, term58309.getClass(), "formElement", null);
        setField(term58309, term58309.getClass(), "contextElement", null);
        setField(term58309, term58309.getClass(), "formattingElements", null);
        setField(term58309, term58309.getClass(), "pendingTableCharacters", null);
        setBooleanField(term58309, term58309.getClass(), "framesetOk", false);
        setBooleanField(term58309, term58309.getClass(), "fosterInserts", false);
        setBooleanField(term58309, term58309.getClass(), "fragmentParsing", false);
        setField(term58309, term58309.getClass(), "reader", null);
        setField(term58309, term58309.getClass(), "tokeniser", null);
        setField(term58309, term58309.getClass(), "doc", null);
        setField(term58309, term58309.getClass(), "stack", null);
        setField(term58309, term58309.getClass(), "baseUri", null);
        setField(term58309, term58309.getClass(), "currentToken", null);
        setField(term58309, term58309.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.helper.DescendableLinkedList");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "isElementInQueue", argTypes, term58309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


