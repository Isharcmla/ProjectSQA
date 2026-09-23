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

public class HtmlTreeBuilder_isSpecial_599171952319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286056;
     Object term286108;
     Object term287188;
     Object term287189;

    public HtmlTreeBuilder_isSpecial_599171952319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286056 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term286108 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term286154 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term286154, term286154.getClass(), "tagName", "");
        setField(term286108, term286108.getClass(), "tag", term286154);
        term287188 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term287188, term287188.getClass(), "state", null);
        setField(term287188, term287188.getClass(), "originalState", null);
        setBooleanField(term287188, term287188.getClass(), "baseUriSetFromDoc", false);
        setField(term287188, term287188.getClass(), "headElement", null);
        setField(term287188, term287188.getClass(), "formElement", null);
        setField(term287188, term287188.getClass(), "contextElement", null);
        setField(term287188, term287188.getClass(), "formattingElements", null);
        setField(term287188, term287188.getClass(), "pendingTableCharacters", null);
        setField(term287188, term287188.getClass(), "emptyEnd", null);
        setBooleanField(term287188, term287188.getClass(), "framesetOk", false);
        setBooleanField(term287188, term287188.getClass(), "fosterInserts", false);
        setBooleanField(term287188, term287188.getClass(), "fragmentParsing", false);
        setField(term287188, term287188.getClass(), "specificScopeTarget", null);
        setField(term287188, term287188.getClass(), "reader", null);
        setField(term287188, term287188.getClass(), "tokeniser", null);
        setField(term287188, term287188.getClass(), "doc", null);
        setField(term287188, term287188.getClass(), "stack", null);
        setField(term287188, term287188.getClass(), "baseUri", null);
        setField(term287188, term287188.getClass(), "currentToken", null);
        setField(term287188, term287188.getClass(), "errors", null);
        setField(term287188, term287188.getClass(), "settings", null);
        setField(term287188, term287188.getClass(), "start", null);
        setField(term287188, term287188.getClass(), "end", null);
        term287189 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term287190 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term287190, term287190.getClass(), "tagName", "");
        setBooleanField(term287190, term287190.getClass(), "isBlock", false);
        setBooleanField(term287190, term287190.getClass(), "formatAsBlock", false);
        setBooleanField(term287190, term287190.getClass(), "canContainInline", false);
        setBooleanField(term287190, term287190.getClass(), "empty", false);
        setBooleanField(term287190, term287190.getClass(), "selfClosing", false);
        setBooleanField(term287190, term287190.getClass(), "preserveWhitespace", false);
        setBooleanField(term287190, term287190.getClass(), "formList", false);
        setBooleanField(term287190, term287190.getClass(), "formSubmit", false);
        setField(term287189, term287189.getClass(), "tag", term287190);
        setField(term287189, term287189.getClass(), "shadowChildrenRef", null);
        setField(term287189, term287189.getClass(), "childNodes", null);
        setField(term287189, term287189.getClass(), "attributes", null);
        setField(term287189, term287189.getClass(), "baseUri", null);
        setField(term287189, term287189.getClass(), "parentNode", null);
        setIntField(term287189, term287189.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term286108;
        callMethod(klass, "isSpecial", argTypes, term286056, args);
        assertTrue(recursiveEquals(term286056, term287188));
        assertTrue(recursiveEquals(term286108, term287189));
    }

};


