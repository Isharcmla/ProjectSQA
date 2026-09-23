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

public class HtmlTreeBuilder_onStack_554151082313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490902;
     Object term490971;

    public HtmlTreeBuilder_onStack_554151082313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term490954 = new ArrayList();
        term490902 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490902, term490902.getClass(), "stack", term490954);
        ArrayList term490972 = new ArrayList();
        term490971 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490971, term490971.getClass(), "state", null);
        setField(term490971, term490971.getClass(), "originalState", null);
        setBooleanField(term490971, term490971.getClass(), "baseUriSetFromDoc", false);
        setField(term490971, term490971.getClass(), "headElement", null);
        setField(term490971, term490971.getClass(), "formElement", null);
        setField(term490971, term490971.getClass(), "contextElement", null);
        setField(term490971, term490971.getClass(), "formattingElements", null);
        setField(term490971, term490971.getClass(), "pendingTableCharacters", null);
        setField(term490971, term490971.getClass(), "emptyEnd", null);
        setBooleanField(term490971, term490971.getClass(), "framesetOk", false);
        setBooleanField(term490971, term490971.getClass(), "fosterInserts", false);
        setBooleanField(term490971, term490971.getClass(), "fragmentParsing", false);
        setField(term490971, term490971.getClass(), "specificScopeTarget", null);
        setField(term490971, term490971.getClass(), "parser", null);
        setField(term490971, term490971.getClass(), "reader", null);
        setField(term490971, term490971.getClass(), "tokeniser", null);
        setField(term490971, term490971.getClass(), "doc", null);
        setField(term490971, term490971.getClass(), "stack", term490972);
        setField(term490971, term490971.getClass(), "baseUri", null);
        setField(term490971, term490971.getClass(), "currentToken", null);
        setField(term490971, term490971.getClass(), "settings", null);
        setField(term490971, term490971.getClass(), "start", null);
        setField(term490971, term490971.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term490902, args);
        assertTrue(recursiveEquals(term490902, term490971));
    }

};


