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

public class Element_prependText_1151063319117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2004;

    public Element_prependText_1151063319117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2026 = new HashMap();
        Set<Object> term16202 =  ((Map) term2026).keySet();
        HashSet term2025 = new HashSet((Collection<? extends Object>) term16202);
        ArrayList term2044 = new ArrayList();
        ((ArrayList) term2044).add((Object)null);
        ((ArrayList) term2044).add((Object)null);
        ((ArrayList) term2044).add((Object)null);
        LinkedHashMap term2049 = new LinkedHashMap();
        term2004 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2005 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2048 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2005, term2005.getClass(), "tagName", "CFyoseFGLF");
        setBooleanField(term2005, term2005.getClass(), "isBlock", true);
        setBooleanField(term2005, term2005.getClass(), "formatAsBlock", false);
        setBooleanField(term2005, term2005.getClass(), "canContainBlock", false);
        setBooleanField(term2005, term2005.getClass(), "canContainInline", true);
        setBooleanField(term2005, term2005.getClass(), "empty", false);
        setBooleanField(term2005, term2005.getClass(), "selfClosing", true);
        setBooleanField(term2005, term2005.getClass(), "preserveWhitespace", false);
        setField(term2004, term2004.getClass(), "tag", term2005);
        setField(term2004, term2004.getClass(), "classNames", term2025);
        setField(term2004, term2004.getClass(), "parentNode", null);
        setField(term2004, term2004.getClass(), "childNodes", term2044);
        setField(term2048, term2048.getClass(), "attributes", term2049);
        setField(term2004, term2004.getClass(), "attributes", term2048);
        setField(term2004, term2004.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term2004, term2004.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        try {
            callMethod(klass, "prependText", argTypes, term2004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


