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

public class Element_clone_114545898092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8286;

    public Element_clone_114545898092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8309 = new ArrayList();
        ((ArrayList) term8309).add((Object)null);
        ((ArrayList) term8309).add((Object)null);
        ((ArrayList) term8309).add((Object)null);
        ((ArrayList) term8309).add((Object)null);
        LinkedHashMap term8314 = new LinkedHashMap();
        term8286 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8287 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8313 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8287, term8287.getClass(), "tagName", "YgQvdcBQKw");
        setBooleanField(term8287, term8287.getClass(), "isBlock", true);
        setBooleanField(term8287, term8287.getClass(), "formatAsBlock", true);
        setBooleanField(term8287, term8287.getClass(), "canContainBlock", true);
        setBooleanField(term8287, term8287.getClass(), "canContainInline", false);
        setBooleanField(term8287, term8287.getClass(), "empty", false);
        setBooleanField(term8287, term8287.getClass(), "selfClosing", false);
        setBooleanField(term8287, term8287.getClass(), "preserveWhitespace", false);
        setBooleanField(term8287, term8287.getClass(), "formList", true);
        setBooleanField(term8287, term8287.getClass(), "formSubmit", false);
        setField(term8286, term8286.getClass(), "tag", term8287);
        setField(term8286, term8286.getClass(), "parentNode", null);
        setField(term8286, term8286.getClass(), "childNodes", term8309);
        setField(term8313, term8313.getClass(), "attributes", term8314);
        setField(term8286, term8286.getClass(), "attributes", term8313);
        setField(term8286, term8286.getClass(), "baseUri", "vLTbaoAxBm");
        setIntField(term8286, term8286.getClass(), "siblingIndex", -1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term8286, args);
    }

};


