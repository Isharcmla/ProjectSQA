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

public class HtmlTreeBuilder_onStack_554151082240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252810;
     Object term252879;

    public HtmlTreeBuilder_onStack_554151082240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term252862 = new ArrayList();
        term252810 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252810, term252810.getClass(), "stack", term252862);
        ArrayList term252880 = new ArrayList();
        term252879 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252879, term252879.getClass(), "state", null);
        setField(term252879, term252879.getClass(), "originalState", null);
        setBooleanField(term252879, term252879.getClass(), "baseUriSetFromDoc", false);
        setField(term252879, term252879.getClass(), "headElement", null);
        setField(term252879, term252879.getClass(), "formElement", null);
        setField(term252879, term252879.getClass(), "contextElement", null);
        setField(term252879, term252879.getClass(), "formattingElements", null);
        setField(term252879, term252879.getClass(), "pendingTableCharacters", null);
        setField(term252879, term252879.getClass(), "emptyEnd", null);
        setBooleanField(term252879, term252879.getClass(), "framesetOk", false);
        setBooleanField(term252879, term252879.getClass(), "fosterInserts", false);
        setBooleanField(term252879, term252879.getClass(), "fragmentParsing", false);
        setField(term252879, term252879.getClass(), "specificScopeTarget", null);
        setField(term252879, term252879.getClass(), "reader", null);
        setField(term252879, term252879.getClass(), "tokeniser", null);
        setField(term252879, term252879.getClass(), "doc", null);
        setField(term252879, term252879.getClass(), "stack", term252880);
        setField(term252879, term252879.getClass(), "baseUri", null);
        setField(term252879, term252879.getClass(), "currentToken", null);
        setField(term252879, term252879.getClass(), "errors", null);
        setField(term252879, term252879.getClass(), "settings", null);
        setField(term252879, term252879.getClass(), "start", null);
        setField(term252879, term252879.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term252810, args);
        assertTrue(recursiveEquals(term252810, term252879));
    }

};


