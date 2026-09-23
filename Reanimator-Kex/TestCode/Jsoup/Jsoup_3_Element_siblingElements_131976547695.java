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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_siblingElements_131976547695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;

    public Element_siblingElements_131976547695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2812 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2812, term2812.getClass(), "tagName", null);
        setBooleanField(term2812, term2812.getClass(), "isBlock", true);
        setBooleanField(term2812, term2812.getClass(), "canContainBlock", false);
        setBooleanField(term2812, term2812.getClass(), "canContainInline", true);
        setBooleanField(term2812, term2812.getClass(), "optionalClosing", false);
        setBooleanField(term2812, term2812.getClass(), "empty", false);
        setBooleanField(term2812, term2812.getClass(), "preserveWhitespace", true);
        setField(term2812, term2812.getClass(), "ancestors", null);
        Object term2819 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2819, term2819.getClass(), "tagName", null);
        setBooleanField(term2819, term2819.getClass(), "isBlock", true);
        setBooleanField(term2819, term2819.getClass(), "canContainBlock", false);
        setBooleanField(term2819, term2819.getClass(), "canContainInline", false);
        setBooleanField(term2819, term2819.getClass(), "optionalClosing", true);
        setBooleanField(term2819, term2819.getClass(), "empty", true);
        setBooleanField(term2819, term2819.getClass(), "preserveWhitespace", false);
        setField(term2819, term2819.getClass(), "ancestors", null);
        Object term2826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2826, term2826.getClass(), "tagName", null);
        setBooleanField(term2826, term2826.getClass(), "isBlock", true);
        setBooleanField(term2826, term2826.getClass(), "canContainBlock", true);
        setBooleanField(term2826, term2826.getClass(), "canContainInline", true);
        setBooleanField(term2826, term2826.getClass(), "optionalClosing", false);
        setBooleanField(term2826, term2826.getClass(), "empty", true);
        setBooleanField(term2826, term2826.getClass(), "preserveWhitespace", true);
        setField(term2826, term2826.getClass(), "ancestors", null);
        Object term2833 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2833, term2833.getClass(), "tagName", null);
        setBooleanField(term2833, term2833.getClass(), "isBlock", true);
        setBooleanField(term2833, term2833.getClass(), "canContainBlock", true);
        setBooleanField(term2833, term2833.getClass(), "canContainInline", false);
        setBooleanField(term2833, term2833.getClass(), "optionalClosing", true);
        setBooleanField(term2833, term2833.getClass(), "empty", false);
        setBooleanField(term2833, term2833.getClass(), "preserveWhitespace", true);
        setField(term2833, term2833.getClass(), "ancestors", null);
        ArrayList term2810 = new ArrayList();
        ((ArrayList) term2810).add(term2812);
        ((ArrayList) term2810).add(term2819);
        ((ArrayList) term2810).add(term2826);
        ((ArrayList) term2810).add(term2833);
        ((ArrayList) term2810).add(term2812);
        HashMap term2843 = new HashMap();
        Set<Object> term44475 =  ((Map) term2843).keySet();
        HashSet term2842 = new HashSet((Collection<? extends Object>) term44475);
        ArrayList term2855 = new ArrayList();
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        ((ArrayList) term2855).add((Object)null);
        LinkedHashMap term2860 = new LinkedHashMap();
        term2790 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2791 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2859 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2791, term2791.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term2791, term2791.getClass(), "isBlock", true);
        setBooleanField(term2791, term2791.getClass(), "canContainBlock", true);
        setBooleanField(term2791, term2791.getClass(), "canContainInline", true);
        setBooleanField(term2791, term2791.getClass(), "optionalClosing", false);
        setBooleanField(term2791, term2791.getClass(), "empty", true);
        setBooleanField(term2791, term2791.getClass(), "preserveWhitespace", false);
        setField(term2791, term2791.getClass(), "ancestors", term2810);
        setField(term2790, term2790.getClass(), "tag", term2791);
        setField(term2790, term2790.getClass(), "classNames", term2842);
        setField(term2790, term2790.getClass(), "parentNode", null);
        setField(term2790, term2790.getClass(), "childNodes", term2855);
        setField(term2859, term2859.getClass(), "attributes", term2860);
        setField(term2790, term2790.getClass(), "attributes", term2859);
        setField(term2790, term2790.getClass(), "baseUri", "zLMTXDQHYH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "siblingElements", argTypes, term2790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


