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

public class Element_parents_1239311084127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317;
     Object term12480;
     Object term12428;

    public Element_parents_1239311084127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1343 = new ArrayList();
        term1317 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1318 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1339 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1340 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1341 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1347 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1349 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1350 = (Object[]) newArray("java.lang.String", 0);
        setField(term1318, term1318.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term1318, term1318.getClass(), "isBlock", false);
        setBooleanField(term1318, term1318.getClass(), "formatAsBlock", true);
        setBooleanField(term1318, term1318.getClass(), "canContainInline", true);
        setBooleanField(term1318, term1318.getClass(), "empty", false);
        setBooleanField(term1318, term1318.getClass(), "selfClosing", false);
        setBooleanField(term1318, term1318.getClass(), "preserveWhitespace", false);
        setBooleanField(term1318, term1318.getClass(), "formList", true);
        setBooleanField(term1318, term1318.getClass(), "formSubmit", false);
        setField(term1317, term1317.getClass(), "tag", term1318);
        setField(term1339, term1339.getClass(), "referent", null);
        setField(term1340, term1340.getClass(), "lock", term1341);
        setField(term1340, term1340.getClass(), "head", null);
        setLongField(term1340, term1340.getClass(), "queueLength", -316468845751588286L);
        setField(term1339, term1339.getClass(), "queue", term1340);
        setField(term1339, term1339.getClass(), "next", null);
        setField(term1339, term1339.getClass(), "discovered", null);
        setField(term1317, term1317.getClass(), "shadowChildrenRef", term1339);
        setField(term1317, term1317.getClass(), "childNodes", term1343);
        setIntField(term1347, term1347.getClass(), "size", -226514366);
        setField(term1347, term1347.getClass(), "keys", term1349);
        setField(term1347, term1347.getClass(), "vals", term1350);
        setField(term1317, term1317.getClass(), "attributes", term1347);
        setField(term1317, term1317.getClass(), "baseUri", "hxCBltsObl");
        setField(term1317, term1317.getClass(), "parentNode", null);
        setIntField(term1317, term1317.getClass(), "siblingIndex", 1193880199);
        ArrayList term12487 = new ArrayList();
        term12480 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12481 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12484 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term12485 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term12486 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term12489 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12490 = (Object[]) newArray("java.lang.String", 0);
        Object[] term12491 = (Object[]) newArray("java.lang.String", 0);
        setField(term12481, term12481.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term12481, term12481.getClass(), "isBlock", false);
        setBooleanField(term12481, term12481.getClass(), "formatAsBlock", true);
        setBooleanField(term12481, term12481.getClass(), "canContainInline", true);
        setBooleanField(term12481, term12481.getClass(), "empty", false);
        setBooleanField(term12481, term12481.getClass(), "selfClosing", false);
        setBooleanField(term12481, term12481.getClass(), "preserveWhitespace", false);
        setBooleanField(term12481, term12481.getClass(), "formList", true);
        setBooleanField(term12481, term12481.getClass(), "formSubmit", false);
        setField(term12480, term12480.getClass(), "tag", term12481);
        setField(term12484, term12484.getClass(), "referent", null);
        setField(term12485, term12485.getClass(), "lock", term12486);
        setField(term12485, term12485.getClass(), "head", null);
        setLongField(term12485, term12485.getClass(), "queueLength", -316468845751588286L);
        setField(term12484, term12484.getClass(), "queue", term12485);
        setField(term12484, term12484.getClass(), "next", null);
        setField(term12484, term12484.getClass(), "discovered", null);
        setField(term12480, term12480.getClass(), "shadowChildrenRef", term12484);
        setField(term12480, term12480.getClass(), "childNodes", term12487);
        setIntField(term12489, term12489.getClass(), "size", -226514366);
        setField(term12489, term12489.getClass(), "keys", term12490);
        setField(term12489, term12489.getClass(), "vals", term12491);
        setField(term12480, term12480.getClass(), "attributes", term12489);
        setField(term12480, term12480.getClass(), "baseUri", "hxCBltsObl");
        setField(term12480, term12480.getClass(), "parentNode", null);
        setIntField(term12480, term12480.getClass(), "siblingIndex", 1193880199);
        term12428 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term12429 = (Object[]) newArray("java.lang.Object", 0);
        setField(term12428, term12428.getClass(), "elementData", term12429);
        setIntField(term12428, term12428.getClass(), "size", 0);
        setIntField(term12428, term12428.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term1317, args);
        assertTrue(recursiveEquals(term1317, term12480));
        assertTrue(recursiveEquals(retValue, term12428));
    }

};


