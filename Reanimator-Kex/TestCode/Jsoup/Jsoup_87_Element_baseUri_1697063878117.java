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

public class Element_baseUri_1697063878117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term56728;

    public Element_baseUri_1697063878117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term360 = new ArrayList();
        ((ArrayList) term360).add((Object)null);
        ((ArrayList) term360).add((Object)null);
        ((ArrayList) term360).add((Object)null);
        ((ArrayList) term360).add((Object)null);
        term334 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term335 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term356 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term357 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term358 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term364 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term366 = (Object[]) newArray("java.lang.String", 0);
        Object[] term367 = (Object[]) newArray("java.lang.String", 0);
        setField(term335, term335.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term335, term335.getClass(), "isBlock", false);
        setBooleanField(term335, term335.getClass(), "formatAsBlock", true);
        setBooleanField(term335, term335.getClass(), "canContainInline", true);
        setBooleanField(term335, term335.getClass(), "empty", false);
        setBooleanField(term335, term335.getClass(), "selfClosing", true);
        setBooleanField(term335, term335.getClass(), "preserveWhitespace", true);
        setBooleanField(term335, term335.getClass(), "formList", true);
        setBooleanField(term335, term335.getClass(), "formSubmit", false);
        setField(term334, term334.getClass(), "tag", term335);
        setField(term356, term356.getClass(), "referent", null);
        setField(term357, term357.getClass(), "lock", term358);
        setField(term357, term357.getClass(), "head", null);
        setLongField(term357, term357.getClass(), "queueLength", -8400487765614892086L);
        setField(term356, term356.getClass(), "queue", term357);
        setField(term356, term356.getClass(), "next", null);
        setField(term356, term356.getClass(), "discovered", null);
        setField(term334, term334.getClass(), "shadowChildrenRef", term356);
        setField(term334, term334.getClass(), "childNodes", term360);
        setIntField(term364, term364.getClass(), "size", -2038273078);
        setField(term364, term364.getClass(), "keys", term366);
        setField(term364, term364.getClass(), "vals", term367);
        setField(term334, term334.getClass(), "attributes", term364);
        setField(term334, term334.getClass(), "baseUri", "MxlszYVzRf");
        setField(term334, term334.getClass(), "parentNode", null);
        setIntField(term334, term334.getClass(), "siblingIndex", 1227103734);
        ArrayList term56735 = new ArrayList();
        ((ArrayList) term56735).add((Object)null);
        ((ArrayList) term56735).add((Object)null);
        ((ArrayList) term56735).add((Object)null);
        ((ArrayList) term56735).add((Object)null);
        term56728 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56729 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56732 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56733 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56734 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56737 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56738 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56739 = (Object[]) newArray("java.lang.String", 0);
        setField(term56729, term56729.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term56729, term56729.getClass(), "isBlock", false);
        setBooleanField(term56729, term56729.getClass(), "formatAsBlock", true);
        setBooleanField(term56729, term56729.getClass(), "canContainInline", true);
        setBooleanField(term56729, term56729.getClass(), "empty", false);
        setBooleanField(term56729, term56729.getClass(), "selfClosing", true);
        setBooleanField(term56729, term56729.getClass(), "preserveWhitespace", true);
        setBooleanField(term56729, term56729.getClass(), "formList", true);
        setBooleanField(term56729, term56729.getClass(), "formSubmit", false);
        setField(term56728, term56728.getClass(), "tag", term56729);
        setField(term56732, term56732.getClass(), "referent", null);
        setField(term56733, term56733.getClass(), "lock", term56734);
        setField(term56733, term56733.getClass(), "head", null);
        setLongField(term56733, term56733.getClass(), "queueLength", -8400487765614892086L);
        setField(term56732, term56732.getClass(), "queue", term56733);
        setField(term56732, term56732.getClass(), "next", null);
        setField(term56732, term56732.getClass(), "discovered", null);
        setField(term56728, term56728.getClass(), "shadowChildrenRef", term56732);
        setField(term56728, term56728.getClass(), "childNodes", term56735);
        setIntField(term56737, term56737.getClass(), "size", -2038273078);
        setField(term56737, term56737.getClass(), "keys", term56738);
        setField(term56737, term56737.getClass(), "vals", term56739);
        setField(term56728, term56728.getClass(), "attributes", term56737);
        setField(term56728, term56728.getClass(), "baseUri", "MxlszYVzRf");
        setField(term56728, term56728.getClass(), "parentNode", null);
        setIntField(term56728, term56728.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "baseUri", argTypes, term334, args);
        assertTrue(recursiveEquals(term334, term56728));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


