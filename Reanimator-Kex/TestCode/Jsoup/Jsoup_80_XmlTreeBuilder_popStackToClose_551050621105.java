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

public class XmlTreeBuilder_popStackToClose_551050621105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221388;
     Object term221624;
     Object term222218;
     Object term222223;

    public XmlTreeBuilder_popStackToClose_551050621105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221560 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term221506 = new ArrayList();
        ((ArrayList) term221506).add(term221560);
        term221388 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term221454 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term221454, term221454.getClass(), "preserveTagCase", false);
        setField(term221388, term221388.getClass(), "settings", term221454);
        setField(term221388, term221388.getClass(), "stack", term221506);
        term221624 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term221624, term221624.getClass(), "tagName", "");
        Object term222221 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term222221, term222221.getClass(), "outputSettings", null);
        setField(term222221, term222221.getClass(), "quirksMode", null);
        setField(term222221, term222221.getClass(), "location", null);
        setBooleanField(term222221, term222221.getClass(), "updateMetaCharset", false);
        setField(term222221, term222221.getClass(), "tag", null);
        setField(term222221, term222221.getClass(), "shadowChildrenRef", null);
        setField(term222221, term222221.getClass(), "childNodes", null);
        setField(term222221, term222221.getClass(), "attributes", null);
        setField(term222221, term222221.getClass(), "baseUri", null);
        setField(term222221, term222221.getClass(), "parentNode", null);
        setIntField(term222221, term222221.getClass(), "siblingIndex", 0);
        ArrayList term222219 = new ArrayList();
        ((ArrayList) term222219).add(term222221);
        term222218 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term222222 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term222218, term222218.getClass(), "reader", null);
        setField(term222218, term222218.getClass(), "tokeniser", null);
        setField(term222218, term222218.getClass(), "doc", null);
        setField(term222218, term222218.getClass(), "stack", term222219);
        setField(term222218, term222218.getClass(), "baseUri", null);
        setField(term222218, term222218.getClass(), "currentToken", null);
        setField(term222218, term222218.getClass(), "errors", null);
        setBooleanField(term222222, term222222.getClass(), "preserveTagCase", false);
        setBooleanField(term222222, term222222.getClass(), "preserveAttributeCase", false);
        setField(term222218, term222218.getClass(), "settings", term222222);
        setField(term222218, term222218.getClass(), "start", null);
        setField(term222218, term222218.getClass(), "end", null);
        term222223 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term222223, term222223.getClass(), "tagName", "");
        setField(term222223, term222223.getClass(), "normalName", null);
        setField(term222223, term222223.getClass(), "pendingAttributeName", null);
        setField(term222223, term222223.getClass(), "pendingAttributeValue", null);
        setField(term222223, term222223.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term222223, term222223.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term222223, term222223.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term222223, term222223.getClass(), "selfClosing", false);
        setField(term222223, term222223.getClass(), "attributes", null);
        setField(term222223, term222223.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term221624;
        callMethod(klass, "popStackToClose", argTypes, term221388, args);
        assertTrue(recursiveEquals(term221388, term222218));
        assertTrue(recursiveEquals(term221624, term222223));
    }

};


