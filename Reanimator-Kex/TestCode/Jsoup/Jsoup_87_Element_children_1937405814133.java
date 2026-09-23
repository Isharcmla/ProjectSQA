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

public class Element_children_1937405814133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455;
     Object term60688;
     Object term60680;

    public Element_children_1937405814133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1481 = new ArrayList();
        ((ArrayList) term1481).add((Object)null);
        ((ArrayList) term1481).add((Object)null);
        ((ArrayList) term1481).add((Object)null);
        ((ArrayList) term1481).add((Object)null);
        ((ArrayList) term1481).add((Object)null);
        ((ArrayList) term1481).add((Object)null);
        term1455 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1456 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1477 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1478 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1479 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1485 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1487 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1488 = (Object[]) newArray("java.lang.String", 0);
        setField(term1456, term1456.getClass(), "tagName", "xLbjWUgOIL");
        setBooleanField(term1456, term1456.getClass(), "isBlock", true);
        setBooleanField(term1456, term1456.getClass(), "formatAsBlock", true);
        setBooleanField(term1456, term1456.getClass(), "canContainInline", false);
        setBooleanField(term1456, term1456.getClass(), "empty", true);
        setBooleanField(term1456, term1456.getClass(), "selfClosing", false);
        setBooleanField(term1456, term1456.getClass(), "preserveWhitespace", true);
        setBooleanField(term1456, term1456.getClass(), "formList", false);
        setBooleanField(term1456, term1456.getClass(), "formSubmit", false);
        setField(term1455, term1455.getClass(), "tag", term1456);
        setField(term1477, term1477.getClass(), "referent", null);
        setField(term1478, term1478.getClass(), "lock", term1479);
        setField(term1478, term1478.getClass(), "head", null);
        setLongField(term1478, term1478.getClass(), "queueLength", -4920224193275732920L);
        setField(term1477, term1477.getClass(), "queue", term1478);
        setField(term1477, term1477.getClass(), "next", null);
        setField(term1477, term1477.getClass(), "discovered", null);
        setField(term1455, term1455.getClass(), "shadowChildrenRef", term1477);
        setField(term1455, term1455.getClass(), "childNodes", term1481);
        setIntField(term1485, term1485.getClass(), "size", 1962444399);
        setField(term1485, term1485.getClass(), "keys", term1487);
        setField(term1485, term1485.getClass(), "vals", term1488);
        setField(term1455, term1455.getClass(), "attributes", term1485);
        setField(term1455, term1455.getClass(), "baseUri", "jDtqGUpnZN");
        setField(term1455, term1455.getClass(), "parentNode", null);
        setIntField(term1455, term1455.getClass(), "siblingIndex", 767834723);
        ArrayList term60693 = new ArrayList();
        ArrayList term60697 = new ArrayList();
        ((ArrayList) term60697).add((Object)null);
        ((ArrayList) term60697).add((Object)null);
        ((ArrayList) term60697).add((Object)null);
        ((ArrayList) term60697).add((Object)null);
        ((ArrayList) term60697).add((Object)null);
        ((ArrayList) term60697).add((Object)null);
        term60688 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60689 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60692 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term60695 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term60696 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term60699 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60700 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60701 = (Object[]) newArray("java.lang.String", 0);
        setField(term60689, term60689.getClass(), "tagName", "xLbjWUgOIL");
        setBooleanField(term60689, term60689.getClass(), "isBlock", true);
        setBooleanField(term60689, term60689.getClass(), "formatAsBlock", true);
        setBooleanField(term60689, term60689.getClass(), "canContainInline", false);
        setBooleanField(term60689, term60689.getClass(), "empty", true);
        setBooleanField(term60689, term60689.getClass(), "selfClosing", false);
        setBooleanField(term60689, term60689.getClass(), "preserveWhitespace", true);
        setBooleanField(term60689, term60689.getClass(), "formList", false);
        setBooleanField(term60689, term60689.getClass(), "formSubmit", false);
        setField(term60688, term60688.getClass(), "tag", term60689);
        setField(term60692, term60692.getClass(), "referent", term60693);
        setField(term60695, term60695.getClass(), "lock", term60696);
        setField(term60695, term60695.getClass(), "head", null);
        setLongField(term60695, term60695.getClass(), "queueLength", 0L);
        setField(term60692, term60692.getClass(), "queue", term60695);
        setField(term60692, term60692.getClass(), "next", null);
        setField(term60692, term60692.getClass(), "discovered", null);
        setField(term60688, term60688.getClass(), "shadowChildrenRef", term60692);
        setField(term60688, term60688.getClass(), "childNodes", term60697);
        setIntField(term60699, term60699.getClass(), "size", 1962444399);
        setField(term60699, term60699.getClass(), "keys", term60700);
        setField(term60699, term60699.getClass(), "vals", term60701);
        setField(term60688, term60688.getClass(), "attributes", term60699);
        setField(term60688, term60688.getClass(), "baseUri", "jDtqGUpnZN");
        setField(term60688, term60688.getClass(), "parentNode", null);
        setIntField(term60688, term60688.getClass(), "siblingIndex", 767834723);
        term60680 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term60681 = (Object[]) newArray("java.lang.Object", 0);
        setField(term60680, term60680.getClass(), "elementData", term60681);
        setIntField(term60680, term60680.getClass(), "size", 0);
        setIntField(term60680, term60680.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1455, args);
        assertTrue(recursiveEquals(term1455, term60688));
        assertTrue(recursiveEquals(retValue, term60680));
    }

};


