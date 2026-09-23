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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_normaliseTextNodes_97858987027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978;
     Object term2065;
     Object term12301;
     Object term12317;

    public Document_normaliseTextNodes_97858987027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12330 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term12329 = ((Class) term12330).getDeclaredField((String) "limitedQuirks");
        ((Field) term12329).setAccessible(true);
        Object enum30 = ((Field) term12329).get((Object) null);
        HashMap term2020 = new HashMap();
        Set<Object> term12560 =  ((Map) term2020).keySet();
        HashSet term2019 = new HashSet((Collection<? extends Object>) term12560);
        ArrayList term2036 = new ArrayList();
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        LinkedHashMap term2041 = new LinkedHashMap();
        term1978 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1979 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1999 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2040 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1979, term1979.getClass(), "escapeMode", null);
        setField(term1979, term1979.getClass(), "charset", null);
        setField(term1979, term1979.getClass(), "charsetEncoder", null);
        setBooleanField(term1979, term1979.getClass(), "prettyPrint", false);
        setIntField(term1979, term1979.getClass(), "indentAmount", 1134449235);
        setField(term1978, term1978.getClass(), "outputSettings", term1979);
        setField(term1978, term1978.getClass(), "quirksMode", enum30);
        setField(term1999, term1999.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term1999, term1999.getClass(), "isBlock", true);
        setBooleanField(term1999, term1999.getClass(), "formatAsBlock", false);
        setBooleanField(term1999, term1999.getClass(), "canContainBlock", false);
        setBooleanField(term1999, term1999.getClass(), "canContainInline", true);
        setBooleanField(term1999, term1999.getClass(), "empty", false);
        setBooleanField(term1999, term1999.getClass(), "selfClosing", true);
        setBooleanField(term1999, term1999.getClass(), "preserveWhitespace", false);
        setField(term1978, term1978.getClass(), "tag", term1999);
        setField(term1978, term1978.getClass(), "classNames", term2019);
        setField(term1978, term1978.getClass(), "parentNode", null);
        setField(term1978, term1978.getClass(), "childNodes", term2036);
        setField(term2040, term2040.getClass(), "attributes", term2041);
        setField(term1978, term1978.getClass(), "attributes", term2040);
        setField(term1978, term1978.getClass(), "baseUri", "TJmVBGfTML");
        setIntField(term1978, term1978.getClass(), "siblingIndex", -883034806);
        HashMap term2087 = new HashMap();
        Set<Object> term12581 =  ((Map) term2087).keySet();
        HashSet term2086 = new HashSet((Collection<? extends Object>) term12581);
        ArrayList term2099 = new ArrayList();
        ((ArrayList) term2099).add((Object)null);
        LinkedHashMap term2104 = new LinkedHashMap();
        term2065 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2103 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2066, term2066.getClass(), "tagName", "tPlsykYBqO");
        setBooleanField(term2066, term2066.getClass(), "isBlock", false);
        setBooleanField(term2066, term2066.getClass(), "formatAsBlock", true);
        setBooleanField(term2066, term2066.getClass(), "canContainBlock", false);
        setBooleanField(term2066, term2066.getClass(), "canContainInline", false);
        setBooleanField(term2066, term2066.getClass(), "empty", false);
        setBooleanField(term2066, term2066.getClass(), "selfClosing", false);
        setBooleanField(term2066, term2066.getClass(), "preserveWhitespace", true);
        setField(term2065, term2065.getClass(), "tag", term2066);
        setField(term2065, term2065.getClass(), "classNames", term2086);
        setField(term2065, term2065.getClass(), "parentNode", null);
        setField(term2065, term2065.getClass(), "childNodes", term2099);
        setField(term2103, term2103.getClass(), "attributes", term2104);
        setField(term2065, term2065.getClass(), "attributes", term2103);
        setField(term2065, term2065.getClass(), "baseUri", "MAcUBcBckh");
        setIntField(term2065, term2065.getClass(), "siblingIndex", 1585847225);
        Class<? extends Object> term12593 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term12592 = ((Class) term12593).getDeclaredField((String) "limitedQuirks");
        ((Field) term12592).setAccessible(true);
        Object enum31 = ((Field) term12592).get((Object) null);
        HashMap term12310 = new HashMap();
        Set<Object> term12823 =  ((Map) term12310).keySet();
        HashSet term12309 = new HashSet((Collection<? extends Object>) term12823);
        ArrayList term12311 = new ArrayList();
        ((ArrayList) term12311).add((Object)null);
        ((ArrayList) term12311).add((Object)null);
        LinkedHashMap term12314 = new LinkedHashMap();
        term12301 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term12302 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term12306 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12313 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12302, term12302.getClass(), "escapeMode", null);
        setField(term12302, term12302.getClass(), "charset", null);
        setField(term12302, term12302.getClass(), "charsetEncoder", null);
        setBooleanField(term12302, term12302.getClass(), "prettyPrint", false);
        setIntField(term12302, term12302.getClass(), "indentAmount", 1134449235);
        setField(term12301, term12301.getClass(), "outputSettings", term12302);
        setField(term12301, term12301.getClass(), "quirksMode", enum31);
        setField(term12306, term12306.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term12306, term12306.getClass(), "isBlock", true);
        setBooleanField(term12306, term12306.getClass(), "formatAsBlock", false);
        setBooleanField(term12306, term12306.getClass(), "canContainBlock", false);
        setBooleanField(term12306, term12306.getClass(), "canContainInline", true);
        setBooleanField(term12306, term12306.getClass(), "empty", false);
        setBooleanField(term12306, term12306.getClass(), "selfClosing", true);
        setBooleanField(term12306, term12306.getClass(), "preserveWhitespace", false);
        setField(term12301, term12301.getClass(), "tag", term12306);
        setField(term12301, term12301.getClass(), "classNames", term12309);
        setField(term12301, term12301.getClass(), "parentNode", null);
        setField(term12301, term12301.getClass(), "childNodes", term12311);
        setField(term12313, term12313.getClass(), "attributes", term12314);
        setField(term12301, term12301.getClass(), "attributes", term12313);
        setField(term12301, term12301.getClass(), "baseUri", "TJmVBGfTML");
        setIntField(term12301, term12301.getClass(), "siblingIndex", -883034806);
        HashMap term12322 = new HashMap();
        Set<Object> term12844 =  ((Map) term12322).keySet();
        HashSet term12321 = new HashSet((Collection<? extends Object>) term12844);
        ArrayList term12323 = new ArrayList();
        ((ArrayList) term12323).add((Object)null);
        LinkedHashMap term12326 = new LinkedHashMap();
        term12317 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12318 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12325 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12318, term12318.getClass(), "tagName", "tPlsykYBqO");
        setBooleanField(term12318, term12318.getClass(), "isBlock", false);
        setBooleanField(term12318, term12318.getClass(), "formatAsBlock", true);
        setBooleanField(term12318, term12318.getClass(), "canContainBlock", false);
        setBooleanField(term12318, term12318.getClass(), "canContainInline", false);
        setBooleanField(term12318, term12318.getClass(), "empty", false);
        setBooleanField(term12318, term12318.getClass(), "selfClosing", false);
        setBooleanField(term12318, term12318.getClass(), "preserveWhitespace", true);
        setField(term12317, term12317.getClass(), "tag", term12318);
        setField(term12317, term12317.getClass(), "classNames", term12321);
        setField(term12317, term12317.getClass(), "parentNode", null);
        setField(term12317, term12317.getClass(), "childNodes", term12323);
        setField(term12325, term12325.getClass(), "attributes", term12326);
        setField(term12317, term12317.getClass(), "attributes", term12325);
        setField(term12317, term12317.getClass(), "baseUri", "MAcUBcBckh");
        setIntField(term12317, term12317.getClass(), "siblingIndex", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term2065;
        callMethod(klass, "normaliseTextNodes", argTypes, term1978, args);
        assertTrue(recursiveEquals(term1978, term12301));
        assertTrue(recursiveEquals(term2065, term12317));
    }

};


