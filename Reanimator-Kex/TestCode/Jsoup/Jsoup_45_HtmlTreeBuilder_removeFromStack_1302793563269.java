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

public class HtmlTreeBuilder_removeFromStack_1302793563269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620455;
     Object term620577;

    public HtmlTreeBuilder_removeFromStack_1302793563269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term620559 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term620507 = new ArrayList();
        ((ArrayList) term620507).add(term620559);
        ((ArrayList) term620507).add(term620559);
        term620455 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620455, term620455.getClass(), "stack", term620507);
        Object term620580 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term620580, term620580.getClass(), "tag", null);
        setField(term620580, term620580.getClass(), "parentNode", null);
        setField(term620580, term620580.getClass(), "childNodes", null);
        setField(term620580, term620580.getClass(), "attributes", null);
        setField(term620580, term620580.getClass(), "baseUri", null);
        setIntField(term620580, term620580.getClass(), "siblingIndex", 0);
        ArrayList term620578 = new ArrayList();
        ((ArrayList) term620578).add(term620580);
        ((ArrayList) term620578).add(term620580);
        term620577 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620577, term620577.getClass(), "state", null);
        setField(term620577, term620577.getClass(), "originalState", null);
        setBooleanField(term620577, term620577.getClass(), "baseUriSetFromDoc", false);
        setField(term620577, term620577.getClass(), "headElement", null);
        setField(term620577, term620577.getClass(), "formElement", null);
        setField(term620577, term620577.getClass(), "contextElement", null);
        setField(term620577, term620577.getClass(), "formattingElements", null);
        setField(term620577, term620577.getClass(), "pendingTableCharacters", null);
        setField(term620577, term620577.getClass(), "emptyEnd", null);
        setBooleanField(term620577, term620577.getClass(), "framesetOk", false);
        setBooleanField(term620577, term620577.getClass(), "fosterInserts", false);
        setBooleanField(term620577, term620577.getClass(), "fragmentParsing", false);
        setField(term620577, term620577.getClass(), "specificScopeTarget", null);
        setField(term620577, term620577.getClass(), "reader", null);
        setField(term620577, term620577.getClass(), "tokeniser", null);
        setField(term620577, term620577.getClass(), "doc", null);
        setField(term620577, term620577.getClass(), "stack", term620578);
        setField(term620577, term620577.getClass(), "baseUri", null);
        setField(term620577, term620577.getClass(), "currentToken", null);
        setField(term620577, term620577.getClass(), "errors", null);
        setField(term620577, term620577.getClass(), "start", null);
        setField(term620577, term620577.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term620455, args);
        assertTrue(recursiveEquals(term620455, term620577));
        assertTrue(recursiveEquals(retValue, false));
    }

};


