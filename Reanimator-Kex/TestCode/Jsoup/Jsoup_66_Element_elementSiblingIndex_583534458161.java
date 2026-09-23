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

public class Element_elementSiblingIndex_583534458161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3803;
     Object term25101;

    public Element_elementSiblingIndex_583534458161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3829 = new ArrayList();
        ((ArrayList) term3829).add((Object)null);
        ((ArrayList) term3829).add((Object)null);
        term3803 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3804 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3825 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3826 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3827 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3833 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3835 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3836 = (Object[]) newArray("java.lang.String", 0);
        setField(term3804, term3804.getClass(), "tagName", "AdxvLJhNLe");
        setBooleanField(term3804, term3804.getClass(), "isBlock", true);
        setBooleanField(term3804, term3804.getClass(), "formatAsBlock", true);
        setBooleanField(term3804, term3804.getClass(), "canContainInline", false);
        setBooleanField(term3804, term3804.getClass(), "empty", false);
        setBooleanField(term3804, term3804.getClass(), "selfClosing", true);
        setBooleanField(term3804, term3804.getClass(), "preserveWhitespace", true);
        setBooleanField(term3804, term3804.getClass(), "formList", true);
        setBooleanField(term3804, term3804.getClass(), "formSubmit", true);
        setField(term3803, term3803.getClass(), "tag", term3804);
        setField(term3825, term3825.getClass(), "referent", null);
        setField(term3826, term3826.getClass(), "lock", term3827);
        setField(term3826, term3826.getClass(), "head", null);
        setLongField(term3826, term3826.getClass(), "queueLength", 2936323121573284007L);
        setField(term3825, term3825.getClass(), "queue", term3826);
        setField(term3825, term3825.getClass(), "next", null);
        setField(term3825, term3825.getClass(), "discovered", null);
        setField(term3803, term3803.getClass(), "shadowChildrenRef", term3825);
        setField(term3803, term3803.getClass(), "childNodes", term3829);
        setIntField(term3833, term3833.getClass(), "size", -663691365);
        setField(term3833, term3833.getClass(), "keys", term3835);
        setField(term3833, term3833.getClass(), "vals", term3836);
        setField(term3803, term3803.getClass(), "attributes", term3833);
        setField(term3803, term3803.getClass(), "baseUri", "lHfTrWKMPk");
        setField(term3803, term3803.getClass(), "parentNode", null);
        setIntField(term3803, term3803.getClass(), "siblingIndex", 339854490);
        ArrayList term25108 = new ArrayList();
        ((ArrayList) term25108).add((Object)null);
        ((ArrayList) term25108).add((Object)null);
        term25101 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25105 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term25106 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term25107 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term25110 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term25111 = (Object[]) newArray("java.lang.String", 0);
        Object[] term25112 = (Object[]) newArray("java.lang.String", 0);
        setField(term25102, term25102.getClass(), "tagName", "AdxvLJhNLe");
        setBooleanField(term25102, term25102.getClass(), "isBlock", true);
        setBooleanField(term25102, term25102.getClass(), "formatAsBlock", true);
        setBooleanField(term25102, term25102.getClass(), "canContainInline", false);
        setBooleanField(term25102, term25102.getClass(), "empty", false);
        setBooleanField(term25102, term25102.getClass(), "selfClosing", true);
        setBooleanField(term25102, term25102.getClass(), "preserveWhitespace", true);
        setBooleanField(term25102, term25102.getClass(), "formList", true);
        setBooleanField(term25102, term25102.getClass(), "formSubmit", true);
        setField(term25101, term25101.getClass(), "tag", term25102);
        setField(term25105, term25105.getClass(), "referent", null);
        setField(term25106, term25106.getClass(), "lock", term25107);
        setField(term25106, term25106.getClass(), "head", null);
        setLongField(term25106, term25106.getClass(), "queueLength", 2936323121573284007L);
        setField(term25105, term25105.getClass(), "queue", term25106);
        setField(term25105, term25105.getClass(), "next", null);
        setField(term25105, term25105.getClass(), "discovered", null);
        setField(term25101, term25101.getClass(), "shadowChildrenRef", term25105);
        setField(term25101, term25101.getClass(), "childNodes", term25108);
        setIntField(term25110, term25110.getClass(), "size", -663691365);
        setField(term25110, term25110.getClass(), "keys", term25111);
        setField(term25110, term25110.getClass(), "vals", term25112);
        setField(term25101, term25101.getClass(), "attributes", term25110);
        setField(term25101, term25101.getClass(), "baseUri", "lHfTrWKMPk");
        setField(term25101, term25101.getClass(), "parentNode", null);
        setIntField(term25101, term25101.getClass(), "siblingIndex", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elementSiblingIndex", argTypes, term3803, args);
        assertTrue(recursiveEquals(term3803, term25101));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


