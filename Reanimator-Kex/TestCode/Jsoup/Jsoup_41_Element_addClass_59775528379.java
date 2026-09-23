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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_addClass_59775528379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6590;

    public Element_addClass_59775528379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6613 = new ArrayList();
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        ((ArrayList) term6613).add((Object)null);
        LinkedHashMap term6618 = new LinkedHashMap();
        term6590 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6617 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6591, term6591.getClass(), "tagName", "qYtAeLzOhW");
        setBooleanField(term6591, term6591.getClass(), "isBlock", true);
        setBooleanField(term6591, term6591.getClass(), "formatAsBlock", true);
        setBooleanField(term6591, term6591.getClass(), "canContainBlock", false);
        setBooleanField(term6591, term6591.getClass(), "canContainInline", false);
        setBooleanField(term6591, term6591.getClass(), "empty", true);
        setBooleanField(term6591, term6591.getClass(), "selfClosing", true);
        setBooleanField(term6591, term6591.getClass(), "preserveWhitespace", true);
        setBooleanField(term6591, term6591.getClass(), "formList", false);
        setBooleanField(term6591, term6591.getClass(), "formSubmit", true);
        setField(term6590, term6590.getClass(), "tag", term6591);
        setField(term6590, term6590.getClass(), "parentNode", null);
        setField(term6590, term6590.getClass(), "childNodes", term6613);
        setField(term6617, term6617.getClass(), "attributes", term6618);
        setField(term6590, term6590.getClass(), "attributes", term6617);
        setField(term6590, term6590.getClass(), "baseUri", "IpmgwHTgnG");
        setIntField(term6590, term6590.getClass(), "siblingIndex", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tIpkeYIezR";
        callMethod(klass, "addClass", argTypes, term6590, args);
    }

};


