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

public class XmlTreeBuilder_popStackToClose_551050621139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151761;
     Object term152149;
     Object term158652;
     Object term158659;

    public XmlTreeBuilder_popStackToClose_551050621139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151865 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term151911 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term151911, term151911.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term151865, term151865.getClass(), "tag", term151911);
        Object term152001 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term152047 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term152047, term152047.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term152001, term152001.getClass(), "tag", term152047);
        ArrayList term151813 = new ArrayList();
        ((ArrayList) term151813).add(term151865);
        ((ArrayList) term151813).add(term152001);
        term151761 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term151761, term151761.getClass(), "stack", term151813);
        term152149 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term152149, term152149.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term158655 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term158656 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term158656, term158656.getClass(), "tagName", null);
        setBooleanField(term158656, term158656.getClass(), "isBlock", false);
        setBooleanField(term158656, term158656.getClass(), "formatAsBlock", false);
        setBooleanField(term158656, term158656.getClass(), "canContainBlock", false);
        setBooleanField(term158656, term158656.getClass(), "canContainInline", false);
        setBooleanField(term158656, term158656.getClass(), "empty", false);
        setBooleanField(term158656, term158656.getClass(), "selfClosing", false);
        setBooleanField(term158656, term158656.getClass(), "preserveWhitespace", false);
        setBooleanField(term158656, term158656.getClass(), "formList", false);
        setBooleanField(term158656, term158656.getClass(), "formSubmit", false);
        setField(term158655, term158655.getClass(), "tag", term158656);
        setField(term158655, term158655.getClass(), "parentNode", null);
        setField(term158655, term158655.getClass(), "childNodes", null);
        setField(term158655, term158655.getClass(), "attributes", null);
        setField(term158655, term158655.getClass(), "baseUri", null);
        setIntField(term158655, term158655.getClass(), "siblingIndex", 0);
        Object term158657 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term158658 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term158658, term158658.getClass(), "tagName", null);
        setBooleanField(term158658, term158658.getClass(), "isBlock", false);
        setBooleanField(term158658, term158658.getClass(), "formatAsBlock", false);
        setBooleanField(term158658, term158658.getClass(), "canContainBlock", false);
        setBooleanField(term158658, term158658.getClass(), "canContainInline", false);
        setBooleanField(term158658, term158658.getClass(), "empty", false);
        setBooleanField(term158658, term158658.getClass(), "selfClosing", false);
        setBooleanField(term158658, term158658.getClass(), "preserveWhitespace", false);
        setBooleanField(term158658, term158658.getClass(), "formList", false);
        setBooleanField(term158658, term158658.getClass(), "formSubmit", false);
        setField(term158657, term158657.getClass(), "tag", term158658);
        setField(term158657, term158657.getClass(), "parentNode", null);
        setField(term158657, term158657.getClass(), "childNodes", null);
        setField(term158657, term158657.getClass(), "attributes", null);
        setField(term158657, term158657.getClass(), "baseUri", null);
        setIntField(term158657, term158657.getClass(), "siblingIndex", 0);
        ArrayList term158653 = new ArrayList();
        ((ArrayList) term158653).add(term158655);
        ((ArrayList) term158653).add(term158657);
        term158652 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term158652, term158652.getClass(), "reader", null);
        setField(term158652, term158652.getClass(), "tokeniser", null);
        setField(term158652, term158652.getClass(), "doc", null);
        setField(term158652, term158652.getClass(), "stack", term158653);
        setField(term158652, term158652.getClass(), "baseUri", null);
        setField(term158652, term158652.getClass(), "currentToken", null);
        setField(term158652, term158652.getClass(), "errors", null);
        setField(term158652, term158652.getClass(), "start", null);
        setField(term158652, term158652.getClass(), "end", null);
        term158659 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term158659, term158659.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term158659, term158659.getClass(), "pendingAttributeName", null);
        setField(term158659, term158659.getClass(), "pendingAttributeValue", null);
        setField(term158659, term158659.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term158659, term158659.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term158659, term158659.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term158659, term158659.getClass(), "selfClosing", false);
        setField(term158659, term158659.getClass(), "attributes", null);
        setField(term158659, term158659.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term152149;
        callMethod(klass, "popStackToClose", argTypes, term151761, args);
        assertTrue(recursiveEquals(term151761, term158652));
        assertTrue(recursiveEquals(term152149, term158659));
    }

};


