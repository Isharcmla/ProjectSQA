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

public class Element_ownText_35132743867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5649;

    public Element_ownText_35132743867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5672 = new ArrayList();
        ((ArrayList) term5672).add((Object)null);
        ((ArrayList) term5672).add((Object)null);
        ((ArrayList) term5672).add((Object)null);
        LinkedHashMap term5677 = new LinkedHashMap();
        term5649 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5650 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5676 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5650, term5650.getClass(), "tagName", "nKZKnxWYCK");
        setBooleanField(term5650, term5650.getClass(), "isBlock", true);
        setBooleanField(term5650, term5650.getClass(), "formatAsBlock", false);
        setBooleanField(term5650, term5650.getClass(), "canContainBlock", true);
        setBooleanField(term5650, term5650.getClass(), "canContainInline", false);
        setBooleanField(term5650, term5650.getClass(), "empty", true);
        setBooleanField(term5650, term5650.getClass(), "selfClosing", true);
        setBooleanField(term5650, term5650.getClass(), "preserveWhitespace", false);
        setBooleanField(term5650, term5650.getClass(), "formList", false);
        setBooleanField(term5650, term5650.getClass(), "formSubmit", false);
        setField(term5649, term5649.getClass(), "tag", term5650);
        setField(term5649, term5649.getClass(), "parentNode", null);
        setField(term5649, term5649.getClass(), "childNodes", term5672);
        setField(term5676, term5676.getClass(), "attributes", term5677);
        setField(term5649, term5649.getClass(), "attributes", term5676);
        setField(term5649, term5649.getClass(), "baseUri", "pFAfANnxup");
        setIntField(term5649, term5649.getClass(), "siblingIndex", -25637976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term5649, args);
    }

};


