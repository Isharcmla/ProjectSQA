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

public class HtmlTreeBuilder_resetInsertionMode_1494228251205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201837;
     Object term202063;

    public HtmlTreeBuilder_resetInsertionMode_1494228251205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201889 = new ArrayList();
        term201837 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term201837, term201837.getClass(), "stack", term201889);
        ArrayList term202064 = new ArrayList();
        term202063 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term202063, term202063.getClass(), "state", null);
        setField(term202063, term202063.getClass(), "originalState", null);
        setBooleanField(term202063, term202063.getClass(), "baseUriSetFromDoc", false);
        setField(term202063, term202063.getClass(), "headElement", null);
        setField(term202063, term202063.getClass(), "formElement", null);
        setField(term202063, term202063.getClass(), "contextElement", null);
        setField(term202063, term202063.getClass(), "formattingElements", null);
        setField(term202063, term202063.getClass(), "pendingTableCharacters", null);
        setField(term202063, term202063.getClass(), "emptyEnd", null);
        setBooleanField(term202063, term202063.getClass(), "framesetOk", false);
        setBooleanField(term202063, term202063.getClass(), "fosterInserts", false);
        setBooleanField(term202063, term202063.getClass(), "fragmentParsing", false);
        setField(term202063, term202063.getClass(), "specificScopeTarget", null);
        setField(term202063, term202063.getClass(), "reader", null);
        setField(term202063, term202063.getClass(), "tokeniser", null);
        setField(term202063, term202063.getClass(), "doc", null);
        setField(term202063, term202063.getClass(), "stack", term202064);
        setField(term202063, term202063.getClass(), "baseUri", null);
        setField(term202063, term202063.getClass(), "currentToken", null);
        setField(term202063, term202063.getClass(), "errors", null);
        setField(term202063, term202063.getClass(), "settings", null);
        setField(term202063, term202063.getClass(), "start", null);
        setField(term202063, term202063.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term201837, args);
        assertTrue(recursiveEquals(term201837, term202063));
    }

};


