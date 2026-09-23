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

public class Element_siblingElements_1319765476125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977;
     Object term19917;
     Object term19859;

    public Element_siblingElements_1319765476125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3001 = new HashMap();
        Set<Object> term19939 =  ((Map) term3001).keySet();
        HashSet term3000 = new HashSet((Collection<? extends Object>) term19939);
        ArrayList term3021 = new ArrayList();
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        ((ArrayList) term3021).add((Object)null);
        LinkedHashMap term3026 = new LinkedHashMap();
        term2977 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2978 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3025 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2978, term2978.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term2978, term2978.getClass(), "isBlock", false);
        setBooleanField(term2978, term2978.getClass(), "formatAsBlock", false);
        setBooleanField(term2978, term2978.getClass(), "canContainBlock", false);
        setBooleanField(term2978, term2978.getClass(), "canContainInline", true);
        setBooleanField(term2978, term2978.getClass(), "empty", true);
        setBooleanField(term2978, term2978.getClass(), "selfClosing", true);
        setBooleanField(term2978, term2978.getClass(), "preserveWhitespace", true);
        setBooleanField(term2978, term2978.getClass(), "formList", false);
        setBooleanField(term2978, term2978.getClass(), "formSubmit", true);
        setField(term2977, term2977.getClass(), "tag", term2978);
        setField(term2977, term2977.getClass(), "classNames", term3000);
        setField(term2977, term2977.getClass(), "parentNode", null);
        setField(term2977, term2977.getClass(), "childNodes", term3021);
        setField(term3025, term3025.getClass(), "attributes", term3026);
        setField(term2977, term2977.getClass(), "attributes", term3025);
        setField(term2977, term2977.getClass(), "baseUri", "TXyHhqeCjR");
        setIntField(term2977, term2977.getClass(), "siblingIndex", -226514366);
        HashMap term19922 = new HashMap();
        Set<Object> term19960 =  ((Map) term19922).keySet();
        HashSet term19921 = new HashSet((Collection<? extends Object>) term19960);
        ArrayList term19923 = new ArrayList();
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        ((ArrayList) term19923).add((Object)null);
        LinkedHashMap term19926 = new LinkedHashMap();
        term19917 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19918 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19925 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19918, term19918.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term19918, term19918.getClass(), "isBlock", false);
        setBooleanField(term19918, term19918.getClass(), "formatAsBlock", false);
        setBooleanField(term19918, term19918.getClass(), "canContainBlock", false);
        setBooleanField(term19918, term19918.getClass(), "canContainInline", true);
        setBooleanField(term19918, term19918.getClass(), "empty", true);
        setBooleanField(term19918, term19918.getClass(), "selfClosing", true);
        setBooleanField(term19918, term19918.getClass(), "preserveWhitespace", true);
        setBooleanField(term19918, term19918.getClass(), "formList", false);
        setBooleanField(term19918, term19918.getClass(), "formSubmit", true);
        setField(term19917, term19917.getClass(), "tag", term19918);
        setField(term19917, term19917.getClass(), "classNames", term19921);
        setField(term19917, term19917.getClass(), "parentNode", null);
        setField(term19917, term19917.getClass(), "childNodes", term19923);
        setField(term19925, term19925.getClass(), "attributes", term19926);
        setField(term19917, term19917.getClass(), "attributes", term19925);
        setField(term19917, term19917.getClass(), "baseUri", "TXyHhqeCjR");
        setIntField(term19917, term19917.getClass(), "siblingIndex", -226514366);
        ArrayList term19860 = new ArrayList();
        term19859 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term19859, term19859.getClass(), "contents", term19860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term2977, args);
        assertTrue(recursiveEquals(term2977, term19917));
        assertTrue(recursiveEquals(retValue, term19859));
    }

};


