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

public class Element_ownText_186502842972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5915;
     Object term5966;

    public Element_ownText_186502842972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5937 = new ArrayList();
        ((ArrayList) term5937).add((Object)null);
        LinkedHashMap term5942 = new LinkedHashMap();
        term5915 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5916 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5941 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5916, term5916.getClass(), "tagName", "jiUSjqwSIQ");
        setBooleanField(term5916, term5916.getClass(), "isBlock", false);
        setBooleanField(term5916, term5916.getClass(), "formatAsBlock", false);
        setBooleanField(term5916, term5916.getClass(), "canContainInline", false);
        setBooleanField(term5916, term5916.getClass(), "empty", true);
        setBooleanField(term5916, term5916.getClass(), "selfClosing", false);
        setBooleanField(term5916, term5916.getClass(), "preserveWhitespace", false);
        setBooleanField(term5916, term5916.getClass(), "formList", true);
        setBooleanField(term5916, term5916.getClass(), "formSubmit", false);
        setField(term5915, term5915.getClass(), "tag", term5916);
        setField(term5915, term5915.getClass(), "parentNode", null);
        setField(term5915, term5915.getClass(), "childNodes", term5937);
        setField(term5941, term5941.getClass(), "attributes", term5942);
        setField(term5915, term5915.getClass(), "attributes", term5941);
        setField(term5915, term5915.getClass(), "baseUri", "PqywFWJlpE");
        setIntField(term5915, term5915.getClass(), "siblingIndex", -523949691);
        term5966 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5967 = (byte[]) newByteArray(16);
        setField(term5966, term5966.getClass(), "value", term5967);
        setByteField(term5966, term5966.getClass(), "coder", (byte) 47);
        setIntField(term5966, term5966.getClass(), "count", 1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term5966;
        callMethod(klass, "ownText", argTypes, term5915, args);
    }

};


