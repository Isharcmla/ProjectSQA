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

public class Element_prependElement_2140080630114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1826;

    public Element_prependElement_2140080630114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1850 = new HashMap();
        Set<Object> term15137 =  ((Map) term1850).keySet();
        HashSet term1849 = new HashSet((Collection<? extends Object>) term15137);
        ArrayList term1864 = new ArrayList();
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        ((ArrayList) term1864).add((Object)null);
        LinkedHashMap term1869 = new LinkedHashMap();
        term1826 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1827 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1868 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1827, term1827.getClass(), "tagName", "wzsPSPcRdj");
        setBooleanField(term1827, term1827.getClass(), "isBlock", false);
        setBooleanField(term1827, term1827.getClass(), "formatAsBlock", true);
        setBooleanField(term1827, term1827.getClass(), "canContainBlock", true);
        setBooleanField(term1827, term1827.getClass(), "canContainInline", false);
        setBooleanField(term1827, term1827.getClass(), "empty", true);
        setBooleanField(term1827, term1827.getClass(), "selfClosing", true);
        setBooleanField(term1827, term1827.getClass(), "preserveWhitespace", true);
        setBooleanField(term1827, term1827.getClass(), "formList", true);
        setBooleanField(term1827, term1827.getClass(), "formSubmit", true);
        setField(term1826, term1826.getClass(), "tag", term1827);
        setField(term1826, term1826.getClass(), "classNames", term1849);
        setField(term1826, term1826.getClass(), "parentNode", null);
        setField(term1826, term1826.getClass(), "childNodes", term1864);
        setField(term1868, term1868.getClass(), "attributes", term1869);
        setField(term1826, term1826.getClass(), "attributes", term1868);
        setField(term1826, term1826.getClass(), "baseUri", "BjugTaMcxJ");
        setIntField(term1826, term1826.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vGiuZVPJNH";
        try {
            callMethod(klass, "prependElement", argTypes, term1826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


