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

public class Element_getElementById_40233889260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4299;

    public Element_getElementById_40233889260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4325 = new ArrayList();
        term4299 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4300 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4321 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4322 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4323 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4329 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4331 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4332 = (Object[]) newArray("java.lang.String", 0);
        setField(term4300, term4300.getClass(), "tagName", "ZzIujlwVsw");
        setBooleanField(term4300, term4300.getClass(), "isBlock", true);
        setBooleanField(term4300, term4300.getClass(), "formatAsBlock", false);
        setBooleanField(term4300, term4300.getClass(), "canContainInline", true);
        setBooleanField(term4300, term4300.getClass(), "empty", true);
        setBooleanField(term4300, term4300.getClass(), "selfClosing", false);
        setBooleanField(term4300, term4300.getClass(), "preserveWhitespace", true);
        setBooleanField(term4300, term4300.getClass(), "formList", false);
        setBooleanField(term4300, term4300.getClass(), "formSubmit", false);
        setField(term4299, term4299.getClass(), "tag", term4300);
        setField(term4321, term4321.getClass(), "referent", null);
        setField(term4322, term4322.getClass(), "lock", term4323);
        setField(term4322, term4322.getClass(), "head", null);
        setLongField(term4322, term4322.getClass(), "queueLength", -3838084482494604218L);
        setField(term4321, term4321.getClass(), "queue", term4322);
        setField(term4321, term4321.getClass(), "next", null);
        setField(term4321, term4321.getClass(), "discovered", null);
        setField(term4299, term4299.getClass(), "shadowChildrenRef", term4321);
        setField(term4299, term4299.getClass(), "childNodes", term4325);
        setIntField(term4329, term4329.getClass(), "size", 1386130016);
        setField(term4329, term4329.getClass(), "keys", term4331);
        setField(term4329, term4329.getClass(), "vals", term4332);
        setField(term4299, term4299.getClass(), "attributes", term4329);
        setField(term4299, term4299.getClass(), "baseUri", "LWyEaeIyAo");
        setField(term4299, term4299.getClass(), "parentNode", null);
        setIntField(term4299, term4299.getClass(), "siblingIndex", 1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "getElementById", argTypes, term4299, args);
    }

};


