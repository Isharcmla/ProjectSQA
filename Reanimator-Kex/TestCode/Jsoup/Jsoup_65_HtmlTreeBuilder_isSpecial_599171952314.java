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

public class HtmlTreeBuilder_isSpecial_599171952314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271242;
     Object term271294;
     Object term272349;
     Object term272350;

    public HtmlTreeBuilder_isSpecial_599171952314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271242 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term271294 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term271340 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term271340, term271340.getClass(), "tagName", "");
        setField(term271294, term271294.getClass(), "tag", term271340);
        term272349 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term272349, term272349.getClass(), "state", null);
        setField(term272349, term272349.getClass(), "originalState", null);
        setBooleanField(term272349, term272349.getClass(), "baseUriSetFromDoc", false);
        setField(term272349, term272349.getClass(), "headElement", null);
        setField(term272349, term272349.getClass(), "formElement", null);
        setField(term272349, term272349.getClass(), "contextElement", null);
        setField(term272349, term272349.getClass(), "formattingElements", null);
        setField(term272349, term272349.getClass(), "pendingTableCharacters", null);
        setField(term272349, term272349.getClass(), "emptyEnd", null);
        setBooleanField(term272349, term272349.getClass(), "framesetOk", false);
        setBooleanField(term272349, term272349.getClass(), "fosterInserts", false);
        setBooleanField(term272349, term272349.getClass(), "fragmentParsing", false);
        setField(term272349, term272349.getClass(), "specificScopeTarget", null);
        setField(term272349, term272349.getClass(), "reader", null);
        setField(term272349, term272349.getClass(), "tokeniser", null);
        setField(term272349, term272349.getClass(), "doc", null);
        setField(term272349, term272349.getClass(), "stack", null);
        setField(term272349, term272349.getClass(), "baseUri", null);
        setField(term272349, term272349.getClass(), "currentToken", null);
        setField(term272349, term272349.getClass(), "errors", null);
        setField(term272349, term272349.getClass(), "settings", null);
        setField(term272349, term272349.getClass(), "start", null);
        setField(term272349, term272349.getClass(), "end", null);
        term272350 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term272351 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term272351, term272351.getClass(), "tagName", "");
        setBooleanField(term272351, term272351.getClass(), "isBlock", false);
        setBooleanField(term272351, term272351.getClass(), "formatAsBlock", false);
        setBooleanField(term272351, term272351.getClass(), "canContainInline", false);
        setBooleanField(term272351, term272351.getClass(), "empty", false);
        setBooleanField(term272351, term272351.getClass(), "selfClosing", false);
        setBooleanField(term272351, term272351.getClass(), "preserveWhitespace", false);
        setBooleanField(term272351, term272351.getClass(), "formList", false);
        setBooleanField(term272351, term272351.getClass(), "formSubmit", false);
        setField(term272350, term272350.getClass(), "tag", term272351);
        setField(term272350, term272350.getClass(), "shadowChildrenRef", null);
        setField(term272350, term272350.getClass(), "childNodes", null);
        setField(term272350, term272350.getClass(), "attributes", null);
        setField(term272350, term272350.getClass(), "baseUri", null);
        setField(term272350, term272350.getClass(), "parentNode", null);
        setIntField(term272350, term272350.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term271294;
        callMethod(klass, "isSpecial", argTypes, term271242, args);
        assertTrue(recursiveEquals(term271242, term272349));
        assertTrue(recursiveEquals(term271294, term272350));
    }

};


