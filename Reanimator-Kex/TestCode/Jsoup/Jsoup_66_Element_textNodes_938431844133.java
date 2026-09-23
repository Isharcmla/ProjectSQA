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

public class Element_textNodes_938431844133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;
     Object term13579;
     Object term13527;

    public Element_textNodes_938431844133() {
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
        setBooleanField(term1657, term1657.getClass(), "isBlock", false);
        setBooleanField(term1657, term1657.getClass(), "formatAsBlock", true);
        setBooleanField(term1657, term1657.getClass(), "canContainInline", true);
        setBooleanField(term1657, term1657.getClass(), "empty", true);
        setBooleanField(term1657, term1657.getClass(), "selfClosing", true);
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
        ArrayList term13586 = new ArrayList();
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        ((ArrayList) term13586).add((Object)null);
        term13579 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13580 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13583 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term13584 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term13585 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term13588 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13589 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13590 = (Object[]) newArray("java.lang.String", 0);
        setField(term13580, term13580.getClass(), "tagName", "onpbIeEKoi");
        setBooleanField(term13580, term13580.getClass(), "isBlock", false);
        setBooleanField(term13580, term13580.getClass(), "formatAsBlock", true);
        setBooleanField(term13580, term13580.getClass(), "canContainInline", true);
        setBooleanField(term13580, term13580.getClass(), "empty", true);
        setBooleanField(term13580, term13580.getClass(), "selfClosing", true);
        setBooleanField(term13580, term13580.getClass(), "preserveWhitespace", true);
        setBooleanField(term13580, term13580.getClass(), "formList", true);
        setBooleanField(term13580, term13580.getClass(), "formSubmit", false);
        setField(term13579, term13579.getClass(), "tag", term13580);
        setField(term13583, term13583.getClass(), "referent", null);
        setField(term13584, term13584.getClass(), "lock", term13585);
        setField(term13584, term13584.getClass(), "head", null);
        setLongField(term13584, term13584.getClass(), "queueLength", 8059786003080744426L);
        setField(term13583, term13583.getClass(), "queue", term13584);
        setField(term13583, term13583.getClass(), "next", null);
        setField(term13583, term13583.getClass(), "discovered", null);
        setField(term13579, term13579.getClass(), "shadowChildrenRef", term13583);
        setField(term13579, term13579.getClass(), "childNodes", term13586);
        setIntField(term13588, term13588.getClass(), "size", -1016503459);
        setField(term13588, term13588.getClass(), "keys", term13589);
        setField(term13588, term13588.getClass(), "vals", term13590);
        setField(term13579, term13579.getClass(), "attributes", term13588);
        setField(term13579, term13579.getClass(), "baseUri", "YRHGsAkhxb");
        setField(term13579, term13579.getClass(), "parentNode", null);
        setIntField(term13579, term13579.getClass(), "siblingIndex", -1968847291);
        ArrayList term13528 = new ArrayList();
        term13527 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term13527, term13527.getClass(), "list", term13528);
        setField(term13527, term13527.getClass(), "c", term13528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1656, args);
        assertTrue(recursiveEquals(term1656, term13579));
        assertTrue(recursiveEquals(retValue, term13527));
    }

};


