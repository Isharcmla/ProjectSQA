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

public class Element_before_697639493120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2018;

    public Element_before_697639493120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2041 = new ArrayList();
        ((ArrayList) term2041).add((Object)null);
        ((ArrayList) term2041).add((Object)null);
        ((ArrayList) term2041).add((Object)null);
        ((ArrayList) term2041).add((Object)null);
        ((ArrayList) term2041).add((Object)null);
        ((ArrayList) term2041).add((Object)null);
        LinkedHashMap term2046 = new LinkedHashMap();
        term2018 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2019 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2045 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2019, term2019.getClass(), "tagName", "mvrkADEgpp");
        setBooleanField(term2019, term2019.getClass(), "isBlock", false);
        setBooleanField(term2019, term2019.getClass(), "formatAsBlock", true);
        setBooleanField(term2019, term2019.getClass(), "canContainBlock", false);
        setBooleanField(term2019, term2019.getClass(), "canContainInline", false);
        setBooleanField(term2019, term2019.getClass(), "empty", false);
        setBooleanField(term2019, term2019.getClass(), "selfClosing", false);
        setBooleanField(term2019, term2019.getClass(), "preserveWhitespace", false);
        setBooleanField(term2019, term2019.getClass(), "formList", false);
        setBooleanField(term2019, term2019.getClass(), "formSubmit", false);
        setField(term2018, term2018.getClass(), "tag", term2019);
        setField(term2018, term2018.getClass(), "parentNode", null);
        setField(term2018, term2018.getClass(), "childNodes", term2041);
        setField(term2045, term2045.getClass(), "attributes", term2046);
        setField(term2018, term2018.getClass(), "attributes", term2045);
        setField(term2018, term2018.getClass(), "baseUri", "UfQtPRyWRC");
        setIntField(term2018, term2018.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        try {
            callMethod(klass, "before", argTypes, term2018, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


