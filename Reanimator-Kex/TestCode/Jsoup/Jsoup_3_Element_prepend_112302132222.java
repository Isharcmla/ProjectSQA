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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_prepend_112302132222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2248;

    public Element_prepend_112302132222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2268 = new ArrayList();
        HashMap term2273 = new HashMap();
        Set<Object> term2323 =  ((Map) term2273).keySet();
        HashSet term2272 = new HashSet((Collection<? extends Object>) term2323);
        ArrayList term2278 = new ArrayList();
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        ((ArrayList) term2278).add((Object)null);
        LinkedHashMap term2283 = new LinkedHashMap();
        term2248 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2282 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2249, term2249.getClass(), "tagName", "OeQLvhVERT");
        setBooleanField(term2249, term2249.getClass(), "isBlock", false);
        setBooleanField(term2249, term2249.getClass(), "canContainBlock", true);
        setBooleanField(term2249, term2249.getClass(), "canContainInline", false);
        setBooleanField(term2249, term2249.getClass(), "optionalClosing", false);
        setBooleanField(term2249, term2249.getClass(), "empty", true);
        setBooleanField(term2249, term2249.getClass(), "preserveWhitespace", false);
        setField(term2249, term2249.getClass(), "ancestors", term2268);
        setField(term2248, term2248.getClass(), "tag", term2249);
        setField(term2248, term2248.getClass(), "classNames", term2272);
        setField(term2248, term2248.getClass(), "parentNode", null);
        setField(term2248, term2248.getClass(), "childNodes", term2278);
        setField(term2282, term2282.getClass(), "attributes", term2283);
        setField(term2248, term2248.getClass(), "attributes", term2282);
        setField(term2248, term2248.getClass(), "baseUri", "IlvgFINwIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GEJABPlHSI";
        callMethod(klass, "prepend", argTypes, term2248, args);
    }

};


