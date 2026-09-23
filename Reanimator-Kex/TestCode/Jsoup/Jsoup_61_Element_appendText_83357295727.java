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

public class Element_appendText_83357295727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;

    public Element_appendText_83357295727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1924 = new ArrayList();
        ((ArrayList) term1924).add((Object)null);
        ((ArrayList) term1924).add((Object)null);
        ((ArrayList) term1924).add((Object)null);
        ((ArrayList) term1924).add((Object)null);
        ((ArrayList) term1924).add((Object)null);
        LinkedHashMap term1929 = new LinkedHashMap();
        term1902 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1903 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1928 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1903, term1903.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term1903, term1903.getClass(), "isBlock", true);
        setBooleanField(term1903, term1903.getClass(), "formatAsBlock", true);
        setBooleanField(term1903, term1903.getClass(), "canContainInline", false);
        setBooleanField(term1903, term1903.getClass(), "empty", false);
        setBooleanField(term1903, term1903.getClass(), "selfClosing", true);
        setBooleanField(term1903, term1903.getClass(), "preserveWhitespace", false);
        setBooleanField(term1903, term1903.getClass(), "formList", false);
        setBooleanField(term1903, term1903.getClass(), "formSubmit", true);
        setField(term1902, term1902.getClass(), "tag", term1903);
        setField(term1902, term1902.getClass(), "parentNode", null);
        setField(term1902, term1902.getClass(), "childNodes", term1924);
        setField(term1928, term1928.getClass(), "attributes", term1929);
        setField(term1902, term1902.getClass(), "attributes", term1928);
        setField(term1902, term1902.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term1902, term1902.getClass(), "siblingIndex", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "appendText", argTypes, term1902, args);
    }

};


