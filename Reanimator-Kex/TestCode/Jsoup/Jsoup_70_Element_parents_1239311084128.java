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

public class Element_parents_1239311084128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317;
     Object term58926;
     Object term58874;

    public Element_parents_1239311084128() {
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
        setBooleanField(term1318, term1318.getClass(), "formatAsBlock", true);
        setBooleanField(term1318, term1318.getClass(), "canContainInline", false);
        setBooleanField(term1318, term1318.getClass(), "empty", false);
        setBooleanField(term1318, term1318.getClass(), "selfClosing", false);
        setBooleanField(term1318, term1318.getClass(), "preserveWhitespace", true);
        setBooleanField(term1318, term1318.getClass(), "formList", false);
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
        ArrayList term58933 = new ArrayList();
        term58926 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58927 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58930 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58931 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58932 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58935 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58936 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58937 = (Object[]) newArray("java.lang.String", 0);
        setField(term58927, term58927.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term58927, term58927.getClass(), "isBlock", true);
        setBooleanField(term58927, term58927.getClass(), "formatAsBlock", true);
        setBooleanField(term58927, term58927.getClass(), "canContainInline", false);
        setBooleanField(term58927, term58927.getClass(), "empty", false);
        setBooleanField(term58927, term58927.getClass(), "selfClosing", false);
        setBooleanField(term58927, term58927.getClass(), "preserveWhitespace", true);
        setBooleanField(term58927, term58927.getClass(), "formList", false);
        setBooleanField(term58927, term58927.getClass(), "formSubmit", false);
        setField(term58926, term58926.getClass(), "tag", term58927);
        setField(term58930, term58930.getClass(), "referent", null);
        setField(term58931, term58931.getClass(), "lock", term58932);
        setField(term58931, term58931.getClass(), "head", null);
        setLongField(term58931, term58931.getClass(), "queueLength", -316468845751588286L);
        setField(term58930, term58930.getClass(), "queue", term58931);
        setField(term58930, term58930.getClass(), "next", null);
        setField(term58930, term58930.getClass(), "discovered", null);
        setField(term58926, term58926.getClass(), "shadowChildrenRef", term58930);
        setField(term58926, term58926.getClass(), "childNodes", term58933);
        setIntField(term58935, term58935.getClass(), "size", -226514366);
        setField(term58935, term58935.getClass(), "keys", term58936);
        setField(term58935, term58935.getClass(), "vals", term58937);
        setField(term58926, term58926.getClass(), "attributes", term58935);
        setField(term58926, term58926.getClass(), "baseUri", "hxCBltsObl");
        setField(term58926, term58926.getClass(), "parentNode", null);
        setIntField(term58926, term58926.getClass(), "siblingIndex", 1193880199);
        term58874 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term58875 = (Object[]) newArray("java.lang.Object", 0);
        setField(term58874, term58874.getClass(), "elementData", term58875);
        setIntField(term58874, term58874.getClass(), "size", 0);
        setIntField(term58874, term58874.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term1317, args);
        assertTrue(recursiveEquals(term1317, term58926));
        assertTrue(recursiveEquals(retValue, term58874));
    }

};


