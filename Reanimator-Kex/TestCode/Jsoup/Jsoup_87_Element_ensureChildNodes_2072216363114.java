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

public class Element_ensureChildNodes_2072216363114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term56407;
     Object term56360;

    public Element_ensureChildNodes_2072216363114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term159 = new ArrayList();
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        term133 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term155 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term156 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term157 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term163 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term165 = (Object[]) newArray("java.lang.String", 0);
        Object[] term166 = (Object[]) newArray("java.lang.String", 0);
        setField(term134, term134.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term134, term134.getClass(), "isBlock", true);
        setBooleanField(term134, term134.getClass(), "formatAsBlock", true);
        setBooleanField(term134, term134.getClass(), "canContainInline", false);
        setBooleanField(term134, term134.getClass(), "empty", false);
        setBooleanField(term134, term134.getClass(), "selfClosing", true);
        setBooleanField(term134, term134.getClass(), "preserveWhitespace", true);
        setBooleanField(term134, term134.getClass(), "formList", true);
        setBooleanField(term134, term134.getClass(), "formSubmit", true);
        setField(term133, term133.getClass(), "tag", term134);
        setField(term155, term155.getClass(), "referent", null);
        setField(term156, term156.getClass(), "lock", term157);
        setField(term156, term156.getClass(), "head", null);
        setLongField(term156, term156.getClass(), "queueLength", 2442117782898005296L);
        setField(term155, term155.getClass(), "queue", term156);
        setField(term155, term155.getClass(), "next", null);
        setField(term155, term155.getClass(), "discovered", null);
        setField(term133, term133.getClass(), "shadowChildrenRef", term155);
        setField(term133, term133.getClass(), "childNodes", term159);
        setIntField(term163, term163.getClass(), "size", 1162663216);
        setField(term163, term163.getClass(), "keys", term165);
        setField(term163, term163.getClass(), "vals", term166);
        setField(term133, term133.getClass(), "attributes", term163);
        setField(term133, term133.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term133, term133.getClass(), "parentNode", null);
        setIntField(term133, term133.getClass(), "siblingIndex", 1484323161);
        ArrayList term56414 = new ArrayList();
        ((ArrayList) term56414).add((Object)null);
        ((ArrayList) term56414).add((Object)null);
        ((ArrayList) term56414).add((Object)null);
        ((ArrayList) term56414).add((Object)null);
        ((ArrayList) term56414).add((Object)null);
        term56407 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56411 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56412 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56413 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56416 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56417 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56418 = (Object[]) newArray("java.lang.String", 0);
        setField(term56408, term56408.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term56408, term56408.getClass(), "isBlock", true);
        setBooleanField(term56408, term56408.getClass(), "formatAsBlock", true);
        setBooleanField(term56408, term56408.getClass(), "canContainInline", false);
        setBooleanField(term56408, term56408.getClass(), "empty", false);
        setBooleanField(term56408, term56408.getClass(), "selfClosing", true);
        setBooleanField(term56408, term56408.getClass(), "preserveWhitespace", true);
        setBooleanField(term56408, term56408.getClass(), "formList", true);
        setBooleanField(term56408, term56408.getClass(), "formSubmit", true);
        setField(term56407, term56407.getClass(), "tag", term56408);
        setField(term56411, term56411.getClass(), "referent", null);
        setField(term56412, term56412.getClass(), "lock", term56413);
        setField(term56412, term56412.getClass(), "head", null);
        setLongField(term56412, term56412.getClass(), "queueLength", 2442117782898005296L);
        setField(term56411, term56411.getClass(), "queue", term56412);
        setField(term56411, term56411.getClass(), "next", null);
        setField(term56411, term56411.getClass(), "discovered", null);
        setField(term56407, term56407.getClass(), "shadowChildrenRef", term56411);
        setField(term56407, term56407.getClass(), "childNodes", term56414);
        setIntField(term56416, term56416.getClass(), "size", 1162663216);
        setField(term56416, term56416.getClass(), "keys", term56417);
        setField(term56416, term56416.getClass(), "vals", term56418);
        setField(term56407, term56407.getClass(), "attributes", term56416);
        setField(term56407, term56407.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term56407, term56407.getClass(), "parentNode", null);
        setIntField(term56407, term56407.getClass(), "siblingIndex", 1484323161);
        term56360 = new ArrayList();
        ((ArrayList) term56360).add((Object)null);
        ((ArrayList) term56360).add((Object)null);
        ((ArrayList) term56360).add((Object)null);
        ((ArrayList) term56360).add((Object)null);
        ((ArrayList) term56360).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "ensureChildNodes", argTypes, term133, args);
        assertTrue(recursiveEquals(term133, term56407));
        assertTrue(recursiveEquals(retValue, term56360));
    }

};


