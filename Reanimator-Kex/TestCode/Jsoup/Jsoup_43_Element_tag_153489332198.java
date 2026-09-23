package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_tag_153489332198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;
     Object term9224;
     Object term9177;

    public Element_tag_153489332198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term395 = new ArrayList();
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        LinkedHashMap term400 = new LinkedHashMap();
        term372 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term399 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term373, term373.getClass(), "tagName", "eZFUvlxvGV");
        setBooleanField(term373, term373.getClass(), "isBlock", true);
        setBooleanField(term373, term373.getClass(), "formatAsBlock", true);
        setBooleanField(term373, term373.getClass(), "canContainBlock", true);
        setBooleanField(term373, term373.getClass(), "canContainInline", false);
        setBooleanField(term373, term373.getClass(), "empty", true);
        setBooleanField(term373, term373.getClass(), "selfClosing", false);
        setBooleanField(term373, term373.getClass(), "preserveWhitespace", false);
        setBooleanField(term373, term373.getClass(), "formList", true);
        setBooleanField(term373, term373.getClass(), "formSubmit", false);
        setField(term372, term372.getClass(), "tag", term373);
        setField(term372, term372.getClass(), "parentNode", null);
        setField(term372, term372.getClass(), "childNodes", term395);
        setField(term399, term399.getClass(), "attributes", term400);
        setField(term372, term372.getClass(), "attributes", term399);
        setField(term372, term372.getClass(), "baseUri", "OclPbYPkcH");
        setIntField(term372, term372.getClass(), "siblingIndex", 391863371);
        ArrayList term9228 = new ArrayList();
        ((ArrayList) term9228).add((Object)null);
        ((ArrayList) term9228).add((Object)null);
        ((ArrayList) term9228).add((Object)null);
        ((ArrayList) term9228).add((Object)null);
        LinkedHashMap term9231 = new LinkedHashMap();
        term9224 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9230 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9225, term9225.getClass(), "tagName", "eZFUvlxvGV");
        setBooleanField(term9225, term9225.getClass(), "isBlock", true);
        setBooleanField(term9225, term9225.getClass(), "formatAsBlock", true);
        setBooleanField(term9225, term9225.getClass(), "canContainBlock", true);
        setBooleanField(term9225, term9225.getClass(), "canContainInline", false);
        setBooleanField(term9225, term9225.getClass(), "empty", true);
        setBooleanField(term9225, term9225.getClass(), "selfClosing", false);
        setBooleanField(term9225, term9225.getClass(), "preserveWhitespace", false);
        setBooleanField(term9225, term9225.getClass(), "formList", true);
        setBooleanField(term9225, term9225.getClass(), "formSubmit", false);
        setField(term9224, term9224.getClass(), "tag", term9225);
        setField(term9224, term9224.getClass(), "parentNode", null);
        setField(term9224, term9224.getClass(), "childNodes", term9228);
        setField(term9230, term9230.getClass(), "attributes", term9231);
        setField(term9224, term9224.getClass(), "attributes", term9230);
        setField(term9224, term9224.getClass(), "baseUri", "OclPbYPkcH");
        setIntField(term9224, term9224.getClass(), "siblingIndex", 391863371);
        term9177 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9177, term9177.getClass(), "tagName", "eZFUvlxvGV");
        setBooleanField(term9177, term9177.getClass(), "isBlock", true);
        setBooleanField(term9177, term9177.getClass(), "formatAsBlock", true);
        setBooleanField(term9177, term9177.getClass(), "canContainBlock", true);
        setBooleanField(term9177, term9177.getClass(), "canContainInline", false);
        setBooleanField(term9177, term9177.getClass(), "empty", true);
        setBooleanField(term9177, term9177.getClass(), "selfClosing", false);
        setBooleanField(term9177, term9177.getClass(), "preserveWhitespace", false);
        setBooleanField(term9177, term9177.getClass(), "formList", true);
        setBooleanField(term9177, term9177.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term372, args);
        assertTrue(recursiveEquals(term372, term9224));
        assertTrue(recursiveEquals(retValue, term9177));
    }

};


