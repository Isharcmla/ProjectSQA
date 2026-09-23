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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_append_990907754125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2088;

    public Element_append_990907754125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2110 = new ArrayList();
        ((ArrayList) term2110).add((Object)null);
        ((ArrayList) term2110).add((Object)null);
        ((ArrayList) term2110).add((Object)null);
        ((ArrayList) term2110).add((Object)null);
        ((ArrayList) term2110).add((Object)null);
        LinkedHashMap term2115 = new LinkedHashMap();
        term2088 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2089 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2114 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2089, term2089.getClass(), "tagName", "WHcwFgsGFC");
        setBooleanField(term2089, term2089.getClass(), "isBlock", true);
        setBooleanField(term2089, term2089.getClass(), "formatAsBlock", false);
        setBooleanField(term2089, term2089.getClass(), "canContainInline", false);
        setBooleanField(term2089, term2089.getClass(), "empty", true);
        setBooleanField(term2089, term2089.getClass(), "selfClosing", false);
        setBooleanField(term2089, term2089.getClass(), "preserveWhitespace", true);
        setBooleanField(term2089, term2089.getClass(), "formList", true);
        setBooleanField(term2089, term2089.getClass(), "formSubmit", true);
        setField(term2088, term2088.getClass(), "tag", term2089);
        setField(term2088, term2088.getClass(), "parentNode", null);
        setField(term2088, term2088.getClass(), "childNodes", term2110);
        setField(term2114, term2114.getClass(), "attributes", term2115);
        setField(term2088, term2088.getClass(), "attributes", term2114);
        setField(term2088, term2088.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term2088, term2088.getClass(), "siblingIndex", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VYkqXKVlAJ";
        try {
            callMethod(klass, "append", argTypes, term2088, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


