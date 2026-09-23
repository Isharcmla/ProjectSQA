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

public class Element_previousElementSibling_1256357764159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3669;
     Object term24649;

    public Element_previousElementSibling_1256357764159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3695 = new ArrayList();
        ((ArrayList) term3695).add((Object)null);
        ((ArrayList) term3695).add((Object)null);
        ((ArrayList) term3695).add((Object)null);
        term3669 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3670 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3691 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3692 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3693 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3699 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3701 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3702 = (Object[]) newArray("java.lang.String", 0);
        setField(term3670, term3670.getClass(), "tagName", "dpNsDgfPso");
        setBooleanField(term3670, term3670.getClass(), "isBlock", true);
        setBooleanField(term3670, term3670.getClass(), "formatAsBlock", true);
        setBooleanField(term3670, term3670.getClass(), "canContainInline", false);
        setBooleanField(term3670, term3670.getClass(), "empty", false);
        setBooleanField(term3670, term3670.getClass(), "selfClosing", true);
        setBooleanField(term3670, term3670.getClass(), "preserveWhitespace", false);
        setBooleanField(term3670, term3670.getClass(), "formList", false);
        setBooleanField(term3670, term3670.getClass(), "formSubmit", true);
        setField(term3669, term3669.getClass(), "tag", term3670);
        setField(term3691, term3691.getClass(), "referent", null);
        setField(term3692, term3692.getClass(), "lock", term3693);
        setField(term3692, term3692.getClass(), "head", null);
        setLongField(term3692, term3692.getClass(), "queueLength", -3842548265506930260L);
        setField(term3691, term3691.getClass(), "queue", term3692);
        setField(term3691, term3691.getClass(), "next", null);
        setField(term3691, term3691.getClass(), "discovered", null);
        setField(term3669, term3669.getClass(), "shadowChildrenRef", term3691);
        setField(term3669, term3669.getClass(), "childNodes", term3695);
        setIntField(term3699, term3699.getClass(), "size", 683666002);
        setField(term3699, term3699.getClass(), "keys", term3701);
        setField(term3699, term3699.getClass(), "vals", term3702);
        setField(term3669, term3669.getClass(), "attributes", term3699);
        setField(term3669, term3669.getClass(), "baseUri", "hCWPJQKpdc");
        setField(term3669, term3669.getClass(), "parentNode", null);
        setIntField(term3669, term3669.getClass(), "siblingIndex", 1596213415);
        ArrayList term24656 = new ArrayList();
        ((ArrayList) term24656).add((Object)null);
        ((ArrayList) term24656).add((Object)null);
        ((ArrayList) term24656).add((Object)null);
        term24649 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24650 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24653 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term24654 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term24655 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term24658 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term24659 = (Object[]) newArray("java.lang.String", 0);
        Object[] term24660 = (Object[]) newArray("java.lang.String", 0);
        setField(term24650, term24650.getClass(), "tagName", "dpNsDgfPso");
        setBooleanField(term24650, term24650.getClass(), "isBlock", true);
        setBooleanField(term24650, term24650.getClass(), "formatAsBlock", true);
        setBooleanField(term24650, term24650.getClass(), "canContainInline", false);
        setBooleanField(term24650, term24650.getClass(), "empty", false);
        setBooleanField(term24650, term24650.getClass(), "selfClosing", true);
        setBooleanField(term24650, term24650.getClass(), "preserveWhitespace", false);
        setBooleanField(term24650, term24650.getClass(), "formList", false);
        setBooleanField(term24650, term24650.getClass(), "formSubmit", true);
        setField(term24649, term24649.getClass(), "tag", term24650);
        setField(term24653, term24653.getClass(), "referent", null);
        setField(term24654, term24654.getClass(), "lock", term24655);
        setField(term24654, term24654.getClass(), "head", null);
        setLongField(term24654, term24654.getClass(), "queueLength", -3842548265506930260L);
        setField(term24653, term24653.getClass(), "queue", term24654);
        setField(term24653, term24653.getClass(), "next", null);
        setField(term24653, term24653.getClass(), "discovered", null);
        setField(term24649, term24649.getClass(), "shadowChildrenRef", term24653);
        setField(term24649, term24649.getClass(), "childNodes", term24656);
        setIntField(term24658, term24658.getClass(), "size", 683666002);
        setField(term24658, term24658.getClass(), "keys", term24659);
        setField(term24658, term24658.getClass(), "vals", term24660);
        setField(term24649, term24649.getClass(), "attributes", term24658);
        setField(term24649, term24649.getClass(), "baseUri", "hCWPJQKpdc");
        setField(term24649, term24649.getClass(), "parentNode", null);
        setIntField(term24649, term24649.getClass(), "siblingIndex", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "previousElementSibling", argTypes, term3669, args);
        assertTrue(recursiveEquals(term3669, term24649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


