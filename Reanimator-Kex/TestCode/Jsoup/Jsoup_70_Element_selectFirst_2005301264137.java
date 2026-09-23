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

public class Element_selectFirst_2005301264137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;
     Object term61812;

    public Element_selectFirst_2005301264137() {
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
        setBooleanField(term1880, term1880.getClass(), "canContainInline", true);
        setBooleanField(term1880, term1880.getClass(), "empty", true);
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
        ArrayList term61819 = new ArrayList();
        ((ArrayList) term61819).add((Object)null);
        ((ArrayList) term61819).add((Object)null);
        ((ArrayList) term61819).add((Object)null);
        ((ArrayList) term61819).add((Object)null);
        ((ArrayList) term61819).add((Object)null);
        ((ArrayList) term61819).add((Object)null);
        term61812 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term61813 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61816 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term61817 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term61818 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term61821 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term61822 = (Object[]) newArray("java.lang.String", 0);
        Object[] term61823 = (Object[]) newArray("java.lang.String", 0);
        setField(term61813, term61813.getClass(), "tagName", "dEnhdmILtU");
        setBooleanField(term61813, term61813.getClass(), "isBlock", true);
        setBooleanField(term61813, term61813.getClass(), "formatAsBlock", false);
        setBooleanField(term61813, term61813.getClass(), "canContainInline", true);
        setBooleanField(term61813, term61813.getClass(), "empty", true);
        setBooleanField(term61813, term61813.getClass(), "selfClosing", true);
        setBooleanField(term61813, term61813.getClass(), "preserveWhitespace", false);
        setBooleanField(term61813, term61813.getClass(), "formList", true);
        setBooleanField(term61813, term61813.getClass(), "formSubmit", true);
        setField(term61812, term61812.getClass(), "tag", term61813);
        setField(term61816, term61816.getClass(), "referent", null);
        setField(term61817, term61817.getClass(), "lock", term61818);
        setField(term61817, term61817.getClass(), "head", null);
        setLongField(term61817, term61817.getClass(), "queueLength", 7009926388951271268L);
        setField(term61816, term61816.getClass(), "queue", term61817);
        setField(term61816, term61816.getClass(), "next", null);
        setField(term61816, term61816.getClass(), "discovered", null);
        setField(term61812, term61812.getClass(), "shadowChildrenRef", term61816);
        setField(term61812, term61812.getClass(), "childNodes", term61819);
        setIntField(term61821, term61821.getClass(), "size", -1786399638);
        setField(term61821, term61821.getClass(), "keys", term61822);
        setField(term61821, term61821.getClass(), "vals", term61823);
        setField(term61812, term61812.getClass(), "attributes", term61821);
        setField(term61812, term61812.getClass(), "baseUri", "hoicvmsovO");
        setField(term61812, term61812.getClass(), "parentNode", null);
        setIntField(term61812, term61812.getClass(), "siblingIndex", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        Object retValue = callMethod(klass, "selectFirst", argTypes, term1879, args);
        assertTrue(recursiveEquals(term1879, term61812));
        assertTrue(recursiveEquals(retValue, null));
    }

};


