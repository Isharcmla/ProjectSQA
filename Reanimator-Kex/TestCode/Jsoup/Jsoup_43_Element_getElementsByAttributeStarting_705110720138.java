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

public class Element_getElementsByAttributeStarting_705110720138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;
     Object term23012;
     Object term23008;

    public Element_getElementsByAttributeStarting_705110720138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3541 = new ArrayList();
        ((ArrayList) term3541).add((Object)null);
        ((ArrayList) term3541).add((Object)null);
        ((ArrayList) term3541).add((Object)null);
        ((ArrayList) term3541).add((Object)null);
        LinkedHashMap term3546 = new LinkedHashMap();
        term3518 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3519 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3545 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3519, term3519.getClass(), "tagName", "rYbtIDVdnd");
        setBooleanField(term3519, term3519.getClass(), "isBlock", false);
        setBooleanField(term3519, term3519.getClass(), "formatAsBlock", true);
        setBooleanField(term3519, term3519.getClass(), "canContainBlock", false);
        setBooleanField(term3519, term3519.getClass(), "canContainInline", true);
        setBooleanField(term3519, term3519.getClass(), "empty", true);
        setBooleanField(term3519, term3519.getClass(), "selfClosing", false);
        setBooleanField(term3519, term3519.getClass(), "preserveWhitespace", false);
        setBooleanField(term3519, term3519.getClass(), "formList", true);
        setBooleanField(term3519, term3519.getClass(), "formSubmit", false);
        setField(term3518, term3518.getClass(), "tag", term3519);
        setField(term3518, term3518.getClass(), "parentNode", null);
        setField(term3518, term3518.getClass(), "childNodes", term3541);
        setField(term3545, term3545.getClass(), "attributes", term3546);
        setField(term3518, term3518.getClass(), "attributes", term3545);
        setField(term3518, term3518.getClass(), "baseUri", "vOuMEpOQAg");
        setIntField(term3518, term3518.getClass(), "siblingIndex", -1016503459);
        ArrayList term23016 = new ArrayList();
        ((ArrayList) term23016).add((Object)null);
        ((ArrayList) term23016).add((Object)null);
        ((ArrayList) term23016).add((Object)null);
        ((ArrayList) term23016).add((Object)null);
        LinkedHashMap term23019 = new LinkedHashMap();
        term23012 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23013 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23018 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23013, term23013.getClass(), "tagName", "rYbtIDVdnd");
        setBooleanField(term23013, term23013.getClass(), "isBlock", false);
        setBooleanField(term23013, term23013.getClass(), "formatAsBlock", true);
        setBooleanField(term23013, term23013.getClass(), "canContainBlock", false);
        setBooleanField(term23013, term23013.getClass(), "canContainInline", true);
        setBooleanField(term23013, term23013.getClass(), "empty", true);
        setBooleanField(term23013, term23013.getClass(), "selfClosing", false);
        setBooleanField(term23013, term23013.getClass(), "preserveWhitespace", false);
        setBooleanField(term23013, term23013.getClass(), "formList", true);
        setBooleanField(term23013, term23013.getClass(), "formSubmit", false);
        setField(term23012, term23012.getClass(), "tag", term23013);
        setField(term23012, term23012.getClass(), "parentNode", null);
        setField(term23012, term23012.getClass(), "childNodes", term23016);
        setField(term23018, term23018.getClass(), "attributes", term23019);
        setField(term23012, term23012.getClass(), "attributes", term23018);
        setField(term23012, term23012.getClass(), "baseUri", "vOuMEpOQAg");
        setIntField(term23012, term23012.getClass(), "siblingIndex", -1016503459);
        term23008 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term23009 = (Object[]) newArray("java.lang.Object", 0);
        setField(term23008, term23008.getClass(), "elementData", term23009);
        setIntField(term23008, term23008.getClass(), "size", 0);
        setIntField(term23008, term23008.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SIODFGaQhr";
        Object retValue = callMethod(klass, "getElementsByAttributeStarting", argTypes, term3518, args);
        assertTrue(recursiveEquals(term3518, term23012));
        assertTrue(recursiveEquals(retValue, term23008));
    }

};


