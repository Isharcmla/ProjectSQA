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

public class Element_empty_659299020124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2711;
     Object term19140;
     Object term19089;

    public Element_empty_659299020124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2733 = new HashMap();
        Set<Object> term19162 =  ((Map) term2733).keySet();
        HashSet term2732 = new HashSet((Collection<? extends Object>) term19162);
        ArrayList term2753 = new ArrayList();
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        LinkedHashMap term2758 = new LinkedHashMap();
        term2711 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2757 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2712, term2712.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term2712, term2712.getClass(), "isBlock", true);
        setBooleanField(term2712, term2712.getClass(), "formatAsBlock", false);
        setBooleanField(term2712, term2712.getClass(), "canContainBlock", false);
        setBooleanField(term2712, term2712.getClass(), "canContainInline", false);
        setBooleanField(term2712, term2712.getClass(), "empty", false);
        setBooleanField(term2712, term2712.getClass(), "selfClosing", true);
        setBooleanField(term2712, term2712.getClass(), "preserveWhitespace", true);
        setField(term2711, term2711.getClass(), "tag", term2712);
        setField(term2711, term2711.getClass(), "classNames", term2732);
        setField(term2711, term2711.getClass(), "parentNode", null);
        setField(term2711, term2711.getClass(), "childNodes", term2753);
        setField(term2757, term2757.getClass(), "attributes", term2758);
        setField(term2711, term2711.getClass(), "attributes", term2757);
        setField(term2711, term2711.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term2711, term2711.getClass(), "siblingIndex", -1179120542);
        HashMap term19145 = new HashMap();
        Set<Object> term19183 =  ((Map) term19145).keySet();
        HashSet term19144 = new HashSet((Collection<? extends Object>) term19183);
        ArrayList term19146 = new ArrayList();
        LinkedHashMap term19149 = new LinkedHashMap();
        term19140 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19141 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19148 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19141, term19141.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term19141, term19141.getClass(), "isBlock", true);
        setBooleanField(term19141, term19141.getClass(), "formatAsBlock", false);
        setBooleanField(term19141, term19141.getClass(), "canContainBlock", false);
        setBooleanField(term19141, term19141.getClass(), "canContainInline", false);
        setBooleanField(term19141, term19141.getClass(), "empty", false);
        setBooleanField(term19141, term19141.getClass(), "selfClosing", true);
        setBooleanField(term19141, term19141.getClass(), "preserveWhitespace", true);
        setField(term19140, term19140.getClass(), "tag", term19141);
        setField(term19140, term19140.getClass(), "classNames", term19144);
        setField(term19140, term19140.getClass(), "parentNode", null);
        setField(term19140, term19140.getClass(), "childNodes", term19146);
        setField(term19148, term19148.getClass(), "attributes", term19149);
        setField(term19140, term19140.getClass(), "attributes", term19148);
        setField(term19140, term19140.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term19140, term19140.getClass(), "siblingIndex", -1179120542);
        HashMap term19111 = new HashMap();
        Set<Object> term19204 =  ((Map) term19111).keySet();
        HashSet term19110 = new HashSet((Collection<? extends Object>) term19204);
        ArrayList term19116 = new ArrayList();
        LinkedHashMap term19121 = new LinkedHashMap();
        term19089 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19090 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19120 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19090, term19090.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term19090, term19090.getClass(), "isBlock", true);
        setBooleanField(term19090, term19090.getClass(), "formatAsBlock", false);
        setBooleanField(term19090, term19090.getClass(), "canContainBlock", false);
        setBooleanField(term19090, term19090.getClass(), "canContainInline", false);
        setBooleanField(term19090, term19090.getClass(), "empty", false);
        setBooleanField(term19090, term19090.getClass(), "selfClosing", true);
        setBooleanField(term19090, term19090.getClass(), "preserveWhitespace", true);
        setField(term19089, term19089.getClass(), "tag", term19090);
        setField(term19089, term19089.getClass(), "classNames", term19110);
        setField(term19089, term19089.getClass(), "parentNode", null);
        setField(term19089, term19089.getClass(), "childNodes", term19116);
        setField(term19120, term19120.getClass(), "attributes", term19121);
        setField(term19089, term19089.getClass(), "attributes", term19120);
        setField(term19089, term19089.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term19089, term19089.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2711, args);
        assertTrue(recursiveEquals(term2711, term19140));
        assertTrue(recursiveEquals(retValue, term19089));
    }

};


