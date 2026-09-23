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
     Object term1231;
     Object term20411;
     Object term20355;

    public Element_textNodes_938431844107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1253 = new HashMap();
        Set<Object> term20433 =  ((Map) term1253).keySet();
        HashSet term1252 = new HashSet((Collection<? extends Object>) term20433);
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
        HashMap term20416 = new HashMap();
        Set<Object> term20454 =  ((Map) term20416).keySet();
        HashSet term20415 = new HashSet((Collection<? extends Object>) term20454);
        ArrayList term20417 = new ArrayList();
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        LinkedHashMap term20420 = new LinkedHashMap();
        term20411 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20412 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20419 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20412, term20412.getClass(), "tagName", "AKNapTAfmD");
        setBooleanField(term20412, term20412.getClass(), "isBlock", true);
        setBooleanField(term20412, term20412.getClass(), "formatAsBlock", true);
        setBooleanField(term20412, term20412.getClass(), "canContainBlock", false);
        setBooleanField(term20412, term20412.getClass(), "canContainInline", true);
        setBooleanField(term20412, term20412.getClass(), "empty", true);
        setBooleanField(term20412, term20412.getClass(), "selfClosing", true);
        setBooleanField(term20412, term20412.getClass(), "preserveWhitespace", false);
        setField(term20411, term20411.getClass(), "tag", term20412);
        setField(term20411, term20411.getClass(), "classNames", term20415);
        setField(term20411, term20411.getClass(), "parentNode", null);
        setField(term20411, term20411.getClass(), "childNodes", term20417);
        setField(term20419, term20419.getClass(), "attributes", term20420);
        setField(term20411, term20411.getClass(), "attributes", term20419);
        setField(term20411, term20411.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term20411, term20411.getClass(), "siblingIndex", 1585847225);
        ArrayList term20356 = new ArrayList();
        term20355 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term20355, term20355.getClass(), "list", term20356);
        setField(term20355, term20355.getClass(), "c", term20356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1231, args);
        assertTrue(recursiveEquals(term1231, term20411));
        assertTrue(recursiveEquals(retValue, term20355));
    }

};


