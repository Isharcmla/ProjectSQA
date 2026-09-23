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

public class Element_getAllElements_545850983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6523;

    public Element_getAllElements_545850983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6549 = new ArrayList();
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        ((ArrayList) term6549).add((Object)null);
        term6523 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6545 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6546 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6547 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6555 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6556 = (Object[]) newArray("java.lang.String", 0);
        setField(term6524, term6524.getClass(), "tagName", "FwPbDZcHmB");
        setBooleanField(term6524, term6524.getClass(), "isBlock", false);
        setBooleanField(term6524, term6524.getClass(), "formatAsBlock", false);
        setBooleanField(term6524, term6524.getClass(), "canContainInline", false);
        setBooleanField(term6524, term6524.getClass(), "empty", false);
        setBooleanField(term6524, term6524.getClass(), "selfClosing", false);
        setBooleanField(term6524, term6524.getClass(), "preserveWhitespace", true);
        setBooleanField(term6524, term6524.getClass(), "formList", true);
        setBooleanField(term6524, term6524.getClass(), "formSubmit", false);
        setField(term6523, term6523.getClass(), "tag", term6524);
        setField(term6545, term6545.getClass(), "referent", null);
        setField(term6546, term6546.getClass(), "lock", term6547);
        setField(term6546, term6546.getClass(), "head", null);
        setLongField(term6546, term6546.getClass(), "queueLength", 7862575738391801707L);
        setField(term6545, term6545.getClass(), "queue", term6546);
        setField(term6545, term6545.getClass(), "next", null);
        setField(term6545, term6545.getClass(), "discovered", null);
        setField(term6523, term6523.getClass(), "shadowChildrenRef", term6545);
        setField(term6523, term6523.getClass(), "childNodes", term6549);
        setIntField(term6553, term6553.getClass(), "size", -376422566);
        setField(term6553, term6553.getClass(), "keys", term6555);
        setField(term6553, term6553.getClass(), "vals", term6556);
        setField(term6523, term6523.getClass(), "attributes", term6553);
        setField(term6523, term6523.getClass(), "baseUri", "hOncybyCAH");
        setField(term6523, term6523.getClass(), "parentNode", null);
        setIntField(term6523, term6523.getClass(), "siblingIndex", 306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term6523, args);
    }

};


