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
import java.lang.Integer;

public class Element_elementSiblingIndex_1190944464131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2876;
     Object term20114;
     Object term20112;

    public Element_elementSiblingIndex_1190944464131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2899 = new ArrayList();
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        LinkedHashMap term2904 = new LinkedHashMap();
        term2876 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2877 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2903 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2877, term2877.getClass(), "tagName", "iikZEapDlu");
        setBooleanField(term2877, term2877.getClass(), "isBlock", false);
        setBooleanField(term2877, term2877.getClass(), "formatAsBlock", true);
        setBooleanField(term2877, term2877.getClass(), "canContainBlock", true);
        setBooleanField(term2877, term2877.getClass(), "canContainInline", false);
        setBooleanField(term2877, term2877.getClass(), "empty", true);
        setBooleanField(term2877, term2877.getClass(), "selfClosing", true);
        setBooleanField(term2877, term2877.getClass(), "preserveWhitespace", true);
        setBooleanField(term2877, term2877.getClass(), "formList", false);
        setBooleanField(term2877, term2877.getClass(), "formSubmit", true);
        setField(term2876, term2876.getClass(), "tag", term2877);
        setField(term2876, term2876.getClass(), "parentNode", null);
        setField(term2876, term2876.getClass(), "childNodes", term2899);
        setField(term2903, term2903.getClass(), "attributes", term2904);
        setField(term2876, term2876.getClass(), "attributes", term2903);
        setField(term2876, term2876.getClass(), "baseUri", "BjugTaMcxJ");
        setIntField(term2876, term2876.getClass(), "siblingIndex", -1145578966);
        ArrayList term20118 = new ArrayList();
        ((ArrayList) term20118).add((Object)null);
        ((ArrayList) term20118).add((Object)null);
        ((ArrayList) term20118).add((Object)null);
        ((ArrayList) term20118).add((Object)null);
        ((ArrayList) term20118).add((Object)null);
        LinkedHashMap term20121 = new LinkedHashMap();
        term20114 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20115 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20120 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20115, term20115.getClass(), "tagName", "iikZEapDlu");
        setBooleanField(term20115, term20115.getClass(), "isBlock", false);
        setBooleanField(term20115, term20115.getClass(), "formatAsBlock", true);
        setBooleanField(term20115, term20115.getClass(), "canContainBlock", true);
        setBooleanField(term20115, term20115.getClass(), "canContainInline", false);
        setBooleanField(term20115, term20115.getClass(), "empty", true);
        setBooleanField(term20115, term20115.getClass(), "selfClosing", true);
        setBooleanField(term20115, term20115.getClass(), "preserveWhitespace", true);
        setBooleanField(term20115, term20115.getClass(), "formList", false);
        setBooleanField(term20115, term20115.getClass(), "formSubmit", true);
        setField(term20114, term20114.getClass(), "tag", term20115);
        setField(term20114, term20114.getClass(), "parentNode", null);
        setField(term20114, term20114.getClass(), "childNodes", term20118);
        setField(term20120, term20120.getClass(), "attributes", term20121);
        setField(term20114, term20114.getClass(), "attributes", term20120);
        setField(term20114, term20114.getClass(), "baseUri", "BjugTaMcxJ");
        setIntField(term20114, term20114.getClass(), "siblingIndex", -1145578966);
        term20112 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elementSiblingIndex", argTypes, term2876, args);
        assertTrue(recursiveEquals(term2876, term20114));
        assertTrue(recursiveEquals(retValue, term20112));
    }

};


