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

public class Element_parent_836683031126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250;
     Object term12374;

    public Element_parent_836683031126() {
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
        ArrayList term12381 = new ArrayList();
        ((ArrayList) term12381).add((Object)null);
        term12374 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12375 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12378 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term12379 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term12380 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term12383 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12384 = (Object[]) newArray("java.lang.String", 0);
        Object[] term12385 = (Object[]) newArray("java.lang.String", 0);
        setField(term12375, term12375.getClass(), "tagName", "wSQxaModmm");
        setBooleanField(term12375, term12375.getClass(), "isBlock", false);
        setBooleanField(term12375, term12375.getClass(), "formatAsBlock", false);
        setBooleanField(term12375, term12375.getClass(), "canContainInline", true);
        setBooleanField(term12375, term12375.getClass(), "empty", false);
        setBooleanField(term12375, term12375.getClass(), "selfClosing", false);
        setBooleanField(term12375, term12375.getClass(), "preserveWhitespace", false);
        setBooleanField(term12375, term12375.getClass(), "formList", true);
        setBooleanField(term12375, term12375.getClass(), "formSubmit", true);
        setField(term12374, term12374.getClass(), "tag", term12375);
        setField(term12378, term12378.getClass(), "referent", null);
        setField(term12379, term12379.getClass(), "lock", term12380);
        setField(term12379, term12379.getClass(), "head", null);
        setLongField(term12379, term12379.getClass(), "queueLength", -872011222785455006L);
        setField(term12378, term12378.getClass(), "queue", term12379);
        setField(term12378, term12378.getClass(), "next", null);
        setField(term12378, term12378.getClass(), "discovered", null);
        setField(term12374, term12374.getClass(), "shadowChildrenRef", term12378);
        setField(term12374, term12374.getClass(), "childNodes", term12381);
        setIntField(term12383, term12383.getClass(), "size", -1179120542);
        setField(term12383, term12383.getClass(), "keys", term12384);
        setField(term12383, term12383.getClass(), "vals", term12385);
        setField(term12374, term12374.getClass(), "attributes", term12383);
        setField(term12374, term12374.getClass(), "baseUri", "UlajhuVLaP");
        setField(term12374, term12374.getClass(), "parentNode", null);
        setIntField(term12374, term12374.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term1250, args);
        assertTrue(recursiveEquals(term1250, term12374));
        assertTrue(recursiveEquals(retValue, null));
    }

};


