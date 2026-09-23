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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_append_990907754148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2822;

    public Element_append_990907754148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2848 = new ArrayList();
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        ((ArrayList) term2848).add((Object)null);
        term2822 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2844 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2845 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2846 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2852 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2854 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2855 = (Object[]) newArray("java.lang.String", 0);
        setField(term2823, term2823.getClass(), "tagName", "JqXGgAhZPl");
        setBooleanField(term2823, term2823.getClass(), "isBlock", true);
        setBooleanField(term2823, term2823.getClass(), "formatAsBlock", false);
        setBooleanField(term2823, term2823.getClass(), "canContainInline", true);
        setBooleanField(term2823, term2823.getClass(), "empty", true);
        setBooleanField(term2823, term2823.getClass(), "selfClosing", false);
        setBooleanField(term2823, term2823.getClass(), "preserveWhitespace", true);
        setBooleanField(term2823, term2823.getClass(), "formList", false);
        setBooleanField(term2823, term2823.getClass(), "formSubmit", true);
        setField(term2822, term2822.getClass(), "tag", term2823);
        setField(term2844, term2844.getClass(), "referent", null);
        setField(term2845, term2845.getClass(), "lock", term2846);
        setField(term2845, term2845.getClass(), "head", null);
        setLongField(term2845, term2845.getClass(), "queueLength", -8708192233349544946L);
        setField(term2844, term2844.getClass(), "queue", term2845);
        setField(term2844, term2844.getClass(), "next", null);
        setField(term2844, term2844.getClass(), "discovered", null);
        setField(term2822, term2822.getClass(), "shadowChildrenRef", term2844);
        setField(term2822, term2822.getClass(), "childNodes", term2848);
        setIntField(term2852, term2852.getClass(), "size", 972867650);
        setField(term2852, term2852.getClass(), "keys", term2854);
        setField(term2852, term2852.getClass(), "vals", term2855);
        setField(term2822, term2822.getClass(), "attributes", term2852);
        setField(term2822, term2822.getClass(), "baseUri", "jiKYgYHqIS");
        setField(term2822, term2822.getClass(), "parentNode", null);
        setIntField(term2822, term2822.getClass(), "siblingIndex", 1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        try {
            callMethod(klass, "append", argTypes, term2822, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


