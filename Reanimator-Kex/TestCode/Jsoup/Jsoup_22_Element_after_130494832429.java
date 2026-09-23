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

public class Element_after_130494832429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2632;

    public Element_after_130494832429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2654 = new HashMap();
        Set<Object> term2698 =  ((Map) term2654).keySet();
        HashSet term2653 = new HashSet((Collection<? extends Object>) term2698);
        ArrayList term2659 = new ArrayList();
        ((ArrayList) term2659).add((Object)null);
        ((ArrayList) term2659).add((Object)null);
        LinkedHashMap term2664 = new LinkedHashMap();
        term2632 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2633 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2663 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2633, term2633.getClass(), "tagName", "pXdglvyrQe");
        setBooleanField(term2633, term2633.getClass(), "isBlock", true);
        setBooleanField(term2633, term2633.getClass(), "formatAsBlock", true);
        setBooleanField(term2633, term2633.getClass(), "canContainBlock", true);
        setBooleanField(term2633, term2633.getClass(), "canContainInline", true);
        setBooleanField(term2633, term2633.getClass(), "empty", true);
        setBooleanField(term2633, term2633.getClass(), "selfClosing", false);
        setBooleanField(term2633, term2633.getClass(), "preserveWhitespace", true);
        setField(term2632, term2632.getClass(), "tag", term2633);
        setField(term2632, term2632.getClass(), "classNames", term2653);
        setField(term2632, term2632.getClass(), "parentNode", null);
        setField(term2632, term2632.getClass(), "childNodes", term2659);
        setField(term2663, term2663.getClass(), "attributes", term2664);
        setField(term2632, term2632.getClass(), "attributes", term2663);
        setField(term2632, term2632.getClass(), "baseUri", "NBrvVzvQHe");
        setIntField(term2632, term2632.getClass(), "siblingIndex", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "after", argTypes, term2632, args);
    }

};


