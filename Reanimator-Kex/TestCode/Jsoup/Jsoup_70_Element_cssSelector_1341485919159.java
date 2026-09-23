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

public class Element_cssSelector_1341485919159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;
     Object term242959;

    public Element_cssSelector_1341485919159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3494 = new ArrayList();
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        ((ArrayList) term3494).add((Object)null);
        term3468 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3490 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3491 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3492 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3498 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3500 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3501 = (Object[]) newArray("java.lang.String", 0);
        setField(term3469, term3469.getClass(), "tagName", "yGtHPyvYiQ");
        setBooleanField(term3469, term3469.getClass(), "isBlock", false);
        setBooleanField(term3469, term3469.getClass(), "formatAsBlock", false);
        setBooleanField(term3469, term3469.getClass(), "canContainInline", false);
        setBooleanField(term3469, term3469.getClass(), "empty", false);
        setBooleanField(term3469, term3469.getClass(), "selfClosing", true);
        setBooleanField(term3469, term3469.getClass(), "preserveWhitespace", true);
        setBooleanField(term3469, term3469.getClass(), "formList", true);
        setBooleanField(term3469, term3469.getClass(), "formSubmit", true);
        setField(term3468, term3468.getClass(), "tag", term3469);
        setField(term3490, term3490.getClass(), "referent", null);
        setField(term3491, term3491.getClass(), "lock", term3492);
        setField(term3491, term3491.getClass(), "head", null);
        setLongField(term3491, term3491.getClass(), "queueLength", -2170847986967241072L);
        setField(term3490, term3490.getClass(), "queue", term3491);
        setField(term3490, term3490.getClass(), "next", null);
        setField(term3490, term3490.getClass(), "discovered", null);
        setField(term3468, term3468.getClass(), "shadowChildrenRef", term3490);
        setField(term3468, term3468.getClass(), "childNodes", term3494);
        setIntField(term3498, term3498.getClass(), "size", -1034506028);
        setField(term3498, term3498.getClass(), "keys", term3500);
        setField(term3498, term3498.getClass(), "vals", term3501);
        setField(term3468, term3468.getClass(), "attributes", term3498);
        setField(term3468, term3468.getClass(), "baseUri", "MvRIxilFMJ");
        setField(term3468, term3468.getClass(), "parentNode", null);
        setIntField(term3468, term3468.getClass(), "siblingIndex", -1263114719);
        ArrayList term242966 = new ArrayList();
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        ((ArrayList) term242966).add((Object)null);
        term242959 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term242960 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term242963 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term242964 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term242965 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term242968 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term242969 = (Object[]) newArray("java.lang.String", 0);
        Object[] term242970 = (Object[]) newArray("java.lang.String", 0);
        setField(term242960, term242960.getClass(), "tagName", "yGtHPyvYiQ");
        setBooleanField(term242960, term242960.getClass(), "isBlock", false);
        setBooleanField(term242960, term242960.getClass(), "formatAsBlock", false);
        setBooleanField(term242960, term242960.getClass(), "canContainInline", false);
        setBooleanField(term242960, term242960.getClass(), "empty", false);
        setBooleanField(term242960, term242960.getClass(), "selfClosing", true);
        setBooleanField(term242960, term242960.getClass(), "preserveWhitespace", true);
        setBooleanField(term242960, term242960.getClass(), "formList", true);
        setBooleanField(term242960, term242960.getClass(), "formSubmit", true);
        setField(term242959, term242959.getClass(), "tag", term242960);
        setField(term242963, term242963.getClass(), "referent", null);
        setField(term242964, term242964.getClass(), "lock", term242965);
        setField(term242964, term242964.getClass(), "head", null);
        setLongField(term242964, term242964.getClass(), "queueLength", -2170847986967241072L);
        setField(term242963, term242963.getClass(), "queue", term242964);
        setField(term242963, term242963.getClass(), "next", null);
        setField(term242963, term242963.getClass(), "discovered", null);
        setField(term242959, term242959.getClass(), "shadowChildrenRef", term242963);
        setField(term242959, term242959.getClass(), "childNodes", term242966);
        setIntField(term242968, term242968.getClass(), "size", -1034506028);
        setField(term242968, term242968.getClass(), "keys", term242969);
        setField(term242968, term242968.getClass(), "vals", term242970);
        setField(term242959, term242959.getClass(), "attributes", term242968);
        setField(term242959, term242959.getClass(), "baseUri", "MvRIxilFMJ");
        setField(term242959, term242959.getClass(), "parentNode", null);
        setIntField(term242959, term242959.getClass(), "siblingIndex", -1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cssSelector", argTypes, term3468, args);
        assertTrue(recursiveEquals(term3468, term242959));
        assertTrue(recursiveEquals(retValue, "yGtHPyvYiQ"));
    }

};


