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

public class Element_childElementsList_1691065527132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522;
     Object term59844;
     Object term59793;

    public Element_childElementsList_1691065527132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1548 = new ArrayList();
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        term1522 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1523 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1544 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1545 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1546 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1552 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1554 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1555 = (Object[]) newArray("java.lang.String", 0);
        setField(term1523, term1523.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term1523, term1523.getClass(), "isBlock", false);
        setBooleanField(term1523, term1523.getClass(), "formatAsBlock", false);
        setBooleanField(term1523, term1523.getClass(), "canContainInline", false);
        setBooleanField(term1523, term1523.getClass(), "empty", false);
        setBooleanField(term1523, term1523.getClass(), "selfClosing", false);
        setBooleanField(term1523, term1523.getClass(), "preserveWhitespace", true);
        setBooleanField(term1523, term1523.getClass(), "formList", true);
        setBooleanField(term1523, term1523.getClass(), "formSubmit", true);
        setField(term1522, term1522.getClass(), "tag", term1523);
        setField(term1544, term1544.getClass(), "referent", null);
        setField(term1545, term1545.getClass(), "lock", term1546);
        setField(term1545, term1545.getClass(), "head", null);
        setLongField(term1545, term1545.getClass(), "queueLength", 8428634514691209827L);
        setField(term1544, term1544.getClass(), "queue", term1545);
        setField(term1544, term1544.getClass(), "next", null);
        setField(term1544, term1544.getClass(), "discovered", null);
        setField(term1522, term1522.getClass(), "shadowChildrenRef", term1544);
        setField(term1522, term1522.getClass(), "childNodes", term1548);
        setIntField(term1552, term1552.getClass(), "size", -602026508);
        setField(term1552, term1552.getClass(), "keys", term1554);
        setField(term1552, term1552.getClass(), "vals", term1555);
        setField(term1522, term1522.getClass(), "attributes", term1552);
        setField(term1522, term1522.getClass(), "baseUri", "UiUYnPrcCi");
        setField(term1522, term1522.getClass(), "parentNode", null);
        setIntField(term1522, term1522.getClass(), "siblingIndex", -157887805);
        ArrayList term59849 = new ArrayList();
        ArrayList term59853 = new ArrayList();
        ((ArrayList) term59853).add((Object)null);
        ((ArrayList) term59853).add((Object)null);
        term59844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59848 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term59851 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term59852 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term59855 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59856 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59857 = (Object[]) newArray("java.lang.String", 0);
        setField(term59845, term59845.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term59845, term59845.getClass(), "isBlock", false);
        setBooleanField(term59845, term59845.getClass(), "formatAsBlock", false);
        setBooleanField(term59845, term59845.getClass(), "canContainInline", false);
        setBooleanField(term59845, term59845.getClass(), "empty", false);
        setBooleanField(term59845, term59845.getClass(), "selfClosing", false);
        setBooleanField(term59845, term59845.getClass(), "preserveWhitespace", true);
        setBooleanField(term59845, term59845.getClass(), "formList", true);
        setBooleanField(term59845, term59845.getClass(), "formSubmit", true);
        setField(term59844, term59844.getClass(), "tag", term59845);
        setField(term59848, term59848.getClass(), "referent", term59849);
        setField(term59851, term59851.getClass(), "lock", term59852);
        setField(term59851, term59851.getClass(), "head", null);
        setLongField(term59851, term59851.getClass(), "queueLength", 0L);
        setField(term59848, term59848.getClass(), "queue", term59851);
        setField(term59848, term59848.getClass(), "next", null);
        setField(term59848, term59848.getClass(), "discovered", null);
        setField(term59844, term59844.getClass(), "shadowChildrenRef", term59848);
        setField(term59844, term59844.getClass(), "childNodes", term59853);
        setIntField(term59855, term59855.getClass(), "size", -602026508);
        setField(term59855, term59855.getClass(), "keys", term59856);
        setField(term59855, term59855.getClass(), "vals", term59857);
        setField(term59844, term59844.getClass(), "attributes", term59855);
        setField(term59844, term59844.getClass(), "baseUri", "UiUYnPrcCi");
        setField(term59844, term59844.getClass(), "parentNode", null);
        setIntField(term59844, term59844.getClass(), "siblingIndex", -157887805);
        term59793 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "childElementsList", argTypes, term1522, args);
        assertTrue(recursiveEquals(term1522, term59844));
        assertTrue(recursiveEquals(retValue, term59793));
    }

};


