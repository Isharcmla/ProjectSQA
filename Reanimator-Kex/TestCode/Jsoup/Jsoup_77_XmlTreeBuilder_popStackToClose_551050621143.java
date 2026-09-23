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

public class XmlTreeBuilder_popStackToClose_551050621143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252576;
     Object term252828;
     Object term256839;
     Object term256844;

    public XmlTreeBuilder_popStackToClose_551050621143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term252680 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term252726 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term252726, term252726.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term252680, term252680.getClass(), "tag", term252726);
        ArrayList term252628 = new ArrayList();
        ((ArrayList) term252628).add(term252680);
        term252576 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term252576, term252576.getClass(), "stack", term252628);
        term252828 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term252828, term252828.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term256842 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term256843 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term256843, term256843.getClass(), "tagName", null);
        setBooleanField(term256843, term256843.getClass(), "isBlock", false);
        setBooleanField(term256843, term256843.getClass(), "formatAsBlock", false);
        setBooleanField(term256843, term256843.getClass(), "canContainInline", false);
        setBooleanField(term256843, term256843.getClass(), "empty", false);
        setBooleanField(term256843, term256843.getClass(), "selfClosing", false);
        setBooleanField(term256843, term256843.getClass(), "preserveWhitespace", false);
        setBooleanField(term256843, term256843.getClass(), "formList", false);
        setBooleanField(term256843, term256843.getClass(), "formSubmit", false);
        setField(term256842, term256842.getClass(), "tag", term256843);
        setField(term256842, term256842.getClass(), "shadowChildrenRef", null);
        setField(term256842, term256842.getClass(), "childNodes", null);
        setField(term256842, term256842.getClass(), "attributes", null);
        setField(term256842, term256842.getClass(), "baseUri", null);
        setField(term256842, term256842.getClass(), "parentNode", null);
        setIntField(term256842, term256842.getClass(), "siblingIndex", 0);
        ArrayList term256840 = new ArrayList();
        ((ArrayList) term256840).add(term256842);
        term256839 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term256839, term256839.getClass(), "reader", null);
        setField(term256839, term256839.getClass(), "tokeniser", null);
        setField(term256839, term256839.getClass(), "doc", null);
        setField(term256839, term256839.getClass(), "stack", term256840);
        setField(term256839, term256839.getClass(), "baseUri", null);
        setField(term256839, term256839.getClass(), "currentToken", null);
        setField(term256839, term256839.getClass(), "errors", null);
        setField(term256839, term256839.getClass(), "settings", null);
        setField(term256839, term256839.getClass(), "start", null);
        setField(term256839, term256839.getClass(), "end", null);
        term256844 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term256844, term256844.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term256844, term256844.getClass(), "normalName", null);
        setField(term256844, term256844.getClass(), "pendingAttributeName", null);
        setField(term256844, term256844.getClass(), "pendingAttributeValue", null);
        setField(term256844, term256844.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term256844, term256844.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term256844, term256844.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term256844, term256844.getClass(), "selfClosing", false);
        setField(term256844, term256844.getClass(), "attributes", null);
        setField(term256844, term256844.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term252828;
        callMethod(klass, "popStackToClose", argTypes, term252576, args);
        assertTrue(recursiveEquals(term252576, term256839));
        assertTrue(recursiveEquals(term252828, term256844));
    }

};


