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

public class Element_getElementsContainingText_2847184182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5514;
     Object term252518;
     Object term252514;

    public Element_getElementsContainingText_2847184182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5540 = new ArrayList();
        ((ArrayList) term5540).add((Object)null);
        ((ArrayList) term5540).add((Object)null);
        ((ArrayList) term5540).add((Object)null);
        ((ArrayList) term5540).add((Object)null);
        term5514 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5515 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5536 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5537 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5538 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5544 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5546 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5547 = (Object[]) newArray("java.lang.String", 0);
        setField(term5515, term5515.getClass(), "tagName", "VGizxZnyHX");
        setBooleanField(term5515, term5515.getClass(), "isBlock", true);
        setBooleanField(term5515, term5515.getClass(), "formatAsBlock", false);
        setBooleanField(term5515, term5515.getClass(), "canContainInline", true);
        setBooleanField(term5515, term5515.getClass(), "empty", false);
        setBooleanField(term5515, term5515.getClass(), "selfClosing", false);
        setBooleanField(term5515, term5515.getClass(), "preserveWhitespace", true);
        setBooleanField(term5515, term5515.getClass(), "formList", false);
        setBooleanField(term5515, term5515.getClass(), "formSubmit", false);
        setField(term5514, term5514.getClass(), "tag", term5515);
        setField(term5536, term5536.getClass(), "referent", null);
        setField(term5537, term5537.getClass(), "lock", term5538);
        setField(term5537, term5537.getClass(), "head", null);
        setLongField(term5537, term5537.getClass(), "queueLength", -8654565919063661957L);
        setField(term5536, term5536.getClass(), "queue", term5537);
        setField(term5536, term5536.getClass(), "next", null);
        setField(term5536, term5536.getClass(), "discovered", null);
        setField(term5514, term5514.getClass(), "shadowChildrenRef", term5536);
        setField(term5514, term5514.getClass(), "childNodes", term5540);
        setIntField(term5544, term5544.getClass(), "size", 1398204340);
        setField(term5544, term5544.getClass(), "keys", term5546);
        setField(term5544, term5544.getClass(), "vals", term5547);
        setField(term5514, term5514.getClass(), "attributes", term5544);
        setField(term5514, term5514.getClass(), "baseUri", "kVEZMHmRtR");
        setField(term5514, term5514.getClass(), "parentNode", null);
        setIntField(term5514, term5514.getClass(), "siblingIndex", 229204365);
        ArrayList term252525 = new ArrayList();
        ((ArrayList) term252525).add((Object)null);
        ((ArrayList) term252525).add((Object)null);
        ((ArrayList) term252525).add((Object)null);
        ((ArrayList) term252525).add((Object)null);
        term252518 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term252519 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term252522 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term252523 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term252524 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term252527 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term252528 = (Object[]) newArray("java.lang.String", 0);
        Object[] term252529 = (Object[]) newArray("java.lang.String", 0);
        setField(term252519, term252519.getClass(), "tagName", "VGizxZnyHX");
        setBooleanField(term252519, term252519.getClass(), "isBlock", true);
        setBooleanField(term252519, term252519.getClass(), "formatAsBlock", false);
        setBooleanField(term252519, term252519.getClass(), "canContainInline", true);
        setBooleanField(term252519, term252519.getClass(), "empty", false);
        setBooleanField(term252519, term252519.getClass(), "selfClosing", false);
        setBooleanField(term252519, term252519.getClass(), "preserveWhitespace", true);
        setBooleanField(term252519, term252519.getClass(), "formList", false);
        setBooleanField(term252519, term252519.getClass(), "formSubmit", false);
        setField(term252518, term252518.getClass(), "tag", term252519);
        setField(term252522, term252522.getClass(), "referent", null);
        setField(term252523, term252523.getClass(), "lock", term252524);
        setField(term252523, term252523.getClass(), "head", null);
        setLongField(term252523, term252523.getClass(), "queueLength", -8654565919063661957L);
        setField(term252522, term252522.getClass(), "queue", term252523);
        setField(term252522, term252522.getClass(), "next", null);
        setField(term252522, term252522.getClass(), "discovered", null);
        setField(term252518, term252518.getClass(), "shadowChildrenRef", term252522);
        setField(term252518, term252518.getClass(), "childNodes", term252525);
        setIntField(term252527, term252527.getClass(), "size", 1398204340);
        setField(term252527, term252527.getClass(), "keys", term252528);
        setField(term252527, term252527.getClass(), "vals", term252529);
        setField(term252518, term252518.getClass(), "attributes", term252527);
        setField(term252518, term252518.getClass(), "baseUri", "kVEZMHmRtR");
        setField(term252518, term252518.getClass(), "parentNode", null);
        setIntField(term252518, term252518.getClass(), "siblingIndex", 229204365);
        term252514 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term252515 = (Object[]) newArray("java.lang.Object", 0);
        setField(term252514, term252514.getClass(), "elementData", term252515);
        setIntField(term252514, term252514.getClass(), "size", 0);
        setIntField(term252514, term252514.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term5514, args);
        assertTrue(recursiveEquals(term5514, term252518));
        assertTrue(recursiveEquals(retValue, term252514));
    }

};


