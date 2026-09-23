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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470843;
     Object term471161;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term470895 = new ArrayList();
        term470843 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term470843, term470843.getClass(), "formattingElements", term470895);
        ArrayList term471162 = new ArrayList();
        term471161 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term471161, term471161.getClass(), "state", null);
        setField(term471161, term471161.getClass(), "originalState", null);
        setBooleanField(term471161, term471161.getClass(), "baseUriSetFromDoc", false);
        setField(term471161, term471161.getClass(), "headElement", null);
        setField(term471161, term471161.getClass(), "formElement", null);
        setField(term471161, term471161.getClass(), "contextElement", null);
        setField(term471161, term471161.getClass(), "formattingElements", term471162);
        setField(term471161, term471161.getClass(), "pendingTableCharacters", null);
        setField(term471161, term471161.getClass(), "emptyEnd", null);
        setBooleanField(term471161, term471161.getClass(), "framesetOk", false);
        setBooleanField(term471161, term471161.getClass(), "fosterInserts", false);
        setBooleanField(term471161, term471161.getClass(), "fragmentParsing", false);
        setField(term471161, term471161.getClass(), "specificScopeTarget", null);
        setField(term471161, term471161.getClass(), "parser", null);
        setField(term471161, term471161.getClass(), "reader", null);
        setField(term471161, term471161.getClass(), "tokeniser", null);
        setField(term471161, term471161.getClass(), "doc", null);
        setField(term471161, term471161.getClass(), "stack", null);
        setField(term471161, term471161.getClass(), "baseUri", null);
        setField(term471161, term471161.getClass(), "currentToken", null);
        setField(term471161, term471161.getClass(), "settings", null);
        setField(term471161, term471161.getClass(), "start", null);
        setField(term471161, term471161.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term470843, args);
        assertTrue(recursiveEquals(term470843, term471161));
    }

};


