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

public class Element_prependElement_2140080630115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;

    public Element_prependElement_2140080630115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1808 = new HashMap();
        Set<Object> term15179 =  ((Map) term1808).keySet();
        HashSet term1807 = new HashSet((Collection<? extends Object>) term15179);
        ArrayList term1822 = new ArrayList();
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        ((ArrayList) term1822).add((Object)null);
        LinkedHashMap term1827 = new LinkedHashMap();
        term1786 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1787 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1826 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1787, term1787.getClass(), "tagName", "wzsPSPcRdj");
        setBooleanField(term1787, term1787.getClass(), "isBlock", false);
        setBooleanField(term1787, term1787.getClass(), "formatAsBlock", false);
        setBooleanField(term1787, term1787.getClass(), "canContainBlock", false);
        setBooleanField(term1787, term1787.getClass(), "canContainInline", true);
        setBooleanField(term1787, term1787.getClass(), "empty", false);
        setBooleanField(term1787, term1787.getClass(), "selfClosing", false);
        setBooleanField(term1787, term1787.getClass(), "preserveWhitespace", false);
        setField(term1786, term1786.getClass(), "tag", term1787);
        setField(term1786, term1786.getClass(), "classNames", term1807);
        setField(term1786, term1786.getClass(), "parentNode", null);
        setField(term1786, term1786.getClass(), "childNodes", term1822);
        setField(term1826, term1826.getClass(), "attributes", term1827);
        setField(term1786, term1786.getClass(), "attributes", term1826);
        setField(term1786, term1786.getClass(), "baseUri", "BjugTaMcxJ");
        setIntField(term1786, term1786.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vGiuZVPJNH";
        try {
            callMethod(klass, "prependElement", argTypes, term1786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


