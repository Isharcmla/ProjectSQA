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

public class Element_hasAttributes_1945008533112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term9897;

    public Element_hasAttributes_1945008533112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226 = new ArrayList();
        ((ArrayList) term226).add((Object)null);
        ((ArrayList) term226).add((Object)null);
        ((ArrayList) term226).add((Object)null);
        ((ArrayList) term226).add((Object)null);
        term200 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term201 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term222 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term223 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term224 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term230 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term232 = (Object[]) newArray("java.lang.String", 0);
        Object[] term233 = (Object[]) newArray("java.lang.String", 0);
        setField(term201, term201.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term201, term201.getClass(), "isBlock", false);
        setBooleanField(term201, term201.getClass(), "formatAsBlock", false);
        setBooleanField(term201, term201.getClass(), "canContainInline", false);
        setBooleanField(term201, term201.getClass(), "empty", true);
        setBooleanField(term201, term201.getClass(), "selfClosing", true);
        setBooleanField(term201, term201.getClass(), "preserveWhitespace", true);
        setBooleanField(term201, term201.getClass(), "formList", true);
        setBooleanField(term201, term201.getClass(), "formSubmit", true);
        setField(term200, term200.getClass(), "tag", term201);
        setField(term222, term222.getClass(), "referent", null);
        setField(term223, term223.getClass(), "lock", term224);
        setField(term223, term223.getClass(), "head", null);
        setLongField(term223, term223.getClass(), "queueLength", 6375119433582206027L);
        setField(term222, term222.getClass(), "queue", term223);
        setField(term222, term222.getClass(), "next", null);
        setField(term222, term222.getClass(), "discovered", null);
        setField(term200, term200.getClass(), "shadowChildrenRef", term222);
        setField(term200, term200.getClass(), "childNodes", term226);
        setIntField(term230, term230.getClass(), "size", 391863371);
        setField(term230, term230.getClass(), "keys", term232);
        setField(term230, term230.getClass(), "vals", term233);
        setField(term200, term200.getClass(), "attributes", term230);
        setField(term200, term200.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term200, term200.getClass(), "parentNode", null);
        setIntField(term200, term200.getClass(), "siblingIndex", -1922583790);
        ArrayList term9904 = new ArrayList();
        ((ArrayList) term9904).add((Object)null);
        ((ArrayList) term9904).add((Object)null);
        ((ArrayList) term9904).add((Object)null);
        ((ArrayList) term9904).add((Object)null);
        term9897 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9898 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9901 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9902 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9903 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9906 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9907 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9908 = (Object[]) newArray("java.lang.String", 0);
        setField(term9898, term9898.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term9898, term9898.getClass(), "isBlock", false);
        setBooleanField(term9898, term9898.getClass(), "formatAsBlock", false);
        setBooleanField(term9898, term9898.getClass(), "canContainInline", false);
        setBooleanField(term9898, term9898.getClass(), "empty", true);
        setBooleanField(term9898, term9898.getClass(), "selfClosing", true);
        setBooleanField(term9898, term9898.getClass(), "preserveWhitespace", true);
        setBooleanField(term9898, term9898.getClass(), "formList", true);
        setBooleanField(term9898, term9898.getClass(), "formSubmit", true);
        setField(term9897, term9897.getClass(), "tag", term9898);
        setField(term9901, term9901.getClass(), "referent", null);
        setField(term9902, term9902.getClass(), "lock", term9903);
        setField(term9902, term9902.getClass(), "head", null);
        setLongField(term9902, term9902.getClass(), "queueLength", 6375119433582206027L);
        setField(term9901, term9901.getClass(), "queue", term9902);
        setField(term9901, term9901.getClass(), "next", null);
        setField(term9901, term9901.getClass(), "discovered", null);
        setField(term9897, term9897.getClass(), "shadowChildrenRef", term9901);
        setField(term9897, term9897.getClass(), "childNodes", term9904);
        setIntField(term9906, term9906.getClass(), "size", 391863371);
        setField(term9906, term9906.getClass(), "keys", term9907);
        setField(term9906, term9906.getClass(), "vals", term9908);
        setField(term9897, term9897.getClass(), "attributes", term9906);
        setField(term9897, term9897.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term9897, term9897.getClass(), "parentNode", null);
        setIntField(term9897, term9897.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAttributes", argTypes, term200, args);
        assertTrue(recursiveEquals(term200, term9897));
        assertTrue(recursiveEquals(retValue, true));
    }

};


