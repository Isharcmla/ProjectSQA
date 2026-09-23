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

public class Element_getElementsMatchingText_140832982579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6127;

    public Element_getElementsMatchingText_140832982579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6153 = new ArrayList();
        term6127 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6128 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6149 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6150 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6151 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6157 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6159 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6160 = (Object[]) newArray("java.lang.String", 0);
        setField(term6128, term6128.getClass(), "tagName", "XJJNClzHRf");
        setBooleanField(term6128, term6128.getClass(), "isBlock", true);
        setBooleanField(term6128, term6128.getClass(), "formatAsBlock", false);
        setBooleanField(term6128, term6128.getClass(), "canContainInline", false);
        setBooleanField(term6128, term6128.getClass(), "empty", false);
        setBooleanField(term6128, term6128.getClass(), "selfClosing", true);
        setBooleanField(term6128, term6128.getClass(), "preserveWhitespace", false);
        setBooleanField(term6128, term6128.getClass(), "formList", false);
        setBooleanField(term6128, term6128.getClass(), "formSubmit", false);
        setField(term6127, term6127.getClass(), "tag", term6128);
        setField(term6149, term6149.getClass(), "referent", null);
        setField(term6150, term6150.getClass(), "lock", term6151);
        setField(term6150, term6150.getClass(), "head", null);
        setLongField(term6150, term6150.getClass(), "queueLength", -7291743527973326814L);
        setField(term6149, term6149.getClass(), "queue", term6150);
        setField(term6149, term6149.getClass(), "next", null);
        setField(term6149, term6149.getClass(), "discovered", null);
        setField(term6127, term6127.getClass(), "shadowChildrenRef", term6149);
        setField(term6127, term6127.getClass(), "childNodes", term6153);
        setIntField(term6157, term6157.getClass(), "size", -75206835);
        setField(term6157, term6157.getClass(), "keys", term6159);
        setField(term6157, term6157.getClass(), "vals", term6160);
        setField(term6127, term6127.getClass(), "attributes", term6157);
        setField(term6127, term6127.getClass(), "baseUri", "HDaezxQfQR");
        setField(term6127, term6127.getClass(), "parentNode", null);
        setIntField(term6127, term6127.getClass(), "siblingIndex", -1618206977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iikZEapDlu";
        callMethod(klass, "getElementsMatchingText", argTypes, term6127, args);
    }

};


