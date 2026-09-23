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

public class HtmlTreeBuilder_isSpecial_599171952311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249228;
     Object term249280;
     Object term253258;
     Object term253259;

    public HtmlTreeBuilder_isSpecial_599171952311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249228 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term249280 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term249326 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term249326, term249326.getClass(), "tagName", " \u0003 \u0001     \u0001 \u0001\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term249280, term249280.getClass(), "tag", term249326);
        term253258 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term253258, term253258.getClass(), "state", null);
        setField(term253258, term253258.getClass(), "originalState", null);
        setBooleanField(term253258, term253258.getClass(), "baseUriSetFromDoc", false);
        setField(term253258, term253258.getClass(), "headElement", null);
        setField(term253258, term253258.getClass(), "formElement", null);
        setField(term253258, term253258.getClass(), "contextElement", null);
        setField(term253258, term253258.getClass(), "formattingElements", null);
        setField(term253258, term253258.getClass(), "pendingTableCharacters", null);
        setField(term253258, term253258.getClass(), "emptyEnd", null);
        setBooleanField(term253258, term253258.getClass(), "framesetOk", false);
        setBooleanField(term253258, term253258.getClass(), "fosterInserts", false);
        setBooleanField(term253258, term253258.getClass(), "fragmentParsing", false);
        setField(term253258, term253258.getClass(), "specificScopeTarget", null);
        setField(term253258, term253258.getClass(), "reader", null);
        setField(term253258, term253258.getClass(), "tokeniser", null);
        setField(term253258, term253258.getClass(), "doc", null);
        setField(term253258, term253258.getClass(), "stack", null);
        setField(term253258, term253258.getClass(), "baseUri", null);
        setField(term253258, term253258.getClass(), "currentToken", null);
        setField(term253258, term253258.getClass(), "errors", null);
        setField(term253258, term253258.getClass(), "settings", null);
        setField(term253258, term253258.getClass(), "start", null);
        setField(term253258, term253258.getClass(), "end", null);
        term253259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term253260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term253260, term253260.getClass(), "tagName", " \u0003 \u0001     \u0001 \u0001\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setBooleanField(term253260, term253260.getClass(), "isBlock", false);
        setBooleanField(term253260, term253260.getClass(), "formatAsBlock", false);
        setBooleanField(term253260, term253260.getClass(), "canContainInline", false);
        setBooleanField(term253260, term253260.getClass(), "empty", false);
        setBooleanField(term253260, term253260.getClass(), "selfClosing", false);
        setBooleanField(term253260, term253260.getClass(), "preserveWhitespace", false);
        setBooleanField(term253260, term253260.getClass(), "formList", false);
        setBooleanField(term253260, term253260.getClass(), "formSubmit", false);
        setField(term253259, term253259.getClass(), "tag", term253260);
        setField(term253259, term253259.getClass(), "shadowChildrenRef", null);
        setField(term253259, term253259.getClass(), "childNodes", null);
        setField(term253259, term253259.getClass(), "attributes", null);
        setField(term253259, term253259.getClass(), "baseUri", null);
        setField(term253259, term253259.getClass(), "parentNode", null);
        setIntField(term253259, term253259.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term249280;
        callMethod(klass, "isSpecial", argTypes, term249228, args);
        assertTrue(recursiveEquals(term249228, term253258));
        assertTrue(recursiveEquals(term249280, term253259));
    }

};


