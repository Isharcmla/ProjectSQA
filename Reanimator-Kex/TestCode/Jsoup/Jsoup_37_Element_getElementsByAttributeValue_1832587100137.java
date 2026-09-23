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

public class Element_getElementsByAttributeValue_1832587100137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4119;
     Object term24264;
     Object term24259;

    public Element_getElementsByAttributeValue_1832587100137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4143 = new HashMap();
        Set<Object> term24290 =  ((Map) term4143).keySet();
        HashSet term4142 = new HashSet((Collection<? extends Object>) term24290);
        ArrayList term4165 = new ArrayList();
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        ((ArrayList) term4165).add((Object)null);
        LinkedHashMap term4170 = new LinkedHashMap();
        term4119 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4120 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4169 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4120, term4120.getClass(), "tagName", "tIpkeYIezR");
        setBooleanField(term4120, term4120.getClass(), "isBlock", false);
        setBooleanField(term4120, term4120.getClass(), "formatAsBlock", false);
        setBooleanField(term4120, term4120.getClass(), "canContainBlock", true);
        setBooleanField(term4120, term4120.getClass(), "canContainInline", false);
        setBooleanField(term4120, term4120.getClass(), "empty", false);
        setBooleanField(term4120, term4120.getClass(), "selfClosing", false);
        setBooleanField(term4120, term4120.getClass(), "preserveWhitespace", false);
        setBooleanField(term4120, term4120.getClass(), "formList", true);
        setBooleanField(term4120, term4120.getClass(), "formSubmit", true);
        setField(term4119, term4119.getClass(), "tag", term4120);
        setField(term4119, term4119.getClass(), "classNames", term4142);
        setField(term4119, term4119.getClass(), "parentNode", null);
        setField(term4119, term4119.getClass(), "childNodes", term4165);
        setField(term4169, term4169.getClass(), "attributes", term4170);
        setField(term4119, term4119.getClass(), "attributes", term4169);
        setField(term4119, term4119.getClass(), "baseUri", "aSATgQUpoe");
        setIntField(term4119, term4119.getClass(), "siblingIndex", -817164822);
        HashMap term24269 = new HashMap();
        Set<Object> term24331 =  ((Map) term24269).keySet();
        HashSet term24268 = new HashSet((Collection<? extends Object>) term24331);
        ArrayList term24270 = new ArrayList();
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        ((ArrayList) term24270).add((Object)null);
        LinkedHashMap term24273 = new LinkedHashMap();
        term24264 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24265 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24272 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24265, term24265.getClass(), "tagName", "tIpkeYIezR");
        setBooleanField(term24265, term24265.getClass(), "isBlock", false);
        setBooleanField(term24265, term24265.getClass(), "formatAsBlock", false);
        setBooleanField(term24265, term24265.getClass(), "canContainBlock", true);
        setBooleanField(term24265, term24265.getClass(), "canContainInline", false);
        setBooleanField(term24265, term24265.getClass(), "empty", false);
        setBooleanField(term24265, term24265.getClass(), "selfClosing", false);
        setBooleanField(term24265, term24265.getClass(), "preserveWhitespace", false);
        setBooleanField(term24265, term24265.getClass(), "formList", true);
        setBooleanField(term24265, term24265.getClass(), "formSubmit", true);
        setField(term24264, term24264.getClass(), "tag", term24265);
        setField(term24264, term24264.getClass(), "classNames", term24268);
        setField(term24264, term24264.getClass(), "parentNode", null);
        setField(term24264, term24264.getClass(), "childNodes", term24270);
        setField(term24272, term24272.getClass(), "attributes", term24273);
        setField(term24264, term24264.getClass(), "attributes", term24272);
        setField(term24264, term24264.getClass(), "baseUri", "aSATgQUpoe");
        setIntField(term24264, term24264.getClass(), "siblingIndex", -817164822);
        ArrayList term24260 = new ArrayList();
        term24259 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term24259, term24259.getClass(), "contents", term24260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "VkPSXewZfB";
        args[1] = "ubodzJoMGW";
        Object retValue = callMethod(klass, "getElementsByAttributeValue", argTypes, term4119, args);
        assertTrue(recursiveEquals(term4119, term24264));
        assertTrue(recursiveEquals(retValue, term24259));
    }

};


