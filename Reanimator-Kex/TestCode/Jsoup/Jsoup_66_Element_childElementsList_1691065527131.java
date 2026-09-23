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

public class Element_childElementsList_1691065527131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522;
     Object term13398;
     Object term13347;

    public Element_childElementsList_1691065527131() {
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
        setBooleanField(term1523, term1523.getClass(), "empty", false);
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
        ArrayList term13403 = new ArrayList();
        ArrayList term13407 = new ArrayList();
        ((ArrayList) term13407).add((Object)null);
        ((ArrayList) term13407).add((Object)null);
        term13398 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13399 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13402 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term13405 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Null"));
        Object term13406 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term13409 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13410 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13411 = (Object[]) newArray("java.lang.String", 0);
        setField(term13399, term13399.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term13399, term13399.getClass(), "isBlock", true);
        setBooleanField(term13399, term13399.getClass(), "formatAsBlock", true);
        setBooleanField(term13399, term13399.getClass(), "canContainInline", true);
        setBooleanField(term13399, term13399.getClass(), "empty", false);
        setBooleanField(term13399, term13399.getClass(), "selfClosing", false);
        setBooleanField(term13399, term13399.getClass(), "preserveWhitespace", false);
        setBooleanField(term13399, term13399.getClass(), "formList", false);
        setBooleanField(term13399, term13399.getClass(), "formSubmit", false);
        setField(term13398, term13398.getClass(), "tag", term13399);
        setField(term13402, term13402.getClass(), "referent", term13403);
        setField(term13405, term13405.getClass(), "lock", term13406);
        setField(term13405, term13405.getClass(), "head", null);
        setLongField(term13405, term13405.getClass(), "queueLength", 0L);
        setField(term13402, term13402.getClass(), "queue", term13405);
        setField(term13402, term13402.getClass(), "next", null);
        setField(term13402, term13402.getClass(), "discovered", null);
        setField(term13398, term13398.getClass(), "shadowChildrenRef", term13402);
        setField(term13398, term13398.getClass(), "childNodes", term13407);
        setIntField(term13409, term13409.getClass(), "size", -602026508);
        setField(term13409, term13409.getClass(), "keys", term13410);
        setField(term13409, term13409.getClass(), "vals", term13411);
        setField(term13398, term13398.getClass(), "attributes", term13409);
        setField(term13398, term13398.getClass(), "baseUri", "UiUYnPrcCi");
        setField(term13398, term13398.getClass(), "parentNode", null);
        setIntField(term13398, term13398.getClass(), "siblingIndex", -157887805);
        term13347 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "childElementsList", argTypes, term1522, args);
        assertTrue(recursiveEquals(term1522, term13398));
        assertTrue(recursiveEquals(retValue, term13347));
    }

};


