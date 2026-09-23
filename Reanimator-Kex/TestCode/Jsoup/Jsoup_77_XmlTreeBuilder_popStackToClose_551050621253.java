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

public class XmlTreeBuilder_popStackToClose_551050621253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387828;
     Object term388352;
     Object term393353;
     Object term393360;

    public XmlTreeBuilder_popStackToClose_551050621253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term387932 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term387978 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term387978, term387978.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term387932, term387932.getClass(), "tag", term387978);
        Object term388068 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term388114 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term388114, term388114.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term388068, term388068.getClass(), "tag", term388114);
        Object term388204 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term388250 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term388250, term388250.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term388204, term388204.getClass(), "tag", term388250);
        ArrayList term387880 = new ArrayList();
        ((ArrayList) term387880).add(term387932);
        ((ArrayList) term387880).add(term388068);
        ((ArrayList) term387880).add(term387932);
        ((ArrayList) term387880).add(term388204);
        term387828 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term387828, term387828.getClass(), "stack", term387880);
        term388352 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term388352, term388352.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term393356 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term393357 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term393357, term393357.getClass(), "tagName", null);
        setBooleanField(term393357, term393357.getClass(), "isBlock", false);
        setBooleanField(term393357, term393357.getClass(), "formatAsBlock", false);
        setBooleanField(term393357, term393357.getClass(), "canContainInline", false);
        setBooleanField(term393357, term393357.getClass(), "empty", false);
        setBooleanField(term393357, term393357.getClass(), "selfClosing", false);
        setBooleanField(term393357, term393357.getClass(), "preserveWhitespace", false);
        setBooleanField(term393357, term393357.getClass(), "formList", false);
        setBooleanField(term393357, term393357.getClass(), "formSubmit", false);
        setField(term393356, term393356.getClass(), "tag", term393357);
        setField(term393356, term393356.getClass(), "shadowChildrenRef", null);
        setField(term393356, term393356.getClass(), "childNodes", null);
        setField(term393356, term393356.getClass(), "attributes", null);
        setField(term393356, term393356.getClass(), "baseUri", null);
        setField(term393356, term393356.getClass(), "parentNode", null);
        setIntField(term393356, term393356.getClass(), "siblingIndex", 0);
        Object term393358 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term393359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term393359, term393359.getClass(), "tagName", null);
        setBooleanField(term393359, term393359.getClass(), "isBlock", false);
        setBooleanField(term393359, term393359.getClass(), "formatAsBlock", false);
        setBooleanField(term393359, term393359.getClass(), "canContainInline", false);
        setBooleanField(term393359, term393359.getClass(), "empty", false);
        setBooleanField(term393359, term393359.getClass(), "selfClosing", false);
        setBooleanField(term393359, term393359.getClass(), "preserveWhitespace", false);
        setBooleanField(term393359, term393359.getClass(), "formList", false);
        setBooleanField(term393359, term393359.getClass(), "formSubmit", false);
        setField(term393358, term393358.getClass(), "tag", term393359);
        setField(term393358, term393358.getClass(), "shadowChildrenRef", null);
        setField(term393358, term393358.getClass(), "childNodes", null);
        setField(term393358, term393358.getClass(), "attributes", null);
        setField(term393358, term393358.getClass(), "baseUri", null);
        setField(term393358, term393358.getClass(), "parentNode", null);
        setIntField(term393358, term393358.getClass(), "siblingIndex", 0);
        ArrayList term393354 = new ArrayList();
        ((ArrayList) term393354).add(term393356);
        ((ArrayList) term393354).add(term393358);
        ((ArrayList) term393354).add(term393356);
        term393353 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term393353, term393353.getClass(), "reader", null);
        setField(term393353, term393353.getClass(), "tokeniser", null);
        setField(term393353, term393353.getClass(), "doc", null);
        setField(term393353, term393353.getClass(), "stack", term393354);
        setField(term393353, term393353.getClass(), "baseUri", null);
        setField(term393353, term393353.getClass(), "currentToken", null);
        setField(term393353, term393353.getClass(), "errors", null);
        setField(term393353, term393353.getClass(), "settings", null);
        setField(term393353, term393353.getClass(), "start", null);
        setField(term393353, term393353.getClass(), "end", null);
        term393360 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term393360, term393360.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term393360, term393360.getClass(), "normalName", null);
        setField(term393360, term393360.getClass(), "pendingAttributeName", null);
        setField(term393360, term393360.getClass(), "pendingAttributeValue", null);
        setField(term393360, term393360.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term393360, term393360.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term393360, term393360.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term393360, term393360.getClass(), "selfClosing", false);
        setField(term393360, term393360.getClass(), "attributes", null);
        setField(term393360, term393360.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term388352;
        callMethod(klass, "popStackToClose", argTypes, term387828, args);
        assertTrue(recursiveEquals(term387828, term393353));
        assertTrue(recursiveEquals(term388352, term393360));
    }

};


