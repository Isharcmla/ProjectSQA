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

public class Element_selectFirst_2005301264139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;
     Object term62770;

    public Element_selectFirst_2005301264139() {
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
        setBooleanField(term1880, term1880.getClass(), "formatAsBlock", true);
        setBooleanField(term1880, term1880.getClass(), "canContainInline", false);
        setBooleanField(term1880, term1880.getClass(), "empty", false);
        setBooleanField(term1880, term1880.getClass(), "selfClosing", true);
        setBooleanField(term1880, term1880.getClass(), "preserveWhitespace", false);
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
        ArrayList term62777 = new ArrayList();
        ((ArrayList) term62777).add((Object)null);
        ((ArrayList) term62777).add((Object)null);
        ((ArrayList) term62777).add((Object)null);
        ((ArrayList) term62777).add((Object)null);
        ((ArrayList) term62777).add((Object)null);
        ((ArrayList) term62777).add((Object)null);
        term62770 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term62771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62774 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term62775 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term62776 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term62779 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62780 = (Object[]) newArray("java.lang.String", 0);
        Object[] term62781 = (Object[]) newArray("java.lang.String", 0);
        setField(term62771, term62771.getClass(), "tagName", "dEnhdmILtU");
        setBooleanField(term62771, term62771.getClass(), "isBlock", true);
        setBooleanField(term62771, term62771.getClass(), "formatAsBlock", true);
        setBooleanField(term62771, term62771.getClass(), "canContainInline", false);
        setBooleanField(term62771, term62771.getClass(), "empty", false);
        setBooleanField(term62771, term62771.getClass(), "selfClosing", true);
        setBooleanField(term62771, term62771.getClass(), "preserveWhitespace", false);
        setBooleanField(term62771, term62771.getClass(), "formList", true);
        setBooleanField(term62771, term62771.getClass(), "formSubmit", true);
        setField(term62770, term62770.getClass(), "tag", term62771);
        setField(term62774, term62774.getClass(), "referent", null);
        setField(term62775, term62775.getClass(), "lock", term62776);
        setField(term62775, term62775.getClass(), "head", null);
        setLongField(term62775, term62775.getClass(), "queueLength", 7009926388951271268L);
        setField(term62774, term62774.getClass(), "queue", term62775);
        setField(term62774, term62774.getClass(), "next", null);
        setField(term62774, term62774.getClass(), "discovered", null);
        setField(term62770, term62770.getClass(), "shadowChildrenRef", term62774);
        setField(term62770, term62770.getClass(), "childNodes", term62777);
        setIntField(term62779, term62779.getClass(), "size", -1786399638);
        setField(term62779, term62779.getClass(), "keys", term62780);
        setField(term62779, term62779.getClass(), "vals", term62781);
        setField(term62770, term62770.getClass(), "attributes", term62779);
        setField(term62770, term62770.getClass(), "baseUri", "hoicvmsovO");
        setField(term62770, term62770.getClass(), "parentNode", null);
        setIntField(term62770, term62770.getClass(), "siblingIndex", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        Object retValue = callMethod(klass, "selectFirst", argTypes, term1879, args);
        assertTrue(recursiveEquals(term1879, term62770));
        assertTrue(recursiveEquals(retValue, null));
    }

};


