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

public class Element_prepend_112302132241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;

    public Element_prepend_112302132241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2937 = new ArrayList();
        ((ArrayList) term2937).add((Object)null);
        ((ArrayList) term2937).add((Object)null);
        ((ArrayList) term2937).add((Object)null);
        ((ArrayList) term2937).add((Object)null);
        term2911 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2933 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2934 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2935 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2941 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2943 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2944 = (Object[]) newArray("java.lang.String", 0);
        setField(term2912, term2912.getClass(), "tagName", "XqgfKFvPSD");
        setBooleanField(term2912, term2912.getClass(), "isBlock", true);
        setBooleanField(term2912, term2912.getClass(), "formatAsBlock", true);
        setBooleanField(term2912, term2912.getClass(), "canContainInline", false);
        setBooleanField(term2912, term2912.getClass(), "empty", true);
        setBooleanField(term2912, term2912.getClass(), "selfClosing", false);
        setBooleanField(term2912, term2912.getClass(), "preserveWhitespace", false);
        setBooleanField(term2912, term2912.getClass(), "formList", false);
        setBooleanField(term2912, term2912.getClass(), "formSubmit", true);
        setField(term2911, term2911.getClass(), "tag", term2912);
        setField(term2933, term2933.getClass(), "referent", null);
        setField(term2934, term2934.getClass(), "lock", term2935);
        setField(term2934, term2934.getClass(), "head", null);
        setLongField(term2934, term2934.getClass(), "queueLength", 5907001541142728739L);
        setField(term2933, term2933.getClass(), "queue", term2934);
        setField(term2933, term2933.getClass(), "next", null);
        setField(term2933, term2933.getClass(), "discovered", null);
        setField(term2911, term2911.getClass(), "shadowChildrenRef", term2933);
        setField(term2911, term2911.getClass(), "childNodes", term2937);
        setIntField(term2941, term2941.getClass(), "size", -481533957);
        setField(term2941, term2941.getClass(), "keys", term2943);
        setField(term2941, term2941.getClass(), "vals", term2944);
        setField(term2911, term2911.getClass(), "attributes", term2941);
        setField(term2911, term2911.getClass(), "baseUri", "JiVRgTZvKc");
        setField(term2911, term2911.getClass(), "parentNode", null);
        setIntField(term2911, term2911.getClass(), "siblingIndex", 1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "prepend", argTypes, term2911, args);
    }

};


