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

public class HtmlTreeBuilder_onStack_554151082351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346730;
     Object term346799;

    public HtmlTreeBuilder_onStack_554151082351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term346782 = new ArrayList();
        term346730 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term346730, term346730.getClass(), "stack", term346782);
        ArrayList term346800 = new ArrayList();
        term346799 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term346799, term346799.getClass(), "state", null);
        setField(term346799, term346799.getClass(), "originalState", null);
        setBooleanField(term346799, term346799.getClass(), "baseUriSetFromDoc", false);
        setField(term346799, term346799.getClass(), "headElement", null);
        setField(term346799, term346799.getClass(), "formElement", null);
        setField(term346799, term346799.getClass(), "contextElement", null);
        setField(term346799, term346799.getClass(), "formattingElements", null);
        setField(term346799, term346799.getClass(), "pendingTableCharacters", null);
        setField(term346799, term346799.getClass(), "emptyEnd", null);
        setBooleanField(term346799, term346799.getClass(), "framesetOk", false);
        setBooleanField(term346799, term346799.getClass(), "fosterInserts", false);
        setBooleanField(term346799, term346799.getClass(), "fragmentParsing", false);
        setField(term346799, term346799.getClass(), "specificScopeTarget", null);
        setField(term346799, term346799.getClass(), "parser", null);
        setField(term346799, term346799.getClass(), "reader", null);
        setField(term346799, term346799.getClass(), "tokeniser", null);
        setField(term346799, term346799.getClass(), "doc", null);
        setField(term346799, term346799.getClass(), "stack", term346800);
        setField(term346799, term346799.getClass(), "baseUri", null);
        setField(term346799, term346799.getClass(), "currentToken", null);
        setField(term346799, term346799.getClass(), "settings", null);
        setField(term346799, term346799.getClass(), "start", null);
        setField(term346799, term346799.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term346730, args);
        assertTrue(recursiveEquals(term346730, term346799));
    }

};


