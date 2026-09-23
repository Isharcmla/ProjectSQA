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
import java.util.LinkedHashMap;

public class Element_addClass_59775528383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6775;

    public Element_addClass_59775528383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6797 = new ArrayList();
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        ((ArrayList) term6797).add((Object)null);
        LinkedHashMap term6802 = new LinkedHashMap();
        term6775 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6776 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6801 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6776, term6776.getClass(), "tagName", "NxgmYPzWCI");
        setBooleanField(term6776, term6776.getClass(), "isBlock", true);
        setBooleanField(term6776, term6776.getClass(), "formatAsBlock", true);
        setBooleanField(term6776, term6776.getClass(), "canContainInline", false);
        setBooleanField(term6776, term6776.getClass(), "empty", false);
        setBooleanField(term6776, term6776.getClass(), "selfClosing", true);
        setBooleanField(term6776, term6776.getClass(), "preserveWhitespace", false);
        setBooleanField(term6776, term6776.getClass(), "formList", true);
        setBooleanField(term6776, term6776.getClass(), "formSubmit", false);
        setField(term6775, term6775.getClass(), "tag", term6776);
        setField(term6775, term6775.getClass(), "parentNode", null);
        setField(term6775, term6775.getClass(), "childNodes", term6797);
        setField(term6801, term6801.getClass(), "attributes", term6802);
        setField(term6775, term6775.getClass(), "attributes", term6801);
        setField(term6775, term6775.getClass(), "baseUri", "FlHzxEfFzI");
        setIntField(term6775, term6775.getClass(), "siblingIndex", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aSATgQUpoe";
        callMethod(klass, "addClass", argTypes, term6775, args);
    }

};


