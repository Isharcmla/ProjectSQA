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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604524;
     Object term604576;
     Object term604670;
     Object term604671;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604524 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term604524, term604524.getClass(), "baseUriSetFromDoc", false);
        term604576 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term604634 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term604634, term604634.getClass(), "attributes", null);
        setField(term604576, term604576.getClass(), "attributes", term604634);
        term604670 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term604670, term604670.getClass(), "state", null);
        setField(term604670, term604670.getClass(), "originalState", null);
        setBooleanField(term604670, term604670.getClass(), "baseUriSetFromDoc", false);
        setField(term604670, term604670.getClass(), "headElement", null);
        setField(term604670, term604670.getClass(), "formElement", null);
        setField(term604670, term604670.getClass(), "contextElement", null);
        setField(term604670, term604670.getClass(), "formattingElements", null);
        setField(term604670, term604670.getClass(), "pendingTableCharacters", null);
        setField(term604670, term604670.getClass(), "emptyEnd", null);
        setBooleanField(term604670, term604670.getClass(), "framesetOk", false);
        setBooleanField(term604670, term604670.getClass(), "fosterInserts", false);
        setBooleanField(term604670, term604670.getClass(), "fragmentParsing", false);
        setField(term604670, term604670.getClass(), "specificScopeTarget", null);
        setField(term604670, term604670.getClass(), "reader", null);
        setField(term604670, term604670.getClass(), "tokeniser", null);
        setField(term604670, term604670.getClass(), "doc", null);
        setField(term604670, term604670.getClass(), "stack", null);
        setField(term604670, term604670.getClass(), "baseUri", null);
        setField(term604670, term604670.getClass(), "currentToken", null);
        setField(term604670, term604670.getClass(), "errors", null);
        setField(term604670, term604670.getClass(), "start", null);
        setField(term604670, term604670.getClass(), "end", null);
        term604671 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term604672 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term604671, term604671.getClass(), "tag", null);
        setField(term604671, term604671.getClass(), "parentNode", null);
        setField(term604671, term604671.getClass(), "childNodes", null);
        setField(term604672, term604672.getClass(), "attributes", null);
        setField(term604671, term604671.getClass(), "attributes", term604672);
        setField(term604671, term604671.getClass(), "baseUri", null);
        setIntField(term604671, term604671.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term604576;
        callMethod(klass, "maybeSetBaseUri", argTypes, term604524, args);
        assertTrue(recursiveEquals(term604524, term604670));
        assertTrue(recursiveEquals(term604576, term604671));
    }

};


