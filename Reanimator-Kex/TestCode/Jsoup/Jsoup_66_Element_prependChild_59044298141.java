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

public class Element_prependChild_59044298141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2325;

    public Element_prependChild_59044298141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2351 = new ArrayList();
        ((ArrayList) term2351).add((Object)null);
        ((ArrayList) term2351).add((Object)null);
        ((ArrayList) term2351).add((Object)null);
        ((ArrayList) term2351).add((Object)null);
        ((ArrayList) term2351).add((Object)null);
        ((ArrayList) term2351).add((Object)null);
        term2325 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2326 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2347 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2348 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2349 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2355 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2357 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2358 = (Object[]) newArray("java.lang.String", 0);
        setField(term2326, term2326.getClass(), "tagName", "MAcUBcBckh");
        setBooleanField(term2326, term2326.getClass(), "isBlock", false);
        setBooleanField(term2326, term2326.getClass(), "formatAsBlock", false);
        setBooleanField(term2326, term2326.getClass(), "canContainInline", false);
        setBooleanField(term2326, term2326.getClass(), "empty", false);
        setBooleanField(term2326, term2326.getClass(), "selfClosing", false);
        setBooleanField(term2326, term2326.getClass(), "preserveWhitespace", false);
        setBooleanField(term2326, term2326.getClass(), "formList", false);
        setBooleanField(term2326, term2326.getClass(), "formSubmit", true);
        setField(term2325, term2325.getClass(), "tag", term2326);
        setField(term2347, term2347.getClass(), "referent", null);
        setField(term2348, term2348.getClass(), "lock", term2349);
        setField(term2348, term2348.getClass(), "head", null);
        setLongField(term2348, term2348.getClass(), "queueLength", -5892135042702373494L);
        setField(term2347, term2347.getClass(), "queue", term2348);
        setField(term2347, term2347.getClass(), "next", null);
        setField(term2347, term2347.getClass(), "discovered", null);
        setField(term2325, term2325.getClass(), "shadowChildrenRef", term2347);
        setField(term2325, term2325.getClass(), "childNodes", term2351);
        setIntField(term2355, term2355.getClass(), "size", 1225272962);
        setField(term2355, term2355.getClass(), "keys", term2357);
        setField(term2355, term2355.getClass(), "vals", term2358);
        setField(term2325, term2325.getClass(), "attributes", term2355);
        setField(term2325, term2325.getClass(), "baseUri", "oVgzLbrsFr");
        setField(term2325, term2325.getClass(), "parentNode", null);
        setIntField(term2325, term2325.getClass(), "siblingIndex", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term2325, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


