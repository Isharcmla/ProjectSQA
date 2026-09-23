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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_siblingElements_1319765476126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2915;
     Object term19935;
     Object term19879;

    public Element_siblingElements_1319765476126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2937 = new HashMap();
        Set<Object> term19957 =  ((Map) term2937).keySet();
        HashSet term2936 = new HashSet((Collection<? extends Object>) term19957);
        ArrayList term2957 = new ArrayList();
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        ((ArrayList) term2957).add((Object)null);
        LinkedHashMap term2962 = new LinkedHashMap();
        term2915 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2916 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2961 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2916, term2916.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term2916, term2916.getClass(), "isBlock", true);
        setBooleanField(term2916, term2916.getClass(), "formatAsBlock", true);
        setBooleanField(term2916, term2916.getClass(), "canContainBlock", false);
        setBooleanField(term2916, term2916.getClass(), "canContainInline", true);
        setBooleanField(term2916, term2916.getClass(), "empty", true);
        setBooleanField(term2916, term2916.getClass(), "selfClosing", true);
        setBooleanField(term2916, term2916.getClass(), "preserveWhitespace", true);
        setField(term2915, term2915.getClass(), "tag", term2916);
        setField(term2915, term2915.getClass(), "classNames", term2936);
        setField(term2915, term2915.getClass(), "parentNode", null);
        setField(term2915, term2915.getClass(), "childNodes", term2957);
        setField(term2961, term2961.getClass(), "attributes", term2962);
        setField(term2915, term2915.getClass(), "attributes", term2961);
        setField(term2915, term2915.getClass(), "baseUri", "TXyHhqeCjR");
        setIntField(term2915, term2915.getClass(), "siblingIndex", -226514366);
        HashMap term19940 = new HashMap();
        Set<Object> term19978 =  ((Map) term19940).keySet();
        HashSet term19939 = new HashSet((Collection<? extends Object>) term19978);
        ArrayList term19941 = new ArrayList();
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        ((ArrayList) term19941).add((Object)null);
        LinkedHashMap term19944 = new LinkedHashMap();
        term19935 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19936 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19943 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19936, term19936.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term19936, term19936.getClass(), "isBlock", true);
        setBooleanField(term19936, term19936.getClass(), "formatAsBlock", true);
        setBooleanField(term19936, term19936.getClass(), "canContainBlock", false);
        setBooleanField(term19936, term19936.getClass(), "canContainInline", true);
        setBooleanField(term19936, term19936.getClass(), "empty", true);
        setBooleanField(term19936, term19936.getClass(), "selfClosing", true);
        setBooleanField(term19936, term19936.getClass(), "preserveWhitespace", true);
        setField(term19935, term19935.getClass(), "tag", term19936);
        setField(term19935, term19935.getClass(), "classNames", term19939);
        setField(term19935, term19935.getClass(), "parentNode", null);
        setField(term19935, term19935.getClass(), "childNodes", term19941);
        setField(term19943, term19943.getClass(), "attributes", term19944);
        setField(term19935, term19935.getClass(), "attributes", term19943);
        setField(term19935, term19935.getClass(), "baseUri", "TXyHhqeCjR");
        setIntField(term19935, term19935.getClass(), "siblingIndex", -226514366);
        ArrayList term19880 = new ArrayList();
        term19879 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term19879, term19879.getClass(), "contents", term19880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term2915, args);
        assertTrue(recursiveEquals(term2915, term19935));
        assertTrue(recursiveEquals(retValue, term19879));
    }

};


