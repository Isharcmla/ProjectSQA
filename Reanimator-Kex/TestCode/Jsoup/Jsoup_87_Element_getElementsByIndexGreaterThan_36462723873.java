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
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_36462723873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5628;
     Object term5675;

    public Element_getElementsByIndexGreaterThan_36462723873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5654 = new ArrayList();
        ((ArrayList) term5654).add((Object)null);
        ((ArrayList) term5654).add((Object)null);
        ((ArrayList) term5654).add((Object)null);
        term5628 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5629 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5650 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5651 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5652 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5658 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5660 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5661 = (Object[]) newArray("java.lang.String", 0);
        setField(term5629, term5629.getClass(), "tagName", "ekxGuOYIwi");
        setBooleanField(term5629, term5629.getClass(), "isBlock", false);
        setBooleanField(term5629, term5629.getClass(), "formatAsBlock", false);
        setBooleanField(term5629, term5629.getClass(), "canContainInline", false);
        setBooleanField(term5629, term5629.getClass(), "empty", false);
        setBooleanField(term5629, term5629.getClass(), "selfClosing", false);
        setBooleanField(term5629, term5629.getClass(), "preserveWhitespace", true);
        setBooleanField(term5629, term5629.getClass(), "formList", false);
        setBooleanField(term5629, term5629.getClass(), "formSubmit", true);
        setField(term5628, term5628.getClass(), "tag", term5629);
        setField(term5650, term5650.getClass(), "referent", null);
        setField(term5651, term5651.getClass(), "lock", term5652);
        setField(term5651, term5651.getClass(), "head", null);
        setLongField(term5651, term5651.getClass(), "queueLength", -5248475803419977214L);
        setField(term5650, term5650.getClass(), "queue", term5651);
        setField(term5650, term5650.getClass(), "next", null);
        setField(term5650, term5650.getClass(), "discovered", null);
        setField(term5628, term5628.getClass(), "shadowChildrenRef", term5650);
        setField(term5628, term5628.getClass(), "childNodes", term5654);
        setIntField(term5658, term5658.getClass(), "size", 729658803);
        setField(term5658, term5658.getClass(), "keys", term5660);
        setField(term5658, term5658.getClass(), "vals", term5661);
        setField(term5628, term5628.getClass(), "attributes", term5658);
        setField(term5628, term5628.getClass(), "baseUri", "RbVQXSpxXy");
        setField(term5628, term5628.getClass(), "parentNode", null);
        setIntField(term5628, term5628.getClass(), "siblingIndex", 114754804);
        term5675 = new Integer(1687361082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5675;
        callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5628, args);
    }

};


