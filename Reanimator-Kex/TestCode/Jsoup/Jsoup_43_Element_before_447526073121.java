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

public class Element_before_447526073121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;

    public Element_before_447526073121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2135 = new ArrayList();
        ((ArrayList) term2135).add((Object)null);
        ((ArrayList) term2135).add((Object)null);
        ((ArrayList) term2135).add((Object)null);
        ((ArrayList) term2135).add((Object)null);
        ((ArrayList) term2135).add((Object)null);
        LinkedHashMap term2140 = new LinkedHashMap();
        term2112 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2139 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2113, term2113.getClass(), "tagName", "WHcwFgsGFC");
        setBooleanField(term2113, term2113.getClass(), "isBlock", false);
        setBooleanField(term2113, term2113.getClass(), "formatAsBlock", false);
        setBooleanField(term2113, term2113.getClass(), "canContainBlock", true);
        setBooleanField(term2113, term2113.getClass(), "canContainInline", true);
        setBooleanField(term2113, term2113.getClass(), "empty", true);
        setBooleanField(term2113, term2113.getClass(), "selfClosing", false);
        setBooleanField(term2113, term2113.getClass(), "preserveWhitespace", true);
        setBooleanField(term2113, term2113.getClass(), "formList", false);
        setBooleanField(term2113, term2113.getClass(), "formSubmit", true);
        setField(term2112, term2112.getClass(), "tag", term2113);
        setField(term2112, term2112.getClass(), "parentNode", null);
        setField(term2112, term2112.getClass(), "childNodes", term2135);
        setField(term2139, term2139.getClass(), "attributes", term2140);
        setField(term2112, term2112.getClass(), "attributes", term2139);
        setField(term2112, term2112.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term2112, term2112.getClass(), "siblingIndex", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "before", argTypes, term2112, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


