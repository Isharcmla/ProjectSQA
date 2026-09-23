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

public class HtmlTreeBuilder_isSpecial_599171952291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653684;
     Object term653736;
     Object term654855;
     Object term654856;

    public HtmlTreeBuilder_isSpecial_599171952291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653684 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term653736 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term653782 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term653782, term653782.getClass(), "tagName", "");
        setField(term653736, term653736.getClass(), "tag", term653782);
        term654855 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term654855, term654855.getClass(), "state", null);
        setField(term654855, term654855.getClass(), "originalState", null);
        setBooleanField(term654855, term654855.getClass(), "baseUriSetFromDoc", false);
        setField(term654855, term654855.getClass(), "headElement", null);
        setField(term654855, term654855.getClass(), "formElement", null);
        setField(term654855, term654855.getClass(), "contextElement", null);
        setField(term654855, term654855.getClass(), "formattingElements", null);
        setField(term654855, term654855.getClass(), "pendingTableCharacters", null);
        setField(term654855, term654855.getClass(), "emptyEnd", null);
        setBooleanField(term654855, term654855.getClass(), "framesetOk", false);
        setBooleanField(term654855, term654855.getClass(), "fosterInserts", false);
        setBooleanField(term654855, term654855.getClass(), "fragmentParsing", false);
        setField(term654855, term654855.getClass(), "specificScopeTarget", null);
        setField(term654855, term654855.getClass(), "reader", null);
        setField(term654855, term654855.getClass(), "tokeniser", null);
        setField(term654855, term654855.getClass(), "doc", null);
        setField(term654855, term654855.getClass(), "stack", null);
        setField(term654855, term654855.getClass(), "baseUri", null);
        setField(term654855, term654855.getClass(), "currentToken", null);
        setField(term654855, term654855.getClass(), "errors", null);
        setField(term654855, term654855.getClass(), "start", null);
        setField(term654855, term654855.getClass(), "end", null);
        term654856 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term654857 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term654857, term654857.getClass(), "tagName", "");
        setBooleanField(term654857, term654857.getClass(), "isBlock", false);
        setBooleanField(term654857, term654857.getClass(), "formatAsBlock", false);
        setBooleanField(term654857, term654857.getClass(), "canContainBlock", false);
        setBooleanField(term654857, term654857.getClass(), "canContainInline", false);
        setBooleanField(term654857, term654857.getClass(), "empty", false);
        setBooleanField(term654857, term654857.getClass(), "selfClosing", false);
        setBooleanField(term654857, term654857.getClass(), "preserveWhitespace", false);
        setBooleanField(term654857, term654857.getClass(), "formList", false);
        setBooleanField(term654857, term654857.getClass(), "formSubmit", false);
        setField(term654856, term654856.getClass(), "tag", term654857);
        setField(term654856, term654856.getClass(), "parentNode", null);
        setField(term654856, term654856.getClass(), "childNodes", null);
        setField(term654856, term654856.getClass(), "attributes", null);
        setField(term654856, term654856.getClass(), "baseUri", null);
        setIntField(term654856, term654856.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term653736;
        callMethod(klass, "isSpecial", argTypes, term653684, args);
        assertTrue(recursiveEquals(term653684, term654855));
        assertTrue(recursiveEquals(term653736, term654856));
    }

};


