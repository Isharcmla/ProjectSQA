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

public class Element_select_2024628612138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;
     Object term61940;
     Object term61936;

    public Element_select_2024628612138() {
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
        setBooleanField(term1791, term1791.getClass(), "formatAsBlock", true);
        setBooleanField(term1791, term1791.getClass(), "canContainInline", false);
        setBooleanField(term1791, term1791.getClass(), "empty", false);
        setBooleanField(term1791, term1791.getClass(), "selfClosing", false);
        setBooleanField(term1791, term1791.getClass(), "preserveWhitespace", false);
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
        ArrayList term61947 = new ArrayList();
        ((ArrayList) term61947).add((Object)null);
        ((ArrayList) term61947).add((Object)null);
        ((ArrayList) term61947).add((Object)null);
        ((ArrayList) term61947).add((Object)null);
        ((ArrayList) term61947).add((Object)null);
        term61940 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term61941 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61944 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term61945 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term61946 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term61949 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term61950 = (Object[]) newArray("java.lang.String", 0);
        Object[] term61951 = (Object[]) newArray("java.lang.String", 0);
        setField(term61941, term61941.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term61941, term61941.getClass(), "isBlock", true);
        setBooleanField(term61941, term61941.getClass(), "formatAsBlock", true);
        setBooleanField(term61941, term61941.getClass(), "canContainInline", false);
        setBooleanField(term61941, term61941.getClass(), "empty", false);
        setBooleanField(term61941, term61941.getClass(), "selfClosing", false);
        setBooleanField(term61941, term61941.getClass(), "preserveWhitespace", false);
        setBooleanField(term61941, term61941.getClass(), "formList", true);
        setBooleanField(term61941, term61941.getClass(), "formSubmit", true);
        setField(term61940, term61940.getClass(), "tag", term61941);
        setField(term61944, term61944.getClass(), "referent", null);
        setField(term61945, term61945.getClass(), "lock", term61946);
        setField(term61945, term61945.getClass(), "head", null);
        setLongField(term61945, term61945.getClass(), "queueLength", 2486810210675247493L);
        setField(term61944, term61944.getClass(), "queue", term61945);
        setField(term61944, term61944.getClass(), "next", null);
        setField(term61944, term61944.getClass(), "discovered", null);
        setField(term61940, term61940.getClass(), "shadowChildrenRef", term61944);
        setField(term61940, term61940.getClass(), "childNodes", term61947);
        setIntField(term61949, term61949.getClass(), "size", 1632125673);
        setField(term61949, term61949.getClass(), "keys", term61950);
        setField(term61949, term61949.getClass(), "vals", term61951);
        setField(term61940, term61940.getClass(), "attributes", term61949);
        setField(term61940, term61940.getClass(), "baseUri", "nHXjMycHlU");
        setField(term61940, term61940.getClass(), "parentNode", null);
        setIntField(term61940, term61940.getClass(), "siblingIndex", 454281060);
        term61936 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term61937 = (Object[]) newArray("java.lang.Object", 0);
        setField(term61936, term61936.getClass(), "elementData", term61937);
        setIntField(term61936, term61936.getClass(), "size", 0);
        setIntField(term61936, term61936.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        Object retValue = callMethod(klass, "select", argTypes, term1790, args);
        assertTrue(recursiveEquals(term1790, term61940));
        assertTrue(recursiveEquals(retValue, term61936));
    }

};


