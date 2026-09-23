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

public class Element_appendText_83357295723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1894;

    public Element_appendText_83357295723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1916 = new HashMap();
        Set<Object> term1983 =  ((Map) term1916).keySet();
        HashSet term1915 = new HashSet((Collection<? extends Object>) term1983);
        ArrayList term1932 = new ArrayList();
        ((ArrayList) term1932).add((Object)null);
        ((ArrayList) term1932).add((Object)null);
        LinkedHashMap term1937 = new LinkedHashMap();
        term1894 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1895 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1936 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1895, term1895.getClass(), "tagName", "tlzpzIjMib");
        setBooleanField(term1895, term1895.getClass(), "isBlock", true);
        setBooleanField(term1895, term1895.getClass(), "formatAsBlock", false);
        setBooleanField(term1895, term1895.getClass(), "canContainBlock", false);
        setBooleanField(term1895, term1895.getClass(), "canContainInline", true);
        setBooleanField(term1895, term1895.getClass(), "empty", true);
        setBooleanField(term1895, term1895.getClass(), "selfClosing", false);
        setBooleanField(term1895, term1895.getClass(), "preserveWhitespace", true);
        setField(term1894, term1894.getClass(), "tag", term1895);
        setField(term1894, term1894.getClass(), "classNames", term1915);
        setField(term1894, term1894.getClass(), "parentNode", null);
        setField(term1894, term1894.getClass(), "childNodes", term1932);
        setField(term1936, term1936.getClass(), "attributes", term1937);
        setField(term1894, term1894.getClass(), "attributes", term1936);
        setField(term1894, term1894.getClass(), "baseUri", "zcorEihhLK");
        setIntField(term1894, term1894.getClass(), "siblingIndex", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "appendText", argTypes, term1894, args);
    }

};


