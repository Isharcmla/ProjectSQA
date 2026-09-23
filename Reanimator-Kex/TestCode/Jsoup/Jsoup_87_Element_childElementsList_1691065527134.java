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

public class Element_childElementsList_1691065527134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522;
     Object term60802;
     Object term60751;

    public Element_childElementsList_1691065527134() {
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
        setBooleanField(term1523, term1523.getClass(), "isBlock", true);
        setBooleanField(term1523, term1523.getClass(), "formatAsBlock", true);
        setBooleanField(term1523, term1523.getClass(), "canContainInline", true);
        setBooleanField(term1523, term1523.getClass(), "empty", true);
        setBooleanField(term1523, term1523.getClass(), "selfClosing", false);
        setBooleanField(term1523, term1523.getClass(), "preserveWhitespace", false);
        setBooleanField(term1523, term1523.getClass(), "formList", false);
        setBooleanField(term1523, term1523.getClass(), "formSubmit", false);
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
        ArrayList term60807 = new ArrayList();
        ArrayList term60811 = new ArrayList();
        ((ArrayList) term60811).add((Object)null);
        ((ArrayList) term60811).add((Object)null);
        term60802 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60803 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60806 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term60809 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term60810 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term60813 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60814 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60815 = (Object[]) newArray("java.lang.String", 0);
        setField(term60803, term60803.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term60803, term60803.getClass(), "isBlock", true);
        setBooleanField(term60803, term60803.getClass(), "formatAsBlock", true);
        setBooleanField(term60803, term60803.getClass(), "canContainInline", true);
        setBooleanField(term60803, term60803.getClass(), "empty", true);
        setBooleanField(term60803, term60803.getClass(), "selfClosing", false);
        setBooleanField(term60803, term60803.getClass(), "preserveWhitespace", false);
        setBooleanField(term60803, term60803.getClass(), "formList", false);
        setBooleanField(term60803, term60803.getClass(), "formSubmit", false);
        setField(term60802, term60802.getClass(), "tag", term60803);
        setField(term60806, term60806.getClass(), "referent", term60807);
        setField(term60809, term60809.getClass(), "lock", term60810);
        setField(term60809, term60809.getClass(), "head", null);
        setLongField(term60809, term60809.getClass(), "queueLength", 0L);
        setField(term60806, term60806.getClass(), "queue", term60809);
        setField(term60806, term60806.getClass(), "next", null);
        setField(term60806, term60806.getClass(), "discovered", null);
        setField(term60802, term60802.getClass(), "shadowChildrenRef", term60806);
        setField(term60802, term60802.getClass(), "childNodes", term60811);
        setIntField(term60813, term60813.getClass(), "size", -602026508);
        setField(term60813, term60813.getClass(), "keys", term60814);
        setField(term60813, term60813.getClass(), "vals", term60815);
        setField(term60802, term60802.getClass(), "attributes", term60813);
        setField(term60802, term60802.getClass(), "baseUri", "UiUYnPrcCi");
        setField(term60802, term60802.getClass(), "parentNode", null);
        setIntField(term60802, term60802.getClass(), "siblingIndex", -157887805);
        term60751 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "childElementsList", argTypes, term1522, args);
        assertTrue(recursiveEquals(term1522, term60802));
        assertTrue(recursiveEquals(retValue, term60751));
    }

};


