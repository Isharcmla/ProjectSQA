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

public class Element_children_1937405814130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455;
     Object term13284;
     Object term13276;

    public Element_children_1937405814130() {
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
        setBooleanField(term1456, term1456.getClass(), "selfClosing", true);
        setBooleanField(term1456, term1456.getClass(), "preserveWhitespace", false);
        setBooleanField(term1456, term1456.getClass(), "formList", false);
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
        ArrayList term13289 = new ArrayList();
        ArrayList term13293 = new ArrayList();
        ((ArrayList) term13293).add((Object)null);
        ((ArrayList) term13293).add((Object)null);
        ((ArrayList) term13293).add((Object)null);
        ((ArrayList) term13293).add((Object)null);
        ((ArrayList) term13293).add((Object)null);
        ((ArrayList) term13293).add((Object)null);
        term13284 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13285 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13288 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term13291 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term13292 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term13295 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13296 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13297 = (Object[]) newArray("java.lang.String", 0);
        setField(term13285, term13285.getClass(), "tagName", "xLbjWUgOIL");
        setBooleanField(term13285, term13285.getClass(), "isBlock", true);
        setBooleanField(term13285, term13285.getClass(), "formatAsBlock", false);
        setBooleanField(term13285, term13285.getClass(), "canContainInline", true);
        setBooleanField(term13285, term13285.getClass(), "empty", false);
        setBooleanField(term13285, term13285.getClass(), "selfClosing", true);
        setBooleanField(term13285, term13285.getClass(), "preserveWhitespace", false);
        setBooleanField(term13285, term13285.getClass(), "formList", false);
        setBooleanField(term13285, term13285.getClass(), "formSubmit", true);
        setField(term13284, term13284.getClass(), "tag", term13285);
        setField(term13288, term13288.getClass(), "referent", term13289);
        setField(term13291, term13291.getClass(), "lock", term13292);
        setField(term13291, term13291.getClass(), "head", null);
        setLongField(term13291, term13291.getClass(), "queueLength", 0L);
        setField(term13288, term13288.getClass(), "queue", term13291);
        setField(term13288, term13288.getClass(), "next", null);
        setField(term13288, term13288.getClass(), "discovered", null);
        setField(term13284, term13284.getClass(), "shadowChildrenRef", term13288);
        setField(term13284, term13284.getClass(), "childNodes", term13293);
        setIntField(term13295, term13295.getClass(), "size", 1962444399);
        setField(term13295, term13295.getClass(), "keys", term13296);
        setField(term13295, term13295.getClass(), "vals", term13297);
        setField(term13284, term13284.getClass(), "attributes", term13295);
        setField(term13284, term13284.getClass(), "baseUri", "jDtqGUpnZN");
        setField(term13284, term13284.getClass(), "parentNode", null);
        setIntField(term13284, term13284.getClass(), "siblingIndex", 767834723);
        term13276 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term13277 = (Object[]) newArray("java.lang.Object", 0);
        setField(term13276, term13276.getClass(), "elementData", term13277);
        setIntField(term13276, term13276.getClass(), "size", 0);
        setIntField(term13276, term13276.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1455, args);
        assertTrue(recursiveEquals(term1455, term13284));
        assertTrue(recursiveEquals(retValue, term13276));
    }

};


