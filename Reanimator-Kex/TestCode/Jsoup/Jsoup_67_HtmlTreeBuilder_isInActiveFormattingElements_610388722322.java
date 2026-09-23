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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232421;
     Object term232560;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term232525 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term232473 = new ArrayList();
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        ((ArrayList) term232473).add(term232525);
        term232421 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term232421, term232421.getClass(), "formattingElements", term232473);
        Object term232563 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term232563, term232563.getClass(), "tag", null);
        setField(term232563, term232563.getClass(), "shadowChildrenRef", null);
        setField(term232563, term232563.getClass(), "childNodes", null);
        setField(term232563, term232563.getClass(), "attributes", null);
        setField(term232563, term232563.getClass(), "baseUri", null);
        setField(term232563, term232563.getClass(), "parentNode", null);
        setIntField(term232563, term232563.getClass(), "siblingIndex", 0);
        ArrayList term232561 = new ArrayList();
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        ((ArrayList) term232561).add(term232563);
        term232560 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term232560, term232560.getClass(), "state", null);
        setField(term232560, term232560.getClass(), "originalState", null);
        setBooleanField(term232560, term232560.getClass(), "baseUriSetFromDoc", false);
        setField(term232560, term232560.getClass(), "headElement", null);
        setField(term232560, term232560.getClass(), "formElement", null);
        setField(term232560, term232560.getClass(), "contextElement", null);
        setField(term232560, term232560.getClass(), "formattingElements", term232561);
        setField(term232560, term232560.getClass(), "pendingTableCharacters", null);
        setField(term232560, term232560.getClass(), "emptyEnd", null);
        setBooleanField(term232560, term232560.getClass(), "framesetOk", false);
        setBooleanField(term232560, term232560.getClass(), "fosterInserts", false);
        setBooleanField(term232560, term232560.getClass(), "fragmentParsing", false);
        setField(term232560, term232560.getClass(), "specificScopeTarget", null);
        setField(term232560, term232560.getClass(), "reader", null);
        setField(term232560, term232560.getClass(), "tokeniser", null);
        setField(term232560, term232560.getClass(), "doc", null);
        setField(term232560, term232560.getClass(), "stack", null);
        setField(term232560, term232560.getClass(), "baseUri", null);
        setField(term232560, term232560.getClass(), "currentToken", null);
        setField(term232560, term232560.getClass(), "errors", null);
        setField(term232560, term232560.getClass(), "settings", null);
        setField(term232560, term232560.getClass(), "start", null);
        setField(term232560, term232560.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term232421, args);
        assertTrue(recursiveEquals(term232421, term232560));
    }

};


