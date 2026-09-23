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

public class Element_after_1054834904122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2524;

    public Element_after_1054834904122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2546 = new HashMap();
        Set<Object> term18738 =  ((Map) term2546).keySet();
        HashSet term2545 = new HashSet((Collection<? extends Object>) term18738);
        ArrayList term2551 = new ArrayList();
        ((ArrayList) term2551).add((Object)null);
        ((ArrayList) term2551).add((Object)null);
        LinkedHashMap term2556 = new LinkedHashMap();
        term2524 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2525 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2555 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2525, term2525.getClass(), "tagName", "vvoLrMGCoN");
        setBooleanField(term2525, term2525.getClass(), "isBlock", true);
        setBooleanField(term2525, term2525.getClass(), "formatAsBlock", true);
        setBooleanField(term2525, term2525.getClass(), "canContainBlock", true);
        setBooleanField(term2525, term2525.getClass(), "canContainInline", true);
        setBooleanField(term2525, term2525.getClass(), "empty", true);
        setBooleanField(term2525, term2525.getClass(), "selfClosing", false);
        setBooleanField(term2525, term2525.getClass(), "preserveWhitespace", true);
        setField(term2524, term2524.getClass(), "tag", term2525);
        setField(term2524, term2524.getClass(), "classNames", term2545);
        setField(term2524, term2524.getClass(), "parentNode", null);
        setField(term2524, term2524.getClass(), "childNodes", term2551);
        setField(term2555, term2555.getClass(), "attributes", term2556);
        setField(term2524, term2524.getClass(), "attributes", term2555);
        setField(term2524, term2524.getClass(), "baseUri", "TweMFhxNdj");
        setIntField(term2524, term2524.getClass(), "siblingIndex", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NBrvVzvQHe";
        try {
            callMethod(klass, "after", argTypes, term2524, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


