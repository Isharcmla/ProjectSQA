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

public class Element_id_131879034123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;
     Object term57718;

    public Element_id_131879034123() {
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
        ArrayList term57725 = new ArrayList();
        ((ArrayList) term57725).add((Object)null);
        ((ArrayList) term57725).add((Object)null);
        ((ArrayList) term57725).add((Object)null);
        ((ArrayList) term57725).add((Object)null);
        ((ArrayList) term57725).add((Object)null);
        term57718 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57719 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57722 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57723 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57724 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57727 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57728 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57729 = (Object[]) newArray("java.lang.String", 0);
        setField(term57719, term57719.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term57719, term57719.getClass(), "isBlock", true);
        setBooleanField(term57719, term57719.getClass(), "formatAsBlock", false);
        setBooleanField(term57719, term57719.getClass(), "canContainInline", true);
        setBooleanField(term57719, term57719.getClass(), "empty", true);
        setBooleanField(term57719, term57719.getClass(), "selfClosing", true);
        setBooleanField(term57719, term57719.getClass(), "preserveWhitespace", false);
        setBooleanField(term57719, term57719.getClass(), "formList", true);
        setBooleanField(term57719, term57719.getClass(), "formSubmit", false);
        setField(term57718, term57718.getClass(), "tag", term57719);
        setField(term57722, term57722.getClass(), "referent", null);
        setField(term57723, term57723.getClass(), "lock", term57724);
        setField(term57723, term57723.getClass(), "head", null);
        setLongField(term57723, term57723.getClass(), "queueLength", -8885298608300233488L);
        setField(term57722, term57722.getClass(), "queue", term57723);
        setField(term57722, term57722.getClass(), "next", null);
        setField(term57722, term57722.getClass(), "discovered", null);
        setField(term57718, term57718.getClass(), "shadowChildrenRef", term57722);
        setField(term57718, term57718.getClass(), "childNodes", term57725);
        setIntField(term57727, term57727.getClass(), "size", -117576464);
        setField(term57727, term57727.getClass(), "keys", term57728);
        setField(term57727, term57727.getClass(), "vals", term57729);
        setField(term57718, term57718.getClass(), "attributes", term57727);
        setField(term57718, term57718.getClass(), "baseUri", "OWDIEULEFu");
        setField(term57718, term57718.getClass(), "parentNode", null);
        setIntField(term57718, term57718.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term914, args);
        assertTrue(recursiveEquals(term914, term57718));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


