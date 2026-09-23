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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeStarting_705110720168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4363;

    public Element_getElementsByAttributeStarting_705110720168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4389 = new ArrayList();
        term4363 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4364 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4385 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4386 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4387 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4393 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4395 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4396 = (Object[]) newArray("java.lang.String", 0);
        setField(term4364, term4364.getClass(), "tagName", "mvrkADEgpp");
        setBooleanField(term4364, term4364.getClass(), "isBlock", true);
        setBooleanField(term4364, term4364.getClass(), "formatAsBlock", false);
        setBooleanField(term4364, term4364.getClass(), "canContainInline", true);
        setBooleanField(term4364, term4364.getClass(), "empty", true);
        setBooleanField(term4364, term4364.getClass(), "selfClosing", false);
        setBooleanField(term4364, term4364.getClass(), "preserveWhitespace", true);
        setBooleanField(term4364, term4364.getClass(), "formList", false);
        setBooleanField(term4364, term4364.getClass(), "formSubmit", false);
        setField(term4363, term4363.getClass(), "tag", term4364);
        setField(term4385, term4385.getClass(), "referent", null);
        setField(term4386, term4386.getClass(), "lock", term4387);
        setField(term4386, term4386.getClass(), "head", null);
        setLongField(term4386, term4386.getClass(), "queueLength", -3838084482494604218L);
        setField(term4385, term4385.getClass(), "queue", term4386);
        setField(term4385, term4385.getClass(), "next", null);
        setField(term4385, term4385.getClass(), "discovered", null);
        setField(term4363, term4363.getClass(), "shadowChildrenRef", term4385);
        setField(term4363, term4363.getClass(), "childNodes", term4389);
        setIntField(term4393, term4393.getClass(), "size", 1386130016);
        setField(term4393, term4393.getClass(), "keys", term4395);
        setField(term4393, term4393.getClass(), "vals", term4396);
        setField(term4363, term4363.getClass(), "attributes", term4393);
        setField(term4363, term4363.getClass(), "baseUri", "pXOkjyeIRb");
        setField(term4363, term4363.getClass(), "parentNode", null);
        setIntField(term4363, term4363.getClass(), "siblingIndex", 1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        try {
            callMethod(klass, "getElementsByAttributeStarting", argTypes, term4363, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


