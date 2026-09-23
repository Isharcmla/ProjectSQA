package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class Parser_parseAttribute_147721330310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1942;

    public Parser_parseAttribute_147721330310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term1958 = new HashSet();
        ArrayList term1959 = new ArrayList();
        ((ArrayList) term1959).add((Object)null);
        ((ArrayList) term1959).add((Object)null);
        ((ArrayList) term1959).add((Object)null);
        Object term1946 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1962 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1947, term1947.getClass(), "tagName", null);
        setBooleanField(term1947, term1947.getClass(), "knownTag", false);
        setBooleanField(term1947, term1947.getClass(), "isBlock", false);
        setBooleanField(term1947, term1947.getClass(), "canContainBlock", false);
        setBooleanField(term1947, term1947.getClass(), "canContainInline", false);
        setBooleanField(term1947, term1947.getClass(), "optionalClosing", true);
        setBooleanField(term1947, term1947.getClass(), "empty", true);
        setBooleanField(term1947, term1947.getClass(), "selfClosing", false);
        setBooleanField(term1947, term1947.getClass(), "preserveWhitespace", false);
        setField(term1947, term1947.getClass(), "ancestors", null);
        setField(term1947, term1947.getClass(), "excludes", null);
        setBooleanField(term1947, term1947.getClass(), "directDescendant", true);
        setBooleanField(term1947, term1947.getClass(), "limitChildren", false);
        setField(term1946, term1946.getClass(), "tag", term1947);
        setField(term1946, term1946.getClass(), "classNames", term1958);
        setField(term1946, term1946.getClass(), "parentNode", null);
        setField(term1946, term1946.getClass(), "childNodes", term1959);
        setField(term1962, term1962.getClass(), "attributes", null);
        setField(term1946, term1946.getClass(), "attributes", term1962);
        setField(term1946, term1946.getClass(), "baseUri", "");
        setIntField(term1946, term1946.getClass(), "siblingIndex", -2068769794);
        Object term1966 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1966, term1966.getClass(), "tag", null);
        setField(term1966, term1966.getClass(), "classNames", null);
        setField(term1966, term1966.getClass(), "parentNode", null);
        setField(term1966, term1966.getClass(), "childNodes", null);
        setField(term1966, term1966.getClass(), "attributes", null);
        setField(term1966, term1966.getClass(), "baseUri", null);
        setIntField(term1966, term1966.getClass(), "siblingIndex", -117576464);
        LinkedList term1943 = new LinkedList();
        ((LinkedList) term1943).add(term1946);
        ((LinkedList) term1943).add(term1966);
        ((LinkedList) term1943).add((Object)null);
        ((LinkedList) term1943).add((Object)null);
        ((LinkedList) term1943).add((Object)null);
        Class<? extends Object> term2098 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term2097 = ((Class) term2098).getDeclaredField((String) "base");
        ((Field) term2097).setAccessible(true);
        Object enum5 = ((Field) term2097).get((Object) null);
        ArrayList term2033 = new ArrayList();
        ((ArrayList) term2033).add((Object)null);
        Object term1971 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1971, term1971.getClass(), "tagName", null);
        setBooleanField(term1971, term1971.getClass(), "knownTag", false);
        setBooleanField(term1971, term1971.getClass(), "isBlock", false);
        setBooleanField(term1971, term1971.getClass(), "canContainBlock", false);
        setBooleanField(term1971, term1971.getClass(), "canContainInline", false);
        setBooleanField(term1971, term1971.getClass(), "optionalClosing", false);
        setBooleanField(term1971, term1971.getClass(), "empty", false);
        setBooleanField(term1971, term1971.getClass(), "selfClosing", false);
        setBooleanField(term1971, term1971.getClass(), "preserveWhitespace", false);
        setField(term1971, term1971.getClass(), "ancestors", null);
        setField(term1971, term1971.getClass(), "excludes", null);
        setBooleanField(term1971, term1971.getClass(), "directDescendant", false);
        setBooleanField(term1971, term1971.getClass(), "limitChildren", false);
        ArrayList term2037 = new ArrayList();
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add(term1971);
        ((ArrayList) term2037).add(term1971);
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add((Object)null);
        ((ArrayList) term2037).add((Object)null);
        HashMap term2044 = new HashMap();
        Set<Object> term2301 =  ((Map) term2044).keySet();
        HashSet term2043 = new HashSet((Collection<? extends Object>) term2301);
        ArrayList term2050 = new ArrayList();
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        ((ArrayList) term2050).add((Object)null);
        LinkedHashMap term2055 = new LinkedHashMap();
        term1942 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1993 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term2007 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2008 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2012 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1942, term1942.getClass(), "stack", term1943);
        setField(term1993, term1993.getClass(), "queue", "OYbzXylRWW");
        setIntField(term1993, term1993.getClass(), "pos", 865208305);
        setField(term1942, term1942.getClass(), "tq", term1993);
        setField(term2008, term2008.getClass(), "escapeMode", enum5);
        setField(term2008, term2008.getClass(), "charset", null);
        setField(term2008, term2008.getClass(), "charsetEncoder", null);
        setField(term2008, term2008.getClass(), "this$0", null);
        setField(term2007, term2007.getClass(), "outputSettings", term2008);
        setField(term2012, term2012.getClass(), "tagName", "UfQtPRyWRC");
        setBooleanField(term2012, term2012.getClass(), "knownTag", false);
        setBooleanField(term2012, term2012.getClass(), "isBlock", false);
        setBooleanField(term2012, term2012.getClass(), "canContainBlock", false);
        setBooleanField(term2012, term2012.getClass(), "canContainInline", false);
        setBooleanField(term2012, term2012.getClass(), "optionalClosing", false);
        setBooleanField(term2012, term2012.getClass(), "empty", true);
        setBooleanField(term2012, term2012.getClass(), "selfClosing", false);
        setBooleanField(term2012, term2012.getClass(), "preserveWhitespace", true);
        setField(term2012, term2012.getClass(), "ancestors", term2033);
        setField(term2012, term2012.getClass(), "excludes", term2037);
        setBooleanField(term2012, term2012.getClass(), "directDescendant", false);
        setBooleanField(term2012, term2012.getClass(), "limitChildren", true);
        setField(term2007, term2007.getClass(), "tag", term2012);
        setField(term2007, term2007.getClass(), "classNames", term2043);
        setField(term2007, term2007.getClass(), "parentNode", null);
        setField(term2007, term2007.getClass(), "childNodes", term2050);
        setField(term2054, term2054.getClass(), "attributes", term2055);
        setField(term2007, term2007.getClass(), "attributes", term2054);
        setField(term2007, term2007.getClass(), "baseUri", "lihXWlGDxk");
        setIntField(term2007, term2007.getClass(), "siblingIndex", -1275173084);
        setField(term1942, term1942.getClass(), "doc", term2007);
        setField(term1942, term1942.getClass(), "baseUri", "JmcmxoGhIK");
        setBooleanField(term1942, term1942.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseAttribute", argTypes, term1942, args);
    }

};


