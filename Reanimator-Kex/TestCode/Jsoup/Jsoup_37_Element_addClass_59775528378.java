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

public class Element_addClass_59775528378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7584;

    public Element_addClass_59775528378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7608 = new HashMap();
        Set<Object> term7669 =  ((Map) term7608).keySet();
        HashSet term7607 = new HashSet((Collection<? extends Object>) term7669);
        ArrayList term7618 = new ArrayList();
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        LinkedHashMap term7623 = new LinkedHashMap();
        term7584 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7585 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7622 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7585, term7585.getClass(), "tagName", "QjvDwgKJGz");
        setBooleanField(term7585, term7585.getClass(), "isBlock", false);
        setBooleanField(term7585, term7585.getClass(), "formatAsBlock", false);
        setBooleanField(term7585, term7585.getClass(), "canContainBlock", false);
        setBooleanField(term7585, term7585.getClass(), "canContainInline", false);
        setBooleanField(term7585, term7585.getClass(), "empty", false);
        setBooleanField(term7585, term7585.getClass(), "selfClosing", false);
        setBooleanField(term7585, term7585.getClass(), "preserveWhitespace", false);
        setBooleanField(term7585, term7585.getClass(), "formList", true);
        setBooleanField(term7585, term7585.getClass(), "formSubmit", true);
        setField(term7584, term7584.getClass(), "tag", term7585);
        setField(term7584, term7584.getClass(), "classNames", term7607);
        setField(term7584, term7584.getClass(), "parentNode", null);
        setField(term7584, term7584.getClass(), "childNodes", term7618);
        setField(term7622, term7622.getClass(), "attributes", term7623);
        setField(term7584, term7584.getClass(), "attributes", term7622);
        setField(term7584, term7584.getClass(), "baseUri", "wdtiuPgTVJ");
        setIntField(term7584, term7584.getClass(), "siblingIndex", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HUgzMgrpsK";
        callMethod(klass, "addClass", argTypes, term7584, args);
    }

};


