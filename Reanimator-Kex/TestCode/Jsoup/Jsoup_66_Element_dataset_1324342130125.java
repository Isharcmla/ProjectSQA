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

public class Element_dataset_1324342130125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term12273;
     Object term12272;

    public Element_dataset_1324342130125() {
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
        ArrayList term12280 = new ArrayList();
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        term12273 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12274 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12277 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term12278 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term12279 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term12282 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12283 = (Object[]) newArray("java.lang.String", 0);
        Object[] term12284 = (Object[]) newArray("java.lang.String", 0);
        setField(term12274, term12274.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term12274, term12274.getClass(), "isBlock", false);
        setBooleanField(term12274, term12274.getClass(), "formatAsBlock", true);
        setBooleanField(term12274, term12274.getClass(), "canContainInline", false);
        setBooleanField(term12274, term12274.getClass(), "empty", false);
        setBooleanField(term12274, term12274.getClass(), "selfClosing", true);
        setBooleanField(term12274, term12274.getClass(), "preserveWhitespace", true);
        setBooleanField(term12274, term12274.getClass(), "formList", true);
        setBooleanField(term12274, term12274.getClass(), "formSubmit", false);
        setField(term12273, term12273.getClass(), "tag", term12274);
        setField(term12277, term12277.getClass(), "referent", null);
        setField(term12278, term12278.getClass(), "lock", term12279);
        setField(term12278, term12278.getClass(), "head", null);
        setLongField(term12278, term12278.getClass(), "queueLength", -5476826692763582090L);
        setField(term12277, term12277.getClass(), "queue", term12278);
        setField(term12277, term12277.getClass(), "next", null);
        setField(term12277, term12277.getClass(), "discovered", null);
        setField(term12273, term12273.getClass(), "shadowChildrenRef", term12277);
        setField(term12273, term12273.getClass(), "childNodes", term12280);
        setIntField(term12282, term12282.getClass(), "size", -244121226);
        setField(term12282, term12282.getClass(), "keys", term12283);
        setField(term12282, term12282.getClass(), "vals", term12284);
        setField(term12273, term12273.getClass(), "attributes", term12282);
        setField(term12273, term12273.getClass(), "baseUri", "aKnKipADSo");
        setField(term12273, term12273.getClass(), "parentNode", null);
        setIntField(term12273, term12273.getClass(), "siblingIndex", -203030934);
        term12272 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term12245 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12247 = (Object[]) newArray("java.lang.String", 0);
        Object[] term12248 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term12245, term12245.getClass(), "size", -244121226);
        setField(term12245, term12245.getClass(), "keys", term12247);
        setField(term12245, term12245.getClass(), "vals", term12248);
        setField(term12272, term12272.getClass(), "attributes", term12245);
        setField(term12272, term12272.getClass(), "keySet", null);
        setField(term12272, term12272.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term1183, args);
        assertTrue(recursiveEquals(term1183, term12273));
        assertTrue(recursiveEquals(retValue, term12272));
    }

};


