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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500931;
     Object term500983;
     Object term501079;
     Object term501080;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500931 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term500931, term500931.getClass(), "baseUriSetFromDoc", false);
        term500983 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term501041 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term501041, term501041.getClass(), "size", 0);
        setField(term500983, term500983.getClass(), "attributes", term501041);
        term501079 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term501079, term501079.getClass(), "state", null);
        setField(term501079, term501079.getClass(), "originalState", null);
        setBooleanField(term501079, term501079.getClass(), "baseUriSetFromDoc", false);
        setField(term501079, term501079.getClass(), "headElement", null);
        setField(term501079, term501079.getClass(), "formElement", null);
        setField(term501079, term501079.getClass(), "contextElement", null);
        setField(term501079, term501079.getClass(), "formattingElements", null);
        setField(term501079, term501079.getClass(), "pendingTableCharacters", null);
        setField(term501079, term501079.getClass(), "emptyEnd", null);
        setBooleanField(term501079, term501079.getClass(), "framesetOk", false);
        setBooleanField(term501079, term501079.getClass(), "fosterInserts", false);
        setBooleanField(term501079, term501079.getClass(), "fragmentParsing", false);
        setField(term501079, term501079.getClass(), "specificScopeTarget", null);
        setField(term501079, term501079.getClass(), "parser", null);
        setField(term501079, term501079.getClass(), "reader", null);
        setField(term501079, term501079.getClass(), "tokeniser", null);
        setField(term501079, term501079.getClass(), "doc", null);
        setField(term501079, term501079.getClass(), "stack", null);
        setField(term501079, term501079.getClass(), "baseUri", null);
        setField(term501079, term501079.getClass(), "currentToken", null);
        setField(term501079, term501079.getClass(), "settings", null);
        setField(term501079, term501079.getClass(), "start", null);
        setField(term501079, term501079.getClass(), "end", null);
        term501080 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term501081 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term501080, term501080.getClass(), "tag", null);
        setField(term501080, term501080.getClass(), "shadowChildrenRef", null);
        setField(term501080, term501080.getClass(), "childNodes", null);
        setIntField(term501081, term501081.getClass(), "size", 0);
        setField(term501081, term501081.getClass(), "keys", null);
        setField(term501081, term501081.getClass(), "vals", null);
        setField(term501080, term501080.getClass(), "attributes", term501081);
        setField(term501080, term501080.getClass(), "baseUri", null);
        setField(term501080, term501080.getClass(), "parentNode", null);
        setIntField(term501080, term501080.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term500983;
        callMethod(klass, "maybeSetBaseUri", argTypes, term500931, args);
        assertTrue(recursiveEquals(term500931, term501079));
        assertTrue(recursiveEquals(term500983, term501080));
    }

};


