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

public class HtmlTreeBuilder_isSpecial_599171952316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276388;
     Object term276440;
     Object term278033;
     Object term278034;

    public HtmlTreeBuilder_isSpecial_599171952316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276388 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term276440 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term276486 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term276486, term276486.getClass(), "tagName", "  \u0001   \f\u0007\u0005\u0006  \u0003\b\u0010\u0001\u0001                                                                                                               ");
        setField(term276440, term276440.getClass(), "tag", term276486);
        term278033 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term278033, term278033.getClass(), "state", null);
        setField(term278033, term278033.getClass(), "originalState", null);
        setBooleanField(term278033, term278033.getClass(), "baseUriSetFromDoc", false);
        setField(term278033, term278033.getClass(), "headElement", null);
        setField(term278033, term278033.getClass(), "formElement", null);
        setField(term278033, term278033.getClass(), "contextElement", null);
        setField(term278033, term278033.getClass(), "formattingElements", null);
        setField(term278033, term278033.getClass(), "pendingTableCharacters", null);
        setField(term278033, term278033.getClass(), "emptyEnd", null);
        setBooleanField(term278033, term278033.getClass(), "framesetOk", false);
        setBooleanField(term278033, term278033.getClass(), "fosterInserts", false);
        setBooleanField(term278033, term278033.getClass(), "fragmentParsing", false);
        setField(term278033, term278033.getClass(), "specificScopeTarget", null);
        setField(term278033, term278033.getClass(), "reader", null);
        setField(term278033, term278033.getClass(), "tokeniser", null);
        setField(term278033, term278033.getClass(), "doc", null);
        setField(term278033, term278033.getClass(), "stack", null);
        setField(term278033, term278033.getClass(), "baseUri", null);
        setField(term278033, term278033.getClass(), "currentToken", null);
        setField(term278033, term278033.getClass(), "errors", null);
        setField(term278033, term278033.getClass(), "settings", null);
        setField(term278033, term278033.getClass(), "start", null);
        setField(term278033, term278033.getClass(), "end", null);
        term278034 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term278035 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term278035, term278035.getClass(), "tagName", "  \u0001   \f\u0007\u0005\u0006  \u0003\b\u0010\u0001\u0001                                                                                                               ");
        setBooleanField(term278035, term278035.getClass(), "isBlock", false);
        setBooleanField(term278035, term278035.getClass(), "formatAsBlock", false);
        setBooleanField(term278035, term278035.getClass(), "canContainInline", false);
        setBooleanField(term278035, term278035.getClass(), "empty", false);
        setBooleanField(term278035, term278035.getClass(), "selfClosing", false);
        setBooleanField(term278035, term278035.getClass(), "preserveWhitespace", false);
        setBooleanField(term278035, term278035.getClass(), "formList", false);
        setBooleanField(term278035, term278035.getClass(), "formSubmit", false);
        setField(term278034, term278034.getClass(), "tag", term278035);
        setField(term278034, term278034.getClass(), "shadowChildrenRef", null);
        setField(term278034, term278034.getClass(), "childNodes", null);
        setField(term278034, term278034.getClass(), "attributes", null);
        setField(term278034, term278034.getClass(), "baseUri", null);
        setField(term278034, term278034.getClass(), "parentNode", null);
        setIntField(term278034, term278034.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term276440;
        callMethod(klass, "isSpecial", argTypes, term276388, args);
        assertTrue(recursiveEquals(term276388, term278033));
        assertTrue(recursiveEquals(term276440, term278034));
    }

};


