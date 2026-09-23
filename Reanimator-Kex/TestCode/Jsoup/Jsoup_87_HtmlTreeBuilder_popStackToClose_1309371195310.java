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

public class HtmlTreeBuilder_popStackToClose_1309371195310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490598;
     Object term490802;

    public HtmlTreeBuilder_popStackToClose_1309371195310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term490650 = new ArrayList();
        term490598 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490598, term490598.getClass(), "stack", term490650);
        ArrayList term490803 = new ArrayList();
        term490802 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490802, term490802.getClass(), "state", null);
        setField(term490802, term490802.getClass(), "originalState", null);
        setBooleanField(term490802, term490802.getClass(), "baseUriSetFromDoc", false);
        setField(term490802, term490802.getClass(), "headElement", null);
        setField(term490802, term490802.getClass(), "formElement", null);
        setField(term490802, term490802.getClass(), "contextElement", null);
        setField(term490802, term490802.getClass(), "formattingElements", null);
        setField(term490802, term490802.getClass(), "pendingTableCharacters", null);
        setField(term490802, term490802.getClass(), "emptyEnd", null);
        setBooleanField(term490802, term490802.getClass(), "framesetOk", false);
        setBooleanField(term490802, term490802.getClass(), "fosterInserts", false);
        setBooleanField(term490802, term490802.getClass(), "fragmentParsing", false);
        setField(term490802, term490802.getClass(), "specificScopeTarget", null);
        setField(term490802, term490802.getClass(), "parser", null);
        setField(term490802, term490802.getClass(), "reader", null);
        setField(term490802, term490802.getClass(), "tokeniser", null);
        setField(term490802, term490802.getClass(), "doc", null);
        setField(term490802, term490802.getClass(), "stack", term490803);
        setField(term490802, term490802.getClass(), "baseUri", null);
        setField(term490802, term490802.getClass(), "currentToken", null);
        setField(term490802, term490802.getClass(), "settings", null);
        setField(term490802, term490802.getClass(), "start", null);
        setField(term490802, term490802.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term490598, args);
        assertTrue(recursiveEquals(term490598, term490802));
    }

};


