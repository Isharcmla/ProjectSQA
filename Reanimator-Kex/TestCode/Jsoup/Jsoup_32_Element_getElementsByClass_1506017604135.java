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

public class Element_getElementsByClass_1506017604135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3724;
     Object term22587;
     Object term22582;

    public Element_getElementsByClass_1506017604135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3746 = new HashMap();
        Set<Object> term22612 =  ((Map) term3746).keySet();
        HashSet term3745 = new HashSet((Collection<? extends Object>) term22612);
        ArrayList term3754 = new ArrayList();
        ((ArrayList) term3754).add((Object)null);
        ((ArrayList) term3754).add((Object)null);
        LinkedHashMap term3759 = new LinkedHashMap();
        term3724 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3725 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3758 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3725, term3725.getClass(), "tagName", "CVRGEomOth");
        setBooleanField(term3725, term3725.getClass(), "isBlock", true);
        setBooleanField(term3725, term3725.getClass(), "formatAsBlock", true);
        setBooleanField(term3725, term3725.getClass(), "canContainBlock", false);
        setBooleanField(term3725, term3725.getClass(), "canContainInline", false);
        setBooleanField(term3725, term3725.getClass(), "empty", false);
        setBooleanField(term3725, term3725.getClass(), "selfClosing", false);
        setBooleanField(term3725, term3725.getClass(), "preserveWhitespace", true);
        setField(term3724, term3724.getClass(), "tag", term3725);
        setField(term3724, term3724.getClass(), "classNames", term3745);
        setField(term3724, term3724.getClass(), "parentNode", null);
        setField(term3724, term3724.getClass(), "childNodes", term3754);
        setField(term3758, term3758.getClass(), "attributes", term3759);
        setField(term3724, term3724.getClass(), "attributes", term3758);
        setField(term3724, term3724.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term3724, term3724.getClass(), "siblingIndex", -602026508);
        HashMap term22592 = new HashMap();
        Set<Object> term22643 =  ((Map) term22592).keySet();
        HashSet term22591 = new HashSet((Collection<? extends Object>) term22643);
        ArrayList term22594 = new ArrayList();
        ((ArrayList) term22594).add((Object)null);
        ((ArrayList) term22594).add((Object)null);
        LinkedHashMap term22597 = new LinkedHashMap();
        term22587 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22588 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22596 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22588, term22588.getClass(), "tagName", "CVRGEomOth");
        setBooleanField(term22588, term22588.getClass(), "isBlock", true);
        setBooleanField(term22588, term22588.getClass(), "formatAsBlock", true);
        setBooleanField(term22588, term22588.getClass(), "canContainBlock", false);
        setBooleanField(term22588, term22588.getClass(), "canContainInline", false);
        setBooleanField(term22588, term22588.getClass(), "empty", false);
        setBooleanField(term22588, term22588.getClass(), "selfClosing", false);
        setBooleanField(term22588, term22588.getClass(), "preserveWhitespace", true);
        setField(term22587, term22587.getClass(), "tag", term22588);
        setField(term22587, term22587.getClass(), "classNames", term22591);
        setField(term22587, term22587.getClass(), "parentNode", null);
        setField(term22587, term22587.getClass(), "childNodes", term22594);
        setField(term22596, term22596.getClass(), "attributes", term22597);
        setField(term22587, term22587.getClass(), "attributes", term22596);
        setField(term22587, term22587.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term22587, term22587.getClass(), "siblingIndex", -602026508);
        ArrayList term22583 = new ArrayList();
        term22582 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term22582, term22582.getClass(), "contents", term22583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bKBSncrMEZ";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term3724, args);
        assertTrue(recursiveEquals(term3724, term22587));
        assertTrue(recursiveEquals(retValue, term22582));
    }

};


