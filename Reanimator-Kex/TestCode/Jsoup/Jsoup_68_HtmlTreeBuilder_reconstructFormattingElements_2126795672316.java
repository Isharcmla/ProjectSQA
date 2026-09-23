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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282090;
     Object term282154;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term282142 = new ArrayList();
        term282090 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term282090, term282090.getClass(), "formattingElements", term282142);
        ArrayList term282155 = new ArrayList();
        term282154 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term282154, term282154.getClass(), "state", null);
        setField(term282154, term282154.getClass(), "originalState", null);
        setBooleanField(term282154, term282154.getClass(), "baseUriSetFromDoc", false);
        setField(term282154, term282154.getClass(), "headElement", null);
        setField(term282154, term282154.getClass(), "formElement", null);
        setField(term282154, term282154.getClass(), "contextElement", null);
        setField(term282154, term282154.getClass(), "formattingElements", term282155);
        setField(term282154, term282154.getClass(), "pendingTableCharacters", null);
        setField(term282154, term282154.getClass(), "emptyEnd", null);
        setBooleanField(term282154, term282154.getClass(), "framesetOk", false);
        setBooleanField(term282154, term282154.getClass(), "fosterInserts", false);
        setBooleanField(term282154, term282154.getClass(), "fragmentParsing", false);
        setField(term282154, term282154.getClass(), "specificScopeTarget", null);
        setField(term282154, term282154.getClass(), "reader", null);
        setField(term282154, term282154.getClass(), "tokeniser", null);
        setField(term282154, term282154.getClass(), "doc", null);
        setField(term282154, term282154.getClass(), "stack", null);
        setField(term282154, term282154.getClass(), "baseUri", null);
        setField(term282154, term282154.getClass(), "currentToken", null);
        setField(term282154, term282154.getClass(), "errors", null);
        setField(term282154, term282154.getClass(), "settings", null);
        setField(term282154, term282154.getClass(), "start", null);
        setField(term282154, term282154.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstructFormattingElements", argTypes, term282090, args);
        assertTrue(recursiveEquals(term282090, term282154));
    }

};


