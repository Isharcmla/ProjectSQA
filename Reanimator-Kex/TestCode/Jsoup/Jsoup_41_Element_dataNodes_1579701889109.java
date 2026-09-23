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

public class Element_dataNodes_1579701889109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term11038;
     Object term10986;

    public Element_dataNodes_1579701889109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1163 = new ArrayList();
        ((ArrayList) term1163).add((Object)null);
        ((ArrayList) term1163).add((Object)null);
        ((ArrayList) term1163).add((Object)null);
        LinkedHashMap term1168 = new LinkedHashMap();
        term1140 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1141 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1167 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1141, term1141.getClass(), "tagName", "idgaQsnJpQ");
        setBooleanField(term1141, term1141.getClass(), "isBlock", false);
        setBooleanField(term1141, term1141.getClass(), "formatAsBlock", true);
        setBooleanField(term1141, term1141.getClass(), "canContainBlock", false);
        setBooleanField(term1141, term1141.getClass(), "canContainInline", false);
        setBooleanField(term1141, term1141.getClass(), "empty", false);
        setBooleanField(term1141, term1141.getClass(), "selfClosing", true);
        setBooleanField(term1141, term1141.getClass(), "preserveWhitespace", true);
        setBooleanField(term1141, term1141.getClass(), "formList", false);
        setBooleanField(term1141, term1141.getClass(), "formSubmit", true);
        setField(term1140, term1140.getClass(), "tag", term1141);
        setField(term1140, term1140.getClass(), "parentNode", null);
        setField(term1140, term1140.getClass(), "childNodes", term1163);
        setField(term1167, term1167.getClass(), "attributes", term1168);
        setField(term1140, term1140.getClass(), "attributes", term1167);
        setField(term1140, term1140.getClass(), "baseUri", "cAPeiZHKGJ");
        setIntField(term1140, term1140.getClass(), "siblingIndex", 597278769);
        ArrayList term11042 = new ArrayList();
        ((ArrayList) term11042).add((Object)null);
        ((ArrayList) term11042).add((Object)null);
        ((ArrayList) term11042).add((Object)null);
        LinkedHashMap term11045 = new LinkedHashMap();
        term11038 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11039 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11044 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11039, term11039.getClass(), "tagName", "idgaQsnJpQ");
        setBooleanField(term11039, term11039.getClass(), "isBlock", false);
        setBooleanField(term11039, term11039.getClass(), "formatAsBlock", true);
        setBooleanField(term11039, term11039.getClass(), "canContainBlock", false);
        setBooleanField(term11039, term11039.getClass(), "canContainInline", false);
        setBooleanField(term11039, term11039.getClass(), "empty", false);
        setBooleanField(term11039, term11039.getClass(), "selfClosing", true);
        setBooleanField(term11039, term11039.getClass(), "preserveWhitespace", true);
        setBooleanField(term11039, term11039.getClass(), "formList", false);
        setBooleanField(term11039, term11039.getClass(), "formSubmit", true);
        setField(term11038, term11038.getClass(), "tag", term11039);
        setField(term11038, term11038.getClass(), "parentNode", null);
        setField(term11038, term11038.getClass(), "childNodes", term11042);
        setField(term11044, term11044.getClass(), "attributes", term11045);
        setField(term11038, term11038.getClass(), "attributes", term11044);
        setField(term11038, term11038.getClass(), "baseUri", "cAPeiZHKGJ");
        setIntField(term11038, term11038.getClass(), "siblingIndex", 597278769);
        ArrayList term10987 = new ArrayList();
        term10986 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term10986, term10986.getClass(), "list", term10987);
        setField(term10986, term10986.getClass(), "c", term10987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1140, args);
        assertTrue(recursiveEquals(term1140, term11038));
        assertTrue(recursiveEquals(retValue, term10986));
    }

};


