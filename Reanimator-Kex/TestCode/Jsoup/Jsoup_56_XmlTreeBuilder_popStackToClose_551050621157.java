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

public class XmlTreeBuilder_popStackToClose_551050621157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190129;
     Object term190299;
     Object term190379;
     Object term190383;

    public XmlTreeBuilder_popStackToClose_551050621157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term190235 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term190181 = new ArrayList();
        ((ArrayList) term190181).add(term190235);
        term190129 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term190129, term190129.getClass(), "stack", term190181);
        term190299 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term190299, term190299.getClass(), "tagName", " ");
        Object term190382 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term190382, term190382.getClass(), "outputSettings", null);
        setField(term190382, term190382.getClass(), "quirksMode", null);
        setField(term190382, term190382.getClass(), "location", null);
        setBooleanField(term190382, term190382.getClass(), "updateMetaCharset", false);
        setField(term190382, term190382.getClass(), "tag", null);
        setField(term190382, term190382.getClass(), "parentNode", null);
        setField(term190382, term190382.getClass(), "childNodes", null);
        setField(term190382, term190382.getClass(), "attributes", null);
        setField(term190382, term190382.getClass(), "baseUri", null);
        setIntField(term190382, term190382.getClass(), "siblingIndex", 0);
        ArrayList term190380 = new ArrayList();
        ((ArrayList) term190380).add(term190382);
        term190379 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term190379, term190379.getClass(), "reader", null);
        setField(term190379, term190379.getClass(), "tokeniser", null);
        setField(term190379, term190379.getClass(), "doc", null);
        setField(term190379, term190379.getClass(), "stack", term190380);
        setField(term190379, term190379.getClass(), "baseUri", null);
        setField(term190379, term190379.getClass(), "currentToken", null);
        setField(term190379, term190379.getClass(), "errors", null);
        setField(term190379, term190379.getClass(), "settings", null);
        setField(term190379, term190379.getClass(), "start", null);
        setField(term190379, term190379.getClass(), "end", null);
        term190383 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term190383, term190383.getClass(), "tagName", " ");
        setField(term190383, term190383.getClass(), "normalName", null);
        setField(term190383, term190383.getClass(), "pendingAttributeName", null);
        setField(term190383, term190383.getClass(), "pendingAttributeValue", null);
        setField(term190383, term190383.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term190383, term190383.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term190383, term190383.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term190383, term190383.getClass(), "selfClosing", false);
        setField(term190383, term190383.getClass(), "attributes", null);
        setField(term190383, term190383.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term190299;
        callMethod(klass, "popStackToClose", argTypes, term190129, args);
        assertTrue(recursiveEquals(term190129, term190379));
        assertTrue(recursiveEquals(term190299, term190383));
    }

};


