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

public class Element_appendText_83357295722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892;

    public Element_appendText_83357295722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1914 = new HashMap();
        Set<Object> term1979 =  ((Map) term1914).keySet();
        HashSet term1913 = new HashSet((Collection<? extends Object>) term1979);
        ArrayList term1928 = new ArrayList();
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        ((ArrayList) term1928).add((Object)null);
        LinkedHashMap term1933 = new LinkedHashMap();
        term1892 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1893 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1932 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1893, term1893.getClass(), "tagName", "kGMQdqJYyB");
        setBooleanField(term1893, term1893.getClass(), "isBlock", false);
        setBooleanField(term1893, term1893.getClass(), "formatAsBlock", false);
        setBooleanField(term1893, term1893.getClass(), "canContainBlock", false);
        setBooleanField(term1893, term1893.getClass(), "canContainInline", true);
        setBooleanField(term1893, term1893.getClass(), "empty", false);
        setBooleanField(term1893, term1893.getClass(), "selfClosing", false);
        setBooleanField(term1893, term1893.getClass(), "preserveWhitespace", false);
        setField(term1892, term1892.getClass(), "tag", term1893);
        setField(term1892, term1892.getClass(), "classNames", term1913);
        setField(term1892, term1892.getClass(), "parentNode", null);
        setField(term1892, term1892.getClass(), "childNodes", term1928);
        setField(term1932, term1932.getClass(), "attributes", term1933);
        setField(term1892, term1892.getClass(), "attributes", term1932);
        setField(term1892, term1892.getClass(), "baseUri", "vGiuZVPJNH");
        setIntField(term1892, term1892.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tlzpzIjMib";
        callMethod(klass, "appendText", argTypes, term1892, args);
    }

};


