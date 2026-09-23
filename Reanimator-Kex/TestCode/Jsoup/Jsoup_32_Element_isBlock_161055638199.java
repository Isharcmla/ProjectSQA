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

public class Element_isBlock_161055638199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;
     Object term10172;

    public Element_isBlock_161055638199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term506 = new HashMap();
        Set<Object> term10194 =  ((Map) term506).keySet();
        HashSet term505 = new HashSet((Collection<? extends Object>) term10194);
        ArrayList term520 = new ArrayList();
        ((ArrayList) term520).add((Object)null);
        LinkedHashMap term525 = new LinkedHashMap();
        term484 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term485 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term524 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term485, term485.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term485, term485.getClass(), "isBlock", true);
        setBooleanField(term485, term485.getClass(), "formatAsBlock", true);
        setBooleanField(term485, term485.getClass(), "canContainBlock", false);
        setBooleanField(term485, term485.getClass(), "canContainInline", true);
        setBooleanField(term485, term485.getClass(), "empty", true);
        setBooleanField(term485, term485.getClass(), "selfClosing", true);
        setBooleanField(term485, term485.getClass(), "preserveWhitespace", false);
        setField(term484, term484.getClass(), "tag", term485);
        setField(term484, term484.getClass(), "classNames", term505);
        setField(term484, term484.getClass(), "parentNode", null);
        setField(term484, term484.getClass(), "childNodes", term520);
        setField(term524, term524.getClass(), "attributes", term525);
        setField(term484, term484.getClass(), "attributes", term524);
        setField(term484, term484.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term484, term484.getClass(), "siblingIndex", -1922583790);
        HashMap term10177 = new HashMap();
        Set<Object> term10215 =  ((Map) term10177).keySet();
        HashSet term10176 = new HashSet((Collection<? extends Object>) term10215);
        ArrayList term10178 = new ArrayList();
        ((ArrayList) term10178).add((Object)null);
        LinkedHashMap term10181 = new LinkedHashMap();
        term10172 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10173 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10180 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10173, term10173.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term10173, term10173.getClass(), "isBlock", true);
        setBooleanField(term10173, term10173.getClass(), "formatAsBlock", true);
        setBooleanField(term10173, term10173.getClass(), "canContainBlock", false);
        setBooleanField(term10173, term10173.getClass(), "canContainInline", true);
        setBooleanField(term10173, term10173.getClass(), "empty", true);
        setBooleanField(term10173, term10173.getClass(), "selfClosing", true);
        setBooleanField(term10173, term10173.getClass(), "preserveWhitespace", false);
        setField(term10172, term10172.getClass(), "tag", term10173);
        setField(term10172, term10172.getClass(), "classNames", term10176);
        setField(term10172, term10172.getClass(), "parentNode", null);
        setField(term10172, term10172.getClass(), "childNodes", term10178);
        setField(term10180, term10180.getClass(), "attributes", term10181);
        setField(term10172, term10172.getClass(), "attributes", term10180);
        setField(term10172, term10172.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term10172, term10172.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term484, args);
        assertTrue(recursiveEquals(term484, term10172));
    }

};


