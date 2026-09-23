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

public class Element_ownText_35132743882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6369;

    public Element_ownText_35132743882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6395 = new ArrayList();
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        ((ArrayList) term6395).add((Object)null);
        term6369 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6370 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6391 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6392 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6393 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6399 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6401 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6402 = (Object[]) newArray("java.lang.String", 0);
        setField(term6370, term6370.getClass(), "tagName", "AZdLeSugwv");
        setBooleanField(term6370, term6370.getClass(), "isBlock", false);
        setBooleanField(term6370, term6370.getClass(), "formatAsBlock", false);
        setBooleanField(term6370, term6370.getClass(), "canContainInline", false);
        setBooleanField(term6370, term6370.getClass(), "empty", true);
        setBooleanField(term6370, term6370.getClass(), "selfClosing", false);
        setBooleanField(term6370, term6370.getClass(), "preserveWhitespace", true);
        setBooleanField(term6370, term6370.getClass(), "formList", true);
        setBooleanField(term6370, term6370.getClass(), "formSubmit", true);
        setField(term6369, term6369.getClass(), "tag", term6370);
        setField(term6391, term6391.getClass(), "referent", null);
        setField(term6392, term6392.getClass(), "lock", term6393);
        setField(term6392, term6392.getClass(), "head", null);
        setLongField(term6392, term6392.getClass(), "queueLength", 9013624480170062917L);
        setField(term6391, term6391.getClass(), "queue", term6392);
        setField(term6391, term6391.getClass(), "next", null);
        setField(term6391, term6391.getClass(), "discovered", null);
        setField(term6369, term6369.getClass(), "shadowChildrenRef", term6391);
        setField(term6369, term6369.getClass(), "childNodes", term6395);
        setIntField(term6399, term6399.getClass(), "size", -159494544);
        setField(term6399, term6399.getClass(), "keys", term6401);
        setField(term6399, term6399.getClass(), "vals", term6402);
        setField(term6369, term6369.getClass(), "attributes", term6399);
        setField(term6369, term6369.getClass(), "baseUri", "RMsXuyzKJV");
        setField(term6369, term6369.getClass(), "parentNode", null);
        setIntField(term6369, term6369.getClass(), "siblingIndex", -75206835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term6369, args);
    }

};


