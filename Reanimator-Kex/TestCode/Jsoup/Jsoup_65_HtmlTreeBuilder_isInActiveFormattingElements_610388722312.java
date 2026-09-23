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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249968;
     Object term254274;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term250072 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term250020 = new ArrayList();
        ((ArrayList) term250020).add(term250072);
        ((ArrayList) term250020).add(term250072);
        ((ArrayList) term250020).add(term250072);
        term249968 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term249968, term249968.getClass(), "formattingElements", term250020);
        Object term254277 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term254277, term254277.getClass(), "tag", null);
        setField(term254277, term254277.getClass(), "shadowChildrenRef", null);
        setField(term254277, term254277.getClass(), "childNodes", null);
        setField(term254277, term254277.getClass(), "attributes", null);
        setField(term254277, term254277.getClass(), "baseUri", null);
        setField(term254277, term254277.getClass(), "parentNode", null);
        setIntField(term254277, term254277.getClass(), "siblingIndex", 0);
        ArrayList term254275 = new ArrayList();
        ((ArrayList) term254275).add(term254277);
        ((ArrayList) term254275).add(term254277);
        ((ArrayList) term254275).add(term254277);
        term254274 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term254274, term254274.getClass(), "state", null);
        setField(term254274, term254274.getClass(), "originalState", null);
        setBooleanField(term254274, term254274.getClass(), "baseUriSetFromDoc", false);
        setField(term254274, term254274.getClass(), "headElement", null);
        setField(term254274, term254274.getClass(), "formElement", null);
        setField(term254274, term254274.getClass(), "contextElement", null);
        setField(term254274, term254274.getClass(), "formattingElements", term254275);
        setField(term254274, term254274.getClass(), "pendingTableCharacters", null);
        setField(term254274, term254274.getClass(), "emptyEnd", null);
        setBooleanField(term254274, term254274.getClass(), "framesetOk", false);
        setBooleanField(term254274, term254274.getClass(), "fosterInserts", false);
        setBooleanField(term254274, term254274.getClass(), "fragmentParsing", false);
        setField(term254274, term254274.getClass(), "specificScopeTarget", null);
        setField(term254274, term254274.getClass(), "reader", null);
        setField(term254274, term254274.getClass(), "tokeniser", null);
        setField(term254274, term254274.getClass(), "doc", null);
        setField(term254274, term254274.getClass(), "stack", null);
        setField(term254274, term254274.getClass(), "baseUri", null);
        setField(term254274, term254274.getClass(), "currentToken", null);
        setField(term254274, term254274.getClass(), "errors", null);
        setField(term254274, term254274.getClass(), "settings", null);
        setField(term254274, term254274.getClass(), "start", null);
        setField(term254274, term254274.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term249968, args);
        assertTrue(recursiveEquals(term249968, term254274));
    }

};


