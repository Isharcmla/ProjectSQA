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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_appendChild_1453226710142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2124;

    public Element_appendChild_1453226710142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2150 = new ArrayList();
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        ((ArrayList) term2150).add((Object)null);
        term2124 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2125 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2146 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2147 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2148 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2154 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2156 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2157 = (Object[]) newArray("java.lang.String", 0);
        setField(term2125, term2125.getClass(), "tagName", "bLPjGVBhlX");
        setBooleanField(term2125, term2125.getClass(), "isBlock", false);
        setBooleanField(term2125, term2125.getClass(), "formatAsBlock", false);
        setBooleanField(term2125, term2125.getClass(), "canContainInline", false);
        setBooleanField(term2125, term2125.getClass(), "empty", false);
        setBooleanField(term2125, term2125.getClass(), "selfClosing", false);
        setBooleanField(term2125, term2125.getClass(), "preserveWhitespace", false);
        setBooleanField(term2125, term2125.getClass(), "formList", true);
        setBooleanField(term2125, term2125.getClass(), "formSubmit", true);
        setField(term2124, term2124.getClass(), "tag", term2125);
        setField(term2146, term2146.getClass(), "referent", null);
        setField(term2147, term2147.getClass(), "lock", term2148);
        setField(term2147, term2147.getClass(), "head", null);
        setLongField(term2147, term2147.getClass(), "queueLength", 1967728129628047933L);
        setField(term2146, term2146.getClass(), "queue", term2147);
        setField(term2146, term2146.getClass(), "next", null);
        setField(term2146, term2146.getClass(), "discovered", null);
        setField(term2124, term2124.getClass(), "shadowChildrenRef", term2146);
        setField(term2124, term2124.getClass(), "childNodes", term2150);
        setIntField(term2154, term2154.getClass(), "size", 493620644);
        setField(term2154, term2154.getClass(), "keys", term2156);
        setField(term2154, term2154.getClass(), "vals", term2157);
        setField(term2124, term2124.getClass(), "attributes", term2154);
        setField(term2124, term2124.getClass(), "baseUri", "whBvTVIIlC");
        setField(term2124, term2124.getClass(), "parentNode", null);
        setIntField(term2124, term2124.getClass(), "siblingIndex", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term2124, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


