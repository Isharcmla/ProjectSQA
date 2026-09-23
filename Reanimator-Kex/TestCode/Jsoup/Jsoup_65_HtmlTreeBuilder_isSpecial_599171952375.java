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

public class HtmlTreeBuilder_isSpecial_599171952375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451827;
     Object term451879;
     Object term471101;
     Object term471102;

    public HtmlTreeBuilder_isSpecial_599171952375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451827 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term451879 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term451925 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term451925, term451925.getClass(), "tagName", "");
        setField(term451879, term451879.getClass(), "tag", term451925);
        term471101 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term471101, term471101.getClass(), "state", null);
        setField(term471101, term471101.getClass(), "originalState", null);
        setBooleanField(term471101, term471101.getClass(), "baseUriSetFromDoc", false);
        setField(term471101, term471101.getClass(), "headElement", null);
        setField(term471101, term471101.getClass(), "formElement", null);
        setField(term471101, term471101.getClass(), "contextElement", null);
        setField(term471101, term471101.getClass(), "formattingElements", null);
        setField(term471101, term471101.getClass(), "pendingTableCharacters", null);
        setField(term471101, term471101.getClass(), "emptyEnd", null);
        setBooleanField(term471101, term471101.getClass(), "framesetOk", false);
        setBooleanField(term471101, term471101.getClass(), "fosterInserts", false);
        setBooleanField(term471101, term471101.getClass(), "fragmentParsing", false);
        setField(term471101, term471101.getClass(), "specificScopeTarget", null);
        setField(term471101, term471101.getClass(), "reader", null);
        setField(term471101, term471101.getClass(), "tokeniser", null);
        setField(term471101, term471101.getClass(), "doc", null);
        setField(term471101, term471101.getClass(), "stack", null);
        setField(term471101, term471101.getClass(), "baseUri", null);
        setField(term471101, term471101.getClass(), "currentToken", null);
        setField(term471101, term471101.getClass(), "errors", null);
        setField(term471101, term471101.getClass(), "settings", null);
        setField(term471101, term471101.getClass(), "start", null);
        setField(term471101, term471101.getClass(), "end", null);
        term471102 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term471103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term471103, term471103.getClass(), "tagName", "");
        setBooleanField(term471103, term471103.getClass(), "isBlock", false);
        setBooleanField(term471103, term471103.getClass(), "formatAsBlock", false);
        setBooleanField(term471103, term471103.getClass(), "canContainInline", false);
        setBooleanField(term471103, term471103.getClass(), "empty", false);
        setBooleanField(term471103, term471103.getClass(), "selfClosing", false);
        setBooleanField(term471103, term471103.getClass(), "preserveWhitespace", false);
        setBooleanField(term471103, term471103.getClass(), "formList", false);
        setBooleanField(term471103, term471103.getClass(), "formSubmit", false);
        setField(term471102, term471102.getClass(), "tag", term471103);
        setField(term471102, term471102.getClass(), "shadowChildrenRef", null);
        setField(term471102, term471102.getClass(), "childNodes", null);
        setField(term471102, term471102.getClass(), "attributes", null);
        setField(term471102, term471102.getClass(), "baseUri", null);
        setField(term471102, term471102.getClass(), "parentNode", null);
        setIntField(term471102, term471102.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term451879;
        callMethod(klass, "isSpecial", argTypes, term451827, args);
        assertTrue(recursiveEquals(term451827, term471101));
        assertTrue(recursiveEquals(term451879, term471102));
    }

};


