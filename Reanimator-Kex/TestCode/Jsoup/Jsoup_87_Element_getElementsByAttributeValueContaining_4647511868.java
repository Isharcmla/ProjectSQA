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

public class Element_getElementsByAttributeValueContaining_4647511868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5099;

    public Element_getElementsByAttributeValueContaining_4647511868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5125 = new ArrayList();
        term5099 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5100 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5121 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5122 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5123 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5129 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5131 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5132 = (Object[]) newArray("java.lang.String", 0);
        setField(term5100, term5100.getClass(), "tagName", "XYtryyobou");
        setBooleanField(term5100, term5100.getClass(), "isBlock", false);
        setBooleanField(term5100, term5100.getClass(), "formatAsBlock", false);
        setBooleanField(term5100, term5100.getClass(), "canContainInline", false);
        setBooleanField(term5100, term5100.getClass(), "empty", true);
        setBooleanField(term5100, term5100.getClass(), "selfClosing", false);
        setBooleanField(term5100, term5100.getClass(), "preserveWhitespace", false);
        setBooleanField(term5100, term5100.getClass(), "formList", true);
        setBooleanField(term5100, term5100.getClass(), "formSubmit", false);
        setField(term5099, term5099.getClass(), "tag", term5100);
        setField(term5121, term5121.getClass(), "referent", null);
        setField(term5122, term5122.getClass(), "lock", term5123);
        setField(term5122, term5122.getClass(), "head", null);
        setLongField(term5122, term5122.getClass(), "queueLength", 414749984815662075L);
        setField(term5121, term5121.getClass(), "queue", term5122);
        setField(term5121, term5121.getClass(), "next", null);
        setField(term5121, term5121.getClass(), "discovered", null);
        setField(term5099, term5099.getClass(), "shadowChildrenRef", term5121);
        setField(term5099, term5099.getClass(), "childNodes", term5125);
        setIntField(term5129, term5129.getClass(), "size", 71190297);
        setField(term5129, term5129.getClass(), "keys", term5131);
        setField(term5129, term5129.getClass(), "vals", term5132);
        setField(term5099, term5099.getClass(), "attributes", term5129);
        setField(term5099, term5099.getClass(), "baseUri", "OYbzXylRWW");
        setField(term5099, term5099.getClass(), "parentNode", null);
        setIntField(term5099, term5099.getClass(), "siblingIndex", 1202361360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "DSNsTGYXDF";
        args[1] = "sQvGcVjdEx";
        callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term5099, args);
    }

};


