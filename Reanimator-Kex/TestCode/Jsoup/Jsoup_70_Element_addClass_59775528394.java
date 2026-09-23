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

public class Element_addClass_59775528394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7201;

    public Element_addClass_59775528394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7227 = new ArrayList();
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        term7201 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7202 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7223 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7224 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7225 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7231 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7233 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7234 = (Object[]) newArray("java.lang.String", 0);
        setField(term7202, term7202.getClass(), "tagName", "EwQBhZjCIT");
        setBooleanField(term7202, term7202.getClass(), "isBlock", true);
        setBooleanField(term7202, term7202.getClass(), "formatAsBlock", false);
        setBooleanField(term7202, term7202.getClass(), "canContainInline", false);
        setBooleanField(term7202, term7202.getClass(), "empty", false);
        setBooleanField(term7202, term7202.getClass(), "selfClosing", false);
        setBooleanField(term7202, term7202.getClass(), "preserveWhitespace", false);
        setBooleanField(term7202, term7202.getClass(), "formList", true);
        setBooleanField(term7202, term7202.getClass(), "formSubmit", true);
        setField(term7201, term7201.getClass(), "tag", term7202);
        setField(term7223, term7223.getClass(), "referent", null);
        setField(term7224, term7224.getClass(), "lock", term7225);
        setField(term7224, term7224.getClass(), "head", null);
        setLongField(term7224, term7224.getClass(), "queueLength", 2848819812340321742L);
        setField(term7223, term7223.getClass(), "queue", term7224);
        setField(term7223, term7223.getClass(), "next", null);
        setField(term7223, term7223.getClass(), "discovered", null);
        setField(term7201, term7201.getClass(), "shadowChildrenRef", term7223);
        setField(term7201, term7201.getClass(), "childNodes", term7227);
        setIntField(term7231, term7231.getClass(), "size", 252575029);
        setField(term7231, term7231.getClass(), "keys", term7233);
        setField(term7231, term7231.getClass(), "vals", term7234);
        setField(term7201, term7201.getClass(), "attributes", term7231);
        setField(term7201, term7201.getClass(), "baseUri", "aSkmSwTnEw");
        setField(term7201, term7201.getClass(), "parentNode", null);
        setIntField(term7201, term7201.getClass(), "siblingIndex", 57189932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        callMethod(klass, "addClass", argTypes, term7201, args);
    }

};


