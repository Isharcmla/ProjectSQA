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

public class Element_textNodes_938431844134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;
     Object term60065;
     Object term60013;

    public Element_textNodes_938431844134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1682 = new ArrayList();
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        ((ArrayList) term1682).add((Object)null);
        term1656 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1657 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1678 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1679 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1680 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1686 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1688 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1689 = (Object[]) newArray("java.lang.String", 0);
        setField(term1657, term1657.getClass(), "tagName", "onpbIeEKoi");
        setBooleanField(term1657, term1657.getClass(), "isBlock", true);
        setBooleanField(term1657, term1657.getClass(), "formatAsBlock", true);
        setBooleanField(term1657, term1657.getClass(), "canContainInline", true);
        setBooleanField(term1657, term1657.getClass(), "empty", true);
        setBooleanField(term1657, term1657.getClass(), "selfClosing", false);
        setBooleanField(term1657, term1657.getClass(), "preserveWhitespace", true);
        setBooleanField(term1657, term1657.getClass(), "formList", true);
        setBooleanField(term1657, term1657.getClass(), "formSubmit", false);
        setField(term1656, term1656.getClass(), "tag", term1657);
        setField(term1678, term1678.getClass(), "referent", null);
        setField(term1679, term1679.getClass(), "lock", term1680);
        setField(term1679, term1679.getClass(), "head", null);
        setLongField(term1679, term1679.getClass(), "queueLength", 8059786003080744426L);
        setField(term1678, term1678.getClass(), "queue", term1679);
        setField(term1678, term1678.getClass(), "next", null);
        setField(term1678, term1678.getClass(), "discovered", null);
        setField(term1656, term1656.getClass(), "shadowChildrenRef", term1678);
        setField(term1656, term1656.getClass(), "childNodes", term1682);
        setIntField(term1686, term1686.getClass(), "size", -1016503459);
        setField(term1686, term1686.getClass(), "keys", term1688);
        setField(term1686, term1686.getClass(), "vals", term1689);
        setField(term1656, term1656.getClass(), "attributes", term1686);
        setField(term1656, term1656.getClass(), "baseUri", "YRHGsAkhxb");
        setField(term1656, term1656.getClass(), "parentNode", null);
        setIntField(term1656, term1656.getClass(), "siblingIndex", -1968847291);
        ArrayList term60072 = new ArrayList();
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        ((ArrayList) term60072).add((Object)null);
        term60065 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60069 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term60070 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term60071 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term60074 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60075 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60076 = (Object[]) newArray("java.lang.String", 0);
        setField(term60066, term60066.getClass(), "tagName", "onpbIeEKoi");
        setBooleanField(term60066, term60066.getClass(), "isBlock", true);
        setBooleanField(term60066, term60066.getClass(), "formatAsBlock", true);
        setBooleanField(term60066, term60066.getClass(), "canContainInline", true);
        setBooleanField(term60066, term60066.getClass(), "empty", true);
        setBooleanField(term60066, term60066.getClass(), "selfClosing", false);
        setBooleanField(term60066, term60066.getClass(), "preserveWhitespace", true);
        setBooleanField(term60066, term60066.getClass(), "formList", true);
        setBooleanField(term60066, term60066.getClass(), "formSubmit", false);
        setField(term60065, term60065.getClass(), "tag", term60066);
        setField(term60069, term60069.getClass(), "referent", null);
        setField(term60070, term60070.getClass(), "lock", term60071);
        setField(term60070, term60070.getClass(), "head", null);
        setLongField(term60070, term60070.getClass(), "queueLength", 8059786003080744426L);
        setField(term60069, term60069.getClass(), "queue", term60070);
        setField(term60069, term60069.getClass(), "next", null);
        setField(term60069, term60069.getClass(), "discovered", null);
        setField(term60065, term60065.getClass(), "shadowChildrenRef", term60069);
        setField(term60065, term60065.getClass(), "childNodes", term60072);
        setIntField(term60074, term60074.getClass(), "size", -1016503459);
        setField(term60074, term60074.getClass(), "keys", term60075);
        setField(term60074, term60074.getClass(), "vals", term60076);
        setField(term60065, term60065.getClass(), "attributes", term60074);
        setField(term60065, term60065.getClass(), "baseUri", "YRHGsAkhxb");
        setField(term60065, term60065.getClass(), "parentNode", null);
        setIntField(term60065, term60065.getClass(), "siblingIndex", -1968847291);
        ArrayList term60014 = new ArrayList();
        term60013 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term60013, term60013.getClass(), "list", term60014);
        setField(term60013, term60013.getClass(), "c", term60014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1656, args);
        assertTrue(recursiveEquals(term1656, term60065));
        assertTrue(recursiveEquals(retValue, term60013));
    }

};


