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
import java.lang.Object;
import java.util.ArrayList;

public class Element_appendElement_191958221036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2466;

    public Element_appendElement_191958221036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2492 = new ArrayList();
        ((ArrayList) term2492).add((Object)null);
        ((ArrayList) term2492).add((Object)null);
        ((ArrayList) term2492).add((Object)null);
        ((ArrayList) term2492).add((Object)null);
        ((ArrayList) term2492).add((Object)null);
        term2466 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2467 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2488 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2489 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2490 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2496 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2498 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2499 = (Object[]) newArray("java.lang.String", 0);
        setField(term2467, term2467.getClass(), "tagName", "VgZnGoIFwQ");
        setBooleanField(term2467, term2467.getClass(), "isBlock", false);
        setBooleanField(term2467, term2467.getClass(), "formatAsBlock", false);
        setBooleanField(term2467, term2467.getClass(), "canContainInline", false);
        setBooleanField(term2467, term2467.getClass(), "empty", false);
        setBooleanField(term2467, term2467.getClass(), "selfClosing", true);
        setBooleanField(term2467, term2467.getClass(), "preserveWhitespace", true);
        setBooleanField(term2467, term2467.getClass(), "formList", true);
        setBooleanField(term2467, term2467.getClass(), "formSubmit", true);
        setField(term2466, term2466.getClass(), "tag", term2467);
        setField(term2488, term2488.getClass(), "referent", null);
        setField(term2489, term2489.getClass(), "lock", term2490);
        setField(term2489, term2489.getClass(), "head", null);
        setLongField(term2489, term2489.getClass(), "queueLength", -484994522244390100L);
        setField(term2488, term2488.getClass(), "queue", term2489);
        setField(term2488, term2488.getClass(), "next", null);
        setField(term2488, term2488.getClass(), "discovered", null);
        setField(term2466, term2466.getClass(), "shadowChildrenRef", term2488);
        setField(term2466, term2466.getClass(), "childNodes", term2492);
        setIntField(term2496, term2496.getClass(), "size", 1540719661);
        setField(term2496, term2496.getClass(), "keys", term2498);
        setField(term2496, term2496.getClass(), "vals", term2499);
        setField(term2466, term2466.getClass(), "attributes", term2496);
        setField(term2466, term2466.getClass(), "baseUri", "jUbSRrkrYZ");
        setField(term2466, term2466.getClass(), "parentNode", null);
        setIntField(term2466, term2466.getClass(), "siblingIndex", 1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "appendElement", argTypes, term2466, args);
    }

};


