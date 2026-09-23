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

public class Element_after_1054834904121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2578;

    public Element_after_1054834904121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2602 = new HashMap();
        Set<Object> term18708 =  ((Map) term2602).keySet();
        HashSet term2601 = new HashSet((Collection<? extends Object>) term18708);
        ArrayList term2607 = new ArrayList();
        ((ArrayList) term2607).add((Object)null);
        ((ArrayList) term2607).add((Object)null);
        LinkedHashMap term2612 = new LinkedHashMap();
        term2578 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2611 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2579, term2579.getClass(), "tagName", "vvoLrMGCoN");
        setBooleanField(term2579, term2579.getClass(), "isBlock", false);
        setBooleanField(term2579, term2579.getClass(), "formatAsBlock", false);
        setBooleanField(term2579, term2579.getClass(), "canContainBlock", false);
        setBooleanField(term2579, term2579.getClass(), "canContainInline", false);
        setBooleanField(term2579, term2579.getClass(), "empty", true);
        setBooleanField(term2579, term2579.getClass(), "selfClosing", false);
        setBooleanField(term2579, term2579.getClass(), "preserveWhitespace", false);
        setBooleanField(term2579, term2579.getClass(), "formList", true);
        setBooleanField(term2579, term2579.getClass(), "formSubmit", true);
        setField(term2578, term2578.getClass(), "tag", term2579);
        setField(term2578, term2578.getClass(), "classNames", term2601);
        setField(term2578, term2578.getClass(), "parentNode", null);
        setField(term2578, term2578.getClass(), "childNodes", term2607);
        setField(term2611, term2611.getClass(), "attributes", term2612);
        setField(term2578, term2578.getClass(), "attributes", term2611);
        setField(term2578, term2578.getClass(), "baseUri", "TweMFhxNdj");
        setIntField(term2578, term2578.getClass(), "siblingIndex", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NBrvVzvQHe";
        try {
            callMethod(klass, "after", argTypes, term2578, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


