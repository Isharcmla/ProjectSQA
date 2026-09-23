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

public class Element_doClone_438653594110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55826;

    public Element_doClone_438653594110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55852 = new ArrayList();
        ((ArrayList) term55852).add((Object)null);
        term55826 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55827 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55848 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55849 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55850 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55856 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55858 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55859 = (Object[]) newArray("java.lang.String", 0);
        setField(term55827, term55827.getClass(), "tagName", "SOrEHbcbmn");
        setBooleanField(term55827, term55827.getClass(), "isBlock", false);
        setBooleanField(term55827, term55827.getClass(), "formatAsBlock", false);
        setBooleanField(term55827, term55827.getClass(), "canContainInline", false);
        setBooleanField(term55827, term55827.getClass(), "empty", false);
        setBooleanField(term55827, term55827.getClass(), "selfClosing", false);
        setBooleanField(term55827, term55827.getClass(), "preserveWhitespace", true);
        setBooleanField(term55827, term55827.getClass(), "formList", true);
        setBooleanField(term55827, term55827.getClass(), "formSubmit", false);
        setField(term55826, term55826.getClass(), "tag", term55827);
        setField(term55848, term55848.getClass(), "referent", null);
        setField(term55849, term55849.getClass(), "lock", term55850);
        setField(term55849, term55849.getClass(), "head", null);
        setLongField(term55849, term55849.getClass(), "queueLength", -9040825890007374809L);
        setField(term55848, term55848.getClass(), "queue", term55849);
        setField(term55848, term55848.getClass(), "next", null);
        setField(term55848, term55848.getClass(), "discovered", null);
        setField(term55826, term55826.getClass(), "shadowChildrenRef", term55848);
        setField(term55826, term55826.getClass(), "childNodes", term55852);
        setIntField(term55856, term55856.getClass(), "size", -1891015523);
        setField(term55856, term55856.getClass(), "keys", term55858);
        setField(term55856, term55856.getClass(), "vals", term55859);
        setField(term55826, term55826.getClass(), "attributes", term55856);
        setField(term55826, term55826.getClass(), "baseUri", "bnsyeQXFdu");
        setField(term55826, term55826.getClass(), "parentNode", null);
        setIntField(term55826, term55826.getClass(), "siblingIndex", -1560631747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doClone", argTypes, term55826, args);
    }

};


