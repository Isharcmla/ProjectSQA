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

public class XmlTreeBuilder_popStackToClose_551050621183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301656;
     Object term302044;
     Object term308541;
     Object term308548;

    public XmlTreeBuilder_popStackToClose_551050621183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term301760 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term301806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term301806, term301806.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term301760, term301760.getClass(), "tag", term301806);
        Object term301896 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term301942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term301942, term301942.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term301896, term301896.getClass(), "tag", term301942);
        ArrayList term301708 = new ArrayList();
        ((ArrayList) term301708).add(term301760);
        ((ArrayList) term301708).add(term301896);
        term301656 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term301656, term301656.getClass(), "stack", term301708);
        term302044 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term302044, term302044.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term308544 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term308545 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term308545, term308545.getClass(), "tagName", null);
        setBooleanField(term308545, term308545.getClass(), "isBlock", false);
        setBooleanField(term308545, term308545.getClass(), "formatAsBlock", false);
        setBooleanField(term308545, term308545.getClass(), "canContainInline", false);
        setBooleanField(term308545, term308545.getClass(), "empty", false);
        setBooleanField(term308545, term308545.getClass(), "selfClosing", false);
        setBooleanField(term308545, term308545.getClass(), "preserveWhitespace", false);
        setBooleanField(term308545, term308545.getClass(), "formList", false);
        setBooleanField(term308545, term308545.getClass(), "formSubmit", false);
        setField(term308544, term308544.getClass(), "tag", term308545);
        setField(term308544, term308544.getClass(), "shadowChildrenRef", null);
        setField(term308544, term308544.getClass(), "childNodes", null);
        setField(term308544, term308544.getClass(), "attributes", null);
        setField(term308544, term308544.getClass(), "baseUri", null);
        setField(term308544, term308544.getClass(), "parentNode", null);
        setIntField(term308544, term308544.getClass(), "siblingIndex", 0);
        Object term308546 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term308547 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term308547, term308547.getClass(), "tagName", null);
        setBooleanField(term308547, term308547.getClass(), "isBlock", false);
        setBooleanField(term308547, term308547.getClass(), "formatAsBlock", false);
        setBooleanField(term308547, term308547.getClass(), "canContainInline", false);
        setBooleanField(term308547, term308547.getClass(), "empty", false);
        setBooleanField(term308547, term308547.getClass(), "selfClosing", false);
        setBooleanField(term308547, term308547.getClass(), "preserveWhitespace", false);
        setBooleanField(term308547, term308547.getClass(), "formList", false);
        setBooleanField(term308547, term308547.getClass(), "formSubmit", false);
        setField(term308546, term308546.getClass(), "tag", term308547);
        setField(term308546, term308546.getClass(), "shadowChildrenRef", null);
        setField(term308546, term308546.getClass(), "childNodes", null);
        setField(term308546, term308546.getClass(), "attributes", null);
        setField(term308546, term308546.getClass(), "baseUri", null);
        setField(term308546, term308546.getClass(), "parentNode", null);
        setIntField(term308546, term308546.getClass(), "siblingIndex", 0);
        ArrayList term308542 = new ArrayList();
        ((ArrayList) term308542).add(term308544);
        ((ArrayList) term308542).add(term308546);
        term308541 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term308541, term308541.getClass(), "reader", null);
        setField(term308541, term308541.getClass(), "tokeniser", null);
        setField(term308541, term308541.getClass(), "doc", null);
        setField(term308541, term308541.getClass(), "stack", term308542);
        setField(term308541, term308541.getClass(), "baseUri", null);
        setField(term308541, term308541.getClass(), "currentToken", null);
        setField(term308541, term308541.getClass(), "errors", null);
        setField(term308541, term308541.getClass(), "settings", null);
        setField(term308541, term308541.getClass(), "start", null);
        setField(term308541, term308541.getClass(), "end", null);
        term308548 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term308548, term308548.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term308548, term308548.getClass(), "normalName", null);
        setField(term308548, term308548.getClass(), "pendingAttributeName", null);
        setField(term308548, term308548.getClass(), "pendingAttributeValue", null);
        setField(term308548, term308548.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term308548, term308548.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term308548, term308548.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term308548, term308548.getClass(), "selfClosing", false);
        setField(term308548, term308548.getClass(), "attributes", null);
        setField(term308548, term308548.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term302044;
        callMethod(klass, "popStackToClose", argTypes, term301656, args);
        assertTrue(recursiveEquals(term301656, term308541));
        assertTrue(recursiveEquals(term302044, term308548));
    }

};


