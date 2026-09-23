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

public class Element_select_2024628612135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;
     Object term14536;
     Object term14532;

    public Element_select_2024628612135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1816 = new ArrayList();
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        term1790 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1791 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1812 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1813 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1814 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1820 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1822 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1823 = (Object[]) newArray("java.lang.String", 0);
        setField(term1791, term1791.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term1791, term1791.getClass(), "isBlock", true);
        setBooleanField(term1791, term1791.getClass(), "formatAsBlock", false);
        setBooleanField(term1791, term1791.getClass(), "canContainInline", false);
        setBooleanField(term1791, term1791.getClass(), "empty", false);
        setBooleanField(term1791, term1791.getClass(), "selfClosing", false);
        setBooleanField(term1791, term1791.getClass(), "preserveWhitespace", true);
        setBooleanField(term1791, term1791.getClass(), "formList", true);
        setBooleanField(term1791, term1791.getClass(), "formSubmit", true);
        setField(term1790, term1790.getClass(), "tag", term1791);
        setField(term1812, term1812.getClass(), "referent", null);
        setField(term1813, term1813.getClass(), "lock", term1814);
        setField(term1813, term1813.getClass(), "head", null);
        setLongField(term1813, term1813.getClass(), "queueLength", 2486810210675247493L);
        setField(term1812, term1812.getClass(), "queue", term1813);
        setField(term1812, term1812.getClass(), "next", null);
        setField(term1812, term1812.getClass(), "discovered", null);
        setField(term1790, term1790.getClass(), "shadowChildrenRef", term1812);
        setField(term1790, term1790.getClass(), "childNodes", term1816);
        setIntField(term1820, term1820.getClass(), "size", 1632125673);
        setField(term1820, term1820.getClass(), "keys", term1822);
        setField(term1820, term1820.getClass(), "vals", term1823);
        setField(term1790, term1790.getClass(), "attributes", term1820);
        setField(term1790, term1790.getClass(), "baseUri", "nHXjMycHlU");
        setField(term1790, term1790.getClass(), "parentNode", null);
        setIntField(term1790, term1790.getClass(), "siblingIndex", 454281060);
        ArrayList term14543 = new ArrayList();
        ((ArrayList) term14543).add((Object)null);
        ((ArrayList) term14543).add((Object)null);
        ((ArrayList) term14543).add((Object)null);
        ((ArrayList) term14543).add((Object)null);
        ((ArrayList) term14543).add((Object)null);
        term14536 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term14537 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term14540 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term14541 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term14542 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term14545 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14546 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14547 = (Object[]) newArray("java.lang.String", 0);
        setField(term14537, term14537.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term14537, term14537.getClass(), "isBlock", true);
        setBooleanField(term14537, term14537.getClass(), "formatAsBlock", false);
        setBooleanField(term14537, term14537.getClass(), "canContainInline", false);
        setBooleanField(term14537, term14537.getClass(), "empty", false);
        setBooleanField(term14537, term14537.getClass(), "selfClosing", false);
        setBooleanField(term14537, term14537.getClass(), "preserveWhitespace", true);
        setBooleanField(term14537, term14537.getClass(), "formList", true);
        setBooleanField(term14537, term14537.getClass(), "formSubmit", true);
        setField(term14536, term14536.getClass(), "tag", term14537);
        setField(term14540, term14540.getClass(), "referent", null);
        setField(term14541, term14541.getClass(), "lock", term14542);
        setField(term14541, term14541.getClass(), "head", null);
        setLongField(term14541, term14541.getClass(), "queueLength", 2486810210675247493L);
        setField(term14540, term14540.getClass(), "queue", term14541);
        setField(term14540, term14540.getClass(), "next", null);
        setField(term14540, term14540.getClass(), "discovered", null);
        setField(term14536, term14536.getClass(), "shadowChildrenRef", term14540);
        setField(term14536, term14536.getClass(), "childNodes", term14543);
        setIntField(term14545, term14545.getClass(), "size", 1632125673);
        setField(term14545, term14545.getClass(), "keys", term14546);
        setField(term14545, term14545.getClass(), "vals", term14547);
        setField(term14536, term14536.getClass(), "attributes", term14545);
        setField(term14536, term14536.getClass(), "baseUri", "nHXjMycHlU");
        setField(term14536, term14536.getClass(), "parentNode", null);
        setIntField(term14536, term14536.getClass(), "siblingIndex", 454281060);
        term14532 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term14533 = (Object[]) newArray("java.lang.Object", 0);
        setField(term14532, term14532.getClass(), "elementData", term14533);
        setIntField(term14532, term14532.getClass(), "size", 0);
        setIntField(term14532, term14532.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        Object retValue = callMethod(klass, "select", argTypes, term1790, args);
        assertTrue(recursiveEquals(term1790, term14536));
        assertTrue(recursiveEquals(retValue, term14532));
    }

};


