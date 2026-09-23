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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425900;
     Object term425952;
     Object term426280;
     Object term426281;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425900 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term425900, term425900.getClass(), "baseUriSetFromDoc", false);
        Object term426160 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term426070 = new LinkedHashMap();
        ((LinkedHashMap) term426070).put(term426160, term426160);
        term425952 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term426010 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term426010, term426010.getClass(), "attributes", term426070);
        setField(term425952, term425952.getClass(), "attributes", term426010);
        term426280 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term426280, term426280.getClass(), "state", null);
        setField(term426280, term426280.getClass(), "originalState", null);
        setBooleanField(term426280, term426280.getClass(), "baseUriSetFromDoc", false);
        setField(term426280, term426280.getClass(), "headElement", null);
        setField(term426280, term426280.getClass(), "formElement", null);
        setField(term426280, term426280.getClass(), "contextElement", null);
        setField(term426280, term426280.getClass(), "formattingElements", null);
        setField(term426280, term426280.getClass(), "pendingTableCharacters", null);
        setBooleanField(term426280, term426280.getClass(), "framesetOk", false);
        setBooleanField(term426280, term426280.getClass(), "fosterInserts", false);
        setBooleanField(term426280, term426280.getClass(), "fragmentParsing", false);
        setField(term426280, term426280.getClass(), "reader", null);
        setField(term426280, term426280.getClass(), "tokeniser", null);
        setField(term426280, term426280.getClass(), "doc", null);
        setField(term426280, term426280.getClass(), "stack", null);
        setField(term426280, term426280.getClass(), "baseUri", null);
        setField(term426280, term426280.getClass(), "currentToken", null);
        setField(term426280, term426280.getClass(), "errors", null);
        LinkedHashMap term426283 = new LinkedHashMap();
        term426281 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term426282 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term426281, term426281.getClass(), "tag", null);
        setField(term426281, term426281.getClass(), "classNames", null);
        setField(term426281, term426281.getClass(), "parentNode", null);
        setField(term426281, term426281.getClass(), "childNodes", null);
        setField(term426282, term426282.getClass(), "attributes", term426283);
        setField(term426281, term426281.getClass(), "attributes", term426282);
        setField(term426281, term426281.getClass(), "baseUri", null);
        setIntField(term426281, term426281.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term425952;
        callMethod(klass, "maybeSetBaseUri", argTypes, term425900, args);
        assertTrue(recursiveEquals(term425900, term426280));
        assertTrue(recursiveEquals(term425952, term426281));
    }

};


