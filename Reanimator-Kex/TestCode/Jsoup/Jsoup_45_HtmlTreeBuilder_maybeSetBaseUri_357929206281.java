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
import java.lang.Object;
import java.util.LinkedHashMap;

public class HtmlTreeBuilder_maybeSetBaseUri_357929206281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638481;
     Object term638533;
     Object term638861;
     Object term638862;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638481 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term638481, term638481.getClass(), "baseUriSetFromDoc", false);
        Object term638741 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term638651 = new LinkedHashMap();
        ((LinkedHashMap) term638651).put(term638741, term638741);
        term638533 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term638591 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term638591, term638591.getClass(), "attributes", term638651);
        setField(term638533, term638533.getClass(), "attributes", term638591);
        term638861 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term638861, term638861.getClass(), "state", null);
        setField(term638861, term638861.getClass(), "originalState", null);
        setBooleanField(term638861, term638861.getClass(), "baseUriSetFromDoc", false);
        setField(term638861, term638861.getClass(), "headElement", null);
        setField(term638861, term638861.getClass(), "formElement", null);
        setField(term638861, term638861.getClass(), "contextElement", null);
        setField(term638861, term638861.getClass(), "formattingElements", null);
        setField(term638861, term638861.getClass(), "pendingTableCharacters", null);
        setField(term638861, term638861.getClass(), "emptyEnd", null);
        setBooleanField(term638861, term638861.getClass(), "framesetOk", false);
        setBooleanField(term638861, term638861.getClass(), "fosterInserts", false);
        setBooleanField(term638861, term638861.getClass(), "fragmentParsing", false);
        setField(term638861, term638861.getClass(), "specificScopeTarget", null);
        setField(term638861, term638861.getClass(), "reader", null);
        setField(term638861, term638861.getClass(), "tokeniser", null);
        setField(term638861, term638861.getClass(), "doc", null);
        setField(term638861, term638861.getClass(), "stack", null);
        setField(term638861, term638861.getClass(), "baseUri", null);
        setField(term638861, term638861.getClass(), "currentToken", null);
        setField(term638861, term638861.getClass(), "errors", null);
        setField(term638861, term638861.getClass(), "start", null);
        setField(term638861, term638861.getClass(), "end", null);
        LinkedHashMap term638864 = new LinkedHashMap();
        term638862 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term638863 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term638862, term638862.getClass(), "tag", null);
        setField(term638862, term638862.getClass(), "parentNode", null);
        setField(term638862, term638862.getClass(), "childNodes", null);
        setField(term638863, term638863.getClass(), "attributes", term638864);
        setField(term638862, term638862.getClass(), "attributes", term638863);
        setField(term638862, term638862.getClass(), "baseUri", null);
        setIntField(term638862, term638862.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term638533;
        callMethod(klass, "maybeSetBaseUri", argTypes, term638481, args);
        assertTrue(recursiveEquals(term638481, term638861));
        assertTrue(recursiveEquals(term638533, term638862));
    }

};


