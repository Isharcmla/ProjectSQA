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

public class Element_getElementsByAttribute_59926345662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4477;

    public Element_getElementsByAttribute_59926345662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4503 = new ArrayList();
        ((ArrayList) term4503).add((Object)null);
        ((ArrayList) term4503).add((Object)null);
        ((ArrayList) term4503).add((Object)null);
        ((ArrayList) term4503).add((Object)null);
        term4477 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4478 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4499 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4500 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4501 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4507 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4509 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4510 = (Object[]) newArray("java.lang.String", 0);
        setField(term4478, term4478.getClass(), "tagName", "EeBVbzjcCI");
        setBooleanField(term4478, term4478.getClass(), "isBlock", true);
        setBooleanField(term4478, term4478.getClass(), "formatAsBlock", true);
        setBooleanField(term4478, term4478.getClass(), "canContainInline", true);
        setBooleanField(term4478, term4478.getClass(), "empty", false);
        setBooleanField(term4478, term4478.getClass(), "selfClosing", true);
        setBooleanField(term4478, term4478.getClass(), "preserveWhitespace", true);
        setBooleanField(term4478, term4478.getClass(), "formList", false);
        setBooleanField(term4478, term4478.getClass(), "formSubmit", false);
        setField(term4477, term4477.getClass(), "tag", term4478);
        setField(term4499, term4499.getClass(), "referent", null);
        setField(term4500, term4500.getClass(), "lock", term4501);
        setField(term4500, term4500.getClass(), "head", null);
        setLongField(term4500, term4500.getClass(), "queueLength", 5953383087795962419L);
        setField(term4499, term4499.getClass(), "queue", term4500);
        setField(term4499, term4499.getClass(), "next", null);
        setField(term4499, term4499.getClass(), "discovered", null);
        setField(term4477, term4477.getClass(), "shadowChildrenRef", term4499);
        setField(term4477, term4477.getClass(), "childNodes", term4503);
        setIntField(term4507, term4507.getClass(), "size", 568954359);
        setField(term4507, term4507.getClass(), "keys", term4509);
        setField(term4507, term4507.getClass(), "vals", term4510);
        setField(term4477, term4477.getClass(), "attributes", term4507);
        setField(term4477, term4477.getClass(), "baseUri", "UfQtPRyWRC");
        setField(term4477, term4477.getClass(), "parentNode", null);
        setIntField(term4477, term4477.getClass(), "siblingIndex", 53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        callMethod(klass, "getElementsByAttribute", argTypes, term4477, args);
    }

};


