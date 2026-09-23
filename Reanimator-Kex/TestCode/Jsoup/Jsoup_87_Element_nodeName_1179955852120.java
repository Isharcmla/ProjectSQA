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

public class Element_nodeName_1179955852120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;
     Object term57121;

    public Element_nodeName_1179955852120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        term557 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term558 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term579 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term580 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term581 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589 = (Object[]) newArray("java.lang.String", 0);
        Object[] term590 = (Object[]) newArray("java.lang.String", 0);
        setField(term558, term558.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term558, term558.getClass(), "isBlock", false);
        setBooleanField(term558, term558.getClass(), "formatAsBlock", true);
        setBooleanField(term558, term558.getClass(), "canContainInline", true);
        setBooleanField(term558, term558.getClass(), "empty", true);
        setBooleanField(term558, term558.getClass(), "selfClosing", false);
        setBooleanField(term558, term558.getClass(), "preserveWhitespace", false);
        setBooleanField(term558, term558.getClass(), "formList", false);
        setBooleanField(term558, term558.getClass(), "formSubmit", false);
        setField(term557, term557.getClass(), "tag", term558);
        setField(term579, term579.getClass(), "referent", null);
        setField(term580, term580.getClass(), "lock", term581);
        setField(term580, term580.getClass(), "head", null);
        setLongField(term580, term580.getClass(), "queueLength", 4872422362414183754L);
        setField(term579, term579.getClass(), "queue", term580);
        setField(term579, term579.getClass(), "next", null);
        setField(term579, term579.getClass(), "discovered", null);
        setField(term557, term557.getClass(), "shadowChildrenRef", term579);
        setField(term557, term557.getClass(), "childNodes", term583);
        setIntField(term587, term587.getClass(), "size", -883034806);
        setField(term587, term587.getClass(), "keys", term589);
        setField(term587, term587.getClass(), "vals", term590);
        setField(term557, term557.getClass(), "attributes", term587);
        setField(term557, term557.getClass(), "baseUri", "pCTimMblYc");
        setField(term557, term557.getClass(), "parentNode", null);
        setIntField(term557, term557.getClass(), "siblingIndex", 1585847225);
        ArrayList term57128 = new ArrayList();
        ((ArrayList) term57128).add((Object)null);
        ((ArrayList) term57128).add((Object)null);
        term57121 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57122 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57125 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57126 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57127 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57130 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57131 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57132 = (Object[]) newArray("java.lang.String", 0);
        setField(term57122, term57122.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term57122, term57122.getClass(), "isBlock", false);
        setBooleanField(term57122, term57122.getClass(), "formatAsBlock", true);
        setBooleanField(term57122, term57122.getClass(), "canContainInline", true);
        setBooleanField(term57122, term57122.getClass(), "empty", true);
        setBooleanField(term57122, term57122.getClass(), "selfClosing", false);
        setBooleanField(term57122, term57122.getClass(), "preserveWhitespace", false);
        setBooleanField(term57122, term57122.getClass(), "formList", false);
        setBooleanField(term57122, term57122.getClass(), "formSubmit", false);
        setField(term57121, term57121.getClass(), "tag", term57122);
        setField(term57125, term57125.getClass(), "referent", null);
        setField(term57126, term57126.getClass(), "lock", term57127);
        setField(term57126, term57126.getClass(), "head", null);
        setLongField(term57126, term57126.getClass(), "queueLength", 4872422362414183754L);
        setField(term57125, term57125.getClass(), "queue", term57126);
        setField(term57125, term57125.getClass(), "next", null);
        setField(term57125, term57125.getClass(), "discovered", null);
        setField(term57121, term57121.getClass(), "shadowChildrenRef", term57125);
        setField(term57121, term57121.getClass(), "childNodes", term57128);
        setIntField(term57130, term57130.getClass(), "size", -883034806);
        setField(term57130, term57130.getClass(), "keys", term57131);
        setField(term57130, term57130.getClass(), "vals", term57132);
        setField(term57121, term57121.getClass(), "attributes", term57130);
        setField(term57121, term57121.getClass(), "baseUri", "pCTimMblYc");
        setField(term57121, term57121.getClass(), "parentNode", null);
        setIntField(term57121, term57121.getClass(), "siblingIndex", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term557, args);
        assertTrue(recursiveEquals(term557, term57121));
        assertTrue(recursiveEquals(retValue, "HyxfbSQYBe"));
    }

};


