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

public class HtmlTreeBuilder_isSpecial_599171952327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385536;
     Object term385588;
     Object term387571;
     Object term387572;

    public HtmlTreeBuilder_isSpecial_599171952327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385536 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term385588 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term385634 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term385634, term385634.getClass(), "tagName", " \u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014");
        setField(term385588, term385588.getClass(), "tag", term385634);
        term387571 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term387571, term387571.getClass(), "state", null);
        setField(term387571, term387571.getClass(), "originalState", null);
        setBooleanField(term387571, term387571.getClass(), "baseUriSetFromDoc", false);
        setField(term387571, term387571.getClass(), "headElement", null);
        setField(term387571, term387571.getClass(), "formElement", null);
        setField(term387571, term387571.getClass(), "contextElement", null);
        setField(term387571, term387571.getClass(), "formattingElements", null);
        setField(term387571, term387571.getClass(), "pendingTableCharacters", null);
        setField(term387571, term387571.getClass(), "emptyEnd", null);
        setBooleanField(term387571, term387571.getClass(), "framesetOk", false);
        setBooleanField(term387571, term387571.getClass(), "fosterInserts", false);
        setBooleanField(term387571, term387571.getClass(), "fragmentParsing", false);
        setField(term387571, term387571.getClass(), "specificScopeTarget", null);
        setField(term387571, term387571.getClass(), "reader", null);
        setField(term387571, term387571.getClass(), "tokeniser", null);
        setField(term387571, term387571.getClass(), "doc", null);
        setField(term387571, term387571.getClass(), "stack", null);
        setField(term387571, term387571.getClass(), "baseUri", null);
        setField(term387571, term387571.getClass(), "currentToken", null);
        setField(term387571, term387571.getClass(), "errors", null);
        setField(term387571, term387571.getClass(), "settings", null);
        setField(term387571, term387571.getClass(), "start", null);
        setField(term387571, term387571.getClass(), "end", null);
        term387572 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term387573 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term387573, term387573.getClass(), "tagName", " \u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014\u0014");
        setBooleanField(term387573, term387573.getClass(), "isBlock", false);
        setBooleanField(term387573, term387573.getClass(), "formatAsBlock", false);
        setBooleanField(term387573, term387573.getClass(), "canContainInline", false);
        setBooleanField(term387573, term387573.getClass(), "empty", false);
        setBooleanField(term387573, term387573.getClass(), "selfClosing", false);
        setBooleanField(term387573, term387573.getClass(), "preserveWhitespace", false);
        setBooleanField(term387573, term387573.getClass(), "formList", false);
        setBooleanField(term387573, term387573.getClass(), "formSubmit", false);
        setField(term387572, term387572.getClass(), "tag", term387573);
        setField(term387572, term387572.getClass(), "shadowChildrenRef", null);
        setField(term387572, term387572.getClass(), "childNodes", null);
        setField(term387572, term387572.getClass(), "attributes", null);
        setField(term387572, term387572.getClass(), "baseUri", null);
        setField(term387572, term387572.getClass(), "parentNode", null);
        setIntField(term387572, term387572.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term385588;
        callMethod(klass, "isSpecial", argTypes, term385536, args);
        assertTrue(recursiveEquals(term385536, term387571));
        assertTrue(recursiveEquals(term385588, term387572));
    }

};


