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

public class Element_className_78448294275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7352;

    public Element_className_78448294275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7374 = new HashMap();
        Set<Object> term7425 =  ((Map) term7374).keySet();
        HashSet term7373 = new HashSet((Collection<? extends Object>) term7425);
        ArrayList term7386 = new ArrayList();
        LinkedHashMap term7391 = new LinkedHashMap();
        term7352 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7353 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7390 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7353, term7353.getClass(), "tagName", "QXyFXBjFde");
        setBooleanField(term7353, term7353.getClass(), "isBlock", true);
        setBooleanField(term7353, term7353.getClass(), "formatAsBlock", false);
        setBooleanField(term7353, term7353.getClass(), "canContainBlock", true);
        setBooleanField(term7353, term7353.getClass(), "canContainInline", false);
        setBooleanField(term7353, term7353.getClass(), "empty", false);
        setBooleanField(term7353, term7353.getClass(), "selfClosing", true);
        setBooleanField(term7353, term7353.getClass(), "preserveWhitespace", true);
        setField(term7352, term7352.getClass(), "tag", term7353);
        setField(term7352, term7352.getClass(), "classNames", term7373);
        setField(term7352, term7352.getClass(), "parentNode", null);
        setField(term7352, term7352.getClass(), "childNodes", term7386);
        setField(term7390, term7390.getClass(), "attributes", term7391);
        setField(term7352, term7352.getClass(), "attributes", term7390);
        setField(term7352, term7352.getClass(), "baseUri", "JptuwlirlS");
        setIntField(term7352, term7352.getClass(), "siblingIndex", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term7352, args);
    }

};


