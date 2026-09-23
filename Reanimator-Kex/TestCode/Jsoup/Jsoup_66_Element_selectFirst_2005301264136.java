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

public class Element_selectFirst_2005301264136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;
     Object term15366;

    public Element_selectFirst_2005301264136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1905 = new ArrayList();
        ((ArrayList) term1905).add((Object)null);
        ((ArrayList) term1905).add((Object)null);
        ((ArrayList) term1905).add((Object)null);
        ((ArrayList) term1905).add((Object)null);
        ((ArrayList) term1905).add((Object)null);
        ((ArrayList) term1905).add((Object)null);
        term1879 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1880 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1901 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1902 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1903 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1911 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1912 = (Object[]) newArray("java.lang.String", 0);
        setField(term1880, term1880.getClass(), "tagName", "dEnhdmILtU");
        setBooleanField(term1880, term1880.getClass(), "isBlock", true);
        setBooleanField(term1880, term1880.getClass(), "formatAsBlock", false);
        setBooleanField(term1880, term1880.getClass(), "canContainInline", false);
        setBooleanField(term1880, term1880.getClass(), "empty", true);
        setBooleanField(term1880, term1880.getClass(), "selfClosing", false);
        setBooleanField(term1880, term1880.getClass(), "preserveWhitespace", true);
        setBooleanField(term1880, term1880.getClass(), "formList", true);
        setBooleanField(term1880, term1880.getClass(), "formSubmit", true);
        setField(term1879, term1879.getClass(), "tag", term1880);
        setField(term1901, term1901.getClass(), "referent", null);
        setField(term1902, term1902.getClass(), "lock", term1903);
        setField(term1902, term1902.getClass(), "head", null);
        setLongField(term1902, term1902.getClass(), "queueLength", 7009926388951271268L);
        setField(term1901, term1901.getClass(), "queue", term1902);
        setField(term1901, term1901.getClass(), "next", null);
        setField(term1901, term1901.getClass(), "discovered", null);
        setField(term1879, term1879.getClass(), "shadowChildrenRef", term1901);
        setField(term1879, term1879.getClass(), "childNodes", term1905);
        setIntField(term1909, term1909.getClass(), "size", -1786399638);
        setField(term1909, term1909.getClass(), "keys", term1911);
        setField(term1909, term1909.getClass(), "vals", term1912);
        setField(term1879, term1879.getClass(), "attributes", term1909);
        setField(term1879, term1879.getClass(), "baseUri", "hoicvmsovO");
        setField(term1879, term1879.getClass(), "parentNode", null);
        setIntField(term1879, term1879.getClass(), "siblingIndex", 2055867847);
        ArrayList term15373 = new ArrayList();
        ((ArrayList) term15373).add((Object)null);
        ((ArrayList) term15373).add((Object)null);
        ((ArrayList) term15373).add((Object)null);
        ((ArrayList) term15373).add((Object)null);
        ((ArrayList) term15373).add((Object)null);
        ((ArrayList) term15373).add((Object)null);
        term15366 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term15367 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term15370 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term15371 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term15372 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term15375 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15376 = (Object[]) newArray("java.lang.String", 0);
        Object[] term15377 = (Object[]) newArray("java.lang.String", 0);
        setField(term15367, term15367.getClass(), "tagName", "dEnhdmILtU");
        setBooleanField(term15367, term15367.getClass(), "isBlock", true);
        setBooleanField(term15367, term15367.getClass(), "formatAsBlock", false);
        setBooleanField(term15367, term15367.getClass(), "canContainInline", false);
        setBooleanField(term15367, term15367.getClass(), "empty", true);
        setBooleanField(term15367, term15367.getClass(), "selfClosing", false);
        setBooleanField(term15367, term15367.getClass(), "preserveWhitespace", true);
        setBooleanField(term15367, term15367.getClass(), "formList", true);
        setBooleanField(term15367, term15367.getClass(), "formSubmit", true);
        setField(term15366, term15366.getClass(), "tag", term15367);
        setField(term15370, term15370.getClass(), "referent", null);
        setField(term15371, term15371.getClass(), "lock", term15372);
        setField(term15371, term15371.getClass(), "head", null);
        setLongField(term15371, term15371.getClass(), "queueLength", 7009926388951271268L);
        setField(term15370, term15370.getClass(), "queue", term15371);
        setField(term15370, term15370.getClass(), "next", null);
        setField(term15370, term15370.getClass(), "discovered", null);
        setField(term15366, term15366.getClass(), "shadowChildrenRef", term15370);
        setField(term15366, term15366.getClass(), "childNodes", term15373);
        setIntField(term15375, term15375.getClass(), "size", -1786399638);
        setField(term15375, term15375.getClass(), "keys", term15376);
        setField(term15375, term15375.getClass(), "vals", term15377);
        setField(term15366, term15366.getClass(), "attributes", term15375);
        setField(term15366, term15366.getClass(), "baseUri", "hoicvmsovO");
        setField(term15366, term15366.getClass(), "parentNode", null);
        setIntField(term15366, term15366.getClass(), "siblingIndex", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        Object retValue = callMethod(klass, "selectFirst", argTypes, term1879, args);
        assertTrue(recursiveEquals(term1879, term15366));
        assertTrue(recursiveEquals(retValue, null));
    }

};


