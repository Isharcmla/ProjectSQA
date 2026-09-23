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
import java.lang.Object;

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199074;
     Object term199390;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term199126 = new ArrayList();
        term199074 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term199074, term199074.getClass(), "formattingElements", term199126);
        ArrayList term199391 = new ArrayList();
        ((ArrayList) term199391).add((Object)null);
        term199390 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term199390, term199390.getClass(), "state", null);
        setField(term199390, term199390.getClass(), "originalState", null);
        setBooleanField(term199390, term199390.getClass(), "baseUriSetFromDoc", false);
        setField(term199390, term199390.getClass(), "headElement", null);
        setField(term199390, term199390.getClass(), "formElement", null);
        setField(term199390, term199390.getClass(), "contextElement", null);
        setField(term199390, term199390.getClass(), "formattingElements", term199391);
        setField(term199390, term199390.getClass(), "pendingTableCharacters", null);
        setField(term199390, term199390.getClass(), "emptyEnd", null);
        setBooleanField(term199390, term199390.getClass(), "framesetOk", false);
        setBooleanField(term199390, term199390.getClass(), "fosterInserts", false);
        setBooleanField(term199390, term199390.getClass(), "fragmentParsing", false);
        setField(term199390, term199390.getClass(), "specificScopeTarget", null);
        setField(term199390, term199390.getClass(), "reader", null);
        setField(term199390, term199390.getClass(), "tokeniser", null);
        setField(term199390, term199390.getClass(), "doc", null);
        setField(term199390, term199390.getClass(), "stack", null);
        setField(term199390, term199390.getClass(), "baseUri", null);
        setField(term199390, term199390.getClass(), "currentToken", null);
        setField(term199390, term199390.getClass(), "errors", null);
        setField(term199390, term199390.getClass(), "settings", null);
        setField(term199390, term199390.getClass(), "start", null);
        setField(term199390, term199390.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term199074, args);
        assertTrue(recursiveEquals(term199074, term199390));
    }

};


