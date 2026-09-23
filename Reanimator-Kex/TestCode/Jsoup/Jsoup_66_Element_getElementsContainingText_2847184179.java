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

public class Element_getElementsContainingText_2847184179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5514;
     Object term33570;
     Object term33566;

    public Element_getElementsContainingText_2847184179() {
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
        setBooleanField(term5515, term5515.getClass(), "formatAsBlock", true);
        setBooleanField(term5515, term5515.getClass(), "canContainInline", false);
        setBooleanField(term5515, term5515.getClass(), "empty", true);
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
        ArrayList term33577 = new ArrayList();
        ((ArrayList) term33577).add((Object)null);
        ((ArrayList) term33577).add((Object)null);
        ((ArrayList) term33577).add((Object)null);
        ((ArrayList) term33577).add((Object)null);
        term33570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term33571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term33574 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term33575 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term33576 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term33579 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term33580 = (Object[]) newArray("java.lang.String", 0);
        Object[] term33581 = (Object[]) newArray("java.lang.String", 0);
        setField(term33571, term33571.getClass(), "tagName", "VGizxZnyHX");
        setBooleanField(term33571, term33571.getClass(), "isBlock", true);
        setBooleanField(term33571, term33571.getClass(), "formatAsBlock", true);
        setBooleanField(term33571, term33571.getClass(), "canContainInline", false);
        setBooleanField(term33571, term33571.getClass(), "empty", true);
        setBooleanField(term33571, term33571.getClass(), "selfClosing", false);
        setBooleanField(term33571, term33571.getClass(), "preserveWhitespace", true);
        setBooleanField(term33571, term33571.getClass(), "formList", false);
        setBooleanField(term33571, term33571.getClass(), "formSubmit", false);
        setField(term33570, term33570.getClass(), "tag", term33571);
        setField(term33574, term33574.getClass(), "referent", null);
        setField(term33575, term33575.getClass(), "lock", term33576);
        setField(term33575, term33575.getClass(), "head", null);
        setLongField(term33575, term33575.getClass(), "queueLength", -8654565919063661957L);
        setField(term33574, term33574.getClass(), "queue", term33575);
        setField(term33574, term33574.getClass(), "next", null);
        setField(term33574, term33574.getClass(), "discovered", null);
        setField(term33570, term33570.getClass(), "shadowChildrenRef", term33574);
        setField(term33570, term33570.getClass(), "childNodes", term33577);
        setIntField(term33579, term33579.getClass(), "size", 1398204340);
        setField(term33579, term33579.getClass(), "keys", term33580);
        setField(term33579, term33579.getClass(), "vals", term33581);
        setField(term33570, term33570.getClass(), "attributes", term33579);
        setField(term33570, term33570.getClass(), "baseUri", "kVEZMHmRtR");
        setField(term33570, term33570.getClass(), "parentNode", null);
        setIntField(term33570, term33570.getClass(), "siblingIndex", 229204365);
        term33566 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term33567 = (Object[]) newArray("java.lang.Object", 0);
        setField(term33566, term33566.getClass(), "elementData", term33567);
        setIntField(term33566, term33566.getClass(), "size", 0);
        setIntField(term33566, term33566.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term5514, args);
        assertTrue(recursiveEquals(term5514, term33570));
        assertTrue(recursiveEquals(retValue, term33566));
    }

};


