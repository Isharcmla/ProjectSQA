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

public class XmlTreeBuilder_popStackToClose_551050621109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224328;
     Object term224564;
     Object term224651;
     Object term224656;

    public XmlTreeBuilder_popStackToClose_551050621109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term224500 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term224446 = new ArrayList();
        ((ArrayList) term224446).add(term224500);
        term224328 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term224394 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term224394, term224394.getClass(), "preserveTagCase", false);
        setField(term224328, term224328.getClass(), "settings", term224394);
        setField(term224328, term224328.getClass(), "stack", term224446);
        term224564 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term224564, term224564.getClass(), "tagName", "");
        Object term224654 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term224654, term224654.getClass(), "outputSettings", null);
        setField(term224654, term224654.getClass(), "parser", null);
        setField(term224654, term224654.getClass(), "quirksMode", null);
        setField(term224654, term224654.getClass(), "location", null);
        setBooleanField(term224654, term224654.getClass(), "updateMetaCharset", false);
        setField(term224654, term224654.getClass(), "tag", null);
        setField(term224654, term224654.getClass(), "shadowChildrenRef", null);
        setField(term224654, term224654.getClass(), "childNodes", null);
        setField(term224654, term224654.getClass(), "attributes", null);
        setField(term224654, term224654.getClass(), "baseUri", null);
        setField(term224654, term224654.getClass(), "parentNode", null);
        setIntField(term224654, term224654.getClass(), "siblingIndex", 0);
        ArrayList term224652 = new ArrayList();
        ((ArrayList) term224652).add(term224654);
        term224651 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term224655 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term224651, term224651.getClass(), "parser", null);
        setField(term224651, term224651.getClass(), "reader", null);
        setField(term224651, term224651.getClass(), "tokeniser", null);
        setField(term224651, term224651.getClass(), "doc", null);
        setField(term224651, term224651.getClass(), "stack", term224652);
        setField(term224651, term224651.getClass(), "baseUri", null);
        setField(term224651, term224651.getClass(), "currentToken", null);
        setBooleanField(term224655, term224655.getClass(), "preserveTagCase", false);
        setBooleanField(term224655, term224655.getClass(), "preserveAttributeCase", false);
        setField(term224651, term224651.getClass(), "settings", term224655);
        setField(term224651, term224651.getClass(), "start", null);
        setField(term224651, term224651.getClass(), "end", null);
        term224656 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term224656, term224656.getClass(), "tagName", "");
        setField(term224656, term224656.getClass(), "normalName", null);
        setField(term224656, term224656.getClass(), "pendingAttributeName", null);
        setField(term224656, term224656.getClass(), "pendingAttributeValue", null);
        setField(term224656, term224656.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term224656, term224656.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term224656, term224656.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term224656, term224656.getClass(), "selfClosing", false);
        setField(term224656, term224656.getClass(), "attributes", null);
        setField(term224656, term224656.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term224564;
        callMethod(klass, "popStackToClose", argTypes, term224328, args);
        assertTrue(recursiveEquals(term224328, term224651));
        assertTrue(recursiveEquals(term224564, term224656));
    }

};


