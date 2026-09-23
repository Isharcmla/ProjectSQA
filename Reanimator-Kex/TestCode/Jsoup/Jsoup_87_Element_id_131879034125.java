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

public class Element_id_131879034125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;
     Object term58289;

    public Element_id_131879034125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term940 = new ArrayList();
        ((ArrayList) term940).add((Object)null);
        ((ArrayList) term940).add((Object)null);
        ((ArrayList) term940).add((Object)null);
        ((ArrayList) term940).add((Object)null);
        ((ArrayList) term940).add((Object)null);
        term914 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term915 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term936 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term937 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term938 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term944 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term946 = (Object[]) newArray("java.lang.String", 0);
        Object[] term947 = (Object[]) newArray("java.lang.String", 0);
        setField(term915, term915.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term915, term915.getClass(), "isBlock", true);
        setBooleanField(term915, term915.getClass(), "formatAsBlock", true);
        setBooleanField(term915, term915.getClass(), "canContainInline", false);
        setBooleanField(term915, term915.getClass(), "empty", true);
        setBooleanField(term915, term915.getClass(), "selfClosing", false);
        setBooleanField(term915, term915.getClass(), "preserveWhitespace", false);
        setBooleanField(term915, term915.getClass(), "formList", false);
        setBooleanField(term915, term915.getClass(), "formSubmit", true);
        setField(term914, term914.getClass(), "tag", term915);
        setField(term936, term936.getClass(), "referent", null);
        setField(term937, term937.getClass(), "lock", term938);
        setField(term937, term937.getClass(), "head", null);
        setLongField(term937, term937.getClass(), "queueLength", -8885298608300233488L);
        setField(term936, term936.getClass(), "queue", term937);
        setField(term936, term936.getClass(), "next", null);
        setField(term936, term936.getClass(), "discovered", null);
        setField(term914, term914.getClass(), "shadowChildrenRef", term936);
        setField(term914, term914.getClass(), "childNodes", term940);
        setIntField(term944, term944.getClass(), "size", -117576464);
        setField(term944, term944.getClass(), "keys", term946);
        setField(term944, term944.getClass(), "vals", term947);
        setField(term914, term914.getClass(), "attributes", term944);
        setField(term914, term914.getClass(), "baseUri", "OWDIEULEFu");
        setField(term914, term914.getClass(), "parentNode", null);
        setIntField(term914, term914.getClass(), "siblingIndex", -1007160944);
        ArrayList term58296 = new ArrayList();
        ((ArrayList) term58296).add((Object)null);
        ((ArrayList) term58296).add((Object)null);
        ((ArrayList) term58296).add((Object)null);
        ((ArrayList) term58296).add((Object)null);
        ((ArrayList) term58296).add((Object)null);
        term58289 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58290 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58293 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58294 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58295 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58298 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58299 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58300 = (Object[]) newArray("java.lang.String", 0);
        setField(term58290, term58290.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term58290, term58290.getClass(), "isBlock", true);
        setBooleanField(term58290, term58290.getClass(), "formatAsBlock", true);
        setBooleanField(term58290, term58290.getClass(), "canContainInline", false);
        setBooleanField(term58290, term58290.getClass(), "empty", true);
        setBooleanField(term58290, term58290.getClass(), "selfClosing", false);
        setBooleanField(term58290, term58290.getClass(), "preserveWhitespace", false);
        setBooleanField(term58290, term58290.getClass(), "formList", false);
        setBooleanField(term58290, term58290.getClass(), "formSubmit", true);
        setField(term58289, term58289.getClass(), "tag", term58290);
        setField(term58293, term58293.getClass(), "referent", null);
        setField(term58294, term58294.getClass(), "lock", term58295);
        setField(term58294, term58294.getClass(), "head", null);
        setLongField(term58294, term58294.getClass(), "queueLength", -8885298608300233488L);
        setField(term58293, term58293.getClass(), "queue", term58294);
        setField(term58293, term58293.getClass(), "next", null);
        setField(term58293, term58293.getClass(), "discovered", null);
        setField(term58289, term58289.getClass(), "shadowChildrenRef", term58293);
        setField(term58289, term58289.getClass(), "childNodes", term58296);
        setIntField(term58298, term58298.getClass(), "size", -117576464);
        setField(term58298, term58298.getClass(), "keys", term58299);
        setField(term58298, term58298.getClass(), "vals", term58300);
        setField(term58289, term58289.getClass(), "attributes", term58298);
        setField(term58289, term58289.getClass(), "baseUri", "OWDIEULEFu");
        setField(term58289, term58289.getClass(), "parentNode", null);
        setIntField(term58289, term58289.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term914, args);
        assertTrue(recursiveEquals(term914, term58289));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


