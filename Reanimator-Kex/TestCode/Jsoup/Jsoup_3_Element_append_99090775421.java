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

public class Element_append_99090775421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2102;

    public Element_append_99090775421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2124 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2124, term2124.getClass(), "tagName", null);
        setBooleanField(term2124, term2124.getClass(), "isBlock", true);
        setBooleanField(term2124, term2124.getClass(), "canContainBlock", true);
        setBooleanField(term2124, term2124.getClass(), "canContainInline", false);
        setBooleanField(term2124, term2124.getClass(), "optionalClosing", false);
        setBooleanField(term2124, term2124.getClass(), "empty", false);
        setBooleanField(term2124, term2124.getClass(), "preserveWhitespace", true);
        setField(term2124, term2124.getClass(), "ancestors", null);
        Object term2131 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2131, term2131.getClass(), "tagName", null);
        setBooleanField(term2131, term2131.getClass(), "isBlock", true);
        setBooleanField(term2131, term2131.getClass(), "canContainBlock", false);
        setBooleanField(term2131, term2131.getClass(), "canContainInline", false);
        setBooleanField(term2131, term2131.getClass(), "optionalClosing", false);
        setBooleanField(term2131, term2131.getClass(), "empty", false);
        setBooleanField(term2131, term2131.getClass(), "preserveWhitespace", true);
        setField(term2131, term2131.getClass(), "ancestors", null);
        Object term2138 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2138, term2138.getClass(), "tagName", null);
        setBooleanField(term2138, term2138.getClass(), "isBlock", false);
        setBooleanField(term2138, term2138.getClass(), "canContainBlock", true);
        setBooleanField(term2138, term2138.getClass(), "canContainInline", true);
        setBooleanField(term2138, term2138.getClass(), "optionalClosing", false);
        setBooleanField(term2138, term2138.getClass(), "empty", false);
        setBooleanField(term2138, term2138.getClass(), "preserveWhitespace", true);
        setField(term2138, term2138.getClass(), "ancestors", null);
        Object term2145 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2145, term2145.getClass(), "tagName", null);
        setBooleanField(term2145, term2145.getClass(), "isBlock", true);
        setBooleanField(term2145, term2145.getClass(), "canContainBlock", false);
        setBooleanField(term2145, term2145.getClass(), "canContainInline", true);
        setBooleanField(term2145, term2145.getClass(), "optionalClosing", false);
        setBooleanField(term2145, term2145.getClass(), "empty", true);
        setBooleanField(term2145, term2145.getClass(), "preserveWhitespace", false);
        setField(term2145, term2145.getClass(), "ancestors", null);
        Object term2152 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2152, term2152.getClass(), "tagName", null);
        setBooleanField(term2152, term2152.getClass(), "isBlock", true);
        setBooleanField(term2152, term2152.getClass(), "canContainBlock", true);
        setBooleanField(term2152, term2152.getClass(), "canContainInline", false);
        setBooleanField(term2152, term2152.getClass(), "optionalClosing", false);
        setBooleanField(term2152, term2152.getClass(), "empty", false);
        setBooleanField(term2152, term2152.getClass(), "preserveWhitespace", true);
        setField(term2152, term2152.getClass(), "ancestors", null);
        ArrayList term2122 = new ArrayList();
        ((ArrayList) term2122).add(term2124);
        ((ArrayList) term2122).add(term2131);
        ((ArrayList) term2122).add(term2138);
        ((ArrayList) term2122).add(term2145);
        ((ArrayList) term2122).add(term2145);
        ((ArrayList) term2122).add(term2152);
        ((ArrayList) term2122).add(term2131);
        HashMap term2162 = new HashMap();
        Set<Object> term2227 =  ((Map) term2162).keySet();
        HashSet term2161 = new HashSet((Collection<? extends Object>) term2227);
        ArrayList term2182 = new ArrayList();
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        ((ArrayList) term2182).add((Object)null);
        LinkedHashMap term2187 = new LinkedHashMap();
        term2102 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2186 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2103, term2103.getClass(), "tagName", "vKitydDVnM");
        setBooleanField(term2103, term2103.getClass(), "isBlock", false);
        setBooleanField(term2103, term2103.getClass(), "canContainBlock", false);
        setBooleanField(term2103, term2103.getClass(), "canContainInline", false);
        setBooleanField(term2103, term2103.getClass(), "optionalClosing", true);
        setBooleanField(term2103, term2103.getClass(), "empty", false);
        setBooleanField(term2103, term2103.getClass(), "preserveWhitespace", true);
        setField(term2103, term2103.getClass(), "ancestors", term2122);
        setField(term2102, term2102.getClass(), "tag", term2103);
        setField(term2102, term2102.getClass(), "classNames", term2161);
        setField(term2102, term2102.getClass(), "parentNode", null);
        setField(term2102, term2102.getClass(), "childNodes", term2182);
        setField(term2186, term2186.getClass(), "attributes", term2187);
        setField(term2102, term2102.getClass(), "attributes", term2186);
        setField(term2102, term2102.getClass(), "baseUri", "SPBstwKFVr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WxYUTuqmIq";
        callMethod(klass, "append", argTypes, term2102, args);
    }

};


