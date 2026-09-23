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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480764;
     Object term480920;
     Object term480999;
     Object term481003;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term480868 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term480816 = new ArrayList();
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add((Object)null);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        ((ArrayList) term480816).add(term480868);
        term480764 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term480764, term480764.getClass(), "formattingElements", term480816);
        term480920 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term481002 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term481002, term481002.getClass(), "tag", null);
        setField(term481002, term481002.getClass(), "shadowChildrenRef", null);
        setField(term481002, term481002.getClass(), "childNodes", null);
        setField(term481002, term481002.getClass(), "attributes", null);
        setField(term481002, term481002.getClass(), "baseUri", null);
        setField(term481002, term481002.getClass(), "parentNode", null);
        setIntField(term481002, term481002.getClass(), "siblingIndex", 0);
        ArrayList term481000 = new ArrayList();
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add((Object)null);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        ((ArrayList) term481000).add(term481002);
        term480999 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term480999, term480999.getClass(), "state", null);
        setField(term480999, term480999.getClass(), "originalState", null);
        setBooleanField(term480999, term480999.getClass(), "baseUriSetFromDoc", false);
        setField(term480999, term480999.getClass(), "headElement", null);
        setField(term480999, term480999.getClass(), "formElement", null);
        setField(term480999, term480999.getClass(), "contextElement", null);
        setField(term480999, term480999.getClass(), "formattingElements", term481000);
        setField(term480999, term480999.getClass(), "pendingTableCharacters", null);
        setField(term480999, term480999.getClass(), "emptyEnd", null);
        setBooleanField(term480999, term480999.getClass(), "framesetOk", false);
        setBooleanField(term480999, term480999.getClass(), "fosterInserts", false);
        setBooleanField(term480999, term480999.getClass(), "fragmentParsing", false);
        setField(term480999, term480999.getClass(), "specificScopeTarget", null);
        setField(term480999, term480999.getClass(), "reader", null);
        setField(term480999, term480999.getClass(), "tokeniser", null);
        setField(term480999, term480999.getClass(), "doc", null);
        setField(term480999, term480999.getClass(), "stack", null);
        setField(term480999, term480999.getClass(), "baseUri", null);
        setField(term480999, term480999.getClass(), "currentToken", null);
        setField(term480999, term480999.getClass(), "errors", null);
        setField(term480999, term480999.getClass(), "settings", null);
        setField(term480999, term480999.getClass(), "start", null);
        setField(term480999, term480999.getClass(), "end", null);
        term481003 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term481003, term481003.getClass(), "tag", null);
        setField(term481003, term481003.getClass(), "shadowChildrenRef", null);
        setField(term481003, term481003.getClass(), "childNodes", null);
        setField(term481003, term481003.getClass(), "attributes", null);
        setField(term481003, term481003.getClass(), "baseUri", null);
        setField(term481003, term481003.getClass(), "parentNode", null);
        setIntField(term481003, term481003.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term480920;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term480764, args);
        assertTrue(recursiveEquals(term480764, term480999));
        assertTrue(recursiveEquals(term480920, term481003));
    }

};


