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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_text_74836888464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6317;

    public Element_text_74836888464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6339 = new HashMap();
        Set<Object> term6400 =  ((Map) term6339).keySet();
        HashSet term6338 = new HashSet((Collection<? extends Object>) term6400);
        ArrayList term6361 = new ArrayList();
        LinkedHashMap term6366 = new LinkedHashMap();
        term6317 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6318 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6365 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6318, term6318.getClass(), "tagName", "PsMKIIEwdR");
        setBooleanField(term6318, term6318.getClass(), "isBlock", false);
        setBooleanField(term6318, term6318.getClass(), "formatAsBlock", true);
        setBooleanField(term6318, term6318.getClass(), "canContainBlock", true);
        setBooleanField(term6318, term6318.getClass(), "canContainInline", false);
        setBooleanField(term6318, term6318.getClass(), "empty", true);
        setBooleanField(term6318, term6318.getClass(), "selfClosing", true);
        setBooleanField(term6318, term6318.getClass(), "preserveWhitespace", false);
        setField(term6317, term6317.getClass(), "tag", term6318);
        setField(term6317, term6317.getClass(), "classNames", term6338);
        setField(term6317, term6317.getClass(), "parentNode", null);
        setField(term6317, term6317.getClass(), "childNodes", term6361);
        setField(term6365, term6365.getClass(), "attributes", term6366);
        setField(term6317, term6317.getClass(), "attributes", term6365);
        setField(term6317, term6317.getClass(), "baseUri", "EBYHwsuWAU");
        setIntField(term6317, term6317.getClass(), "siblingIndex", 98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term6317, args);
    }

};


