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

public class HtmlTreeBuilder_resetInsertionMode_1494228251290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221688;
     Object term221751;

    public HtmlTreeBuilder_resetInsertionMode_1494228251290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term221740 = new ArrayList();
        term221688 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term221688, term221688.getClass(), "stack", term221740);
        ArrayList term221752 = new ArrayList();
        term221751 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term221751, term221751.getClass(), "state", null);
        setField(term221751, term221751.getClass(), "originalState", null);
        setBooleanField(term221751, term221751.getClass(), "baseUriSetFromDoc", false);
        setField(term221751, term221751.getClass(), "headElement", null);
        setField(term221751, term221751.getClass(), "formElement", null);
        setField(term221751, term221751.getClass(), "contextElement", null);
        setField(term221751, term221751.getClass(), "formattingElements", null);
        setField(term221751, term221751.getClass(), "pendingTableCharacters", null);
        setField(term221751, term221751.getClass(), "emptyEnd", null);
        setBooleanField(term221751, term221751.getClass(), "framesetOk", false);
        setBooleanField(term221751, term221751.getClass(), "fosterInserts", false);
        setBooleanField(term221751, term221751.getClass(), "fragmentParsing", false);
        setField(term221751, term221751.getClass(), "specificScopeTarget", null);
        setField(term221751, term221751.getClass(), "reader", null);
        setField(term221751, term221751.getClass(), "tokeniser", null);
        setField(term221751, term221751.getClass(), "doc", null);
        setField(term221751, term221751.getClass(), "stack", term221752);
        setField(term221751, term221751.getClass(), "baseUri", null);
        setField(term221751, term221751.getClass(), "currentToken", null);
        setField(term221751, term221751.getClass(), "errors", null);
        setField(term221751, term221751.getClass(), "settings", null);
        setField(term221751, term221751.getClass(), "start", null);
        setField(term221751, term221751.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term221688, args);
        assertTrue(recursiveEquals(term221688, term221751));
    }

};


