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

public class Element_toString_1903592843105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55436;

    public Element_toString_1903592843105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55462 = new ArrayList();
        ((ArrayList) term55462).add((Object)null);
        ((ArrayList) term55462).add((Object)null);
        ((ArrayList) term55462).add((Object)null);
        ((ArrayList) term55462).add((Object)null);
        term55436 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55437 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55458 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55459 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55460 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55466 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55468 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55469 = (Object[]) newArray("java.lang.String", 0);
        setField(term55437, term55437.getClass(), "tagName", "lCyLIcSuom");
        setBooleanField(term55437, term55437.getClass(), "isBlock", false);
        setBooleanField(term55437, term55437.getClass(), "formatAsBlock", true);
        setBooleanField(term55437, term55437.getClass(), "canContainInline", false);
        setBooleanField(term55437, term55437.getClass(), "empty", false);
        setBooleanField(term55437, term55437.getClass(), "selfClosing", true);
        setBooleanField(term55437, term55437.getClass(), "preserveWhitespace", false);
        setBooleanField(term55437, term55437.getClass(), "formList", true);
        setBooleanField(term55437, term55437.getClass(), "formSubmit", true);
        setField(term55436, term55436.getClass(), "tag", term55437);
        setField(term55458, term55458.getClass(), "referent", null);
        setField(term55459, term55459.getClass(), "lock", term55460);
        setField(term55459, term55459.getClass(), "head", null);
        setLongField(term55459, term55459.getClass(), "queueLength", 1672578078364590450L);
        setField(term55458, term55458.getClass(), "queue", term55459);
        setField(term55458, term55458.getClass(), "next", null);
        setField(term55458, term55458.getClass(), "discovered", null);
        setField(term55436, term55436.getClass(), "shadowChildrenRef", term55458);
        setField(term55436, term55436.getClass(), "childNodes", term55462);
        setIntField(term55466, term55466.getClass(), "size", -1195339592);
        setField(term55466, term55466.getClass(), "keys", term55468);
        setField(term55466, term55466.getClass(), "vals", term55469);
        setField(term55436, term55436.getClass(), "attributes", term55466);
        setField(term55436, term55436.getClass(), "baseUri", "CGOpQSZZwI");
        setField(term55436, term55436.getClass(), "parentNode", null);
        setIntField(term55436, term55436.getClass(), "siblingIndex", -376422566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term55436, args);
    }

};


