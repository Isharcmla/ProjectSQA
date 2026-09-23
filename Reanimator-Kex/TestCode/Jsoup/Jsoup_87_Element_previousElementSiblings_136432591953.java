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

public class Element_previousElementSiblings_136432591953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3803;

    public Element_previousElementSiblings_136432591953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3829 = new ArrayList();
        ((ArrayList) term3829).add((Object)null);
        ((ArrayList) term3829).add((Object)null);
        term3803 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3804 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3825 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3826 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3827 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3833 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3835 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3836 = (Object[]) newArray("java.lang.String", 0);
        setField(term3804, term3804.getClass(), "tagName", "AdxvLJhNLe");
        setBooleanField(term3804, term3804.getClass(), "isBlock", false);
        setBooleanField(term3804, term3804.getClass(), "formatAsBlock", true);
        setBooleanField(term3804, term3804.getClass(), "canContainInline", true);
        setBooleanField(term3804, term3804.getClass(), "empty", false);
        setBooleanField(term3804, term3804.getClass(), "selfClosing", false);
        setBooleanField(term3804, term3804.getClass(), "preserveWhitespace", true);
        setBooleanField(term3804, term3804.getClass(), "formList", true);
        setBooleanField(term3804, term3804.getClass(), "formSubmit", true);
        setField(term3803, term3803.getClass(), "tag", term3804);
        setField(term3825, term3825.getClass(), "referent", null);
        setField(term3826, term3826.getClass(), "lock", term3827);
        setField(term3826, term3826.getClass(), "head", null);
        setLongField(term3826, term3826.getClass(), "queueLength", 2936323121573284007L);
        setField(term3825, term3825.getClass(), "queue", term3826);
        setField(term3825, term3825.getClass(), "next", null);
        setField(term3825, term3825.getClass(), "discovered", null);
        setField(term3803, term3803.getClass(), "shadowChildrenRef", term3825);
        setField(term3803, term3803.getClass(), "childNodes", term3829);
        setIntField(term3833, term3833.getClass(), "size", -663691365);
        setField(term3833, term3833.getClass(), "keys", term3835);
        setField(term3833, term3833.getClass(), "vals", term3836);
        setField(term3803, term3803.getClass(), "attributes", term3833);
        setField(term3803, term3803.getClass(), "baseUri", "lHfTrWKMPk");
        setField(term3803, term3803.getClass(), "parentNode", null);
        setIntField(term3803, term3803.getClass(), "siblingIndex", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "previousElementSiblings", argTypes, term3803, args);
    }

};


