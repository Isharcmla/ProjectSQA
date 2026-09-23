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

public class Element_prependChild_59044298112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1599;

    public Element_prependChild_59044298112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1621 = new HashMap();
        Set<Object> term13645 =  ((Map) term1621).keySet();
        HashSet term1620 = new HashSet((Collection<? extends Object>) term13645);
        ArrayList term1633 = new ArrayList();
        ((ArrayList) term1633).add((Object)null);
        ((ArrayList) term1633).add((Object)null);
        ((ArrayList) term1633).add((Object)null);
        ((ArrayList) term1633).add((Object)null);
        ((ArrayList) term1633).add((Object)null);
        LinkedHashMap term1638 = new LinkedHashMap();
        term1599 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1600 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1637 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1600, term1600.getClass(), "tagName", "zUlRdimJtU");
        setBooleanField(term1600, term1600.getClass(), "isBlock", true);
        setBooleanField(term1600, term1600.getClass(), "formatAsBlock", false);
        setBooleanField(term1600, term1600.getClass(), "canContainBlock", true);
        setBooleanField(term1600, term1600.getClass(), "canContainInline", false);
        setBooleanField(term1600, term1600.getClass(), "empty", false);
        setBooleanField(term1600, term1600.getClass(), "selfClosing", true);
        setBooleanField(term1600, term1600.getClass(), "preserveWhitespace", true);
        setField(term1599, term1599.getClass(), "tag", term1600);
        setField(term1599, term1599.getClass(), "classNames", term1620);
        setField(term1599, term1599.getClass(), "parentNode", null);
        setField(term1599, term1599.getClass(), "childNodes", term1633);
        setField(term1637, term1637.getClass(), "attributes", term1638);
        setField(term1599, term1599.getClass(), "attributes", term1637);
        setField(term1599, term1599.getClass(), "baseUri", "igCAtimmYB");
        setIntField(term1599, term1599.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term1599, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


