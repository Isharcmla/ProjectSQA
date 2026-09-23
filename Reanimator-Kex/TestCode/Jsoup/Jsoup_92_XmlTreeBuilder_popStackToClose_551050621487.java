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

public class XmlTreeBuilder_popStackToClose_551050621487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393327;
     Object term393617;
     Object term394001;
     Object term394007;

    public XmlTreeBuilder_popStackToClose_551050621487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term393499 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term393553 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term393445 = new ArrayList();
        ((ArrayList) term393445).add(term393499);
        ((ArrayList) term393445).add(term393553);
        term393327 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term393393 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term393393, term393393.getClass(), "preserveTagCase", false);
        setField(term393327, term393327.getClass(), "settings", term393393);
        setField(term393327, term393327.getClass(), "stack", term393445);
        term393617 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term393617, term393617.getClass(), "tagName", "");
        Object term394004 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term394004, term394004.getClass(), "outputSettings", null);
        setField(term394004, term394004.getClass(), "parser", null);
        setField(term394004, term394004.getClass(), "quirksMode", null);
        setField(term394004, term394004.getClass(), "location", null);
        setBooleanField(term394004, term394004.getClass(), "updateMetaCharset", false);
        setField(term394004, term394004.getClass(), "tag", null);
        setField(term394004, term394004.getClass(), "shadowChildrenRef", null);
        setField(term394004, term394004.getClass(), "childNodes", null);
        setField(term394004, term394004.getClass(), "attributes", null);
        setField(term394004, term394004.getClass(), "baseUri", null);
        setField(term394004, term394004.getClass(), "parentNode", null);
        setIntField(term394004, term394004.getClass(), "siblingIndex", 0);
        Object term394005 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term394005, term394005.getClass(), "outputSettings", null);
        setField(term394005, term394005.getClass(), "parser", null);
        setField(term394005, term394005.getClass(), "quirksMode", null);
        setField(term394005, term394005.getClass(), "location", null);
        setBooleanField(term394005, term394005.getClass(), "updateMetaCharset", false);
        setField(term394005, term394005.getClass(), "tag", null);
        setField(term394005, term394005.getClass(), "shadowChildrenRef", null);
        setField(term394005, term394005.getClass(), "childNodes", null);
        setField(term394005, term394005.getClass(), "attributes", null);
        setField(term394005, term394005.getClass(), "baseUri", null);
        setField(term394005, term394005.getClass(), "parentNode", null);
        setIntField(term394005, term394005.getClass(), "siblingIndex", 0);
        ArrayList term394002 = new ArrayList();
        ((ArrayList) term394002).add(term394004);
        ((ArrayList) term394002).add(term394005);
        term394001 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term394006 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term394001, term394001.getClass(), "parser", null);
        setField(term394001, term394001.getClass(), "reader", null);
        setField(term394001, term394001.getClass(), "tokeniser", null);
        setField(term394001, term394001.getClass(), "doc", null);
        setField(term394001, term394001.getClass(), "stack", term394002);
        setField(term394001, term394001.getClass(), "baseUri", null);
        setField(term394001, term394001.getClass(), "currentToken", null);
        setBooleanField(term394006, term394006.getClass(), "preserveTagCase", false);
        setBooleanField(term394006, term394006.getClass(), "preserveAttributeCase", false);
        setField(term394001, term394001.getClass(), "settings", term394006);
        setField(term394001, term394001.getClass(), "start", null);
        setField(term394001, term394001.getClass(), "end", null);
        term394007 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term394007, term394007.getClass(), "tagName", "");
        setField(term394007, term394007.getClass(), "normalName", null);
        setField(term394007, term394007.getClass(), "pendingAttributeName", null);
        setField(term394007, term394007.getClass(), "pendingAttributeValue", null);
        setField(term394007, term394007.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term394007, term394007.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term394007, term394007.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term394007, term394007.getClass(), "selfClosing", false);
        setField(term394007, term394007.getClass(), "attributes", null);
        setField(term394007, term394007.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term393617;
        callMethod(klass, "popStackToClose", argTypes, term393327, args);
        assertTrue(recursiveEquals(term393327, term394001));
        assertTrue(recursiveEquals(term393617, term394007));
    }

};


