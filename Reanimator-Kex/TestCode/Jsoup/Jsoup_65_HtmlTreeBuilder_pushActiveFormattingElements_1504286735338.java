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
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391934;
     Object term392100;
     Object term392245;
     Object term392251;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term392040 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term391986 = new ArrayList();
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add((Object)null);
        ((ArrayList) term391986).add(term392040);
        term391934 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term391934, term391934.getClass(), "formattingElements", term391986);
        term392100 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term392146 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term392146, term392146.getClass(), "tagName", "");
        setField(term392100, term392100.getClass(), "tag", term392146);
        Object term392248 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term392248, term392248.getClass(), "outputSettings", null);
        setField(term392248, term392248.getClass(), "quirksMode", null);
        setField(term392248, term392248.getClass(), "location", null);
        setBooleanField(term392248, term392248.getClass(), "updateMetaCharset", false);
        setField(term392248, term392248.getClass(), "tag", null);
        setField(term392248, term392248.getClass(), "shadowChildrenRef", null);
        setField(term392248, term392248.getClass(), "childNodes", null);
        setField(term392248, term392248.getClass(), "attributes", null);
        setField(term392248, term392248.getClass(), "baseUri", null);
        setField(term392248, term392248.getClass(), "parentNode", null);
        setIntField(term392248, term392248.getClass(), "siblingIndex", 0);
        Object term392249 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term392250 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term392249, term392249.getClass(), "elements", null);
        setField(term392250, term392250.getClass(), "tagName", null);
        setBooleanField(term392250, term392250.getClass(), "isBlock", false);
        setBooleanField(term392250, term392250.getClass(), "formatAsBlock", false);
        setBooleanField(term392250, term392250.getClass(), "canContainInline", false);
        setBooleanField(term392250, term392250.getClass(), "empty", false);
        setBooleanField(term392250, term392250.getClass(), "selfClosing", false);
        setBooleanField(term392250, term392250.getClass(), "preserveWhitespace", false);
        setBooleanField(term392250, term392250.getClass(), "formList", false);
        setBooleanField(term392250, term392250.getClass(), "formSubmit", false);
        setField(term392249, term392249.getClass(), "tag", term392250);
        setField(term392249, term392249.getClass(), "shadowChildrenRef", null);
        setField(term392249, term392249.getClass(), "childNodes", null);
        setField(term392249, term392249.getClass(), "attributes", null);
        setField(term392249, term392249.getClass(), "baseUri", null);
        setField(term392249, term392249.getClass(), "parentNode", null);
        setIntField(term392249, term392249.getClass(), "siblingIndex", 0);
        ArrayList term392246 = new ArrayList();
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add((Object)null);
        ((ArrayList) term392246).add(term392248);
        ((ArrayList) term392246).add(term392249);
        term392245 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term392245, term392245.getClass(), "state", null);
        setField(term392245, term392245.getClass(), "originalState", null);
        setBooleanField(term392245, term392245.getClass(), "baseUriSetFromDoc", false);
        setField(term392245, term392245.getClass(), "headElement", null);
        setField(term392245, term392245.getClass(), "formElement", null);
        setField(term392245, term392245.getClass(), "contextElement", null);
        setField(term392245, term392245.getClass(), "formattingElements", term392246);
        setField(term392245, term392245.getClass(), "pendingTableCharacters", null);
        setField(term392245, term392245.getClass(), "emptyEnd", null);
        setBooleanField(term392245, term392245.getClass(), "framesetOk", false);
        setBooleanField(term392245, term392245.getClass(), "fosterInserts", false);
        setBooleanField(term392245, term392245.getClass(), "fragmentParsing", false);
        setField(term392245, term392245.getClass(), "specificScopeTarget", null);
        setField(term392245, term392245.getClass(), "reader", null);
        setField(term392245, term392245.getClass(), "tokeniser", null);
        setField(term392245, term392245.getClass(), "doc", null);
        setField(term392245, term392245.getClass(), "stack", null);
        setField(term392245, term392245.getClass(), "baseUri", null);
        setField(term392245, term392245.getClass(), "currentToken", null);
        setField(term392245, term392245.getClass(), "errors", null);
        setField(term392245, term392245.getClass(), "settings", null);
        setField(term392245, term392245.getClass(), "start", null);
        setField(term392245, term392245.getClass(), "end", null);
        term392251 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term392252 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term392251, term392251.getClass(), "elements", null);
        setField(term392252, term392252.getClass(), "tagName", null);
        setBooleanField(term392252, term392252.getClass(), "isBlock", false);
        setBooleanField(term392252, term392252.getClass(), "formatAsBlock", false);
        setBooleanField(term392252, term392252.getClass(), "canContainInline", false);
        setBooleanField(term392252, term392252.getClass(), "empty", false);
        setBooleanField(term392252, term392252.getClass(), "selfClosing", false);
        setBooleanField(term392252, term392252.getClass(), "preserveWhitespace", false);
        setBooleanField(term392252, term392252.getClass(), "formList", false);
        setBooleanField(term392252, term392252.getClass(), "formSubmit", false);
        setField(term392251, term392251.getClass(), "tag", term392252);
        setField(term392251, term392251.getClass(), "shadowChildrenRef", null);
        setField(term392251, term392251.getClass(), "childNodes", null);
        setField(term392251, term392251.getClass(), "attributes", null);
        setField(term392251, term392251.getClass(), "baseUri", null);
        setField(term392251, term392251.getClass(), "parentNode", null);
        setIntField(term392251, term392251.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term392100;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term391934, args);
        assertTrue(recursiveEquals(term391934, term392245));
        assertTrue(recursiveEquals(term392100, term392251));
    }

};


