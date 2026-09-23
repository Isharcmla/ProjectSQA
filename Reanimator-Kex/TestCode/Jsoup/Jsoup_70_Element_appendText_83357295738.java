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

public class Element_appendText_83357295738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644;

    public Element_appendText_83357295738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2670 = new ArrayList();
        ((ArrayList) term2670).add((Object)null);
        term2644 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2645 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2666 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term2667 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2668 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term2674 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2676 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2677 = (Object[]) newArray("java.lang.String", 0);
        setField(term2645, term2645.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term2645, term2645.getClass(), "isBlock", true);
        setBooleanField(term2645, term2645.getClass(), "formatAsBlock", false);
        setBooleanField(term2645, term2645.getClass(), "canContainInline", false);
        setBooleanField(term2645, term2645.getClass(), "empty", true);
        setBooleanField(term2645, term2645.getClass(), "selfClosing", false);
        setBooleanField(term2645, term2645.getClass(), "preserveWhitespace", true);
        setBooleanField(term2645, term2645.getClass(), "formList", true);
        setBooleanField(term2645, term2645.getClass(), "formSubmit", false);
        setField(term2644, term2644.getClass(), "tag", term2645);
        setField(term2666, term2666.getClass(), "referent", null);
        setField(term2667, term2667.getClass(), "lock", term2668);
        setField(term2667, term2667.getClass(), "head", null);
        setLongField(term2667, term2667.getClass(), "queueLength", 6617340557564669657L);
        setField(term2666, term2666.getClass(), "queue", term2667);
        setField(term2666, term2666.getClass(), "next", null);
        setField(term2666, term2666.getClass(), "discovered", null);
        setField(term2644, term2644.getClass(), "shadowChildrenRef", term2666);
        setField(term2644, term2644.getClass(), "childNodes", term2670);
        setIntField(term2674, term2674.getClass(), "size", -2027534003);
        setField(term2674, term2674.getClass(), "keys", term2676);
        setField(term2674, term2674.getClass(), "vals", term2677);
        setField(term2644, term2644.getClass(), "attributes", term2674);
        setField(term2644, term2644.getClass(), "baseUri", "PkWMRdJcBb");
        setField(term2644, term2644.getClass(), "parentNode", null);
        setIntField(term2644, term2644.getClass(), "siblingIndex", 1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jSpAteRute";
        callMethod(klass, "appendText", argTypes, term2644, args);
    }

};


