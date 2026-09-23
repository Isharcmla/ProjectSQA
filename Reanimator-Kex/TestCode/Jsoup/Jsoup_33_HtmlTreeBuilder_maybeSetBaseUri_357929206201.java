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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412827;
     Object term412879;
     Object term412973;
     Object term412974;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412827 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term412827, term412827.getClass(), "baseUriSetFromDoc", false);
        term412879 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term412937 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term412937, term412937.getClass(), "attributes", null);
        setField(term412879, term412879.getClass(), "attributes", term412937);
        term412973 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term412973, term412973.getClass(), "state", null);
        setField(term412973, term412973.getClass(), "originalState", null);
        setBooleanField(term412973, term412973.getClass(), "baseUriSetFromDoc", false);
        setField(term412973, term412973.getClass(), "headElement", null);
        setField(term412973, term412973.getClass(), "formElement", null);
        setField(term412973, term412973.getClass(), "contextElement", null);
        setField(term412973, term412973.getClass(), "formattingElements", null);
        setField(term412973, term412973.getClass(), "pendingTableCharacters", null);
        setBooleanField(term412973, term412973.getClass(), "framesetOk", false);
        setBooleanField(term412973, term412973.getClass(), "fosterInserts", false);
        setBooleanField(term412973, term412973.getClass(), "fragmentParsing", false);
        setField(term412973, term412973.getClass(), "reader", null);
        setField(term412973, term412973.getClass(), "tokeniser", null);
        setField(term412973, term412973.getClass(), "doc", null);
        setField(term412973, term412973.getClass(), "stack", null);
        setField(term412973, term412973.getClass(), "baseUri", null);
        setField(term412973, term412973.getClass(), "currentToken", null);
        setField(term412973, term412973.getClass(), "errors", null);
        term412974 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term412975 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term412974, term412974.getClass(), "tag", null);
        setField(term412974, term412974.getClass(), "classNames", null);
        setField(term412974, term412974.getClass(), "parentNode", null);
        setField(term412974, term412974.getClass(), "childNodes", null);
        setField(term412975, term412975.getClass(), "attributes", null);
        setField(term412974, term412974.getClass(), "attributes", term412975);
        setField(term412974, term412974.getClass(), "baseUri", null);
        setIntField(term412974, term412974.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term412879;
        callMethod(klass, "maybeSetBaseUri", argTypes, term412827, args);
        assertTrue(recursiveEquals(term412827, term412973));
        assertTrue(recursiveEquals(term412879, term412974));
    }

};


