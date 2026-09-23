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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_before_697639493127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2274;

    public Element_before_697639493127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2296 = new ArrayList();
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        ((ArrayList) term2296).add((Object)null);
        LinkedHashMap term2301 = new LinkedHashMap();
        term2274 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2275 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2275, term2275.getClass(), "tagName", "VeDtgDzGAN");
        setBooleanField(term2275, term2275.getClass(), "isBlock", true);
        setBooleanField(term2275, term2275.getClass(), "formatAsBlock", false);
        setBooleanField(term2275, term2275.getClass(), "canContainInline", false);
        setBooleanField(term2275, term2275.getClass(), "empty", true);
        setBooleanField(term2275, term2275.getClass(), "selfClosing", false);
        setBooleanField(term2275, term2275.getClass(), "preserveWhitespace", false);
        setBooleanField(term2275, term2275.getClass(), "formList", false);
        setBooleanField(term2275, term2275.getClass(), "formSubmit", false);
        setField(term2274, term2274.getClass(), "tag", term2275);
        setField(term2274, term2274.getClass(), "parentNode", null);
        setField(term2274, term2274.getClass(), "childNodes", term2296);
        setField(term2300, term2300.getClass(), "attributes", term2301);
        setField(term2274, term2274.getClass(), "attributes", term2300);
        setField(term2274, term2274.getClass(), "baseUri", "WzFopsaDuG");
        setIntField(term2274, term2274.getClass(), "siblingIndex", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        try {
            callMethod(klass, "before", argTypes, term2274, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


