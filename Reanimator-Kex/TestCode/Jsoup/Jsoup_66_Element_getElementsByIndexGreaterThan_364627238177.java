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
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_364627238177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5376;
     Object term5423;
     Object term32805;
     Object term32801;

    public Element_getElementsByIndexGreaterThan_364627238177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5402 = new ArrayList();
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        term5376 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5377 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5398 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5399 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5400 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5406 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5408 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5409 = (Object[]) newArray("java.lang.String", 0);
        setField(term5377, term5377.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term5377, term5377.getClass(), "isBlock", false);
        setBooleanField(term5377, term5377.getClass(), "formatAsBlock", true);
        setBooleanField(term5377, term5377.getClass(), "canContainInline", true);
        setBooleanField(term5377, term5377.getClass(), "empty", false);
        setBooleanField(term5377, term5377.getClass(), "selfClosing", false);
        setBooleanField(term5377, term5377.getClass(), "preserveWhitespace", true);
        setBooleanField(term5377, term5377.getClass(), "formList", true);
        setBooleanField(term5377, term5377.getClass(), "formSubmit", true);
        setField(term5376, term5376.getClass(), "tag", term5377);
        setField(term5398, term5398.getClass(), "referent", null);
        setField(term5399, term5399.getClass(), "lock", term5400);
        setField(term5399, term5399.getClass(), "head", null);
        setLongField(term5399, term5399.getClass(), "queueLength", 463622836963501975L);
        setField(term5398, term5398.getClass(), "queue", term5399);
        setField(term5398, term5398.getClass(), "next", null);
        setField(term5398, term5398.getClass(), "discovered", null);
        setField(term5376, term5376.getClass(), "shadowChildrenRef", term5398);
        setField(term5376, term5376.getClass(), "childNodes", term5402);
        setIntField(term5406, term5406.getClass(), "size", 1830648570);
        setField(term5406, term5406.getClass(), "keys", term5408);
        setField(term5406, term5406.getClass(), "vals", term5409);
        setField(term5376, term5376.getClass(), "attributes", term5406);
        setField(term5376, term5376.getClass(), "baseUri", "jXzmYyrnnT");
        setField(term5376, term5376.getClass(), "parentNode", null);
        setIntField(term5376, term5376.getClass(), "siblingIndex", -227365013);
        term5423 = new Integer(11724947);
        ArrayList term32812 = new ArrayList();
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        ((ArrayList) term32812).add((Object)null);
        term32805 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term32806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term32809 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term32810 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term32811 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term32814 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term32815 = (Object[]) newArray("java.lang.String", 0);
        Object[] term32816 = (Object[]) newArray("java.lang.String", 0);
        setField(term32806, term32806.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term32806, term32806.getClass(), "isBlock", false);
        setBooleanField(term32806, term32806.getClass(), "formatAsBlock", true);
        setBooleanField(term32806, term32806.getClass(), "canContainInline", true);
        setBooleanField(term32806, term32806.getClass(), "empty", false);
        setBooleanField(term32806, term32806.getClass(), "selfClosing", false);
        setBooleanField(term32806, term32806.getClass(), "preserveWhitespace", true);
        setBooleanField(term32806, term32806.getClass(), "formList", true);
        setBooleanField(term32806, term32806.getClass(), "formSubmit", true);
        setField(term32805, term32805.getClass(), "tag", term32806);
        setField(term32809, term32809.getClass(), "referent", null);
        setField(term32810, term32810.getClass(), "lock", term32811);
        setField(term32810, term32810.getClass(), "head", null);
        setLongField(term32810, term32810.getClass(), "queueLength", 463622836963501975L);
        setField(term32809, term32809.getClass(), "queue", term32810);
        setField(term32809, term32809.getClass(), "next", null);
        setField(term32809, term32809.getClass(), "discovered", null);
        setField(term32805, term32805.getClass(), "shadowChildrenRef", term32809);
        setField(term32805, term32805.getClass(), "childNodes", term32812);
        setIntField(term32814, term32814.getClass(), "size", 1830648570);
        setField(term32814, term32814.getClass(), "keys", term32815);
        setField(term32814, term32814.getClass(), "vals", term32816);
        setField(term32805, term32805.getClass(), "attributes", term32814);
        setField(term32805, term32805.getClass(), "baseUri", "jXzmYyrnnT");
        setField(term32805, term32805.getClass(), "parentNode", null);
        setIntField(term32805, term32805.getClass(), "siblingIndex", -227365013);
        term32801 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term32802 = (Object[]) newArray("java.lang.Object", 0);
        setField(term32801, term32801.getClass(), "elementData", term32802);
        setIntField(term32801, term32801.getClass(), "size", 0);
        setIntField(term32801, term32801.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5423;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5376, args);
        assertTrue(recursiveEquals(term5376, term32805));
        assertTrue(recursiveEquals(term5423, 11724947));
        assertTrue(recursiveEquals(retValue, term32801));
    }

};


