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

public class XmlTreeBuilder_popStackToClose_551050621161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251402;
     Object term251692;
     Object term252068;
     Object term252074;

    public XmlTreeBuilder_popStackToClose_551050621161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term251574 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term251628 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term251520 = new ArrayList();
        ((ArrayList) term251520).add(term251574);
        ((ArrayList) term251520).add(term251628);
        term251402 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term251468 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term251468, term251468.getClass(), "preserveTagCase", false);
        setField(term251402, term251402.getClass(), "settings", term251468);
        setField(term251402, term251402.getClass(), "stack", term251520);
        term251692 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term251692, term251692.getClass(), "tagName", "");
        Object term252071 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term252071, term252071.getClass(), "outputSettings", null);
        setField(term252071, term252071.getClass(), "quirksMode", null);
        setField(term252071, term252071.getClass(), "location", null);
        setBooleanField(term252071, term252071.getClass(), "updateMetaCharset", false);
        setField(term252071, term252071.getClass(), "tag", null);
        setField(term252071, term252071.getClass(), "shadowChildrenRef", null);
        setField(term252071, term252071.getClass(), "childNodes", null);
        setField(term252071, term252071.getClass(), "attributes", null);
        setField(term252071, term252071.getClass(), "baseUri", null);
        setField(term252071, term252071.getClass(), "parentNode", null);
        setIntField(term252071, term252071.getClass(), "siblingIndex", 0);
        Object term252072 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term252072, term252072.getClass(), "outputSettings", null);
        setField(term252072, term252072.getClass(), "quirksMode", null);
        setField(term252072, term252072.getClass(), "location", null);
        setBooleanField(term252072, term252072.getClass(), "updateMetaCharset", false);
        setField(term252072, term252072.getClass(), "tag", null);
        setField(term252072, term252072.getClass(), "shadowChildrenRef", null);
        setField(term252072, term252072.getClass(), "childNodes", null);
        setField(term252072, term252072.getClass(), "attributes", null);
        setField(term252072, term252072.getClass(), "baseUri", null);
        setField(term252072, term252072.getClass(), "parentNode", null);
        setIntField(term252072, term252072.getClass(), "siblingIndex", 0);
        ArrayList term252069 = new ArrayList();
        ((ArrayList) term252069).add(term252071);
        ((ArrayList) term252069).add(term252072);
        term252068 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term252073 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term252068, term252068.getClass(), "reader", null);
        setField(term252068, term252068.getClass(), "tokeniser", null);
        setField(term252068, term252068.getClass(), "doc", null);
        setField(term252068, term252068.getClass(), "stack", term252069);
        setField(term252068, term252068.getClass(), "baseUri", null);
        setField(term252068, term252068.getClass(), "currentToken", null);
        setField(term252068, term252068.getClass(), "errors", null);
        setBooleanField(term252073, term252073.getClass(), "preserveTagCase", false);
        setBooleanField(term252073, term252073.getClass(), "preserveAttributeCase", false);
        setField(term252068, term252068.getClass(), "settings", term252073);
        setField(term252068, term252068.getClass(), "start", null);
        setField(term252068, term252068.getClass(), "end", null);
        term252074 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term252074, term252074.getClass(), "tagName", "");
        setField(term252074, term252074.getClass(), "normalName", null);
        setField(term252074, term252074.getClass(), "pendingAttributeName", null);
        setField(term252074, term252074.getClass(), "pendingAttributeValue", null);
        setField(term252074, term252074.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term252074, term252074.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term252074, term252074.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term252074, term252074.getClass(), "selfClosing", false);
        setField(term252074, term252074.getClass(), "attributes", null);
        setField(term252074, term252074.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term251692;
        callMethod(klass, "popStackToClose", argTypes, term251402, args);
        assertTrue(recursiveEquals(term251402, term252068));
        assertTrue(recursiveEquals(term251692, term252074));
    }

};


