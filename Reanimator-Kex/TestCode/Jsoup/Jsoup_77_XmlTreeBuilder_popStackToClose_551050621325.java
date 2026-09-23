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

public class XmlTreeBuilder_popStackToClose_551050621325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461007;
     Object term461177;
     Object term461302;
     Object term461306;

    public XmlTreeBuilder_popStackToClose_551050621325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term461113 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term461059 = new ArrayList();
        ((ArrayList) term461059).add(term461113);
        term461007 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term461007, term461007.getClass(), "stack", term461059);
        term461177 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term461177, term461177.getClass(), "tagName", "                ");
        Object term461305 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term461305, term461305.getClass(), "outputSettings", null);
        setField(term461305, term461305.getClass(), "quirksMode", null);
        setField(term461305, term461305.getClass(), "location", null);
        setBooleanField(term461305, term461305.getClass(), "updateMetaCharset", false);
        setField(term461305, term461305.getClass(), "tag", null);
        setField(term461305, term461305.getClass(), "shadowChildrenRef", null);
        setField(term461305, term461305.getClass(), "childNodes", null);
        setField(term461305, term461305.getClass(), "attributes", null);
        setField(term461305, term461305.getClass(), "baseUri", null);
        setField(term461305, term461305.getClass(), "parentNode", null);
        setIntField(term461305, term461305.getClass(), "siblingIndex", 0);
        ArrayList term461303 = new ArrayList();
        ((ArrayList) term461303).add(term461305);
        term461302 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term461302, term461302.getClass(), "reader", null);
        setField(term461302, term461302.getClass(), "tokeniser", null);
        setField(term461302, term461302.getClass(), "doc", null);
        setField(term461302, term461302.getClass(), "stack", term461303);
        setField(term461302, term461302.getClass(), "baseUri", null);
        setField(term461302, term461302.getClass(), "currentToken", null);
        setField(term461302, term461302.getClass(), "errors", null);
        setField(term461302, term461302.getClass(), "settings", null);
        setField(term461302, term461302.getClass(), "start", null);
        setField(term461302, term461302.getClass(), "end", null);
        term461306 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term461306, term461306.getClass(), "tagName", "                ");
        setField(term461306, term461306.getClass(), "normalName", null);
        setField(term461306, term461306.getClass(), "pendingAttributeName", null);
        setField(term461306, term461306.getClass(), "pendingAttributeValue", null);
        setField(term461306, term461306.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term461306, term461306.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term461306, term461306.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term461306, term461306.getClass(), "selfClosing", false);
        setField(term461306, term461306.getClass(), "attributes", null);
        setField(term461306, term461306.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term461177;
        callMethod(klass, "popStackToClose", argTypes, term461007, args);
        assertTrue(recursiveEquals(term461007, term461302));
        assertTrue(recursiveEquals(term461177, term461306));
    }

};


