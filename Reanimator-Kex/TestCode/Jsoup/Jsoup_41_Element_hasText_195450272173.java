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

public class Element_hasText_195450272173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6129;

    public Element_hasText_195450272173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6152 = new ArrayList();
        ((ArrayList) term6152).add((Object)null);
        LinkedHashMap term6157 = new LinkedHashMap();
        term6129 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6130 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6156 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6130, term6130.getClass(), "tagName", "WXcZEtUKlI");
        setBooleanField(term6130, term6130.getClass(), "isBlock", true);
        setBooleanField(term6130, term6130.getClass(), "formatAsBlock", false);
        setBooleanField(term6130, term6130.getClass(), "canContainBlock", true);
        setBooleanField(term6130, term6130.getClass(), "canContainInline", false);
        setBooleanField(term6130, term6130.getClass(), "empty", false);
        setBooleanField(term6130, term6130.getClass(), "selfClosing", false);
        setBooleanField(term6130, term6130.getClass(), "preserveWhitespace", true);
        setBooleanField(term6130, term6130.getClass(), "formList", false);
        setBooleanField(term6130, term6130.getClass(), "formSubmit", false);
        setField(term6129, term6129.getClass(), "tag", term6130);
        setField(term6129, term6129.getClass(), "parentNode", null);
        setField(term6129, term6129.getClass(), "childNodes", term6152);
        setField(term6156, term6156.getClass(), "attributes", term6157);
        setField(term6129, term6129.getClass(), "attributes", term6156);
        setField(term6129, term6129.getClass(), "baseUri", "gltJarNuUk");
        setIntField(term6129, term6129.getClass(), "siblingIndex", -1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term6129, args);
    }

};


