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

public class Element_select_2024628612136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;
     Object term60982;
     Object term60978;

    public Element_select_2024628612136() {
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
        setBooleanField(term1791, term1791.getClass(), "isBlock", false);
        setBooleanField(term1791, term1791.getClass(), "formatAsBlock", false);
        setBooleanField(term1791, term1791.getClass(), "canContainInline", true);
        setBooleanField(term1791, term1791.getClass(), "empty", true);
        setBooleanField(term1791, term1791.getClass(), "selfClosing", true);
        setBooleanField(term1791, term1791.getClass(), "preserveWhitespace", true);
        setBooleanField(term1791, term1791.getClass(), "formList", false);
        setBooleanField(term1791, term1791.getClass(), "formSubmit", false);
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
        ArrayList term60989 = new ArrayList();
        ((ArrayList) term60989).add((Object)null);
        ((ArrayList) term60989).add((Object)null);
        ((ArrayList) term60989).add((Object)null);
        ((ArrayList) term60989).add((Object)null);
        ((ArrayList) term60989).add((Object)null);
        term60982 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60983 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60986 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term60987 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term60988 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term60991 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60992 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60993 = (Object[]) newArray("java.lang.String", 0);
        setField(term60983, term60983.getClass(), "tagName", "ytSBIKXogI");
        setBooleanField(term60983, term60983.getClass(), "isBlock", false);
        setBooleanField(term60983, term60983.getClass(), "formatAsBlock", false);
        setBooleanField(term60983, term60983.getClass(), "canContainInline", true);
        setBooleanField(term60983, term60983.getClass(), "empty", true);
        setBooleanField(term60983, term60983.getClass(), "selfClosing", true);
        setBooleanField(term60983, term60983.getClass(), "preserveWhitespace", true);
        setBooleanField(term60983, term60983.getClass(), "formList", false);
        setBooleanField(term60983, term60983.getClass(), "formSubmit", false);
        setField(term60982, term60982.getClass(), "tag", term60983);
        setField(term60986, term60986.getClass(), "referent", null);
        setField(term60987, term60987.getClass(), "lock", term60988);
        setField(term60987, term60987.getClass(), "head", null);
        setLongField(term60987, term60987.getClass(), "queueLength", 2486810210675247493L);
        setField(term60986, term60986.getClass(), "queue", term60987);
        setField(term60986, term60986.getClass(), "next", null);
        setField(term60986, term60986.getClass(), "discovered", null);
        setField(term60982, term60982.getClass(), "shadowChildrenRef", term60986);
        setField(term60982, term60982.getClass(), "childNodes", term60989);
        setIntField(term60991, term60991.getClass(), "size", 1632125673);
        setField(term60991, term60991.getClass(), "keys", term60992);
        setField(term60991, term60991.getClass(), "vals", term60993);
        setField(term60982, term60982.getClass(), "attributes", term60991);
        setField(term60982, term60982.getClass(), "baseUri", "nHXjMycHlU");
        setField(term60982, term60982.getClass(), "parentNode", null);
        setIntField(term60982, term60982.getClass(), "siblingIndex", 454281060);
        term60978 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term60979 = (Object[]) newArray("java.lang.Object", 0);
        setField(term60978, term60978.getClass(), "elementData", term60979);
        setIntField(term60978, term60978.getClass(), "size", 0);
        setIntField(term60978, term60978.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        Object retValue = callMethod(klass, "select", argTypes, term1790, args);
        assertTrue(recursiveEquals(term1790, term60982));
        assertTrue(recursiveEquals(retValue, term60978));
    }

};


