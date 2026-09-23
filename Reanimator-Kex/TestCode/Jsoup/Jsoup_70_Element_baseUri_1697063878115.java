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

public class Element_baseUri_1697063878115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term56539;

    public Element_baseUri_1697063878115() {
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
        ArrayList term56546 = new ArrayList();
        ((ArrayList) term56546).add((Object)null);
        ((ArrayList) term56546).add((Object)null);
        ((ArrayList) term56546).add((Object)null);
        ((ArrayList) term56546).add((Object)null);
        term56539 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56540 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56543 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56544 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56545 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56548 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56549 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56550 = (Object[]) newArray("java.lang.String", 0);
        setField(term56540, term56540.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term56540, term56540.getClass(), "isBlock", false);
        setBooleanField(term56540, term56540.getClass(), "formatAsBlock", true);
        setBooleanField(term56540, term56540.getClass(), "canContainInline", true);
        setBooleanField(term56540, term56540.getClass(), "empty", false);
        setBooleanField(term56540, term56540.getClass(), "selfClosing", true);
        setBooleanField(term56540, term56540.getClass(), "preserveWhitespace", true);
        setBooleanField(term56540, term56540.getClass(), "formList", true);
        setBooleanField(term56540, term56540.getClass(), "formSubmit", false);
        setField(term56539, term56539.getClass(), "tag", term56540);
        setField(term56543, term56543.getClass(), "referent", null);
        setField(term56544, term56544.getClass(), "lock", term56545);
        setField(term56544, term56544.getClass(), "head", null);
        setLongField(term56544, term56544.getClass(), "queueLength", -8400487765614892086L);
        setField(term56543, term56543.getClass(), "queue", term56544);
        setField(term56543, term56543.getClass(), "next", null);
        setField(term56543, term56543.getClass(), "discovered", null);
        setField(term56539, term56539.getClass(), "shadowChildrenRef", term56543);
        setField(term56539, term56539.getClass(), "childNodes", term56546);
        setIntField(term56548, term56548.getClass(), "size", -2038273078);
        setField(term56548, term56548.getClass(), "keys", term56549);
        setField(term56548, term56548.getClass(), "vals", term56550);
        setField(term56539, term56539.getClass(), "attributes", term56548);
        setField(term56539, term56539.getClass(), "baseUri", "MxlszYVzRf");
        setField(term56539, term56539.getClass(), "parentNode", null);
        setIntField(term56539, term56539.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "baseUri", argTypes, term334, args);
        assertTrue(recursiveEquals(term334, term56539));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


