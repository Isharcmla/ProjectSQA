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

public class Element_childNodeSize_4757977117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;
     Object term56786;

    public Element_childNodeSize_4757977117() {
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
        ArrayList term56793 = new ArrayList();
        ((ArrayList) term56793).add((Object)null);
        ((ArrayList) term56793).add((Object)null);
        ((ArrayList) term56793).add((Object)null);
        ((ArrayList) term56793).add((Object)null);
        ((ArrayList) term56793).add((Object)null);
        ((ArrayList) term56793).add((Object)null);
        term56786 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56787 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56790 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56791 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56792 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56795 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56796 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56797 = (Object[]) newArray("java.lang.String", 0);
        setField(term56787, term56787.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term56787, term56787.getClass(), "isBlock", true);
        setBooleanField(term56787, term56787.getClass(), "formatAsBlock", false);
        setBooleanField(term56787, term56787.getClass(), "canContainInline", false);
        setBooleanField(term56787, term56787.getClass(), "empty", false);
        setBooleanField(term56787, term56787.getClass(), "selfClosing", false);
        setBooleanField(term56787, term56787.getClass(), "preserveWhitespace", true);
        setBooleanField(term56787, term56787.getClass(), "formList", true);
        setBooleanField(term56787, term56787.getClass(), "formSubmit", false);
        setField(term56786, term56786.getClass(), "tag", term56787);
        setField(term56790, term56790.getClass(), "referent", null);
        setField(term56791, term56791.getClass(), "lock", term56792);
        setField(term56791, term56791.getClass(), "head", null);
        setLongField(term56791, term56791.getClass(), "queueLength", 7411271909051562686L);
        setField(term56790, term56790.getClass(), "queue", term56791);
        setField(term56790, term56790.getClass(), "next", null);
        setField(term56790, term56790.getClass(), "discovered", null);
        setField(term56786, term56786.getClass(), "shadowChildrenRef", term56790);
        setField(term56786, term56786.getClass(), "childNodes", term56793);
        setIntField(term56795, term56795.getClass(), "size", -522618178);
        setField(term56795, term56795.getClass(), "keys", term56796);
        setField(term56795, term56795.getClass(), "vals", term56797);
        setField(term56786, term56786.getClass(), "attributes", term56795);
        setField(term56786, term56786.getClass(), "baseUri", "tbcdzjIfER");
        setField(term56786, term56786.getClass(), "parentNode", null);
        setIntField(term56786, term56786.getClass(), "siblingIndex", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "childNodeSize", argTypes, term490, args);
        assertTrue(recursiveEquals(term490, term56786));
        assertTrue(recursiveEquals(retValue, 6));
    }

};


