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

public class Element_cssSelector_1341485919156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;
     Object term24324;

    public Element_cssSelector_1341485919156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3494 = new ArrayList();
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        term3468 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3490 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3491 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3492 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3498 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3500 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3501 = (Object[]) newArray("java.lang.String", 0);
        setField(term3469, term3469.getClass(), "tagName", "yGtHPyvYiQ");
        setBooleanField(term3469, term3469.getClass(), "isBlock", false);
        setBooleanField(term3469, term3469.getClass(), "formatAsBlock", false);
        setBooleanField(term3469, term3469.getClass(), "canContainInline", false);
        setBooleanField(term3469, term3469.getClass(), "empty", false);
        setBooleanField(term3469, term3469.getClass(), "selfClosing", false);
        setBooleanField(term3469, term3469.getClass(), "preserveWhitespace", false);
        setBooleanField(term3469, term3469.getClass(), "formList", false);
        setBooleanField(term3469, term3469.getClass(), "formSubmit", true);
        setField(term3468, term3468.getClass(), "tag", term3469);
        setField(term3490, term3490.getClass(), "referent", null);
        setField(term3491, term3491.getClass(), "lock", term3492);
        setField(term3491, term3491.getClass(), "head", null);
        setLongField(term3491, term3491.getClass(), "queueLength", -2170847986967241072L);
        setField(term3490, term3490.getClass(), "queue", term3491);
        setField(term3490, term3490.getClass(), "next", null);
        setField(term3490, term3490.getClass(), "discovered", null);
        setField(term3468, term3468.getClass(), "shadowChildrenRef", term3490);
        setField(term3468, term3468.getClass(), "childNodes", term3494);
        setIntField(term3498, term3498.getClass(), "size", -1034506028);
        setField(term3498, term3498.getClass(), "keys", term3500);
        setField(term3498, term3498.getClass(), "vals", term3501);
        setField(term3468, term3468.getClass(), "attributes", term3498);
        setField(term3468, term3468.getClass(), "baseUri", "MvRIxilFMJ");
        setField(term3468, term3468.getClass(), "parentNode", null);
        setIntField(term3468, term3468.getClass(), "siblingIndex", -1263114719);
        ArrayList term24331 = new ArrayList();
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        ((ArrayList) term24331).add((Object)null);
        term24324 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24325 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24328 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term24329 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term24330 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term24333 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term24334 = (Object[]) newArray("java.lang.String", 0);
        Object[] term24335 = (Object[]) newArray("java.lang.String", 0);
        setField(term24325, term24325.getClass(), "tagName", "yGtHPyvYiQ");
        setBooleanField(term24325, term24325.getClass(), "isBlock", false);
        setBooleanField(term24325, term24325.getClass(), "formatAsBlock", false);
        setBooleanField(term24325, term24325.getClass(), "canContainInline", false);
        setBooleanField(term24325, term24325.getClass(), "empty", false);
        setBooleanField(term24325, term24325.getClass(), "selfClosing", false);
        setBooleanField(term24325, term24325.getClass(), "preserveWhitespace", false);
        setBooleanField(term24325, term24325.getClass(), "formList", false);
        setBooleanField(term24325, term24325.getClass(), "formSubmit", true);
        setField(term24324, term24324.getClass(), "tag", term24325);
        setField(term24328, term24328.getClass(), "referent", null);
        setField(term24329, term24329.getClass(), "lock", term24330);
        setField(term24329, term24329.getClass(), "head", null);
        setLongField(term24329, term24329.getClass(), "queueLength", -2170847986967241072L);
        setField(term24328, term24328.getClass(), "queue", term24329);
        setField(term24328, term24328.getClass(), "next", null);
        setField(term24328, term24328.getClass(), "discovered", null);
        setField(term24324, term24324.getClass(), "shadowChildrenRef", term24328);
        setField(term24324, term24324.getClass(), "childNodes", term24331);
        setIntField(term24333, term24333.getClass(), "size", -1034506028);
        setField(term24333, term24333.getClass(), "keys", term24334);
        setField(term24333, term24333.getClass(), "vals", term24335);
        setField(term24324, term24324.getClass(), "attributes", term24333);
        setField(term24324, term24324.getClass(), "baseUri", "MvRIxilFMJ");
        setField(term24324, term24324.getClass(), "parentNode", null);
        setIntField(term24324, term24324.getClass(), "siblingIndex", -1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cssSelector", argTypes, term3468, args);
        assertTrue(recursiveEquals(term3468, term24324));
        assertTrue(recursiveEquals(retValue, "yGtHPyvYiQ"));
    }

};


