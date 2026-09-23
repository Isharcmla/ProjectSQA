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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FormElement_equals_81763627611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;
     Object term512;
     Object term2540;
     Object term2552;

    public FormElement_equals_81763627611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term483 = new ArrayList();
        ((ArrayList) term483).add((Object)null);
        ((ArrayList) term483).add((Object)null);
        ((ArrayList) term483).add((Object)null);
        ((ArrayList) term483).add((Object)null);
        ((ArrayList) term483).add((Object)null);
        ((ArrayList) term483).add((Object)null);
        LinkedHashMap term488 = new LinkedHashMap();
        term456 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term457 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term458 = (Object[]) newArray("java.lang.Object", 0);
        Object term461 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term487 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term457, term457.getClass(), "elementData", term458);
        setIntField(term457, term457.getClass(), "size", 0);
        setIntField(term457, term457.getClass(), "modCount", 0);
        setField(term456, term456.getClass(), "elements", term457);
        setField(term461, term461.getClass(), "tagName", "OWDIEULEFu");
        setBooleanField(term461, term461.getClass(), "isBlock", true);
        setBooleanField(term461, term461.getClass(), "formatAsBlock", false);
        setBooleanField(term461, term461.getClass(), "canContainBlock", false);
        setBooleanField(term461, term461.getClass(), "canContainInline", true);
        setBooleanField(term461, term461.getClass(), "empty", false);
        setBooleanField(term461, term461.getClass(), "selfClosing", false);
        setBooleanField(term461, term461.getClass(), "preserveWhitespace", false);
        setBooleanField(term461, term461.getClass(), "formList", false);
        setBooleanField(term461, term461.getClass(), "formSubmit", true);
        setField(term456, term456.getClass(), "tag", term461);
        setField(term456, term456.getClass(), "parentNode", null);
        setField(term456, term456.getClass(), "childNodes", term483);
        setField(term487, term487.getClass(), "attributes", term488);
        setField(term456, term456.getClass(), "attributes", term487);
        setField(term456, term456.getClass(), "baseUri", "kuTXqwMtDB");
        setIntField(term456, term456.getClass(), "siblingIndex", -616727354);
        term512 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term2546 = new ArrayList();
        ((ArrayList) term2546).add((Object)null);
        ((ArrayList) term2546).add((Object)null);
        ((ArrayList) term2546).add((Object)null);
        ((ArrayList) term2546).add((Object)null);
        ((ArrayList) term2546).add((Object)null);
        ((ArrayList) term2546).add((Object)null);
        LinkedHashMap term2549 = new LinkedHashMap();
        term2540 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term2541 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term2542 = (Object[]) newArray("java.lang.Object", 0);
        Object term2543 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2548 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2541, term2541.getClass(), "elementData", term2542);
        setIntField(term2541, term2541.getClass(), "size", 0);
        setIntField(term2541, term2541.getClass(), "modCount", 0);
        setField(term2540, term2540.getClass(), "elements", term2541);
        setField(term2543, term2543.getClass(), "tagName", "OWDIEULEFu");
        setBooleanField(term2543, term2543.getClass(), "isBlock", true);
        setBooleanField(term2543, term2543.getClass(), "formatAsBlock", false);
        setBooleanField(term2543, term2543.getClass(), "canContainBlock", false);
        setBooleanField(term2543, term2543.getClass(), "canContainInline", true);
        setBooleanField(term2543, term2543.getClass(), "empty", false);
        setBooleanField(term2543, term2543.getClass(), "selfClosing", false);
        setBooleanField(term2543, term2543.getClass(), "preserveWhitespace", false);
        setBooleanField(term2543, term2543.getClass(), "formList", false);
        setBooleanField(term2543, term2543.getClass(), "formSubmit", true);
        setField(term2540, term2540.getClass(), "tag", term2543);
        setField(term2540, term2540.getClass(), "parentNode", null);
        setField(term2540, term2540.getClass(), "childNodes", term2546);
        setField(term2548, term2548.getClass(), "attributes", term2549);
        setField(term2540, term2540.getClass(), "attributes", term2548);
        setField(term2540, term2540.getClass(), "baseUri", "kuTXqwMtDB");
        setIntField(term2540, term2540.getClass(), "siblingIndex", -616727354);
        term2552 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "equals", argTypes, term456, args);
        assertTrue(recursiveEquals(term456, term2540));
        assertTrue(recursiveEquals(term512, term2552));
    }

};


