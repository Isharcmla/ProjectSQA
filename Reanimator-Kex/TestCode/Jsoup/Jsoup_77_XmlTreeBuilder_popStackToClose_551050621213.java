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

public class XmlTreeBuilder_popStackToClose_551050621213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357219;
     Object term357607;
     Object term362108;
     Object term362113;

    public XmlTreeBuilder_popStackToClose_551050621213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term357323 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term357369 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term357369, term357369.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term357323, term357323.getClass(), "tag", term357369);
        Object term357459 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term357505 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term357505, term357505.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term357459, term357459.getClass(), "tag", term357505);
        ArrayList term357271 = new ArrayList();
        ((ArrayList) term357271).add(term357323);
        ((ArrayList) term357271).add(term357323);
        ((ArrayList) term357271).add(term357459);
        term357219 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term357219, term357219.getClass(), "stack", term357271);
        term357607 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term357607, term357607.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term362111 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term362112 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term362112, term362112.getClass(), "tagName", null);
        setBooleanField(term362112, term362112.getClass(), "isBlock", false);
        setBooleanField(term362112, term362112.getClass(), "formatAsBlock", false);
        setBooleanField(term362112, term362112.getClass(), "canContainInline", false);
        setBooleanField(term362112, term362112.getClass(), "empty", false);
        setBooleanField(term362112, term362112.getClass(), "selfClosing", false);
        setBooleanField(term362112, term362112.getClass(), "preserveWhitespace", false);
        setBooleanField(term362112, term362112.getClass(), "formList", false);
        setBooleanField(term362112, term362112.getClass(), "formSubmit", false);
        setField(term362111, term362111.getClass(), "tag", term362112);
        setField(term362111, term362111.getClass(), "shadowChildrenRef", null);
        setField(term362111, term362111.getClass(), "childNodes", null);
        setField(term362111, term362111.getClass(), "attributes", null);
        setField(term362111, term362111.getClass(), "baseUri", null);
        setField(term362111, term362111.getClass(), "parentNode", null);
        setIntField(term362111, term362111.getClass(), "siblingIndex", 0);
        ArrayList term362109 = new ArrayList();
        ((ArrayList) term362109).add(term362111);
        ((ArrayList) term362109).add(term362111);
        term362108 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term362108, term362108.getClass(), "reader", null);
        setField(term362108, term362108.getClass(), "tokeniser", null);
        setField(term362108, term362108.getClass(), "doc", null);
        setField(term362108, term362108.getClass(), "stack", term362109);
        setField(term362108, term362108.getClass(), "baseUri", null);
        setField(term362108, term362108.getClass(), "currentToken", null);
        setField(term362108, term362108.getClass(), "errors", null);
        setField(term362108, term362108.getClass(), "settings", null);
        setField(term362108, term362108.getClass(), "start", null);
        setField(term362108, term362108.getClass(), "end", null);
        term362113 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term362113, term362113.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term362113, term362113.getClass(), "normalName", null);
        setField(term362113, term362113.getClass(), "pendingAttributeName", null);
        setField(term362113, term362113.getClass(), "pendingAttributeValue", null);
        setField(term362113, term362113.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term362113, term362113.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term362113, term362113.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term362113, term362113.getClass(), "selfClosing", false);
        setField(term362113, term362113.getClass(), "attributes", null);
        setField(term362113, term362113.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term357607;
        callMethod(klass, "popStackToClose", argTypes, term357219, args);
        assertTrue(recursiveEquals(term357219, term362108));
        assertTrue(recursiveEquals(term357607, term362113));
    }

};


