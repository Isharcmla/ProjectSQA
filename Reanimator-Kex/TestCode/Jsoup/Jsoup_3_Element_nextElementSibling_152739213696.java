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

public class Element_nextElementSibling_152739213696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2899;

    public Element_nextElementSibling_152739213696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2921 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2921, term2921.getClass(), "tagName", null);
        setBooleanField(term2921, term2921.getClass(), "isBlock", true);
        setBooleanField(term2921, term2921.getClass(), "canContainBlock", false);
        setBooleanField(term2921, term2921.getClass(), "canContainInline", true);
        setBooleanField(term2921, term2921.getClass(), "optionalClosing", true);
        setBooleanField(term2921, term2921.getClass(), "empty", false);
        setBooleanField(term2921, term2921.getClass(), "preserveWhitespace", false);
        setField(term2921, term2921.getClass(), "ancestors", null);
        Object term2928 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2928, term2928.getClass(), "tagName", null);
        setBooleanField(term2928, term2928.getClass(), "isBlock", false);
        setBooleanField(term2928, term2928.getClass(), "canContainBlock", true);
        setBooleanField(term2928, term2928.getClass(), "canContainInline", false);
        setBooleanField(term2928, term2928.getClass(), "optionalClosing", false);
        setBooleanField(term2928, term2928.getClass(), "empty", true);
        setBooleanField(term2928, term2928.getClass(), "preserveWhitespace", true);
        setField(term2928, term2928.getClass(), "ancestors", null);
        Object term2935 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2935, term2935.getClass(), "tagName", null);
        setBooleanField(term2935, term2935.getClass(), "isBlock", true);
        setBooleanField(term2935, term2935.getClass(), "canContainBlock", false);
        setBooleanField(term2935, term2935.getClass(), "canContainInline", false);
        setBooleanField(term2935, term2935.getClass(), "optionalClosing", true);
        setBooleanField(term2935, term2935.getClass(), "empty", true);
        setBooleanField(term2935, term2935.getClass(), "preserveWhitespace", false);
        setField(term2935, term2935.getClass(), "ancestors", null);
        Object term2942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2942, term2942.getClass(), "tagName", null);
        setBooleanField(term2942, term2942.getClass(), "isBlock", false);
        setBooleanField(term2942, term2942.getClass(), "canContainBlock", true);
        setBooleanField(term2942, term2942.getClass(), "canContainInline", false);
        setBooleanField(term2942, term2942.getClass(), "optionalClosing", false);
        setBooleanField(term2942, term2942.getClass(), "empty", false);
        setBooleanField(term2942, term2942.getClass(), "preserveWhitespace", false);
        setField(term2942, term2942.getClass(), "ancestors", null);
        Object term2949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2949, term2949.getClass(), "tagName", null);
        setBooleanField(term2949, term2949.getClass(), "isBlock", false);
        setBooleanField(term2949, term2949.getClass(), "canContainBlock", false);
        setBooleanField(term2949, term2949.getClass(), "canContainInline", true);
        setBooleanField(term2949, term2949.getClass(), "optionalClosing", false);
        setBooleanField(term2949, term2949.getClass(), "empty", false);
        setBooleanField(term2949, term2949.getClass(), "preserveWhitespace", false);
        setField(term2949, term2949.getClass(), "ancestors", null);
        ArrayList term2919 = new ArrayList();
        ((ArrayList) term2919).add(term2921);
        ((ArrayList) term2919).add(term2928);
        ((ArrayList) term2919).add(term2935);
        ((ArrayList) term2919).add(term2942);
        ((ArrayList) term2919).add(term2942);
        ((ArrayList) term2919).add(term2949);
        HashMap term2959 = new HashMap();
        Set<Object> term44872 =  ((Map) term2959).keySet();
        HashSet term2958 = new HashSet((Collection<? extends Object>) term44872);
        ArrayList term2975 = new ArrayList();
        ((ArrayList) term2975).add((Object)null);
        ((ArrayList) term2975).add((Object)null);
        ((ArrayList) term2975).add((Object)null);
        ((ArrayList) term2975).add((Object)null);
        LinkedHashMap term2980 = new LinkedHashMap();
        term2899 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2900 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2979 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2900, term2900.getClass(), "tagName", "PqywFWJlpE");
        setBooleanField(term2900, term2900.getClass(), "isBlock", false);
        setBooleanField(term2900, term2900.getClass(), "canContainBlock", false);
        setBooleanField(term2900, term2900.getClass(), "canContainInline", false);
        setBooleanField(term2900, term2900.getClass(), "optionalClosing", true);
        setBooleanField(term2900, term2900.getClass(), "empty", false);
        setBooleanField(term2900, term2900.getClass(), "preserveWhitespace", false);
        setField(term2900, term2900.getClass(), "ancestors", term2919);
        setField(term2899, term2899.getClass(), "tag", term2900);
        setField(term2899, term2899.getClass(), "classNames", term2958);
        setField(term2899, term2899.getClass(), "parentNode", null);
        setField(term2899, term2899.getClass(), "childNodes", term2975);
        setField(term2979, term2979.getClass(), "attributes", term2980);
        setField(term2899, term2899.getClass(), "attributes", term2979);
        setField(term2899, term2899.getClass(), "baseUri", "vSeruUyNWX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextElementSibling", argTypes, term2899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


