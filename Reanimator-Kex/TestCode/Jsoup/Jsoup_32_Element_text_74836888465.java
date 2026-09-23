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

public class Element_text_74836888465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6265;

    public Element_text_74836888465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6287 = new HashMap();
        Set<Object> term6348 =  ((Map) term6287).keySet();
        HashSet term6286 = new HashSet((Collection<? extends Object>) term6348);
        ArrayList term6309 = new ArrayList();
        LinkedHashMap term6314 = new LinkedHashMap();
        term6265 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6266 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6313 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6266, term6266.getClass(), "tagName", "PsMKIIEwdR");
        setBooleanField(term6266, term6266.getClass(), "isBlock", false);
        setBooleanField(term6266, term6266.getClass(), "formatAsBlock", true);
        setBooleanField(term6266, term6266.getClass(), "canContainBlock", true);
        setBooleanField(term6266, term6266.getClass(), "canContainInline", false);
        setBooleanField(term6266, term6266.getClass(), "empty", true);
        setBooleanField(term6266, term6266.getClass(), "selfClosing", true);
        setBooleanField(term6266, term6266.getClass(), "preserveWhitespace", false);
        setField(term6265, term6265.getClass(), "tag", term6266);
        setField(term6265, term6265.getClass(), "classNames", term6286);
        setField(term6265, term6265.getClass(), "parentNode", null);
        setField(term6265, term6265.getClass(), "childNodes", term6309);
        setField(term6313, term6313.getClass(), "attributes", term6314);
        setField(term6265, term6265.getClass(), "attributes", term6313);
        setField(term6265, term6265.getClass(), "baseUri", "EBYHwsuWAU");
        setIntField(term6265, term6265.getClass(), "siblingIndex", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term6265, args);
    }

};


