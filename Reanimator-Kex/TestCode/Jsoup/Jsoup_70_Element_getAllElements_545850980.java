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

public class Element_getAllElements_545850980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6235;

    public Element_getAllElements_545850980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6261 = new ArrayList();
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        term6235 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6236 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6257 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6258 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6259 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6265 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6267 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6268 = (Object[]) newArray("java.lang.String", 0);
        setField(term6236, term6236.getClass(), "tagName", "tXfQjSqDzN");
        setBooleanField(term6236, term6236.getClass(), "isBlock", false);
        setBooleanField(term6236, term6236.getClass(), "formatAsBlock", false);
        setBooleanField(term6236, term6236.getClass(), "canContainInline", true);
        setBooleanField(term6236, term6236.getClass(), "empty", true);
        setBooleanField(term6236, term6236.getClass(), "selfClosing", false);
        setBooleanField(term6236, term6236.getClass(), "preserveWhitespace", true);
        setBooleanField(term6236, term6236.getClass(), "formList", true);
        setBooleanField(term6236, term6236.getClass(), "formSubmit", false);
        setField(term6235, term6235.getClass(), "tag", term6236);
        setField(term6257, term6257.getClass(), "referent", null);
        setField(term6258, term6258.getClass(), "lock", term6259);
        setField(term6258, term6258.getClass(), "head", null);
        setLongField(term6258, term6258.getClass(), "queueLength", -7291743527973326814L);
        setField(term6257, term6257.getClass(), "queue", term6258);
        setField(term6257, term6257.getClass(), "next", null);
        setField(term6257, term6257.getClass(), "discovered", null);
        setField(term6235, term6235.getClass(), "shadowChildrenRef", term6257);
        setField(term6235, term6235.getClass(), "childNodes", term6261);
        setIntField(term6265, term6265.getClass(), "size", 282916351);
        setField(term6265, term6265.getClass(), "keys", term6267);
        setField(term6265, term6265.getClass(), "vals", term6268);
        setField(term6235, term6235.getClass(), "attributes", term6265);
        setField(term6235, term6235.getClass(), "baseUri", "BjugTaMcxJ");
        setField(term6235, term6235.getClass(), "parentNode", null);
        setIntField(term6235, term6235.getClass(), "siblingIndex", 880977281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term6235, args);
    }

};


