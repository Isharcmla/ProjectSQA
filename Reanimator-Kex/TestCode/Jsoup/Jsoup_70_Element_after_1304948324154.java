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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_after_1304948324154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3245;

    public Element_after_1304948324154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3271 = new ArrayList();
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        ((ArrayList) term3271).add((Object)null);
        term3245 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3246 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3267 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3268 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3269 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3275 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3277 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3278 = (Object[]) newArray("java.lang.String", 0);
        setField(term3246, term3246.getClass(), "tagName", "sEnIVFtZuQ");
        setBooleanField(term3246, term3246.getClass(), "isBlock", false);
        setBooleanField(term3246, term3246.getClass(), "formatAsBlock", true);
        setBooleanField(term3246, term3246.getClass(), "canContainInline", false);
        setBooleanField(term3246, term3246.getClass(), "empty", false);
        setBooleanField(term3246, term3246.getClass(), "selfClosing", true);
        setBooleanField(term3246, term3246.getClass(), "preserveWhitespace", true);
        setBooleanField(term3246, term3246.getClass(), "formList", true);
        setBooleanField(term3246, term3246.getClass(), "formSubmit", false);
        setField(term3245, term3245.getClass(), "tag", term3246);
        setField(term3267, term3267.getClass(), "referent", null);
        setField(term3268, term3268.getClass(), "lock", term3269);
        setField(term3268, term3268.getClass(), "head", null);
        setLongField(term3268, term3268.getClass(), "queueLength", -6645965768855543712L);
        setField(term3267, term3267.getClass(), "queue", term3268);
        setField(term3267, term3267.getClass(), "next", null);
        setField(term3267, term3267.getClass(), "discovered", null);
        setField(term3245, term3245.getClass(), "shadowChildrenRef", term3267);
        setField(term3245, term3245.getClass(), "childNodes", term3271);
        setIntField(term3275, term3275.getClass(), "size", -1772434990);
        setField(term3275, term3275.getClass(), "keys", term3277);
        setField(term3275, term3275.getClass(), "vals", term3278);
        setField(term3245, term3245.getClass(), "attributes", term3275);
        setField(term3245, term3245.getClass(), "baseUri", "ZVecLZMLHF");
        setField(term3245, term3245.getClass(), "parentNode", null);
        setIntField(term3245, term3245.getClass(), "siblingIndex", -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "after", argTypes, term3245, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


