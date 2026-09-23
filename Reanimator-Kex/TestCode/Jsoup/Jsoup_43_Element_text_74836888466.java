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

public class Element_text_74836888466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5577;

    public Element_text_74836888466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5600 = new ArrayList();
        ((ArrayList) term5600).add((Object)null);
        ((ArrayList) term5600).add((Object)null);
        ((ArrayList) term5600).add((Object)null);
        ((ArrayList) term5600).add((Object)null);
        LinkedHashMap term5605 = new LinkedHashMap();
        term5577 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5578 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5578, term5578.getClass(), "tagName", "ITRRYiuDwH");
        setBooleanField(term5578, term5578.getClass(), "isBlock", true);
        setBooleanField(term5578, term5578.getClass(), "formatAsBlock", false);
        setBooleanField(term5578, term5578.getClass(), "canContainBlock", false);
        setBooleanField(term5578, term5578.getClass(), "canContainInline", true);
        setBooleanField(term5578, term5578.getClass(), "empty", false);
        setBooleanField(term5578, term5578.getClass(), "selfClosing", false);
        setBooleanField(term5578, term5578.getClass(), "preserveWhitespace", false);
        setBooleanField(term5578, term5578.getClass(), "formList", false);
        setBooleanField(term5578, term5578.getClass(), "formSubmit", false);
        setField(term5577, term5577.getClass(), "tag", term5578);
        setField(term5577, term5577.getClass(), "parentNode", null);
        setField(term5577, term5577.getClass(), "childNodes", term5600);
        setField(term5604, term5604.getClass(), "attributes", term5605);
        setField(term5577, term5577.getClass(), "attributes", term5604);
        setField(term5577, term5577.getClass(), "baseUri", "eOJfbiZLnb");
        setIntField(term5577, term5577.getClass(), "siblingIndex", 9726679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term5577, args);
    }

};


