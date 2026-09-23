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

public class Element_getElementsByAttributeValueStarting_1936272380174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4674;
     Object term248705;
     Object term248701;

    public Element_getElementsByAttributeValueStarting_1936272380174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4700 = new ArrayList();
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        term4674 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4696 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4697 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4698 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4704 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4706 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4707 = (Object[]) newArray("java.lang.String", 0);
        setField(term4675, term4675.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term4675, term4675.getClass(), "isBlock", false);
        setBooleanField(term4675, term4675.getClass(), "formatAsBlock", false);
        setBooleanField(term4675, term4675.getClass(), "canContainInline", true);
        setBooleanField(term4675, term4675.getClass(), "empty", true);
        setBooleanField(term4675, term4675.getClass(), "selfClosing", false);
        setBooleanField(term4675, term4675.getClass(), "preserveWhitespace", true);
        setBooleanField(term4675, term4675.getClass(), "formList", true);
        setBooleanField(term4675, term4675.getClass(), "formSubmit", false);
        setField(term4674, term4674.getClass(), "tag", term4675);
        setField(term4696, term4696.getClass(), "referent", null);
        setField(term4697, term4697.getClass(), "lock", term4698);
        setField(term4697, term4697.getClass(), "head", null);
        setLongField(term4697, term4697.getClass(), "queueLength", 7994303628307559416L);
        setField(term4696, term4696.getClass(), "queue", term4697);
        setField(term4696, term4696.getClass(), "next", null);
        setField(term4696, term4696.getClass(), "discovered", null);
        setField(term4674, term4674.getClass(), "shadowChildrenRef", term4696);
        setField(term4674, term4674.getClass(), "childNodes", term4700);
        setIntField(term4704, term4704.getClass(), "size", -375014958);
        setField(term4704, term4704.getClass(), "keys", term4706);
        setField(term4704, term4704.getClass(), "vals", term4707);
        setField(term4674, term4674.getClass(), "attributes", term4704);
        setField(term4674, term4674.getClass(), "baseUri", "XkIoWJRNwN");
        setField(term4674, term4674.getClass(), "parentNode", null);
        setIntField(term4674, term4674.getClass(), "siblingIndex", 1107176718);
        ArrayList term248712 = new ArrayList();
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        ((ArrayList) term248712).add((Object)null);
        term248705 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term248706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term248709 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term248710 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term248711 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term248714 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term248715 = (Object[]) newArray("java.lang.String", 0);
        Object[] term248716 = (Object[]) newArray("java.lang.String", 0);
        setField(term248706, term248706.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term248706, term248706.getClass(), "isBlock", false);
        setBooleanField(term248706, term248706.getClass(), "formatAsBlock", false);
        setBooleanField(term248706, term248706.getClass(), "canContainInline", true);
        setBooleanField(term248706, term248706.getClass(), "empty", true);
        setBooleanField(term248706, term248706.getClass(), "selfClosing", false);
        setBooleanField(term248706, term248706.getClass(), "preserveWhitespace", true);
        setBooleanField(term248706, term248706.getClass(), "formList", true);
        setBooleanField(term248706, term248706.getClass(), "formSubmit", false);
        setField(term248705, term248705.getClass(), "tag", term248706);
        setField(term248709, term248709.getClass(), "referent", null);
        setField(term248710, term248710.getClass(), "lock", term248711);
        setField(term248710, term248710.getClass(), "head", null);
        setLongField(term248710, term248710.getClass(), "queueLength", 7994303628307559416L);
        setField(term248709, term248709.getClass(), "queue", term248710);
        setField(term248709, term248709.getClass(), "next", null);
        setField(term248709, term248709.getClass(), "discovered", null);
        setField(term248705, term248705.getClass(), "shadowChildrenRef", term248709);
        setField(term248705, term248705.getClass(), "childNodes", term248712);
        setIntField(term248714, term248714.getClass(), "size", -375014958);
        setField(term248714, term248714.getClass(), "keys", term248715);
        setField(term248714, term248714.getClass(), "vals", term248716);
        setField(term248705, term248705.getClass(), "attributes", term248714);
        setField(term248705, term248705.getClass(), "baseUri", "XkIoWJRNwN");
        setField(term248705, term248705.getClass(), "parentNode", null);
        setIntField(term248705, term248705.getClass(), "siblingIndex", 1107176718);
        term248701 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term248702 = (Object[]) newArray("java.lang.Object", 0);
        setField(term248701, term248701.getClass(), "elementData", term248702);
        setIntField(term248701, term248701.getClass(), "size", 0);
        setIntField(term248701, term248701.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "aNWLJdrZMq";
        args[1] = "HHmNoYxIGj";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4674, args);
        assertTrue(recursiveEquals(term4674, term248705));
        assertTrue(recursiveEquals(retValue, term248701));
    }

};


