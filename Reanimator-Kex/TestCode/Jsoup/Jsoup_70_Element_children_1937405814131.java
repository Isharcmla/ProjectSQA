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

public class Element_children_1937405814131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455;
     Object term59730;
     Object term59722;

    public Element_children_1937405814131() {
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
        setBooleanField(term1456, term1456.getClass(), "formatAsBlock", false);
        setBooleanField(term1456, term1456.getClass(), "canContainInline", true);
        setBooleanField(term1456, term1456.getClass(), "empty", false);
        setBooleanField(term1456, term1456.getClass(), "selfClosing", false);
        setBooleanField(term1456, term1456.getClass(), "preserveWhitespace", true);
        setBooleanField(term1456, term1456.getClass(), "formList", true);
        setBooleanField(term1456, term1456.getClass(), "formSubmit", true);
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
        ArrayList term59735 = new ArrayList();
        ArrayList term59739 = new ArrayList();
        ((ArrayList) term59739).add((Object)null);
        ((ArrayList) term59739).add((Object)null);
        ((ArrayList) term59739).add((Object)null);
        ((ArrayList) term59739).add((Object)null);
        ((ArrayList) term59739).add((Object)null);
        ((ArrayList) term59739).add((Object)null);
        term59730 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59731 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59734 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term59737 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term59738 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term59741 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59742 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59743 = (Object[]) newArray("java.lang.String", 0);
        setField(term59731, term59731.getClass(), "tagName", "xLbjWUgOIL");
        setBooleanField(term59731, term59731.getClass(), "isBlock", true);
        setBooleanField(term59731, term59731.getClass(), "formatAsBlock", false);
        setBooleanField(term59731, term59731.getClass(), "canContainInline", true);
        setBooleanField(term59731, term59731.getClass(), "empty", false);
        setBooleanField(term59731, term59731.getClass(), "selfClosing", false);
        setBooleanField(term59731, term59731.getClass(), "preserveWhitespace", true);
        setBooleanField(term59731, term59731.getClass(), "formList", true);
        setBooleanField(term59731, term59731.getClass(), "formSubmit", true);
        setField(term59730, term59730.getClass(), "tag", term59731);
        setField(term59734, term59734.getClass(), "referent", term59735);
        setField(term59737, term59737.getClass(), "lock", term59738);
        setField(term59737, term59737.getClass(), "head", null);
        setLongField(term59737, term59737.getClass(), "queueLength", 0L);
        setField(term59734, term59734.getClass(), "queue", term59737);
        setField(term59734, term59734.getClass(), "next", null);
        setField(term59734, term59734.getClass(), "discovered", null);
        setField(term59730, term59730.getClass(), "shadowChildrenRef", term59734);
        setField(term59730, term59730.getClass(), "childNodes", term59739);
        setIntField(term59741, term59741.getClass(), "size", 1962444399);
        setField(term59741, term59741.getClass(), "keys", term59742);
        setField(term59741, term59741.getClass(), "vals", term59743);
        setField(term59730, term59730.getClass(), "attributes", term59741);
        setField(term59730, term59730.getClass(), "baseUri", "jDtqGUpnZN");
        setField(term59730, term59730.getClass(), "parentNode", null);
        setIntField(term59730, term59730.getClass(), "siblingIndex", 767834723);
        term59722 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term59723 = (Object[]) newArray("java.lang.Object", 0);
        setField(term59722, term59722.getClass(), "elementData", term59723);
        setIntField(term59722, term59722.getClass(), "size", 0);
        setIntField(term59722, term59722.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1455, args);
        assertTrue(recursiveEquals(term1455, term59730));
        assertTrue(recursiveEquals(retValue, term59722));
    }

};


