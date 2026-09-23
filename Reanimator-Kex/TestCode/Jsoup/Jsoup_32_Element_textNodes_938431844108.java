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

public class Element_textNodes_938431844108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;
     Object term11806;
     Object term11750;

    public Element_textNodes_938431844108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1253 = new HashMap();
        Set<Object> term11828 =  ((Map) term1253).keySet();
        HashSet term1252 = new HashSet((Collection<? extends Object>) term11828);
        ArrayList term1269 = new ArrayList();
        ((ArrayList) term1269).add((Object)null);
        ((ArrayList) term1269).add((Object)null);
        ((ArrayList) term1269).add((Object)null);
        LinkedHashMap term1274 = new LinkedHashMap();
        term1231 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1232 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1273 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1232, term1232.getClass(), "tagName", "AKNapTAfmD");
        setBooleanField(term1232, term1232.getClass(), "isBlock", true);
        setBooleanField(term1232, term1232.getClass(), "formatAsBlock", true);
        setBooleanField(term1232, term1232.getClass(), "canContainBlock", false);
        setBooleanField(term1232, term1232.getClass(), "canContainInline", true);
        setBooleanField(term1232, term1232.getClass(), "empty", true);
        setBooleanField(term1232, term1232.getClass(), "selfClosing", true);
        setBooleanField(term1232, term1232.getClass(), "preserveWhitespace", false);
        setField(term1231, term1231.getClass(), "tag", term1232);
        setField(term1231, term1231.getClass(), "classNames", term1252);
        setField(term1231, term1231.getClass(), "parentNode", null);
        setField(term1231, term1231.getClass(), "childNodes", term1269);
        setField(term1273, term1273.getClass(), "attributes", term1274);
        setField(term1231, term1231.getClass(), "attributes", term1273);
        setField(term1231, term1231.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term1231, term1231.getClass(), "siblingIndex", 1585847225);
        HashMap term11811 = new HashMap();
        Set<Object> term11849 =  ((Map) term11811).keySet();
        HashSet term11810 = new HashSet((Collection<? extends Object>) term11849);
        ArrayList term11812 = new ArrayList();
        ((ArrayList) term11812).add((Object)null);
        ((ArrayList) term11812).add((Object)null);
        ((ArrayList) term11812).add((Object)null);
        LinkedHashMap term11815 = new LinkedHashMap();
        term11806 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11807 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11814 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11807, term11807.getClass(), "tagName", "AKNapTAfmD");
        setBooleanField(term11807, term11807.getClass(), "isBlock", true);
        setBooleanField(term11807, term11807.getClass(), "formatAsBlock", true);
        setBooleanField(term11807, term11807.getClass(), "canContainBlock", false);
        setBooleanField(term11807, term11807.getClass(), "canContainInline", true);
        setBooleanField(term11807, term11807.getClass(), "empty", true);
        setBooleanField(term11807, term11807.getClass(), "selfClosing", true);
        setBooleanField(term11807, term11807.getClass(), "preserveWhitespace", false);
        setField(term11806, term11806.getClass(), "tag", term11807);
        setField(term11806, term11806.getClass(), "classNames", term11810);
        setField(term11806, term11806.getClass(), "parentNode", null);
        setField(term11806, term11806.getClass(), "childNodes", term11812);
        setField(term11814, term11814.getClass(), "attributes", term11815);
        setField(term11806, term11806.getClass(), "attributes", term11814);
        setField(term11806, term11806.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term11806, term11806.getClass(), "siblingIndex", 1585847225);
        ArrayList term11751 = new ArrayList();
        term11750 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11750, term11750.getClass(), "list", term11751);
        setField(term11750, term11750.getClass(), "c", term11751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1231, args);
        assertTrue(recursiveEquals(term1231, term11806));
        assertTrue(recursiveEquals(retValue, term11750));
    }

};


