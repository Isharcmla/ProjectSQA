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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_body_26470769216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term2942;

    public Document_body_26470769216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term179, term179.getClass(), "tagName", null);
        setBooleanField(term179, term179.getClass(), "isBlock", false);
        setBooleanField(term179, term179.getClass(), "canContainBlock", false);
        setBooleanField(term179, term179.getClass(), "canContainInline", true);
        setBooleanField(term179, term179.getClass(), "optionalClosing", true);
        setBooleanField(term179, term179.getClass(), "empty", false);
        setBooleanField(term179, term179.getClass(), "preserveWhitespace", false);
        setField(term179, term179.getClass(), "ancestors", null);
        Object term186 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term186, term186.getClass(), "tagName", null);
        setBooleanField(term186, term186.getClass(), "isBlock", false);
        setBooleanField(term186, term186.getClass(), "canContainBlock", true);
        setBooleanField(term186, term186.getClass(), "canContainInline", false);
        setBooleanField(term186, term186.getClass(), "optionalClosing", false);
        setBooleanField(term186, term186.getClass(), "empty", true);
        setBooleanField(term186, term186.getClass(), "preserveWhitespace", false);
        setField(term186, term186.getClass(), "ancestors", null);
        Object term193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term193, term193.getClass(), "tagName", null);
        setBooleanField(term193, term193.getClass(), "isBlock", true);
        setBooleanField(term193, term193.getClass(), "canContainBlock", true);
        setBooleanField(term193, term193.getClass(), "canContainInline", true);
        setBooleanField(term193, term193.getClass(), "optionalClosing", true);
        setBooleanField(term193, term193.getClass(), "empty", false);
        setBooleanField(term193, term193.getClass(), "preserveWhitespace", false);
        setField(term193, term193.getClass(), "ancestors", null);
        ArrayList term177 = new ArrayList();
        ((ArrayList) term177).add(term179);
        ((ArrayList) term177).add(term186);
        ((ArrayList) term177).add(term179);
        ((ArrayList) term177).add(term193);
        ((ArrayList) term177).add(term193);
        HashMap term203 = new HashMap();
        Set<Object> term2969 =  ((Map) term203).keySet();
        HashSet term202 = new HashSet((Collection<? extends Object>) term2969);
        ArrayList term211 = new ArrayList();
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        LinkedHashMap term216 = new LinkedHashMap();
        term157 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term158 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term215 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term158, term158.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term158, term158.getClass(), "isBlock", true);
        setBooleanField(term158, term158.getClass(), "canContainBlock", false);
        setBooleanField(term158, term158.getClass(), "canContainInline", false);
        setBooleanField(term158, term158.getClass(), "optionalClosing", true);
        setBooleanField(term158, term158.getClass(), "empty", false);
        setBooleanField(term158, term158.getClass(), "preserveWhitespace", false);
        setField(term158, term158.getClass(), "ancestors", term177);
        setField(term157, term157.getClass(), "tag", term158);
        setField(term157, term157.getClass(), "classNames", term202);
        setField(term157, term157.getClass(), "parentNode", null);
        setField(term157, term157.getClass(), "childNodes", term211);
        setField(term215, term215.getClass(), "attributes", term216);
        setField(term157, term157.getClass(), "attributes", term215);
        setField(term157, term157.getClass(), "baseUri", "BYqFIqCKAV");
        Object term2948 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2948, term2948.getClass(), "tagName", null);
        setBooleanField(term2948, term2948.getClass(), "isBlock", false);
        setBooleanField(term2948, term2948.getClass(), "canContainBlock", false);
        setBooleanField(term2948, term2948.getClass(), "canContainInline", true);
        setBooleanField(term2948, term2948.getClass(), "optionalClosing", true);
        setBooleanField(term2948, term2948.getClass(), "empty", false);
        setBooleanField(term2948, term2948.getClass(), "preserveWhitespace", false);
        setField(term2948, term2948.getClass(), "ancestors", null);
        Object term2949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2949, term2949.getClass(), "tagName", null);
        setBooleanField(term2949, term2949.getClass(), "isBlock", false);
        setBooleanField(term2949, term2949.getClass(), "canContainBlock", true);
        setBooleanField(term2949, term2949.getClass(), "canContainInline", false);
        setBooleanField(term2949, term2949.getClass(), "optionalClosing", false);
        setBooleanField(term2949, term2949.getClass(), "empty", true);
        setBooleanField(term2949, term2949.getClass(), "preserveWhitespace", false);
        setField(term2949, term2949.getClass(), "ancestors", null);
        Object term2950 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2950, term2950.getClass(), "tagName", null);
        setBooleanField(term2950, term2950.getClass(), "isBlock", true);
        setBooleanField(term2950, term2950.getClass(), "canContainBlock", true);
        setBooleanField(term2950, term2950.getClass(), "canContainInline", true);
        setBooleanField(term2950, term2950.getClass(), "optionalClosing", true);
        setBooleanField(term2950, term2950.getClass(), "empty", false);
        setBooleanField(term2950, term2950.getClass(), "preserveWhitespace", false);
        setField(term2950, term2950.getClass(), "ancestors", null);
        ArrayList term2946 = new ArrayList();
        ((ArrayList) term2946).add(term2948);
        ((ArrayList) term2946).add(term2949);
        ((ArrayList) term2946).add(term2948);
        ((ArrayList) term2946).add(term2950);
        ((ArrayList) term2946).add(term2950);
        HashMap term2952 = new HashMap();
        Set<Object> term2990 =  ((Map) term2952).keySet();
        HashSet term2951 = new HashSet((Collection<? extends Object>) term2990);
        ArrayList term2953 = new ArrayList();
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        ((ArrayList) term2953).add((Object)null);
        LinkedHashMap term2956 = new LinkedHashMap();
        term2942 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2943 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2955 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2943, term2943.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term2943, term2943.getClass(), "isBlock", true);
        setBooleanField(term2943, term2943.getClass(), "canContainBlock", false);
        setBooleanField(term2943, term2943.getClass(), "canContainInline", false);
        setBooleanField(term2943, term2943.getClass(), "optionalClosing", true);
        setBooleanField(term2943, term2943.getClass(), "empty", false);
        setBooleanField(term2943, term2943.getClass(), "preserveWhitespace", false);
        setField(term2943, term2943.getClass(), "ancestors", term2946);
        setField(term2942, term2942.getClass(), "tag", term2943);
        setField(term2942, term2942.getClass(), "classNames", term2951);
        setField(term2942, term2942.getClass(), "parentNode", null);
        setField(term2942, term2942.getClass(), "childNodes", term2953);
        setField(term2955, term2955.getClass(), "attributes", term2956);
        setField(term2942, term2942.getClass(), "attributes", term2955);
        setField(term2942, term2942.getClass(), "baseUri", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "body", argTypes, term157, args);
        assertTrue(recursiveEquals(term157, term2942));
        assertTrue(recursiveEquals(retValue, null));
    }

};
