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

public class Element_after_1304948324123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;

    public Element_after_1304948324123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2301 = new ArrayList();
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        ((ArrayList) term2301).add((Object)null);
        LinkedHashMap term2306 = new LinkedHashMap();
        term2278 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2279 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2305 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2279, term2279.getClass(), "tagName", "hMmaoREuCK");
        setBooleanField(term2279, term2279.getClass(), "isBlock", false);
        setBooleanField(term2279, term2279.getClass(), "formatAsBlock", true);
        setBooleanField(term2279, term2279.getClass(), "canContainBlock", true);
        setBooleanField(term2279, term2279.getClass(), "canContainInline", false);
        setBooleanField(term2279, term2279.getClass(), "empty", false);
        setBooleanField(term2279, term2279.getClass(), "selfClosing", false);
        setBooleanField(term2279, term2279.getClass(), "preserveWhitespace", false);
        setBooleanField(term2279, term2279.getClass(), "formList", false);
        setBooleanField(term2279, term2279.getClass(), "formSubmit", false);
        setField(term2278, term2278.getClass(), "tag", term2279);
        setField(term2278, term2278.getClass(), "parentNode", null);
        setField(term2278, term2278.getClass(), "childNodes", term2301);
        setField(term2305, term2305.getClass(), "attributes", term2306);
        setField(term2278, term2278.getClass(), "attributes", term2305);
        setField(term2278, term2278.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term2278, term2278.getClass(), "siblingIndex", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "after", argTypes, term2278, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


