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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248461;
     Object term248841;
     Object term248974;
     Object term248981;

    public XmlTreeBuilder_popStackToClose_551050621157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term248639 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term248685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term248685, term248685.getClass(), "tagName", " ");
        setField(term248639, term248639.getClass(), "tag", term248685);
        Object term248777 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term248579 = new ArrayList();
        ((ArrayList) term248579).add(term248639);
        ((ArrayList) term248579).add(term248777);
        term248461 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term248527 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term248527, term248527.getClass(), "preserveTagCase", false);
        setField(term248461, term248461.getClass(), "settings", term248527);
        setField(term248461, term248461.getClass(), "stack", term248579);
        term248841 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term248841, term248841.getClass(), "tagName", "");
        Object term248977 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term248978 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term248977, term248977.getClass(), "elements", null);
        setField(term248978, term248978.getClass(), "tagName", null);
        setField(term248978, term248978.getClass(), "normalName", null);
        setBooleanField(term248978, term248978.getClass(), "isBlock", false);
        setBooleanField(term248978, term248978.getClass(), "formatAsBlock", false);
        setBooleanField(term248978, term248978.getClass(), "canContainInline", false);
        setBooleanField(term248978, term248978.getClass(), "empty", false);
        setBooleanField(term248978, term248978.getClass(), "selfClosing", false);
        setBooleanField(term248978, term248978.getClass(), "preserveWhitespace", false);
        setBooleanField(term248978, term248978.getClass(), "formList", false);
        setBooleanField(term248978, term248978.getClass(), "formSubmit", false);
        setField(term248977, term248977.getClass(), "tag", term248978);
        setField(term248977, term248977.getClass(), "shadowChildrenRef", null);
        setField(term248977, term248977.getClass(), "childNodes", null);
        setField(term248977, term248977.getClass(), "attributes", null);
        setField(term248977, term248977.getClass(), "baseUri", null);
        setField(term248977, term248977.getClass(), "parentNode", null);
        setIntField(term248977, term248977.getClass(), "siblingIndex", 0);
        Object term248979 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term248979, term248979.getClass(), "outputSettings", null);
        setField(term248979, term248979.getClass(), "parser", null);
        setField(term248979, term248979.getClass(), "quirksMode", null);
        setField(term248979, term248979.getClass(), "location", null);
        setBooleanField(term248979, term248979.getClass(), "updateMetaCharset", false);
        setField(term248979, term248979.getClass(), "tag", null);
        setField(term248979, term248979.getClass(), "shadowChildrenRef", null);
        setField(term248979, term248979.getClass(), "childNodes", null);
        setField(term248979, term248979.getClass(), "attributes", null);
        setField(term248979, term248979.getClass(), "baseUri", null);
        setField(term248979, term248979.getClass(), "parentNode", null);
        setIntField(term248979, term248979.getClass(), "siblingIndex", 0);
        ArrayList term248975 = new ArrayList();
        ((ArrayList) term248975).add(term248977);
        ((ArrayList) term248975).add(term248979);
        term248974 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term248980 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term248974, term248974.getClass(), "parser", null);
        setField(term248974, term248974.getClass(), "reader", null);
        setField(term248974, term248974.getClass(), "tokeniser", null);
        setField(term248974, term248974.getClass(), "doc", null);
        setField(term248974, term248974.getClass(), "stack", term248975);
        setField(term248974, term248974.getClass(), "baseUri", null);
        setField(term248974, term248974.getClass(), "currentToken", null);
        setBooleanField(term248980, term248980.getClass(), "preserveTagCase", false);
        setBooleanField(term248980, term248980.getClass(), "preserveAttributeCase", false);
        setField(term248974, term248974.getClass(), "settings", term248980);
        setField(term248974, term248974.getClass(), "start", null);
        setField(term248974, term248974.getClass(), "end", null);
        term248981 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term248981, term248981.getClass(), "tagName", "");
        setField(term248981, term248981.getClass(), "normalName", null);
        setField(term248981, term248981.getClass(), "pendingAttributeName", null);
        setField(term248981, term248981.getClass(), "pendingAttributeValue", null);
        setField(term248981, term248981.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term248981, term248981.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term248981, term248981.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term248981, term248981.getClass(), "selfClosing", false);
        setField(term248981, term248981.getClass(), "attributes", null);
        setField(term248981, term248981.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term248841;
        callMethod(klass, "popStackToClose", argTypes, term248461, args);
        assertTrue(recursiveEquals(term248461, term248974));
        assertTrue(recursiveEquals(term248841, term248981));
    }

};


