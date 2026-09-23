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

public class HtmlTreeBuilder_isSpecial_599171952273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628494;
     Object term628546;
     Object term629373;
     Object term629374;

    public HtmlTreeBuilder_isSpecial_599171952273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628494 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term628546 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term628592 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term628592, term628592.getClass(), "tagName", "");
        setField(term628546, term628546.getClass(), "tag", term628592);
        term629373 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term629373, term629373.getClass(), "state", null);
        setField(term629373, term629373.getClass(), "originalState", null);
        setBooleanField(term629373, term629373.getClass(), "baseUriSetFromDoc", false);
        setField(term629373, term629373.getClass(), "headElement", null);
        setField(term629373, term629373.getClass(), "formElement", null);
        setField(term629373, term629373.getClass(), "contextElement", null);
        setField(term629373, term629373.getClass(), "formattingElements", null);
        setField(term629373, term629373.getClass(), "pendingTableCharacters", null);
        setField(term629373, term629373.getClass(), "emptyEnd", null);
        setBooleanField(term629373, term629373.getClass(), "framesetOk", false);
        setBooleanField(term629373, term629373.getClass(), "fosterInserts", false);
        setBooleanField(term629373, term629373.getClass(), "fragmentParsing", false);
        setField(term629373, term629373.getClass(), "specificScopeTarget", null);
        setField(term629373, term629373.getClass(), "reader", null);
        setField(term629373, term629373.getClass(), "tokeniser", null);
        setField(term629373, term629373.getClass(), "doc", null);
        setField(term629373, term629373.getClass(), "stack", null);
        setField(term629373, term629373.getClass(), "baseUri", null);
        setField(term629373, term629373.getClass(), "currentToken", null);
        setField(term629373, term629373.getClass(), "errors", null);
        setField(term629373, term629373.getClass(), "start", null);
        setField(term629373, term629373.getClass(), "end", null);
        term629374 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term629375 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term629375, term629375.getClass(), "tagName", "");
        setBooleanField(term629375, term629375.getClass(), "isBlock", false);
        setBooleanField(term629375, term629375.getClass(), "formatAsBlock", false);
        setBooleanField(term629375, term629375.getClass(), "canContainBlock", false);
        setBooleanField(term629375, term629375.getClass(), "canContainInline", false);
        setBooleanField(term629375, term629375.getClass(), "empty", false);
        setBooleanField(term629375, term629375.getClass(), "selfClosing", false);
        setBooleanField(term629375, term629375.getClass(), "preserveWhitespace", false);
        setBooleanField(term629375, term629375.getClass(), "formList", false);
        setBooleanField(term629375, term629375.getClass(), "formSubmit", false);
        setField(term629374, term629374.getClass(), "tag", term629375);
        setField(term629374, term629374.getClass(), "parentNode", null);
        setField(term629374, term629374.getClass(), "childNodes", null);
        setField(term629374, term629374.getClass(), "attributes", null);
        setField(term629374, term629374.getClass(), "baseUri", null);
        setIntField(term629374, term629374.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term628546;
        callMethod(klass, "isSpecial", argTypes, term628494, args);
        assertTrue(recursiveEquals(term628494, term629373));
        assertTrue(recursiveEquals(term628546, term629374));
    }

};


