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

public class XmlTreeBuilder_popStackToClose_551050621129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145599;
     Object term145987;
     Object term152490;
     Object term152497;

    public XmlTreeBuilder_popStackToClose_551050621129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145703 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term145749 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term145749, term145749.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term145703, term145703.getClass(), "tag", term145749);
        Object term145839 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term145885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term145885, term145885.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term145839, term145839.getClass(), "tag", term145885);
        ArrayList term145651 = new ArrayList();
        ((ArrayList) term145651).add(term145703);
        ((ArrayList) term145651).add(term145839);
        term145599 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term145599, term145599.getClass(), "stack", term145651);
        term145987 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term145987, term145987.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term152493 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term152494 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term152494, term152494.getClass(), "tagName", null);
        setBooleanField(term152494, term152494.getClass(), "isBlock", false);
        setBooleanField(term152494, term152494.getClass(), "formatAsBlock", false);
        setBooleanField(term152494, term152494.getClass(), "canContainBlock", false);
        setBooleanField(term152494, term152494.getClass(), "canContainInline", false);
        setBooleanField(term152494, term152494.getClass(), "empty", false);
        setBooleanField(term152494, term152494.getClass(), "selfClosing", false);
        setBooleanField(term152494, term152494.getClass(), "preserveWhitespace", false);
        setBooleanField(term152494, term152494.getClass(), "formList", false);
        setBooleanField(term152494, term152494.getClass(), "formSubmit", false);
        setField(term152493, term152493.getClass(), "tag", term152494);
        setField(term152493, term152493.getClass(), "parentNode", null);
        setField(term152493, term152493.getClass(), "childNodes", null);
        setField(term152493, term152493.getClass(), "attributes", null);
        setField(term152493, term152493.getClass(), "baseUri", null);
        setIntField(term152493, term152493.getClass(), "siblingIndex", 0);
        Object term152495 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term152496 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term152496, term152496.getClass(), "tagName", null);
        setBooleanField(term152496, term152496.getClass(), "isBlock", false);
        setBooleanField(term152496, term152496.getClass(), "formatAsBlock", false);
        setBooleanField(term152496, term152496.getClass(), "canContainBlock", false);
        setBooleanField(term152496, term152496.getClass(), "canContainInline", false);
        setBooleanField(term152496, term152496.getClass(), "empty", false);
        setBooleanField(term152496, term152496.getClass(), "selfClosing", false);
        setBooleanField(term152496, term152496.getClass(), "preserveWhitespace", false);
        setBooleanField(term152496, term152496.getClass(), "formList", false);
        setBooleanField(term152496, term152496.getClass(), "formSubmit", false);
        setField(term152495, term152495.getClass(), "tag", term152496);
        setField(term152495, term152495.getClass(), "parentNode", null);
        setField(term152495, term152495.getClass(), "childNodes", null);
        setField(term152495, term152495.getClass(), "attributes", null);
        setField(term152495, term152495.getClass(), "baseUri", null);
        setIntField(term152495, term152495.getClass(), "siblingIndex", 0);
        ArrayList term152491 = new ArrayList();
        ((ArrayList) term152491).add(term152493);
        ((ArrayList) term152491).add(term152495);
        term152490 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term152490, term152490.getClass(), "reader", null);
        setField(term152490, term152490.getClass(), "tokeniser", null);
        setField(term152490, term152490.getClass(), "doc", null);
        setField(term152490, term152490.getClass(), "stack", term152491);
        setField(term152490, term152490.getClass(), "baseUri", null);
        setField(term152490, term152490.getClass(), "currentToken", null);
        setField(term152490, term152490.getClass(), "errors", null);
        setField(term152490, term152490.getClass(), "settings", null);
        setField(term152490, term152490.getClass(), "start", null);
        setField(term152490, term152490.getClass(), "end", null);
        term152497 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term152497, term152497.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term152497, term152497.getClass(), "normalName", null);
        setField(term152497, term152497.getClass(), "pendingAttributeName", null);
        setField(term152497, term152497.getClass(), "pendingAttributeValue", null);
        setField(term152497, term152497.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term152497, term152497.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term152497, term152497.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term152497, term152497.getClass(), "selfClosing", false);
        setField(term152497, term152497.getClass(), "attributes", null);
        setField(term152497, term152497.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term145987;
        callMethod(klass, "popStackToClose", argTypes, term145599, args);
        assertTrue(recursiveEquals(term145599, term152490));
        assertTrue(recursiveEquals(term145987, term152497));
    }

};


