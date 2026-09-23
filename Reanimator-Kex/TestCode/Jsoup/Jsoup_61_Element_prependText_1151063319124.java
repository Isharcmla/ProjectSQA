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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependText_1151063319124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;

    public Element_prependText_1151063319124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2017 = new ArrayList();
        ((ArrayList) term2017).add((Object)null);
        ((ArrayList) term2017).add((Object)null);
        ((ArrayList) term2017).add((Object)null);
        ((ArrayList) term2017).add((Object)null);
        ((ArrayList) term2017).add((Object)null);
        ((ArrayList) term2017).add((Object)null);
        LinkedHashMap term2022 = new LinkedHashMap();
        term1995 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1996 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2021 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1996, term1996.getClass(), "tagName", "mvrkADEgpp");
        setBooleanField(term1996, term1996.getClass(), "isBlock", true);
        setBooleanField(term1996, term1996.getClass(), "formatAsBlock", false);
        setBooleanField(term1996, term1996.getClass(), "canContainInline", false);
        setBooleanField(term1996, term1996.getClass(), "empty", false);
        setBooleanField(term1996, term1996.getClass(), "selfClosing", false);
        setBooleanField(term1996, term1996.getClass(), "preserveWhitespace", true);
        setBooleanField(term1996, term1996.getClass(), "formList", true);
        setBooleanField(term1996, term1996.getClass(), "formSubmit", true);
        setField(term1995, term1995.getClass(), "tag", term1996);
        setField(term1995, term1995.getClass(), "parentNode", null);
        setField(term1995, term1995.getClass(), "childNodes", term2017);
        setField(term2021, term2021.getClass(), "attributes", term2022);
        setField(term1995, term1995.getClass(), "attributes", term2021);
        setField(term1995, term1995.getClass(), "baseUri", "UfQtPRyWRC");
        setIntField(term1995, term1995.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        try {
            callMethod(klass, "prependText", argTypes, term1995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


