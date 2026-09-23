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

public class Element_id_131879034122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;
     Object term11294;

    public Element_id_131879034122() {
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
        setBooleanField(term915, term915.getClass(), "formatAsBlock", false);
        setBooleanField(term915, term915.getClass(), "canContainInline", true);
        setBooleanField(term915, term915.getClass(), "empty", true);
        setBooleanField(term915, term915.getClass(), "selfClosing", true);
        setBooleanField(term915, term915.getClass(), "preserveWhitespace", false);
        setBooleanField(term915, term915.getClass(), "formList", true);
        setBooleanField(term915, term915.getClass(), "formSubmit", false);
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
        ArrayList term11301 = new ArrayList();
        ((ArrayList) term11301).add((Object)null);
        ((ArrayList) term11301).add((Object)null);
        ((ArrayList) term11301).add((Object)null);
        ((ArrayList) term11301).add((Object)null);
        ((ArrayList) term11301).add((Object)null);
        term11294 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11295 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11298 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term11299 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term11300 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term11303 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11304 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11305 = (Object[]) newArray("java.lang.String", 0);
        setField(term11295, term11295.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term11295, term11295.getClass(), "isBlock", true);
        setBooleanField(term11295, term11295.getClass(), "formatAsBlock", false);
        setBooleanField(term11295, term11295.getClass(), "canContainInline", true);
        setBooleanField(term11295, term11295.getClass(), "empty", true);
        setBooleanField(term11295, term11295.getClass(), "selfClosing", true);
        setBooleanField(term11295, term11295.getClass(), "preserveWhitespace", false);
        setBooleanField(term11295, term11295.getClass(), "formList", true);
        setBooleanField(term11295, term11295.getClass(), "formSubmit", false);
        setField(term11294, term11294.getClass(), "tag", term11295);
        setField(term11298, term11298.getClass(), "referent", null);
        setField(term11299, term11299.getClass(), "lock", term11300);
        setField(term11299, term11299.getClass(), "head", null);
        setLongField(term11299, term11299.getClass(), "queueLength", -8885298608300233488L);
        setField(term11298, term11298.getClass(), "queue", term11299);
        setField(term11298, term11298.getClass(), "next", null);
        setField(term11298, term11298.getClass(), "discovered", null);
        setField(term11294, term11294.getClass(), "shadowChildrenRef", term11298);
        setField(term11294, term11294.getClass(), "childNodes", term11301);
        setIntField(term11303, term11303.getClass(), "size", -117576464);
        setField(term11303, term11303.getClass(), "keys", term11304);
        setField(term11303, term11303.getClass(), "vals", term11305);
        setField(term11294, term11294.getClass(), "attributes", term11303);
        setField(term11294, term11294.getClass(), "baseUri", "OWDIEULEFu");
        setField(term11294, term11294.getClass(), "parentNode", null);
        setIntField(term11294, term11294.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term914, args);
        assertTrue(recursiveEquals(term914, term11294));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


