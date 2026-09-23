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
import java.lang.Object;
import java.util.ArrayList;

public class Element_appendTo_193945566332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2191;
     Object term2238;

    public Element_appendTo_193945566332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2217 = new ArrayList();
        ((ArrayList) term2217).add((Object)null);
        ((ArrayList) term2217).add((Object)null);
        term2191 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2192 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2213 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2214 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2215 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2221 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2223 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2224 = (Object[]) newArray("java.lang.String", 0);
        setField(term2192, term2192.getClass(), "tagName", "IgRJUzaCwW");
        setBooleanField(term2192, term2192.getClass(), "isBlock", true);
        setBooleanField(term2192, term2192.getClass(), "formatAsBlock", false);
        setBooleanField(term2192, term2192.getClass(), "canContainInline", false);
        setBooleanField(term2192, term2192.getClass(), "empty", false);
        setBooleanField(term2192, term2192.getClass(), "selfClosing", false);
        setBooleanField(term2192, term2192.getClass(), "preserveWhitespace", true);
        setBooleanField(term2192, term2192.getClass(), "formList", false);
        setBooleanField(term2192, term2192.getClass(), "formSubmit", false);
        setField(term2191, term2191.getClass(), "tag", term2192);
        setField(term2213, term2213.getClass(), "referent", null);
        setField(term2214, term2214.getClass(), "lock", term2215);
        setField(term2214, term2214.getClass(), "head", null);
        setLongField(term2214, term2214.getClass(), "queueLength", 2120084523938730454L);
        setField(term2213, term2213.getClass(), "queue", term2214);
        setField(term2213, term2213.getClass(), "next", null);
        setField(term2213, term2213.getClass(), "discovered", null);
        setField(term2191, term2191.getClass(), "shadowChildrenRef", term2213);
        setField(term2191, term2191.getClass(), "childNodes", term2217);
        setIntField(term2221, term2221.getClass(), "size", 1596070772);
        setField(term2221, term2221.getClass(), "keys", term2223);
        setField(term2221, term2221.getClass(), "vals", term2224);
        setField(term2191, term2191.getClass(), "attributes", term2221);
        setField(term2191, term2191.getClass(), "baseUri", "JUmudUmaaV");
        setField(term2191, term2191.getClass(), "parentNode", null);
        setIntField(term2191, term2191.getClass(), "siblingIndex", 97029295);
        ArrayList term2264 = new ArrayList();
        ((ArrayList) term2264).add((Object)null);
        ((ArrayList) term2264).add((Object)null);
        ((ArrayList) term2264).add((Object)null);
        ((ArrayList) term2264).add((Object)null);
        ((ArrayList) term2264).add((Object)null);
        ((ArrayList) term2264).add((Object)null);
        term2238 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2239 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2260 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2261 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2262 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2268 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2270 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2271 = (Object[]) newArray("java.lang.String", 0);
        setField(term2239, term2239.getClass(), "tagName", "KoyGrUJeJW");
        setBooleanField(term2239, term2239.getClass(), "isBlock", true);
        setBooleanField(term2239, term2239.getClass(), "formatAsBlock", true);
        setBooleanField(term2239, term2239.getClass(), "canContainInline", false);
        setBooleanField(term2239, term2239.getClass(), "empty", true);
        setBooleanField(term2239, term2239.getClass(), "selfClosing", true);
        setBooleanField(term2239, term2239.getClass(), "preserveWhitespace", false);
        setBooleanField(term2239, term2239.getClass(), "formList", false);
        setBooleanField(term2239, term2239.getClass(), "formSubmit", false);
        setField(term2238, term2238.getClass(), "tag", term2239);
        setField(term2260, term2260.getClass(), "referent", null);
        setField(term2261, term2261.getClass(), "lock", term2262);
        setField(term2261, term2261.getClass(), "head", null);
        setLongField(term2261, term2261.getClass(), "queueLength", 6855071767938501807L);
        setField(term2260, term2260.getClass(), "queue", term2261);
        setField(term2260, term2260.getClass(), "next", null);
        setField(term2260, term2260.getClass(), "discovered", null);
        setField(term2238, term2238.getClass(), "shadowChildrenRef", term2260);
        setField(term2238, term2238.getClass(), "childNodes", term2264);
        setIntField(term2268, term2268.getClass(), "size", -1371869594);
        setField(term2268, term2268.getClass(), "keys", term2270);
        setField(term2268, term2268.getClass(), "vals", term2271);
        setField(term2238, term2238.getClass(), "attributes", term2268);
        setField(term2238, term2238.getClass(), "baseUri", "HqBOwkVqjD");
        setField(term2238, term2238.getClass(), "parentNode", null);
        setIntField(term2238, term2238.getClass(), "siblingIndex", -2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term2238;
        callMethod(klass, "appendTo", argTypes, term2191, args);
    }

};


