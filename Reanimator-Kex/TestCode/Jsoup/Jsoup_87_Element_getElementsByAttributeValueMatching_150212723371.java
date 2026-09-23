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

public class Element_getElementsByAttributeValueMatching_150212723371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5448;

    public Element_getElementsByAttributeValueMatching_150212723371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5474 = new ArrayList();
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        ((ArrayList) term5474).add((Object)null);
        term5448 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5470 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5471 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5472 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5478 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5480 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5481 = (Object[]) newArray("java.lang.String", 0);
        setField(term5449, term5449.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term5449, term5449.getClass(), "isBlock", false);
        setBooleanField(term5449, term5449.getClass(), "formatAsBlock", false);
        setBooleanField(term5449, term5449.getClass(), "canContainInline", false);
        setBooleanField(term5449, term5449.getClass(), "empty", true);
        setBooleanField(term5449, term5449.getClass(), "selfClosing", false);
        setBooleanField(term5449, term5449.getClass(), "preserveWhitespace", true);
        setBooleanField(term5449, term5449.getClass(), "formList", false);
        setBooleanField(term5449, term5449.getClass(), "formSubmit", true);
        setField(term5448, term5448.getClass(), "tag", term5449);
        setField(term5470, term5470.getClass(), "referent", null);
        setField(term5471, term5471.getClass(), "lock", term5472);
        setField(term5471, term5471.getClass(), "head", null);
        setLongField(term5471, term5471.getClass(), "queueLength", 305759998609888272L);
        setField(term5470, term5470.getClass(), "queue", term5471);
        setField(term5470, term5470.getClass(), "next", null);
        setField(term5470, term5470.getClass(), "discovered", null);
        setField(term5448, term5448.getClass(), "shadowChildrenRef", term5470);
        setField(term5448, term5448.getClass(), "childNodes", term5474);
        setIntField(term5478, term5478.getClass(), "size", 991356662);
        setField(term5478, term5478.getClass(), "keys", term5480);
        setField(term5478, term5478.getClass(), "vals", term5481);
        setField(term5448, term5448.getClass(), "attributes", term5478);
        setField(term5448, term5448.getClass(), "baseUri", "jXzmYyrnnT");
        setField(term5448, term5448.getClass(), "parentNode", null);
        setIntField(term5448, term5448.getClass(), "siblingIndex", -506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "igCAtimmYB";
        args[1] = "DyiXbeYIaN";
        callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term5448, args);
    }

};


