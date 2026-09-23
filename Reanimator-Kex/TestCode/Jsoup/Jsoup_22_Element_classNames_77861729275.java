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

public class Element_classNames_77861729275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7488;

    public Element_classNames_77861729275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7510 = new HashMap();
        Set<Object> term7554 =  ((Map) term7510).keySet();
        HashSet term7509 = new HashSet((Collection<? extends Object>) term7554);
        ArrayList term7515 = new ArrayList();
        ((ArrayList) term7515).add((Object)null);
        ((ArrayList) term7515).add((Object)null);
        LinkedHashMap term7520 = new LinkedHashMap();
        term7488 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7489 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7519 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7489, term7489.getClass(), "tagName", "TKOMaGswbU");
        setBooleanField(term7489, term7489.getClass(), "isBlock", false);
        setBooleanField(term7489, term7489.getClass(), "formatAsBlock", true);
        setBooleanField(term7489, term7489.getClass(), "canContainBlock", true);
        setBooleanField(term7489, term7489.getClass(), "canContainInline", false);
        setBooleanField(term7489, term7489.getClass(), "empty", false);
        setBooleanField(term7489, term7489.getClass(), "selfClosing", false);
        setBooleanField(term7489, term7489.getClass(), "preserveWhitespace", false);
        setField(term7488, term7488.getClass(), "tag", term7489);
        setField(term7488, term7488.getClass(), "classNames", term7509);
        setField(term7488, term7488.getClass(), "parentNode", null);
        setField(term7488, term7488.getClass(), "childNodes", term7515);
        setField(term7519, term7519.getClass(), "attributes", term7520);
        setField(term7488, term7488.getClass(), "attributes", term7519);
        setField(term7488, term7488.getClass(), "baseUri", "BkIxsyPkGy");
        setIntField(term7488, term7488.getClass(), "siblingIndex", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term7488, args);
    }

};


