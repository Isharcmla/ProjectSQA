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

public class Element_after_1304948324123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;

    public Element_after_1304948324123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2645 = new HashMap();
        Set<Object> term19078 =  ((Map) term2645).keySet();
        HashSet term2644 = new HashSet((Collection<? extends Object>) term19078);
        ArrayList term2661 = new ArrayList();
        ((ArrayList) term2661).add((Object)null);
        ((ArrayList) term2661).add((Object)null);
        LinkedHashMap term2666 = new LinkedHashMap();
        term2623 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2624 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2665 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2624, term2624.getClass(), "tagName", "FjOiNAfBOc");
        setBooleanField(term2624, term2624.getClass(), "isBlock", true);
        setBooleanField(term2624, term2624.getClass(), "formatAsBlock", false);
        setBooleanField(term2624, term2624.getClass(), "canContainBlock", false);
        setBooleanField(term2624, term2624.getClass(), "canContainInline", true);
        setBooleanField(term2624, term2624.getClass(), "empty", false);
        setBooleanField(term2624, term2624.getClass(), "selfClosing", false);
        setBooleanField(term2624, term2624.getClass(), "preserveWhitespace", true);
        setField(term2623, term2623.getClass(), "tag", term2624);
        setField(term2623, term2623.getClass(), "classNames", term2644);
        setField(term2623, term2623.getClass(), "parentNode", null);
        setField(term2623, term2623.getClass(), "childNodes", term2661);
        setField(term2665, term2665.getClass(), "attributes", term2666);
        setField(term2623, term2623.getClass(), "attributes", term2665);
        setField(term2623, term2623.getClass(), "baseUri", "EKjQdtKxAM");
        setIntField(term2623, term2623.getClass(), "siblingIndex", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "after", argTypes, term2623, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


