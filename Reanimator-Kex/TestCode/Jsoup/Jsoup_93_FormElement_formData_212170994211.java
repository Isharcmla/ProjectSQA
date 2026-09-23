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

public class FormElement_formData_212170994211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;
     Object term3880;
     Object term3813;

    public FormElement_formData_212170994211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        term541 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term542 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term543 = (Object[]) newArray("java.lang.Object", 0);
        Object term546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term579 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term580 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term581 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589 = (Object[]) newArray("java.lang.String", 0);
        Object[] term590 = (Object[]) newArray("java.lang.String", 0);
        setField(term542, term542.getClass(), "elementData", term543);
        setIntField(term542, term542.getClass(), "size", 0);
        setIntField(term542, term542.getClass(), "modCount", 0);
        setField(term541, term541.getClass(), "elements", term542);
        setField(term546, term546.getClass(), "tagName", "HyxfbSQYBe");
        setField(term546, term546.getClass(), "normalName", "pCTimMblYc");
        setBooleanField(term546, term546.getClass(), "isBlock", true);
        setBooleanField(term546, term546.getClass(), "formatAsBlock", false);
        setBooleanField(term546, term546.getClass(), "canContainInline", false);
        setBooleanField(term546, term546.getClass(), "empty", true);
        setBooleanField(term546, term546.getClass(), "selfClosing", false);
        setBooleanField(term546, term546.getClass(), "preserveWhitespace", true);
        setBooleanField(term546, term546.getClass(), "formList", false);
        setBooleanField(term546, term546.getClass(), "formSubmit", false);
        setField(term541, term541.getClass(), "tag", term546);
        setField(term579, term579.getClass(), "referent", null);
        setField(term580, term580.getClass(), "lock", term581);
        setField(term580, term580.getClass(), "head", null);
        setLongField(term580, term580.getClass(), "queueLength", 7411271909051562686L);
        setField(term579, term579.getClass(), "queue", term580);
        setField(term579, term579.getClass(), "next", null);
        setField(term579, term579.getClass(), "discovered", null);
        setField(term541, term541.getClass(), "shadowChildrenRef", term579);
        setField(term541, term541.getClass(), "childNodes", term583);
        setIntField(term587, term587.getClass(), "size", -522618178);
        setField(term587, term587.getClass(), "keys", term589);
        setField(term587, term587.getClass(), "vals", term590);
        setField(term541, term541.getClass(), "attributes", term587);
        setField(term541, term541.getClass(), "baseUri", "hNxWaHcfhY");
        setField(term541, term541.getClass(), "parentNode", null);
        setIntField(term541, term541.getClass(), "siblingIndex", 1134449235);
        ArrayList term3891 = new ArrayList();
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        term3880 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term3881 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term3882 = (Object[]) newArray("java.lang.Object", 0);
        Object term3883 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3888 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3889 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3890 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3893 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3894 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3895 = (Object[]) newArray("java.lang.String", 0);
        setField(term3881, term3881.getClass(), "elementData", term3882);
        setIntField(term3881, term3881.getClass(), "size", 0);
        setIntField(term3881, term3881.getClass(), "modCount", 0);
        setField(term3880, term3880.getClass(), "elements", term3881);
        setField(term3883, term3883.getClass(), "tagName", "HyxfbSQYBe");
        setField(term3883, term3883.getClass(), "normalName", "pCTimMblYc");
        setBooleanField(term3883, term3883.getClass(), "isBlock", true);
        setBooleanField(term3883, term3883.getClass(), "formatAsBlock", false);
        setBooleanField(term3883, term3883.getClass(), "canContainInline", false);
        setBooleanField(term3883, term3883.getClass(), "empty", true);
        setBooleanField(term3883, term3883.getClass(), "selfClosing", false);
        setBooleanField(term3883, term3883.getClass(), "preserveWhitespace", true);
        setBooleanField(term3883, term3883.getClass(), "formList", false);
        setBooleanField(term3883, term3883.getClass(), "formSubmit", false);
        setField(term3880, term3880.getClass(), "tag", term3883);
        setField(term3888, term3888.getClass(), "referent", null);
        setField(term3889, term3889.getClass(), "lock", term3890);
        setField(term3889, term3889.getClass(), "head", null);
        setLongField(term3889, term3889.getClass(), "queueLength", 7411271909051562686L);
        setField(term3888, term3888.getClass(), "queue", term3889);
        setField(term3888, term3888.getClass(), "next", null);
        setField(term3888, term3888.getClass(), "discovered", null);
        setField(term3880, term3880.getClass(), "shadowChildrenRef", term3888);
        setField(term3880, term3880.getClass(), "childNodes", term3891);
        setIntField(term3893, term3893.getClass(), "size", -522618178);
        setField(term3893, term3893.getClass(), "keys", term3894);
        setField(term3893, term3893.getClass(), "vals", term3895);
        setField(term3880, term3880.getClass(), "attributes", term3893);
        setField(term3880, term3880.getClass(), "baseUri", "hNxWaHcfhY");
        setField(term3880, term3880.getClass(), "parentNode", null);
        setIntField(term3880, term3880.getClass(), "siblingIndex", 1134449235);
        term3813 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term541, args);
        assertTrue(recursiveEquals(term541, term3880));
        assertTrue(recursiveEquals(retValue, term3813));
    }

};


