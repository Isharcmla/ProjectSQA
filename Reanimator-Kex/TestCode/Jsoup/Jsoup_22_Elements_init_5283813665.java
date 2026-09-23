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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Elements_init_5283813665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1117;
     Object term1131;

    public Elements_init_5283813665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15 = new HashMap();
        Set<Object> term1144 =  ((Map) term15).keySet();
        HashSet term14 = new HashSet((Collection<? extends Object>) term1144);
        ArrayList term20 = new ArrayList();
        LinkedHashMap term25 = new LinkedHashMap();
        Object term4 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5, term5.getClass(), "tagName", "");
        setBooleanField(term5, term5.getClass(), "isBlock", false);
        setBooleanField(term5, term5.getClass(), "formatAsBlock", false);
        setBooleanField(term5, term5.getClass(), "canContainBlock", false);
        setBooleanField(term5, term5.getClass(), "canContainInline", false);
        setBooleanField(term5, term5.getClass(), "empty", true);
        setBooleanField(term5, term5.getClass(), "selfClosing", true);
        setBooleanField(term5, term5.getClass(), "preserveWhitespace", true);
        setField(term4, term4.getClass(), "tag", term5);
        setField(term4, term4.getClass(), "classNames", term14);
        setField(term4, term4.getClass(), "parentNode", null);
        setField(term4, term4.getClass(), "childNodes", term20);
        setField(term24, term24.getClass(), "attributes", term25);
        setField(term4, term4.getClass(), "attributes", term24);
        setField(term4, term4.getClass(), "baseUri", "LQFpaHEwXR");
        setIntField(term4, term4.getClass(), "siblingIndex", 568599855);
        HashSet term54 = new HashSet();
        ArrayList term55 = new ArrayList();
        ((ArrayList) term55).add((Object)null);
        ((ArrayList) term55).add((Object)null);
        ((ArrayList) term55).add((Object)null);
        ((ArrayList) term55).add((Object)null);
        ((ArrayList) term55).add((Object)null);
        Object term45 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term46 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term46, term46.getClass(), "tagName", null);
        setBooleanField(term46, term46.getClass(), "isBlock", true);
        setBooleanField(term46, term46.getClass(), "formatAsBlock", false);
        setBooleanField(term46, term46.getClass(), "canContainBlock", true);
        setBooleanField(term46, term46.getClass(), "canContainInline", false);
        setBooleanField(term46, term46.getClass(), "empty", true);
        setBooleanField(term46, term46.getClass(), "selfClosing", false);
        setBooleanField(term46, term46.getClass(), "preserveWhitespace", true);
        setField(term45, term45.getClass(), "tag", term46);
        setField(term45, term45.getClass(), "classNames", term54);
        setField(term45, term45.getClass(), "parentNode", null);
        setField(term45, term45.getClass(), "childNodes", term55);
        setField(term58, term58.getClass(), "attributes", null);
        setField(term45, term45.getClass(), "attributes", term58);
        setField(term45, term45.getClass(), "baseUri", "");
        setIntField(term45, term45.getClass(), "siblingIndex", 1162663216);
        Object term62 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term62, term62.getClass(), "tag", null);
        setField(term62, term62.getClass(), "classNames", null);
        setField(term62, term62.getClass(), "parentNode", null);
        setField(term62, term62.getClass(), "childNodes", null);
        setField(term62, term62.getClass(), "attributes", null);
        setField(term62, term62.getClass(), "baseUri", null);
        setIntField(term62, term62.getClass(), "siblingIndex", 1484323161);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term45);
        ((LinkedList) term1).add(term62);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        HashSet term1122 = new HashSet();
        ArrayList term1123 = new ArrayList();
        Object term1120 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1121 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1124 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1121, term1121.getClass(), "tagName", null);
        setBooleanField(term1121, term1121.getClass(), "isBlock", false);
        setBooleanField(term1121, term1121.getClass(), "formatAsBlock", false);
        setBooleanField(term1121, term1121.getClass(), "canContainBlock", false);
        setBooleanField(term1121, term1121.getClass(), "canContainInline", false);
        setBooleanField(term1121, term1121.getClass(), "empty", true);
        setBooleanField(term1121, term1121.getClass(), "selfClosing", true);
        setBooleanField(term1121, term1121.getClass(), "preserveWhitespace", true);
        setField(term1120, term1120.getClass(), "tag", term1121);
        setField(term1120, term1120.getClass(), "classNames", term1122);
        setField(term1120, term1120.getClass(), "parentNode", null);
        setField(term1120, term1120.getClass(), "childNodes", term1123);
        setField(term1124, term1124.getClass(), "attributes", null);
        setField(term1120, term1120.getClass(), "attributes", term1124);
        setField(term1120, term1120.getClass(), "baseUri", "");
        setIntField(term1120, term1120.getClass(), "siblingIndex", 568599855);
        Object term1127 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1127, term1127.getClass(), "tag", null);
        setField(term1127, term1127.getClass(), "classNames", null);
        setField(term1127, term1127.getClass(), "parentNode", null);
        setField(term1127, term1127.getClass(), "childNodes", null);
        setField(term1127, term1127.getClass(), "attributes", null);
        setField(term1127, term1127.getClass(), "baseUri", null);
        setIntField(term1127, term1127.getClass(), "siblingIndex", 1162663216);
        LinkedList term1118 = new LinkedList();
        ((LinkedList) term1118).add(term1120);
        ((LinkedList) term1118).add(term1127);
        ((LinkedList) term1118).add((Object)null);
        ((LinkedList) term1118).add((Object)null);
        ((LinkedList) term1118).add((Object)null);
        term1117 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term1117, term1117.getClass(), "contents", term1118);
        HashSet term1135 = new HashSet();
        ArrayList term1136 = new ArrayList();
        Object term1133 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1137 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1134, term1134.getClass(), "tagName", null);
        setBooleanField(term1134, term1134.getClass(), "isBlock", false);
        setBooleanField(term1134, term1134.getClass(), "formatAsBlock", false);
        setBooleanField(term1134, term1134.getClass(), "canContainBlock", false);
        setBooleanField(term1134, term1134.getClass(), "canContainInline", false);
        setBooleanField(term1134, term1134.getClass(), "empty", true);
        setBooleanField(term1134, term1134.getClass(), "selfClosing", true);
        setBooleanField(term1134, term1134.getClass(), "preserveWhitespace", true);
        setField(term1133, term1133.getClass(), "tag", term1134);
        setField(term1133, term1133.getClass(), "classNames", term1135);
        setField(term1133, term1133.getClass(), "parentNode", null);
        setField(term1133, term1133.getClass(), "childNodes", term1136);
        setField(term1137, term1137.getClass(), "attributes", null);
        setField(term1133, term1133.getClass(), "attributes", term1137);
        setField(term1133, term1133.getClass(), "baseUri", "");
        setIntField(term1133, term1133.getClass(), "siblingIndex", 568599855);
        Object term1140 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1140, term1140.getClass(), "tag", null);
        setField(term1140, term1140.getClass(), "classNames", null);
        setField(term1140, term1140.getClass(), "parentNode", null);
        setField(term1140, term1140.getClass(), "childNodes", null);
        setField(term1140, term1140.getClass(), "attributes", null);
        setField(term1140, term1140.getClass(), "baseUri", null);
        setIntField(term1140, term1140.getClass(), "siblingIndex", 1162663216);
        term1131 = new LinkedList();
        ((LinkedList) term1131).add(term1133);
        ((LinkedList) term1131).add(term1140);
        ((LinkedList) term1131).add((Object)null);
        ((LinkedList) term1131).add((Object)null);
        ((LinkedList) term1131).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1117));
        assertTrue(recursiveEquals(term1, term1131));
    }

};


