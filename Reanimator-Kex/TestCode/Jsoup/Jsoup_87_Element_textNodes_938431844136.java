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

public class Element_textNodes_938431844136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;
     Object term61023;
     Object term60971;

    public Element_textNodes_938431844136() {
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
        setBooleanField(term1657, term1657.getClass(), "formatAsBlock", false);
        setBooleanField(term1657, term1657.getClass(), "canContainInline", true);
        setBooleanField(term1657, term1657.getClass(), "empty", true);
        setBooleanField(term1657, term1657.getClass(), "selfClosing", true);
        setBooleanField(term1657, term1657.getClass(), "preserveWhitespace", true);
        setBooleanField(term1657, term1657.getClass(), "formList", true);
        setBooleanField(term1657, term1657.getClass(), "formSubmit", true);
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
        ArrayList term61030 = new ArrayList();
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        ((ArrayList) term61030).add((Object)null);
        term61023 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term61024 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61027 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term61028 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term61029 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term61032 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term61033 = (Object[]) newArray("java.lang.String", 0);
        Object[] term61034 = (Object[]) newArray("java.lang.String", 0);
        setField(term61024, term61024.getClass(), "tagName", "onpbIeEKoi");
        setBooleanField(term61024, term61024.getClass(), "isBlock", true);
        setBooleanField(term61024, term61024.getClass(), "formatAsBlock", false);
        setBooleanField(term61024, term61024.getClass(), "canContainInline", true);
        setBooleanField(term61024, term61024.getClass(), "empty", true);
        setBooleanField(term61024, term61024.getClass(), "selfClosing", true);
        setBooleanField(term61024, term61024.getClass(), "preserveWhitespace", true);
        setBooleanField(term61024, term61024.getClass(), "formList", true);
        setBooleanField(term61024, term61024.getClass(), "formSubmit", true);
        setField(term61023, term61023.getClass(), "tag", term61024);
        setField(term61027, term61027.getClass(), "referent", null);
        setField(term61028, term61028.getClass(), "lock", term61029);
        setField(term61028, term61028.getClass(), "head", null);
        setLongField(term61028, term61028.getClass(), "queueLength", 8059786003080744426L);
        setField(term61027, term61027.getClass(), "queue", term61028);
        setField(term61027, term61027.getClass(), "next", null);
        setField(term61027, term61027.getClass(), "discovered", null);
        setField(term61023, term61023.getClass(), "shadowChildrenRef", term61027);
        setField(term61023, term61023.getClass(), "childNodes", term61030);
        setIntField(term61032, term61032.getClass(), "size", -1016503459);
        setField(term61032, term61032.getClass(), "keys", term61033);
        setField(term61032, term61032.getClass(), "vals", term61034);
        setField(term61023, term61023.getClass(), "attributes", term61032);
        setField(term61023, term61023.getClass(), "baseUri", "YRHGsAkhxb");
        setField(term61023, term61023.getClass(), "parentNode", null);
        setIntField(term61023, term61023.getClass(), "siblingIndex", -1968847291);
        ArrayList term60972 = new ArrayList();
        term60971 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term60971, term60971.getClass(), "list", term60972);
        setField(term60971, term60971.getClass(), "c", term60972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1656, args);
        assertTrue(recursiveEquals(term1656, term61023));
        assertTrue(recursiveEquals(retValue, term60971));
    }

};


