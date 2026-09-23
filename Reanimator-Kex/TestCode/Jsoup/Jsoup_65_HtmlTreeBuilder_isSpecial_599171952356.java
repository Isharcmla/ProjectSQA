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

public class HtmlTreeBuilder_isSpecial_599171952356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419867;
     Object term419919;
     Object term420744;
     Object term420745;

    public HtmlTreeBuilder_isSpecial_599171952356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419867 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term419919 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term419965 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term419965, term419965.getClass(), "tagName", "");
        setField(term419919, term419919.getClass(), "tag", term419965);
        term420744 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term420744, term420744.getClass(), "state", null);
        setField(term420744, term420744.getClass(), "originalState", null);
        setBooleanField(term420744, term420744.getClass(), "baseUriSetFromDoc", false);
        setField(term420744, term420744.getClass(), "headElement", null);
        setField(term420744, term420744.getClass(), "formElement", null);
        setField(term420744, term420744.getClass(), "contextElement", null);
        setField(term420744, term420744.getClass(), "formattingElements", null);
        setField(term420744, term420744.getClass(), "pendingTableCharacters", null);
        setField(term420744, term420744.getClass(), "emptyEnd", null);
        setBooleanField(term420744, term420744.getClass(), "framesetOk", false);
        setBooleanField(term420744, term420744.getClass(), "fosterInserts", false);
        setBooleanField(term420744, term420744.getClass(), "fragmentParsing", false);
        setField(term420744, term420744.getClass(), "specificScopeTarget", null);
        setField(term420744, term420744.getClass(), "reader", null);
        setField(term420744, term420744.getClass(), "tokeniser", null);
        setField(term420744, term420744.getClass(), "doc", null);
        setField(term420744, term420744.getClass(), "stack", null);
        setField(term420744, term420744.getClass(), "baseUri", null);
        setField(term420744, term420744.getClass(), "currentToken", null);
        setField(term420744, term420744.getClass(), "errors", null);
        setField(term420744, term420744.getClass(), "settings", null);
        setField(term420744, term420744.getClass(), "start", null);
        setField(term420744, term420744.getClass(), "end", null);
        term420745 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term420746 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term420746, term420746.getClass(), "tagName", "");
        setBooleanField(term420746, term420746.getClass(), "isBlock", false);
        setBooleanField(term420746, term420746.getClass(), "formatAsBlock", false);
        setBooleanField(term420746, term420746.getClass(), "canContainInline", false);
        setBooleanField(term420746, term420746.getClass(), "empty", false);
        setBooleanField(term420746, term420746.getClass(), "selfClosing", false);
        setBooleanField(term420746, term420746.getClass(), "preserveWhitespace", false);
        setBooleanField(term420746, term420746.getClass(), "formList", false);
        setBooleanField(term420746, term420746.getClass(), "formSubmit", false);
        setField(term420745, term420745.getClass(), "tag", term420746);
        setField(term420745, term420745.getClass(), "shadowChildrenRef", null);
        setField(term420745, term420745.getClass(), "childNodes", null);
        setField(term420745, term420745.getClass(), "attributes", null);
        setField(term420745, term420745.getClass(), "baseUri", null);
        setField(term420745, term420745.getClass(), "parentNode", null);
        setIntField(term420745, term420745.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term419919;
        callMethod(klass, "isSpecial", argTypes, term419867, args);
        assertTrue(recursiveEquals(term419867, term420744));
        assertTrue(recursiveEquals(term419919, term420745));
    }

};


