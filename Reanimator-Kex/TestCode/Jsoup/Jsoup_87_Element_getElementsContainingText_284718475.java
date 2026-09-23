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

public class Element_getElementsContainingText_284718475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5766;

    public Element_getElementsContainingText_284718475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5792 = new ArrayList();
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        ((ArrayList) term5792).add((Object)null);
        term5766 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5767 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5788 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5789 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5790 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5798 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5799 = (Object[]) newArray("java.lang.String", 0);
        setField(term5767, term5767.getClass(), "tagName", "iljANwuEjk");
        setBooleanField(term5767, term5767.getClass(), "isBlock", false);
        setBooleanField(term5767, term5767.getClass(), "formatAsBlock", false);
        setBooleanField(term5767, term5767.getClass(), "canContainInline", true);
        setBooleanField(term5767, term5767.getClass(), "empty", true);
        setBooleanField(term5767, term5767.getClass(), "selfClosing", true);
        setBooleanField(term5767, term5767.getClass(), "preserveWhitespace", true);
        setBooleanField(term5767, term5767.getClass(), "formList", true);
        setBooleanField(term5767, term5767.getClass(), "formSubmit", true);
        setField(term5766, term5766.getClass(), "tag", term5767);
        setField(term5788, term5788.getClass(), "referent", null);
        setField(term5789, term5789.getClass(), "lock", term5790);
        setField(term5789, term5789.getClass(), "head", null);
        setLongField(term5789, term5789.getClass(), "queueLength", 41775768178052008L);
        setField(term5788, term5788.getClass(), "queue", term5789);
        setField(term5788, term5788.getClass(), "next", null);
        setField(term5788, term5788.getClass(), "discovered", null);
        setField(term5766, term5766.getClass(), "shadowChildrenRef", term5788);
        setField(term5766, term5766.getClass(), "childNodes", term5792);
        setIntField(term5796, term5796.getClass(), "size", -1882480155);
        setField(term5796, term5796.getClass(), "keys", term5798);
        setField(term5796, term5796.getClass(), "vals", term5799);
        setField(term5766, term5766.getClass(), "attributes", term5796);
        setField(term5766, term5766.getClass(), "baseUri", "kNqaJKIATy");
        setField(term5766, term5766.getClass(), "parentNode", null);
        setIntField(term5766, term5766.getClass(), "siblingIndex", -1410220680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKQukfbJUd";
        callMethod(klass, "getElementsContainingText", argTypes, term5766, args);
    }

};


