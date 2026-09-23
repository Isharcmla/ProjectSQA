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

public class Element_hasText_195450272177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6320;

    public Element_hasText_195450272177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6342 = new ArrayList();
        ((ArrayList) term6342).add((Object)null);
        ((ArrayList) term6342).add((Object)null);
        ((ArrayList) term6342).add((Object)null);
        ((ArrayList) term6342).add((Object)null);
        ((ArrayList) term6342).add((Object)null);
        LinkedHashMap term6347 = new LinkedHashMap();
        term6320 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6346 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6321, term6321.getClass(), "tagName", "vSeruUyNWX");
        setBooleanField(term6321, term6321.getClass(), "isBlock", true);
        setBooleanField(term6321, term6321.getClass(), "formatAsBlock", false);
        setBooleanField(term6321, term6321.getClass(), "canContainInline", true);
        setBooleanField(term6321, term6321.getClass(), "empty", true);
        setBooleanField(term6321, term6321.getClass(), "selfClosing", false);
        setBooleanField(term6321, term6321.getClass(), "preserveWhitespace", true);
        setBooleanField(term6321, term6321.getClass(), "formList", false);
        setBooleanField(term6321, term6321.getClass(), "formSubmit", true);
        setField(term6320, term6320.getClass(), "tag", term6321);
        setField(term6320, term6320.getClass(), "parentNode", null);
        setField(term6320, term6320.getClass(), "childNodes", term6342);
        setField(term6346, term6346.getClass(), "attributes", term6347);
        setField(term6320, term6320.getClass(), "attributes", term6346);
        setField(term6320, term6320.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term6320, term6320.getClass(), "siblingIndex", -2014576105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term6320, args);
    }

};


