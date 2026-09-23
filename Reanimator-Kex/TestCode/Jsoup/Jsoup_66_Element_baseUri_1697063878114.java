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

public class Element_baseUri_1697063878114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term10115;

    public Element_baseUri_1697063878114() {
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
        ArrayList term10122 = new ArrayList();
        ((ArrayList) term10122).add((Object)null);
        ((ArrayList) term10122).add((Object)null);
        ((ArrayList) term10122).add((Object)null);
        ((ArrayList) term10122).add((Object)null);
        term10115 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10116 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10119 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10120 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10121 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10124 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10125 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10126 = (Object[]) newArray("java.lang.String", 0);
        setField(term10116, term10116.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term10116, term10116.getClass(), "isBlock", false);
        setBooleanField(term10116, term10116.getClass(), "formatAsBlock", true);
        setBooleanField(term10116, term10116.getClass(), "canContainInline", true);
        setBooleanField(term10116, term10116.getClass(), "empty", false);
        setBooleanField(term10116, term10116.getClass(), "selfClosing", true);
        setBooleanField(term10116, term10116.getClass(), "preserveWhitespace", true);
        setBooleanField(term10116, term10116.getClass(), "formList", true);
        setBooleanField(term10116, term10116.getClass(), "formSubmit", false);
        setField(term10115, term10115.getClass(), "tag", term10116);
        setField(term10119, term10119.getClass(), "referent", null);
        setField(term10120, term10120.getClass(), "lock", term10121);
        setField(term10120, term10120.getClass(), "head", null);
        setLongField(term10120, term10120.getClass(), "queueLength", -8400487765614892086L);
        setField(term10119, term10119.getClass(), "queue", term10120);
        setField(term10119, term10119.getClass(), "next", null);
        setField(term10119, term10119.getClass(), "discovered", null);
        setField(term10115, term10115.getClass(), "shadowChildrenRef", term10119);
        setField(term10115, term10115.getClass(), "childNodes", term10122);
        setIntField(term10124, term10124.getClass(), "size", -2038273078);
        setField(term10124, term10124.getClass(), "keys", term10125);
        setField(term10124, term10124.getClass(), "vals", term10126);
        setField(term10115, term10115.getClass(), "attributes", term10124);
        setField(term10115, term10115.getClass(), "baseUri", "MxlszYVzRf");
        setField(term10115, term10115.getClass(), "parentNode", null);
        setIntField(term10115, term10115.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "baseUri", argTypes, term334, args);
        assertTrue(recursiveEquals(term334, term10115));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


