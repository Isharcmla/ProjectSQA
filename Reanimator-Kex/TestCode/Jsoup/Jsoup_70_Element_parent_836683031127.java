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

public class Element_parent_836683031127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250;
     Object term58820;

    public Element_parent_836683031127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1276 = new ArrayList();
        ((ArrayList) term1276).add((Object)null);
        term1250 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1251 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1272 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1273 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1274 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1280 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1282 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1283 = (Object[]) newArray("java.lang.String", 0);
        setField(term1251, term1251.getClass(), "tagName", "wSQxaModmm");
        setBooleanField(term1251, term1251.getClass(), "isBlock", false);
        setBooleanField(term1251, term1251.getClass(), "formatAsBlock", false);
        setBooleanField(term1251, term1251.getClass(), "canContainInline", true);
        setBooleanField(term1251, term1251.getClass(), "empty", false);
        setBooleanField(term1251, term1251.getClass(), "selfClosing", false);
        setBooleanField(term1251, term1251.getClass(), "preserveWhitespace", false);
        setBooleanField(term1251, term1251.getClass(), "formList", true);
        setBooleanField(term1251, term1251.getClass(), "formSubmit", true);
        setField(term1250, term1250.getClass(), "tag", term1251);
        setField(term1272, term1272.getClass(), "referent", null);
        setField(term1273, term1273.getClass(), "lock", term1274);
        setField(term1273, term1273.getClass(), "head", null);
        setLongField(term1273, term1273.getClass(), "queueLength", -872011222785455006L);
        setField(term1272, term1272.getClass(), "queue", term1273);
        setField(term1272, term1272.getClass(), "next", null);
        setField(term1272, term1272.getClass(), "discovered", null);
        setField(term1250, term1250.getClass(), "shadowChildrenRef", term1272);
        setField(term1250, term1250.getClass(), "childNodes", term1276);
        setIntField(term1280, term1280.getClass(), "size", -1179120542);
        setField(term1280, term1280.getClass(), "keys", term1282);
        setField(term1280, term1280.getClass(), "vals", term1283);
        setField(term1250, term1250.getClass(), "attributes", term1280);
        setField(term1250, term1250.getClass(), "baseUri", "UlajhuVLaP");
        setField(term1250, term1250.getClass(), "parentNode", null);
        setIntField(term1250, term1250.getClass(), "siblingIndex", -73683645);
        ArrayList term58827 = new ArrayList();
        ((ArrayList) term58827).add((Object)null);
        term58820 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58824 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58825 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58826 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58829 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58830 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58831 = (Object[]) newArray("java.lang.String", 0);
        setField(term58821, term58821.getClass(), "tagName", "wSQxaModmm");
        setBooleanField(term58821, term58821.getClass(), "isBlock", false);
        setBooleanField(term58821, term58821.getClass(), "formatAsBlock", false);
        setBooleanField(term58821, term58821.getClass(), "canContainInline", true);
        setBooleanField(term58821, term58821.getClass(), "empty", false);
        setBooleanField(term58821, term58821.getClass(), "selfClosing", false);
        setBooleanField(term58821, term58821.getClass(), "preserveWhitespace", false);
        setBooleanField(term58821, term58821.getClass(), "formList", true);
        setBooleanField(term58821, term58821.getClass(), "formSubmit", true);
        setField(term58820, term58820.getClass(), "tag", term58821);
        setField(term58824, term58824.getClass(), "referent", null);
        setField(term58825, term58825.getClass(), "lock", term58826);
        setField(term58825, term58825.getClass(), "head", null);
        setLongField(term58825, term58825.getClass(), "queueLength", -872011222785455006L);
        setField(term58824, term58824.getClass(), "queue", term58825);
        setField(term58824, term58824.getClass(), "next", null);
        setField(term58824, term58824.getClass(), "discovered", null);
        setField(term58820, term58820.getClass(), "shadowChildrenRef", term58824);
        setField(term58820, term58820.getClass(), "childNodes", term58827);
        setIntField(term58829, term58829.getClass(), "size", -1179120542);
        setField(term58829, term58829.getClass(), "keys", term58830);
        setField(term58829, term58829.getClass(), "vals", term58831);
        setField(term58820, term58820.getClass(), "attributes", term58829);
        setField(term58820, term58820.getClass(), "baseUri", "UlajhuVLaP");
        setField(term58820, term58820.getClass(), "parentNode", null);
        setIntField(term58820, term58820.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term1250, args);
        assertTrue(recursiveEquals(term1250, term58820));
        assertTrue(recursiveEquals(retValue, null));
    }

};


