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

public class Element_tagName_576940543101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term9316;
     Object term9270;

    public Element_tagName_576940543101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318 = new ArrayList();
        ((ArrayList) term318).add((Object)null);
        ((ArrayList) term318).add((Object)null);
        ((ArrayList) term318).add((Object)null);
        LinkedHashMap term323 = new LinkedHashMap();
        term296 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term297 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term322 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term297, term297.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term297, term297.getClass(), "isBlock", true);
        setBooleanField(term297, term297.getClass(), "formatAsBlock", true);
        setBooleanField(term297, term297.getClass(), "canContainInline", false);
        setBooleanField(term297, term297.getClass(), "empty", true);
        setBooleanField(term297, term297.getClass(), "selfClosing", true);
        setBooleanField(term297, term297.getClass(), "preserveWhitespace", true);
        setBooleanField(term297, term297.getClass(), "formList", true);
        setBooleanField(term297, term297.getClass(), "formSubmit", false);
        setField(term296, term296.getClass(), "tag", term297);
        setField(term296, term296.getClass(), "parentNode", null);
        setField(term296, term296.getClass(), "childNodes", term318);
        setField(term322, term322.getClass(), "attributes", term323);
        setField(term296, term296.getClass(), "attributes", term322);
        setField(term296, term296.getClass(), "baseUri", "xOEqzGAmDU");
        setIntField(term296, term296.getClass(), "siblingIndex", 1484323161);
        ArrayList term9320 = new ArrayList();
        ((ArrayList) term9320).add((Object)null);
        ((ArrayList) term9320).add((Object)null);
        ((ArrayList) term9320).add((Object)null);
        LinkedHashMap term9323 = new LinkedHashMap();
        term9316 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9317 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9322 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9317, term9317.getClass(), "tagName", "eZFUvlxvGV");
        setBooleanField(term9317, term9317.getClass(), "isBlock", false);
        setBooleanField(term9317, term9317.getClass(), "formatAsBlock", true);
        setBooleanField(term9317, term9317.getClass(), "canContainInline", true);
        setBooleanField(term9317, term9317.getClass(), "empty", false);
        setBooleanField(term9317, term9317.getClass(), "selfClosing", false);
        setBooleanField(term9317, term9317.getClass(), "preserveWhitespace", false);
        setBooleanField(term9317, term9317.getClass(), "formList", false);
        setBooleanField(term9317, term9317.getClass(), "formSubmit", false);
        setField(term9316, term9316.getClass(), "tag", term9317);
        setField(term9316, term9316.getClass(), "parentNode", null);
        setField(term9316, term9316.getClass(), "childNodes", term9320);
        setField(term9322, term9322.getClass(), "attributes", term9323);
        setField(term9316, term9316.getClass(), "attributes", term9322);
        setField(term9316, term9316.getClass(), "baseUri", "xOEqzGAmDU");
        setIntField(term9316, term9316.getClass(), "siblingIndex", 1484323161);
        ArrayList term9292 = new ArrayList();
        ((ArrayList) term9292).add((Object)null);
        ((ArrayList) term9292).add((Object)null);
        ((ArrayList) term9292).add((Object)null);
        LinkedHashMap term9297 = new LinkedHashMap();
        term9270 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9271 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9296 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9271, term9271.getClass(), "tagName", "eZFUvlxvGV");
        setBooleanField(term9271, term9271.getClass(), "isBlock", false);
        setBooleanField(term9271, term9271.getClass(), "formatAsBlock", true);
        setBooleanField(term9271, term9271.getClass(), "canContainInline", true);
        setBooleanField(term9271, term9271.getClass(), "empty", false);
        setBooleanField(term9271, term9271.getClass(), "selfClosing", false);
        setBooleanField(term9271, term9271.getClass(), "preserveWhitespace", false);
        setBooleanField(term9271, term9271.getClass(), "formList", false);
        setBooleanField(term9271, term9271.getClass(), "formSubmit", false);
        setField(term9270, term9270.getClass(), "tag", term9271);
        setField(term9270, term9270.getClass(), "parentNode", null);
        setField(term9270, term9270.getClass(), "childNodes", term9292);
        setField(term9296, term9296.getClass(), "attributes", term9297);
        setField(term9270, term9270.getClass(), "attributes", term9296);
        setField(term9270, term9270.getClass(), "baseUri", "xOEqzGAmDU");
        setIntField(term9270, term9270.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        Object retValue = callMethod(klass, "tagName", argTypes, term296, args);
        assertTrue(recursiveEquals(term296, term9316));
        assertTrue(recursiveEquals(retValue, term9270));
    }

};


