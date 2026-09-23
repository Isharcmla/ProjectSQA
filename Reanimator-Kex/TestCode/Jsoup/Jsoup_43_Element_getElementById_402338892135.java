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

public class Element_getElementById_402338892135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3236;
     Object term21570;

    public Element_getElementById_402338892135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3259 = new ArrayList();
        ((ArrayList) term3259).add((Object)null);
        LinkedHashMap term3264 = new LinkedHashMap();
        term3236 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3263 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3237, term3237.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term3237, term3237.getClass(), "isBlock", false);
        setBooleanField(term3237, term3237.getClass(), "formatAsBlock", false);
        setBooleanField(term3237, term3237.getClass(), "canContainBlock", false);
        setBooleanField(term3237, term3237.getClass(), "canContainInline", true);
        setBooleanField(term3237, term3237.getClass(), "empty", true);
        setBooleanField(term3237, term3237.getClass(), "selfClosing", false);
        setBooleanField(term3237, term3237.getClass(), "preserveWhitespace", false);
        setBooleanField(term3237, term3237.getClass(), "formList", false);
        setBooleanField(term3237, term3237.getClass(), "formSubmit", false);
        setField(term3236, term3236.getClass(), "tag", term3237);
        setField(term3236, term3236.getClass(), "parentNode", null);
        setField(term3236, term3236.getClass(), "childNodes", term3259);
        setField(term3263, term3263.getClass(), "attributes", term3264);
        setField(term3236, term3236.getClass(), "attributes", term3263);
        setField(term3236, term3236.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term3236, term3236.getClass(), "siblingIndex", -157887805);
        ArrayList term21574 = new ArrayList();
        ((ArrayList) term21574).add((Object)null);
        LinkedHashMap term21577 = new LinkedHashMap();
        term21570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21576 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21571, term21571.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term21571, term21571.getClass(), "isBlock", false);
        setBooleanField(term21571, term21571.getClass(), "formatAsBlock", false);
        setBooleanField(term21571, term21571.getClass(), "canContainBlock", false);
        setBooleanField(term21571, term21571.getClass(), "canContainInline", true);
        setBooleanField(term21571, term21571.getClass(), "empty", true);
        setBooleanField(term21571, term21571.getClass(), "selfClosing", false);
        setBooleanField(term21571, term21571.getClass(), "preserveWhitespace", false);
        setBooleanField(term21571, term21571.getClass(), "formList", false);
        setBooleanField(term21571, term21571.getClass(), "formSubmit", false);
        setField(term21570, term21570.getClass(), "tag", term21571);
        setField(term21570, term21570.getClass(), "parentNode", null);
        setField(term21570, term21570.getClass(), "childNodes", term21574);
        setField(term21576, term21576.getClass(), "attributes", term21577);
        setField(term21570, term21570.getClass(), "attributes", term21576);
        setField(term21570, term21570.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term21570, term21570.getClass(), "siblingIndex", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3236, args);
        assertTrue(recursiveEquals(term3236, term21570));
        assertTrue(recursiveEquals(retValue, null));
    }

};


