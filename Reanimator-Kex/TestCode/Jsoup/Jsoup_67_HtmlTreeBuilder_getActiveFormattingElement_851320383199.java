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
import java.util.ArrayList;

public class HtmlTreeBuilder_getActiveFormattingElement_851320383199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196112;
     Object term196572;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term196164 = new ArrayList();
        term196112 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196112, term196112.getClass(), "formattingElements", term196164);
        ArrayList term196573 = new ArrayList();
        term196572 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196572, term196572.getClass(), "state", null);
        setField(term196572, term196572.getClass(), "originalState", null);
        setBooleanField(term196572, term196572.getClass(), "baseUriSetFromDoc", false);
        setField(term196572, term196572.getClass(), "headElement", null);
        setField(term196572, term196572.getClass(), "formElement", null);
        setField(term196572, term196572.getClass(), "contextElement", null);
        setField(term196572, term196572.getClass(), "formattingElements", term196573);
        setField(term196572, term196572.getClass(), "pendingTableCharacters", null);
        setField(term196572, term196572.getClass(), "emptyEnd", null);
        setBooleanField(term196572, term196572.getClass(), "framesetOk", false);
        setBooleanField(term196572, term196572.getClass(), "fosterInserts", false);
        setBooleanField(term196572, term196572.getClass(), "fragmentParsing", false);
        setField(term196572, term196572.getClass(), "specificScopeTarget", null);
        setField(term196572, term196572.getClass(), "reader", null);
        setField(term196572, term196572.getClass(), "tokeniser", null);
        setField(term196572, term196572.getClass(), "doc", null);
        setField(term196572, term196572.getClass(), "stack", null);
        setField(term196572, term196572.getClass(), "baseUri", null);
        setField(term196572, term196572.getClass(), "currentToken", null);
        setField(term196572, term196572.getClass(), "errors", null);
        setField(term196572, term196572.getClass(), "settings", null);
        setField(term196572, term196572.getClass(), "start", null);
        setField(term196572, term196572.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term196112, args);
        assertTrue(recursiveEquals(term196112, term196572));
        assertTrue(recursiveEquals(retValue, null));
    }

};


