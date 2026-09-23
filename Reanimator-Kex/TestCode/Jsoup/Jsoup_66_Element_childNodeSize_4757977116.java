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

public class Element_childNodeSize_4757977116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;
     Object term10362;

    public Element_childNodeSize_4757977116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term516 = new ArrayList();
        ((ArrayList) term516).add((Object)null);
        ((ArrayList) term516).add((Object)null);
        ((ArrayList) term516).add((Object)null);
        ((ArrayList) term516).add((Object)null);
        ((ArrayList) term516).add((Object)null);
        ((ArrayList) term516).add((Object)null);
        term490 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term491 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term512 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term513 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term514 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term522 = (Object[]) newArray("java.lang.String", 0);
        Object[] term523 = (Object[]) newArray("java.lang.String", 0);
        setField(term491, term491.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term491, term491.getClass(), "isBlock", true);
        setBooleanField(term491, term491.getClass(), "formatAsBlock", false);
        setBooleanField(term491, term491.getClass(), "canContainInline", false);
        setBooleanField(term491, term491.getClass(), "empty", false);
        setBooleanField(term491, term491.getClass(), "selfClosing", false);
        setBooleanField(term491, term491.getClass(), "preserveWhitespace", true);
        setBooleanField(term491, term491.getClass(), "formList", true);
        setBooleanField(term491, term491.getClass(), "formSubmit", false);
        setField(term490, term490.getClass(), "tag", term491);
        setField(term512, term512.getClass(), "referent", null);
        setField(term513, term513.getClass(), "lock", term514);
        setField(term513, term513.getClass(), "head", null);
        setLongField(term513, term513.getClass(), "queueLength", 7411271909051562686L);
        setField(term512, term512.getClass(), "queue", term513);
        setField(term512, term512.getClass(), "next", null);
        setField(term512, term512.getClass(), "discovered", null);
        setField(term490, term490.getClass(), "shadowChildrenRef", term512);
        setField(term490, term490.getClass(), "childNodes", term516);
        setIntField(term520, term520.getClass(), "size", -522618178);
        setField(term520, term520.getClass(), "keys", term522);
        setField(term520, term520.getClass(), "vals", term523);
        setField(term490, term490.getClass(), "attributes", term520);
        setField(term490, term490.getClass(), "baseUri", "tbcdzjIfER");
        setField(term490, term490.getClass(), "parentNode", null);
        setIntField(term490, term490.getClass(), "siblingIndex", 1134449235);
        ArrayList term10369 = new ArrayList();
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        term10362 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10363 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10366 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10367 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10368 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10371 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10372 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10373 = (Object[]) newArray("java.lang.String", 0);
        setField(term10363, term10363.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term10363, term10363.getClass(), "isBlock", true);
        setBooleanField(term10363, term10363.getClass(), "formatAsBlock", false);
        setBooleanField(term10363, term10363.getClass(), "canContainInline", false);
        setBooleanField(term10363, term10363.getClass(), "empty", false);
        setBooleanField(term10363, term10363.getClass(), "selfClosing", false);
        setBooleanField(term10363, term10363.getClass(), "preserveWhitespace", true);
        setBooleanField(term10363, term10363.getClass(), "formList", true);
        setBooleanField(term10363, term10363.getClass(), "formSubmit", false);
        setField(term10362, term10362.getClass(), "tag", term10363);
        setField(term10366, term10366.getClass(), "referent", null);
        setField(term10367, term10367.getClass(), "lock", term10368);
        setField(term10367, term10367.getClass(), "head", null);
        setLongField(term10367, term10367.getClass(), "queueLength", 7411271909051562686L);
        setField(term10366, term10366.getClass(), "queue", term10367);
        setField(term10366, term10366.getClass(), "next", null);
        setField(term10366, term10366.getClass(), "discovered", null);
        setField(term10362, term10362.getClass(), "shadowChildrenRef", term10366);
        setField(term10362, term10362.getClass(), "childNodes", term10369);
        setIntField(term10371, term10371.getClass(), "size", -522618178);
        setField(term10371, term10371.getClass(), "keys", term10372);
        setField(term10371, term10371.getClass(), "vals", term10373);
        setField(term10362, term10362.getClass(), "attributes", term10371);
        setField(term10362, term10362.getClass(), "baseUri", "tbcdzjIfER");
        setField(term10362, term10362.getClass(), "parentNode", null);
        setIntField(term10362, term10362.getClass(), "siblingIndex", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "childNodeSize", argTypes, term490, args);
        assertTrue(recursiveEquals(term490, term10362));
        assertTrue(recursiveEquals(retValue, 6));
    }

};


