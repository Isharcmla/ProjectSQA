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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451066;
     Object term451161;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term451118 = new ArrayList();
        term451066 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term451066, term451066.getClass(), "stack", term451118);
        ArrayList term451162 = new ArrayList();
        term451161 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term451161, term451161.getClass(), "state", null);
        setField(term451161, term451161.getClass(), "originalState", null);
        setBooleanField(term451161, term451161.getClass(), "baseUriSetFromDoc", false);
        setField(term451161, term451161.getClass(), "headElement", null);
        setField(term451161, term451161.getClass(), "formElement", null);
        setField(term451161, term451161.getClass(), "contextElement", null);
        setField(term451161, term451161.getClass(), "formattingElements", null);
        setField(term451161, term451161.getClass(), "pendingTableCharacters", null);
        setField(term451161, term451161.getClass(), "emptyEnd", null);
        setBooleanField(term451161, term451161.getClass(), "framesetOk", false);
        setBooleanField(term451161, term451161.getClass(), "fosterInserts", false);
        setBooleanField(term451161, term451161.getClass(), "fragmentParsing", false);
        setField(term451161, term451161.getClass(), "specificScopeTarget", null);
        setField(term451161, term451161.getClass(), "parser", null);
        setField(term451161, term451161.getClass(), "reader", null);
        setField(term451161, term451161.getClass(), "tokeniser", null);
        setField(term451161, term451161.getClass(), "doc", null);
        setField(term451161, term451161.getClass(), "stack", term451162);
        setField(term451161, term451161.getClass(), "baseUri", null);
        setField(term451161, term451161.getClass(), "currentToken", null);
        setField(term451161, term451161.getClass(), "settings", null);
        setField(term451161, term451161.getClass(), "start", null);
        setField(term451161, term451161.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term451066, args);
        assertTrue(recursiveEquals(term451066, term451161));
    }

};


