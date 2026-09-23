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

public class HtmlTreeBuilder_isSpecial_599171952285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641056;
     Object term641108;
     Object term644172;
     Object term644173;

    public HtmlTreeBuilder_isSpecial_599171952285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641056 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term641108 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term641154 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term641154, term641154.getClass(), "tagName", "                                                                                                                                                                                                                                                                ");
        setField(term641108, term641108.getClass(), "tag", term641154);
        term644172 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term644172, term644172.getClass(), "state", null);
        setField(term644172, term644172.getClass(), "originalState", null);
        setBooleanField(term644172, term644172.getClass(), "baseUriSetFromDoc", false);
        setField(term644172, term644172.getClass(), "headElement", null);
        setField(term644172, term644172.getClass(), "formElement", null);
        setField(term644172, term644172.getClass(), "contextElement", null);
        setField(term644172, term644172.getClass(), "formattingElements", null);
        setField(term644172, term644172.getClass(), "pendingTableCharacters", null);
        setField(term644172, term644172.getClass(), "emptyEnd", null);
        setBooleanField(term644172, term644172.getClass(), "framesetOk", false);
        setBooleanField(term644172, term644172.getClass(), "fosterInserts", false);
        setBooleanField(term644172, term644172.getClass(), "fragmentParsing", false);
        setField(term644172, term644172.getClass(), "specificScopeTarget", null);
        setField(term644172, term644172.getClass(), "reader", null);
        setField(term644172, term644172.getClass(), "tokeniser", null);
        setField(term644172, term644172.getClass(), "doc", null);
        setField(term644172, term644172.getClass(), "stack", null);
        setField(term644172, term644172.getClass(), "baseUri", null);
        setField(term644172, term644172.getClass(), "currentToken", null);
        setField(term644172, term644172.getClass(), "errors", null);
        setField(term644172, term644172.getClass(), "start", null);
        setField(term644172, term644172.getClass(), "end", null);
        term644173 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term644174 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term644174, term644174.getClass(), "tagName", "                                                                                                                                                                                                                                                                ");
        setBooleanField(term644174, term644174.getClass(), "isBlock", false);
        setBooleanField(term644174, term644174.getClass(), "formatAsBlock", false);
        setBooleanField(term644174, term644174.getClass(), "canContainBlock", false);
        setBooleanField(term644174, term644174.getClass(), "canContainInline", false);
        setBooleanField(term644174, term644174.getClass(), "empty", false);
        setBooleanField(term644174, term644174.getClass(), "selfClosing", false);
        setBooleanField(term644174, term644174.getClass(), "preserveWhitespace", false);
        setBooleanField(term644174, term644174.getClass(), "formList", false);
        setBooleanField(term644174, term644174.getClass(), "formSubmit", false);
        setField(term644173, term644173.getClass(), "tag", term644174);
        setField(term644173, term644173.getClass(), "parentNode", null);
        setField(term644173, term644173.getClass(), "childNodes", null);
        setField(term644173, term644173.getClass(), "attributes", null);
        setField(term644173, term644173.getClass(), "baseUri", null);
        setIntField(term644173, term644173.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term641108;
        callMethod(klass, "isSpecial", argTypes, term641056, args);
        assertTrue(recursiveEquals(term641056, term644172));
        assertTrue(recursiveEquals(term641108, term644173));
    }

};


