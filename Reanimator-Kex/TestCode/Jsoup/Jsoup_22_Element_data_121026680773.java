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

public class Element_data_121026680773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7322;

    public Element_data_121026680773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7344 = new HashMap();
        Set<Object> term7393 =  ((Map) term7344).keySet();
        HashSet term7343 = new HashSet((Collection<? extends Object>) term7393);
        ArrayList term7354 = new ArrayList();
        LinkedHashMap term7359 = new LinkedHashMap();
        term7322 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7323 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7358 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7323, term7323.getClass(), "tagName", "FlxVmiMYKP");
        setBooleanField(term7323, term7323.getClass(), "isBlock", true);
        setBooleanField(term7323, term7323.getClass(), "formatAsBlock", true);
        setBooleanField(term7323, term7323.getClass(), "canContainBlock", false);
        setBooleanField(term7323, term7323.getClass(), "canContainInline", true);
        setBooleanField(term7323, term7323.getClass(), "empty", true);
        setBooleanField(term7323, term7323.getClass(), "selfClosing", false);
        setBooleanField(term7323, term7323.getClass(), "preserveWhitespace", false);
        setField(term7322, term7322.getClass(), "tag", term7323);
        setField(term7322, term7322.getClass(), "classNames", term7343);
        setField(term7322, term7322.getClass(), "parentNode", null);
        setField(term7322, term7322.getClass(), "childNodes", term7354);
        setField(term7358, term7358.getClass(), "attributes", term7359);
        setField(term7322, term7322.getClass(), "attributes", term7358);
        setField(term7322, term7322.getClass(), "baseUri", "BMMonTIZgJ");
        setIntField(term7322, term7322.getClass(), "siblingIndex", -243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term7322, args);
    }

};


