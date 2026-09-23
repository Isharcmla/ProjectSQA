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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependText_1151063319115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000;

    public Element_prependText_1151063319115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2022 = new HashMap();
        Set<Object> term24504 =  ((Map) term2022).keySet();
        HashSet term2021 = new HashSet((Collection<? extends Object>) term24504);
        ArrayList term2040 = new ArrayList();
        ((ArrayList) term2040).add((Object)null);
        ((ArrayList) term2040).add((Object)null);
        LinkedHashMap term2045 = new LinkedHashMap();
        term2000 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2001 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2044 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2001, term2001.getClass(), "tagName", "AZdLeSugwv");
        setBooleanField(term2001, term2001.getClass(), "isBlock", true);
        setBooleanField(term2001, term2001.getClass(), "formatAsBlock", false);
        setBooleanField(term2001, term2001.getClass(), "canContainBlock", false);
        setBooleanField(term2001, term2001.getClass(), "canContainInline", true);
        setBooleanField(term2001, term2001.getClass(), "empty", true);
        setBooleanField(term2001, term2001.getClass(), "selfClosing", false);
        setBooleanField(term2001, term2001.getClass(), "preserveWhitespace", true);
        setField(term2000, term2000.getClass(), "tag", term2001);
        setField(term2000, term2000.getClass(), "classNames", term2021);
        setField(term2000, term2000.getClass(), "parentNode", null);
        setField(term2000, term2000.getClass(), "childNodes", term2040);
        setField(term2044, term2044.getClass(), "attributes", term2045);
        setField(term2000, term2000.getClass(), "attributes", term2044);
        setField(term2000, term2000.getClass(), "baseUri", "GrqozDKFOk");
        setIntField(term2000, term2000.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFyoseFGLF";
        try {
            callMethod(klass, "prependText", argTypes, term2000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


