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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependElement_2140080630113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;

    public Element_prependElement_2140080630113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1815 = new HashMap();
        Set<Object> term23481 =  ((Map) term1815).keySet();
        HashSet term1814 = new HashSet((Collection<? extends Object>) term23481);
        ArrayList term1820 = new ArrayList();
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        LinkedHashMap term1825 = new LinkedHashMap();
        term1793 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1794 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1824 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1794, term1794.getClass(), "tagName", "sZdUNdggUW");
        setBooleanField(term1794, term1794.getClass(), "isBlock", false);
        setBooleanField(term1794, term1794.getClass(), "formatAsBlock", false);
        setBooleanField(term1794, term1794.getClass(), "canContainBlock", true);
        setBooleanField(term1794, term1794.getClass(), "canContainInline", true);
        setBooleanField(term1794, term1794.getClass(), "empty", false);
        setBooleanField(term1794, term1794.getClass(), "selfClosing", true);
        setBooleanField(term1794, term1794.getClass(), "preserveWhitespace", true);
        setField(term1793, term1793.getClass(), "tag", term1794);
        setField(term1793, term1793.getClass(), "classNames", term1814);
        setField(term1793, term1793.getClass(), "parentNode", null);
        setField(term1793, term1793.getClass(), "childNodes", term1820);
        setField(term1824, term1824.getClass(), "attributes", term1825);
        setField(term1793, term1793.getClass(), "attributes", term1824);
        setField(term1793, term1793.getClass(), "baseUri", "PgPzMSEjjX");
        setIntField(term1793, term1793.getClass(), "siblingIndex", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wzsPSPcRdj";
        try {
            callMethod(klass, "prependElement", argTypes, term1793, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


