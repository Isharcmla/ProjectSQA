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

public class Element_before_697639493119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2388;

    public Element_before_697639493119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2412 = new HashMap();
        Set<Object> term17988 =  ((Map) term2412).keySet();
        HashSet term2411 = new HashSet((Collection<? extends Object>) term17988);
        ArrayList term2424 = new ArrayList();
        ((ArrayList) term2424).add((Object)null);
        ((ArrayList) term2424).add((Object)null);
        ((ArrayList) term2424).add((Object)null);
        ((ArrayList) term2424).add((Object)null);
        LinkedHashMap term2429 = new LinkedHashMap();
        term2388 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2389 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2428 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2389, term2389.getClass(), "tagName", "sNQFlATEeQ");
        setBooleanField(term2389, term2389.getClass(), "isBlock", false);
        setBooleanField(term2389, term2389.getClass(), "formatAsBlock", true);
        setBooleanField(term2389, term2389.getClass(), "canContainBlock", false);
        setBooleanField(term2389, term2389.getClass(), "canContainInline", false);
        setBooleanField(term2389, term2389.getClass(), "empty", false);
        setBooleanField(term2389, term2389.getClass(), "selfClosing", false);
        setBooleanField(term2389, term2389.getClass(), "preserveWhitespace", false);
        setBooleanField(term2389, term2389.getClass(), "formList", false);
        setBooleanField(term2389, term2389.getClass(), "formSubmit", false);
        setField(term2388, term2388.getClass(), "tag", term2389);
        setField(term2388, term2388.getClass(), "classNames", term2411);
        setField(term2388, term2388.getClass(), "parentNode", null);
        setField(term2388, term2388.getClass(), "childNodes", term2424);
        setField(term2428, term2428.getClass(), "attributes", term2429);
        setField(term2388, term2388.getClass(), "attributes", term2428);
        setField(term2388, term2388.getClass(), "baseUri", "SOrEHbcbmn");
        setIntField(term2388, term2388.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        try {
            callMethod(klass, "before", argTypes, term2388, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


