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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_is_687264465141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2057;

    public Element_is_687264465141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2083 = new ArrayList();
        ((ArrayList) term2083).add((Object)null);
        ((ArrayList) term2083).add((Object)null);
        ((ArrayList) term2083).add((Object)null);
        term2057 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2058 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2079 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2080 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2081 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2087 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2089 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2090 = (Object[]) newArray("java.lang.String", 0);
        setField(term2058, term2058.getClass(), "tagName", "TJmVBGfTML");
        setBooleanField(term2058, term2058.getClass(), "isBlock", false);
        setBooleanField(term2058, term2058.getClass(), "formatAsBlock", true);
        setBooleanField(term2058, term2058.getClass(), "canContainInline", false);
        setBooleanField(term2058, term2058.getClass(), "empty", false);
        setBooleanField(term2058, term2058.getClass(), "selfClosing", true);
        setBooleanField(term2058, term2058.getClass(), "preserveWhitespace", false);
        setBooleanField(term2058, term2058.getClass(), "formList", false);
        setBooleanField(term2058, term2058.getClass(), "formSubmit", false);
        setField(term2057, term2057.getClass(), "tag", term2058);
        setField(term2079, term2079.getClass(), "referent", null);
        setField(term2080, term2080.getClass(), "lock", term2081);
        setField(term2080, term2080.getClass(), "head", null);
        setLongField(term2080, term2080.getClass(), "queueLength", -4502405999831680926L);
        setField(term2079, term2079.getClass(), "queue", term2080);
        setField(term2079, term2079.getClass(), "next", null);
        setField(term2079, term2079.getClass(), "discovered", null);
        setField(term2057, term2057.getClass(), "shadowChildrenRef", term2079);
        setField(term2057, term2057.getClass(), "childNodes", term2083);
        setIntField(term2087, term2087.getClass(), "size", 458147407);
        setField(term2087, term2087.getClass(), "keys", term2089);
        setField(term2087, term2087.getClass(), "vals", term2090);
        setField(term2057, term2057.getClass(), "attributes", term2087);
        setField(term2057, term2057.getClass(), "baseUri", "tPlsykYBqO");
        setField(term2057, term2057.getClass(), "parentNode", null);
        setIntField(term2057, term2057.getClass(), "siblingIndex", -184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.select.Evaluator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "is", argTypes, term2057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


