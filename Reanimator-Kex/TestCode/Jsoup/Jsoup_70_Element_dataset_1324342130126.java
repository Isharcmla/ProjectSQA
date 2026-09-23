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

public class Element_dataset_1324342130126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term58719;
     Object term58718;

    public Element_dataset_1324342130126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1209 = new ArrayList();
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        term1183 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1205 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1206 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1207 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1215 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1216 = (Object[]) newArray("java.lang.String", 0);
        setField(term1184, term1184.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term1184, term1184.getClass(), "isBlock", false);
        setBooleanField(term1184, term1184.getClass(), "formatAsBlock", true);
        setBooleanField(term1184, term1184.getClass(), "canContainInline", false);
        setBooleanField(term1184, term1184.getClass(), "empty", false);
        setBooleanField(term1184, term1184.getClass(), "selfClosing", true);
        setBooleanField(term1184, term1184.getClass(), "preserveWhitespace", true);
        setBooleanField(term1184, term1184.getClass(), "formList", true);
        setBooleanField(term1184, term1184.getClass(), "formSubmit", false);
        setField(term1183, term1183.getClass(), "tag", term1184);
        setField(term1205, term1205.getClass(), "referent", null);
        setField(term1206, term1206.getClass(), "lock", term1207);
        setField(term1206, term1206.getClass(), "head", null);
        setLongField(term1206, term1206.getClass(), "queueLength", -5476826692763582090L);
        setField(term1205, term1205.getClass(), "queue", term1206);
        setField(term1205, term1205.getClass(), "next", null);
        setField(term1205, term1205.getClass(), "discovered", null);
        setField(term1183, term1183.getClass(), "shadowChildrenRef", term1205);
        setField(term1183, term1183.getClass(), "childNodes", term1209);
        setIntField(term1213, term1213.getClass(), "size", -244121226);
        setField(term1213, term1213.getClass(), "keys", term1215);
        setField(term1213, term1213.getClass(), "vals", term1216);
        setField(term1183, term1183.getClass(), "attributes", term1213);
        setField(term1183, term1183.getClass(), "baseUri", "aKnKipADSo");
        setField(term1183, term1183.getClass(), "parentNode", null);
        setIntField(term1183, term1183.getClass(), "siblingIndex", -203030934);
        ArrayList term58726 = new ArrayList();
        ((ArrayList) term58726).add((Object)null);
        ((ArrayList) term58726).add((Object)null);
        ((ArrayList) term58726).add((Object)null);
        term58719 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58720 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58723 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58724 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58725 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58728 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58729 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58730 = (Object[]) newArray("java.lang.String", 0);
        setField(term58720, term58720.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term58720, term58720.getClass(), "isBlock", false);
        setBooleanField(term58720, term58720.getClass(), "formatAsBlock", true);
        setBooleanField(term58720, term58720.getClass(), "canContainInline", false);
        setBooleanField(term58720, term58720.getClass(), "empty", false);
        setBooleanField(term58720, term58720.getClass(), "selfClosing", true);
        setBooleanField(term58720, term58720.getClass(), "preserveWhitespace", true);
        setBooleanField(term58720, term58720.getClass(), "formList", true);
        setBooleanField(term58720, term58720.getClass(), "formSubmit", false);
        setField(term58719, term58719.getClass(), "tag", term58720);
        setField(term58723, term58723.getClass(), "referent", null);
        setField(term58724, term58724.getClass(), "lock", term58725);
        setField(term58724, term58724.getClass(), "head", null);
        setLongField(term58724, term58724.getClass(), "queueLength", -5476826692763582090L);
        setField(term58723, term58723.getClass(), "queue", term58724);
        setField(term58723, term58723.getClass(), "next", null);
        setField(term58723, term58723.getClass(), "discovered", null);
        setField(term58719, term58719.getClass(), "shadowChildrenRef", term58723);
        setField(term58719, term58719.getClass(), "childNodes", term58726);
        setIntField(term58728, term58728.getClass(), "size", -244121226);
        setField(term58728, term58728.getClass(), "keys", term58729);
        setField(term58728, term58728.getClass(), "vals", term58730);
        setField(term58719, term58719.getClass(), "attributes", term58728);
        setField(term58719, term58719.getClass(), "baseUri", "aKnKipADSo");
        setField(term58719, term58719.getClass(), "parentNode", null);
        setIntField(term58719, term58719.getClass(), "siblingIndex", -203030934);
        term58718 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term58691 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58693 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58694 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term58691, term58691.getClass(), "size", -244121226);
        setField(term58691, term58691.getClass(), "keys", term58693);
        setField(term58691, term58691.getClass(), "vals", term58694);
        setField(term58718, term58718.getClass(), "attributes", term58691);
        setField(term58718, term58718.getClass(), "keySet", null);
        setField(term58718, term58718.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term1183, args);
        assertTrue(recursiveEquals(term1183, term58719));
        assertTrue(recursiveEquals(retValue, term58718));
    }

};


