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

public class Element_classNames_77861729295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7326;

    public Element_classNames_77861729295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7352 = new ArrayList();
        ((ArrayList) term7352).add((Object)null);
        ((ArrayList) term7352).add((Object)null);
        ((ArrayList) term7352).add((Object)null);
        ((ArrayList) term7352).add((Object)null);
        ((ArrayList) term7352).add((Object)null);
        term7326 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7327 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7348 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7349 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7350 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7356 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7358 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7359 = (Object[]) newArray("java.lang.String", 0);
        setField(term7327, term7327.getClass(), "tagName", "aSkmSwTnEw");
        setBooleanField(term7327, term7327.getClass(), "isBlock", false);
        setBooleanField(term7327, term7327.getClass(), "formatAsBlock", false);
        setBooleanField(term7327, term7327.getClass(), "canContainInline", false);
        setBooleanField(term7327, term7327.getClass(), "empty", true);
        setBooleanField(term7327, term7327.getClass(), "selfClosing", true);
        setBooleanField(term7327, term7327.getClass(), "preserveWhitespace", true);
        setBooleanField(term7327, term7327.getClass(), "formList", true);
        setBooleanField(term7327, term7327.getClass(), "formSubmit", false);
        setField(term7326, term7326.getClass(), "tag", term7327);
        setField(term7348, term7348.getClass(), "referent", null);
        setField(term7349, term7349.getClass(), "lock", term7350);
        setField(term7349, term7349.getClass(), "head", null);
        setLongField(term7349, term7349.getClass(), "queueLength", -8876856890348836498L);
        setField(term7348, term7348.getClass(), "queue", term7349);
        setField(term7348, term7348.getClass(), "next", null);
        setField(term7348, term7348.getClass(), "discovered", null);
        setField(term7326, term7326.getClass(), "shadowChildrenRef", term7348);
        setField(term7326, term7326.getClass(), "childNodes", term7352);
        setIntField(term7356, term7356.getClass(), "size", 32185364);
        setField(term7356, term7356.getClass(), "keys", term7358);
        setField(term7356, term7356.getClass(), "vals", term7359);
        setField(term7326, term7326.getClass(), "attributes", term7356);
        setField(term7326, term7326.getClass(), "baseUri", "xvkbvaEGYd");
        setField(term7326, term7326.getClass(), "parentNode", null);
        setIntField(term7326, term7326.getClass(), "siblingIndex", 1768204942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term7326, args);
    }

};


