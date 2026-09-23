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

public class Element_nextElementSibling_1527392136161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3602;
     Object term243182;

    public Element_nextElementSibling_1527392136161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3628 = new ArrayList();
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        term3602 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3603 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3624 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3625 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3626 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3634 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3635 = (Object[]) newArray("java.lang.String", 0);
        setField(term3603, term3603.getClass(), "tagName", "pORebkoRdD");
        setBooleanField(term3603, term3603.getClass(), "isBlock", true);
        setBooleanField(term3603, term3603.getClass(), "formatAsBlock", true);
        setBooleanField(term3603, term3603.getClass(), "canContainInline", false);
        setBooleanField(term3603, term3603.getClass(), "empty", true);
        setBooleanField(term3603, term3603.getClass(), "selfClosing", false);
        setBooleanField(term3603, term3603.getClass(), "preserveWhitespace", true);
        setBooleanField(term3603, term3603.getClass(), "formList", true);
        setBooleanField(term3603, term3603.getClass(), "formSubmit", false);
        setField(term3602, term3602.getClass(), "tag", term3603);
        setField(term3624, term3624.getClass(), "referent", null);
        setField(term3625, term3625.getClass(), "lock", term3626);
        setField(term3625, term3625.getClass(), "head", null);
        setLongField(term3625, term3625.getClass(), "queueLength", -4443169559037975007L);
        setField(term3624, term3624.getClass(), "queue", term3625);
        setField(term3624, term3624.getClass(), "next", null);
        setField(term3624, term3624.getClass(), "discovered", null);
        setField(term3602, term3602.getClass(), "shadowChildrenRef", term3624);
        setField(term3602, term3602.getClass(), "childNodes", term3628);
        setIntField(term3632, term3632.getClass(), "size", -1347665717);
        setField(term3632, term3632.getClass(), "keys", term3634);
        setField(term3632, term3632.getClass(), "vals", term3635);
        setField(term3602, term3602.getClass(), "attributes", term3632);
        setField(term3602, term3602.getClass(), "baseUri", "mXGCWJDOqA");
        setField(term3602, term3602.getClass(), "parentNode", null);
        setIntField(term3602, term3602.getClass(), "siblingIndex", -1888585309);
        ArrayList term243189 = new ArrayList();
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        ((ArrayList) term243189).add((Object)null);
        term243182 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term243183 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term243186 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term243187 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term243188 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term243191 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term243192 = (Object[]) newArray("java.lang.String", 0);
        Object[] term243193 = (Object[]) newArray("java.lang.String", 0);
        setField(term243183, term243183.getClass(), "tagName", "pORebkoRdD");
        setBooleanField(term243183, term243183.getClass(), "isBlock", true);
        setBooleanField(term243183, term243183.getClass(), "formatAsBlock", true);
        setBooleanField(term243183, term243183.getClass(), "canContainInline", false);
        setBooleanField(term243183, term243183.getClass(), "empty", true);
        setBooleanField(term243183, term243183.getClass(), "selfClosing", false);
        setBooleanField(term243183, term243183.getClass(), "preserveWhitespace", true);
        setBooleanField(term243183, term243183.getClass(), "formList", true);
        setBooleanField(term243183, term243183.getClass(), "formSubmit", false);
        setField(term243182, term243182.getClass(), "tag", term243183);
        setField(term243186, term243186.getClass(), "referent", null);
        setField(term243187, term243187.getClass(), "lock", term243188);
        setField(term243187, term243187.getClass(), "head", null);
        setLongField(term243187, term243187.getClass(), "queueLength", -4443169559037975007L);
        setField(term243186, term243186.getClass(), "queue", term243187);
        setField(term243186, term243186.getClass(), "next", null);
        setField(term243186, term243186.getClass(), "discovered", null);
        setField(term243182, term243182.getClass(), "shadowChildrenRef", term243186);
        setField(term243182, term243182.getClass(), "childNodes", term243189);
        setIntField(term243191, term243191.getClass(), "size", -1347665717);
        setField(term243191, term243191.getClass(), "keys", term243192);
        setField(term243191, term243191.getClass(), "vals", term243193);
        setField(term243182, term243182.getClass(), "attributes", term243191);
        setField(term243182, term243182.getClass(), "baseUri", "mXGCWJDOqA");
        setField(term243182, term243182.getClass(), "parentNode", null);
        setIntField(term243182, term243182.getClass(), "siblingIndex", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term3602, args);
        assertTrue(recursiveEquals(term3602, term243182));
        assertTrue(recursiveEquals(retValue, null));
    }

};


