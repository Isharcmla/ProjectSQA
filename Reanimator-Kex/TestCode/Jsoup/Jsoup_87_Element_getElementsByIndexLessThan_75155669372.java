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

public class Element_getElementsByIndexLessThan_75155669372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5559;
     Object term5606;

    public Element_getElementsByIndexLessThan_75155669372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5585 = new ArrayList();
        ((ArrayList) term5585).add((Object)null);
        ((ArrayList) term5585).add((Object)null);
        ((ArrayList) term5585).add((Object)null);
        ((ArrayList) term5585).add((Object)null);
        term5559 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5560 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5581 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5582 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5583 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5589 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5591 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5592 = (Object[]) newArray("java.lang.String", 0);
        setField(term5560, term5560.getClass(), "tagName", "VGizxZnyHX");
        setBooleanField(term5560, term5560.getClass(), "isBlock", true);
        setBooleanField(term5560, term5560.getClass(), "formatAsBlock", false);
        setBooleanField(term5560, term5560.getClass(), "canContainInline", true);
        setBooleanField(term5560, term5560.getClass(), "empty", false);
        setBooleanField(term5560, term5560.getClass(), "selfClosing", true);
        setBooleanField(term5560, term5560.getClass(), "preserveWhitespace", false);
        setBooleanField(term5560, term5560.getClass(), "formList", false);
        setBooleanField(term5560, term5560.getClass(), "formSubmit", true);
        setField(term5559, term5559.getClass(), "tag", term5560);
        setField(term5581, term5581.getClass(), "referent", null);
        setField(term5582, term5582.getClass(), "lock", term5583);
        setField(term5582, term5582.getClass(), "head", null);
        setLongField(term5582, term5582.getClass(), "queueLength", -8654565919063661957L);
        setField(term5581, term5581.getClass(), "queue", term5582);
        setField(term5581, term5581.getClass(), "next", null);
        setField(term5581, term5581.getClass(), "discovered", null);
        setField(term5559, term5559.getClass(), "shadowChildrenRef", term5581);
        setField(term5559, term5559.getClass(), "childNodes", term5585);
        setIntField(term5589, term5589.getClass(), "size", -507387516);
        setField(term5589, term5589.getClass(), "keys", term5591);
        setField(term5589, term5589.getClass(), "vals", term5592);
        setField(term5559, term5559.getClass(), "attributes", term5589);
        setField(term5559, term5559.getClass(), "baseUri", "kVEZMHmRtR");
        setField(term5559, term5559.getClass(), "parentNode", null);
        setIntField(term5559, term5559.getClass(), "siblingIndex", -1970452551);
        term5606 = new Integer(-1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5606;
        callMethod(klass, "getElementsByIndexLessThan", argTypes, term5559, args);
    }

};


