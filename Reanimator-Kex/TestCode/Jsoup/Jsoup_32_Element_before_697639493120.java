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

public class Element_before_697639493120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2338;

    public Element_before_697639493120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2360 = new HashMap();
        Set<Object> term18020 =  ((Map) term2360).keySet();
        HashSet term2359 = new HashSet((Collection<? extends Object>) term18020);
        ArrayList term2372 = new ArrayList();
        ((ArrayList) term2372).add((Object)null);
        ((ArrayList) term2372).add((Object)null);
        ((ArrayList) term2372).add((Object)null);
        ((ArrayList) term2372).add((Object)null);
        LinkedHashMap term2377 = new LinkedHashMap();
        term2338 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2339 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2376 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2339, term2339.getClass(), "tagName", "sNQFlATEeQ");
        setBooleanField(term2339, term2339.getClass(), "isBlock", false);
        setBooleanField(term2339, term2339.getClass(), "formatAsBlock", false);
        setBooleanField(term2339, term2339.getClass(), "canContainBlock", false);
        setBooleanField(term2339, term2339.getClass(), "canContainInline", false);
        setBooleanField(term2339, term2339.getClass(), "empty", true);
        setBooleanField(term2339, term2339.getClass(), "selfClosing", true);
        setBooleanField(term2339, term2339.getClass(), "preserveWhitespace", true);
        setField(term2338, term2338.getClass(), "tag", term2339);
        setField(term2338, term2338.getClass(), "classNames", term2359);
        setField(term2338, term2338.getClass(), "parentNode", null);
        setField(term2338, term2338.getClass(), "childNodes", term2372);
        setField(term2376, term2376.getClass(), "attributes", term2377);
        setField(term2338, term2338.getClass(), "attributes", term2376);
        setField(term2338, term2338.getClass(), "baseUri", "SOrEHbcbmn");
        setIntField(term2338, term2338.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        try {
            callMethod(klass, "before", argTypes, term2338, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


