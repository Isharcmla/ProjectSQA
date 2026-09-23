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

public class HtmlTreeBuilder_isSpecial_599171952277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636371;
     Object term636423;
     Object term637850;
     Object term637851;

    public HtmlTreeBuilder_isSpecial_599171952277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636371 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term636423 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term636469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term636469, term636469.getClass(), "tagName", "");
        setField(term636423, term636423.getClass(), "tag", term636469);
        term637850 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term637850, term637850.getClass(), "state", null);
        setField(term637850, term637850.getClass(), "originalState", null);
        setBooleanField(term637850, term637850.getClass(), "baseUriSetFromDoc", false);
        setField(term637850, term637850.getClass(), "headElement", null);
        setField(term637850, term637850.getClass(), "formElement", null);
        setField(term637850, term637850.getClass(), "contextElement", null);
        setField(term637850, term637850.getClass(), "formattingElements", null);
        setField(term637850, term637850.getClass(), "pendingTableCharacters", null);
        setField(term637850, term637850.getClass(), "emptyEnd", null);
        setBooleanField(term637850, term637850.getClass(), "framesetOk", false);
        setBooleanField(term637850, term637850.getClass(), "fosterInserts", false);
        setBooleanField(term637850, term637850.getClass(), "fragmentParsing", false);
        setField(term637850, term637850.getClass(), "specificScopeTarget", null);
        setField(term637850, term637850.getClass(), "reader", null);
        setField(term637850, term637850.getClass(), "tokeniser", null);
        setField(term637850, term637850.getClass(), "doc", null);
        setField(term637850, term637850.getClass(), "stack", null);
        setField(term637850, term637850.getClass(), "baseUri", null);
        setField(term637850, term637850.getClass(), "currentToken", null);
        setField(term637850, term637850.getClass(), "errors", null);
        setField(term637850, term637850.getClass(), "start", null);
        setField(term637850, term637850.getClass(), "end", null);
        term637851 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term637852 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term637852, term637852.getClass(), "tagName", "");
        setBooleanField(term637852, term637852.getClass(), "isBlock", false);
        setBooleanField(term637852, term637852.getClass(), "formatAsBlock", false);
        setBooleanField(term637852, term637852.getClass(), "canContainBlock", false);
        setBooleanField(term637852, term637852.getClass(), "canContainInline", false);
        setBooleanField(term637852, term637852.getClass(), "empty", false);
        setBooleanField(term637852, term637852.getClass(), "selfClosing", false);
        setBooleanField(term637852, term637852.getClass(), "preserveWhitespace", false);
        setBooleanField(term637852, term637852.getClass(), "formList", false);
        setBooleanField(term637852, term637852.getClass(), "formSubmit", false);
        setField(term637851, term637851.getClass(), "tag", term637852);
        setField(term637851, term637851.getClass(), "parentNode", null);
        setField(term637851, term637851.getClass(), "childNodes", null);
        setField(term637851, term637851.getClass(), "attributes", null);
        setField(term637851, term637851.getClass(), "baseUri", null);
        setIntField(term637851, term637851.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term636423;
        callMethod(klass, "isSpecial", argTypes, term636371, args);
        assertTrue(recursiveEquals(term636371, term637850));
        assertTrue(recursiveEquals(term636423, term637851));
    }

};


