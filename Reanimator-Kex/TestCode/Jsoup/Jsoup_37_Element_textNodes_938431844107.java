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

public class Element_textNodes_938431844107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term11708;
     Object term11650;

    public Element_textNodes_938431844107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1283 = new HashMap();
        Set<Object> term11730 =  ((Map) term1283).keySet();
        HashSet term1282 = new HashSet((Collection<? extends Object>) term11730);
        ArrayList term1299 = new ArrayList();
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        LinkedHashMap term1304 = new LinkedHashMap();
        term1259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1303 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1260, term1260.getClass(), "tagName", "AKNapTAfmD");
        setBooleanField(term1260, term1260.getClass(), "isBlock", true);
        setBooleanField(term1260, term1260.getClass(), "formatAsBlock", false);
        setBooleanField(term1260, term1260.getClass(), "canContainBlock", false);
        setBooleanField(term1260, term1260.getClass(), "canContainInline", true);
        setBooleanField(term1260, term1260.getClass(), "empty", true);
        setBooleanField(term1260, term1260.getClass(), "selfClosing", true);
        setBooleanField(term1260, term1260.getClass(), "preserveWhitespace", false);
        setBooleanField(term1260, term1260.getClass(), "formList", true);
        setBooleanField(term1260, term1260.getClass(), "formSubmit", false);
        setField(term1259, term1259.getClass(), "tag", term1260);
        setField(term1259, term1259.getClass(), "classNames", term1282);
        setField(term1259, term1259.getClass(), "parentNode", null);
        setField(term1259, term1259.getClass(), "childNodes", term1299);
        setField(term1303, term1303.getClass(), "attributes", term1304);
        setField(term1259, term1259.getClass(), "attributes", term1303);
        setField(term1259, term1259.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term1259, term1259.getClass(), "siblingIndex", 1585847225);
        HashMap term11713 = new HashMap();
        Set<Object> term11751 =  ((Map) term11713).keySet();
        HashSet term11712 = new HashSet((Collection<? extends Object>) term11751);
        ArrayList term11714 = new ArrayList();
        ((ArrayList) term11714).add((Object)null);
        ((ArrayList) term11714).add((Object)null);
        ((ArrayList) term11714).add((Object)null);
        LinkedHashMap term11717 = new LinkedHashMap();
        term11708 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11709 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11716 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11709, term11709.getClass(), "tagName", "AKNapTAfmD");
        setBooleanField(term11709, term11709.getClass(), "isBlock", true);
        setBooleanField(term11709, term11709.getClass(), "formatAsBlock", false);
        setBooleanField(term11709, term11709.getClass(), "canContainBlock", false);
        setBooleanField(term11709, term11709.getClass(), "canContainInline", true);
        setBooleanField(term11709, term11709.getClass(), "empty", true);
        setBooleanField(term11709, term11709.getClass(), "selfClosing", true);
        setBooleanField(term11709, term11709.getClass(), "preserveWhitespace", false);
        setBooleanField(term11709, term11709.getClass(), "formList", true);
        setBooleanField(term11709, term11709.getClass(), "formSubmit", false);
        setField(term11708, term11708.getClass(), "tag", term11709);
        setField(term11708, term11708.getClass(), "classNames", term11712);
        setField(term11708, term11708.getClass(), "parentNode", null);
        setField(term11708, term11708.getClass(), "childNodes", term11714);
        setField(term11716, term11716.getClass(), "attributes", term11717);
        setField(term11708, term11708.getClass(), "attributes", term11716);
        setField(term11708, term11708.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term11708, term11708.getClass(), "siblingIndex", 1585847225);
        ArrayList term11651 = new ArrayList();
        term11650 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11650, term11650.getClass(), "list", term11651);
        setField(term11650, term11650.getClass(), "c", term11651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1259, args);
        assertTrue(recursiveEquals(term1259, term11708));
        assertTrue(recursiveEquals(retValue, term11650));
    }

};


