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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314623;
     Object term314718;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term314675 = new ArrayList();
        term314623 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term314623, term314623.getClass(), "stack", term314675);
        ArrayList term314719 = new ArrayList();
        term314718 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term314718, term314718.getClass(), "state", null);
        setField(term314718, term314718.getClass(), "originalState", null);
        setBooleanField(term314718, term314718.getClass(), "baseUriSetFromDoc", false);
        setField(term314718, term314718.getClass(), "headElement", null);
        setField(term314718, term314718.getClass(), "formElement", null);
        setField(term314718, term314718.getClass(), "contextElement", null);
        setField(term314718, term314718.getClass(), "formattingElements", null);
        setField(term314718, term314718.getClass(), "pendingTableCharacters", null);
        setField(term314718, term314718.getClass(), "emptyEnd", null);
        setBooleanField(term314718, term314718.getClass(), "framesetOk", false);
        setBooleanField(term314718, term314718.getClass(), "fosterInserts", false);
        setBooleanField(term314718, term314718.getClass(), "fragmentParsing", false);
        setField(term314718, term314718.getClass(), "specificScopeTarget", null);
        setField(term314718, term314718.getClass(), "parser", null);
        setField(term314718, term314718.getClass(), "reader", null);
        setField(term314718, term314718.getClass(), "tokeniser", null);
        setField(term314718, term314718.getClass(), "doc", null);
        setField(term314718, term314718.getClass(), "stack", term314719);
        setField(term314718, term314718.getClass(), "baseUri", null);
        setField(term314718, term314718.getClass(), "currentToken", null);
        setField(term314718, term314718.getClass(), "settings", null);
        setField(term314718, term314718.getClass(), "start", null);
        setField(term314718, term314718.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term314623, args);
        assertTrue(recursiveEquals(term314623, term314718));
    }

};


