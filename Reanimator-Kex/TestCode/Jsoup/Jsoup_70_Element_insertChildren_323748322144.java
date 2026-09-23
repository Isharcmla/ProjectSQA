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
import java.lang.Integer;

public class Element_insertChildren_323748322144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2396;
     Object term2443;
     Object term2445;

    public Element_insertChildren_323748322144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2422 = new ArrayList();
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        term2396 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2397 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2418 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2419 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2420 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2426 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2428 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2429 = (Object[]) newArray("java.lang.String", 0);
        setField(term2397, term2397.getClass(), "tagName", "wGmYcqUkgE");
        setBooleanField(term2397, term2397.getClass(), "isBlock", false);
        setBooleanField(term2397, term2397.getClass(), "formatAsBlock", false);
        setBooleanField(term2397, term2397.getClass(), "canContainInline", true);
        setBooleanField(term2397, term2397.getClass(), "empty", true);
        setBooleanField(term2397, term2397.getClass(), "selfClosing", false);
        setBooleanField(term2397, term2397.getClass(), "preserveWhitespace", false);
        setBooleanField(term2397, term2397.getClass(), "formList", false);
        setBooleanField(term2397, term2397.getClass(), "formSubmit", false);
        setField(term2396, term2396.getClass(), "tag", term2397);
        setField(term2418, term2418.getClass(), "referent", null);
        setField(term2419, term2419.getClass(), "lock", term2420);
        setField(term2419, term2419.getClass(), "head", null);
        setLongField(term2419, term2419.getClass(), "queueLength", -6823727938421990489L);
        setField(term2418, term2418.getClass(), "queue", term2419);
        setField(term2418, term2418.getClass(), "next", null);
        setField(term2418, term2418.getClass(), "discovered", null);
        setField(term2396, term2396.getClass(), "shadowChildrenRef", term2418);
        setField(term2396, term2396.getClass(), "childNodes", term2422);
        setIntField(term2426, term2426.getClass(), "size", 933028652);
        setField(term2426, term2426.getClass(), "keys", term2428);
        setField(term2426, term2426.getClass(), "vals", term2429);
        setField(term2396, term2396.getClass(), "attributes", term2426);
        setField(term2396, term2396.getClass(), "baseUri", "idgaQsnJpQ");
        setField(term2396, term2396.getClass(), "parentNode", null);
        setIntField(term2396, term2396.getClass(), "siblingIndex", 287287233);
        term2443 = new Integer(962840079);
        term2445 = (Object[]) newArray("org.jsoup.nodes.Node", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("org.jsoup.nodes.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2443;
        args[1] = term2445;
        try {
            callMethod(klass, "insertChildren", argTypes, term2396, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


