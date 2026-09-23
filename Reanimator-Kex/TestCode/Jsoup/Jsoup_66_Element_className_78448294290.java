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

public class Element_className_78448294290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6904;

    public Element_className_78448294290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6930 = new ArrayList();
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        ((ArrayList) term6930).add((Object)null);
        term6904 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6905 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6926 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6927 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6928 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6934 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6936 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6937 = (Object[]) newArray("java.lang.String", 0);
        setField(term6905, term6905.getClass(), "tagName", "GZdcJyZntS");
        setBooleanField(term6905, term6905.getClass(), "isBlock", true);
        setBooleanField(term6905, term6905.getClass(), "formatAsBlock", false);
        setBooleanField(term6905, term6905.getClass(), "canContainInline", false);
        setBooleanField(term6905, term6905.getClass(), "empty", true);
        setBooleanField(term6905, term6905.getClass(), "selfClosing", false);
        setBooleanField(term6905, term6905.getClass(), "preserveWhitespace", false);
        setBooleanField(term6905, term6905.getClass(), "formList", true);
        setBooleanField(term6905, term6905.getClass(), "formSubmit", false);
        setField(term6904, term6904.getClass(), "tag", term6905);
        setField(term6926, term6926.getClass(), "referent", null);
        setField(term6927, term6927.getClass(), "lock", term6928);
        setField(term6927, term6927.getClass(), "head", null);
        setLongField(term6927, term6927.getClass(), "queueLength", 5946780097489996391L);
        setField(term6926, term6926.getClass(), "queue", term6927);
        setField(term6926, term6926.getClass(), "next", null);
        setField(term6926, term6926.getClass(), "discovered", null);
        setField(term6904, term6904.getClass(), "shadowChildrenRef", term6926);
        setField(term6904, term6904.getClass(), "childNodes", term6930);
        setIntField(term6934, term6934.getClass(), "size", -1692331299);
        setField(term6934, term6934.getClass(), "keys", term6936);
        setField(term6934, term6934.getClass(), "vals", term6937);
        setField(term6904, term6904.getClass(), "attributes", term6934);
        setField(term6904, term6904.getClass(), "baseUri", "OIHoJeysUi");
        setField(term6904, term6904.getClass(), "parentNode", null);
        setIntField(term6904, term6904.getClass(), "siblingIndex", 479531250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term6904, args);
    }

};


