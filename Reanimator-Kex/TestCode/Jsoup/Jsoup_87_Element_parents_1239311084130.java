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

public class Element_parents_1239311084130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317;
     Object term59884;
     Object term59832;

    public Element_parents_1239311084130() {
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
        setBooleanField(term1318, term1318.getClass(), "isBlock", true);
        setBooleanField(term1318, term1318.getClass(), "formatAsBlock", false);
        setBooleanField(term1318, term1318.getClass(), "canContainInline", true);
        setBooleanField(term1318, term1318.getClass(), "empty", true);
        setBooleanField(term1318, term1318.getClass(), "selfClosing", false);
        setBooleanField(term1318, term1318.getClass(), "preserveWhitespace", false);
        setBooleanField(term1318, term1318.getClass(), "formList", false);
        setBooleanField(term1318, term1318.getClass(), "formSubmit", true);
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
        ArrayList term59891 = new ArrayList();
        term59884 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59888 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term59889 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term59890 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term59893 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59894 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59895 = (Object[]) newArray("java.lang.String", 0);
        setField(term59885, term59885.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term59885, term59885.getClass(), "isBlock", true);
        setBooleanField(term59885, term59885.getClass(), "formatAsBlock", false);
        setBooleanField(term59885, term59885.getClass(), "canContainInline", true);
        setBooleanField(term59885, term59885.getClass(), "empty", true);
        setBooleanField(term59885, term59885.getClass(), "selfClosing", false);
        setBooleanField(term59885, term59885.getClass(), "preserveWhitespace", false);
        setBooleanField(term59885, term59885.getClass(), "formList", false);
        setBooleanField(term59885, term59885.getClass(), "formSubmit", true);
        setField(term59884, term59884.getClass(), "tag", term59885);
        setField(term59888, term59888.getClass(), "referent", null);
        setField(term59889, term59889.getClass(), "lock", term59890);
        setField(term59889, term59889.getClass(), "head", null);
        setLongField(term59889, term59889.getClass(), "queueLength", -316468845751588286L);
        setField(term59888, term59888.getClass(), "queue", term59889);
        setField(term59888, term59888.getClass(), "next", null);
        setField(term59888, term59888.getClass(), "discovered", null);
        setField(term59884, term59884.getClass(), "shadowChildrenRef", term59888);
        setField(term59884, term59884.getClass(), "childNodes", term59891);
        setIntField(term59893, term59893.getClass(), "size", -226514366);
        setField(term59893, term59893.getClass(), "keys", term59894);
        setField(term59893, term59893.getClass(), "vals", term59895);
        setField(term59884, term59884.getClass(), "attributes", term59893);
        setField(term59884, term59884.getClass(), "baseUri", "hxCBltsObl");
        setField(term59884, term59884.getClass(), "parentNode", null);
        setIntField(term59884, term59884.getClass(), "siblingIndex", 1193880199);
        term59832 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term59833 = (Object[]) newArray("java.lang.Object", 0);
        setField(term59832, term59832.getClass(), "elementData", term59833);
        setIntField(term59832, term59832.getClass(), "size", 0);
        setIntField(term59832, term59832.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term1317, args);
        assertTrue(recursiveEquals(term1317, term59884));
        assertTrue(recursiveEquals(retValue, term59832));
    }

};


