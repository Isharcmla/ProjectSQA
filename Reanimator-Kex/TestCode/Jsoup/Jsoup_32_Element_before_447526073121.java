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

public class Element_before_447526073121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2444;

    public Element_before_447526073121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2466 = new HashMap();
        Set<Object> term18360 =  ((Map) term2466).keySet();
        HashSet term2465 = new HashSet((Collection<? extends Object>) term18360);
        ArrayList term2474 = new ArrayList();
        ((ArrayList) term2474).add((Object)null);
        ((ArrayList) term2474).add((Object)null);
        ((ArrayList) term2474).add((Object)null);
        ((ArrayList) term2474).add((Object)null);
        ((ArrayList) term2474).add((Object)null);
        LinkedHashMap term2479 = new LinkedHashMap();
        term2444 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2445 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2478 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2445, term2445.getClass(), "tagName", "BwtdjiefJn");
        setBooleanField(term2445, term2445.getClass(), "isBlock", false);
        setBooleanField(term2445, term2445.getClass(), "formatAsBlock", true);
        setBooleanField(term2445, term2445.getClass(), "canContainBlock", false);
        setBooleanField(term2445, term2445.getClass(), "canContainInline", true);
        setBooleanField(term2445, term2445.getClass(), "empty", true);
        setBooleanField(term2445, term2445.getClass(), "selfClosing", false);
        setBooleanField(term2445, term2445.getClass(), "preserveWhitespace", true);
        setField(term2444, term2444.getClass(), "tag", term2445);
        setField(term2444, term2444.getClass(), "classNames", term2465);
        setField(term2444, term2444.getClass(), "parentNode", null);
        setField(term2444, term2444.getClass(), "childNodes", term2474);
        setField(term2478, term2478.getClass(), "attributes", term2479);
        setField(term2444, term2444.getClass(), "attributes", term2478);
        setField(term2444, term2444.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term2444, term2444.getClass(), "siblingIndex", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "before", argTypes, term2444, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


