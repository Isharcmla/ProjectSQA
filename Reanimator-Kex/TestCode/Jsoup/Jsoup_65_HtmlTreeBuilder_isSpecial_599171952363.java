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

public class HtmlTreeBuilder_isSpecial_599171952363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430664;
     Object term430716;
     Object term432942;
     Object term432943;

    public HtmlTreeBuilder_isSpecial_599171952363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430664 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term430716 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term430762 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term430762, term430762.getClass(), "tagName", "");
        setField(term430716, term430716.getClass(), "tag", term430762);
        term432942 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term432942, term432942.getClass(), "state", null);
        setField(term432942, term432942.getClass(), "originalState", null);
        setBooleanField(term432942, term432942.getClass(), "baseUriSetFromDoc", false);
        setField(term432942, term432942.getClass(), "headElement", null);
        setField(term432942, term432942.getClass(), "formElement", null);
        setField(term432942, term432942.getClass(), "contextElement", null);
        setField(term432942, term432942.getClass(), "formattingElements", null);
        setField(term432942, term432942.getClass(), "pendingTableCharacters", null);
        setField(term432942, term432942.getClass(), "emptyEnd", null);
        setBooleanField(term432942, term432942.getClass(), "framesetOk", false);
        setBooleanField(term432942, term432942.getClass(), "fosterInserts", false);
        setBooleanField(term432942, term432942.getClass(), "fragmentParsing", false);
        setField(term432942, term432942.getClass(), "specificScopeTarget", null);
        setField(term432942, term432942.getClass(), "reader", null);
        setField(term432942, term432942.getClass(), "tokeniser", null);
        setField(term432942, term432942.getClass(), "doc", null);
        setField(term432942, term432942.getClass(), "stack", null);
        setField(term432942, term432942.getClass(), "baseUri", null);
        setField(term432942, term432942.getClass(), "currentToken", null);
        setField(term432942, term432942.getClass(), "errors", null);
        setField(term432942, term432942.getClass(), "settings", null);
        setField(term432942, term432942.getClass(), "start", null);
        setField(term432942, term432942.getClass(), "end", null);
        term432943 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term432944 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term432944, term432944.getClass(), "tagName", "");
        setBooleanField(term432944, term432944.getClass(), "isBlock", false);
        setBooleanField(term432944, term432944.getClass(), "formatAsBlock", false);
        setBooleanField(term432944, term432944.getClass(), "canContainInline", false);
        setBooleanField(term432944, term432944.getClass(), "empty", false);
        setBooleanField(term432944, term432944.getClass(), "selfClosing", false);
        setBooleanField(term432944, term432944.getClass(), "preserveWhitespace", false);
        setBooleanField(term432944, term432944.getClass(), "formList", false);
        setBooleanField(term432944, term432944.getClass(), "formSubmit", false);
        setField(term432943, term432943.getClass(), "tag", term432944);
        setField(term432943, term432943.getClass(), "shadowChildrenRef", null);
        setField(term432943, term432943.getClass(), "childNodes", null);
        setField(term432943, term432943.getClass(), "attributes", null);
        setField(term432943, term432943.getClass(), "baseUri", null);
        setField(term432943, term432943.getClass(), "parentNode", null);
        setIntField(term432943, term432943.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term430716;
        callMethod(klass, "isSpecial", argTypes, term430664, args);
        assertTrue(recursiveEquals(term430664, term432942));
        assertTrue(recursiveEquals(term430716, term432943));
    }

};


