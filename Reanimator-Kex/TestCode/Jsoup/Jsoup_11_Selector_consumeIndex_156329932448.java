package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_consumeIndex_156329932448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2058;

    public Selector_consumeIndex_156329932448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2082 = new ArrayList();
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ((ArrayList) term2082).add((Object)null);
        ArrayList term2086 = new ArrayList();
        ((ArrayList) term2086).add((Object)null);
        ((ArrayList) term2086).add((Object)null);
        ((ArrayList) term2086).add((Object)null);
        ((ArrayList) term2086).add((Object)null);
        ((ArrayList) term2086).add((Object)null);
        ((ArrayList) term2086).add((Object)null);
        ArrayList term2090 = new ArrayList();
        ((ArrayList) term2090).add((Object)null);
        HashMap term2097 = new HashMap();
        Set<Object> term8702 =  ((Map) term2097).keySet();
        HashSet term2096 = new HashSet((Collection<? extends Object>) term8702);
        ArrayList term2102 = new ArrayList();
        ((ArrayList) term2102).add((Object)null);
        ((ArrayList) term2102).add((Object)null);
        ((ArrayList) term2102).add((Object)null);
        ((ArrayList) term2102).add((Object)null);
        LinkedHashMap term2107 = new LinkedHashMap();
        LinkedHashMap term2127 = new LinkedHashMap();
        Set<Object> term8713 =  ((Map) term2127).keySet();
        LinkedHashSet term2126 = new LinkedHashSet((Collection<? extends Object>) term8713);
        term2058 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term2059 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2060 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2106 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term2167 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2060, term2060.getClass(), "tagName", "uWqXrwAsDU");
        setBooleanField(term2060, term2060.getClass(), "knownTag", true);
        setBooleanField(term2060, term2060.getClass(), "isBlock", true);
        setBooleanField(term2060, term2060.getClass(), "formatAsBlock", false);
        setBooleanField(term2060, term2060.getClass(), "canContainBlock", false);
        setBooleanField(term2060, term2060.getClass(), "canContainInline", true);
        setBooleanField(term2060, term2060.getClass(), "optionalClosing", true);
        setBooleanField(term2060, term2060.getClass(), "empty", false);
        setBooleanField(term2060, term2060.getClass(), "selfClosing", true);
        setBooleanField(term2060, term2060.getClass(), "preserveWhitespace", true);
        setField(term2060, term2060.getClass(), "ancestors", term2082);
        setField(term2060, term2060.getClass(), "excludes", term2086);
        setField(term2060, term2060.getClass(), "ignoreEndTags", term2090);
        setBooleanField(term2060, term2060.getClass(), "directDescendant", true);
        setBooleanField(term2060, term2060.getClass(), "limitChildren", true);
        setField(term2059, term2059.getClass(), "tag", term2060);
        setField(term2059, term2059.getClass(), "classNames", term2096);
        setField(term2059, term2059.getClass(), "parentNode", null);
        setField(term2059, term2059.getClass(), "childNodes", term2102);
        setField(term2106, term2106.getClass(), "attributes", term2107);
        setField(term2059, term2059.getClass(), "attributes", term2106);
        setField(term2059, term2059.getClass(), "baseUri", "DcOhhAfJTI");
        setIntField(term2059, term2059.getClass(), "siblingIndex", 972867650);
        setField(term2058, term2058.getClass(), "root", term2059);
        setField(term2058, term2058.getClass(), "elements", term2126);
        setField(term2058, term2058.getClass(), "query", "DuKcNfVVYR");
        setField(term2167, term2167.getClass(), "queue", null);
        setIntField(term2167, term2167.getClass(), "pos", 0);
        setField(term2058, term2058.getClass(), "tq", term2167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeIndex", argTypes, term2058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


