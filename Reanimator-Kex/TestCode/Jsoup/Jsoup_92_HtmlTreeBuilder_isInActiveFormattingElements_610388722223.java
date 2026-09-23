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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313107;
     Object term313176;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term313159 = new ArrayList();
        term313107 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term313107, term313107.getClass(), "formattingElements", term313159);
        ArrayList term313177 = new ArrayList();
        term313176 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term313176, term313176.getClass(), "state", null);
        setField(term313176, term313176.getClass(), "originalState", null);
        setBooleanField(term313176, term313176.getClass(), "baseUriSetFromDoc", false);
        setField(term313176, term313176.getClass(), "headElement", null);
        setField(term313176, term313176.getClass(), "formElement", null);
        setField(term313176, term313176.getClass(), "contextElement", null);
        setField(term313176, term313176.getClass(), "formattingElements", term313177);
        setField(term313176, term313176.getClass(), "pendingTableCharacters", null);
        setField(term313176, term313176.getClass(), "emptyEnd", null);
        setBooleanField(term313176, term313176.getClass(), "framesetOk", false);
        setBooleanField(term313176, term313176.getClass(), "fosterInserts", false);
        setBooleanField(term313176, term313176.getClass(), "fragmentParsing", false);
        setField(term313176, term313176.getClass(), "specificScopeTarget", null);
        setField(term313176, term313176.getClass(), "parser", null);
        setField(term313176, term313176.getClass(), "reader", null);
        setField(term313176, term313176.getClass(), "tokeniser", null);
        setField(term313176, term313176.getClass(), "doc", null);
        setField(term313176, term313176.getClass(), "stack", null);
        setField(term313176, term313176.getClass(), "baseUri", null);
        setField(term313176, term313176.getClass(), "currentToken", null);
        setField(term313176, term313176.getClass(), "settings", null);
        setField(term313176, term313176.getClass(), "start", null);
        setField(term313176, term313176.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term313107, args);
        assertTrue(recursiveEquals(term313107, term313176));
    }

};


