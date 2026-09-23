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

public class HtmlTreeBuilder_onStack_554151082271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620737;
     Object term620868;

    public HtmlTreeBuilder_onStack_554151082271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term620841 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term620789 = new ArrayList();
        ((ArrayList) term620789).add(term620841);
        ((ArrayList) term620789).add(term620841);
        ((ArrayList) term620789).add(term620841);
        term620737 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620737, term620737.getClass(), "stack", term620789);
        Object term620871 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term620871, term620871.getClass(), "tag", null);
        setField(term620871, term620871.getClass(), "parentNode", null);
        setField(term620871, term620871.getClass(), "childNodes", null);
        setField(term620871, term620871.getClass(), "attributes", null);
        setField(term620871, term620871.getClass(), "baseUri", null);
        setIntField(term620871, term620871.getClass(), "siblingIndex", 0);
        ArrayList term620869 = new ArrayList();
        ((ArrayList) term620869).add(term620871);
        ((ArrayList) term620869).add(term620871);
        ((ArrayList) term620869).add(term620871);
        term620868 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620868, term620868.getClass(), "state", null);
        setField(term620868, term620868.getClass(), "originalState", null);
        setBooleanField(term620868, term620868.getClass(), "baseUriSetFromDoc", false);
        setField(term620868, term620868.getClass(), "headElement", null);
        setField(term620868, term620868.getClass(), "formElement", null);
        setField(term620868, term620868.getClass(), "contextElement", null);
        setField(term620868, term620868.getClass(), "formattingElements", null);
        setField(term620868, term620868.getClass(), "pendingTableCharacters", null);
        setField(term620868, term620868.getClass(), "emptyEnd", null);
        setBooleanField(term620868, term620868.getClass(), "framesetOk", false);
        setBooleanField(term620868, term620868.getClass(), "fosterInserts", false);
        setBooleanField(term620868, term620868.getClass(), "fragmentParsing", false);
        setField(term620868, term620868.getClass(), "specificScopeTarget", null);
        setField(term620868, term620868.getClass(), "reader", null);
        setField(term620868, term620868.getClass(), "tokeniser", null);
        setField(term620868, term620868.getClass(), "doc", null);
        setField(term620868, term620868.getClass(), "stack", term620869);
        setField(term620868, term620868.getClass(), "baseUri", null);
        setField(term620868, term620868.getClass(), "currentToken", null);
        setField(term620868, term620868.getClass(), "errors", null);
        setField(term620868, term620868.getClass(), "start", null);
        setField(term620868, term620868.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term620737, args);
        assertTrue(recursiveEquals(term620737, term620868));
    }

};


