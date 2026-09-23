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

public class Element_prependText_115106331939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733;

    public Element_prependText_115106331939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2759 = new ArrayList();
        term2733 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2734 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2755 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2756 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2757 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2763 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2765 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2766 = (Object[]) newArray("java.lang.String", 0);
        setField(term2734, term2734.getClass(), "tagName", "swZVeJAxjt");
        setBooleanField(term2734, term2734.getClass(), "isBlock", true);
        setBooleanField(term2734, term2734.getClass(), "formatAsBlock", true);
        setBooleanField(term2734, term2734.getClass(), "canContainInline", false);
        setBooleanField(term2734, term2734.getClass(), "empty", false);
        setBooleanField(term2734, term2734.getClass(), "selfClosing", true);
        setBooleanField(term2734, term2734.getClass(), "preserveWhitespace", true);
        setBooleanField(term2734, term2734.getClass(), "formList", false);
        setBooleanField(term2734, term2734.getClass(), "formSubmit", true);
        setField(term2733, term2733.getClass(), "tag", term2734);
        setField(term2755, term2755.getClass(), "referent", null);
        setField(term2756, term2756.getClass(), "lock", term2757);
        setField(term2756, term2756.getClass(), "head", null);
        setLongField(term2756, term2756.getClass(), "queueLength", 1439298019805881866L);
        setField(term2755, term2755.getClass(), "queue", term2756);
        setField(term2755, term2755.getClass(), "next", null);
        setField(term2755, term2755.getClass(), "discovered", null);
        setField(term2733, term2733.getClass(), "shadowChildrenRef", term2755);
        setField(term2733, term2733.getClass(), "childNodes", term2759);
        setIntField(term2763, term2763.getClass(), "size", 1375330971);
        setField(term2763, term2763.getClass(), "keys", term2765);
        setField(term2763, term2763.getClass(), "vals", term2766);
        setField(term2733, term2733.getClass(), "attributes", term2763);
        setField(term2733, term2733.getClass(), "baseUri", "xOcJIiQQDu");
        setField(term2733, term2733.getClass(), "parentNode", null);
        setIntField(term2733, term2733.getClass(), "siblingIndex", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "prependText", argTypes, term2733, args);
    }

};


