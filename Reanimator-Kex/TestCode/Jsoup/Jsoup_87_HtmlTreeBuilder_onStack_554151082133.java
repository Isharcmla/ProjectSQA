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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_onStack_554151082133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39301;

    public HtmlTreeBuilder_onStack_554151082133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39301 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term39301, term39301.getClass(), "state", null);
        setField(term39301, term39301.getClass(), "originalState", null);
        setBooleanField(term39301, term39301.getClass(), "baseUriSetFromDoc", false);
        setField(term39301, term39301.getClass(), "headElement", null);
        setField(term39301, term39301.getClass(), "formElement", null);
        setField(term39301, term39301.getClass(), "contextElement", null);
        setField(term39301, term39301.getClass(), "formattingElements", null);
        setField(term39301, term39301.getClass(), "pendingTableCharacters", null);
        setField(term39301, term39301.getClass(), "emptyEnd", null);
        setBooleanField(term39301, term39301.getClass(), "framesetOk", false);
        setBooleanField(term39301, term39301.getClass(), "fosterInserts", false);
        setBooleanField(term39301, term39301.getClass(), "fragmentParsing", false);
        setField(term39301, term39301.getClass(), "specificScopeTarget", null);
        setField(term39301, term39301.getClass(), "parser", null);
        setField(term39301, term39301.getClass(), "reader", null);
        setField(term39301, term39301.getClass(), "tokeniser", null);
        setField(term39301, term39301.getClass(), "doc", null);
        setField(term39301, term39301.getClass(), "stack", null);
        setField(term39301, term39301.getClass(), "baseUri", null);
        setField(term39301, term39301.getClass(), "currentToken", null);
        setField(term39301, term39301.getClass(), "settings", null);
        setField(term39301, term39301.getClass(), "start", null);
        setField(term39301, term39301.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "onStack", argTypes, term39301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


