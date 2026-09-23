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

public class HtmlTreeBuilder_isSpecial_599171952323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366193;
     Object term366245;
     Object term370145;
     Object term370146;

    public HtmlTreeBuilder_isSpecial_599171952323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366193 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term366245 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term366291 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term366291, term366291.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term366245, term366245.getClass(), "tag", term366291);
        term370145 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term370145, term370145.getClass(), "state", null);
        setField(term370145, term370145.getClass(), "originalState", null);
        setBooleanField(term370145, term370145.getClass(), "baseUriSetFromDoc", false);
        setField(term370145, term370145.getClass(), "headElement", null);
        setField(term370145, term370145.getClass(), "formElement", null);
        setField(term370145, term370145.getClass(), "contextElement", null);
        setField(term370145, term370145.getClass(), "formattingElements", null);
        setField(term370145, term370145.getClass(), "pendingTableCharacters", null);
        setField(term370145, term370145.getClass(), "emptyEnd", null);
        setBooleanField(term370145, term370145.getClass(), "framesetOk", false);
        setBooleanField(term370145, term370145.getClass(), "fosterInserts", false);
        setBooleanField(term370145, term370145.getClass(), "fragmentParsing", false);
        setField(term370145, term370145.getClass(), "specificScopeTarget", null);
        setField(term370145, term370145.getClass(), "reader", null);
        setField(term370145, term370145.getClass(), "tokeniser", null);
        setField(term370145, term370145.getClass(), "doc", null);
        setField(term370145, term370145.getClass(), "stack", null);
        setField(term370145, term370145.getClass(), "baseUri", null);
        setField(term370145, term370145.getClass(), "currentToken", null);
        setField(term370145, term370145.getClass(), "errors", null);
        setField(term370145, term370145.getClass(), "settings", null);
        setField(term370145, term370145.getClass(), "start", null);
        setField(term370145, term370145.getClass(), "end", null);
        term370146 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term370147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term370147, term370147.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term370147, term370147.getClass(), "isBlock", false);
        setBooleanField(term370147, term370147.getClass(), "formatAsBlock", false);
        setBooleanField(term370147, term370147.getClass(), "canContainInline", false);
        setBooleanField(term370147, term370147.getClass(), "empty", false);
        setBooleanField(term370147, term370147.getClass(), "selfClosing", false);
        setBooleanField(term370147, term370147.getClass(), "preserveWhitespace", false);
        setBooleanField(term370147, term370147.getClass(), "formList", false);
        setBooleanField(term370147, term370147.getClass(), "formSubmit", false);
        setField(term370146, term370146.getClass(), "tag", term370147);
        setField(term370146, term370146.getClass(), "shadowChildrenRef", null);
        setField(term370146, term370146.getClass(), "childNodes", null);
        setField(term370146, term370146.getClass(), "attributes", null);
        setField(term370146, term370146.getClass(), "baseUri", null);
        setField(term370146, term370146.getClass(), "parentNode", null);
        setIntField(term370146, term370146.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term366245;
        callMethod(klass, "isSpecial", argTypes, term366193, args);
        assertTrue(recursiveEquals(term366193, term370145));
        assertTrue(recursiveEquals(term366245, term370146));
    }

};


