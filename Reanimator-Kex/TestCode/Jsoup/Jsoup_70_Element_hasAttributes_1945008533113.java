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

public class Element_hasAttributes_1945008533113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term56321;

    public Element_hasAttributes_1945008533113() {
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
        ArrayList term56328 = new ArrayList();
        ((ArrayList) term56328).add((Object)null);
        ((ArrayList) term56328).add((Object)null);
        ((ArrayList) term56328).add((Object)null);
        ((ArrayList) term56328).add((Object)null);
        term56321 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56325 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56326 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56327 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56330 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56331 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56332 = (Object[]) newArray("java.lang.String", 0);
        setField(term56322, term56322.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term56322, term56322.getClass(), "isBlock", false);
        setBooleanField(term56322, term56322.getClass(), "formatAsBlock", false);
        setBooleanField(term56322, term56322.getClass(), "canContainInline", false);
        setBooleanField(term56322, term56322.getClass(), "empty", true);
        setBooleanField(term56322, term56322.getClass(), "selfClosing", true);
        setBooleanField(term56322, term56322.getClass(), "preserveWhitespace", true);
        setBooleanField(term56322, term56322.getClass(), "formList", true);
        setBooleanField(term56322, term56322.getClass(), "formSubmit", true);
        setField(term56321, term56321.getClass(), "tag", term56322);
        setField(term56325, term56325.getClass(), "referent", null);
        setField(term56326, term56326.getClass(), "lock", term56327);
        setField(term56326, term56326.getClass(), "head", null);
        setLongField(term56326, term56326.getClass(), "queueLength", 6375119433582206027L);
        setField(term56325, term56325.getClass(), "queue", term56326);
        setField(term56325, term56325.getClass(), "next", null);
        setField(term56325, term56325.getClass(), "discovered", null);
        setField(term56321, term56321.getClass(), "shadowChildrenRef", term56325);
        setField(term56321, term56321.getClass(), "childNodes", term56328);
        setIntField(term56330, term56330.getClass(), "size", 391863371);
        setField(term56330, term56330.getClass(), "keys", term56331);
        setField(term56330, term56330.getClass(), "vals", term56332);
        setField(term56321, term56321.getClass(), "attributes", term56330);
        setField(term56321, term56321.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term56321, term56321.getClass(), "parentNode", null);
        setIntField(term56321, term56321.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAttributes", argTypes, term200, args);
        assertTrue(recursiveEquals(term200, term56321));
        assertTrue(recursiveEquals(retValue, true));
    }

};


