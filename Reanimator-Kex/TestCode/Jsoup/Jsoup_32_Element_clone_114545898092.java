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

public class Element_clone_114545898092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9058;

    public Element_clone_114545898092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9080 = new HashMap();
        Set<Object> term9141 =  ((Map) term9080).keySet();
        HashSet term9079 = new HashSet((Collection<? extends Object>) term9141);
        ArrayList term9102 = new ArrayList();
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        ((ArrayList) term9102).add((Object)null);
        LinkedHashMap term9107 = new LinkedHashMap();
        term9058 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9106 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9059, term9059.getClass(), "tagName", "VAGkRppBem");
        setBooleanField(term9059, term9059.getClass(), "isBlock", false);
        setBooleanField(term9059, term9059.getClass(), "formatAsBlock", false);
        setBooleanField(term9059, term9059.getClass(), "canContainBlock", true);
        setBooleanField(term9059, term9059.getClass(), "canContainInline", false);
        setBooleanField(term9059, term9059.getClass(), "empty", false);
        setBooleanField(term9059, term9059.getClass(), "selfClosing", false);
        setBooleanField(term9059, term9059.getClass(), "preserveWhitespace", true);
        setField(term9058, term9058.getClass(), "tag", term9059);
        setField(term9058, term9058.getClass(), "classNames", term9079);
        setField(term9058, term9058.getClass(), "parentNode", null);
        setField(term9058, term9058.getClass(), "childNodes", term9102);
        setField(term9106, term9106.getClass(), "attributes", term9107);
        setField(term9058, term9058.getClass(), "attributes", term9106);
        setField(term9058, term9058.getClass(), "baseUri", "paPzDETzIq");
        setIntField(term9058, term9058.getClass(), "siblingIndex", 584893196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term9058, args);
    }

};


