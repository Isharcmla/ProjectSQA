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
import java.lang.Object;
import java.util.ArrayList;

public class Element_nextElementSiblings_117645685951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3669;

    public Element_nextElementSiblings_117645685951() {
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
        setBooleanField(term3670, term3670.getClass(), "isBlock", false);
        setBooleanField(term3670, term3670.getClass(), "formatAsBlock", true);
        setBooleanField(term3670, term3670.getClass(), "canContainInline", true);
        setBooleanField(term3670, term3670.getClass(), "empty", false);
        setBooleanField(term3670, term3670.getClass(), "selfClosing", false);
        setBooleanField(term3670, term3670.getClass(), "preserveWhitespace", true);
        setBooleanField(term3670, term3670.getClass(), "formList", false);
        setBooleanField(term3670, term3670.getClass(), "formSubmit", false);
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextElementSiblings", argTypes, term3669, args);
    }

};


