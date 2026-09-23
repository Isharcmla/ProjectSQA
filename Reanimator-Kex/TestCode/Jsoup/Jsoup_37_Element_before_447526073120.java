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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_before_447526073120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2496;

    public Element_before_447526073120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2520 = new HashMap();
        Set<Object> term18328 =  ((Map) term2520).keySet();
        HashSet term2519 = new HashSet((Collection<? extends Object>) term18328);
        ArrayList term2528 = new ArrayList();
        ((ArrayList) term2528).add((Object)null);
        ((ArrayList) term2528).add((Object)null);
        ((ArrayList) term2528).add((Object)null);
        ((ArrayList) term2528).add((Object)null);
        ((ArrayList) term2528).add((Object)null);
        LinkedHashMap term2533 = new LinkedHashMap();
        term2496 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2497 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2532 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2497, term2497.getClass(), "tagName", "BwtdjiefJn");
        setBooleanField(term2497, term2497.getClass(), "isBlock", false);
        setBooleanField(term2497, term2497.getClass(), "formatAsBlock", false);
        setBooleanField(term2497, term2497.getClass(), "canContainBlock", true);
        setBooleanField(term2497, term2497.getClass(), "canContainInline", true);
        setBooleanField(term2497, term2497.getClass(), "empty", true);
        setBooleanField(term2497, term2497.getClass(), "selfClosing", false);
        setBooleanField(term2497, term2497.getClass(), "preserveWhitespace", true);
        setBooleanField(term2497, term2497.getClass(), "formList", false);
        setBooleanField(term2497, term2497.getClass(), "formSubmit", true);
        setField(term2496, term2496.getClass(), "tag", term2497);
        setField(term2496, term2496.getClass(), "classNames", term2519);
        setField(term2496, term2496.getClass(), "parentNode", null);
        setField(term2496, term2496.getClass(), "childNodes", term2528);
        setField(term2532, term2532.getClass(), "attributes", term2533);
        setField(term2496, term2496.getClass(), "attributes", term2532);
        setField(term2496, term2496.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term2496, term2496.getClass(), "siblingIndex", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "before", argTypes, term2496, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


