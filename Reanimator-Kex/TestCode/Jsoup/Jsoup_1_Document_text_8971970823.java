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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_text_8971970823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;

    public Document_text_8971970823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1066, term1066.getClass(), "tagName", null);
        setBooleanField(term1066, term1066.getClass(), "isBlock", true);
        setBooleanField(term1066, term1066.getClass(), "canContainBlock", true);
        setBooleanField(term1066, term1066.getClass(), "canContainInline", false);
        setBooleanField(term1066, term1066.getClass(), "optionalClosing", true);
        setBooleanField(term1066, term1066.getClass(), "empty", false);
        setBooleanField(term1066, term1066.getClass(), "preserveWhitespace", true);
        setField(term1066, term1066.getClass(), "ancestors", null);
        Object term1073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1073, term1073.getClass(), "tagName", null);
        setBooleanField(term1073, term1073.getClass(), "isBlock", false);
        setBooleanField(term1073, term1073.getClass(), "canContainBlock", false);
        setBooleanField(term1073, term1073.getClass(), "canContainInline", false);
        setBooleanField(term1073, term1073.getClass(), "optionalClosing", false);
        setBooleanField(term1073, term1073.getClass(), "empty", true);
        setBooleanField(term1073, term1073.getClass(), "preserveWhitespace", false);
        setField(term1073, term1073.getClass(), "ancestors", null);
        Object term1080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1080, term1080.getClass(), "tagName", null);
        setBooleanField(term1080, term1080.getClass(), "isBlock", true);
        setBooleanField(term1080, term1080.getClass(), "canContainBlock", false);
        setBooleanField(term1080, term1080.getClass(), "canContainInline", true);
        setBooleanField(term1080, term1080.getClass(), "optionalClosing", false);
        setBooleanField(term1080, term1080.getClass(), "empty", false);
        setBooleanField(term1080, term1080.getClass(), "preserveWhitespace", true);
        setField(term1080, term1080.getClass(), "ancestors", null);
        Object term1087 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1087, term1087.getClass(), "tagName", null);
        setBooleanField(term1087, term1087.getClass(), "isBlock", false);
        setBooleanField(term1087, term1087.getClass(), "canContainBlock", false);
        setBooleanField(term1087, term1087.getClass(), "canContainInline", true);
        setBooleanField(term1087, term1087.getClass(), "optionalClosing", false);
        setBooleanField(term1087, term1087.getClass(), "empty", true);
        setBooleanField(term1087, term1087.getClass(), "preserveWhitespace", false);
        setField(term1087, term1087.getClass(), "ancestors", null);
        ArrayList term1064 = new ArrayList();
        ((ArrayList) term1064).add(term1066);
        ((ArrayList) term1064).add(term1073);
        ((ArrayList) term1064).add(term1080);
        ((ArrayList) term1064).add(term1087);
        ((ArrayList) term1064).add(term1087);
        ((ArrayList) term1064).add(term1066);
        HashMap term1097 = new HashMap();
        Set<Object> term6071 =  ((Map) term1097).keySet();
        HashSet term1096 = new HashSet((Collection<? extends Object>) term6071);
        ArrayList term1111 = new ArrayList();
        ((ArrayList) term1111).add((Object)null);
        ((ArrayList) term1111).add((Object)null);
        ((ArrayList) term1111).add((Object)null);
        LinkedHashMap term1116 = new LinkedHashMap();
        term1044 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1045 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1115 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1045, term1045.getClass(), "tagName", "fWKJoSoCwE");
        setBooleanField(term1045, term1045.getClass(), "isBlock", false);
        setBooleanField(term1045, term1045.getClass(), "canContainBlock", true);
        setBooleanField(term1045, term1045.getClass(), "canContainInline", true);
        setBooleanField(term1045, term1045.getClass(), "optionalClosing", true);
        setBooleanField(term1045, term1045.getClass(), "empty", false);
        setBooleanField(term1045, term1045.getClass(), "preserveWhitespace", false);
        setField(term1045, term1045.getClass(), "ancestors", term1064);
        setField(term1044, term1044.getClass(), "tag", term1045);
        setField(term1044, term1044.getClass(), "classNames", term1096);
        setField(term1044, term1044.getClass(), "parentNode", null);
        setField(term1044, term1044.getClass(), "childNodes", term1111);
        setField(term1115, term1115.getClass(), "attributes", term1116);
        setField(term1044, term1044.getClass(), "attributes", term1115);
        setField(term1044, term1044.getClass(), "baseUri", "jwsfVjMoJT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        try {
            callMethod(klass, "text", argTypes, term1044, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
